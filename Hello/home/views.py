from django.shortcuts import render,HttpResponse, redirect
from datetime import datetime
from home.models import Contact
from home import views
from django.contrib import messages 
from django.contrib.auth.models import User
from django.contrib.auth import logout,login
from django.contrib.auth import authenticate
from .models import Product,Order,OrderItem,ShippingAddress
from django.http import JsonResponse
import json
import datetime
from . utils import cookieCart,cartData
from datetime import datetime
from django.shortcuts import render, get_object_or_404
from .models import Product
# Create your views here.

def index(request):
    if request.user.is_anonymous:
        return redirect("/login")
    data = cartData(request)

    cartItems = data['cartItems']
    order = data['order']
    items = data['items']
     
    context = {'get_cart_total':0, 'get_cart_items':0,'shipping':False}
    context = {'items':items, 'cartItems':cartItems}
    products = Product.objects.all()
    context = {'products':products}
    return render(request,'index.html',context)
    # return HttpResponse("this is homepage")

def product_detail(request, product_id):
    product = get_object_or_404(Product, id=product_id)
    return render(request, 'icecream_detail.html', {'product': product}) 

def loginUser(request):
    if request.method == "POST":
        username=request.POST.get('username')
        password=request.POST.get('password')
        print(username,password)

        #check if user has entered correct credentials
        user = authenticate(username=username, password=password)
        
         
        if user is not None:
            # A backend authenticated the credentials
            login(request, user)
            return redirect("/")
    
        else:
        # No backend authenticated the credentials
            return render(request,'login.html')

    return render(request,'login.html')

def logoutUser(request):
    logout(request)
    return redirect("/login")

def about(request):
    return render(request,'about.html')
   # return HttpResponse("this is about page")

def services(request):
    return render(request,'services.html')
    #return HttpResponse("this is services page")

def contact(request):
    if request.method == "POST":
        name=request.POST.get('name')
        email=request.POST.get('email')
        phone=request.POST.get('phone')
        desc=request.POST.get('desc')
        contact=Contact(name=name,email=email,phone=phone,desc=desc,date=datetime.now())
        contact.save()
        messages.success(request, "Your Message Has Been Sent.")

    return render(request,'contact.html' )
  #  return HttpResponse("this is contact page")

def cart(request):
    cart = {}  

    data = cartData(request)

    cartItems = data['cartItems']
    order = data['order']
    items = data['items']
        
    context = {'items':items, 'order':order, 'cartItems':cartItems}
    return render(request,'cart.html',context)

def checkout(request):
    data = cartData(request)

    cartItems = data['cartItems']
    order = data['order']
    items = data['items']

    context = {'items':items, 'order':order,'cartItems':cartItems}
    return render(request,'checkout.html',context)

def updateItem(request):
	data = json.loads(request.body)
	productId = data['productId']
	action = data['action']
	print('Action:', action)
	print('Product:', productId)

	customer = request.user.customer
	product = Product.objects.get(id=productId)
	order, created = Order.objects.get_or_create(customer=customer, complete=False)

	orderItem, created = OrderItem.objects.get_or_create(order=order, product=product)

	if action == 'add':
		orderItem.quantity = (orderItem.quantity + 1)
	elif action == 'remove':
		orderItem.quantity = (orderItem.quantity - 1)

	orderItem.save()

	if orderItem.quantity <= 0:
		orderItem.delete()

	return JsonResponse('Item was added', safe=False)

def processOrder(request):
    transaction_id = datetime.now().timestamp()
    data = json.loads(request.body)

    if request.user.is_authenticated:
        customer = request.user.customer
        order, created = Order.objects.get_or_create(customer=customer, complete=False)
        total = float(data['form']['total'])
        order.transaction_id = transaction_id

        if total == order.get_cart_total:
            order.complete = True
            order.save()

            if order.shipping:
                ShippingAddress.objects.create(
                    customer=customer,
                    order=order,
                    address=data['shipping']['address'],
                    city=data['shipping']['city'],
                    state=data['shipping']['state'],
                    zipcode=data['shipping']['zipcode'],
                )
    else:
        print('User is not logged in')

        print('COOKIES:', request.COOKIES)
        name = data['form']['name']
        email = data['form']['email']

        cookieData = cookieCart(request)
        items = cookieData['items']

        order = Order.objects.create(
			customer=customer,
			complete=False,
			)

        for item in items:
            product = Product.objects.get(id=item['id'])
            orderItem = OrderItem.objects.create(
				product=product,
				order=order,
				quantity=item['quantity'],
			)

    total = float(data['form']['total'])
    order.transaction_id = transaction_id

    if total == order.get_cart_total:
        order.complete = True
    order.save()

    if order.shipping == True:
        ShippingAddress.objects.create(
		customer=customer,
		order=order,
		address=data['shipping']['address'],
		city=data['shipping']['city'],
		state=data['shipping']['state'],
		zipcode=data['shipping']['zipcode'],
		)

    return JsonResponse('Payment submitted..', safe=False)

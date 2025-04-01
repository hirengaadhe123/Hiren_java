from django.shortcuts import render

from django.shortcuts import render

from services.models import Cateagory,Product,Member



def home(request):
     return render(request,"adminindex.html")

def cateagoryview(request): 
    catdata=Cateagory.objects.all()
    return render(request,"cateagoryview.html",{'data':catdata})




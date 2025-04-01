from django.http import HttpResponse
from django.shortcuts import render
def home(request):
    data={
        'title':'Home Page',
        'h1_title':'First Page',
        'paraGraph':'Reliance Industries Limited is an Indian multinational conglomerate company, headquartered in Mumbai. RILs diverse businesses include energy, petrochemicals, natural gas, retail, telecommunications, mass media, and textiles.',
        'ListofFriends':["Alok","Ripal","Ronak","Aniket"]
    }
    return render(request,"index.html",data)

def aboutus(request):
    data={
        'ListofFriends':["Alok","Ripal","Ronak","Aniket"],

        'empList':[
            {'name':'rahul','phone':'7878747576'},
            {'name':'rohit','phone':'9998979869'},
        ]

    }
    return render(request,"aboutus.html",data)

def loops1(request):
    data={
        'ListofNumbers':[11,20,55,35,40,33]
    }
    return render(request,"loops1.html",data)

def calculator(request):
    
    number1=""
    number2=""
    ans=""
    try:
        if request.method=="POST":
            number1=eval(request.POST.get("Number1"))
            number2=eval(request.POST.get("Number2"))
            print(number1)
            print(number2)
            opr=request.POST.get("drpoprator")
            print(opr)
            if opr=="+":
                ans=number1+number2
            elif opr=="-":
                ans=number1-number2
            elif opr=="*":
                ans=number1*number2
            elif opr=="/":
                ans=number1/number2
    except:
        ans="Invalid opt"
        print(ans)
    
    return render(request,'calculator.html',{"ans":ans,"Number1":number1,"Number2":number2})


def calculator1(request):
    
    number=""
    ans=""
    try:
        if request.method=="POST":
            number=eval(request.POST.get("Number"))
            print(number)
            opr=request.POST.get("drpoprator")
            print(opr)
            if opr=="square":
                ans=number*number
            elif opr=="qube":
                ans=number*number*number
           
    except:
        ans="Invalid opt"
        print(ans)
    
    return render(request,'calculator1.html',{"ans":ans,"Number":number,})



def calculator2(request):
    
    side1=""
    side2=""
    side3=""
    ans=""
    try:
        if request.method=="POST":
            side1=int(request.POST.get("Side1"))
            side2=int(request.POST.get("Side2"))
            side3=int(request.POST.get("Side3"))
            print(side1)
            print(side2)
            print(side3)
            ans=(side1+side2+side3)/2
    except:
        ans="Invalid opt"
        print(ans)
    
    return render(request,'calculator2.html',{"ans":ans,"Side1":side1,"Side2":side2, "Side3": side3,})

def item(request):
    items=['Apple','Banana','Orange','Mango','Graps']
    return render(request,'item.html',{'items':items})




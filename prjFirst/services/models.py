from django.db import models

# Create your models here.
class Cateagory(models.Model):
    catname=models.CharField(max_length=200)
    def __str__(self):
        return self.catname


class Product(models.Model):
    catFor=models.ForeignKey(Cateagory,on_delete=models.CASCADE)
    ProductName=models.CharField(max_length=500)
    ActualPrice=models.IntegerField()
    OfferPrice=models.IntegerField()
 
    def __str__(self):
        return f"{self.ProductName} --- p--- {self.ActualPrice} --- {self.OfferPrice} -- {self.catFor.catname}"
class Member(models.Model):
    Username=models.CharField(max_length=50)
    Password=models.CharField(max_length=50)
    Firstname=models.CharField(max_length=50)
    Lastname=models.CharField(max_length=50)
    Memberimage=models.CharField(max_length=100,null=True)
    Gender=models.CharField(max_length=7)
    Email=models.CharField(max_length=50)
    Contactno=models.CharField(max_length=50)
    Visitcount=models.IntegerField()
    DOB=models.DateField()
    DOJ = models.DateField(auto_now=True)

    def __str__(self):
       return self.Username+" -- " + self.Password+" --- " + self.Firstname+"--"+ self.Lastname+" --- " + self.Memberimage+"--"+ self.Gender+"--"+ self.Email+"--"+ self.Contactno+"--"+ str(self.Visitcount)+"--"+ str(self.DOB)+"--"+ str(self.DOJ)

class MemberOrder(models.Model):
         MemberFor=models.ForeignKey(Member,on_delete=models.CASCADE)
         Odate = models.DateField()

         def __str__(self):
           return str(self.MemberFor.id)+" -- " + str(self.MemberFor.Username) +" --- " + str(self.Odate)

class OrderDetail(models.Model):

    ProductFor=models.ForeignKey(Product,on_delete=models.CASCADE)
    MemberOrderFor=models.ForeignKey(MemberOrder,on_delete=models.CASCADE)
    ProductName=models.CharField(max_length=500)
    OfferPrice=models.IntegerField()
    Qty=models.IntegerField()
    PriceQty=models.IntegerField()

    def __str__(self):
        return str(self.MemberOrderFor.id)+" -- " + str(self.ProductFor.id) +" --- " + self.ProductName +" --- " + str(self.Qty) +" --- " + self.ProductName  +" --- " + str(self.PriceQty )

class TempCart(models.Model):
    ProductFor=models.ForeignKey(Product,on_delete=models.CASCADE)
    ProductName=models.CharField(max_length=500)
    OfferPrice=models.IntegerField()
    Qty=models.IntegerField()
    PriceQty=models.IntegerField()

    def __str__(self):
        return str(self.ProductFor.id) +" --- " + self.ProductName +" --- " + str(self.Qty) +" --- " + self.ProductName  +" --- " + str(self.PriceQty )

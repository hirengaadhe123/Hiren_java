from django.contrib import admin

from services.models import Cateagory,Product,Member,MemberOrder,OrderDetail,TempCart

# Register your models here.
admin.site.register(Cateagory)
admin.site.register(Product)
admin.site.register(Member)
admin.site.register(MemberOrder)
admin.site.register(OrderDetail)
admin.site.register(TempCart)



# Generated by Django 5.1.4 on 2025-02-04 11:53

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('home', '0002_product_customer_order_orderitem_shippingaddress'),
    ]

    operations = [
        migrations.AddField(
            model_name='product',
            name='image',
            field=models.ImageField(blank=True, null=True, upload_to=''),
        ),
    ]

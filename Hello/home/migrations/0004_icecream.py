# Generated by Django 5.1.4 on 2025-03-25 11:35

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('home', '0003_product_image'),
    ]

    operations = [
        migrations.CreateModel(
            name='IceCream',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('name', models.CharField(max_length=100)),
                ('price', models.DecimalField(decimal_places=2, max_digits=6)),
                ('description', models.TextField()),
                ('image', models.ImageField(upload_to='icecream_images/')),
            ],
        ),
    ]

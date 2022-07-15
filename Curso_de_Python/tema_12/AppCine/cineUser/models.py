from django.db import models
from django.urls import reverse
import uuid

# Create your models here.
class Book(models.Model):
    title = models.CharField(max_length=40)
    author = models.ForeignKey("Author", on_delete=models.SET_NULL, null=True)
    summary = models.TextField(max_length=150, help_text="Descripcion del Libro")
    isbn = models.CharField("ISBN", max_length=13, help_text="El ISBN maxímo es de 13 caracteres")

    def __str__(self):
        return "%s %s" % (self.title, self.summary)

    def get_absolute_url(self):
        return reverse('book-detail', args=[str(self.id)])

class Author(models.Model):
    first_name = models.CharField(max_length=50)
    last_name = models.CharField(max_length=50)
    date_of_birth = models.DateField(blank=True, null=True)
    date_of_death = models.DateField("Died", blank=True, null=True)

    def get_absolute_url(self):
        return reverse('author-detiel', args=[str(self.id)])
    
    def __str__(self):
        return "%s %s" % (self.last_name, self.first_name)

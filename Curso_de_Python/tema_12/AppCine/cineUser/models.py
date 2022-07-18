from django.db import models

# Create your models here.
class Director(models.Model):
    nombre = models.CharField(max_length=25)
    apellidos = models.CharField(max_length=50)
    fecha_nacimiento = models.DateField()
    fecha_defuncion = models.DateField(null= True, blank = True)
    biografia = models.TextField()

    def __str__(self):
        return "%s %s" % (self.nombre, self.apellidos)

class Pelicula(models.Model):
    director = models.ForeignKey('Director', on_delete=models.CASCADE)
    nombre = models.CharField(max_length=25)
    descripcion = models.TextField()
    duracion = models.PositiveIntegerField()
    anyo = models.PositiveIntegerField()
    
    def __str__(self):
        return self.nombre

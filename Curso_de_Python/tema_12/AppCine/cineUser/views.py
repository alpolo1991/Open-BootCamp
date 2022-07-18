from django.shortcuts import render
from .models import Director, Pelicula

# Create your views here.
def home(request):
    directors = Director.objects.all()
    peliculas = Pelicula.objects.all()
    
    context = {
        'directors': directors,
        'peliculas': peliculas,
    }
    return render(request, 'cineUser/index.html', context)
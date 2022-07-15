from django.shortcuts import render
from .models import Book, Author

# Create your views here.
def home(request):
    books = Book.objects.all()
    authors = Author.objects.all()
    
    context = {
        'books': books,
        'authors': authors,
    }
    return render(request, 'cineUser/index.html', context)
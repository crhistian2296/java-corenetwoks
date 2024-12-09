package com.mycompany.holamundo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;


public class Start {


    public static void main(String[] args) {
        Book book1 = new Book("James Joyce", "El Ulises", "21q3452G", 456);
        Book book2 = new Book("JK Rowling", "Harry Potter: La piedra filosofal", "67q3K", 290);
        Book book5 = new Book("JK Rowling", "Harry Potter: La piedra filosofal", "67q3K", 290);
        Book book6 = book2;
        Book book3 = new Book("Herman Hache", "El Lobo Estapario", "81q3422H", 336);
        Book book4 = new Book("JRR Tolkien", "El Señor de los Anillos", "21q7711L", 411);

        System.out.println(book2.equals(book5));
        Set<Book> catalogo = new HashSet<>(Set.of(book1, book2, book3, book4));
        catalogo.add(book5);
        catalogo.add(book6);
        for (Book book : catalogo) {
            System.out.println(book);
        }
//        Set<Integer> numeros = new TreeSet<>(Set.of(1,2,4,5,3));
//        numeros.add(6);
//        numeros.add(2);
//        for (Integer numero : numeros) {
//            System.out.println(numero);
//        }
    }

}

class Book extends Object {
    String author, title, ISBN;
    int pages;

    public Book(String author, String title, String ISBN, int pages) {
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" + "author=" + author + ", title=" + title + ", ISBN=" + ISBN + ", pages=" + pages + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.author);
        hash = 41 * hash + Objects.hashCode(this.title);
        hash = 41 * hash + Objects.hashCode(this.ISBN);
        hash = 41 * hash + this.pages;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.pages != other.pages) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return Objects.equals(this.ISBN, other.ISBN);
    }
}

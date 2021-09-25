package org.prog3.turn3.main;

import org.prog3.turn3.model.Book;
import org.prog3.turn3.model.Library;

public class RunLibrary {

    public static void main(String[] args) {

        Library library= createLibrary();
        library.printLibrary();

    }

    private static Library createLibrary() {
        Book b1 = new Book("La divina commedia", "Dante Alighieri", 1000);
        Book b2 = new Book("Uno Nessuno Centomila", "Pirandello", 345);
        Book b3 = new Book("Malavoglia", "Verga", 456);

        Library library = new Library();
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        return library;
    }


}

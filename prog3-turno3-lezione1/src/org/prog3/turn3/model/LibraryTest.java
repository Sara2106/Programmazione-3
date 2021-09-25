package org.prog3.turn3.model;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private Library library;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        library = new Library();
    }

    @org.junit.jupiter.api.Test
    void addBook() {
        assertEquals(0, library.books.size());
        library.addBook(new Book("La divina Commedia", "Dante Alighieri", 1000));
        assertEquals(1, library.books.size());
    }

    @org.junit.jupiter.api.Test
    void capacity() {
        assertEquals(0, library.capacity());
        library.addBook(new Book("La divina Commedia", "Dante Alighieri", 1000));
        assertEquals(1, library.capacity());
    }
}
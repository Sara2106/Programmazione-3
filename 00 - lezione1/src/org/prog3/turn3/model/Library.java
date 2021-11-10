package org.prog3.turn3.model;

import java.util.ArrayList;

public class Library {

    ArrayList<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book b){
        if (b!=null)
          this.books.add(b);
    }

    public int capacity(){
        return this.books.size();
    }

    public void printLibrary(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        String description = "";
        for (Book b: this.books) {
            description+= b.toString();
            description+="\n";
        }
        return description;
    }
}

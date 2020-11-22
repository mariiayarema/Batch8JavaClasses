package com.syntax.class20;

public class Book {
    String bookName;
    String bookAvtor;

    Book(String bookName){
        this.bookName=bookName;

    }
    Book(String bookName, String bookAvtor) {
       this(bookName);
       this.bookAvtor=bookAvtor;
    }
    void printBook(){
        System.out.println("Book name is "+bookName+", and avtor is "+bookAvtor);
    }

    public static void main(String[] args) {
        Book book=new Book("Hello");
        Book book2=new Book ("Harry Potter", "Joan Rowling");
        book.printBook();
        book2.printBook();
    }

    }


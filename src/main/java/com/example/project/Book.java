package com.example.project;

public class Book{
    //requires 5 attributes String title, String author, int yearPublished, String isbn, int quantity
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;

    //requires 1 constructor with 5 arguments that intitialize the attribtues of the class.
    public Book(String title, String author, int yearPublished, String isbn, int quantity){
        //the constructor uses the "this" key to set the attributes to the parameters
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.quantity = quantity;
    }
    //returns the book title//
    public String getTitle() {
        return title;
    }
    //sets the title to a parameter//
    public void setTitle(String newTitle) {
        title = newTitle;
    }
    //returns the author of the book//
    public String getAuthor() {
        return author;
    }
    //sets the author to a parameter//
    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }
    //returns the year that the book was published//
    public int getYearPublished() {
        return yearPublished;
    }
    //sets the year that the book was published to a new date//
    public void setYearPublished(int newYearPublished) {
        yearPublished =  newYearPublished;
    }
    //returns the serial number of the book//
    public String getIsbn() {
        return isbn;
    }
    //sets the serial number of the book to a parameter//
    public void setIsbn(String newIsbn) {
        isbn = newIsbn;
    }
    //returns the quantity number of books//
    public int getQuantity() {
        return quantity;
    }
    //sets the quantity number of book to a parameter//
    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }
    //returns all the information of a particular book with all its attributes on one line as a string//
    public String bookInfo(){ //returns "Title: [], Author: [], Year: [], ISBN: [], Quantity: []"
       return "Title: " + title + ", Author: " + author + ", Year: " + yearPublished + ", ISBN: " + isbn + ", Quantity: " + quantity;
    }
}
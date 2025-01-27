package com.example.project;

public class User{
    //requires 3 private attributes String name, String Id, Book book that is initialized to empty
    private String name;
    private String Id;
    private Book[] book;

    //requires 1 contructor with two parameters that will initialize the name and id using the "this" key//
    public User(String name, String Id){
        this.name = name;
        this.Id = Id;
        book = new Book[5];//initializes the length of books to five//
    }
    //returns the name of the user//
    public String getName() {
        return name;
    }
    //sets the name of the user to a new name in the parameter//
    public void setName(String newName) {
        name = newName;
    }
    //returns the ID of the user//
    public String getId() {
        return Id;
    }
    //sets the ID of the user to a new ID as a parameter//
    public void setId(String newId) {
        Id = newId;
    }
    //returns the list of books//
    public Book[] getBooks() {
        return book;
    }
    //sets the list of books to a new list of books//
    public void setBooks(Book[] newBook) {
        book = newBook;
    }

    public String bookListInfo(){
        String result = "";
        for(int i = 0; i < book.length; i++){
            if(book[i] == null){
                result += "empty\n";//if the book at that index in the book list is a null, print empty//
            }else{
                result += book[i].bookInfo() + "\n";//if not null, then print its info//
            }
        }
        return result;   //returns a string with all the information of each book on individual lines//
    } //returns a booklist for the user, if empty, output "empty"

    public String userInfo(){
        String result = "";
        result += "Name: " + name + "\n" + "Id: " + Id + "\n" + "Books: \n" + bookListInfo();//returns the information of the user as well as the books that they checked out//
        return result;

    } //returns  "Name: []\nID: []\nBooks:\n[]"
       
}
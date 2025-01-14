package com.example.project;

public class User{
    //requires 3 private attributes String name, String Id, Book book that is initialized to empty
    private String name;
    private String Id;
    Book[] book;

    //requires 1 contructor with two parameters that will initialize the name and id
    public User(String name, String Id){
        this.name = name;
        this.Id = Id;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getId() {
        return Id;
    }

    public void setId(String newId) {
        Id = newId;
    }

    public Book[] getBooks() {
        return book;
    }

    public void setBooks(Book[] newBook) {
        book = newBook;
    }

    public String bookListInfo(){
        for(int i = 0; i < book.length; i++){
        if(book == null){
            return "empty";
        }else{
            return 
        }
        }
    } //returns a booklist for the user, if empty, output "empty"

    // public String userInfo(){} //returns  "Name: []\nID: []\nBooks:\n[]"
       
}
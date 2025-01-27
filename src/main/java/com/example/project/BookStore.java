package com.example.project;

public class BookStore{

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    private Book[] books = new Book[0];//initializes the list of books to an empty list//
    private User[] users = new User[10];//initializes the list of users to a length of 10//
    
    //requires 1 empty constructor
    public BookStore(){}
    //returns the list of users//
    public User[] getUsers(){
        return users;
    }
    //sets the list of users to a new list of users//
    public void setUsers(User[] newUsers){
        users = newUsers;
    }
    //returns the list of books//
    public Book[] getBooks(){
        return books;
    }

    public void addUser(User user){
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {//for the first index of the list users where the value is null, the user is added at that index//
                users[i] = user;
                return;  // Exit the method once user is added
                }
            }
    } 

    public void removeUser(User user){
        int index = -1;//initializes index to a length that cannot possibily be an index of a list to prevent complications//
    
    // Find the index of the user
        for (int i = 0; i < users.length; i++) {
            if (users[i] == user) {//checks if the user at that index matches with the parameter//
                index = i;//uses the variable index to be implemented later on//
                break;  // Stops the loop once we find the correct user
            }
        }

        if (index != -1) {//if the parameter was found in the list, this shift will occur//
        // Shift elements after the index to the left
            for (int i = index; i < users.length - 1; i++) {//users.length -1 is important to prevent null exception error//
                users[i] = users[i + 1];//this is the shift//
            }

        // Set the last item in the list to null 
        users[users.length - 1] = null;
        }
    }

    public void consolidateUsers(){
        User[] consolidateUsers = new User[users.length];//sets a new users list to a list the same length as the original users list//
        int count = 0;
            for(int i = 0; i < users.length; i++){
                if(users[i]!=null){//for every time the user at that index in the list is not a null, that user is added to the new list//
                consolidateUsers[count] = users[i];
                count++;//increments count to go through the new list//
                }
            }
        users = consolidateUsers;//sets the new list to the original//
    }

    public void addBook(Book book){
        int newLength = books.length + 1;//increases the length of the new list of books by 1 as we are adding a book//
        Book[] newBooks = new Book[newLength];
        for (int i = 0; i < books.length; i++){
            newBooks[i] = books[i];//sets all the indexes in the new list except for its last one to the correlated indexes of the books list//
        }
        newBooks[newLength - 1] = book;//sets the last index of the new books list to the parameter//
        books = newBooks;//sets the new books list back to the original books list//
    }
    
    public void insertBook(Book book, int index){
        Book[] newBooks = new Book[books.length+1];//sets a new list of books to a length one greatger than the original list of books//
        if(books.length <= 4){//makes sure that if you added a book then the length of the books list still would not exceed five values//
            for(int i = 0; i < index; i++){//all the items before the index of insert remains the same//
                newBooks[i] = books[i];
            }
            for(int i = index; i < books.length; i++){
                newBooks[i+1] = books[i];//iterates through all the items after the index of insert and shifts them right
            }
            newBooks[index] = book;//sets the index of insert to the parameter book//
            books = newBooks;//sets the new list back to the original list//
        }
    }

    public void removeBook(Book book){
        int index = 0;
        for(int i = 0; i < books.length; i++){
         if(books[i] == book){//if the book was found in the list, set its index to a variable//
           index = i;  
             }
         }
         if(book.getQuantity() == 1){//if the quantity is 1, then removing one quantity of the book completely removes it from the list//
            books[index] = null;
             Book[] newBooks = new Book[books.length-1];//creates a new book list with a length of one less than the original//
             for(int q = 0; q < index; q++){
                newBooks[q] = books[q];//all the books before the index of removal remains the same//
             }
             for(int k = index+1; k < books.length; k++){
                 newBooks[k-1] = books[k];//all the books after the index of removal is shifted one left//
             }
             books = newBooks;//sets the new list back to the original list//
         }else{
             book.setQuantity(book.getQuantity()-1);//if the quantity was more than one, then its quantity would decrease by one but the book would not completely disappear from the list//
         }
    }
       
    public String bookStoreBookInfo(){
        String result = "";
        for(int i = 0; i < books.length; i++){
            result += books[i].bookInfo() + "\n";//prints all the information of each book in the list on each individual line//
        }
        return result;
    } //you are not tested on this method but use it for debugging purposes

    public String bookStoreUserInfo(){
        String result = "";
        for(int i = 0; i < users.length; i++){
            if(users[i] != null){
                result += users[i].userInfo() + "\n";//prints all the information of each user on each individual line//
            }
        }
        return result;
    } //you are not tested on this method but use it for debugging purposes

}
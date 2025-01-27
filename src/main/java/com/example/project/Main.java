package com.example.project;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        BookStore bookstore = new BookStore();
        boolean quit = false;
        Scanner scan = new Scanner(System.in);
        
        while(!quit){
            
        System.out.println("*************************************************");
        System.out.println("********** Welcome to the GFG Library! **********");
        System.out.println("*************************************************");
        System.out.println("Select From The Following Options:");
        System.out.println("-------------------------------------------------");
        System.out.println("Press 0 to Exit Application.");
        System.out.println("Press 1 to Add new Book.");
        System.out.println("Press 2 to Upgrade Quantity of a Book.");
        System.out.println("Press 3 to Search a Book.");
        System.out.println("Press 4 to Show All Books.");
        System.out.println("Press 5 to Register User.");
        System.out.println("Press 6 to Show All Registered Users.");
        System.out.println("-------------------------------------------------");
        
        int number = scan.nextInt();
        scan.nextLine();
        if(number == 0){
            quit = true;
        }else if(number == 1){
            System.out.println("Enter Serial Number of Book:");
            String sn = scan.nextLine();
            System.out.println("Enter Book Name:");
            String bookName = scan.nextLine();
            System.out.println("Enter the Author's Name: ");
            String authorName = scan.nextLine();
            System.out.println("Enter Quantity of books:");
            
            while (!scan.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid quantity.");
                scan.next();
            }
            
            int quantity = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter the year that the book was published: ");
            
            while (!scan.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid year.");
                scan.next();
            }
            
            int yearPublished = scan.nextInt();
            scan.nextLine();
            Book book = new Book(bookName, authorName, yearPublished, sn, quantity);
            bookstore.addBook(book);
            System.out.println(bookName + " has been added.");
        }else if(number == 2){
            System.out.println("Enter the title of the book that you want to upgrade: ");
            String desiredbooktoUpgrade = scan.nextLine();
            System.out.println("By what amount do you want to upgrade " + desiredbooktoUpgrade + " by?");
            
            while (!scan.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scan.next();
            }
            
            int upgradeAmount = scan.nextInt();
            scan.nextLine();
            int index = -1;
            boolean wasIncreased = false;
            for(int i = 0; i < bookstore.getBooks().length; i++){
                if(bookstore.getBooks()[i].getTitle().equals(desiredbooktoUpgrade)){
                    index = i;
                    bookstore.getBooks()[i].setQuantity(bookstore.getBooks()[i].getQuantity()+upgradeAmount);
                    wasIncreased = true;
                }
            }
            if(wasIncreased){
                System.out.println(desiredbooktoUpgrade + " has been upgraded by " + upgradeAmount + ". It now has a quantity of " + bookstore.getBooks()[index].getQuantity() + ".");
            }else{
                System.out.println("Sorry, " + desiredbooktoUpgrade + " was not found and could not be upgraded.");
            }
        }else if(number == 3){
            System.out.println("Enter the title of the book that you are looking for: ");
            String searchBook = scan.nextLine();
            boolean wasFound = false;
            for(int i = 0; i < bookstore.getBooks().length; i++){
                if(bookstore.getBooks()[i].getTitle().equals(searchBook)){
                    System.out.println("Book was found at index " + i + ".");
                    System.out.println(bookstore.getBooks()[i].bookInfo());
                    wasFound = true;
                }
            }
            if(!wasFound){
                System.out.println("Book was not found.");
            }
        }else if(number == 4){
            for(int i = 0; i < bookstore.getBooks().length; i++){
                System.out.println(bookstore.getBooks()[i].bookInfo());
            }
            
        }else if(number == 5){
            System.out.println("Enter the name of the student that you want to register: ");
            String studentName = scan.nextLine();
            System.out.println("Enter that student's ID: ");
            String ID = scan.nextLine();
            User user = new User(studentName, ID);
            bookstore.addUser(user);
            System.out.println("They have been added.");
            
        }else if(number == 6){
            if(bookstore.getUsers() != null){
                for(int i = 0; i < bookstore.getUsers().length; i++){
                    System.out.println(bookstore.getUsers()[i].userInfo());
                
                }
            }else{
                System.out.println("No users registered.");
            }
        }
    }
    
    scan.close();
    System.out.println("Finished.");
    
    }
}

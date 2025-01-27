package com.example.project;

public class IdGenerate{ //This class contains statics variable and methods, you do not initalize an object to use it.
    
    // //requires 1 private attribute String currentId. You must initialize it to 99
    private static String currentId = "99";

    // //requires one empty constructor
    public IdGenerate(){}
    //returns the current ID of the user//
    public static String getCurrentId(){
        return currentId;
    }
    //sets the ID of the user back to 99, the starting point//
    public static void reset(){
        currentId = "99";
    } //must reset the currentId back to 99
    
    public static void generateID(){
        int number = Integer.parseInt(currentId);//changes ID to a number//
        number++;//increments that number by one//
        currentId = Integer.toString(number);//changes that number back to a string to fit the data type of currentID//
    } //generates a new id, when called it will increment the currentId by 1.. Hint pay attention to data type of currentId
}
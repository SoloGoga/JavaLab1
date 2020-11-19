package com.company;

public class Owner {
    private String FirstName;
    private String LastName;
    private String FullName;


    private void SetName(String lastName){
        LastName = IsCorrect.IsCorrectTitle(lastName) ? lastName : "Incorrect last name";
    }

    private void SetName(String firstName, String lastName){
        FirstName = IsCorrect.IsCorrectTitle(firstName) ? firstName : "Incorrect first name";
        LastName = IsCorrect.IsCorrectTitle(lastName) ? lastName : "Incorrect last name";
        FullName = FirstName + " " + LastName;
    }

    public String GetFullName(){
        return FullName;
    }

    public Owner(String lastName){
        SetName(lastName);
    }

    public Owner(String firstName, String lastName){
        SetName(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Car owner: " + FullName + ",";
    }
}

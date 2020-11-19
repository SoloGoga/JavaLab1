package com.company;

public class IsCorrect {
    public static  boolean IsCorrectTitle(String title){
        for(int i = 0; i < title.length(); i++){
            if(!Character.isAlphabetic(title.charAt(i)) && title.charAt(i) != '-' && title.charAt(i) != ' ')
                return false;
        }

        return true;
    }


}

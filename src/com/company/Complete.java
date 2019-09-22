package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Complete {

    public static void main(String[] args) {
	// write your code here
        // Declare an array list of words
        ArrayList<String> weatherWords = new ArrayList<>();

        // Add words to the array list
        weatherWords.add("snowy");
        weatherWords.add("foggy");
        weatherWords.add("rainy");


        System.out.println("Today's Weather is: " + weatherWords);

        for (int i = 0; i < 5; i++) {
            System.out.println("How's the weather? ");
            Scanner input = new Scanner(System.in);
            String inpWords = input.nextLine();
            weatherWords.add(inpWords);
        }

        if(weatherWords.contains("sunny"))
            System.out.println("Ah, Sunny days by the beach are my favorite!" );

//        // Check if list contains the word "snowy"
//        if(weatherWords.contains("snowy")){
//            System.out.println("Snowy found!\n");
//        }
//
//        // Check if list is empty
//        if(weatherWords.isEmpty()){
//            System.out.println("List empty!\n");
//        }
//        else {
//            System.out.println("List is not empty!\n");
//        }
//
//        // Get the word at index 2
//        System.out.println(weatherWords.get(2) + "\n");
//
//        // Sort the list of words alphabetically
//        Collections.sort(weatherWords);
//
//        // Print out list after sorting
//        System.out.println("List after sorting:");
//        for(String s : weatherWords) {
//            System.out.println(s);
//        }
    }
}
//

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Create {
    /*Write a Java program to create a new array list to hold colors.
            1.Add at least 3 colors (string) to the array list and print out all its values.
            2.Using the array list created above, print out the value at index 1.
            3.Using the array list above, prompt the user for one new color, and add that color to the array list.
            4.Using the array list, continue prompting the user for colors until they type in "Q" or "q" to quit.
            Each time the user enters a color, add that to the array list. Print out the list at the end.*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String newColor;
        boolean quit=false;
//Adding three colors to the array list
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("pink");
        colors.add("purple");
        System.out.println("All the colors in the arraylist: "+colors);
//Printing out value at index 1
        System.out.println("The value at index 1 is: "+colors.get(1));
//Prompting the user to add a color
        System.out.println("Add your own color: ");
        newColor=input.nextLine();
        colors.add(newColor);
//Add a color while not quit

        while (quit==false){
            System.out.println("Add a new color? (type Q to quit)");
            newColor=input.nextLine();
            colors.add(newColor);
            if(newColor.equalsIgnoreCase("q")){
                System.out.println("Thanks bye");
                break;
            }

        }
//Print out the array list
        System.out.println("Final array list: "+colors);
//
    }
}

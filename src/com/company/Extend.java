package com.company;

import java.util.*;

public class Extend {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner input=new Scanner(System.in);
        String newAddition;
        int random;

        List<String> bakery = new ArrayList<>();
        bakery.add("cookies");
        bakery.add("Croissants");
        bakery.add("muffins");
        bakery.add("donuts");
        System.out.println(bakery);
        System.out.println("Above are some fresh goods in a bakery. Can you add more?");
        newAddition=input.nextLine();
        bakery.add(newAddition);
//        random=(rand.nextInt()*bakery);
        Collections.shuffle(bakery);

        System.out.println(bakery);


    }
}

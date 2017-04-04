package com.company;

import java.util.ArrayList;

public class TestMyArrayList {

    public static void main(String[] args) {


        MyArrayList<Integer> arr = new MyArrayList<>(5);


        arr.add(new Integer(2));
        arr.add(new Integer(3));
        arr.add(new Integer(6));

        System.out.println("Add 2");
        System.out.println("Add 3");
        System.out.println("Add 6");


        System.out.println("Is contain 10: " + arr.contains(new Integer(10)));
        System.out.println("Expected: false \n");
        System.out.println("Is contain 2: " + arr.contains(new Integer(2)));
        System.out.println("Expected: true \n");


        arr.add(new Integer(4));
        arr.add(new Integer(5));
        arr.add(new Integer(7));
        arr.add(new Integer(8));

        System.out.println("Add 4");
        System.out.println("Add 5");
        System.out.println("Add 7");
        System.out.println("After adding previous element capacity of array doubles.");
        System.out.println("Add 8 \n");


        System.out.println("Get 5th element (begin from 0): " + arr.get(5));
        System.out.println("Expected: 7\n");

        System.out.println("Is contain 8: " + arr.contains(new Integer(8)));
        System.out.println("Expected: true \n");


        arr.add(1, new Integer(12));
        System.out.println("Insert 12 after 1st element.\n");

        for (int i = 0; i < arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }

        System.out.println("\nExpected: ");
        System.out.println("2");
        System.out.println("3");
        System.out.println("12");
        System.out.println("6");
        System.out.println("4");
        System.out.println("5");
        System.out.println("7");
        System.out.println("8");



    }
}

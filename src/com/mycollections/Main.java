/**
 *  Java program to create, modify, and display ArrayList.
 */

package com.mycollections;

import java.util.ArrayList;
import java.util.List;

/**
 *  Main class
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create an instance of ArrayList.
        List<Double> myList = new ArrayList<>();

        // Adding elements.
        myList.add(4.1);
        myList.add(9.8);
        myList.add(7.5);
        myList.add(5.2);
        myList.add(3.7);

        // Printing myList size.
        System.out.println(myList.size()); // Output: 5

        // Delete by index.
        myList.remove(2);

        // Printing elements.
        System.out.println(myList); // Output: [4.1, 9.8, 5.2, 3.7]

    }
}
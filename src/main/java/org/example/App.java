/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        //input
        Scanner input = new Scanner(System.in);

        System.out.println("How many people?");
        int numPeople = input.nextInt();

        System.out.println("How many pizzas do you have?");
        int numPizza = input.nextInt();

        System.out.println("How many slices per pizza?");
        int numSlicesPerPizza = input.nextInt();

        //computing
        int numTotalSlices = numPizza * numSlicesPerPizza;

        int numSlicesPerPerson = numTotalSlices/numPeople;
        int leftoverPizza = numTotalSlices%numPeople;

        //output
        System.out.println(numPeople + " people with " + numPizza + " pizza(s) (" + numTotalSlices + " slices)");
        System.out.println("Each person gets " + numSlicesPerPerson + " pieces of pizza.");
        System.out.println("There is (are) " + leftoverPizza + " leftover piece(s).");

    }
}

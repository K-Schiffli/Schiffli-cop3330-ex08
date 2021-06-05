/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package Base;

import java.util.Scanner;
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        String people = getPeople();
        String pizzas = getPizzas();
        String slices = getSlices();
        int numPeople = stringToInt(people);
        int numPizzas = stringToInt(pizzas);
        int numSlices = stringToInt(slices);
        int totalSlices = calcTotalSlices(numPizzas, numSlices);
        int slicesPerPerson = calcSlices(totalSlices, numPeople);
        int slicesLeftOver = calcLeftOver(totalSlices, numPeople);
        printOutput(numPeople, numPizzas, totalSlices, slicesPerPerson, slicesLeftOver);
    }
    public static String getPeople()
    {
        System.out.println( "How many people? " );
        return in.nextLine();
    }

    public static String getPizzas()
    {
        System.out.println( "How many pizzas do you have? " );
        return in.nextLine();

    }

    public static String getSlices()
    {
        System.out.println( "How many slices per pizza? " );
        return in.nextLine();
    }

    public static int stringToInt(String number)
    {
        return Integer.parseInt(number);
    }

    public static int calcTotalSlices(int pizzas, int slices)
    {
        return pizzas * slices;
    }

    public static int calcSlices(int totalSlices, int numPeople)
    {
        return totalSlices / numPeople;
    }

    public static int calcLeftOver(int totalSlices, int numPeople)
    {
        return totalSlices % numPeople;
    }

    public static void printOutput(int numPeople, int numPizzas, int totalSlices, int slicesPerPerson, int slicesLeftOver)
    {
        System.out.printf("""
                %s people with %s pizzas (%d slices)
                Each person gets %d pieces of pizza
                There are %d slices left over""", numPeople, numPizzas, totalSlices, slicesPerPerson, slicesLeftOver);
    }
}
// this is the class folder
package com.andy.tutorial;

public class Main {

    public static void main(String[] args) {
        int myVariable;
        myVariable = 25;

        System.out.print(myVariable); // 25

        int mySecondVariable;
        mySecondVariable = 50;

        System.out.print(mySecondVariable); // 50

        myVariable = mySecondVariable;

        System.out.print(myVariable); // 50

        mySecondVariable = 75;

        System.out.print(myVariable); // 50

    }
}

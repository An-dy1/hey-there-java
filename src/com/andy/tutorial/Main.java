// this is the class folder
package com.andy.tutorial;

public class Main {

    public static void main(String[] args) {
//        int[] leftHandValues = {3, 5, 7, 9};
//        int[] rightHandValues = {2, 4, 0, 8};
//        char[] mathOperators = {'a', 's', 'm', 'd'};
//        int[] results = new int[mathOperators.length];

        // this code illustrates that the way we've written this program allows someone to create an instance of the class without a valid state
        // one way around this is to set the initial state to something valid
//        MathEquation testEquation = new MathEquation();
//        testEquation.executeEquation();
//        System.out.println(testEquation.getResult());

//      initiate a new array of the MathEquation class called equations, then create it with "new" keywork and number of items in array
        MathEquation[] equations = new MathEquation[4];

        // assign field values for each MathEquationInstance
        // update: instead of calling create method, call the constructor (below)
//        equations[0] = createMathEquationInstance(3, 2, 'a');
//        equations[1] = createMathEquationInstance(5, 4, 's');
//        equations[2] = createMathEquationInstance(7, 0, 'm');
//        equations[3] = createMathEquationInstance(9, 8, 'd');

        // use the constructor
        equations[0] = new MathEquation(3, 2, 'a');
        equations[1] = new MathEquation(5, 4, 's');
        equations[2] = new MathEquation(7, 0, 'm');
        equations[3] = new MathEquation(9, 8, 'd');

        // still not totally sure about this syntax; is singular 'equation' referring to the equation returned below?
        for (MathEquation equation: equations) {
            equation.executeEquation();
            System.out.println(equation.getResult());
        }
    }

    // this is a create method
    // in this state, the app has had to do all the work of setting state
    // time to write a constructor, hey-o, making this method unnecessary

//    public static MathEquation createMathEquationInstance(int leftHandNumber, int rightHandNumber, char mathOperator) {
//        // create each individual instance
//        MathEquation equation = new MathEquation();
//        // use setters; guess I never use getters?
//        equation.setLeftHandNumber(leftHandNumber);
//        equation.setRightHandNumber(rightHandNumber);
//        equation.setMathOperator(mathOperator);
//        return equation;
//    }
}

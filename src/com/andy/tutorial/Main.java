// this is the class folder
package com.andy.tutorial;

public class Main {

    public static void main(String[] args) {
//        int[] leftHandValues = {3, 5, 7, 9};
//        int[] rightHandValues = {2, 4, 0, 8};
//        char[] mathOperators = {'a', 's', 'm', 'd'};
//        int[] results = new int[mathOperators.length];

        // initiate a new array of the MathEquation class called equations, then create it with "new" keywork and number of items in array
        MathEquation[] equations = new MathEquation[4];

        // assign field values for each MathEquationInstance
        equations[0] = createMathEquationInstance(3, 2, 'a');
        equations[1] = createMathEquationInstance(5, 4, 's');
        equations[2] = createMathEquationInstance(7, 0, 'm');
        equations[3] = createMathEquationInstance(9, 8, 'd');

        // still not totally sure about this syntax; is singular 'equation' referring to the equation returned below?
        for (MathEquation equation: equations) {
            equation.executeEquation();
            System.out.println(equation.getResult());
        }
    }

    // this is used above
    public static MathEquation createMathEquationInstance(int leftHandNumber, int rightHandNumber, char mathOperator) {
        // create each individual instance
        MathEquation equation = new MathEquation();
        // use setters; guess I never use getters?
        equation.setLeftHandNumber(leftHandNumber);
        equation.setRightHandNumber(rightHandNumber);
        equation.setMathOperator(mathOperator);
        return equation;
    }
}

// this is the class folder
package com.andy.tutorial;

public class Main {

    public static void main(String[] args) {
//        int[] leftHandValues = {3, 5, 7, 9};
//        int[] rightHandValues = {2, 4, 0, 8};
//        char[] mathOperators = {'a', 's', 'm', 'd'};
//        int[] results = new int[mathOperators.length];

        MathEquation[] equations = new MathEquation[4];
        equations[0] = createMathEquationInstance(3, 2, 'a');
        equations[1] = createMathEquationInstance(5, 4, 's');
        equations[2] = createMathEquationInstance(7, 0, 'm');
        equations[3] = createMathEquationInstance(9, 8, 'd');

        for (MathEquation equation: equations) {
            equation.executeEquation();
            System.out.println(equation.getResult());
        }
    }

    public static MathEquation createMathEquationInstance(int leftHandNumber, int rightHandNumber, char mathOperator) {
        MathEquation equation = new MathEquation();
        equation.setLeftHandNumber(leftHandNumber);
        equation.setRightHandNumber(rightHandNumber);
        equation.setMathOperator(mathOperator);
        return equation;
    }
}

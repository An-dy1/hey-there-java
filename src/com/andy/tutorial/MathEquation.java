package com.andy.tutorial;

public class MathEquation {

    // create fields for each value we need to keep track of:
    private int leftHandNumber;
    private int rightHandNumber;
    private char mathOperator = 'a' ;
    private int result;

    // GETTERS and SETTERS:
    public int getLeftHandNumber() { return leftHandNumber;}
    public void setLeftHandNumber(int leftHandNumber) { this.leftHandNumber = leftHandNumber;}

    public int getRightHandNumber() { return rightHandNumber;}
    public void setRightHandNumber(int rightHandNumber) { this.rightHandNumber = rightHandNumber;}

    public int getMathOperator() { return mathOperator;}
    public void setMathOperator(char mathOperator) { this.mathOperator = mathOperator;}

    // don't want common ability to set result, just retrieve it
    public int getResult() { return result; }

    // write a constructor that takes no arguments
    public MathEquation() {}

    // write a constructor with just a mathOperator passed to it
    public MathEquation(char mathOperator){
        this.mathOperator = mathOperator;
    }

    // write a constructor with a mathOperator and both values
    public MathEquation(int leftHandNumber, int rightHandNumber, char mathOperator) {
        this(mathOperator); // call up
        this.leftHandNumber = leftHandNumber;
        this.rightHandNumber = rightHandNumber;
    }

    // method abstracted out from main file
    public void executeEquation() {
        switch (mathOperator) {
            case 'a':
                result = leftHandNumber + rightHandNumber;
                break;
            case 's':
                result = leftHandNumber - rightHandNumber;
                break;
            case 'd':
                result = rightHandNumber != 0 ? leftHandNumber / rightHandNumber : 0;
                break;
            case 'm':
                result = leftHandNumber * rightHandNumber;
                break;
            default:
                System.out.println("Ooh, you messed it up now");
                result = 0;
                break;
        }
    }

}

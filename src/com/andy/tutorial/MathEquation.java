package com.andy.tutorial;

public class MathEquation {

    // create fields for each value we need to keep track of:
    public int leftHandNumber;
    public int rightHandNumber;
    public char mathOperator;
    public int result;

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

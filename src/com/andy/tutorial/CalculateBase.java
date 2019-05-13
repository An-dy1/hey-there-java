package com.andy.tutorial;

// this is going to be a base class other classes will inherit from to clean up the execute function from MathEquation class
public abstract class CalculateBase {

    // every operation will need the same fields
    private int leftHandValue;
    private int rightHandValue;
    private int result;

    // every operation will need getters and setters for those fields
    public int getLeftHandValue() {return leftHandValue;}
    public void setLeftHandValue(int leftHandValue) {this.leftHandValue = leftHandValue;}

    public int getRightHandValue() {return rightHandValue;}
    public void setRightHandValue(int rightHandValue) {this.rightHandValue = rightHandValue;}

    public int getResult() {return leftHandValue;}
    public void setResult(int result) {this.result = result;}

    // make a no-argument constructor
    public CalculateBase() {}

    // make a two-integer argument constructor
    public CalculateBase(int leftHandValue, int rightHandValue) {
        this.leftHandValue = leftHandValue;
        this.rightHandValue = rightHandValue;
    }

    // the way we calculate will be different for each mathOperation that can be passed to our class
    public abstract void calculate();
}

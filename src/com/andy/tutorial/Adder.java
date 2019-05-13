package com.andy.tutorial;

public class Adder extends CalculateBase {
    // constructors we need:

    // no-argument constructor:
    public Adder() {}

    // constructor accepts left and right values:
    public Adder(int leftHandValue, int rightHandValue) {
        super(leftHandValue, rightHandValue); // call up to base class constructor that accepts same values
    }

    @Override
    public void calculate() {
        int value = getLeftHandValue() + getRightHandValue();
        setResult(value);
    }
}

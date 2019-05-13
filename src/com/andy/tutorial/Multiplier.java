package com.andy.tutorial;

public class Multiplier extends CalculateBase {
    // constructors we need:

    // no-argument constructor:
    public Multiplier() {}

    // constructor accepts left and right values:
    public Multiplier(int leftHandValue, int rightHandValue) {
        super(leftHandValue, rightHandValue); // call up to base class constructor that accepts same values
    }

    @Override
    public void calculate() {
        int value = getLeftHandValue() * getRightHandValue();
        setResult(value);
    }
}

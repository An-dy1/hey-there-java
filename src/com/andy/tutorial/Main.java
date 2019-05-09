// this is the class folder
package com.andy.tutorial;

public class Main {

    public static void main(String[] args) {
        int[] leftHandValues = {3, 5, 7, 9};
        int[] rightHandValues = {2, 4, 0, 8};
        char[] mathOperators = {'a', 's', 'm', 'd'};
        int[] results = new int[mathOperators.length];

        for (int i = 0; i < mathOperators.length; i++) {
            switch (mathOperators[i]) {
                case 'a':
                    results[i] = leftHandValues[i] + rightHandValues[i];
                    break;
                case 's':
                    results[i] = leftHandValues[i] - rightHandValues[i];
                    break;
                case 'd':
                    results[i] = rightHandValues[i] != 0 ? leftHandValues[i] / rightHandValues[i] : 0;
                    break;
                case 'm':
                    results[i] = leftHandValues[i] * rightHandValues[i];
                    break;
                default:
                    System.out.println("Ooh, you messed it up now");
                    results[i] = 0;
                    break;
            }

            for (int theResult : results) {
                System.out.println(theResult);
            }
        }
    }
}

// this is the class folder
package com.andy.tutorial;

public class Main {

    public static void main(String[] args) {
        int value1 = 100;
        int value2 = 22;
        int result;
        char opCode = 'm';

        if (opCode == 'a') {
            result = value1 + value2;
        } else if (opCode == 's') {
            result = value1 - value2;
        } else if (opCode == 'd') {
            result = value1 / value2;
        } else if (opCode == 'm') {
            result = value1 * value2;
        } else {
            result = 0;
        }

        System.out.println(result);
    }
}

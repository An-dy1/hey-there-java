// this is the class folder
package com.andy.tutorial;

public class Main {

    public static void main(String[] args) {
        int value1 = 100;
        int value2 = 0;
        int result;
        char opCode = 'd';

        if (opCode == 'a') {
            result = value1 + value2;
        } else if (opCode == 's') {
            result = value1 - value2;
        } else if (opCode == 'd') {
            if (value2 != 0) {
                result = value1 / value2;
            } else {
                result = 0;
                System.out.println("Can't divide by 0 my friend");
            }
            /* Alternative:
            * result = value2 != 0 ? value1/value2 : 0;
            * */
        } else if (opCode == 'm') {
            result = value1 * value2;
        } else {
            System.out.println("Error - invalid opCode");
            result = 0;
        }

        System.out.println(result);
    }
}

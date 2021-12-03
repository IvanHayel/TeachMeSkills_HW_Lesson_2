package branching.task_3;

/*
 * Write a program that will take a number as input and output a message as an even number or not.
 * To determine the parity of a number,
 * use the operation of obtaining the remainder of the division - the operation looks like this: '% 2').
 */

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int number = enterNumber();
        printParity(number);
    }

    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void printParity(int number) {
        if (isEven(number)) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
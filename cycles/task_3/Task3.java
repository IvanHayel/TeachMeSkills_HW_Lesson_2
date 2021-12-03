package cycles.task_3;

/*
 * Write a program where the user enters any positive integer.
 * And the program adds up all numbers from 1 to the number entered by the user.
 * Use the Scanner class to enter a number.
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int fromNumber = 1;
        System.out.print("Enter number to get sum from 1 to: ");
        int toNumber = enterNumber();
        printSum(fromNumber, toNumber);
    }

    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void printSum(int fromNumber, int toNumber) {
        int sum = getSum(fromNumber, toNumber);
        System.out.printf("Sum of numbers from %d to %d = %d", fromNumber, toNumber, sum);
    }

    private static int getSum(int fromNumber, int toNumber) {
        int sum = 0;
        for (int number = fromNumber; number <= toNumber; number++) {
            sum += number;
        }
        return sum;
    }
}

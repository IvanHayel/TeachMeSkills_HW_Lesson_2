package cycles.task_6;

/*
 * Write a program that displays
 * squares of numbers from 10 to 20, inclusive
 */

public class Task6 {
    public static void main(String[] args) {
        int fromNumber = 10;
        int toNumber = 20;
        printSquares(fromNumber, toNumber);
    }

    private static void printSquares(int fromNumber, int toNumber) {
        for (int number = fromNumber; number <= toNumber; number++) {
            int square = number * number;
            System.out.println("Square of " + number + " = " + square);
        }
    }
}
package additional.task_1;

/*
 * Display the first 11 terms of the Fibonacci sequence.
 */

public class Task1 {
    public static void main(String[] args) {
        int quantity = 11;
        printFibonacciNumbers(quantity);
    }

    private static void printFibonacciNumbers(int quantity) {
        int previousNumber = 0;
        int currentNumber = 1;
        System.out.print("0 1 ");
        int nextNumber;
        for (int counter = 2; counter < quantity; counter++) {
            nextNumber = previousNumber + currentNumber;
            System.out.print(nextNumber + " ");
            previousNumber = currentNumber;
            currentNumber = nextNumber;
        }
    }
}
package cycles.task_2;

/*
 * You need to display numbers from 5 to 1.
 * When solving, use the decrement operation (--).
 */

public class Task2 {
    public static void main(String[] args) {
        int fromNumber = 5;
        int toNumber = 1;
        System.out.printf("Decreasing numbers from %d to %d:\n", fromNumber, toNumber);
        printDecreasingNumbers(fromNumber, toNumber);
    }

    private static void printDecreasingNumbers(int fromNumber, int toNumber) {
        for (int number = fromNumber; number >= toNumber; number--) {
            System.out.print(number + " ");
        }
    }
}

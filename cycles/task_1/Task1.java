package cycles.task_1;

/*
 * Use a for loop to display the odd numbers from 1 to 99.
 * When solving, use the increment operation (++).
 */

public class Task1 {
    public static void main(String[] args) {
        int fromNumber = 1;
        int toNumber = 99;
        System.out.printf("Odd numbers from %d to %d:\n", fromNumber, toNumber);
        printOddNumbers(fromNumber, toNumber);
    }

    private static void printOddNumbers(int fromNumber, int toNumber) {
        for (int number = fromNumber; number <= toNumber; number++) {
            if (isOdd(number)) {
                System.out.print(number + " ");
            }
        }
    }

    private static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
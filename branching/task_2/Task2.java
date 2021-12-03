package branching.task_2;

/*
 * Write a program to display the name of the season by the number of the month.
 * Use the if-else-if statement when solving.
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter month number: ");
        int monthNumber = enterMonthNumber();
        printSeasonName(monthNumber);
    }

    private static int enterMonthNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void printSeasonName(int month) {
        if (month < 1 || month > 12) {
            System.out.println("Wrong month number!");
        } else if (month == 12 || month <= 2) {
            System.out.println("Time of the year - winter.");
        } else if (month <= 5) {
            System.out.println("Time of the year - spring.");
        } else if (month <= 8) {
            System.out.println("Time of the year - summer.");
        } else {
            System.out.println("Time of the year - autumn.");
        }
    }
}
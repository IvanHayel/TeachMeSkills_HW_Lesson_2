package branching.task_1;

/*
 * Write a program to display the name of the season by the number of the month.
 * When solving, use the switch-case statement.
 */

import java.util.Scanner;

public class Task1 {
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
        switch (month) {
            case 12, 1, 2 -> System.out.println("Time of the year - winter.");
            case 3, 4, 5 -> System.out.println("Time of the year - spring.");
            case 6, 7, 8 -> System.out.println("Time of the year - summer.");
            case 9, 10, 11 -> System.out.println("Time of the year - autumn.");
            default -> System.out.println("Wrong month number");
        }
    }
}
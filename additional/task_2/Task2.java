package additional.task_2;

/*
 * For each month, the bank charges 7% of the amount to the deposit amount.
 * Write a program into which the user enters the deposit amount and the number of months.
 * And the bank calculates the final amount of the deposit, taking into account the accrual of interest for each month.
 * Use a for loop to calculate the amount including percent.
 * Let the amount of the deposit be of the float type.
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter the amount of the deposit: ");
        float amount = enterDepositAmount();
        System.out.print("Enter months quantity: ");
        int quantity = enterMonthsQuantity();
        printFinalDepositAmount(amount, quantity);
    }

    private static float enterDepositAmount() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }

    private static int enterMonthsQuantity() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void printFinalDepositAmount(float amount, int monthsQuantity) {
        float finalAmount = getFinalDepositAmount(amount, monthsQuantity);
        System.out.printf("Final deposit amount within %d months: %f.", monthsQuantity, finalAmount);
    }

    private static float getFinalDepositAmount(float amount, int monthsQuantity) {
        if (monthsQuantity <= 0) {
            return amount;
        }
        float finalAmount = amount;
        float previousAmount = amount;
        for (int month = 1; month <= monthsQuantity; month++) {
            finalAmount += 0.07f * previousAmount;
            previousAmount = finalAmount;
        }
        return finalAmount;
    }
}

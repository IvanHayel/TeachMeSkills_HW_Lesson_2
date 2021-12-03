package branching.task_4;

/*
 * For the entered number t (outside temperature) output
 * If t > –5, then output "Warmly".
 * If –5 >= t > –20, then output “Normal”.
 * If –20 >= t, then output “Cold”.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Enter temperature: ");
        int temperature = enterTemperature();
        printTemperatureStatus(temperature);
    }

    private static int enterTemperature() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void printTemperatureStatus(int temperature) {
        if (temperature <= -20) {
            System.out.println("Cold.");
        } else if (temperature <= -5) {
            System.out.println("Normal.");
        } else {
            System.out.println("Warmly.");
        }
    }
}

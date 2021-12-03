package branching.task_5;

/*
 * По введенному номеру определить цвет радуги
 * (1 - красный, 4 – зеленый и т. д.)
 */

import java.util.Scanner;

public class Task5 {
    private static final int RED = 1;
    private static final int ORANGE = 2;
    private static final int YELLOW = 3;
    private static final int GREEN = 4;
    private static final int LIGHT_BLUE = 5;
    private static final int BLUE = 6;
    private static final int PURPLE = 7;

    public static void main(String[] args) {
        System.out.print("Enter rainbow color id: ");
        int rainbowColorID = enterRainbowColorID();
        printRainbowColor(rainbowColorID);
    }

    private static int enterRainbowColorID() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void printRainbowColor(int rainbowColorID) {
        switch (rainbowColorID) {
            case RED -> System.out.println("Red color.");
            case ORANGE -> System.out.println("Orange color.");
            case YELLOW -> System.out.println("Yellow color.");
            case GREEN -> System.out.println("Green color.");
            case LIGHT_BLUE -> System.out.println("Light blue color.");
            case BLUE -> System.out.println("Blue color.");
            case PURPLE -> System.out.println("Purple color.");
            default -> System.out.println("Wrong rainbow color id!");
        }
    }
}
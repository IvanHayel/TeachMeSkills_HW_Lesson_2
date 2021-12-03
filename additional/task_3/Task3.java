package additional.task_3;

/*
 * Write a program that prints the multiplication table to the console.
 */

public class Task3 {
    public static void main(String[] args) {
        printMultiplicationTable();
    }

    private static void printMultiplicationTable() {
        for (int row = 1; row < 10; row++) {
            for (int column = 1; column < 10; column++) {
                System.out.printf("%d X %d = %d\t", column, row, column * row);
            }
            System.out.println();
        }
    }
}
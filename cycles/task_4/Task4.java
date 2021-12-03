package cycles.task_4;

/*
 * It is necessary for the program to display the following sequence on the screen:
 * 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
 * Use a while loop in your solution.
 */

public class Task4 {
    public static void main(String[] args) {
        int sequenceElement = 0;
        int factor = 1;
        while (sequenceElement < 98) {
            sequenceElement = 7 * factor;
            System.out.print(sequenceElement + " ");
            factor++;
        }
    }
}
package cycles.task_5;

/*
 * Print the first 10 numbers of the sequence 0, -5, -10, -15 ..
 */

public class Task5 {
    public static void main(String[] args) {
        for (int counter = 0, sequenceElement = 0; counter < 10; counter++) {
            System.out.print(sequenceElement + " ");
            sequenceElement -= 5;
        }
    }
}
import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Math1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        int speed = in.nextInt();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        double min = time/60.0;
        double grams = (double)speed*min;
        System.out.println(grams);
        System.out.print(min);
    }
}
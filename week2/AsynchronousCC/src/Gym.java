import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Gym {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int B = in.nextInt();
        int R = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String E = in.nextLine();
        int W = in.nextInt();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        int total = 0;
        if(E.equals("bp")) {
            total = (W+20) * R;
        }
        else if (E.equals("lp")) {
            total = (W+47) * R;
        }
        else if (E.equals("p")) {
            total = W + B;
        }

        System.out.println(total);
    }
}
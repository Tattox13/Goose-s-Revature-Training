import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Test1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String FIRST = in.nextLine();
        String SECOND = in.nextLine();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        for(int i = 0; i < SECOND.length();i ++) {
            if(i < FIRST.length()) System.out.print(FIRST.charAt(i));
            else System.out.print(SECOND.charAt(i));
        }

    }
}
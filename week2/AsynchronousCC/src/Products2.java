import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Products2 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        String [] arr = n.split("");

        int result = Integer.parseInt(arr[0]);

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        for(int i = 1; i < arr.length; i++)
        {
            result *= Integer.parseInt(arr[i]);

        }

        System.out.println(result);
    }
}
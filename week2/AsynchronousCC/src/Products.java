import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Products {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String number = String.valueOf(n);

        int product = 1;

        for(int i = 0; i < number.length(); i ++) {
            int digit = Character.getNumericValue(number.charAt(i));
            product *= digit;

        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(product);
    }
}
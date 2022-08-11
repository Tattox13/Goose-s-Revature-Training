import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
public class AverageSol {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // s variable represents our string
        String s = in.nextLine();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        int sum = 0;
        for(int i = 0; i < s.length(); i ++) {
            // System.out.println((int)s.charAt(i));
            // this will get the ascii value of each character
            int ascii = (int) s.charAt(i);
            sum += ascii;
            System.out.println("Ascii: " + ascii + ", Sum: "+ sum);
        }

        // this is where we print out the answer
        int average = sum/s.length();
        System.out.println( (int) average);


    }

//    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//
//        // Write an answer using System.out.println()
//        // To debug: System.err.println("Debug messages...");
//
//        int sum = 0;
//        for(int i =0; i < s.length(); i ++){
//            System.out.println((int)s.charAt(i));
//            int ascii = (int) s.charAt(i);
//            sum += ascii;
//
//        }
//
//        int average = sum/s.length();
//        System.out.println(average);
//    }

}
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class UpperLowerCase {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");


        // initialize strings to be empty
        String upper = "";
        String lower = "";

        // iterate through each character in the string:
        for(int i = 0; i < t.length(); i ++) {
            char c = t.charAt(i);
            // if upper, add to upper string
            if(c >= 'A' && c <= 'Z') {
                upper += c;
            }
            // otherwise, guaranteed to be lower because T only contains alphabetic characters:
            else {
                lower += c;
            }
        }
        // print out the strings
        System.out.println(upper);
        System.out.println(lower);
    }

//    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//        String t = in.nextLine();
//        for (int i = 0; i < t.length(); i++) {
//            if(Character.isUpperCase(t.charAt(i))){
//                System.out.print(t.charAt(i));
//            }
//        }
//        System.out.println();
//        for(int i = 0; i<t.length(); i++) {
//            if(Character.isLowerCase(t.charAt(i))){
//                System.out.print(t.charAt(i));
//            }
//        }
//
//    }



}
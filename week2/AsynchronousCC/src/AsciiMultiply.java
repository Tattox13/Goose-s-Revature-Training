import java.util.*;
import java.io.*;
import java.math.*;

// ABC = 65*0 + 66*1 + 67*2 = 200
class AsciiMultiply {

//    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//
//        int sum = 0;
//        for(int i = 0; i < s.length(); i ++){
//            sum += s.charAt(i)*i;
//        }
//
//        System.out.println(sum);
//    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int t = 0;

        for(int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            //int ascii = (int) c;
            //t += ascii*i;
            t += c*i;
            //System.out.print(t);
        }
        System.out.println(t);
    }

}
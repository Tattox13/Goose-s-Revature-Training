import java.util.*;
import java.io.*;
import java.math.*;


class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int A = 0;
        int C = 0;
        int G = 0;
        int T = 0;
        char temp;
        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);
            if (temp == 'A') {
                A += 1;
            }
            if (temp == 'C') {
                C +=1;
            }
            if (temp == 'G') {
                G +=1;
            }
            if (temp == 'T') {
                T +=1;
            }
        }
        System.out.print(A + " " + C + " " + G + " " + T);

    }
}
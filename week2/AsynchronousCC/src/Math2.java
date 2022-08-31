import java.util.*;
import java.io.*;
import java.math.*;

class Math2 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int k = 0;
        long sum = 0;
        for (int i = N; i > 0; i--) {
            k = N*i;
            sum += k;
        }
        System.out.print(sum);
    }
}
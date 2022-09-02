import java.util.*;
import java.io.*;
import java.math.*;

class Intervals {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            int F = in.nextInt();
            int T = in.nextInt();
            String category = in.next();
            if(X >= F && X <= T) {
                System.out.print(category);
            }
        }
    }
}
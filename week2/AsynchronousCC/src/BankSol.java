import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class BankSol {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int V = in.nextInt();
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            String transaction = in.next();
            int amount = in.nextInt();
            // if we are withdrawing, make the transaction negative:
            if(transaction.equals("W")) amount *= -1;
            // add the amount to the initial balance:
            V += amount;
        }
        // print out the final answer:
        System.out.println(V);
    }
}
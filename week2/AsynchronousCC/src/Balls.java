import java.util.*;
import java.io.*;
import java.lang.Math;

public class Balls {

    public static int findBalls(int N) {

        //this is default OUTPUT. You can change it.
        int result = 0;
        //write your Logic here:
        for (int i =1; i<= N; i++){

            //odd
            if (i%2 != 0){
                result += 2;
            }
            //even
            else if (i%2 == 0){
                result -= 1;
            }
        }
        return result;

    }

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //INPUT [uncomment & modify if required]
        int N = sc.nextInt();
        sc.close();
        //OUTPUT [uncomment & modify if required]
        System.out.print(findBalls(N));

    }

}
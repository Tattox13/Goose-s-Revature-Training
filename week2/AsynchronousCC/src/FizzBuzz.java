import java.sql.SQLOutput;

public class FizzBuzz {

    public static void main(String[] args){
        int g = 60;
        for (int i =1; i <= g; i++){
            if(i%15 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i%3 == 0 ){
                System.out.println("Fizz");
            }
            else if (i%5 == 0 ) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }

        }
    }


}

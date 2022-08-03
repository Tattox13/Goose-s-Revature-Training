package Wednesday;

import java.util.Scanner;

public class GradingTool {
    public static void main(String[] args) {
        Scanner scannerNumber = new Scanner(System.in);

        System.out.print("Enter your grade for the class => ");
        int grade = scannerNumber.nextInt();

        if (grade >= 90){
            System.out.println("\nYou have a A for the class!!! :)");
        }
        else if (grade <= 89 && grade >= 80) {
            System.out.println("\nYou have a B for the class!!!");
        }
        else if (grade <= 79 && grade >= 70){
            System.out.println("\nYou have a C for the class!!!");
        }
        else if (grade <= 69 && grade >= 60){
            System.out.println("\nYou have a D for the class!!!");
        }
        else {
            System.out.println("\nYou have a F for the class!!! :(");
        }
    }
}

//program to print if the numbers are increasing or decreasing
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("enter firs number:");
        int fn =input.nextInt();   //user input for first number

        System.out.println("enter second number:");
        int sn =input.nextInt();   //user input for second number

        System.out.println("enter third number:");
        int tn =input.nextInt();   //user input for first number


        if (fn < sn && sn < tn)                  //expression to check is the number are increasing
        {
            System.out.println(fn +" " + sn + "  " + tn);
            System.out.println("increasing");
        }

        else if (fn > sn || fn > tn || sn > tn) //expression to check is the number decreasing
        {
            System.out.println(fn + " " + sn + " " + tn);
            System.out.println("decreasing");
        }

        else {                                 //if the first & second expression didn't achieve the 'else' gonna print
            System.out.println("neither");
        }


    }
}

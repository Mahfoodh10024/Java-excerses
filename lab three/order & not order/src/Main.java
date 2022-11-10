//program to print if user the numbers are in order or not in order
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


        if (fn < sn && tn > sn || fn == sn && fn < tn && sn < tn || fn == sn && sn == tn) //expression to check is the number in order
        {
            System.out.println(fn +" " + sn + "  " + tn);
            System.out.println("in order");
        }

        else if (fn > sn && sn < tn || sn > tn && tn < fn) //expression to check is the number in order
        {
            System.out.println(fn + " " + sn + " " + tn);
            System.out.println("not in order");
        }


    }
}

//program to chick if the numbers are all the same or all difference


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


            System.out.println("enter a number :");
             int fn = input.nextInt();   //user input for first number

            System.out.println("enter a number :");
             int sn = input.nextInt();   //user input for second number

            System.out.println("enter a number :");
             int tn = input.nextInt();   //user input for third number


        if (fn == sn && fn == tn && sn ==tn)
        {                                     //this expression check if the numbers are the same or difference
            System.out.println("all the same");
        }
        else
        {
            System.out.println("all difference ");
        }

    }
}
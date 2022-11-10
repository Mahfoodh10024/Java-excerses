//program to specify if the number is 'positive' or 'equal zero' or 'negative'

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        int in;
        char e = 'e';
        Scanner input = new Scanner(System.in);

        System.out.println("press 'e' to exit \n");
        do {


            System.out.println("enter a number :");
             in = input.nextInt();   //user input for the number


            if (in > 0)         //this expression checks if the number is positive
            {
                System.out.println("the number " + "'" + in + "'" + " positive");
            } else if (in == 0)   //this expression checks if the number equal zero
            {
                System.out.println("the number " + "'" + in + "'" + "is zero");
            } else                //this expression checks if the number is negative
            {
                System.out.println("the number " + "'" + in + "'" + " negative");
            }
            System.out.println("\n");

        }while (in != e);

    }
}
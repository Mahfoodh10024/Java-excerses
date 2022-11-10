//program to print number of month's days


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {



        System.out.println("1-for January 2-for Februray 3-for March 4-for April \n5-for May 6-for june 7-for july 8-for August \n9-for September 10-for November 11-for October 12-for December" );

        System.out.println("enter a month : ");
                                               //user input for the month
        Scanner month = new Scanner(System.in);
        int m = month.nextInt();

        switch (m)
        {

            case 1:
                System.out.println("January = 31 Days");
                break;

            case 2:
                System.out.println(" Februray = 29 Days");
                break;

            case 3:
                System.out.println("March = 31 Days");
                break;

            case 4:
                System.out.println("April = 30 Days");
                break;

            case 5:
                System.out.println("May = 31 Days");
                break;

            case 6:
                System.out.println("June = 30 Days");
                break;

            case 7:
                System.out.println("July 31 Days");
                break;

            case 8:
                System.out.println("August = 31 Days");
                break;

            case 9:
                System.out.println("September 30 Days");
                break;

            case 10:
                System.out.println("November = 31 Days");
                break;

            case 11:
                System.out.println("Octobe r= 30 Days");
                break;

            case 12:
                System.out.println("December = 31 Days");
                break;

            default:
                System.out.println("");
                break;
        }



    }
}
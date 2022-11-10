//program to convert from positive numbers to binary
import java.util.Scanner;

public class Main {

    private static void printBinaryform(int number) {      // method to perform the check operation
        int remainder;

        if (number <= 1) {
            System.out.print(number);
            return; // to exit the recursion of the method
        }

        remainder = number % 2;
        printBinaryform(number >> 1);      //the mod of the number to get either  '1' or '0'
        System.out.print(remainder);
    }

    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive integer");//user input
        number = in.nextInt();

        if (number < 0) {
            System.out.println("Error: Not a positive integer"); //condition if the number is negative the operation won't work
        } else {

            System.out.print("binary is:");   //else print the binary of the number
            printBinaryform(number);
        }
    }
}



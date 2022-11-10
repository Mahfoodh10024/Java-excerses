//program to specify number and it's color in chess board

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

        System.out.println("enter the first number : ");
        int fn =input.nextInt();

        System.out.println("enter the second number : ");
        int sn =input.nextInt();

        System.out.println("enter the third number : ");
        int tn =input.nextInt();


        if (fn == sn && fn == tn)
        {
             System.out.println("all the same ");
         }
        if (fn != sn && fn != tn)
        {
            System.out.println("all difference");
        }
        else
         {
            System.out.println("neither");
         }

    }
}
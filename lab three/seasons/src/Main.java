//program to print the seasons by the number of month


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {



        System.out.println("enter a month of the year : ");

        Scanner month = new Scanner(System.in);
        int m = month.nextInt(); //user input for the month

        System.out.println("enter a day : ");

        Scanner day = new Scanner(System.in);
        int d = month.nextInt(); //user input for day

        if (m == 1 || m == 2 || m == 3)           //expression to check the season
        {
           if (d >= 21)                          //if  day was after day '21' it's gonna print the next season
           {
               System.out.println("it's spring ");
           }
           else                                //else it's gonna print the currently season
           {
               System.out.println("it's Winter");
           }

        }
        else if (m == 4 || m == 5 || m == 6)      //expression to check the season
        {
             if (d >= 21)                         //if  day was after day '21' it's gonna print the next season
             {
                 System.out.println("it's Summer");
             }
             else                                  //else it's gonna print the currently season
             {
                 System.out.println("it's Spring");
             }
        }
         if (m == 7 || m == 8 || m == 9)          //expression to check the season
        {
             if (d >= 21 )                        //if  day was after day '21' it's gonna print the next season
             {
                 System.out.println("it's Fall");
             }
             else                                  //else it's gonna print the currently season
             {
                 System.out.println("it's Summer");
             }
        }
        else if (m == 10 || m == 11 || m == 12)    //expression to check the season
        {
            if (d >= 21)                           //if  day was after day '21' it's gonna print the next season
            {
                System.out.println("it's Winter");
            }
            else                                    //else it's gonna print the currently season
            {
                System.out.println("it's Summer");
            }
        }


    }
}
//DieSimulator program to simulate the cast of die

import java.util.Random;   //random class

public class Main {


    public static void main(String[] args) {

        Random rand = new Random(); //new random object of class random

        int i=1;
        for (i = 1; i <= 6; i++) {
            rand.nextInt(i);          // this for counting the random numbers

            System.out.print(rand.nextInt(i)); //print statement
        }


    }
}
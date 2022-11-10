//program to print power from 0 to 20 for a number
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");     //user enter a number
        int in =input.nextInt();

        int power=1;
        for (int i = 0 ; i<= 20 ; i++){
            power = (int) Math.pow(in ,i);     //the power operation
            System.out.println(in + "^" + i +"=" + power);
        }

    }
}
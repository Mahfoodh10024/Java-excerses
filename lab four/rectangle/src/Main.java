//class program to compute the perimeter of rectangle
import java.util.Scanner;
public class Main {

    static class rectangle{
        double width;
        double High;


        //class beginning with two variables width & High


        public rectangle(){
            width =0;
            High =0;
        }


        //constructor to initial the value of the variables


        public  void recieveWidth(double w){
            width = w;
        }


         //method to receive with value


        public void recieveHight(double l){
            High = l;
        }


        //method to receive High value


        public double getWidth(){
            return width;
        }


        //return method to reference to width  value


        public double getHigh(){
            return High;
        }


        //return method to reference to High value


    }
    public static void main(String[] args) {
        rectangle rec =new rectangle();

         //new object of the class rectangle called rec


        Scanner input =new Scanner(System.in);


        System.out.println("enter width of the  rectangle");
        double in1 = input.nextDouble();   //receiving width value

        System.out.println("enter High of the rectangle");
        double in2 = input.nextDouble();   //receiving High vlaue

        rec.recieveWidth(in1); //sending the value of width to the class
        rec.recieveHight(in2); // sending the value fo High to the class

        System.out.println(" perimeter of the rectangle is = " + (rec.getHigh() + rec.getWidth()) * 2);
        //printing the inputs



    }
}
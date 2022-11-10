//replaceTester program to encode String
public class Main {

    public static void main(String[] args) {

        String word ="mississippi"; // the word
        String actualResult = "m!$$!$$!pp!";  //actual result

        String enconding = word.replace("i"  , "!"); // the first encoding operation
         String enc = enconding; // variable to save previous operation encoding
        String enconding1 = enc.replace("s"  , "$"); // the second encoding operation

         //print sentence
        System.out.println(" - the word : "+ word + " \n - actual result :" + actualResult + " \n - word encoding : " + enconding1);

    }
}
//program to change letters in word and compute its length
public class Main {

    public static void main(String[] args) {

        String word ="mississippi"; // the word

        String replacing = word.replaceAll("i" , "ii"); // the first replace operator
        String replacing1 =word.replaceAll("ss" , "s"); // the second replace operator
        int tale = replacing.length();   // the word before replacing length
        int tale1 = word.length();      // the word after first replacing length
        int tale2 =replacing1.length(); // the word after second replacing length

        // print statements
        System.out.println(" -before replacing : " + word + " \t  -word length : "+ tale1 +  "\n -after replacing : " + replacing + " \t -word length : " + tale);
        System.out.println(" -word after second replacing : " + replacing1 + "\t -word length : " + tale2);
    }
}
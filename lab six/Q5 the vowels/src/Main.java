//program print the vowels in a word
import java.util.Scanner; 

class Main {
  public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);
    System.out.print("enter a word:");        //user input
    String word = inp.nextLine();

    for(int whatsat = 0; whatsat < word.length(); whatsat++){   //move on all the word's letters

      char b =Character.toLowerCase(word.charAt(whatsat));     // this for if capital letters in the wore

      if (b == 'a' || b == 'e'|| b == 'i' || b == 'o' || b == 'u'){  //condition to check the vowels
        System.out.print(word.charAt(whatsat));
      }

  }
}
}



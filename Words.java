import java.util.ArrayList;
import java.util.Scanner;
public class Words{
    public static void main(String args[]){
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        String word = " ";
        while (!(word.equals(""))){
            System.out.println("Type a word: ");
            word = reader.nextLine();
            words.add(word);
        }
        System.out.println("You typed the following words: ");
        for(String names : words){
            System.out.println( names );
        }
       
    }
}

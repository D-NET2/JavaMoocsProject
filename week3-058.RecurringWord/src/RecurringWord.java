import java.util.Scanner;
import java.util.ArrayList;
public class RecurringWord{
    public static void main(String args[]){
      
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        String word = " ";
        while (!(words.equals(""))){
            System.out.println("Type a word: ");
            word = reader.nextLine();
            if(words.contains(word)){
                System.out.println("You gave the word "+ word +" twice");
                break;
            }
            else{
                words.add(word);
            }
        }
       
       
    
    }
}
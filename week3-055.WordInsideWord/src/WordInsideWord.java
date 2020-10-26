import java.util.Scanner;
public class WordInsideWord{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String FirstWord = reader.nextLine();
        System.out.println("Type the second word: ");
        String SecondWord = reader.nextLine();
        int decider = (FirstWord.indexOf(SecondWord));
        if (decider>=0) {
            System.out.println("The word " + SecondWord + " is found in the word " + FirstWord);
//checking if second word is in first word
        }
        else{
            System.out.println("The word " + SecondWord + " is not found in the word " + FirstWord+".");
        }
    }
}
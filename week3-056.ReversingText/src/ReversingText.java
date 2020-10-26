
import java.util.Scanner;

public class ReversingText {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
        
    }
    
    public static String reverse(String text) {
        int length = text.length();
        int backcounter = length-1;
        int count =0;
        String help = "";
        while(backcounter>=0){
            char letter = text.charAt(backcounter);
            help = help + letter;
            backcounter--;
        }
        return help;
    }
    
}

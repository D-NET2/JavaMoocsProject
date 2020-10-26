import java.util.Scanner;
public class LastCharacter{
    public static void main(String arg[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        char lastlett = lastCharacter(name);
        System.out.println("Last character: "+ lastlett);
    }
    
    public static char lastCharacter(String text){
        int numOfletters = text.length();
        
        char lastletter = text.charAt(numOfletters-1);
        return lastletter;
    }
    
    
}
import java.util.Scanner;
public class FirstCharacters{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int length = name.length();
        if (length<3){
            System.out.println("");
        }
        else{
            char letterOne = name.charAt(0);
            char letterTwo = name.charAt(1);
            char letterThree = name.charAt(2);
            
            System.out.println("1. character: "+letterOne);
            System.out.println("2. character: "+letterTwo);
            System.out.println("3. character: "+letterThree);
        }
    }
}

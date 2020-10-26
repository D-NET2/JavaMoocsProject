import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import static java.util.Collections.reverse;
public class WordsInReverseOrder{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        ArrayList<String>  namelist = new ArrayList<String>();
        String name = " ";
        while(!(name.equals(""))){
            System.out.println("Type a word: ");
            name = reader.nextLine();
            namelist.add(name);
            
        }
        Collections.reverse(namelist);//this to make array list go backwards
        for(String words : namelist){
            System.out.println(words);
        }
    }
}
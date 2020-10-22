import java.util.Scanner;
import java.util.ArrayList;
public class MoreThanOnce{
    public static void main(String args[]){
        
        
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numlist = new ArrayList<Integer>();
        numlist.add(1);
        numlist.add(3);
        numlist.add(2);
        numlist.add(7);
        numlist.add(2);
        
        
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (moreThanOnce(numlist, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once.");
        }
        
    }
    
    public static boolean moreThanOnce(ArrayList<Integer> list, int number){
        int input1 = number;
        int count =0;
        if (list.size() == 1){
            return false;
        }
        
        for( int item : list){
            if (input1==item){
                count++;
                //return true;
   
            }
            if(count >= 2){
            return true;
            }
 
        }
            
    
        
        return false;
    }
}
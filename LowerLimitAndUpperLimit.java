import java.util.Scanner;
public class LowerLimitAndUpperLimit{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int num1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Second: ");
        int num2 = Integer.parseInt(reader.nextLine());
        int lower = (num1 -1);
        while(lower < num2){
            lower++;
            System.out.println(lower);
                   
        }
    }
}
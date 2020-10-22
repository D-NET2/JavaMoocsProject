import java.util.Scanner;
public class UpToCertainNumber{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number? ");
        int num1 = Integer.parseInt(reader.nextLine());
        int sum =0;
        while(sum < num1){
            sum++;
            System.out.println(sum);
                    
        }
            
    }
}

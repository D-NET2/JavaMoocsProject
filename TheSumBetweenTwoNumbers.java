import java.util.Scanner;
public class TheSumBetweenTwoNumbers{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Second: ");
        int num2 = Integer.parseInt(reader.nextLine());
        int sum =0;
        int r = (num1-1);
        while(r< num2){
            r++;
            sum +=r;//sum = sum +num1
        }
        System.out.println("The sum is "+ sum);
    }
}

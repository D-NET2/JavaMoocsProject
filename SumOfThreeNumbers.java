import java.util.Scanner;
public class SumOfThreeNumbers{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;
        System.out.println("Type number 1: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type number 2: ");
        int num2 = Integer.parseInt(reader.nextLine());
        System.out.println("Type number 3: ");
        int num3 = Integer.parseInt(reader.nextLine());
        sum = (num1 +num2 +num3);
        System.out.println("Sum: " + sum);
        
    }
}
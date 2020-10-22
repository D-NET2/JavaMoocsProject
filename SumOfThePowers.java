import java.util.Scanner;
public class SumOfThePowers{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        int num =0;
        int ans =0;
        int result =0;
        while (num <= num1){
            result = (int)Math.pow(2, num);
            ans += result;
            num++;
        }
        System.out.println("The result is " + ans);
    }
}
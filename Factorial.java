
import java.util.Scanner;
public class Factorial{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type an number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        int sum = 1;
        int factorial =1;
        while(sum <= num1 ){
            factorial *= sum;
            sum++;
        }
        System.out.println("Factorial is " + factorial);
               
    }
}
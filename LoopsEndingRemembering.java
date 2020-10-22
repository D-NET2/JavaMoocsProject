import java.util.Scanner;
public class LoopsEndingRemembering{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int sum =0;
        int num1 = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        while (num1 != -1){
            num1 = Integer.parseInt(reader.nextLine());   
            sum += num1;
            
            if(num1%2== 0){
                even++;
            }
            else{
                odd++;
            }
            
            if(num1 != -1){
                count++;
            }
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + (sum+1));
        System.out.println("How many numbers: "+count);
        
        double average = (sum+1)/(double)count;
        System.out.println("Average: "+average);
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+(odd-1));
        
        
    }
}
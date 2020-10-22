import java.util.Scanner;
public class PrintingLikeBoss{
    public static void main(String args[]){
        
        
        
        xmasTree(4);
        
    }
    
    public static void printWhitespaces(int amount){
        int count = 0;
        while(count < amount){
            System.out.print(" ");
            count++;
        }
        
        
    }
    
    
    public static void printStars(int amount){
        int count = 0;
        while(count < amount){
            System.out.print("*");
            count++;
        }
        System.out.println("");
        
        
    }
    
    public static void printTriangle(int size) {
        int count =1;
        while(count <= size){
            printWhitespaces(size-count);
            printStars(count);
            count++;
        }
        System.out.print("");
        
        

    }
    
    
    public static void xmasTree(int height){
        int count =1;
        int counth = (height-1);
        int adder=0;
        
        while(height >= count){
            
            int sum = (count +adder);
            printWhitespaces(counth);
            printStars(sum);
            //System.out.println(counth);
            
            
            
           
            counth--;
            count++;
            adder++;
            if(count > height){
                int newwhitespace= ((sum-2)/2);
                printWhitespaces(newwhitespace);
                printStars(3);
                printWhitespaces(newwhitespace);
                printStars(3);
   
            }
            
            
        }
        System.out.print("");
        
    }
}
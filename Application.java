import java.util.*;
public class Application
{
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Database");
        System.out.println("Password: ");
        String password = reader.nextLine();
        if (password.equals("CCNAX1"))
        {
            System.out.println("Hello Mate");
        }
        else
        {
            System.out.println("Try again Later");
        }
        
    }
}
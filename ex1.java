import java.io.*;
import java.lang.*;
import java.util.*;
public class Main 
{
     public static String getAlphaNumericString(int n)
    {
            Scanner input=new Scanner(System.in);
            System.out.print("enter the number between 1 to 229=");
            int number = input.nextInt();
            String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+ "0123456789"+ "abcdefghijklmnopqrstuvxyz";
            StringBuilder sb = new StringBuilder(n);
            for (int j = 0; j < number; j++)
             {
                 for (int i = 0; i < n; i++)
                 {
                      int index= (int)(AlphaNumericString.length()* Math.random());
                     sb.append(AlphaNumericString.charAt(index));
                 } 
                 sb.append("\n");
             }
             return sb.toString();
        
    }
  
    public static void main(String[] args)
    {
  
        // Get the size n
         int n = 100;
        
        try 
        {
           FileWriter fwrite=new FileWriter("new.txt");
           fwrite.write(Main.getAlphaNumericString(n));
           fwrite.close();
           System.out.println("Do you wanna see the output--> go to new.txt file");
        }
        catch(IOException e) 
        {
            System.out.println("error");
            e.printStackTrace();
        }
    }
    
}
 
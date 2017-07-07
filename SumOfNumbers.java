
import java.util.Scanner;
import java.io.*;

public class SumOfNumbers
{
    public static void main(String args[])
    {
  
        int a = 6;
        int sum = 0;
        
        for(int i = 1; i <= a; i++)
        {
            sum = sum + i;    
            //System.out.println("Sum after adding "+i+"is :"+sum); 
        }
        
        //System.out.println();
        System.out.println("Sum of numbers till "+a+"is "+sum); 
    
    }
}

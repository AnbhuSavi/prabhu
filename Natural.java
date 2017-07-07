import java.util.Scanner;
import java.io.*;

public class Natural
{
    public static void main(String args[])
    {

    int n,i,sum = 0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a positive integer: ");
    n=s.nextInt();

    for(i=1; i <= n; ++i)
    {
        sum += i;  
    }

   System.out.println("Sum :"+sum);
} 
}

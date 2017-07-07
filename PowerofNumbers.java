import java.util.Scanner;
import java.io.*;

public class PowerofNumbers
{
  public static void main(String arg[]) 
  {
    int n,p,result=1;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number");
    n=s.nextInt();
    System.out.println("Enter the power");
    p=s.nextInt();
    if(n>=0&&p==0)
     {
        result=1;
     }
    else if(n==0&&p>=1)
      { 
         result=0;
      }
    else
     {
         for(int i=1;i<=p;i++)
   {
            result=result*n;
   }      
     }
    System.out.println(n+"^"+p+"="+result);
  
  }
}

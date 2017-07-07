import java.util.Scanner;
import java.io.*;

public class Palindrome
{
  public static void main(String arg[]) 
  {
   int r,sum=0,temp;
   int n;
   Scanner s=new Scanner(System.in);
   System.out.println("Enter a number");
   n=s.nextInt();
    temp=n;    
  while(n>0){    
   r=n%10;    
   sum=(sum*10)+r;    
   n=n/10;    
  }  
   if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}    

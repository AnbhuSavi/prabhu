   
import java.util.Scanner;
import java.io.*;

public class Prime
{
   
     public static void main(String args[])
     { 
      Scanner s = new Scanner(System.in); 
      int i,m=0,flag=0;    
      int n;  
      
      System.out.println("Enter a number");
      n=s.nextInt(); 
      m=n/2;   
      for(i=2;i<=m;i++){    
       if(n%i==0)
       {    
       System.out.println("Number is not prime");    
       flag=1;    
       break;    
       }    
      }    
      if(flag==0)    
      System.out.println("Number is prime");    
    }  
    }  

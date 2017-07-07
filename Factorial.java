   
import java.util.Scanner;
import java.io.*;
 public class Factorial 
 {  
     public static void main(String args[])
     { 
      Scanner s=new Scanner(System.in);  
      int i,fact=1;  
      int n;
      System.out.println("Enter a number");
      n=s.nextInt();  
      for(i=1;i<=n;i++){    
          fact=fact*i;    
      }    
      System.out.println("Factorial of "+n+" is: "+fact);    
     }  
    }  

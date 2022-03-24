//package com.exceptiondemo.pack;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Hello world!
 *
 */
public class ExExample 
{
    public static void main( String[] args )
    {
       int num1=0;
       Scanner sn=new Scanner(System.in);
       try {
       num1=sn.nextInt();
       }catch(InputMismatchException ex)
       {
    	   System.out.println(ex.getClass());
       }
       System.out.println(num1);
       
       int num2;
       
       int res=0;
       try {
    	   num2=sn.nextInt();
           res=num1/num2;
       }catch(InputMismatchException ex)
       {
    	   System.out.println("exception "+ex.getMessage());
       }
       catch(ArithmeticException e)
       {
    	   System.out.println("exception");
       }
       System.out.println("Hello the result is"+res);
       
    }
}

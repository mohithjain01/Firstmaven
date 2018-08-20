package com.navis.app;

/**
 * Hello world!
 *
 *
 */
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int first,max=0;
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the" + i + "number");
            first=sc.nextInt();
            if(first>max)
                max=first;
        }
        System.out.println( "Maximum number is " + max );
    }
}

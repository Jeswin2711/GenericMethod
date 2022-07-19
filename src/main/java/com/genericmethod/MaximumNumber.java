package com.genericmethod;

import java.util.Scanner;

public class MaximumNumber extends FindMaximumNumber
{
    /*
    Main Function to Get Values from User and to pass to the respective Function using Objects...
     */
    public static void main(String[] args)
    {
        System.out.println("Maximum Number Problem\n");
        Scanner scanner = new Scanner(System.in);
        //Integer Part
        System.out.println("Enter Number A");
        Integer a = scanner.nextInt();
        System.out.println("Enter Number B");
        Integer b = scanner.nextInt();
        System.out.println("Enter Number C");
        Integer c = scanner.nextInt();
        FindMaximumNumber find = new FindMaximumNumber();
        //calling FindMaximumNumber function using object to calculate the Maximum Integer
        find.findMaxInteger(a , b, c);

        //Float Part
        System.out.println("Enter Number D");
        Float d = scanner.nextFloat();
        System.out.println("Enter Number E");
        Float e = scanner.nextFloat();
        System.out.println("Enter Number F");
        Float f = scanner.nextFloat();
        //calling FindMaximumNumber function using object to calculate the Maximum Integer
        find.findMaxFloat(d , e , f);
    }
}

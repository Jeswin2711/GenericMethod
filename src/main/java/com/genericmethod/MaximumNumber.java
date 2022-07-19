package com.genericmethod;

import java.util.Scanner;

public class MaximumNumber extends GenericClass
{
    /*
    Main Function to Get Values from User and to pass to the respective Function using Objects...
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Finding Maximum Number Using Generics");
        System.out.println("-------------------------------------\n");
        while (true) {
            System.out.println("Enter 1 for INTEGER");
            System.out.println("Enter 2 for FLOAT");
            System.out.println("Enter 3 for STRING");
            System.out.println("Enter 4 for EXIT");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter three Value of Integer to Find Max Value");
                    //calling CalculateMax generic funtion to calculate the maximum value
                    GenericClass integerValue = new GenericClass(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Enter three Value of Float to Find Max Value");
                    //calling CalculateMax generic funtion to calculate the maximum value
                    GenericClass floatValue = new GenericClass(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Enter three Value of String to Find Max Value");
                    //calling CalculateMax generic funtion to calculate the maximum value
                    GenericClass stringValue =  new GenericClass(scanner.next(), scanner.next(), scanner.next());
                    System.out.println("\n");
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
    /*
    Generic Method to Calculate The Maximum Value of Any Type
     */
//    static <E extends Comparable> E calculateMax(E a , E b , E c)
//    {
//        if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
//        {
//            return a;
//        }
//        else if (b.compareTo(c) > 0 && b.compareTo(a) > 0)
//        {
//            return b;
//        }
//        else if (c.compareTo(a) > 0 && c.compareTo(b) > 0)
//        {
//            return c;
//        }
//        else
//        {
//            return null;
//        }
//    }
}

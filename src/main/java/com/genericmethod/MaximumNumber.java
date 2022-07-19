package com.genericmethod;

import java.util.Scanner;

public class MaximumNumber extends FindMaximumNumber
{
    public static void main(String[] args)
    {
        System.out.println("Maximum Number Problem\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number A");
        Integer a = scanner.nextInt();
        System.out.println("Enter Number B");
        Integer b = scanner.nextInt();
        System.out.println("Enter Number C");
        Integer c = scanner.nextInt();
        FindMaximumNumber find = new FindMaximumNumber();
        find.findMaxInteger(a , b, c);
    }
}

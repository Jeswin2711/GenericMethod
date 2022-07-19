package com.genericmethod;

public class FindMaximumNumber
{
    /*
    Function to Find the Maximum Integer Value b/w  a, b  and c
     */
    void findMaxInteger(Integer a , Integer b ,Integer c)
    {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
        {
            System.out.println("A is Maximum Value\n");
        }
        else if (b.compareTo(c) > 0 && b.compareTo(a) > 0)
        {
            System.out.println("B is Maximum Value\n");
        }
        else if (c.compareTo(a) > 0 && c.compareTo(b) > 0)
        {
            System.out.println("C is Maximum Value\n");
        }
        else
        {
            System.out.println("All Values are Equal\n");
        }
    }
    /*
    Function to Find the Maximum Float Value b/w  d, e  and f
     */
    void findMaxFloat(Float a , Float b ,Float c)
    {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
        {
            System.out.println("D is Maximum Value\n");
        }
        else if (b.compareTo(c) > 0 && b.compareTo(a) > 0)
        {
            System.out.println("E is Maximum Value\n");
        }
        else if (c.compareTo(a) > 0 && c.compareTo(b) > 0)
        {
            System.out.println("F is Maximum Value\n");
        }
        else
        {
            System.out.println("All Values are Equal\n");
        }
    }

    /*
    Function to Find the Maximum String Value b/w  g, h  and i
     */
    void findMaxString(String a , String b ,String c)
    {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
        {
            System.out.println("G is Maximum Value\n");
        }
        else if (b.compareTo(c) > 0 && b.compareTo(a) > 0)
        {
            System.out.println("H is Maximum Value\n");
        }
        else if (c.compareTo(a) > 0 && c.compareTo(b) > 0)
        {
            System.out.println("I is Maximum Value\n");
        }
        else
        {
            System.out.println("All Values are Equal\n");
        }
    }
}

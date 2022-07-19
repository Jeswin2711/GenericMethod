package com.genericmethod;


/*
Generic Class Created to Refactor take in 3 variables of
Generic Type
 */


class GenericClass
{
    GenericClass()
    {

    }

    <E extends Comparable> GenericClass(E a , E b , E c)
    {
        System.out.println("The Maximum Value is " +  testMaximum(a,b,c));
    }

    static <E extends Comparable> E testMaximum(E a , E b , E c)
    {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
        {
            return a;
        }
        else if (b.compareTo(c) > 0 && b.compareTo(a) > 0)
        {
            return b;
        }
        else if (c.compareTo(a) > 0 && c.compareTo(b) > 0)
        {
            return c;
        }
        else
        {
            return null;
        }
    }

}

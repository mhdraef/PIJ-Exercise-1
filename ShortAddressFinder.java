package com.bham.pij.exercises.e1f;

import java.util.Scanner;

public class ShortAddressFinder
{

    public static String findShortAddress(String input)
    {
        String[] Address = input.split(", ");
        String PostCode = Address[Address.length-1];
        String ShortAddress;

        if(!checkPostCode(PostCode))
            return null;

        else if(Address.length<2)
            return null;

        else if(input.equals(" "))
            return null;

        else if(input.charAt(0)==' ')
            return null;

        else
            ShortAddress = Address[0]+" "+Address[Address.length-1];
            return ShortAddress;
    }


    public static Boolean checkPostCode(String input)
    {
        if(input.length()!=6)
            return false;

        char a = input.charAt(0);
        char b = input.charAt(1);
        char c = input.charAt(2);
        char d = input.charAt(3);
        char e = input.charAt(4);
        char f = input.charAt(5);

        if(!( (a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) )
            return false;

        else if(!(b>='0' && b<='9'))
            return false;

        else if(!(c>='0' && c<='9'))
            return false;

        else if(!(d>='0' && d<='9'))
            return false;

        else if(!( (e >= 'a' && e <= 'z') || (e >= 'A' && e <= 'Z')) )
            return false;

        else if(!( (f >= 'a' && f <= 'z') || (f >= 'A' && f <= 'Z')) )
            return false;

        else
            return true;
    }


    public static void main(String[] args)
    {
        String Address;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the address: ");

        Address=in.nextLine();

        System.out.println("Short Address: "+findShortAddress(Address));
    }

}
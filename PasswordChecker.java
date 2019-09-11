package com.bham.pij.exercises.e1e;

import java.util.Scanner;

public class PasswordChecker
{
    public static String checkPassword(String input)
    {
        int length=input.length();
        int uppercasecount=0;
        int lowercasecount=0;

        for(int i=0;i<length;i++)
        {
            if(input.charAt(i)>='A' && input.charAt(i)<='Z')
                uppercasecount++;

            else if(input.charAt(i)>='a' && input.charAt(i)<='z')
                lowercasecount++;

            if((input.charAt(i)>='a' && input.charAt(i)<='z') || (input.charAt(i)>='A' && input.charAt(i)<='Z') || (input.charAt(i)>='0' && input.charAt(i)<='9') || input.charAt(i)=='_');

            else
                return null;
        }

    if(length<8 || length>12)
        return null;

    else if(input.charAt(0)>='0' && input.charAt(0)<='9')
        return null;

    else if(uppercasecount<1)
        return null;

    else if(lowercasecount<1)
        return null;
    else
        return "OK";
    }


    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a password:");

        String password = in.nextLine();

        System.out.println(checkPassword(password));

    }

}


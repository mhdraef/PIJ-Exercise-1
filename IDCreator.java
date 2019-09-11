package com.bham.pij.exercises.e1d;

import java.util.Scanner;

public class IDCreator {

    public static String createID(String input) {

        int spacecount = 0;
        char c = ' ';
        String ID;

        for (int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i)==c)
                spacecount++;
        }

        if (input.length() == 0 || input.indexOf(' ') == 0 || spacecount > 2 || spacecount < 1)
            return null;

        else
        {

            String id1, id2, id3;

            id1 = input.substring(0, 1).toLowerCase();

            if (spacecount == 1)
            {
                id2 = "x";

                id3 = input.substring(input.indexOf(' ')+1, input.indexOf(' ') + 2).toLowerCase();

                ID=id1+id2+id3;
                return ID;
            }

            else
            {

                id2 = input.substring(input.indexOf(' ')+ 1, input.indexOf(' ') + 2).toLowerCase();
                id3 = input.substring(input.lastIndexOf(' ')+ 1, input.lastIndexOf(' ') + 2).toLowerCase();

                ID=id1+id2+id3;
                return ID;

            }
        }
    }

    public static void main (String[] args){

        String ID;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the name of the student:");
        String name = in.nextLine();
        ID=createID(name);

        System.out.println("ID: " + ID);
    }

}
package com.bham.pij.exercises.e1a;

import java.util.Scanner;

public class GradeChecker {

    public static boolean isValid(int grade) {

        if (grade >= 0 && grade <= 100)
            return true;

        else
            return false;
    }

    public static boolean isPass(int grade) {

        if (grade >= 40)
            return true;

        else
            return false;

    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the grade of the student: ");

        int mark = in.nextInt();

        if (isValid(mark) == true) {
            isPass(mark);
            if (isPass(mark) == true)
                System.out.println("Pass");
            else
                System.out.println("Fail");

        } else
            System.out.println("Invalid Input");
    }
}
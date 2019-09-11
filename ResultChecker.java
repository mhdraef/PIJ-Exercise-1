package com.bham.pij.exercises.e1c;

import java.util.Scanner;

public class ResultChecker {


    public static String getResult(int[] grades) {

        int total = 0;
        int mean;
        String[] result={"ERROR","FAIL","PASS","MERIT","DISTINCTION"};


        for (int i = 0; i < grades.length-1; i++) {

            if (grades[i] < 0 || grades[i] > 100)
                return result[0];

            else if(grades[i]<40)
                return result[1];

            else
            total += grades[i];
        }
        if(grades[grades.length-1]<0 || grades[grades.length-1]>100)
            return result[0];
        else if(grades[grades.length-1]<40)
            return result[1];

        mean=total/(grades.length-1);

        if(mean<40)
            return result[1];

        else if(mean<50 || grades[grades.length-1]<50)
            return result[2];

        else if(mean<70 || grades[grades.length-1]<70)
            return result[3];

        else
            return result[4];
    }

    public static void main(String[] args) {

        int arraysize = 9;
        Scanner in = new Scanner(System.in);
        int[] marks = new int[arraysize];
        System.out.println("Enter 8 module grades:");
        for (int i = 0; i < arraysize - 1; i++)
            marks[i] = in.nextInt();

            System.out.println("Enter the project mark:");
            marks[arraysize - 1] = in.nextInt();

            String result = getResult(marks);

            System.out.println(result);

    }

}

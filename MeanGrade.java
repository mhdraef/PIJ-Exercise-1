package com.bham.pij.exercises.e1b;

import java.util.Scanner;

public class MeanGrade {

    public static double computeMean (int[] grades){

        double total=0;
        double result;

       for(int i=0;i<grades.length;i++)

           total+=grades[i];

       result=total/grades.length;
       return result;
    }

    public static void main(String[] args) {

      int arraysize=4;

       int[] marks = new int[arraysize];
       
        Scanner in = new Scanner(System.in);

        System.out.println("Enter upto four grades, indicate done by entering an invalid input(number not in the range [0,100]): ");
         
        for(int i=0;i<arraysize;i++) {
            marks[i]=in.nextInt();
            if(marks[i]<0 || marks[i]>100)
                for(;i<arraysize;i++)
                    marks[i]=0;
        }

        double mean = computeMean(marks);

        System.out.println("The mean of the given grades is "+mean);

        }
    }


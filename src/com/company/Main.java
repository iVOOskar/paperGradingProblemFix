package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input the total marks of the paper:");
        double totalMarks = input.nextDouble();

        String again = "n";
        while (!again.contains("y")){
            System.out.println("enter the students mark:");
            double mark = input.nextDouble();
            double markPer = (double) (mark/totalMarks)*100;
            System.out.println(markPer);
            if (markPer < 40){
                System.out.println("grade U");
            }
            if (markPer > 39 && markPer < 50){
                System.out.println("grade E");
            }
            if (markPer > 49 && markPer < 60){
                System.out.println("grade D");
            }
            if (markPer > 59 && markPer < 70){
                System.out.println("grade C");
            }
            if (markPer > 69 && markPer < 80){
                System.out.println("grade B");
            }
            if (markPer > 79){
                System.out.println("grade A");
            }
            System.out.println("do you have another mark (y/n)");
            String again = input.next();


        }


    }
}

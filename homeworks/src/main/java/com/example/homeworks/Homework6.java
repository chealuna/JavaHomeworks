package com.example.homeworks;

public class Homework6 {
    String letterGrade = "A","B","C";
    int numberGrade = 0;
    boolean proceed = true;

    public void gradeCalculator(String letterGrade, int numberGrade){
        if(letterGrade == "A" || letterGrade == "B" || letterGrade == "C"){
            proceed = true;
        }else{
            proceed = false;
            System.out.println("Sorry, a grade of A, B, or C was expected");
        }

        if(numberGrade >= 0 || numberGrade <=100){
            proceed = true;
        }else{
            proceed = false;
            System.out.println("Sorry, a number between 0 and 100 was expected");
        }

        if(proceed = true && letterGrade == "A"){

        }
    }


    public static void main(String[] args){
        System.out.println("A", 86);

    }
}


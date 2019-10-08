package com.example.homeworks;

public class Homework6 {

   /*public static void gradeCalculator(String letterGrade, int numberGrade){
        // if letterGrade is invalid
        if((letterGrade != "A") && (letterGrade != "B") && (letterGrade != "C")){
            System.out.println("Sorry, a grade of A, B, or C was expected");
        }else if((numberGrade < 0) || (numberGrade > 100)){
            System.out.println("Sorry, a number between 0 and 100 was expected");
        }else if(letterGrade.equals("A")){ //if first test was A
            //test numberGrade
            if (numberGrade >= 75){
                System.out.println("You get an A");
            }else{
                System.out.println("You get a B");
            }
        }else if (letterGrade == "B"){
            //B if numberGrade >= 60
            if(numberGrade >= 60){
                System.out.println("you get a B");
            }else{ //C otherwise
                System.out.println("You get a C");
            }
        }else if (letterGrade == "C"){
            //B if >= 85
            if(numberGrade >= 85){
                System.out.println("You get a B");
            }else if ((numberGrade >= 70) && (numberGrade <=84)) { //C if >=70
                System.out.println("You get a C");
            } else{ //else F
                System.out.println("You get an F");
            }
        }
        */


        public static String last3(String str) {
            if(str.length() <= 3){
                System.out.println(str.toUpperCase());
                return str.toUpperCase();
            }else{
                String normalpart = str.substring(0,str.length()-3);
                String uppercasepart = str.substring(str.length()-3).toUpperCase();
                System.out.println(normalpart + uppercasepart);
                return normalpart + uppercasepart;
            }
        }

    public static void main(String[] args){
        //gradeCalculator("A",  65);
        last3("happy");
    }
}


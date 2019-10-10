package com.example.homeworks;

public class Homework7 {

    //QUESTION 1
   /*public static String removeSpaces(String str) {
        String noSpace = (str.replaceAll("\\s",""));
        return str.replaceAll("\\s","");

    }*/

   //QUESTION 2
     /*public static int move(int position, int roll) {
       int newPosition = position + roll * 2;
       return(newPosition);
        //move(3, 6) should equal 15
    }*/

    //QUESTION 3
   public static int[] countPositivesSumNegatives(int[] input) {

        if (input == null || input.length == 0){
            System.out.println("Your array is empty/null");
            return new int[] {};
        }
            int count = 0;
            int sum = 0;

            for(int i : input){
                if (i > 0)  {
                    count = count + 1;
                }

                if (i < 0) {
                    sum = sum + i;
                }
            }
            return new int[] {count , sum};
        }

       // should return [10, -65]

    //QUESTION 4
    /*public static String remove(String str) {
        if(str.length() <=2)
                return str = "";
        if(str.length()>2)
                str = str.substring(1,str.length()-1);
            return (str);
        } */


    public static void main(String[] args){
       int [] question3Results = countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15});
       for(int i : question3Results){
           System.out.println(i);
       }
        //System.out.println(remove("happy"));
        //System.out.println(removeSpaces("hello everyone"));
        //System.out.println(move(4,2));
         }
    }








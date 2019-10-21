package com.example.homeworks;

import java.util.ArrayList;

public class Homework9 {

    //QUESTION 2
    public void removeEvenLength(ArrayList <String> stringList){
        for(int i = 0 ;i < stringList.size(); i++){
            String word=stringList.get(i);
            if(word.length()%2==0){//even
                stringList.remove(word);//if it is even,test from the first word  then continue looping
            }
        }

     //QUESTION 3
        public static boolean isUnique(int[] list) {
            for (int i = 0; i < list.length; i++) {
                for (int j = i + 1; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        return false;
                    }
                }
            }
            return true;
        }

        //QUESTION 4
        public static boolean isSorted(double[] array) {
            double pre = array[0];
            for (int i = 1; i < array.length; i++) {
                double current = array[i];
                if (pre >= current) {
                    return false;
                }
                pre = current;
            }
            return true;
        }


        public static void main(String[] args){
        //2
        System.out.println(removeEvenLength(new ArrayList <String>(Arrays.asList("London", "Tokyo", "New York")));
        System.out.println(removeEvenLength(new ArrayList <String>(Arrays.asList("Giza", "Florence", "San Miguel")));
        //3
        System.out.println(isUnique(new int[] {7, 3, -54, 0, 5, 3, -100}));
        System.out.println(isUnique(new int[] {8, 2, 4, -21, 3, 1, 5}));

        System.out.println(isSorted(new double[] {16.1, 12.3, 22.2, 14.4}));
        System.out.println(isSorted(new double[] {28.9,4.6,5.14}));
    }
}

package com.example.homeworks;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.Iterator;

public class Homework9New {

    //QUESTION 1
   /* public static int[] mystery(int[] list) {
        for (int i = 1; i < list.length; i++) {
            list[i] = list[i] + list[i - 1];
        }
        return list;
    }*/

    //QUESTION 2
    public static ArrayList<String> removeEvenLength(ArrayList<String> list){
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            if(iter.next().length() % 2 == 0){
                iter.remove();
            }
        }
        return list;
    }

    //QUESTION 3
    public static boolean isUnique(ArrayList<Integer> num){
        for(int i = 0; i == i++)
    }




    public static void main(String [] args){
        //Q1
        //System.out.println(Arrays.toString(mystery(new int[] {7, 3, 2, 0, 5})));

        //Q2
        System.out.println(removeEvenLength(new ArrayList<>(Arrays.asList("London", "Tokyo", "New York"))));
        System.out.println(removeEvenLength(new ArrayList<>(Arrays.asList("Giza,", "Florence", "San Miguel"))));

        //Q3
        //System.out.println(isUnique(new int[] {7, 3, -54, 0, 5, 3, -100}));
        //System.out.println(isUnique(new int[] {6, 23, -23, 9, 0, 3}));
    }
}

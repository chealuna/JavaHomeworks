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

   /* //QUESTION 2
    public static ArrayList<String> removeEvenLength(ArrayList<String> list){
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            if(iter.next().length() % 2 == 0){
                iter.remove();
            }
        }
        return list;
    } */

    //QUESTION 3
    public static boolean isUnique(ArrayList<Integer> num){
        for(int i = 0; i < num.size(); i = i++) {
          for(int j = 1; j< num.size(); j = j++) {
              if(num.get(i).equals(num.get(j))){
                  return false;
              }
          }
        }
        return true;
    }




    public static void main(String [] args){
        //Q1
        //System.out.println(Arrays.toString(mystery(new int[] {7, 3, 2, 0, 5})));

        //Q2
       // System.out.println(removeEvenLength(new ArrayList<>(Arrays.asList("London", "Tokyo", "New York"))));
        //System.out.println(removeEvenLength(new ArrayList<>(Arrays.asList("Giza,", "Florence", "San Miguel"))));

        //Q3
        //System.out.println(isUnique(new int[] {7, 3, -54, 0, 5, 3, -100}));
        System.out.println(isUnique(new ArrayList<>(Arrays.asList(1,2,3))));
    }
}

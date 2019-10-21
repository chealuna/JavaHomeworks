package com.example.homeworks;

public class Homework8 {

    //QUESTION 1
   /* public static boolean sameFirstLast(int[] nums) {
        if (nums.length > 0 && nums[0] == nums[nums.length-1]){
            return true;
        }else{
            return false;
        }
    } */

   //QUESTION 2
      /* public static int[] plusTwo(int[] a, int[] b) {
           int[] newArray = new int[4];

           newArray[0] = a[0];
           newArray[1] = a[1];
           newArray[2] = b[0];
           newArray[3] = b[1];

           return newArray;

       } */

      //QUESTION 3
     public int[] makePi() {
        int[] piArray = new int[] {3,1,4};

        return piArray;
      }

   //QUESTION 4
  /* public int[] rotateLeft3(int[] nums) {
       int[] newArray = new int[3];

       newArray[0] = nums[1];
       newArray[1] = nums[2];
       newArray[2] = nums[0];

       return newArray;
   }*/



    public static void main(String[] args){
        // System.out.println(sameFirstLast(new int[]{1,2,3}));
        // System.out.println(plusTwo(new int[] {1,2}, new int[] {3,4}));
        System.out.println(makePi(piArray));
        // System.out.println(rotateLeft3(int [1,2,3]));
     }

   }


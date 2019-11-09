package com.example.homeworks;
import java.util.Arrays;

public class Homework10 {

    //QUESTION 1 (need help)
    public static int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i = i + 1) {
            if(max < nums[i]){
                max = nums[i];
            }

            if(min > nums[i]){
                min = nums[i];
            }
        }

        return max - min;
    }

    //QUESTION 2
   public static int[] tenRun(int[] nums) {
        int current;
        int i = 0;

        while(i < nums.length && nums[i] % 10 != 0)
            i++;

        if(i >= nums.length)
            return nums;

        current = nums[i];
        i++;

        while(i < nums.length) {
            if(nums[i] % 10 == 0)
                current = nums[i];
            else
                nums[i] = current;
            i++;
        }

        return nums;
    }

   //QUESTION 3
    public int[] withoutTen(int[] nums) {
       int i = 0;

       while(i < nums.length && nums[i] != 10)
           i++;

       for(int j = i + 1; j < nums.length; j++) {
           if(nums[j] != 10) {
               nums[i] = nums[j];
               nums[j] = 10;
               i++;
           }
       }

       for( ; i < nums.length; i++)
           nums[i] = 0;

       return nums;
   }

//QUESTION 4
    public boolean haveThree(int[] nums) {
        int count = 0;
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 3)
                found = false;
            if (nums[i] == 3 && found == true)
                return false;
            if (nums[i] == 3 && found == false) {
                found = true;
                count++;
            }
        }
        if (count == 3) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        //1
        System.out.println(bigDiff(new int[] {10, 3, 5, 6}));
        System.out.println(bigDiff(new int[] {7, 2, 10, 9}));
        System.out.println(bigDiff(new int[] {2, 10, 7, 2}));

        //2
        System.out.println(Arrays.toString(tenRun(new int[] {2, 10, 3, 4, 20, 5})));
        System.out.println(Arrays.toString(tenRun(new int[] {10, 1, 20, 2})));
        System.out.println(Arrays.toString(tenRun(new int[] {10, 1, 9, 4, 20})));

        //3
       // System.out.println(Arrays.toString);


    }

}

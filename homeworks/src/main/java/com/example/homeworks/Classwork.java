package com.example.homeworks;

public class Classwork {

    //QUESTION 1 (ONLY14)

    /* public static boolean only14(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4)
                return false;
        }
        return true;
    } */


    //QUESTION 2 (SUM28)
    public static boolean sum28(int[] nums) {

        int sum = 0;
        boolean result = false;

        for (int i = 0; i < nums.length; i++){

            if (nums[i] == 2)
                sum += 2;

        }

        if (sum == 8)

            result = true;
        return result;

    }


    public static void main(String[] args){
        //QUESTION 1
//        System.out.println(only14(new int[]{1, 4, 1, 4}));
//        System.out.println(only14(new int[]{1, 4, 2, 4}));
//        System.out.println(only14(new int[]{1, 1}));

        //QUESTION 2
        System.out.println(sum28(new int[]{2, 3, 2, 2, 4, 2}));
        System.out.println(sum28(new int[]{2, 3, 2, 2, 4, 2, 2}));
        System.out.println(sum28(new int[]{1, 2, 3, 4}));
    }
}


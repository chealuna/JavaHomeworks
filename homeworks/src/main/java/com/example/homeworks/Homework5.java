package com.example.homeworks;

public class Homework5 {
    String front22 = "samantha";

    public static boolean or35(int n){
        return (n % 3 == 0) || (n % 5 == 0);
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
       if((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false )){
           return true;
        } else {
           return false;
        }
    }

    public static String front22(String str) {
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }

        String front = str.substring(0, take);
        return front + str + front;
    }

    public static void main(String[] args) {
        System.out.println(or35(56));
        System.out.println(monkeyTrouble(true, true ));
        System.out.println(front22("samantha"));
    }
}

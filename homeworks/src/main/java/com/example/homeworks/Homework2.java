package com.example.homeworks;

public class Homework2 {
    public static void main(String[] args) {
        cdTimer (7, 21, 5, 24);
        cdTimer2 (3, 52, 5, 49);
    }

    public static void cdTimer(int song1Minutes, int song1Seconds, int song2Minutes, int song2Seconds){

        int songMinutes = song1Minutes + song2Minutes;
        int songSeconds = song1Seconds + song2Seconds;

        System.out.println("This is the CD Timer");

        System.out.println("The number of minutes in Song 1: " + song1Minutes);
        System.out.println("The number of seconds in Song 1: " + song1Seconds);
        System.out.println("The number of minutes in Song 2: " + song2Minutes);
        System.out.println("The number of seconds in Song 2: " + song2Seconds);

        System.out.println("The total is " + songMinutes + " minutes and " + songSeconds + " seconds.");
    }

    public static void cdTimer2(int song3Minutes, int song3Seconds, int song4Minutes, int song4Seconds){

        int songMinutes2 = song3Minutes + song4Minutes;
        int songSeconds2 = song3Seconds + song4Seconds;


        System.out.println("This is the CD Timer");

        if(songSeconds2>60){
            songMinutes2 = songMinutes2 + 1;
            songSeconds2 = songSeconds2 -60;
        }

        System.out.println("The number of minutes in Song 3: " + song3Minutes);
        System.out.println("The number of seconds in Song 3: " + song3Seconds);
        System.out.println("The number of minutes in Song 4: " + song4Minutes);
        System.out.println("The number of seconds in Song 4: " + song4Seconds);

        System.out.println("The total is " + songMinutes2 + " minutes and " + songSeconds2 + " seconds.");
    }
}

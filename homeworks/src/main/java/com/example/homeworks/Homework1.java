package com.example.javahomeworks;

public class Homework1 {

    public static void main(String[] args) {
        String name = "Chea";

        String age = "sixteen";

        boolean sameLength = name == age;

        System.out.println("My name is " + name + " and my age is " + age);

        System.out.println("In uppercase, my name is " + name.toUpperCase());

        System.out.println("In lowercase, my name is " + name.toLowerCase());

        System.out.println("My name is " + name.length() + " characters long");

        System.out.println("My age is " + age.length() + " characters long");

       System.out.println("Does my name equal my age? " + sameLength);

        System.out.println("My name is still " + name);

    }
}

package com.company;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {

        // exercise 1
        // Foobar, given a limit number N, count from 1 to N,
        // but print “foo” if N is odd and print “bar” if N is even.
        Scanner sc = new Scanner(System.in);
        int n =0;
        System.out.println("\nEnter N: ");
        try {
            n = Integer.parseInt(sc.next(Pattern.compile("^\\d*$")));
        }
        catch (InputMismatchException e) {
            System.out.println("\nInvalid input.");

        }

        int i = 0;
        while (n > 0){
            i++;
            if (i%2==0){
                System.out.println(i + " foo");
            } else{
                System.out.println(i + " bar");
            }
            n--;
        }

        // exercise 2
        // Given a limit, print all the odd (par) numbers from 0 up to that limit.
        int limit = 0;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("\nEnter limit integer: ");
        try {
            limit = Integer.parseInt(sc2.next(Pattern.compile("^\\d*$")));
        }
        catch (InputMismatchException e) {
            System.out.println("\nInvalid input.");

        }

        i = 0;
        while (limit >= 0){
            if (i%2==0 || i==0){
                System.out.println(i);
            }
            i++;
            limit--;
        }

        // exercise 3
        // Count how many occurrences of a letter are present in a word.
        Scanner sc3 = new Scanner(System.in);
        System.out.println("\nEnter word: ");
        String word ="";
        char letter = 0;
        try {
            word = sc3.next(Pattern.compile("^[^\\s]+"));
        }
        catch (InputMismatchException e) {
            System.out.println("\nInvalid input.");
        }

        Scanner sc4 = new Scanner(System.in);
        System.out.println("\nEnter character to search: ");
        try {
            letter = sc3.next().charAt(0);
        }
        catch (InputMismatchException e) {
            System.out.println("\nInvalid input.");
        }
        System.out.println("\nOcurrences: " + countOcurrences(word, letter, 0));

        // exercise 4
        // Given an array of positive ints, return the largest (max)
        Scanner sc5 = new Scanner(System.in);
        int lenght = 0;
        Random rd = new Random();
        System.out.println("\nEnter desired lenght for array of random integers: ");
        try {
            lenght = Integer.parseInt(sc5.next(Pattern.compile("^\\d*$")));
        }
        catch (InputMismatchException e) {
            System.out.println("\nInvalid input.");
        }
        int[] array = new int[lenght];
        for (int k = 0; k < array.length; k++) {
            array[k] = rd.nextInt();
        }
        System.out.println("\nArray: " + Arrays.toString(array));
        System.out.println("\nMax: " + Arrays.stream(array).max().getAsInt());
        System.out.println("\nMin: " + Arrays.stream(array).min().getAsInt());

        // exercise 5
        // Array Replacer, given an int array, a X number and Y replacer,
        // write a function that replaces X with Y and returns the new array.
        Scanner sc6 = new Scanner(System.in);
        System.out.println("\nEnter desired lenght for array of random integers: ");
        try {
            lenght = Integer.parseInt(sc6.next(Pattern.compile("^\\d*$")));
        }
        catch (InputMismatchException e) {
            System.out.println("\nInvalid input.");
        }
        int[] original = new int[lenght];
        for (int l = 0; l < original.length; l++) {
            original[l] = rd.nextInt();
        }
        System.out.println("\nArray: " + Arrays.toString(original));

        Scanner sc7 = new Scanner(System.in);
        int oldInt = 0;
        System.out.println("\nEnter integer to be replaced: ");
        try {
            oldInt = Integer.parseInt(sc7.next(Pattern.compile("^\\d*$")));
        }
        catch (InputMismatchException e) {
            System.out.println("\nInvalid input.");
        }
        Scanner sc8 = new Scanner(System.in);
        int newInt = 0;
        System.out.println("\nEnter new integer: ");
        try {
            newInt = Integer.parseInt(sc8.next(Pattern.compile("^\\d*$")));
        }
        catch (InputMismatchException e) {
            System.out.println("\nInvalid input.");
        }
        System.out.println("\nOld array: " + Arrays.toString(original));
        System.out.println("\nNew array: " + Arrays.toString(replacer(original, oldInt, newInt)));

        // exercise 6
        // Receive three strings and print the concatenation of them.
        String[] strings = new String[3];
        Scanner sc9 = new Scanner(System.in);
        for (int o =1; o<4; o++){
            System.out.println("\nEnter string " + o + ":");
            strings[o-1] = sc9.nextLine();
        }
        System.out.println("\nConcatenation: ");
        for (int o =0; o<3; o++){
            System.out.print(strings[o]);
        }

        // exercise 7
        // Write a Class “username”, that contains the following
        // Public fields: username, fullname, email, age, password. It can have many constructors.

        // exercise 8
        // From the previous exercise write a public method changePassword(String newpassword),
        // that will change the user’s current password for the new password.

        // exercise 9
        // From exercise #7 create a public method printFullName() that will print out
        // pretty the Full Name of the username.

        // exercise 10
        // From class animal, extend dog and cat.

    }



    public static int countOcurrences(String string, char letter, int index){
        int count = 0;
        if (index >= string.length()){
            return 0;
        }

        if(string.charAt(index)==letter){
            count++;
        }

        return count + countOcurrences(string, letter, index+1);
    }

    public static int[] replacer(int[] original, int oldInt, int newInt){
        int[] replaced = original;
        if(Arrays.stream(original).anyMatch(i -> i == oldInt)){
            int m = 0;
            for(int i=0; i<original.length; i++){
                if(original[i]==oldInt){
                    m=i;
                    break;
                }
            }
            replaced[m] = newInt;
        }
        return replaced;
    }
}

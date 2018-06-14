package Chapter6;

import java.io.*;
//import java.io.*; imports all the classes that are defined in java.io package to your file. This enables your java program to use those classes and their methods to achieve some task.

import java.util.*;
//The util package or java provides many utility interfaces and classes for easy manipulation of in-memory data.
//HashMap is a Map based collection class that is used for storing Key & value pairs,
// it is denoted as HashMap<Key, Value> or HashMap<K, V>. ... You must need to import java.util.HashMap or
// its super class in order to use the HashMap class and methods.

class AdvancedDiceExercise {

    static HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

    static void countFreq(int a[], int n) {
        // Insert elements and their
        // frequencies in hash map.
        for (int i = 0; i < n; i++)
            if (hm.containsKey(a[i]))
                hm.put(a[i], hm.get(a[i]) + 1);
            else hm.put(a[i], 1);
    }

    // Return frequency of x (Assumes that
    // countFreq() is called before)
    static int query(int x) {
        if (hm.containsKey(x))
            return hm.get(x);
        return 0;
    }

    // Driver program
    public static void main(String[] args) {
        int[] random3 = new int[5];
        for (int i = 0; i < random3.length; i++) {
            random3[i] = (int) ((Math.random() * 6) + 1);

        }
        //int[] a = {random3[0], random3[1], random3[2], random3[3], random3[4]};
        int[] a = {1, 2, 2,2,1};//Test Data
        //int[] a={2,3,4,5,6};Test Data
        System.out.println(Arrays.toString(a));
        int n = a.length;
        countFreq(a, n);
        if ((query(1) == 3 || query(2) == 3 || query(3) == 3 || query(4) == 3 || query(5) == 3 || query(6) == 3)&&
                (query(1) == 2 || query(2) == 2 || query(3) == 2 || query(4) == 2 || query(5) == 2 || query(6) == 2)){

            System.out.println("full-house");
        }

        else if (query(1) == 3 || query(2) == 3 || query(3) == 3 || query(4) == 3 || query(5) == 3 || query(6) == 3) {
            System.out.println("Yahtzee!");

        } else if (query(1) == 2 || query(2) == 2 || query(3) == 2 || query(4) == 2 || query(5) == 2 || query(6) == 2) {
            System.out.println("you get a pair");
        } else if (a[0] + 1 == a[0 + 1] && a[0] + 2 == a[2] && a[2] + 1 == a[3] && a[3] + 1 == a[4]) {
            System.out.println("Straight!");
        }
        else {

            System.out.println("You lose");
        }
        int sum = 0;
        for (int dicevalue : a) sum += dicevalue;
        System.out.println("Sum of the five dice values is" + ":" + sum);
    }
}


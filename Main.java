package com.company;


import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String args[]) {
        int[] firstArray = getRandomArray(15);
        System.out.println(Arrays.toString(firstArray));
    }

    private static int[] getRandomArray(int len){
        Random myRandom = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++){
            newInt[i] = myRandom.nextInt(101);
        }
        return newInt;
    }




}


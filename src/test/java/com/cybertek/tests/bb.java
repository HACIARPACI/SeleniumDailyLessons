package com.cybertek.tests;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class bb {

    public static void main(String[] args) {

        int[]array={1,1,2,2,3,3,4,4,5,5};
        int[]newArray= new int[array.length];
        for (int i = array.length-1,j=0; i >=0; i--,j++) {
            newArray[j]=array[i];
        }
        System.out.println(Arrays.toString(newArray));

    }
    }

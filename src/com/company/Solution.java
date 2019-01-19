package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {


        Integer min = arr[0];
        Integer max = arr[0];
        Long sum = 0L;

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
            sum += i;
        }

        System.out.println((sum - max) + " " + (sum - min));
    }


    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0]=769082435;
        arr[1]=210437958;
        arr[2]=673982045;
        arr[3]=375809214;
        arr[4]=380564127;

//        for (int i = 0; i < 5; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr[i] = arrItem;
//        }

        miniMaxSum(arr);
    }
}

// problem link
// https://www.hackerrank.com/challenges/insertionsort1/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
        int num = arr[n-1];
        int flag = 0;
        for(int i = arr.length - 1; i >= 1; i--){
            if(arr[i-1] > num) arr[i] = arr[i-1];
            else {arr[i] = num; flag = 1;}
            for(int j : arr) {
                System.out.print(j + " ");
            }
            
            if(flag == 1) break;
            System.out.println();
        }
        if(arr[0]>num){
            arr[0] = num;
            for(int j : arr) {
                System.out.print(j + " ");
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort1(n, arr);

        scanner.close();
    }
}

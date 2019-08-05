// problem link
// https://www.hackerrank.com/challenges/insertionsort2/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the insertionSort2 function below.
    static void insertionSort2(int n, int[] arr) {
        for(int p = 1; p < n; p++){
            int temp = arr[p];
            int i = p;
            while(i > 0 && arr[i-1] > temp){
                arr[i] = arr[i-1];
                i--;
            }
            arr[i] = temp;
            for(int j : arr){
                System.out.print(j + " ");
            }
            System.out.println();
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

        insertionSort2(n, arr);

        scanner.close();
    }
}

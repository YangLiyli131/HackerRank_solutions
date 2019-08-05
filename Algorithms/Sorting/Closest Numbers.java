// problem link
// https://www.hackerrank.com/challenges/closest-numbers/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
        List<Integer> L = new ArrayList<>();
        Arrays.sort(arr);
        for(int i : arr) System.out.println(i);
        int min_val = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length-1; i++){
            int d = arr[i+1] - arr[i];
            if(d < min_val){
                min_val = d;
                L.clear();
                L.add(arr[i]);
                L.add(arr[i+1]);
            }else if(d == min_val){
                L.add(arr[i]);
                L.add(arr[i+1]);
            }else{
                continue;
            }
        }
        int[] res = new int[L.size()];
        for(int i = 0; i < L.size(); i++){
            res[i] = L.get(i);
        }
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = closestNumbers(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

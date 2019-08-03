// problem link
// https://www.hackerrank.com/challenges/largest-rectangle/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the largestRectangle function below.
    static long largestRectangle(int[] h) {
        int[] nh = new int[h.length+1];
        for(int i = 0; i < h.length; i++) nh[i] = h[i];
        nh[nh.length-1] = 0;
        int res = 0;
        Stack<Integer> st = new Stack<>();
        int hei, w;
        for(int i = 0; i < nh.length; i++){
            if(st.isEmpty() || nh[st.peek()] < nh[i]) st.push(i);
            else{
                while(!st.isEmpty() && nh[st.peek()] >= nh[i]){
                    hei = nh[st.pop()];
                    w = st.isEmpty()? i : i - (st.peek() + 1);
                    res = Math.max(res, hei * w);
                }
                st.push(i);
            }
        }
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] h = new int[n];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        long result = largestRectangle(h);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

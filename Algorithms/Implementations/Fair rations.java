// problem link
// https://www.hackerrank.com/challenges/fair-rations/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the fairRations function below.
    static int fairRations(int[] B) {
        int s = 0;
        int res = 0;
        for(int i : B) s += i;
        if(s % 2 == 1){
            System.out.println("NO");
            return -1;
        }else{
            for(int i = 0; i < B.length; i++){
                if(B[i] % 2 == 1){
                    B[i] = B[i] + 1;
                    B[i+1] = B[i+1] + 1;
                    res += 2;
                }
            }
        }
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] B = new int[N];

        String[] BItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < N; i++) {
            int BItem = Integer.parseInt(BItems[i]);
            B[i] = BItem;
        }

        int result = fairRations(B);

        if(result==-1) bufferedWriter.write("NO"); 
        else bufferedWriter.write(String.valueOf(result));

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

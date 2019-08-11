// problem link
// https://www.hackerrank.com/challenges/the-love-letter-mystery/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the theLoveLetterMystery function below.
    static int theLoveLetterMystery(String s) {
        if(s == null || s.length() == 0) return 0;
        int len = s.length();
        int left = 0;
        int right = 0;
        int res = 0;
        for(int i = 0, j = len-1; i < j; i++, j--){
            left = s.charAt(i) - 'a';
            right = s.charAt(j) - 'a';
            res += Math.abs(left - right);
        }
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = theLoveLetterMystery(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

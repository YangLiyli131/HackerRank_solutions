// link
// https://www.hackerrank.com/challenges/is-fibo/problem

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static String solve(long n) {
        double nn = n;
        double t = 5 * nn * nn + 4;
        double tt = 5 * nn * nn - 4;
        double a = Math.sqrt(t);
        double b = Math.sqrt(tt);

        if(a == Math.floor(a)) return "IsFibo";
        else if(b == Math.floor(b)) return "IsFibo";
        else return "IsNotFibo";
    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String result = solve(n);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

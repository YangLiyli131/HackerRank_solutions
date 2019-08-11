// problem link
// https://www.hackerrank.com/challenges/funny-string/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the funnyString function below.
    static String funnyString(String s) {
        int[] diff = new int[s.length()-1];
        for(int i = 0; i < s.length() - 1; i++){
            diff[i] = Math.abs(s.charAt(i+1) - s.charAt(i));
        }
        //for(int i : diff) System.out.println(i);
        for(int a = 0, b = diff.length - 1; a < b; a++, b--){
            if(diff[a] != diff[b]) return "Not Funny";
        }
        return "Funny";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

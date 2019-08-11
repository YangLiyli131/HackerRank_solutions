// problem link
// https://www.hackerrank.com/challenges/palindrome-index/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the palindromeIndex function below.
    static int palindromeIndex(String s) {
        if(isP(s)) return -1;
        int removed = -1;
        for(int i = 0, j = s.length()-1; i < j; i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                String a = s.substring(0,i) + s.substring(i+1,s.length());
                String b = s.substring(0,j) + s.substring(j+1, s.length());
                if(isP(a)) return i;
                else if(isP(b)) return j;
            }
        }
        return removed;
    }
    static boolean isP(String s){
        for(int a = 0, b = s.length()-1; a < b; a++,b--){
            if(s.charAt(a) != s.charAt(b)) return false;
        }
        return true;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = palindromeIndex(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

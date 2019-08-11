// problem link
// https://www.hackerrank.com/challenges/gem-stones/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gemstones function below.
    static int gemstones(String[] arr) {
        // find the common characters in all strings
        HashSet<Character> hs = new HashSet<>();
        String s1 = arr[0];
        for(char a : s1.toCharArray()) hs.add(a);
        for(int i = 1; i < arr.length; i++){
            HashSet<Character> newH = new HashSet<>();
            for(char ch : hs){
                if(arr[i].indexOf(ch) != -1) newH.add(ch);
            }
            hs = newH;
        }
        return hs.size();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String arrItem = scanner.nextLine();
            arr[i] = arrItem;
        }

        int result = gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

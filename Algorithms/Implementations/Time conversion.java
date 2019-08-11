// problem link
// https://www.hackerrank.com/challenges/time-conversion/problem

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        // check if AM or PM
        String ampm = s.substring(8,10);
        String hh = s.substring(0,2);
        String mm = s.substring(3,5);
        String ss = s.substring(6,8);
        if(ampm.equals("AM")){
            if(hh.equals("12") && mm.equals("00") && ss.equals("00")){
                return "00:00:00";
            }else if(hh.equals("12")){
                return "00:" + mm + ":" + ss;
            }else{
                return s.substring(0,8);
            }
        }
        if(ampm.equals("PM")){
            if(hh.equals("12") && mm.equals("00") && ss.equals("00")){
                return "12:00:00";
            }else{
                if(Integer.parseInt(hh) == 12){
                    return "12" + ":" + mm + ":" + ss;
                }else{
                    return String.valueOf(Integer.parseInt(hh) + 12) + ":" + mm + ":" + ss;
                }
            }
        }
        return ampm;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}

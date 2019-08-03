// problem link
// https://www.hackerrank.com/challenges/simple-text-editor/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        // stack to store the resulted string from last action
        Stack<String> st = new Stack<>();
        // StringBuilder to record current string content
        StringBuilder sb = new StringBuilder();
        int k, seq;

        for(int i = 0; i < Q; i++){
            seq = Integer.parseInt(sc.next());
            if(seq == 1){
                st.push(sb.toString());
                sb.append(sc.next());
            }else if(seq == 2){
                st.push(sb.toString());
                k = sc.nextInt();
                sb.delete(sb.length() - k, sb.length());
            }else if(seq == 3){
                System.out.println(sb.charAt(sc.nextInt()-1));
            }else{
                sb.delete(0,sb.length());
                sb.append(st.pop());
            }
        }
    }
}


// the code below used another approach but encounters runtime error for certain test cases


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        // stack to store previous strings
        Stack<String> st = new Stack<>();
        // empty string to store the content of previous action
        String pre_str = "";
        String total = "";
        int k = -1;
        for(int i = 0; i < Q; i++){
            int seq = sc.nextInt();
            if(seq == 1){
                String append_s = sc.next();
                total = total + append_s;
                pre_str = append_s;
                // add "+" in front of the string to show this string is added
                st.push("+" + append_s);
            }else if(seq == 2){
                k = sc.nextInt();
                String removed_s = total.substring(total.length() - k, total.length());
                pre_str = removed_s;
                if(k == total.length()){
                    total = "";
                }else{
                    total = total.substring(0, total.length() - k);
                }
                // add "-" in front of the string to show this string is removed
                st.push("-" + removed_s);
            }else if(seq == 3){
                k = sc.nextInt();
                if((k-1) < total.length()) System.out.println(total.charAt(k-1));
            }else{
                String aa = st.pop();
                char c = aa.charAt(0);
                String acted = aa.substring(1,aa.length());
                if(c == '+'){
                    if(acted.length() == total.length()) total = "";
                    else{
                        int id = total.indexOf(acted);
                    //System.out.println("kk " + id);
                        total = total.substring(0,id);
                    }
                    // previously appended
                    //System.out.println("kk " + acted);
                    
                }else{
                    // previously deleted
                    total = total + acted;
                }
            }
        }
        //System.out.println(total);
    }
}


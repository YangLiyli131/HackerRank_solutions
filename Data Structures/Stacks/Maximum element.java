// problem link
// https://www.hackerrank.com/challenges/maximum-element/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> maxst = new Stack<>();
        maxst.push(Integer.MIN_VALUE);
        Stack<Integer> st = new Stack<>();
        while(n > 0){
            int seq = sc.nextInt();
            switch(seq){
                case 1: 
                    int ne = sc.nextInt();
                    st.push(ne);
                    int maxsofar = maxst.peek();
                    if(ne > maxsofar) maxst.push(ne);
                    else maxst.push(maxsofar);
                    break;
                case 2:
                    st.pop();
                    maxst.pop();
                    break;
                case 3:
                    System.out.println(maxst.peek());
                    break;
            }
            n--;
        }
    }
}


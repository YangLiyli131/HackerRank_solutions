// problem link
// https://www.hackerrank.com/challenges/poisonous-plants/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
        static Stack<Integer> aStack = new Stack<Integer>();
    static Stack<Integer> bStack = new Stack<Integer>();
    // Complete the poisonousPlants function below.
    static int poisonousPlants(int[] p) {
int objectsRemoved=-1;

for(int i : p){
            aStack.push(i);

        }


        int countLoops=0;

        while(objectsRemoved!=0) {

            objectsRemoved=0;

            int prevValue=0;
            int curValue=0;

            while(!aStack.isEmpty()) {

                curValue = (int)aStack.pop();

                   if(!aStack.isEmpty()){
                        int tempValue = (int)aStack.pop();
                        if(curValue<=tempValue){
                            bStack.push(curValue);
                        }
                        else{
                            objectsRemoved++;
                            //System.out.println("Removed " + curValue);
                        }
                        aStack.push(tempValue);
                   }
                   else{
                       bStack.push(curValue);
                   }

            }


            while(!bStack.isEmpty()) {
                aStack.push(bStack.pop());
            }

         if(objectsRemoved!=0){
             countLoops++;
         }

        }

        return countLoops;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int result = poisonousPlants(p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

// https://practice.geeksforgeeks.org/problems/minimum-platforms/0/?ref=self
package com.pandano1.learn;

import java.util.*;
import java.lang.*;
import java.io.*;

class TrainPlatformMax {

    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        int testCases=in.nextInt();
        while(testCases>0)
        {
            int arraySize=in.nextInt();
            int[] tArrive=new int[arraySize];
            int[] tDepart=new int[arraySize];
            for(int i=0;i<arraySize;i++) {
                int a = in.nextInt();
                tArrive[i] = a;
            }

            for(int i=0;i<arraySize;i++){
                int a =  in.nextInt();
                tDepart[i]=a;
                if(tDepart[i] < tArrive[i] ){
                    tDepart[i] += 2400;
                }
            }

            int[] store = new int[10000];


            for(int i=0; i<arraySize; i++){
                store[tArrive[i]] += 1;
                if(tArrive[i] == tDepart[i]){
                    store[tDepart[i] + 1 ] += -1;
                }else{
                    store[tDepart[i]] += -1;
                }
            }
            int max = store[0], sum=store[0];
            for(int i=1; i< 10000; i++){
                sum += store[i];
                if(sum > max) {max = sum;
//                System.out.println(i);
                }
            }
            System.out.println(max);
            testCases--;
        }
    }
}
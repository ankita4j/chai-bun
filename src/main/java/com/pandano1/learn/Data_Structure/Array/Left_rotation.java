//https://www.hackerrank.com/challenges/array-left-rotation/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] leftRotation(int[] a, int d) {
        // Complete this function
        int[] result=new int[a.length];
        int j=0;
        if(d<=0)
            return a;
        else
        {
            for(int i=d;i<a.length;i++)
            {
                result[j]=a[i];
                j++;
            }
            for(int i=0;i<d;i++)
            {
                result[j]=a[i];
                j++;
            }
        }
        return result;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}

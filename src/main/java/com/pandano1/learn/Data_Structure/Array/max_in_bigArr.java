//https://www.hackerrank.com/challenges/crush/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] arr=new long[n+1];
        Long sum=0l;
        Long max=0l;
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            arr[a]+=k;
            if(b+1<=n)
                arr[b+1]-=k;
        }
        for(int i=1;i<=n;i++)
        {
            sum+=arr[i];
            if(max<sum)
                max=sum;
        }
        System.out.println(max);
        in.close();
    }
}

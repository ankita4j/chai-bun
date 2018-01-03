//https://www.hackerrank.com/challenges/2d-array/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int[][] arr=new int[6][6];
        int max=0,sum=0,c=0;
        for(int i=0;i<6;i++)
            for(int j=0;j<6;j++)
                arr[i][j]=in.nextInt();
        for(int i=0;i<4;i++)
            {
            for(int j=0;j<4;j++)
                {
                    sum=0;
                    sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                    if(c==0)
                        max=sum;
                    if(sum>max)
                        max=sum;
                    c=1;
                }
            }
        System.out.println(max);
    }
}
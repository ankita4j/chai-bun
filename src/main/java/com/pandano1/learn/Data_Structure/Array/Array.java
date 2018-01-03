//https://www.hackerrank.com/challenges/arrays-ds/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        int[] arr=new int[len];
        int temp,k=0;
        for(int i=0;i<len;i++)
            {
                arr[i]=in.nextInt();
            }
        for(int i=0,j=len-1;i<j;i++,j--)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]);
            if(i!=len-1)
                System.out.print(" ");
        }
    }
}
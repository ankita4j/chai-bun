//https://www.hackerrank.com/challenges/sparse-arrays/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int nstring=in.nextInt();
        int i=0,j=0,counter=0;
        String[] arr=new String[nstring];
        for(i=0;i<nstring;i++)
            arr[i]=in.next();
        int qstring=in.nextInt();
        for(i=0;i<qstring;i++)
        {
            counter=0;
            String s=in.next();
                for(j=0;j<nstring;j++)
                    if(s.equals(arr[j]))
                        counter++;
            System.out.println(counter);
        }
    }
}
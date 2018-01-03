//https://www.hackerrank.com/challenges/dynamic-array/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int i,lastAnswer=0,q,x,y,seq,index;
        List<List<Integer>> s=new ArrayList<List<Integer>>();
        for(i=0;i<a;i++)
        {
            List<Integer> list=new ArrayList<Integer>();
            s.add(list);
        }
        int n=in.nextInt();
        for(i=0;i<n;i++)
        {
            q=in.nextInt();
            x=in.nextInt();
            y=in.nextInt();
            if(q==1)
            {
                seq=(x^lastAnswer)%a;
                s.get(seq).add(y);
            }
            
            else{
                seq=(x^lastAnswer)%a;
                index=y%(s.get(seq).size());
                lastAnswer=(s.get(seq)).get(index);
                System.out.println(lastAnswer);
            }
            
        }
    }
}
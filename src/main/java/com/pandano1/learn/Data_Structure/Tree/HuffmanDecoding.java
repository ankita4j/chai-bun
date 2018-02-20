//https://www.hackerrank.com/challenges/tree-huffman-decoding/problem
/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root)
    {
       Node travel=root;
       StringBuilder s=new StringBuilder();
       int len=S.length();
       for(int i=0;i<len;i++)
       {
           if(travel.data==0)
           {
               if(S.charAt(i)=='0')
                   travel=travel.left;
               else if(S.charAt(i)=='1')
                   travel=travel.right;
           }
           if(travel.data!=0)
           {
               s.append(travel.data);
               travel=root;
           }
       }
       System.out.println(s.toString());
       
    }

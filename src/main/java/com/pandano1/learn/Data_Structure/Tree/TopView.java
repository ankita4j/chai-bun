//https://www.hackerrank.com/challenges/tree-top-view/problem
   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   int c=1;
   int k=1;
   int p=1;
   void topView(Node root) {
     if(root==null)
         return;
     if(k!=0)
     {
        c++; 
        topView(root.left);
     }
     p++;
     System.out.print(root.data+" ");
       if(p>=c)
       {
           k=0;
           topView(root.right);
       }
    }

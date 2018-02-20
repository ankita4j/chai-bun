//https://www.hackerrank.com/challenges/tree-level-order-traversal/problem
   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */

   void levelOrder(Node root) {
      int height=height(root);
      for(int level=0;level<=height;level++)
        printLevelOrder(root,level+1);
    }
    int height(Node root){
        if(root==null)
            return -1;
        else
            return 1+Math.max(height(root.left),height(root.right));
    }
    void printLevelOrder(Node root,int level)
    {
        if(root==null)
            return;
        if(level==1)
            System.out.print(root.data+" ");
        else if(level>1){
            printLevelOrder(root.left,level-1);
            printLevelOrder(root.right,level-1);
        }
    }

//https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem
 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value) {
        Node r=root;
        Node p=root;
        Node n=new Node();
        n.data=value;
        n.left=null;
        n.right=null;
        if(root==null)
            return n;
        while(root!=null)
        {
            p=root;
            if(root.data>value)
                root=root.left;
            else
                root=root.right;
        }

        if(p.data>value)
            p.left=n;
        else
            p.right=n;
        return r;  
    }



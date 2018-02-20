//https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem

//using HashMap
/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method.
    HashMap<Node,Integer> h=new HashMap<Node,Integer>();
    int i=1;
    while(headA!=null)
    {
       h.put(headA,i);
       headA=headA.next;
    }
    while(headB!=null)
    {
        if(h.containsKey(headB))
            return headB.data;
        headB=headB.next;
    }
    return 0;
}

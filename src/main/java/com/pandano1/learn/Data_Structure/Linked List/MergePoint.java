//https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem

//with out using HahMap

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
    Node currentA=headA;
    Node currentB=headB;
    while(currentA!=currentB)
    {
        if(currentA==null)
            currentA=headB;
        else
            currentA=currentA.next;
        if(currentB==null)
            currentB=headA;
        else
            currentB=currentB.next;
    }
    return currentA.data;
}

//https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem
/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
    Node start=headA;
    Node previous=headA;
    Node temp=headB;
    if(headA==null)
       return headB;
    if(headB==null)
       return headA;
    if(headA.data>headB.data)
    {
        temp=headB.next;
        headB.next=headA;
        start=headB;
        previous=start;
        headB=temp;
    }
    headA=headA.next;
    while(headA!=null)
    {
        if(headA.data>headB.data)
        {
            temp=headB.next;
            headB.next=headA;
            previous.next=headB;
            headB=temp;
        }
        previous=headA;
        headA=headA.next;
    }
  if(headB!=null)
       previous.next=headB;
      
return start;
}

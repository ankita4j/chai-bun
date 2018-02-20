//https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail/problem
/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    Node start=head;
    int c=0,k=1;
    while(start.next!=null)
    {
        c++;
        start=start.next;
    }
    
    if(n==0)
        return start.data;
    while((c-n)!=k)
    {
        head=head.next;
        k++;
    }
    head=head.next;
return head.data;
}

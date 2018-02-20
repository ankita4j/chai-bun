//https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem
/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    Node temp=head;
    Node traverse=head;
    int count=0;
    if(position==0)
    {
        if(head.next==null)
            head=null;
        else
            head=head.next;
    }
        
    if(position>0)
    {
        while(position!=count)
        {
            traverse=temp;
            temp=temp.next;
            count++;
        }
        traverse.next=temp.next;
    }
    return head;
}
//https://www.hackerrank.com/challenges/reverse-a-linked-list/problem
/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    Node nextNode=head;
    Node previousNode=head;
    if(head!=null)
    {
        head=head.next;
        nextNode=head.next;
        previousNode.next=null;
        while(head!=null)
        {
            head.next=previousNode;
            if(nextNode==null)
                break;
            else
            {
                previousNode=head;
                head=nextNode;
                nextNode=head.next;
            }
        }
    }
    return head;
}

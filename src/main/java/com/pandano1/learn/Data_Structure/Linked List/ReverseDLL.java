//https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem
/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
    Node temp=head;
    Node t=head;
    if(head == null);
    else
    {
        while(temp!=null)
        {
            t=temp.next;
            temp.next=temp.prev;
            temp.prev=t;
            head=temp;
            temp=temp.prev;
        }
    }
    return head;
}

//https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem
/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
    Node temp=head;
    Node traverse=head;
    Node newNode=new Node();
    newNode.data=data;
    newNode.next=null;
    if(head==null)
        head.next=newNode;
    else
    {
        while(temp!=null)
        {
            traverse=temp;
            temp=temp.next;
        }
        traverse.next=newNode;
    }
    return head;
}

//https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem
/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node node=new Node();
    node.data=data;
    Node temp=head;
    int count=0;
    Node traverse=temp;
    if(position==0)
    {
        if(head==null)
            node.next=null;
        else
            node.next=head;
        head=node;
    }
    if(position>0)
    {
        while(position!=count)
        {
            traverse=temp;
            temp=temp.next;
            count++;
        }
        node.next=temp;
        traverse.next=node;
    }
    return head;
}

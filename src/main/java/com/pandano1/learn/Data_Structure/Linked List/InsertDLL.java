//https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem
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

Node SortedInsert(Node head,int data) {
    Node n=new Node();
    Node h=head;
    n.data=data;
    int c=0;
    if(head==null)
    {
        n.next=null;
        n.prev=null;
        head=n;
    }
    if(data<h.data && h.next==null)
    {
        n.next=h;
        h.prev=n;
        head=n;
    }
    else
    {
        while(h.next!=null)
        {
            if(data<h.data)
            {
                n.prev=h.prev;
                n.next=h;
                h.prev.next=n;
                h.prev=n;
                c=1;
                break;
            }
            else
            {
                h=h.next;
            }
        }
        if(c==0)
        {
            if(data>h.data)
            {
                n.prev=h;
                h.next=n;
                n.next=null;
            }
            else
            {
                n.prev=h.prev;
                n.next=h;
                h.prev.next=n;
                h.prev=n;
            }
        }
    }
    return head;  
}

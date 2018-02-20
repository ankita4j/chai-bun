//https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list/problem
/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 

    Node start=head;
    head=head.next;
    Node nextN=head.next;
    while(nextN!=null)
    {
        while(head.data==nextN.data && nextN!=null)
        {
            if(nextN.next!=null)
            {
                nextN=nextN.next;
                head.next=nextN;
            }   
            else
            { 
                head.next=null;
                nextN=nextN.next;
                break;
            } 
        }
       if(nextN!=null)
        {
            head=head.next;
            nextN=nextN.next;
        }
    }
   return start; 
}

//https://www.hackerrank.com/challenges/compare-two-linked-lists/problem
/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    int result=0;
    while(headA!=null && headB!=null)
    {
        if(headA.data==headB.data)
            result=1;
        else
        {
            result=0;
            break;
        }
        headA=headA.next;
        headB=headB.next;
   }
   if(result==1)
   {
       if(headA==null && headB==null)
           result=1;
       else
           result=0;
   }
   return result;
}

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
  
    if ( head == null) 
        return null;
    if (position == 0) {
        return head.next;
    }
    int count = 0;
    Node nB = null;
    Node cur = head;
    while (count < position && cur != null) {
        nB = cur;
        cur = cur.next;
        count++;
    }

    return head;

}

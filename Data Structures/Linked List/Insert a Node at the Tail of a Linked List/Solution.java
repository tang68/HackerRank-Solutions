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
  Node tmp = head;
  while (tmp.next != null) {
      tmp = tmp.next;
  }
  Node node = new Node();
    node.data = data;
   tmp.next = node;
    return head;
}

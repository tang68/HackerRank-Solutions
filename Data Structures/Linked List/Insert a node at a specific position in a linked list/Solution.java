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
   Node n = new Node();
    n.data = data;
    
    if (position == 0) {
        n.next = head;
        return n;
    }
    
    Node cur = head;
    Node nB = null;
    int count = 0;
    while (count < position && cur != null) {
        nB = cur;
        cur = cur.next;
        count++;
    }
    
    nB.next = n;
    n.next = cur;
    return head;
}

/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void top_view(Node root)
{
    if (root == null)
        return;
    
    Stack<Integer> s = new Stack<Integer>();
    Node current = root;
    s.push(current.data);
    while (current.left != null) {   
      current = current.left;
      s.push(current.data);
    }
    while (s.size() != 0) {
        System.out.print(s.pop() + " ");
    }
    
    Queue<Integer> q = new LinkedList<Integer>();
    
    Node n = root.right;
    q.add(n.data);
    while (n.right != null) {
        n = n.right;
        q.add(n.data);
    }
    
    while (q.peek() != null) {
         System.out.print(q.remove() + " ");
    }

    
    
}

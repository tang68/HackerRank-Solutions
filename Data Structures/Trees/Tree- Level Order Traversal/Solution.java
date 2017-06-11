/* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
    {
       Queue<Node> q = new LinkedList<>();
       q.add(root);
     
       while (q.peek() != null) {
           Node tmp = q.remove();
           System.out.print(tmp.data + " ");
          if (tmp.left != null) {
              q.add(tmp.left);
          }
           
           if (tmp.right != null ) {
               q.add(tmp.right);
           }
           
       }
      
    }

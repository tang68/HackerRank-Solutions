/* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value)
    {
      Node newNode = new Node();
      newNode.data = value;
      Node before = null;
      Node current = root;
      while (current != null) {
          before = current;
          if (value < current.data ) {
              current = current.left;
          }
          else
              current = current.right;
      }
       
        if (before == null) {        
            return newNode;
        }
        else {
            if(value < before.data) {
            before.left = newNode;
        }
    
        else {
            before.right = newNode;
        }
        }
        
        return root;
        
    }


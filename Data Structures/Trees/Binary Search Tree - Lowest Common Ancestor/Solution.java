/* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node lca(Node root,int v1,int v2)
    {
       if (root == null)
           return null;
    
        if (root.data == v1 || root.data == v2)
           return root;
        
        Node leftLCA = lca(root.left, v1, v2);
        Node rightLCA = lca (root.right, v1, v2);
    
        if (leftLCA != null && rightLCA != null) {
            return root;
        }
    
        return (leftLCA != null) ? leftLCA : rightLCA;
    }



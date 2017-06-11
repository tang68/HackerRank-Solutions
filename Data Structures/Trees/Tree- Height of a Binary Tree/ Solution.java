	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
    
        int tmp = -1;
        if (root != null) {
            tmp = 1 + Math.max(height(root.left), height(root.right));
        }
      
        return tmp ;
    }

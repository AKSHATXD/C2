package Tree;


public class BinaryTree {
	Node root;
	public Tree.BinaryTreeToDoublyLL.Node head;
	 
    BinaryTree() { root = null; }
    
   static class Node {
	    int key;
	    Node left, right;
	 
     Node(int item)
	    {
	        key = item;
	        left = right = null;
	    }
	}

	public static void preOrder(Node root) {
		if(root == null) { 
			//System.out.println(" ");
			return ;}
		System.out.print(root.key+ " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void inOrder(Node root) {
		if(root == null) {
			return ;}
		
		inOrder(root.left);
		System.out.print(root.key+ " ");
		inOrder(root.right);
	}
	
	public static void postOrder(Node root) {
		if(root == null) {
			return ;}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.key+ " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        preOrder(tree.root);
        System.out.println("");
        inOrder(tree.root);
        System.out.println("");
        postOrder(tree.root);

	}

}

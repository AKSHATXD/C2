package Tree;

import Tree.BinaryTree.Node;

public class HeightofBT {
	static class Node {
	    int key;
	    Node left, right;
	 
     Node(int item)
	    {
	        key = item;
	        left = right = null;
	    }
	}
	static int Height(Node root) {
		if(root.left == null && root.right == null) return 0;
		return 1+ Math.max(Height(root.left), Height(root.right));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(Height(root));

	}

}

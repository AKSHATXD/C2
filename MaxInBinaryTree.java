package Tree;

import Tree.SizeBinaryTree.Node;

public class MaxInBinaryTree {

	static class Node {
	    int key;
	    Node left, right;
	 
     Node(int item)
	    {
	        key = item;
	        left = right = null;
	    }
	}
	static int getMax(Node root) {
		if(root == null) return 0;
		else return Math.max(root.key, Math.max(getMax(root.left), getMax(root.right)));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(455);
        root.left.right = new Node(5);
        root.right.left = new Node(80);
        System.out.println(getMax(root));
	}

}

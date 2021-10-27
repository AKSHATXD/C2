package Tree;

import Tree.LOTLineByLine2.Node;

public class SizeBinaryTree {

	static class Node {
	    int key;
	    Node left, right;
	 
     Node(int item)
	    {
	        key = item;
	        left = right = null;
	    }
	}
	static int getSize(Node root) {
		if(root == null) return 0;
		else return 1 + getSize(root.left) + getSize(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(8);
        System.out.println(getSize(root));

	}

}

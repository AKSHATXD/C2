package Tree;

import Tree.HeightofBT.Node;

public class CheckForBalance {

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
		if(root == null) return 0;
		if(root.left == null && root.right == null) return 1;
		return 1+ Math.max(Height(root.left), Height(root.right));
	}
	static boolean checkBalance(Node root) {
		if(root == null) return true;
		else { 
			int leftSubTreeHeight = 0,rightSubTreeHeight = 0;
			if(root.left!= null) leftSubTreeHeight = Height(root.left);
			if(root.right!= null) rightSubTreeHeight = Height(root.right);
			int diff = leftSubTreeHeight - rightSubTreeHeight;
			return (Math.abs(diff) <= 1) && checkBalance(root.left) && checkBalance(root.right);
				}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(20);
		root.left = new Node(8);
        //root.right = new Node(12);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        //root.right.left = new Node(12);
        System.out.println(checkBalance(root));

	}

}

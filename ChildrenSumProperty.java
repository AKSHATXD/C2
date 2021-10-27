package Tree;

import Tree.LeftViewBinaryTree.Node;

public class ChildrenSumProperty {
	static class Node {
	    int key;
	    Node left, right;
	 
     Node(int item)
	    {
	        key = item;
	        left = right = null;
	    }
	}
	
	static boolean checkChildrenSum(Node root) {
		if(root == null) return true;
		if(root.left == null && root.right == null) return true;
		else {
			int l,r;
			if(root.left == null) {
				l = 0;
				r = root.right.key;
			}else if(root.right == null){
				r = 0;
				l = root.left.key;
			}else {
			l = root.left.key;
			r = root.right.key;}
			return ((root.key == l + r)&& checkChildrenSum(root.left) && checkChildrenSum(root.right));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(20);
		root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(12);
        System.out.println(checkChildrenSum(root));
	}

}

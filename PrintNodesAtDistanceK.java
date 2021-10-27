package Tree;

import Tree.HeightofBT.Node;

public class PrintNodesAtDistanceK {
	static class Node {
	    int key;
	    Node left, right;
	 
     Node(int item)
	    {
	        key = item;
	        left = right = null;
	    }
	}
	
	static void printNodes(Node root,int k) {
		if(root == null) return;
		if(k ==0) {
		System.out.print(root.key + " ");
		return;
		}
		printNodes(root.left,k-1);
		printNodes(root.right,k-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(8);
        printNodes(root,2);

	}

}

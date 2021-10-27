package Tree;
import java.util.*;
import Tree.MaxInBinaryTree.Node;

public class LeftViewBinaryTree {
	static class Node {
	    int key;
	    Node left, right;
	 
     Node(int item)
	    {
	        key = item;
	        left = right = null;
	    }
	}
	
	static void printLeftView(Node root) {
		if(root == null) return;
		Queue <Node> q = new ArrayDeque();
		q.add(root);
		
		while(!q.isEmpty()) {
			int count = q.size();
			for(int i = 0; i<count;i++) {
				Node p = q.poll();
				if(i ==0) System.out.print(p.key + " ");
				if(p.left!= null) q.add(p.left);
				if(p.right!= null) q.add(p.right);
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(455);
        root.left.right = new Node(5);
        root.right.left = new Node(80);
        printLeftView(root);

	}

}

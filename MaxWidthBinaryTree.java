package Tree;
import java.util.*;
import Tree.HeightofBT.Node;

public class MaxWidthBinaryTree {
	static class Node {
	    int key;
	    Node left, right;
	 
     Node(int item)
	    {
	        key = item;
	        left = right = null;
	    }
	}
	
	static int getMaxWidth(Node root) {
		if(root == null) return 0;
		Queue<Node> q = new ArrayDeque<>();
		q.add(root);
		int width = 0;
		while(q.isEmpty() == false) {
			int count = q.size();
			width = Math.max(width, count);
			for(int i = 0;i < count;i++) {
				Node p = q.poll();
				if(p.left!= null) q.add(p.left);
				if(p.right!= null) q.add(p.right);
			}
		}
		return width;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(20);
		root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(12);
        System.out.println(getMaxWidth(root));
		
	}

}

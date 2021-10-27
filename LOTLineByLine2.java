package Tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;


public class LOTLineByLine2 {

	static class Node {
	    int key;
	    Node left, right;
	 
     Node(int item)
	    {
	        key = item;
	        left = right = null;
	    }
	}
	
	static void levelOrderLineByLine(Node root) {
		if(root== null) return;
		Deque<Node>q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while(q.isEmpty()== false) {
			Node p = q.poll();
			if (p == null) {
		        if (!q.isEmpty()) {
		          q.add(null);
		          System.out.println();
		        }
		      }else {
				if(p.left!= null) q.add(p.left);
				if(p.right!= null) q.add(p.right);
				System.out.print(p.key+" ");
			
		      }
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(8);
        levelOrderLineByLine(root);

	}

}

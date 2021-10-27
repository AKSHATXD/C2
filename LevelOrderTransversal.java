package Tree;

import java.util.ArrayDeque;
import java.util.Deque;

import Tree.PrintNodesAtDistanceK.Node;

public class LevelOrderTransversal {
	static class Node {
	    int key;
	    Node left, right;
	 
     Node(int item)
	    {
	        key = item;
	        left = right = null;
	    }
	}
	
	static void levelOrder(Node root) {
		Deque<Node>q = new ArrayDeque<>();
		q.add(root);
		while(!q.isEmpty()) {
			for(int i = 0;i<q.size();i++)
			{
				Node p = q.poll();
				System.out.print(p.key + " ");
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
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(8);
        levelOrder(root);

	}

}

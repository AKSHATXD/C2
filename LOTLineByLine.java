package Tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

import Tree.LevelOrderTransversal.Node;

public class LOTLineByLine {

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
		
		while(q.isEmpty()== false) {
			int count = q.size();
			for(int i = 0;i<count;i++)
			{
				Node p = q.poll();
				if(p.left!= null) q.add(p.left);
				if(p.right!= null) q.add(p.right);
				System.out.print(p.key+" ");
			}

			System.out.println();
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

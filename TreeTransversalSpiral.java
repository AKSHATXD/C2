package Tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

import Tree.FromTransversals.Node;

public class TreeTransversalSpiral {

	static class Node {
	    int key;
	    Node left, right;
	 
     Node(int item)
	    {
	        key = item;
	        left = right = null;
	    }
	}
	
	static void spiralTransversal(Node root) {
		if(root == null) return;
		Queue<Node>q = new ArrayDeque<>();
		Stack<Node>s = new Stack<>();
		q.add(root);
		boolean flag = false;
		while(q.isEmpty()== false) {
			int count = q.size();
			for(int i =0;i<count;i++) {
				Node p = q.poll();
				if(flag) s.add(p);
				else {
					System.out.print(p.key + " ");
				}
				if(p.left!= null) q.add(p.left);
				if(p.right!= null) q.add(p.right);
			}
			if(flag) {
				while(s.isEmpty()== false) {
					Node p = s.pop();
					System.out.print(p.key + " ");
				}
			}
			flag = !flag;
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
        spiralTransversal(root);

	}

}

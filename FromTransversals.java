package Tree;

import java.util.*;

import Tree.BinaryTree.Node;

public class FromTransversals {
	
	 static class Node {
		    int key;
		    Node left, right;
		 
	     Node(int item)
		    {
		        key = item;
		        left = right = null;
		    }
		}
	 
	 static int preIndex = 0;
	 
	 static Node constructTree(int[] pre, int []in, int is,int ie)
	 {
		 
		 if(is> ie) return null;
		 Node root = new Node(pre[preIndex++]);
		 int inIndex = 0;
		 for(int i =is;i<=ie;i++) {
			 if(in[i] == root.key) {
				 inIndex = i;
				 break;
			 }
		 }
		 root.left = constructTree(pre,in,is,inIndex-1);
		 root.right = constructTree(pre,in,inIndex+1,ie);
		 return root;
	 }
	 
	 public static void preOrder(Node root) {
			if(root == null) { 
				//System.out.println(" ");
				return ;}
			System.out.print(root.key+ " ");
			preOrder(root.left);
			preOrder(root.right);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in [] = {20,10,40,30,50};
		int pre[] = {10,20,30,40,50};
		Node root = constructTree(pre,in,0,4);
		preOrder(root);
	}

}

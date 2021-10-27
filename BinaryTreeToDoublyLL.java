package Tree;

import Tree.MaxWidthBinaryTree.Node;

public class BinaryTreeToDoublyLL {
	
	static class Node {
	    int key;
	    Node left, right;
	 
     Node(int item)
	    {
	        key = item;
	        left = right = null;
	    }
	}
	Node head;
	static Node prev = null;
	void BinaryTree2DoubleLinkedList(Node root)
    {
        // Base case
        if (root == null)
            return;
  
        // Recursively convert left subtree
        BinaryTree2DoubleLinkedList(root.left);
  
        // Now convert this node
        if (prev == null)
            head = root;
        else
        {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
  
        // Finally convert right subtree
        BinaryTree2DoubleLinkedList(root.right);
    }
	
	static void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.key + " ");
            node = node.right;
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
        
        BinaryTree tree = new BinaryTree();
        
        printList(tree.head);

	}

}

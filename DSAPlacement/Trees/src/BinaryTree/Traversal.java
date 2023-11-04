package BinaryTree;

public class Traversal { 
	
	static class Node{
		int value;
		Node left;
		Node right;
		
		Node(int value){
			this.value = value;
			left = right = null;
		}
	}
	
	// Root of tree
	Node root;
	
	Traversal(){
		root = null;
	}
	
	// PreOrder traversal :  Node, left, Right
	public static void preOrder(Node node){
	      if(node == null)return;
	      System.out.print(node.value + "->");
	      preOrder(node.left);
	      preOrder(node.right);
	}
	
	// PostOrder traversal : Left, Right, Node
	public static void postOrder(Node node) {
		if(node == null) return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value + "->");
	}
	
	// InOrder traversal : Left, Node, Right
	public static void inOrder(Node node) {
		if(node == null) return;
		inOrder(node.left);
		System.out.print(node.value + "->");
		inOrder(node.right);
	}
	
	// Height of tree.
	public static int height(Node node) 
    {
        if(node == null){
            return 0;
        }else{
            int leftDepth = height(node.left);
            int rightDepth = height(node.right);
            
            if(leftDepth > rightDepth) return leftDepth + 1;
            else return rightDepth + 1;
        }
    }
	
	public static void main(String[] args) {
		Traversal tree = new Traversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		tree.root.right.left = new Node(11);
		tree.root.right.left = new Node(20);
		
		preOrder(tree.root);
		System.out.println();
		postOrder(tree.root);
		System.out.println();
		inOrder(tree.root);
		
		System.out.println();
		System.out.print("Height of the binary tree is: " + height(tree.root));
	}

}

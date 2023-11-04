package BinaryTree;
public class CalculateHeight {	
	
	static class Node{
		int data;
		
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}

	static class Tree{
		Node root; 
		
		Tree(){
			root = null;
		}
		
		// Height of the tree
		public static int treeHeight(Node node) {
			if(node == null) return 0;
			
			int left = treeHeight(node.left);
			int right = treeHeight(node.right);
			
			if(left>right) return left+1;
			else return right+1;
		}
	}
	
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.root = new Node(4);
		
		tree.root.left = new Node(5);
		tree.root.right = new Node(7);
		
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(10);
		
		System.out.print(tree.treeHeight(tree.root));
	}

}

package BinaryTree;

public class CalculateHeightDepth {
	
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
		
		public static int depth(Node node, int key) {
			if(node == null) return -1;
			
			int distance = -1;
			
			if((node.data == key) || depth(node.left, key)>=0 || depth(node.right, key)>=0) {
				return distance+1;
			}
			
			return distance;
		}
	}

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.root = new Node(5);
		
		tree.root.left = new Node(10);
		tree.root.right = new Node(15);
		
		tree.root.left.left = new Node(20);
		tree.root.left.right = new Node(25);
		
		tree.root.left.right.right = new Node(45);
		
		tree.root.right.left = new Node(30);
		tree.root.right.right = new Node(35);
		
		System.out.print(tree.depth(tree.root, 25));

	}

}

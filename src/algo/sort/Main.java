package algo.sort;


public class Main {

	public static void main(String[] args) {
		
		Tree tree = new Tree();
		Node root = new Node(5);
		
		tree.insert(root , 1);
		tree.insert(root , 2);
		tree.insert(root , 3);
		tree.insert(root , 6);
		tree.insert(root , 7);
		tree.insert(root , 8);
		int internal = tree.countInteralNode(root);
		System.out.println(internal);
		
		
	}
}


package algo.sort;

public class Tree {

	public void insert(Node node, int value) {
		if (value < node.value) {
			if (node.left != null) {
				insert(node.left, value);
			} else {
				System.out.println("  Inserted " + value + " to left of "
						+ node.value);
				node.left = new Node(value);
			}
		} else if (value > node.value) {
			if (node.right != null) {
				insert(node.right, value);
			} else {
				System.out.println("  Inserted " + value + " to right of "
						+ node.value);
				node.right = new Node(value);
			}
		}
	}
	
	public int countInteralNode(Node root) {
		int count = 0;
		if (root != null) {
			if (root.left != null || root.right != null) {
				count += 1 + countInteralNode(root.left)
						+ countInteralNode(root.right);
			}
		}
		return count;
	}

	public void printInOrder(Node node) {

		if (node != null) {
			printInOrder(node.left);
			System.out.println("  Traversed " + node.value);
			printInOrder(node.right);
		}
	}

	/**
	 * uses in-order traversal when the origin is less than the node's value
	 * 
	 * uses reverse-order traversal when the origin is greater than the node's
	 * order
	 */
	public void printFrontToBack(Node node, int camera) {
		if (node == null)
			return;
		if (node.value > camera) {
			// print in order
			printFrontToBack(node.left, camera);
			System.out.println("  Traversed " + node.value);
			printFrontToBack(node.right, camera);
		} else if (node.value < camera) {
			// print reverse order
			printFrontToBack(node.right, camera);
			System.out.println("  Traversed " + node.value);
			printFrontToBack(node.left, camera);
		} else {
			// order doesn't matter
			printFrontToBack(node.left, camera);
			printFrontToBack(node.right, camera);
		}
	}

}

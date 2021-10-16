package question2;

public class Driver {

	public static void main(String g[])
	{
		BinarySearchTree bst=new BinarySearchTree();
		bst.node=new Node(60);
		bst.node.left=new Node(40);
		bst.node.right=new Node(69);
		bst.node.left.left=new Node(15);
		bst.node.left.right=new Node(55);
		bst.node.right.left=new Node(64);
		bst.node.left.left.left=new Node(10);
		bst.node.left.left.right=new Node(25);
		bst.node.right.left.right=new Node(66);
		
		bst.setRootNode(bst.node);

		bst.displayInAscendingOrder();
	}

}

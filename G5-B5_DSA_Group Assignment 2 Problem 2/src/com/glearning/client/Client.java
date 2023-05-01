package com.glearning.client;

import com.glearning.node.Node;
import com.glearning.service.*;

public class Client {

	private Node node;

	public static void main(String[] args) {

		Client tree = new Client();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		Service service = new Service();

		 service.bstToSkewed(tree.node);
		 service.TraverseTree(service.newHead);

	}
}

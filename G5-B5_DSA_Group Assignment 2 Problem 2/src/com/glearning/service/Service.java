package com.glearning.service;

import com.glearning.node.*;

public class Service {

	public Node head;
	public Node newHead=null;
	Node prevNode=null;
	public void bstToSkewed(Node root)
	{
		if(root==null)
			return;
		bstToSkewed(root.left);
		Node r=root.right;
		
		if(newHead==null)
		{
			newHead=root;
			root.left=null;
			prevNode=root;
		}
		else
		{
			prevNode.right=root;
			root.left=null;
			prevNode=root;
		}
		
		bstToSkewed(r);
		
	}
	public void TraverseTree(Node root)
	{
		if(root==null)
			return;
		System.out.print(root.data+" ");
		TraverseTree(root.right);
	}
}


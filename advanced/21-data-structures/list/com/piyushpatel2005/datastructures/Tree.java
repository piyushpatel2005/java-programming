package com.piyushpatel2005.datastructures;

class TreeNode<T extends Comparable<T>> { // it needs to be comparable to arrange binary tree.
  TreeNode<T> leftNode;
  T data;
  TreeNode<T> rightNode;

  public TreeNode(T nodeData) {
    data = nodeData;
    leftNode = rightNode = null;
  }

  public void insert(T insertValue) {
    if(insertValue.compareTo(data) < 0) {  // if insertValue < data, insert on left
      if(leftNode == null)
        leftNode = new TreeNode<T>(insertValue);
      else
        leftNode.insert(insertValue);
    } else if(insertValue.compareTo(data) > 0) {
      if(rightNode == null)
        rightNode = new TreeNode<T>(insertValue);
      else
        rightNode.insert(insertValue);
    }
  }
}


public class Tree<T extends Comparable<T>> {
  private TreeNode<T> root;

  public Tree() {
    this.root = null;
  }

  public void insertNode(T insertValue) {
    if(root == null)
      root = new TreeNode<T>(insertValue);
    else
      root.insert(insertValue);
  }

  public void preorderTraversal() {
    preorderHelper(root);
  }

  private void preorderHelper(TreeNode<T> node) {
    if(node == null)
      return;
    System.out.printf("%s ", node.data);
    preorderHelper(node.leftNode);
    preorderHelper(node.rightNode);
  }

  public void inorderTraversal() {
    inorderHelper(root);
  }

  private void inorderHelper(TreeNode<T> node) {
    if(node == null)
      return;

    inorderHelper(node.leftNode);
    System.out.printf("%s ", node.data);
    inorderHelper(node.rightNode);
  }

  public void postorderTraversal() {
    postorderHelper(root);
  }

  private void postorderHelper(TreeNode<T> node) {
    if(node == null)
      return;
    postorderHelper(node.leftNode);
    postorderHelper(node.rightNode);
    System.out.printf("%s ", node.data);
  }
}

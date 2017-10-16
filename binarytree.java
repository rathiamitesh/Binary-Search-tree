package binarytree;

public class binarytree {
	public static void main(String[] args) {
	
	}

}


class Node{
	int key;
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	double value;
	Node left;
	Node right;	
	public Node(int key,double value){
		this.key=key;
		this.value = value;
		left = null;
		right = null;
	}
}

class Tree
{
	Node root;
	Tree(){
	root=null;	
}
	public double getvalue(int random)
	{
	Node x = root;
	while (x != null)
	{
	if (x.key < random) x = x.left;
	else if (x.key > random) x = x.right;
	else if (x.key == random) return x.value;
	}
	return 0;
	}
	
	public double updatevalue(int random,double value1)
	{
	Node x = root;
	while (x != null)
	{
	if (x.key < random) x = x.left;
	else if (x.key > random) x = x.right;
	else if (x.key == random) 
		{
		x.value=value1;
		};
	}
	return 0;
	}
	
	public void insert(int key1, double value1){
		
		root = insertR(root, key1,value1);
				
	}
	Node insertR(Node root, int key,double value) {
		Node newnode=new Node(key,value);
        if (root == null) {
			root=newnode;
            return root;
        }
 
        if (key < root.key)
            root.left = insertR(root.left, key,value);
        else if (key > root.key)
            root.right = insertR(root.right, key,value);
         return root;
    }
	public void delete(Node root, int key) {
		
		root = deleteNode(root, key);
	}
	
	private Node deleteNode(Node root, int key) {
		
		if(root == null) 
			return root;
		if(key < root.getKey())
			root.left=(deleteNode(root.getLeft(), key)); 
		else if(key > root.getKey())
			root.right=(deleteNode(root.getRight(),key)); 
		else { 
			if(root.left == null && root.right == null)
				return null;
			else if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			else
			{
			int a=root.key;
			while (root.left != null)
	        {
	            a = root.left.key;
	            root = root.left;
	        }
			 root.key=a;
			 root.right=deleteNode(root.right,root.key);
}
		
	}				return root;

}
public static void main(String[] args)
{}}

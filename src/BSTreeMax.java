
public class BSTreeMax {


	class Node{
		private int N;
		private Node left,right;
		
		public Node(int N)
		{
			this.N =N;
			this.left=this.right= null;			
		}
		
	}
	
	public Node insertNode(Node root, int N)
	{
		if(root == null)
		{
			root = new Node(N);
			return root;
		}
		
		if(root.N > N)
			root.left = insertNode(root.left, N);
		else
			root.right = insertNode(root.right, N);
		
		return(root);
	}
	
	public void Traverse(Node root)
	{
		if(root == null)
			return;
		Traverse(root.left);
		System.out.println(root.N);
		Traverse(root.right);
	}
	
	
	public int findMin(Node root,int n)
	{
		if(root == null)
			return -1;
		if(root.N ==  n)
			return n;
		
		if(root.N < n)
		{
			int k = findMin(root.right, n);
			return (k == -1)? root.N :k; 
		}
		else
		{
			return findMin(root.left, n);
		}
			
	}
	
	static Node root;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BSTreeMax b = new BSTreeMax();
		
		root = b.insertNode(root, 50);
		root = b.insertNode(root, 30);
		root = b.insertNode(root, 20);
		root = b.insertNode(root, 40);
		root = b.insertNode(root, 70);
		root = b.insertNode(root, 60);
		root = b.insertNode(root, 80);
		root = b.insertNode(root, 10);
		
		//b.Traverse(root);
		
		
		System.out.println(b.findMin(root, 42));
		

	}

}

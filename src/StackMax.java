
public class StackMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s1 = new Stack();
		//s1.push(1);
		s1.push(1);
		s1.push(2);
		s1.push(3);
		//s1.push(5);
		//s1.push(6);
		
		s1.printStack();
		System.out.println(s1.getMax());
		System.out.println(s1.pop());
		
		//s1.printStack();
		System.out.println(s1.getMax());
		
		System.out.println(s1.pop());
		System.out.println(s1.getMax());
		
		System.out.println(s1.pop());
		
		System.out.println(s1.getMax());
		//s1.printStack();

	}

}

class Stack{
	Node first;
	Integer max =0;
	
	public void push(int n)
	{
		if(first == null)
			{
				max = n;
				first = new Node(n);
				return;
			}
		
		if(n>max)
		{
			int j = n+max;
			max = n;
			n = j;
		}
		
		Node temp = first;
		first = new Node(n);
		first.next = temp;
	}
	
	public int pop()
	{
		
		if(first == null)
			return -1;
		int j = first.n;
		first = first.next;

		
		int m =j;
		if(j>max)
		{
			m=max;
			max=j-max;
		}
		
		if(first == null)
			max=0;
		
		return m;
		
	}
	
	public int getMax()
	{
		return max;
	}
	
	public void printStack()
	{
		Node temp = first;
		System.out.print("Head");
		while(temp!=null)
		{
			System.out.print(" -> "+temp.n);
			temp=temp.next;
		}
		System.out.println();
	}
	
}

class Node{
	int n;
	Node next;
	
	public Node(int n)
	{
		this.n = n;
		next=null;
	}
}

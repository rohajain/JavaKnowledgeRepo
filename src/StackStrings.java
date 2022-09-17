public class StackStrings {
	
	public Node first = null;
	
	private class Node{
		String item;
		Node next;
	}
	
	public void push(String S) {
		
		
		Node oldFirst = first;
		first = new Node();
		first.item =S;
		first.next = oldFirst;
		
	}
	
	public Node pop() {
		
		Node oldfirst = first;
		first = first.next;
		return oldfirst;
		
	}
	
	public void display()
	{
		Node first1 = first;
		while(first1 != null)
		{
			System.out.println(first1.item);
			first1 = first1.next;
		}
	}
	
	public boolean isEmpty()
	{
		return(first == null);
	}

}

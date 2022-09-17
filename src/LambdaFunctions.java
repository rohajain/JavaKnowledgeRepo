
public class LambdaFunctions {

	public LambdaFunctions() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	  Lambda expressions basically express instances of functional interfaces (An interface with single abstract method is called functional interface. An example is java.lang.Runnable). lambda expressions implement the only abstract function and therefore implement functional interfaces
	  lambda expressions are added in Java 8 and provide below functionalities.
	 
	 * Enable to treat functionality as a method argument, or code as data.
	 * A function that can be created without belonging to any class.
	 * A lambda expression can be passed around as if it was an object and executed on demand.

	 */
	
	interface int1
	{
	  int add(int a,int b);		
	}
	
	interface int2
	{
	  void add(int a,int b);		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* NOTE
		 * lambda expressions needs to be assigned to functional interfaces only
		 */
		
		//Method1
		int1 i1 = (x,y)->x+y;
		System.out.println(i1.add(1,4));
		
		//Method2
		int2 i2 = (int x, int y) -> System.out.println(x+y);
		i2.add(3, 4);
		
		

	}

}

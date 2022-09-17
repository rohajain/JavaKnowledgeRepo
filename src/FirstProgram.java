
public class FirstProgram {

	public static void main(String[] args)
		{
			System.out.println("Hello Chitu");
			System.out.println("Hello Chitu");
			System.out.println("Hello Nishu");
			System.out.println("Hello Chitu");
			System.out.println("Hello Chitu");
			Guitar ob1 = new Guitar();
			System.out.println("hello nishu");
			ob1.playGuitar();
			//ob1.sum(23, 56);
			//while(true)
			//{
				
			//	ob1.sum(23, 56);
				
			//}
		}
}

class Guitar {
	public void playGuitar()
	{
		System.out.println("Playing Guitar...");
	}
	public void sum(int a, int b)
	{
		System.out.println(a+b);
	}
}

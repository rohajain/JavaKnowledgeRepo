
abstract class AB1{
	static int i =0;
	protected abstract void display();
	
}

public class AbstractClass extends AB3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass ab1 = new AbstractClass();
		ab1.display();
		
		AB1 ab = new AB1() {
			
			@Override
			protected void display() {
				// TODO Auto-generated method stub
				System.out.println("Hellow Abstract");
				
			}
		};
		ab.display();
	}

	

}


class AB2 extends AB1{
	
	@Override
	protected void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello Dude2");
		
	}
	
}

class AB3 extends AB2{
	

	protected void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello Dude3");
		
	}
}
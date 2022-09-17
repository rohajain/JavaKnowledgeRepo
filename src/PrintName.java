import java.util.*;

public class PrintName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String r1 = "x",name = "Rohan";
		
		r1 = r1.replaceAll("x", "xxx");
		r1 = r1.replaceAll("x", "xxx");
		r1 = r1.replaceAll("x", "xxx");
		
		r1 = r1.replaceAll("x", name+"\n");
		
		System.out.println(r1);
		
		
		/*HashSet<Integer> m3  = new LinkedHashSet<>() {
			{
				add(2);
				add(1);
				
				System.out.println(this);
				
			}
		};*/
		

	}

}

import java.util.*;

public class Sum2Elements {
	
	public static void main(String args[])
	{
		int[] A = {1,2,4,5,53,22,3};
		
		Scanner s = new Scanner(System.in);
		int sum = s.nextInt();
		
		HashSet<Integer> h1 = new HashSet<>();
		boolean flag = false;
		for(int x: A)
		{
			int remainingSum = sum-x;
			if(h1.contains(remainingSum))
			{
				flag =true;
				System.out.println("Elements Present");
				break;
			}
			
			h1.add(x);
		}
		
		if(flag == false)
			System.out.println("Elements not Present");
		
		
		
		s.close();
		
		
	}

}

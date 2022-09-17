
import java.util.*;

public class SumZero {
	
	public static void main(String[] args)
	{
		int A[] = {-1,2,4,-5,6,8};
		int B[] = getZeroArray(A);
		
		for(int x:B)
			System.out.print(x+" ");
		
		List<Integer> l1 = new LinkedList<>();
		l1.add(0, 1);
		l1.add(0, 2);
		
		System.out.println(l1);
	}
	
	static int[] getZeroArray(int[] A)
	{
		HashMap<Integer,Integer> hMap = new HashMap<>();
		int sum =0;
		
		
		for(int i=0;i<A.length;i++)
		{
			Integer oldIndex = hMap.get(sum);
			if(oldIndex == null)
			{
				hMap.put(sum,i);
				sum+=A[i];
			}
			else
			{
				return Arrays.copyOfRange(A, oldIndex,i);
			}
		}
		
		return null;
	}

}

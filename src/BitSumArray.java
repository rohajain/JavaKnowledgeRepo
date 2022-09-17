
public class BitSumArray {

	public static void main(String[] args)
	{
		int[] A = {5,-1,25,-1,35,-1};
		
		int sum = 0;
		
		for(int i=0;i<A.length;i++)
		{
			if(A[i] == -1)
			  {
				int n = getBitEven(A[i-1]);
				System.out.println(n);
				sum+=n;
			  }
			else
				sum+=A[i];
		}
		
		System.out.println(sum);
		
	}
	
	
	
	static int getBitEven(int prev)
	{
		int maxOdd=0,maxEven=0,count =1;
		
		while(prev!=0)
		{
			if((prev & 1) == 1)
			{
				if(count%2 == 0)
					maxEven = count;
				else
					maxOdd = count;
			}
			
			prev= prev>>1;
			count++;
		}
		
		System.out.println(maxEven+" "+maxOdd);
		
		if(maxOdd > maxEven)
			return 1<<(maxOdd);
		else
		{
			return((1<<(maxEven-1))^(1<<(maxOdd)));
		}
	}
	
}

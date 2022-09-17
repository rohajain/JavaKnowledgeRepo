
public class MinCostTickets {

	public MinCostTickets() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] days = {1,4,6,7,8,20};
		int[] costs = {2,7,15};
		
		/*for(int x:days)
			System.out.println(x);
		for(int x:costs)
			System.out.println(x);*/
		
		int minCost = minCostFunc(days,costs);
		System.out.println(minCost);

	}
	
	public static int minCostFunc(int[] days,int[] costs)
	{
		final int n = days.length;
		int min = Integer.MAX_VALUE;
		int[] dp = new int[days[n-1]+1];
		//System.out.println(dp[0]);
		
		for(int i=1,j=0;i<dp.length;i++)
		{
			if(i==days[j])
			{
				
				min = Math.min(dp[i-1]+costs[0], dp[Math.max(i-7, 0)]+costs[1]);
				dp[i] = Math.min(min, dp[Math.max(i-30, 0)]+costs[2]);
				j++;
			}
			else
			{
				dp[i]=dp[i-1];
			}
		}
		return dp[dp.length-1];
	}

}

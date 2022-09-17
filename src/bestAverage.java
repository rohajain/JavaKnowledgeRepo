import java.util.*;
import java.util.Map.Entry;

public class bestAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] input = {{"Bob","81"},
							{"Raj","22"},
							{"Charles","87"},
							{"Raj","100"}};
		
		HashMap<String,ArrayList<Integer>> hMap  = new HashMap<>();
			for(int i=0;i<input.length;i++)
			{
				ArrayList<Integer> a1 = new ArrayList<Integer>();
				if(hMap.containsKey(input[i][0]))
				{
					ArrayList<Integer> a2 = hMap.get(input[i][0]);
					a1.add(a2.get(0) + Integer.parseInt(input[i][1]));
					a1.add(a2.get(1)+1);
					hMap.put(input[i][0], a1);
				}
				else
				{
					a1.add(Integer.parseInt(input[i][1]));
					a1.add(1);
					
					//System.out.println(a1);
					hMap.put(input[i][0], a1);
				}
				
				
					
				
			}
			
		System.out.println(hMap);
			int bestAvg = 0;
			
			for(Entry<String,ArrayList<Integer>> h1:hMap.entrySet())
			{
				int avg = (h1.getValue().get(0))/(h1.getValue().get(1));
				if(avg > bestAvg)
				{
					bestAvg = avg;
				}
				
			}
			
			System.out.println(bestAvg);
							
		}

}

import java.util.*;
import java.util.Map.Entry;

public class HMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,1,1,2,3,3,3,4,7,7,7,5,3,5,6,7,7};
		
		Map<Integer,Integer> hMap = new HashMap<>();
		
		for(int x:arr)
		{
			hMap.compute(x, (key,val) -> (val == null)?1:val+1);
		}
		
		hMap.forEach((key,val)-> System.out.println(key + " " + val));
		
		int result=0,max=0;
		
		for(Entry<Integer,Integer> e1 : hMap.entrySet())
		{
			
			if(e1.getValue() > max)
			{
				result = e1.getKey();
				max = e1.getValue();
			}
			
		}
		
		System.out.println(result);

	}

}

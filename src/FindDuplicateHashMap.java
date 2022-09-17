import java.util.*;
import java.util.Map.*;


public class FindDuplicateHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,5,6};
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		charMap.compute('a', (key,val) -> (val==null)?1:val+1);
		
		for(int num:arr)
		{
			
			hm.compute(num, (key,val)->(val==null)?1:val+1);
		}
		
		Set<Entry<Integer, Integer>> l = hm.entrySet();
		
		l.forEach(x-> {
			
			if(x.getValue()>1)
				System.out.println(x.getKey());
		});
		
		
		
		//System.out.println(hm);
		

	}

}

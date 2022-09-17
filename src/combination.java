import java.util.*;
import java.util.Map;
import java.util.TreeMap;

public class combination {

	public combination() {
		// TODO Auto-generated constructor stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABC";
		
		// Combination logic start
		Set<String> finalStore = new HashSet<>();
		char[] arr = s.toCharArray();
		Map<Character,Integer> m1 = new TreeMap();
		for(char ch : arr)
		{
				m1.compute(ch, (key,val) ->{
					if(val == null)
						return 1;
					else
						return val+1;
				});
		}
		
		char[] str = new char[m1.size()];
		int[] count = new int[m1.size()];
		
		int index = 0;
		
		for(Map.Entry<Character, Integer> e : m1.entrySet())
		{
			str[index] = e.getKey();
			count[index] = e.getValue();
			index++;
		}
		char[] res = new char[arr.length];
		
		combination(str,count,0,0,res,finalStore);
		
		//System.out.println(finalStore.size());
		
		// Combination logic end

	}
	public static void combination(char[] str, int[] count,int len,int pos,char[] res, Set<String> fs)
	{
		//print(res,len,fs);
		for(int j=0;j<len;j++)
			System.out.print(res[j]);
		System.out.println("");
		
		for(int i=pos;i<str.length;i++)
		{
			if(count[i] == 0)
				continue;
			res[len] = str[i];
			count[i]--;
			combination(str,count,len+1,i,res,fs);
			count[i]++;
			
		}
		
	}
	
	public static void permute(char[] s,int low,int high,Set<String> fs)
	{
		if(low == high)
			{
				System.out.println(s);
				
				//return;
			}
		else
		{
			for(int i= low;i<=high;i++)
			{
				swap(s,low,i);
				//System.out.println(s);
				permute(s,low+1,high,fs);
				swap(s,low,i);
			}
				
		}
		
	}
	
	
	public static void permute(String s,int low,int high,Set<String> fs)
	{
		if(low == high)
			{
				System.out.println(s);
				//return;
				fs.add(s);
			}
		else
		{
			for(int i= low;i<=high;i++)
			{
				s = swap(s,low,i);
				//System.out.println(s);
				permute(s,low+1,high,fs);
				//swap(s,low,i);
			}
				
		}
		
	}
	
	public static String swap(String s,int i,int j)
	{
		char temp;
		char[] arr = s.toCharArray();
		/*arr[i]^=arr[j];
		arr[j]^=arr[i];
		arr[i]^=arr[j];*/
		
		temp = arr[i];
		arr[i] = arr[j];
		arr[j]= temp;
		
		return String.valueOf(arr);
	}
	
	public static void swap(char[] s,int i,int j)
	{
		char temp;
		char[] arr = s;
		/*arr[i]^=arr[j];
		arr[j]^=arr[i];
		arr[i]^=arr[j];*/
		
		temp = arr[i];
		arr[i] = arr[j];
		arr[j]= temp;
		
		//return String.valueOf(arr);
	}
	
	public static void print(char[] res, int len, Set<String> fs)
	{
		char[] r1 = new char[len];
		//String s= String.valueOf(res);
		for(int i=0;i<len;i++)
		{
			r1[i] = res[i];
			//System.out.print(r1[i]);
		}
		System.out.println("");
		
		permute(String.valueOf(r1),0,len-1,fs);
	}

}

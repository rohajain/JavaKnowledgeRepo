import java.util.*;

public class LambdaComparator {
	
	public static void main(String[] args)
	{
		String[] inp = {"bcd","abc","def","Dg"};
		List<String> l1 = new ArrayList<>();
		
		l1 = Arrays.asList(inp);
		
		Collections.sort(l1, (x,y) -> {
			int i = getValue(x);
			int j = getValue(y);
			
			if(i>j)			
				return 1;
			else
				return -1;
		});
		
		System.out.println(l1);
		
	}
	
	public static int getValue(String s1)
	{
		int sum =0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i) >='A' && s1.charAt(i)<='Z')
			{
				sum+=(s1.charAt(i)-'A'+1);
			}
			if(s1.charAt(i) >='a' && s1.charAt(i)<='z')
			{
				sum+=(s1.charAt(i)-'a'+1);
			}
		}
		
		System.out.println(sum);
		return sum;
	}
}

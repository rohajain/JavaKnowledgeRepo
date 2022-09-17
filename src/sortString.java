import java.util.*;

public class sortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] input = {"abc","bcd","1$cc","Abc"};
		
		ArrayList<String> s2  = new ArrayList<String>();
		for(String s:input)
			s2.add(s);
		
		Comparator<String> s = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				int l1 = getStringValue(o1);
				int l2 = getStringValue(o2);
				
				//System.out.println(l1+" "+l2);
				
				if(l1>l2)
					return 1;
				else if(l1<l2)
					return -1;
				return 0;
			}
		};
		
		Collections.sort(s2,s);
		
		s2.forEach(x->System.out.println(x));

	}
	
	public static int getStringValue(String s)
	{
		int sum =0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
				sum+=(s.charAt(i)-'a'+1);
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				sum+=(s.charAt(i)-'A'+1);
		}
		return sum;
	}

}

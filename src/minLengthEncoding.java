import java.util.*;

public class minLengthEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "ABABCABABCD";  //AB*C*D  
		System.out.println(minLength(input));
	
	}
	
	public static int  minLength(String input)
	{
		
		if(input.isEmpty())
			return 0;
		
		ArrayList<Character> tList = new ArrayList<Character>();
		ArrayList<Character> resList = new ArrayList<Character>();
		
		tList.add(input.charAt(0));
		resList.add(input.charAt(0));
		
		for(int i=1;i<input.length();i++)
		{
			if(input.charAt(i)==tList.get(0))
			{
				int lIndex =0, j=i;
				while(input.charAt(j)==tList.get(lIndex) )
				{
					j++;
					lIndex++;
					if(lIndex == tList.size() ||j == input.length())
						break;
				}
				if(tList.size()==(lIndex))
				{
					resList.add('*');
					tList.addAll(tList);
					i=j-1;
				}
				else
				{
					tList.add(input.charAt(i));
					resList.add(input.charAt(i));
				}
			}
			else
			{
				tList.add(input.charAt(i));
				resList.add(input.charAt(i));
			}
		}
		
		System.out.println(resList);
		return resList.size();
	}

}

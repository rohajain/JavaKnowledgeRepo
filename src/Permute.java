import java.util.*;

public class Permute {

	public Permute() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCD";
		
		permute(s,0,s.length()-1);
		//System.out.println(s);	
		

	}
	
	
	
	
	
	public static void permute(char[] s,int low,int high)
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
				permute(s,low+1,high);
				swap(s,low,i);
			}
				
		}
		
	}
	
	public static void permute(String s,int low,int high)
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
				s = swap(s,low,i);
				//System.out.println(s);
				permute(s,low+1,high);
				//swap(s,low,i);
			}
				
		}
		
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

}

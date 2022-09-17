
public class ParseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "432235325";
		System.out.println(pInt(s));
	}
	
	public static int pInt(String s)
	{
		int num =0,factor=1;
		for(int i= s.length() -1; i>=0;i--)
		{
			if(s.charAt(i) == '-')
			{
				return(num*-1);
			}
			num += (s.charAt(i)-'0')*factor;
			factor*=10;
		}
		
		return num;
	}

}

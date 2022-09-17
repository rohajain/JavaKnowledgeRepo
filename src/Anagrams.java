
public class Anagrams {

	public Anagrams() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Remember
		// n XOR 0 = n
		// n XOR n = 0
		
		String A="tra",B="rat";
		int value =0;
		for(int i=0;i<A.length();i++)
		{
			value^=A.charAt(i);
			value^=B.charAt(i);
			
		}
		
		//System.out.println(value);
		if(value==0)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");

	}

}

import java.util.*;

import static java.lang.System.in;  // can import static objects like this

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String name;
		try {
			name = br.readLine();
			System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}                // Reading input from STDIN
        

        //Scanner
        Scanner s = new Scanner(System.in);
        String name1 = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name1 + ".");    // Writing output to STDOUT
		
		/*StackStrings s = new StackStrings();
		

		s.push("A");
		s.push("B");
		s.push("C");
		
		s.display();
		
		s.pop();
		s.display();
		
		HashMap<String, Double> m1 = new HashMap<String, Double>();
		m1.put("Rohan", 2.0);
		m1.put("Mihir", 1.0);
		m1.put("Gautam", 3.0);
		
//		System.out.println(entriesSortedByValues(m1));
		SortingClass s1 = new SortingClass(m1);
		TreeMap<String, Double> tm = new TreeMap<String, Double>(s1);
		tm.putAll(m1);
		for(Map.Entry<String, Double> entry : tm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		*/
		
		  Map<String, Integer> idMap = new IdentityHashMap<>();
		    Map<String, Integer> hashMap = new HashMap<>();

		    String str = new String("Java");

		    idMap.put(str, 1);
		    hashMap.put(str, 1);

		    boolean isExist = idMap.containsKey("Java"); // false
		    boolean isPresent = hashMap.containsKey("Java"); // true

		    System.out.println("Does Java exists in IdentityHashmap? : " + isExist);
		    System.out.println("Does Java exists in Hashmap? : " + isPresent);
		    


		
	}
	public static class SortingClass implements Comparator<String>
	{
		private HashMap<String, Double> hm;
		SortingClass(HashMap<String, Double> hm1)
		{
			hm = hm1;
		}
		@Override
		public int compare(String s1, String s2) {
			if(hm.get(s1) > hm.get(s2))
				return 1;
			else if(hm.get(s1) < hm.get(s2))
				return -1;
			else 
				return 0;
		}

	
	
	
	static <K,V extends Comparable<? super V>> 
	Set<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
	        Set<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
	            new Comparator<Map.Entry<K,V>>() {
	                @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
	                    int res = e1.getValue().compareTo(e2.getValue());
	                    return res != 0 ? res : 1; // Special fix to preserve items with equal values
	                }
	            }
	        );
	        sortedEntries.addAll(map.entrySet());
	        return sortedEntries;
	    }

}
}

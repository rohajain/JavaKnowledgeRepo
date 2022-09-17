import java.util.*;

/* Steps to create an immutable class **
 * Declare the class as final so it can't be extended.
 * Make all fields private so that direct access is not allowed.
 * Don't provide setter methods for variables
 * Make all mutable fields final so that it's value can be assigned only once.
 * Initialize all the fields via a constructor performing deep copy.
 * Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
 */
final class Immmutable {
	
	private final int id;
	private final String name;
	private final HashMap<String, String> testMap;
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}
	
	public HashMap<String, String> gettestMap()
	{
		//return Collections.unmodifiableMap(testMap);
		//return testMap; // this will return reference to the map and hence the original hashmap values can be modified.
		return (HashMap<String, String>)testMap.clone();
		
	}
	
	
	public Immmutable(int id,String name,HashMap<String, String> testMap)
	{
		this.id =id;
		this.name =name;
		
		//Shallow Copy
		 /*System.out.println("Performing Shallow Copy");
		 this.testMap = testMap;*/
		
		//Deep copy
		System.out.println("Performing Deep Copy");
		HashMap<String, String> tempMap = new HashMap<String, String>();
		String key;
		Iterator<String> itr = testMap.keySet().iterator();
		while(itr.hasNext())
		{
			key = itr.next();
			tempMap.put(key, testMap.get(key));
			
		}
		this.testMap =tempMap;
		
	}
	
	
}

public class Immutable {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> h1 = new HashMap<String,String>();
		h1.put("1", "first");
		h1.put("2", "second");
		h1.put("5", "Five" );
		
		String s = "original";
		
		String s2 = "original";
		
		int i=10;
		
		Immmutable ce = new Immmutable(i,s,h1);
		
		//Lets see whether its copy by field or reference
		System.out.println(s==s2);
		System.out.println(s==ce.getName());
		System.out.println(h1 == ce.gettestMap());
		//print the ce values
		System.out.println("ce id:"+ce.getId());
		System.out.println("ce name:"+ce.getName());
		System.out.println("ce testMap:"+ce.gettestMap());
		//change the local variable values
		i=20;
		s="modified";
		h1.put("3", "third");
		//print the values again
		System.out.println("ce id after local variable change:"+ce.getId());
		System.out.println("ce name after local variable change:"+ce.getName());
		System.out.println("ce testMap after local variable change:"+ce.gettestMap());
		
		Map<String, String> hmTest = ce.gettestMap();
		hmTest.put("4", "new");
		
		System.out.println("ce testMap after changing variable from accessor methods:"+ce.gettestMap());


	}

}
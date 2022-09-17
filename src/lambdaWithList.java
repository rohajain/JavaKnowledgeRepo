import java.util.*;


//The body of a lambda expression in Java does not define a new scope; 
//the lambda expression scope is the same as the enclosing scope.

//https://netjs.blogspot.com/2015/06/lambda-expression-and-variable-scope.html - good examples

// Very Important note - In lambda expression we have to use either final values or effectively final values.
// https://netjs.blogspot.com/2016/03/effectively-final-in-java-8.html - Important link 
// about effectively final in java.



class Parent
{
       int a=100;
       public void display()
       {
              System.out.println("Display in parent A: "+a);
       }
}

class Child extends Parent
{
       int b=200;

       public void display()
       {
              System.out.println("Display in parent B: "+b);
       }
}

class MyThread extends Thread 
{
    MyThread() 
    {
        System.out.print(" Thread");
    }
    public void run() 
    {
        System.out.print(" 2");
    }
    public void run(String s) 
    {
        System.out.println(" 3");
    }
}

public class lambdaWithList {
	
	enum SecrecyLevels 
	{
	    IntelligenceBureau,
	 
	    Government,
	 
	    ResearchNAnalysisWing;
	}
	

	enum Month
	{
	    January, February, April, March, May, July    
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	      int a=7;
	      System.out.println(a++ + ++a);
		
		String[][] input = {{"Bob","81"},
				{"Raj","22"},
				{"Charles","87"},
				{"Raj","100"}};
		
		
		Parent obj = new Child();
        obj.display();
		
        
        Thread t = new MyThread() 
        {
            public void run() 
            {
                System.out.println(" 1");
            }
        };
        t.start();
        
		
		System.out.println(Month.March.ordinal());
		
		HashMap<String, ArrayList<Integer>> h1 = new HashMap<>();
		
		// Way to implement compute function with lambda
		
		for(int i=0;i<input.length;i++)
		{
			// Created new scope for declaring field j - which will behave as effectively final to the lambda expression.
			{ 
				int j =i;
				h1.compute(input[i][0], (key,val) ->{
				
				if(val == null)
				{
					val = new ArrayList<>();
					val.add(Integer.parseInt(input[j][1]));
					return(val);
				}
				else
				{
					
					val.add(Integer.parseInt(input[j][1]));
					return(val);
				}
			});
			}
			//h1.computeIfAbsent(input[i][0], k -> new ArrayList<>()).add(Integer.parseInt(input[i][1]));
		}
		
		System.out.println(h1);
	}

}

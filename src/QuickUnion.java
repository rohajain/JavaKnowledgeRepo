import java.util.Scanner;

public class QuickUnion {

	
	class QuickUnionUF{
		int A[];
		int sz[];
		public QuickUnionUF(int N)
		{
			A = new int[N];
			sz = new int[N];
			for(int i = 0; i < N ; ++i)
				{
					A[i] = i;
					sz[i] = 1;
				}
		}
		
		//Following path compression
		int root(int i)
		{
			
			while(i != A[i])
			{
				A[i] = A[A[i]];
				i = A[i];
			}
					
			return i;
		}
		
		void Union(int i, int j)
		{
			int p = root(i);
			int q = root(j);
			
			if(sz[p] > sz[q])
			{
				A[q] = p;
				sz[p]+=sz[q];
			}
			else
			{
				A[p] = q;
				sz[q]+=sz[p];
				
			}
			
			
		}
		
		boolean connected(int i, int j)
		{
			return root(i) == root(j);
		}
		
		void display(int n)
		{
			for(int i=0;i<n;i++)
			{
				System.out.println(A[i] + " " + sz[i]);
			}
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("Input Total Number of elements :");
		int n = sn.nextInt();
		
		QuickUnion Q = new QuickUnion();
		QuickUnionUF U = Q.new QuickUnionUF(n);
		
		while(true)
		{
			System.out.println("1. Union");
			System.out.println("2. Find");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			int ch = sn.nextInt();
			
			switch(ch)
			{
				case 1 : int i = sn.nextInt();
						 int j = sn.nextInt();
						 U.Union(i, j);
						 System.out.println(i+" Union " +j);
						 break;
				case 2 : i = sn.nextInt();
				 		 j = sn.nextInt();
				 		 if(U.connected(i, j))
				 			 System.out.println(i+" Connected to " +j);
				 		 else
				 			System.out.println(i+" is not Connected to " +j);
				 		 break;
				case 3 : U.display(n);
						 break;
				case 4 : sn.close();
						 System.exit(0);
						 
			}
			
		}
		

	}

}

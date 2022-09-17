import java.util.*;

public class ConnectedComponents {
	
	public static void main(String args[])
	{
		Graph G = new Graph(5);
		
		
		G.addEdge(0, 1); 
        G.addEdge(0, 4); 
        G.addEdge(1, 2); 
        G.addEdge(1, 3); 
        G.addEdge(1, 4); 
        G.addEdge(2, 3); 
        G.addEdge(3, 4);
        
        G.printGraph();
        G.DFS(2);
        
        System.out.println();
        
        G.BFS(2);
	}
	
	
}

class Graph{

	private int v;
	private LinkedList<Integer> ajc[];
	
	public Graph(int v)
	{
		this.v = v;
		ajc = new LinkedList[v];		
		for(int i=0;i<v;i++)
			ajc[i] = new LinkedList<Integer>();
	}
	
	public void addEdge(int src,int dest)
	{
		this.ajc[src].add(dest);
		this.ajc[dest].add(src);
	}
	
	
	public void dfsUtils(int N, boolean visited[])
	{
		if(visited[N] !=true)
		{
			System.out.println(N);
			visited[N] = true;
		}
		
		Iterator<Integer> itr =ajc[N].iterator();
		
		while(itr.hasNext())
		{
			int t = itr.next();
			if(!visited[t])
				dfsUtils(t,visited);
		}	
		
		
	}
	
	public void DFS(int n)
	{
		boolean[] visited = new boolean[v];
		
		dfsUtils(n,visited);
	}

	public void BFS(int n)
	{
		boolean[] visited = new boolean[v];
		bfsUtils(n,visited);
		
	}
	
	public void bfsUtils(int n, boolean[] visited)
	{
		
		Queue<Integer> q1 = new LinkedList<Integer>();
		visited[n] = true;
		q1.add(n);
		//System.out.println(n+" "+ !q1.isEmpty());
		
		while(!q1.isEmpty())
		{
			int t = q1.poll();
			System.out.println(t);
			Iterator<Integer> itr = ajc[t].iterator();
					while(itr.hasNext())
						{
							int i = itr.next();
							if(!visited[i])
							{
								q1.add(i);
								visited[i] = true;
							}
							
							
						}
				
			
		}
		
	}
	public void printGraph()
	{
		for(int i=0 ;i<this.v;i++)
		{
			System.out.print("Head");
			for(int x : ajc[i])
			{
				System.out.print(" -> "+x);
			}
			
			System.out.println();
		}
	}
}

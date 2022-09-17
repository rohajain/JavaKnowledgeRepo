
public class SegTree {
	
	static int tree[];
	
	public static void main(String[] args)
	{
		System.out.println("Hello");
		int arr[] = {1,2,3,2,1,5,6};
		
		tree = new int[arr.length];
		buildSegTree(arr,0,0,arr.length-1);
		
		for(int a : tree)
		{
			System.out.println(a);
		}
		
	}
	
	public static void buildSegTree(int[] arr,int node, int start, int end)
	{
		if(start == end)
		{
			tree[node] = arr[start];
		}
		else
		{
			int mid = (start+end)/2;
			buildSegTree(arr,2*node,start,mid);
			buildSegTree(arr,2*node+1,mid+1,end);
			
			tree[node] = tree[2*node] + tree[2*node +1];
		}
		
	}

}

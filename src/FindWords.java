
//Time complexity == O(m*n*q) -- m*n input size , q word size
//Space complexity == O(1)

public class FindWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char inp[][] = {
				{'a','b','c','d'},
				{'e','q','h','t'},
				{'r','b','b','m'},
				{'s','p','o','n'},
		};
		
		char word[] = {'p','o','n'};
		
		System.out.println(findW(inp,word));

	}
	
	public static boolean findW(char[][] inp,char[] word)
	{
		
		if(inp.length == 0 || word.length ==0)
			return false;
		
		int[][] directions = { {-1,-1}, {-1,0}, {-1,1}, {0,-1}, {0,1}, {1,-1}, {1,0},{1,1} };
		
		boolean answer = false;
		
		for(int i=0;i<inp.length;i++)
		{
			for(int j=0;j<inp[i].length;j++)
			{
				if(inp[i][j] == word[0])
				{
					//8 directions we can move to.
					//i-1,j-1
					//i-1,j
					//i-1,j+1
					//i,j-1
					//i,j+1
					//i+1,j-1
					//i+1,j
					//i+1,j+1
					for(int k=0;k<8;k++) {
						if(answer == false) {
							answer=dfsUtil(inp,word,directions,k,i,j,1);
						}
						
					}								
				}
			}
		}
		
		return answer;
	}
	
	public static boolean dfsUtil(char[][] input, char[] word, int[][] directions, int d, int i, int j,int index)
	{
		int newi = i+directions[d][0];
		int newj = j+directions[d][1];
		if(newi>=0 && newi < input.length && (newj>=0 && newj < input[0].length)){
			if(input[newi][newj]==word[index] && index == word.length-1)
				return true;
			else if(input[newi][newj]==word[index] && index < word.length-1) {
				return dfsUtil(input,word,directions,d,newi,newj,index+1);
			}
		}
		return false;
	}
}	
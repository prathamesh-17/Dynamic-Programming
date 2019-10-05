package DynamicPrograming;

public class EditDistance {
	
	static int min(int x,int y,int z)
	{
		if(x<y && x<z)return x;
		else if(y<x && y<z)return y;
		else
			return z;
	}
	
	static int editdis(String string1,String string2,int m,int n)
	{
		int dp[][] = new int[m+1][n+1];
		
		for(int i=0; i<=m; i++)
		{
			for(int j=0; j<=n; j++)
			{
				if(i==0)
					dp[i][j] = j;
				else if(j==0)
					dp[i][j] = i;
				
				else if(string1.charAt(i-1) == string2.charAt(j-1))
					dp[i][j] = dp[i-1][j-1];
				else
					dp[i][j] = 1 + min(dp[i][j-1],dp[i-1][j],dp[i-1][j-1]);
			}
		}
		return dp[m][n];
	}

	public static void main(String[] args) {
		String String1 = "Sunday";
		String string2 = "Saturday";
		System.out.print(editdis(String1,string2,String1.length(),string2.length()));

	}

}

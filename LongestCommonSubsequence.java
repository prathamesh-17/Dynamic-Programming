package DynamicPrograming;

public class LongestCommonSubsequence {
	int lcs(char x[],char y[],int m,int n)
	{
		int L[][] = new int[m+1][n+1];
		
		for(int i=0; i<=m; i++)
		{
			for(int j=0; j<=n; j++)
			{
				if(i==0 || j==0)
					L[i][j] = 0;
				else if(x[i-1] == y[j-1])
					L[i][j] = L[i-1][j-1] + 1;
				else
					L[i][j] = Math.max(L[i-1][j],L[i][j-1]); 
			}
		}
		return L[m][n];
	}
	
	
	public static void main(String[] args) {
		LongestCommonSubsequence l = new LongestCommonSubsequence();
		String s1 = "AXTAB";
		String s2 = "GXTXAY";
		char[] X = s1.toCharArray();
		char[] Y = s2.toCharArray();
		int m = X.length;
		int n = Y.length;
		System.out.println("Length of LCS is "+ l.lcs(X, Y, m, n));
				

	}

}

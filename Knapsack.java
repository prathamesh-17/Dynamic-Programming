package DynamicPrograming;

public class Knapsack {

	
	static int knap(int W,int wt[],int val[],int n)
	{
		int ks[][] = new int [n+1][W+1];
		for(int i=0; i<=n; i++)
		{
			for(int j=0; j<=W; j++)
			{
				if(i==0 || j==0)
					ks[i][j] = 0;
				else if(wt[i-1]<=j)
					ks[i][j] = Math.max(val[i-1] + ks[i-1][j-wt[i-1]], ks[i-1][j]);
				else
					ks[i][j] = ks[i-1][j];					
			}
		}
		return ks[n][W];
	}
	
	public static void main(String[] args) {
		int weights[] = {10,20,30};
		int values[] = {60,100,120};
		int W = 50;
		int n = values.length;
		System.out.print(knap(W,weights,values,n));

	}

}

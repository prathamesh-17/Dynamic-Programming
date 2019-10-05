package DynamicPrograming;

public class LongestIncreasingSubsequence {
	static int lisce(int[] arr,int n)
	{
		int i,j,max = 0;
		int lis[] = new int[n];
		
		for(i=0; i<n; i++)
		{
			lis[i] = 1;
		}
		
		for(i=1; i<n; i++)
		{
			for(j=0; j<i; j++)
			{
				if(arr[i]>arr[j] && lis[i] < lis[j]+1)
				{
					lis[i] = lis[j]+1;
				}
			}
		}
		for(i=0; i<n; i++)
		{
			if(max<lis[i])
			{
				max = lis[i];
			}
		}
		return max;
	}

	public static void main(String args[])
	{
		int arr[] = {3,2,42};
		int n = arr.length;
		System.out.print("Length of LIS is : "+lisce(arr,n));
				
	}
}

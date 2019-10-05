package DynamicPrograming;

import java.util.Arrays;
import java.util.Scanner;

public class fibonacci {
	
	static int[] fibo(int n)
	{
		int f[] = new int[n];
		f[0] = 0;
		f[1] = 1;
		for(int i=2; i<n; i++)
		{
			f[i] = f[i-1] + f[i-2];
		}
		return f;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Arrays.toString(fibo(n)));
		sc.close();
	}

}

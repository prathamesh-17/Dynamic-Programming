package DynamicPrograming;

import java.util.Scanner;

public class SumOfn {

	static int sum(int n)
	{
		int s[] = new int[n+1];
		s[0] = 0;
		s[1] = 1;
		for(int i=2; i<=n; i++)
		{
			s[i] = i + s[i-1];
		}
		return s[n];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sum(n));
		sc.close();

	}

}

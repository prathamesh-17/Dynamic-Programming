package DynamicPrograming;

import java.util.Scanner;

public class factorial {

	static int fact(int n)
	{
		int f[] = new int[n+1];
		if(n == 0)
        {
            return 1;
        }
        else{
		f[0] = 1;
		f[1] = 1;
		for(int i=2; i<=n; i++)
		{
			f[i] = i * f[i-1];
		}
		return f[n];
        }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fact(n));
		sc.close();
	}

}

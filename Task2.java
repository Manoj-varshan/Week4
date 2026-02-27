import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();   
		
		while(T-- > 0)
		{
			String s = sc.next();
			int n = s.length();
			
			int[] left = new int[26];
			int[] right = new int[26];

			for(int i = 0; i < n/2; i++)
			{
				left[s.charAt(i) - 'a']++;
			}

			int start = (n % 2 == 0) ? n/2 : n/2 + 1;
			
			for(int i = start; i < n; i++)
			{
				right[s.charAt(i) - 'a']++;
			}
			
			boolean lapin = true;
			
			for(int i = 0; i < 26; i++)
			{
				if(left[i] != right[i])
				{
					lapin = false;
					break;
				}
			}
			
			if(lapin)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
		sc.close();
	}
}
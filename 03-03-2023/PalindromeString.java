package string;

public class PalindromeString {
	public static int solve(String s)
	{
		int n = s.length();
		
		boolean[][] dp = new boolean[n][n];
		for (int i = 0; i < n; i++)
		{
		
		dp[i][i] = true;
		
		// check for every substring of length 2
		if (i < n - 1
			&& s.charAt(i) == s.charAt(i + 1)) {
			dp[i][i + 1] = true;
		}
		}
		
		// check every substring of length greater than 2
		// for palindrome
		for (int len = 3; len <= n; len++) {
		for (int i = 0; i + len - 1 < n; i++) {
			if (s.charAt(i) == s.charAt(i + (len - 1))
				&& dp[i + 1][i + (len - 1) - 1]) {
			dp[i][i + (len - 1)] = true;
			}
		}
		}
		int[] kmp = new int[n];
		for (int i = 0; i < n; i++)
		{
		
		// starting kmp for every i from 0 to n-1
		int j = 0, k = 1;
		while (k + i < n) {
			if (s.charAt(j + i) == s.charAt(k + i))
			{
			
			
			// if this suffix is palindrome then it
			// is already included in prefix
			dp[k + i - j][k + i] = false;
			kmp[k++] = ++j;
			}
			else if (j > 0) {
			j = kmp[j - 1];
			}
			else {
			kmp[k++] = 0;
			}
		}
		}
		
		int count = 0;
		for (int i = 0; i < n; i++) {
		String str = "";
		for (int j = i; j < n; j++) {
			str += s.charAt(j);
			if (dp[i][j])
			{
			count++;
			System.out.println(str);
			}
		}
		}
		System.out.println(
		"Total number of distinct palindromes is "
		+ count);
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abaaa";
		System.out.println("The string is :- "+s1);
		solve(s1);

	}

}

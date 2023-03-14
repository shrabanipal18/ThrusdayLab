package string;

public class LongestSubstring {
	public static int longestUniqueSubsttr(String str)
	{
	    int n = str.length();
	     
	    // Result
	    int res = 0;
	     
	    for(int i = 0; i < n; i++)
	    {
	         
	        //Default values in visited are false
	        boolean[] visited = new boolean[256];
	         
	        for(int j = i; j < n; j++)
	        {
	             
	            // If current character is visited
	            // Break the loop
	            if (visited[str.charAt(j)] == true)
	                break;
	 
	            
	            // current character as visited.
	            else
	            {
	                res = Math.max(res, j - i + 1);
	                visited[str.charAt(j)] = true;
	            }
	        }
	 
	        // Remove the first character of previous
	        visited[str.charAt(i)] = false;
	    }
	    return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABDEFGABEF";
		System.out.println("The input string is " + str);

		int len = longestUniqueSubsttr(str);
		
		System.out.println("The length of the longest " +
						"substring is " + len);
		
		System.out.println("==================================================================");
		
		String str1 = "BBBB";
		System.out.println("The input string is " + str1);

		int len1 = longestUniqueSubsttr(str1);
		
		System.out.println("The length of the longest " + "substring is " + len1);

	}

}

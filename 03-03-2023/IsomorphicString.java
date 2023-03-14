package string;
import java.util.*;
public class IsomorphicString {
	public static boolean is_Isomorphic(String str1, String str2) {
		  
		  //check string length are same or not same
	        if (str1.length() != str2.length())
				return false;
	        
	        //maping using key value pair hashmap
	        //key value
	        //a   x
	        //a   x
	        //b   y
	        
	        HashMap<Character, Character> map = new HashMap<>();
	        
	        for (int i = 0; i < str1.length(); i++) {
	        	//string 1&2 index address
	            char p = str1.charAt(i), q = str2.charAt(i);
	            //map first index in present
	            if (map.containsKey(p)) 
	            	//crosponding value p2
				{
	            	//not ismorphics
	                if (map.get(p) != q)
						return false;
	            }
				else 
				{
					//value is not present str2
					//presrnt or not
	                if (map.containsValue(q)) 
						return false;
	                
	                //map insert key value
	             map.put(p, q);
	            }
	        }
	        
	        return true;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "aab";
		String str2 = "xxy";
		IsomorphicString.is_Isomorphic(str1, str2);
		System.out.println(is_Isomorphic(str1, str2));
	}

}

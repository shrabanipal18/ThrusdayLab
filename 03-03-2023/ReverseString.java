package string;

public class ReverseString {
public static void R_String(String s) {
		
		//text is array....store the string
		//split method ---return arry...
		String text[]=s.split(" ");
		
		//rev is blank string
		String rev="";
		for(int i=text.length-1;i>=0;i--) {
			
			//text[i]= index number of array
			//store rev
			rev=rev+text[i]+" ";
		}
		System.out.println("Output is :- "+rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeks quiz practice code"; 
		System.out.println("Input is :- "+s);
		
		//this is method
				ReverseString.R_String(s);
				
		System.out.println("=======================================");
				
		String s1= "i love programming very much";
		System.out.println("Input is :- "+s1);
		
		//this is method
		ReverseString.R_String(s1);

	}

}

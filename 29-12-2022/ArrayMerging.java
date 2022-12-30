/* 
 * @ author Shrabani Pal
 * 
 * merge two array
*/
package array;
import java.util.*;
public class ArrayMerging {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of first array elements: ");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		System.out.println("First array:");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		ArraySorting.sort(arr1, n);
		System.out.println();
		System.out.println("Enter the number of second array elements: ");
		int m=sc.nextInt();
		int arr2[]=new int[m];
		System.out.println("Second array:");
		for(int i=0;i<m;i++)
		{
			arr2[i]=sc.nextInt();
		}
		ArraySorting.sort(arr2, m);
		System.out.println();
		n=arr1.length;
		m=arr2.length;
		int c[]=new int [n+m];
		int count = 0;
	      
	      for(int i = 0; i < arr1.length; i++) { 
	         c[i] = arr1[i];
	         count++;
	      } 
	      for(int j = 0; j < arr2.length;j++) { 
	         c[count++] = arr2[j];
	      } 
	      System.out.println("After merging:");
	      for(int i = 0;i < c.length;i++) System.out.print(c[i]+" ");
//		System.arraycopy(arr1, 0, c, 0, n);  
//		System.arraycopy(arr2, 0, c, n, m);  
//	    System.out.println("After merging:");
//		System.out.println(Arrays.toString(c));
	}

}

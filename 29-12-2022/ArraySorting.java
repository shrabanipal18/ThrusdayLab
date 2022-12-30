/* 
 * @ author Shrabani Pal
 * 
 * Array sorting
*/
package array;
import java.util.*;
public class ArraySorting {

	public static void sort(int arr[], int n) {
		int i,j,temp;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		int arr[]=new int[10];
		System.out.print("Enter the number of elements: ");
		int n=sc.nextInt();
		System.out.println("Before sorting: ");
		for(i=0;i<n;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		System.out.print("After sorting: ");
		ArraySorting.sort(arr, n);  //method calling
	}

}

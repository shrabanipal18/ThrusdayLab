/* 
   @author Shrabani Pal
  
 A party has been organized on cruise. The party is organized for a limited time(T). The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array. The task is to find the maximum number of guests present on the cruise at any given instance within T hours.

Example 1:
Input :

5    -> Value of T
[7,0,5,1,3]  -> E[], Element of E[0] to E[N-1], where input each element is separated by new line 
[1,2,1,3,4]   -> L[], Element of L[0] to L[N-1], while input each element is separate by new line.
Output :
8     -> Maximum number of guests on cruise at an instance.

Explanation:

1st hour:
Entry : 7 Exit: 1
No. of guests on ship : 6

2nd hour :
Entry : 0 Exit : 2
No. of guests on ship : 6-2=4

Hour 3:
Entry: 5 Exit: 1
No. of guests on ship : 4+5-1=8

Hour 4:
Entry : 1 Exit : 3
No. of guests on ship : 8+1-3=6

Hour 5:
Entry : 3 Exit: 4
No. of guests on ship: 6+3-4=5
Hence, the maximum number of guests within 5 hours is 8.
*/

package oops;
import java.util.Scanner;
public class Party {

	public static void main(String[] args) {
		int E[]=new int[10];      //declaring Entry guest's list per hour
		int L[]=new int[10];      //declaring Exit guest's list per hour
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the time limit: ");
		int t=sc.nextInt();
		System.out.println("Write the no. of guests who entered: ");
		for(int i=0;i<t;i++)
		{
			E[i]=sc.nextInt();
		}
		for(int i=0;i<t;i++) {
			System.out.print(E[i]+" ");
		}
		System.out.println();
		System.out.println("Write the no. of guests who left: ");
		for(int i=0;i<t;i++)
		{
			L[i]=sc.nextInt();
		}
		for(int i=0;i<t;i++) {
			System.out.print(L[i]+" ");
		}
		System.out.println();
		System.out.println("1.Hour 1 \n2.Hour 2 \n3.Hour 3 \n4.Hour 4 \n5.Hour 5 \n6.Exit");
		System.out.println("Enter Hour: ");
		int ch=sc.nextInt();
		
		switch (ch) {
		case 1:
			System.out.println("Entry: "+E[0]+"    "+"Exit: "+L[0]);
			int s1=E[0]-L[0];
			System.out.println("No. of guests on ship: "+s1);
			break;
		case 2:
			System.out.println("Entry: "+E[1]+"    "+"Exit: "+L[1]);
			int s2=(E[0]+E[1])-(L[0]+L[1]);
			System.out.println("No. of guests on ship: "+s2);
			break;
		case 3:
			System.out.println("Entry: "+E[2]+"    "+"Exit: "+L[2]);
			int s3=(E[0]+E[1]+E[2])-(L[0]+L[1]+L[2]);
			System.out.println("No. of guests on ship: "+s3);
			break;
		case 4:
			System.out.println("Entry: "+E[3]+"    "+"Exit: "+L[3]);
			int s4=(E[0]+E[1]+E[2]+E[3])-(L[0]+L[1]+L[2]+L[3]);
			System.out.println("No. of guests on ship: "+s4);
			break;
		case 5:
			System.out.println("Entry: "+E[4]+"    "+"Exit: "+L[4]);
			int s5=(E[0]+E[1]+E[2]+E[3]+E[4])-(L[0]+L[1]+L[2]+L[3]+L[4]);
			System.out.println("No. of guests on ship: "+s5);
			break;
		case 6:
			System.exit(0);
		default:System.out.println("Wrong choise");
		}
		int max = 0, sum = 0;
        for (int i = 0; i < t; i++)
        {
	        sum += E[i] - L[i];
	        max = Math.max (sum, max);          //calculating maximum no. of guests in total hours
        }
		System.out.println("Hence, the maximum number of guests within 5 hours is: "+max);
	}
}

# ThrusdayLab
package array;
import java.util.Scanner;
public class CalculationMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row=sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int col=sc.nextInt();
		int x[][]=new int[row][col];
		int y[][]=new int[row][col];
		System.out.println("Enter the first matrix: ");
		for(int m=0;m<row;m++)
		{
			for(int n=0;n<col;n++)
			{
				x[m][n]=sc.nextInt();
			}
		}
		System.out.println("Enter the second matrix: ");
		for(int m=0;m<row;m++)
		{
			for(int n=0;n<col;n++)
			{
				y[m][n]=sc.nextInt();
			}
		}
		int z[][]=new int[row][col];
		for(int m=0;m<row;m++)
		{
			for(int n=0;n<col;n++)
			{
				z[m][n]=x[m][n]+y[m][n];  //Matrix addition
			}
		}
		System.out.println("Addition of two matrices is:");
		for(int m=0;m<row;m++)
		{
			for(int n=0;n<col;n++)
			{
				System.out.print(z[m][n]+" ");
			}
			System.out.println();
		}
		int w[][]=new int[row][col];
		for(int m=0;m<row;m++)
		{
			for(int n=0;n<col;n++)
			{
				w[m][n]=x[m][n]-y[m][n];  //Matrix subtraction
			}
		}
		System.out.println("Subtraction of two matrices is:");
		for(int m=0;m<row;m++)
		{
			for(int n=0;n<col;n++)
			{
				System.out.print(w[m][n]+" ");
			}
			System.out.println();
		}
	}

}

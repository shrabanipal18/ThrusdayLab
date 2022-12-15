package oops;
import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		float HRA,DA;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name: ");
		name=sc.nextLine();
		System.out.println("Enter basic salary amount: ");
		int salary=sc.nextInt();
		if(salary>1500) {
			HRA=salary*0.2f;
			DA=salary*0.9f;
		}
		else {
			HRA=500;
			DA=salary*0.7f;
		}
		System.out.println("Name: "+name+"\n"+"Graoss Salary: "+(HRA+DA+salary));
	}

}

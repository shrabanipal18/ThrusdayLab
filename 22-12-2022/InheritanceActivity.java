package oops;
import java.util.*;
class Employees{
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double transportAllowance;
	double specialAllowance=250.80;
	double HRA=1000.50;
	public Employees(int Id,String Name,String Address,long Phone)
	{
	employeeId=Id;
	employeeName=Name;
	employeeAddress=Address;
	employeePhone=Phone;
	}
	public void calculateSalary()
	{
			
		double Salary = basicSalary + (basicSalary*specialAllowance/100) + (basicSalary*HRA/100);
		System.out.println("Total Salary: "+Salary);
	}
	public void calculateTransportAllowance()
	{
		double transportAllowance=0.1*basicSalary;
	}
}
class Manager extends Employees{
	double basicSalary;
	public Manager(int Id,String Name,String Address,long Phone,double Salary)
	{
		super(Id,Name,Address,Phone);
		basicSalary=Salary;
	}
	public void calculateSalary()
	{
			
		double Salary = basicSalary + (basicSalary*specialAllowance/100) + (basicSalary*HRA/100);
		System.out.println("Total Salary of Manager is: "+Salary);
	}
	public void calculateTransportAllowance()
	{
		double transportAllowance=0.15*basicSalary;
		double Salary= transportAllowance+basicSalary;
		System.out.println("After calculating TransportAllowance the salary of Manager is: "+Salary);
	}
	public void getData()
	{
		System.out.println("Id: "+employeeId+"\n"+"Name: "+employeeName+"\n"+"Address: "+employeeAddress+"\n"+"Phone: "+employeePhone+"\n"+"Basic Salary: "+basicSalary);
		
	}
}
class Trainee extends Employees{
	double basicSalary;
	public Trainee(int Id,String Name,String Address,long Phone,double Salary)
	{
		super(Id,Name,Address,Phone);
		basicSalary=Salary;
	}
	public void calculateSalary()
	{
			
		double Salary = basicSalary + (basicSalary*specialAllowance/100) + (basicSalary*HRA/100);
		System.out.println("Total Salary of Trainee is: "+Salary);
	}
	public void calculateTransportAllowance()
	{
		double transportAllowance=0.1*basicSalary;
		double Salary=transportAllowance+basicSalary;
		System.out.println("After calculating TransportAllowance the salary of Trainee is: "+Salary);
		
	}
	public void getData()
	{
		System.out.println("Id: "+employeeId+"\n"+"Name: "+employeeName+"\n"+"Address: "+employeeAddress+"\n"+"Phone: "+employeePhone+"\n"+"Basic Salary: "+basicSalary);;
		
	}
}
public class InheritanceActivity {

	public static void main(String[] args) {
		Manager m=new Manager(126534,"Peter","Chennai India",237844,65000);
		Trainee t=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		m.getData();
		t.getData();
		m.calculateSalary();
		t.calculateSalary();
		m.calculateTransportAllowance();
		t.calculateTransportAllowance();
	}

}

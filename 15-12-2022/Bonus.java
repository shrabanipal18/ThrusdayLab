package oops;
import java.util.*;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int y1,y2;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter employee name:" );
		name=sc.nextLine();
		System.out.println("Enter joining year: ");
		y1=sc.nextInt();
		System.out.println("Enter current year: ");
		y2=sc.nextInt();
		int diff=y2-y1;
		if(diff>3) {
			System.out.println("2500rs Bonus increment will be given to "+name);
		}
		else {
			System.out.println("No Bonus increment will be give");
		}

	}

}

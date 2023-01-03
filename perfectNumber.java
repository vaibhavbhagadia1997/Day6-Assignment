package Day6Assignment;
import java.util.Scanner;
public class perfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 0;
		int sum = 0;
		Scanner s = new Scanner (System.in);
		System.out.println("enter the number:");
			
		n = s.nextInt();
		for (int i=1;i<n;i++) {
			if (n % i == 0)
			{
				sum = sum + i;
		 }
			if(sum == n)
			{
				System.out.println("Given number is perfect");
			}
			else
			{
				System.out.println("Given number is not perfect");
			}	
			}
		}
		
	
}

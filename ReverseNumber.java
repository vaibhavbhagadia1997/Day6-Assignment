package Day6Assignment;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		int rev = 0;
		while(n!=0)
		{
			int remainder = n % 10; //4 3 2 1
			rev = rev *10 + remainder;//0+4 0+3 0+2 0+ = 4321
			n=n/10;//123 12 1 0
		
		}
		System.out.println("The reverse of the given number is:" + rev);
	}

}

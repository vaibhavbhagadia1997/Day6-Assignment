package Day6Assignment;

public class fiibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 12; 
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.print("The Fibonacci Series " + n + " terms:");
        
        for (int i=1;i<=n;i++) {
        	System.out.println(firstTerm + ", ");
        	
        	//computation
        	int nextTerm = firstTerm + secondTerm;
        	firstTerm = secondTerm;
        	secondTerm = nextTerm;
        	
        	
        }
	}

}

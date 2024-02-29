package Data;
import java.util.*;
public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = input.nextInt();
		
		System.out.println("The factorial of the given number is : "+fact(a));
		input.close();
		
	}
	
	public static int fact(int n) {
		int factorial = 0;
		if( n == 0) {
			return 1;
		}else if(n >= 0) {
			factorial = n*fact(n-1);
			n--;
		}
		return factorial;
	}

}

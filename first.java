package Data;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a 1st number: ");
        int a  = input.nextInt();
        System.out.print("Enter a 2nd number: ");
        int b = input.nextInt();


        System.out.println("multiplication of two numbers are: " +multiplication(a, b));

        input.close();
	}
	
	
	 public static int multiplication(int a, int b){
	        int multi = a*b;
	        return multi;
	    }

}

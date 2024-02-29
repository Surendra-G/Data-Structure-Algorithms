package Data;

import java.util.Scanner;

public class second {

	public static void personName(String name){
        System.out.println("your name: "+name);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        personName(name);
        

        input.close();
	}


}

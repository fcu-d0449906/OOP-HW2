package oop;
import java.util.Scanner;
public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	String name;
	int num;
	float num2;
	
	
	System.out.println("enter name:");
	name = scan.next();
	System.out.println("enter num:");
	num= scan.nextInt();
	System.out.println("enter num:");
	num2= scan.nextFloat();

	System.out.printf("Hi %s, the multiplication of %d and %.5f is %.2e.",name,num,num2,num*num2);
	scan.close();
	
	
	}

}

package oop;
import java.util.Scanner;
public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER INTEGER:");
		int num = scan.nextInt();
		
		
		if(num%2==1){
			System.out.println("The input integer is Odd Number.");
		}
		else{
			System.out.println("The input integer is Even Number.");
		}
		scan.close();
		
		
	}

}

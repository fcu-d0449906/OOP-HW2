package oop;
import java.util.Scanner;
public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i=1;
		while(i==1){
			System.out.println("Enter a string 1:");
			String str1 = scan.nextLine();
			System.out.println("Enter a string 1:");
			String str2 = scan.nextLine();
		
			System.out.println(String.valueOf(str1.equalsIgnoreCase(str2)));
			if(String.valueOf(str1.equalsIgnoreCase(str2))=="true"){
				System.out.println("The two strings are the same.");
				break;
			}
			else{
				System.out.println("The two strings are not the same.");
			}
		}
		scan.close();
		
		
		
	}

}

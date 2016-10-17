package oop;
import java.util.Scanner;
public class PrintNumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a integer:");
		int num = scan.nextInt();
		
		
		if(num<10){
			if(num==1){
				System.out.println("ONE");
			}
			if(num==2){
				System.out.println("TWO");
			}
			if(num==3){
				System.out.println("THREE");
			}
			if(num==4){
				System.out.println("FOUR");
			}
			if(num==5){
				System.out.println("FIVE");
			}
			if(num==6){
				System.out.println("SIX");
			}
			if(num==7){
				System.out.println("SEVEN");
			}
			if(num==8){
				System.out.println("EIGHT");
			}
			if(num==9){
				System.out.println("NINE");
			}
		}
		else{
			System.out.println("OTHER");
			
		}
		scan.close();
		
		
	}

}

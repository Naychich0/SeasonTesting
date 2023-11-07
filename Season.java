package lo5;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter month");
		int month = sc.nextInt();
		
	
		
//		if(num ==1){
//			System.out.println("Winter Season");
//		}else if(num ==2) {
//			System.out.println("Winter Season");
//		}else if(num ==3) {
//			System.out.println("Summer Season");
//		}else if(num ==4) {
//			System.out.println("Summer Season");
//		}else if(num ==5) {
//			System.out.println("Summer Season");
//		}else if(num ==6) {
//			System.out.println("Rainy Season");
//		}else if(num ==7) {
//			System.out.println("Rainy Season");
//		}else if(num ==8) {
//			System.out.println("Rainy Season");
//		}else if(num ==9) {
//			System.out.println("Rainy Season");
//		}else if(num ==10) {
//			System.out.println("Rainy Season");
//		}else if(num ==11) {
//			System.out.println("Winter Season");
//		}else if(num ==12) {
//			System.out.println("Winter Season");
//		}else {
//			System.out.println("Wrong input!");
//		}
		
		if(month == 3 || month== 4 || month==5) {
			System.out.println("Summer Season");
		}else if(month == 6 || month== 7 || month==8 || month ==9 || month ==10) {
			System.out.println("Rainy Season");
		}else if(month == 11 || month== 12 || month==1 || month==2) {
			System.out.println("Winter Season");
		}

	}

}

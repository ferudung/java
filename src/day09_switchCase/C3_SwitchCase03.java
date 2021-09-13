package day09_switchCase;

import java.util.Scanner;

public class C3_SwitchCase03 {

	public static void main(String[] args) {
		// Soru5 : Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim
		
		Scanner scan=new Scanner(System.in);
		System.out.println("gun ismi girin:");
		String gun=scan.next().toLowerCase();
		switch (gun) {
		
		case "pazartesi":
		case "sali":
		case "carsamba":
		case "persembe":
		case "cuma":
			System.out.println("haftaiçi");
			break;
		case "cumartesi":
		case "pazar":
			System.out.println("haftasonu");
			break;
			
		default:
			System.out.println("gecerli gun girin ");
			break;
		}

	}

}

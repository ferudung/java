package day07_ifElseStatements;

import java.util.Scanner;

public class C6_IfElseIf02 {

	public static void main(String[] args) {
		/*
		 Soru 3) Kullanicidan gun ismini alin ve
		 haftaici veya hafta sonu oldugunu yazdirin
		 Ornek:  	gun=Pazar output = “Hafta sonu”
		 gun=Sali output = “Hafta ici”
		 *** String icin equals method’unu kullanin
		 */
		Scanner scan =new Scanner (System.in);
		System.out.println("lutfen gun ismi girin:");
		String gun=scan.next().toLowerCase();
		if (gun.equals("pazartesi")||gun.equals("sali")||gun.equals("carsamba")||gun.equals("persembe")||gun.equals("cuma")) {
			System.out.println("girdiginiz gun hafta ici");			
		}
		else if (gun.equals("cumartesi")||gun.equals("pazar")) {
			System.out.println("girdigin gun haftasonu");
		}
		else {
			System.out.println("gecerli gun girin");
		}
			

		
	}

}

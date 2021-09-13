package day07_ifElseStatements;

import java.util.Scanner;

public class C1_ifStatements {

	public static void main(String[] args) {
		/*
		 Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
  		Ornek:  gun=Pazar output = “Hafta sonu”
 		gun=Sali output = “Hafta ici”
		*** String icin equals method’unu kullanin
		 */
		//flag kullanımı
		Scanner scan=new Scanner(System.in);
		System.out.println("gun ismini girin :");
		String gunIsmi= scan.next().toLowerCase();
		int flag=0;
		
		if (gunIsmi.equals("pazartesi")||gunIsmi.equals("sali")||gunIsmi.equals("carsamba")||gunIsmi.equals("persembe")||gunIsmi.equals("cuma")) {
			System.out.println("girdiğiniz gün haftaiçi");
			flag++;
		}
		if (gunIsmi.equals("cumartesi")||gunIsmi.equals("pazar")) {
			System.out.println("girdiginiz gun haftasonu");		
			flag++;
		}
		
		if (flag==0) {System.out.println("gecerli bir gun girin");
			
		}
		
		// pazar ==> flag=1   2.if body'si calisacak
        // sali ==> flag=1   1.if body'si calisacak
        // pezer ==> flag =0 
	}

}

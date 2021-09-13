package day03_datacasting_increment;

import java.util.Scanner;

public class C1_Scanner01 {

	public static void main(String[] args) {
				/*
		 Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
 		 Isminiz : Mehmet
 		 Soyisminiz : Bulut
 		 Kursumuza katiliminiz alinmistir,tesekkur ederiz
		 */
		Scanner scan =new Scanner (System.in);
		System.out.println("lutfen isminizi ve soyisminizi yaziniz,\nisminizi yazdiktan sonra Enter'a basiniz");

		//syso icinde alt satira gecmek istediginiz de /n yazariz
		// \n den sonra bosluk birakirsak ikinci satirin basina bosluk olur
		String name = scan.nextLine();
		String surname = scan.nextLine();
		//next() sadece ilk kelimeyi alir girilen deger daha uzunsa ilk kelime sonrasina kalir
		//nextline() ise o satirin sonuna kadar girilen tum degerleri alir
		System.out.println("isminiz: "+name +"\nsoyisminiz:"+surname+"\nKursumuza katiliminiz alindi Tesekkurler");
		scan.close();// sari unlem uyarisinin cikmasini onler
		
	}

}

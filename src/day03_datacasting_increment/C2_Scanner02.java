package day03_datacasting_increment;

import java.util.Scanner;

public class C2_Scanner02 {

	public static void main(String[] args) {
		// soru7 kulanicidan ismini alip bas harfini yazdir
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen isminizi giriniz");
		char ilkHarf=scan.next().charAt(0);
		System.out.println("girdiginiz kelimenin ilk harfi: "+ilkHarf);
		
		
	}

}

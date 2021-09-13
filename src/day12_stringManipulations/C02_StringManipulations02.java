package day12_stringManipulations;

import java.util.Scanner;

public class C02_StringManipulations02 {

	public static void main(String[] args) {
		/*
		 * Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
 			isim-soyisim : M***** B*******
 			kart no : **** **** **** 1234
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Adinizi Girin: ");
		String isim=scan.nextLine();
		System.out.println("Lutfen soyadinizi Girin: ");
		String soyisim=scan.nextLine();
		System.out.println("Lutfen kart numaranizi Girin: ");
		String kkNo=scan.nextLine();
		
		String isimDuzenleme=isim.substring(0,1).toUpperCase()+//ilk harf buyuk olarak verir
							 isim.substring(1).replace("\\W", "*");//ilk harften sonraki tum harfleri *'a cevirir
		
		String soyisimDuzenleme=soyisim.substring(0,1).toUpperCase()+//ilk harf buyuk olarak verir
							 soyisim.substring(1).replace("\\S", "*");//ilk harften sonraki tum harfleri *'a cevirir
	
		String kkNoDuzenleme="**** **** **** "+kkNo.substring(15);
		
		System.out.println("isim- soyisim : "+ isimDuzenleme+" "+soyisimDuzenleme+
				"\nkart no : "+kkNoDuzenleme);
	}
	

}

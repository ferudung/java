package day42_Exception;

import java.util.Scanner;

public class Exceptions010 {

	public static void main(String[] args) {
		/*
		 Soru: Kullanicidan yasini girmesini isteyin. 
		 Kodunuzu kullanici sifirdan kucuk bir sayi girerse 
		 Exception verecek sekilde yazin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("sayi giriniz: ");
		int age = scan.nextInt();
		
		//1. yol try-catch kullanmadan
		//bana gore hata olan seyleri yazdirmak icin 
		//ozel istenmeyen durumlari belirtiyoruz
		//benim istemediğim IllegalArgumentException diyebelirtiyorum
		//projelerin menfaatleri dogrultusunda bunlari kullanacagz ilerde
	/*	if (age>=0) {
			System.out.println("yasiniz :"+age);
		}else {
			
			throw new IllegalArgumentException();//exception firlatilir code kirilir
												//kendi belirlediğin bir durum icin hata firlattı 
		}
		*/
		//1. yol try-catch kullanarak
		try {
			if (age>=0) {
				System.out.println("yasiniz :"+age);
			}else {
				
				throw new IllegalArgumentException();//exception firlatilir code kirilmaz
													//kendi belirlediğin bir durum icin hata firlattı 
			}
			
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			
		}
		System.out.println("");
		System.out.println("bu yaziyi okuyorsan kod hatasiz calışmıştır");
	}
	
}

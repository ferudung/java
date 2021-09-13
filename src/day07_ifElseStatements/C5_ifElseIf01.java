package day07_ifElseStatements;

import java.util.Scanner;

public class C5_ifElseIf01 {

	public static void main(String[] args) {
		/*
		 Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin
		eger uzunluklardan birisi 0 veya daha kucukse
	    "gecerli uzunluk giriniz" yazdirin,
		 uzunluklarin ikisi de pozitif ise
		 dikdortgenin kare olup olmadigini yazdirin
		 
		 */
		Scanner scan =new Scanner (System.in);
		System.out.println("lutfen dikdortgenin kenatlarini girin \nilk kenari girince ENTER a basin");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("karedir");
			
		}
		else {
			System.out.println("kare degildir");
		}
			
	
	
	}

}

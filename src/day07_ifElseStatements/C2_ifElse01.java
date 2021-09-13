package day07_ifElseStatements;

import java.util.Scanner;

public class C2_ifElse01 {

	public static void main(String[] args) {
		// 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin


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

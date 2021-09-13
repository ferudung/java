package day14_MethodCreationForLoop;

import java.util.Scanner;

public class C02_MethodCreation02 {

	public static void main(String[] args) {
		
		/*
		 *Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
		 * Kullanici 2,3 veya 4 degerini girerse, 
		 * kullanicidan bu sayilari girmesini isteyin 
		 * ve sayilarin toplamini yazdirin. 
		 * Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse 
		 * “Cok sayi girdiniz, ben toplayamam” yazdirin.
		 */

		Scanner scan = new Scanner(System.in);
	    System.out.print("kaç sayi toplamak istiyorsunuz: ");
	    int sayiAdeti=scan.nextInt();
	    
	    if (sayiAdeti<2) {
	    	System.out.println("toplamak icin en az 2 sayi girmelisiniz.");
		}else if (sayiAdeti==2) {
			ikiSayiTopla();
		}else if (sayiAdeti==3) {
			ucSayiTopla();
		}else if (sayiAdeti==4) {
			dortSayiTopla();
		}else {
			System.out.println("Cok sayi girdiniz, ben toplayamam");
		}
	    
	}

	public static void dortSayiTopla() {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen 2 tam sayi giriniz:");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int sayi3=scan.nextInt();
		int sayi4=scan.nextInt();
		System.out.println("dort sayi girmeyi tercih ettiniz" +
		"\nGirilen dort sayinin toplami: "+(sayi1+sayi2+sayi3+sayi4));
	}

	public static void ucSayiTopla() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen 2 tam sayi giriniz:");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int sayi3=scan.nextInt();
		System.out.println("uc sayi girmeyi tercih ettiniz" +
		"\nGirilen uc sayinin toplami: "+(sayi1+sayi2+sayi3));
		
	}

	public static void ikiSayiTopla() {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Lutfen 2 tam sayi giriniz:");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		System.out.println("iki sayi girmeyi tercih ettiniz" +
		"\nGirilen iki sayinin toplami: "+(sayi1+sayi2));
	}

}

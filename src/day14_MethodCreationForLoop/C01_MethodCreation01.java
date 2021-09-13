package day14_MethodCreationForLoop;

import java.util.Scanner;

public class C01_MethodCreation01 {
	public static void main(String[] args) {
	     /*
      Soru 1 ) Kullanicidan bir sayi alin. 
     - Bu sayinin tek mi cift mi oldugunu, 
     - sifirdan buyuk mu kucuk mu oldugunu, 
     - ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
     - 100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.
       */
      
       Scanner scan = new Scanner(System.in);
       System.out.print("litfen 1 tam sayi  giriniz : ");
       int sayi=scan.nextInt();
       
       tekMiCiftMi(sayi);
       sifirlaKarsilastir(sayi);
       istenenBasamaklariYazdir(sayi);
     

}

	public static void istenenBasamaklariYazdir(int sayi) {
		
		if (sayi<100) {
			System.out.println("Girilen Sayinın birler basamagi"+(sayi%10));
		}else {//sayi 100 den buyuk 455254
			int rakamlarToplami=0;
			int rakam=0;
			rakam=sayi%10;//4
			rakamlarToplami+=rakam;//4
			sayi/=10;//45525
			
			rakam=sayi%10;//5
			rakamlarToplami+=rakam;//9
			sayi/=10;//4552
			
			rakam=sayi%10;//2
			rakamlarToplami+=rakam;//11
			
			System.out.println("sayinin birler, onlar, yuzler basamagindaki rakamlar toplami :"+ rakamlarToplami);
			
			
		}
		
	}

	public static void sifirlaKarsilastir(int sayi) {
	
		if (sayi>0) {
			System.out.println("Girilen Sayi Pozitiftir.");
		}else if (sayi<0) {
			System.out.println("Girilen Sayi Negatiftir.");
		}else {
			System.out.println("0 pozitif yada negatif degildir.");
		}
		
	}

	public static void tekMiCiftMi(int sayi) {
		
		if (sayi%2==0) {
			System.out.println("Girilen Sayi Cifttir.");
		}else {
			System.out.println("Girilen Sayi Tektir.");
		}
	}
}
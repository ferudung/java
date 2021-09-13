package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C05_WhileLoops03 {

	public static void main(String[] args) {
		/*
		 Soru 4) Kullanicidan baslangic ve bitis haflerini alin 
		 ve baslangic harfinden baslayip bitis harfinde biten 
		 tum harfleri buyuk harf olarak ekrana yazdirin. 
		 Kullanicinin hata yapmadigini farz edin.
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println(" baslangic harfini girin :");
		char ilkHarf = scan.next().toUpperCase().charAt(0);
		System.out.println(" son harfini girin :");
		char sonHarf = scan.next().toUpperCase().charAt(0);
		
		char harf=ilkHarf;
		while (harf<=sonHarf) {
			System.out.print(harf+" ");
			harf+=1;
		}
	}

}

package day04_increment_matematiksel_islemler;

public class C03_PreDecrement_PostDecrement {

	public static void main(String[] args) {
		// main calass olustumayi için main ctrl space yap çıkar
		
		int sayi1=20;
		int sayi2=sayi1--;
		System.out.println("post decrement sayi1:"+sayi1);//19
		System.out.println("post decrement sayi1:"+sayi2);//20
		
		System.out.println(--sayi2);//19
		System.out.println(sayi2--);//19
		System.out.println(sayi2);//18

	}

}

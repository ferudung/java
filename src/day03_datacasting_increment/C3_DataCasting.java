package day03_datacasting_increment;

public class C3_DataCasting {

	public static void main(String[] args) {
		// Auto Widening (Otomatik Genisletme) kucuk bubyuk icine girer
		
		byte sayi1=17;
		System.out.println("byte degisken ile:"+sayi1);
		short sayi2=sayi1;//sayi2 diye bir variable olusturuldu vd deger olarak sayi1 in degeri atandi
		System.out.println("short degisken ile:"+sayi2);
		int sayi3=sayi2;
		System.out.println("int degisken ile:"+sayi3);
		long sayi4=sayi3;
		System.out.println("long degisken ile:"+sayi4);
		float sayi5=sayi4;
		System.out.println("float degisken ile:"+sayi5);
		double sayi6=sayi5;
		System.out.println("double degisken ile:"+sayi6);
		
	}

}

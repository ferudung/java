package day02_variables_scanner;

public class C01_Variables {

	public static void main(String[] args) {
		// 1. farkli 3 data turunde variable olustur ve bunlari yazdir
		   
		String kelime ="Merhaba";//satirdaki kod sonunda mutlaka ; kullanilmalidir
		System.out.println(kelime);//kelimenin variable oldugunu anlar ve variable in degerini yazdirir
		System.out.println("kelime");//kelime yazdirir
		
		int sayi=20;
		System.out.println(sayi);//20
		//yazdiriken basina aciklama eklemek istersem
		//girilen sayi : 20
		//eger degisken ve aciklamayi birlikte yazdirmak istersek 
		//"  aciklama " + variableIsmi
		System.out.println("girilen sayi :"+sayi);
		
		boolean tatilDeMi = true;
		System.out.println(tatilDeMi);
		// konsolda bu sene tatile gittin mi  = true  yazdirmak için
		
		System.out.println("tatile gittin mi :"+ tatilDeMi);
		/*
		 2- isim ve soyisim icin iki variable olustur ve bunlari
		    isminiz: Mehmet
		    soyisiminiz: Bulutluoz
		    seklinde yazdirin
		 */
		String name ="Mehmet";
		String surname="Bulut";
		System.out.println("isminiz:"+name );
		System.out.println("soyisminiz:"+surname);
		
		/*
		 3- iki farkli ramsayi data turundan 2 variable olusturun toplamini yazdirin
		 */
		int sayi1=10;
		byte sayi2=5;
		//toplama isleminin basına aciklama yazmak icin
		//toplam:15
		System.out.println("toplam:"+ (sayi1+sayi2));
		//string ve sayisal islemleleri birlikte yaptiginiz zaman islemi parantez icine alin
		
		//4- bir tmsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
		
		int sayi3=15;
		double sayi4=3.14;
		System.out.println(sayi3+sayi4);// 18.14
		System.out.println("toplam:"+(sayi3+sayi4));
		
		//5- char data turundan hic variable olusturun  ve yazdirin
		char karakter='?';
		System.out.println(karakter);
		System.out.println("girilen karakter:"+karakter);
	
		//6-bir tam sayi birde char degisken olustur ve bunlarin toplamini yazdirin
		int sayi5=20;
		char harf='M';
		
		System.out.println(sayi5+harf);
		//char data turundaki degiskenler matematiksel islemlerde kullanilirsa ASCII tablosu devreye girer
		//java o karakter yerine ASCII tablosus degerini kullanir
		
	}

}

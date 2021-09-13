package day03_datacasting_increment;

public class C5_Odev {

	public static void main(String[] args) {
		// Soru 2 ) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin
		int rakam1=10;
		System.out.println("integer rakam edegeri= "+rakam1);
		short rakam2=(short) rakam1;
		System.out.println("short rakam degeri =" +rakam2);
		byte rakam3=(byte) rakam2;
		System.out.println("byte rakam degeri =" +rakam3);
		
		
		//Soru 3 ) Float data turunde bir variable olusturun ve yazdirin
		float sayi1=3.14f;
		System.out.println("float sayi degeri ="+sayi1);
		
		//Soru 4) double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip yazdirin
		double num1=255.36;
		System.out.println("double sayi degeri= "+num1);//255.36
		int num2=(int) num1;
		System.out.println("integer sayi degeri= "+num2);//255
		byte num3=(byte) num2;
		System.out.println("byte sayi degeri= "+num3);//255-(127+128)=-1
		
		//Soru 5 ) int 2 sayiyi birbirine boldurun ve sonucu yazdirin
		int nmbr1=20;
		int nmbr2=10;
		System.out.println(nmbr1/nmbr2);//2
		
		//Soru 6 ) int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
		int rkm1=10;
		double rkm2=3.14;
		System.out.println(rkm1/rkm2);//3.184713375796178
		
		//Soru 7 ) Farkli data tipleri ile islem yapip, sonuclarini yazdiralim
		float no1=4.30f;
		int no2=4;
		double no3=2.15;
		System.out.println((no1/no3)+no2);//6.00000008871389
		int no4 = (int) ((no1/no3)+no2);
		System.out.println("islem sonucu= "+no4);
	}

}

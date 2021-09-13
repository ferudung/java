package day03_datacasting_increment;

public class C4_DataCasting02 {

	public static void main(String[] args) {
		// 	Explicit Narrowing (Manuel Daraltma)
		
		double sayi1=3.14;
		System.out.println("double sayi="+sayi1);
		int sayi2=(int)sayi1;
		System.out.println("integer sayi="+sayi2);
		//java da explicit narrowing data casting yapilirken data kayiplari olabilir
		byte sayi3=(byte) sayi2;
		System.out.println("byte sayi= "+sayi3);
		//hatta data daha kucuk data turune uyması ıcın degistirilebilir
		
		
		int sayi4=95;
		int sayi5=10;
		System.out.println("bolme sonucu: "+sayi4/sayi5);//9
		//bolunen sayi ve bolen sayi ikisi de int ise java sonucu int olarak verir
		
		double sayi6=2000;
		System.out.println(sayi6/sayi5);//200.0
		
		double sayi7=5;
		System.out.println(sayi4/sayi7);//19.0
		
	}

}

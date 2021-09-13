package day36_Inheritance;

public class Memur extends Muhasebe {

	public static void main(String[] args) {
		// kodun üstüne gelip ctrl + open declaration 
		// dersek kodun nerden geldiğini bulur
		Memur m1= new Memur();
		Memur m2= new Memur();
		
		Isci obj1 = new Isci();
		obj1.i=20;
		
		
		m2.isim="ferudun";
		m2.soyisim="gogus";
		m2.adres="esencilis";
		m2.saatUcreti=25;
		m2.statu="chef";
		m2.tel="661663";
		m2.id=m2.idAta();
		m2.maas=m2.maasHesapla();
		
		System.out.println(m2.isim + "\n" + m2.soyisim+ 
				"\n" +m2.tel+ "\n" + m2.adres + "\n" + m2.saatUcreti 
				+ "\n" +m2.id + "\n" + m2.maas);
		
		
		m1.isim="Cumali";
		m1.soyisim="Korkmaz";
		m1.adres="Falan feşmekan";
		m1.saatUcreti=20;
		m1.statu="chef";
		m1.tel="12345";
		m1.id=m1.idAta();
		m1.maas=m1.maasHesapla();
		
		System.out.println(m1.isim + "\n" + m1.soyisim+ 
				"\n" +m1.tel+ "\n" + m1.adres + "\n" + m1.saatUcreti 
				+ "\n" +m1.id + "\n" + m1.maas);
	}
}

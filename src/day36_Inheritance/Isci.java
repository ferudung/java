package day36_Inheritance;

public class Isci extends Muhasebe{
	public int i=10;//aynı tip classlar arasında değişken kullanmak için 
					//değişkeni main metod dışında tanımlamak gerekli 
	
	
public static void main(String[] args) {
	Isci i1= new Isci();
	Isci i2= new Isci();
	
	
	
	i2.isim="ferudun";
	i2.soyisim="gogus";
	i2.adres="esencilis";
	i2.saatUcreti=25;
	i2.statu="chef";
	i2.tel="661663";
	i2.id=i2.idAta();
	i2.maas=i2.maasHesapla();
	
	System.out.println(i2.isim + "\n" + i2.soyisim+ 
			"\n" +i2.tel+ "\n" + i2.adres + "\n" + i2.saatUcreti 
			+ "\n" +i2.id + "\n" + i2.maas);
	
	i1.isim="ferudun";
	i1.soyisim="gogus";
	i1.adres="esencilis";
	i1.saatUcreti=25;
	i1.statu="chef";
	i1.tel="661663";
	i1.id=i1.idAta();
	i1.maas=i1.maasHesapla();
	
	System.out.println(i1.isim + "\n" + i1.soyisim+ 
			"\n" +i1.tel+ "\n" + i1.adres + "\n" + i1.saatUcreti 
			+ "\n" +i1.id + "\n" + i1.maas);

}
	
}

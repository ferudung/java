package day36_Inheritance._12_Inheritance._12_Inheritance;

public class Personel {
	
	public static int sayac=1000;
public	int id;
public	String isim;
public	String soyIsim;
public	String adres;
public	String tel;
	
public int  idAta() {
	this.id=++sayac;
	return id;
}
}

package day36_Inheritance._12_Inheritance._12_Inheritance;

public class Muhasebe extends Personel{
	
	public String statu;
	
	public int  saatUcreti;
	
	public int maas;
	
	public int maasHesapla() {
		maas=saatUcreti*8*30;
		
		return maas;
		
	}

}

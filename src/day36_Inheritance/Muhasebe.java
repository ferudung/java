package day36_Inheritance;

public class Muhasebe extends Personal {

	public String statu;
	public	int maas;
	public	int saatUcreti;
	
	public	int maasHesapla() {
		maas=saatUcreti*8*30;
		return maas;
	}
}

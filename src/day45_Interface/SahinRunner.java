package day45_Interface;

public class SahinRunner {

	public static void main(String[] args) {
		
		Sahin s1=new Sahin();
		s1.ayna();
		s1.ebat();
		s1.jant();
		s1.kapi();
		s1.kaporta();
		s1.koltuk();
		s1.motor();
		s1.sunroof();
		s1.yakit();
		System.out.println(IcDonanim.music);
		System.out.println(Sahin.music);
		//s1.kumas="deri"; final variable assigment yapılamaz
		
		System.out.println(IcDonanim.RENK);//ahsap
		System.out.println(DisDonamim.RENK);//metalik
		System.out.println(Lastik.RENK);//siyah beyaz yanakli
		System.out.println(s1.sisLamp());//obje ile parent interface den concreat method call ettim
	    System.out.println(DisDonamim.boya());//interface name ile parent interface den concreat method call ettim
		
	}

}

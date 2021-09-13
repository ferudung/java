package day11_stringManipulations;

import java.util.Scanner;

public class C01_StringManipulations01 {

	public static void main(String[] args) {
		/*
		 * kullanıcıdan bir kelime ve cumle alın
		 * cumlede kelime gecip gecmediğini kontrol edip ekrana yazdırın
		 */
		 Scanner scan=new Scanner(System.in);
	     System.out.println("Lutfen bir cumle giriniz");
	       String cumle=scan.nextLine();
	       System.out.println("Lutfen bir kelime giriniz");
	       String kelime=scan.next();
	    //cumlede kelimenin yazilip yazilmadığını yazdırın
	    //indexOf kullanalım
	       
	       if (cumle.indexOf(kelime)!=-1) {
			System.out.println("kelime cumlede kullanilmis");
		}else {
			System.out.println("kelime cumlede kullanilmamis");
		}
	     
	       //contains() kullanalım
	       
	       if (cumle.contains(kelime)) {
	    	   System.out.println("kelime cumlede kullanilmis");
		}else {
			System.out.println("kelime cumlede kullanilmamis");
		}
	}

}

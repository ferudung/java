package day42_Exception;

public class Exceptions06 {
public static void main(String[] args) {
	
	String str1=" ";//space
	String str2="";//hiclik
	String str3=null;//str3 variable nın hic bir degeri esit olmadığını belirten bir pointer(belirtec imlec)
					//null bir deger değildir ama konsola yazdirilir
	System.out.println(str1.length());//1
	System.out.println(str2.length());//0
	//System.out.println(str3.length());//NullPointerException unchecked:kendimiz ettik kendimiz bulduk Exception 'i(hatasi)
	System.out.println(str3+" erol taş");//null erol taş
	// interview System.out.println(str3.concat(" erol taş"));---> null olarak atanmıs bir obj uygun olmayan 
	//bi islem yapilirsa java NullPointerException unchecked verir

}
}

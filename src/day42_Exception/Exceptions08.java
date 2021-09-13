package day42_Exception;

public class Exceptions08 {

	public static void main(String[] args) {
	
		
		int sayi=34;
		String str="1453";
		//String str1=sayi;//CTE --> checked exception ClassCast missmatch:uyumsuzluk
		
		int okulNo=Integer.parseInt(str);
		System.out.println(okulNo);//1453
		System.out.println(str+35);//145335
		System.out.println(okulNo+35);//1488
		
		String str1="14a3";
		//int strSayi=Integer.parseInt(str1);  NumberFormatException unchecked
		// un--->(r)un
		
		Object sayi3=45;//data type hz adem javanin tum clas larinin pareti
		String strSAyi2=(String)sayi3;//data Type Class casting buyuk veri kucuk konteynara  girdi
									//data type casting yaparken uygun olmayan islem
									//ClassCastException unchecked verir.
	}

}

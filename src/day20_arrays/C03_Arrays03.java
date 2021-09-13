package day20_arrays;

import java.util.Arrays;

public class C03_Arrays03 {

	public static void main(String[] args) {
// verilen bir arrayin buyukten kucuge sıralayan bir method yaziniz

		int arr[]= {3,15,10,11,9};
		//oncelikle arrayi kucuktenn buyuge sıralamalıyız
		arr= arrayiSirala(arr);
		System.out.println("siralanmış hali :"+Arrays.toString(arr));
		//System.out.println(Arrays.toString(arrayiTerstenSırala(arr))); //sonucu sadece yazdirdi

		arr=arrayiTerstenSırala(arr);
		System.out.println("Tersten siralanmış hali :"+Arrays.toString(arr));
	}

	private static int [] arrayiTerstenSırala(int[]arr) {
		
		int []temp=new int[arr.length];//eski array ile ayni uzunlukta bir array olusturdum
		for (int i = 0; i < temp.length; i++) {
			temp[i]=arr[arr.length-1-i];
			
		}
		return temp;
		//tem arrayi istedigim gibi arr nin ters siralamasi oldu 
		//bunu main method a dondurmem yani return lazim
	}

	public static int[]  arrayiSirala(int[]arr) {
		Arrays.sort(arr);
	
		return arr;
	}

}

package day42_Exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exceptions07 {

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4};
		
		
		System.out.println(arr[1]);//2
		System.out.println(arr[3]);//4
		//System.out.println(arr[5]);//ArrayIndexOutOfBoundsException unchecked
		
		List <String> gzlinsm= new ArrayList<>(Arrays.asList("merve","hakan","fırat"));
		System.out.println(gzlinsm.get(2));
		System.out.println(gzlinsm.get(0));
		//System.out.println(gzlinsm.get(5));//IndexOutOfBoundsException 
		
		//array ve listlerde olmayan bir index ile islem yapilirsa
		//java IndexOutOfBoundsException unchecked hatasi verir.

	}

}

package day43_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions011 {

	public static void main(String[] args) throws IOException {
	/*
	 -throws keyword u sadece declarataion'dır.
	 throws kullanilan methodda exception oluşursa CODE BLOCK olur.
	 -Exceptions arasında parent-child iliskisi varsa parent class
	 exception throw dan sonra yazilmalıdır
	 */
	
			FileInputStream fis =new FileInputStream(
					"C:\\Users\\acer\\eclipse-workspace\\java2021SummerTr\\src\\day43_Exception\\file");
		
		
        int i=0;
                   
          while ((i=fis.read())!=-1) {
               System.out.print((char)(i));
               }
		
         

}
	 
}
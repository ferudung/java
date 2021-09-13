package day43_Exception;

public class Mesaj extends Exception {

	private static final long serialVersionUID = 1L;

	Mesaj(String message) {// p'li const creat ettim ki bu class dan olusan
		// Object ile class'dan ve parent'inden field ve veriable call yapabilelim
		super(message);

	}

}

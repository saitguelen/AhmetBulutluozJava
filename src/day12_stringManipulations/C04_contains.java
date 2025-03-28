package day12_stringManipulations;

public class C04_contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//str.contains(baskastring)bir string'i icerip icermedigini kontrol eder.
		//boolean sonuc döndürür.
		//aranan String'in kac tane oldugunu bakmaz
		//sadece var mi yok mu onu kontrol eder.. 
		
		//mesela icinizde Ali Var mi?
		
		 String str = "Java ogrenen pisman olmaz.";

	        System.out.println(str.contains("a")); // true

	        System.out.println( str.contains( "a o")  ); // true

	        System.out.println(str.contains("J    o")); // false

	        System.out.println(str.contains("Java og")); // true

	}

}

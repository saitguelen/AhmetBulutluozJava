package day12_stringManipulations;

public class C01_substring_tekParametre {

	public static void main(String[] args) {
		
		 String str = "Java Candir";

	        System.out.println(  str.charAt(3)  ); // a
	        System.out.println(   str.substring(3)  );  // a Candir


	        System.out.println(   str.charAt(str.length() - 3)   ); // d
	        System.out.println(   str.substring(str.length() - 3)  );  // dir
	        
	        System.out.println(str.substring(4));


	        System.out.println(str.charAt(str.length() - 5));  // a
	        System.out.println(  str.substring(str.length()-5)); // andir //sondan bes karakteri yazdirir.

	        // "Java Candir"
	        // str'in sondan 4 karakterini yazdirin

	        System.out.println(  str.substring(  str.length()-4   )); // ndir
	        System.out.println(str.substring(str.length()-6)); //Candir



	        // charAt() ve substring() farkli davranabilir

	        System.out.println( str.charAt(str.length() - 1)); // r
	        System.out.println( str.substring(str.length()-1)); // r


	        // System.out.println( str.charAt(str.length())); // StringIndexOutOfBoundsException
	        System.out.println( str.substring(str.length())); // hiclik yazdirir ( bos bir satir)

	        System.out.println("Hello World");



	        // System.out.println( str.charAt(str.length() + 1)); // StringIndexOutOfBoundsException
	        //System.out.println( str.substring(str.length()+1)); // StringIndexOutOfBoundsException
	        //hata verir

	}

}

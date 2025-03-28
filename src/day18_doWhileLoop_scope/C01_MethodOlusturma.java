package day18_doWhileLoop_scope;

public class C01_MethodOlusturma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Verilen bir metni alip
        // metnin tersini donduren bir method olusturun

        System.out.println(getReverseText("Ali gel")); // leg ilA
        System.out.println(getReverseText("Java herseyi cözer"));

	}
	
	public static String getReverseText(String metin) {
		String tersMetin= "";
		for(int i=metin.length()-1;i>=0; i--) {
			tersMetin += metin.charAt(i);
		}
		
		return tersMetin;
	}

}

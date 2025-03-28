package day11_switchStatement_stringManipulations;
import java.util.*;
public class C08_SM_length {

	public static void main(String[] args) {
		/*
        Eger kodlarimizi yazarken
        index olarak DIREKT deger yazmak yerine
        verilen kelimeden alinan bilgiyi kullanirsak
        kodumuzu DINAMIK HALE getirmis oluruz

        boylece verilen str ne olursa olsun
        kodumuz sorunsuz calisir
     */
		String str = "Ali Yataruyuroglu";
		
		System.out.println(str.length());// bize str'daki karakter sayisini verir  17
		
		// son karakteri yazdirin
		
		System.out.println(str.charAt(str.length()-1)); //u
		
		System.out.println(str.charAt(17-1));//u
		
		System.out.println(str.charAt(16));//u
		
		// Kullanicidan ismini isteyin
        // ismin ilk ve son harflerini yan yana yazdirin
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen isminizi giriniz:  ");
		String str1 = scanner.nextLine();
		
		System.out.println("Isminizin ilk ve son harfi: ");
		System.out.print(str1.charAt(0));
		System.out.println(str1.charAt(str1.length()-1));
		
		System.out.println(""+ str1.charAt(0) + str1.charAt(str1.length()-1));

	}

}

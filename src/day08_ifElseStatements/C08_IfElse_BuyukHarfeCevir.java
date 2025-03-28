package day08_ifElseStatements;
import java.util.*;
public class C08_IfElse_BuyukHarfeCevir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen karakteri girildigi gibi yazdirin
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir karakter girin...");
		char krktr = scanner.nextLine().charAt(0);
		
 // 2. Character Wrapper Class
		
		if (Character.isLowerCase(krktr)) {
			System.out.println("Kücük harf girdiniz, büyük harf olarak yazilisi: ");
			System.out.println(Character.toUpperCase(krktr));
			
		}else {
			System.out.println("Kücük harf girdiniz..");
			System.out.println(krktr);
		}
		System.out.println("=========================================");
		
		// 1.ASCII table
		System.out.println("1.ASCII table ile yapilisi");
        if ( krktr >= 'a'  && krktr <= 'z'){
            // karakter kucuk harf ise
            System.out.println(  (char)(krktr - 32) );
        } else {
            // karakter kucuk harf degil ise
            System.out.println(krktr);

        }
       
	}

}

package day08_ifElseStatements;
import java.util.*;
public class C07_IfElse_BuyukHarfKontrolu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen bir karakter giriniz:..");
		char karakter = scanner.nextLine().charAt(0);
		
		 // 1.yontem ASCII table

        if ( karakter >= 'A' && karakter <= 'Z'   ){
            System.out.println("Buyuk harf");
        } else System.out.println("Buyuk harf degil");

     // 2.yontem Character Wrapper Class
        System.out.println("2.yontem Character Wrapper Class");
        
		if (Character.isUpperCase(karakter)) {
			System.out.println("Büyük harf");
		}else {
			System.out.println("büyük harf degil");
		}

	}

}

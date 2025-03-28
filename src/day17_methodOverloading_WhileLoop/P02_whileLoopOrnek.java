package day17_methodOverloading_WhileLoop;

import java.util.Scanner;

public class P02_whileLoopOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Kullanicidan toplanmak üzere sayilar isteyin ve toplam 500 olur veya gecerse toplami yazdirin
		
		Scanner scanner = new Scanner(System.in);
		
		int sayi =0;
		int toplam = 0;
		
		while(toplam<= 500) {
			System.out.println(" lütfen toplamak üzere sayi girin: ");
			sayi=scanner.nextInt();
			toplam += sayi;
		}
		
		System.out.println("Girilen sayi toplami: "+ toplam);

	}

}

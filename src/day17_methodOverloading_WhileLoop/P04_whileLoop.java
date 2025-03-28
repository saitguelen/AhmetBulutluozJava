package day17_methodOverloading_WhileLoop;

import java.util.Scanner;

public class P04_whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*

	    While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.


	    */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir pozitif sayi giriniz: ");
		int sayi1=scanner.nextInt();
		int sayi=sayi1;
		int rakamlarToplami=0;
		int rakam=0;
		while(sayi>0) {
			rakam=sayi%10;
			rakamlarToplami +=rakam;
			sayi= sayi/10;
			
			
			
		}System.out.println("Girilen "+sayi1+" sayinin rakamlar toplami: "+rakamlarToplami);
		
	}

}

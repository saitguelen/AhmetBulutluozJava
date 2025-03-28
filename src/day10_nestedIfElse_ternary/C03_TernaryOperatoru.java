package day10_nestedIfElse_ternary;
import java.util.Scanner;
public class C03_TernaryOperatoru {

	public static void main(String[] args) {
		//kullanicidan bir sayi alin
        // sayi cift ise "cift sayi",
        // sayi cift sayi degilse "tek sayi" yazdirin
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen bir sayi giriniz: ");
		int sayi=scanner.nextInt();
		
		if(sayi%2==0) {System.out.println("sayi cift sayi");
		}
		else {System.out.println("sayi tek sayidir");
		}
		
		 // ternary operatoru if else ile yapilabilen BASIT ISLEMLERI
        // daha kisa ve daha basit sekilde yazmamiza imkan tanir
		System.out.println("---------------------------------------------------");
        System.out.println( sayi % 2 == 0 ? "cift sayi" : "tek sayi" );

	}

}

package day09_ifElseIfStatements_nestedIfElse;
import java.util.*;
public class C01_SayiAnalizi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// kullanicidan pozitif bir tamsayi isteyin
        // kullanici
        // negatif sayi girerse uyarin
        // tek basamakli bir sayi girerse "girdiginiz sayi rakam"
        // kullanici 10-99 arasinda (sinirlar dahil) sayi girerse "iki basamakli sayi"
        // kullanici 100-999 arasinda (sinirlar dahil) sayi girerse "uc basamakli sayi"
        // kullanici 1000 veya daha buyuk sayi girerse "cok buyuk sayi" yazdirin
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayi  giriniz.. ");
		double sayi = scanner.nextDouble();
		
		if (sayi<0) {
			System.out.println("Negatif sayi girdiniz!,  lütfen pozizif bir sayi giriniz");
			
		}else if(sayi<10) {
			System.out.println("\"girdiginiz sayi rakam\"");
		}else if(sayi<100) {
			System.out.println("\"iki basamakli sayi\"");
		}else if(sayi<1000) {
			System.out.println("uc basamakli sayi");
			
		}else  {
			System.out.println( "cok buyuk sayi");
		}
	}

}

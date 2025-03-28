package day10_nestedIfElse_ternary;
import java.util.*;
public class C06_TernaryIleYapilacakSorular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Verilen bir notu kontrol edip
        // 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.
		Scanner scanner= new Scanner(System.in);
		System.out.println("lütfen notunuzu giriniz: ");
		int not = scanner.nextInt();
		
		System.out.println(not >50 ? "Sinifi gectin" : "Maalesef kaldin");
		System.out.println("----------------------------");
		
		// Verilen iki tamsayidan buyuk olmayan sayiyi yazdirin

        int sayi1 = 980;
        int sayi2 = 970;
        
        System.out.println(sayi1> sayi2 ? sayi2 : sayi1);
        System.out.println("----------------------------");
     // Verilen iki tamsayidan buyuk olmayan sayiyi yazdirin

        // verilen sayi icin
        // 3'un kati veya 3'un kati degil seceneklerinden
        // uygun olani yazdirin

        int sayi = 1765;
        
        System.out.println(sayi % 3==0 ? "3' ün kati" : "3'ün kati degil");
        System.out.println("----------------------------");
        
        
        Scanner dsg= new Scanner(System.in);
		System.out.println("lütfen bir sayi giriniz: ");
		int say = dsg.nextInt();
		
		System.out.println(say %4 ==0 ? "4'ün kati" : "4'ün kati degil");
		
		

	}

}

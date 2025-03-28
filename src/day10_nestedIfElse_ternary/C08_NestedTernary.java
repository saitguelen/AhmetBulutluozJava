package day10_nestedIfElse_ternary;
import java.util.*;
public class C08_NestedTernary {

	public static void main(String[] args) {
		// Kullanicidan bir tamsayi isteyin
        // pozitif, negatif veya notr seceneklerinden uygun olani yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();
        
        System.out.println(sayi >0 ? "pozitif" : "Burasi negatif veya notr olabilir" );

        System.out.println(sayi >0 ? "pozitif" : (sayi<0 ? "Negatif" : "nötr yani sifir"));
        
        System.out.println(sayi >0 ? "pozitif" : sayi<0 ? "Negatif" : "nötr yani sifir");//parantezleri kaldirinca da calisir
	}

}

package day09_ifElseIfStatements_nestedIfElse;
import java.util.Scanner;
public class C06_CokluDegisken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kullanicidan aldigi urun adedini ve indirimsiz birim fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //                        az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                        az alirsa %10 indirim yapin
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Aldiginiz ürün adedini giriniz: ");
		int adet = scanner.nextInt();
		System.out.print("Aldiginiz ürünün fiyatini giriniz: ");
		double fiyat= scanner.nextDouble();
		System.out.print("müsteri kartiniz var mi?.. E:Evet, H: Hayir: ");
		char kart= scanner.next().toUpperCase().charAt(0);
		
		
		double indirimisizToplamFiyat  = adet*fiyat;
		if( kart=='E' && adet>10) System.out.println("10'dan fazla ürün aldiginiz icin %20 indirim ile toplam fiyat "+ indirimisizToplamFiyat*80/100+ "€ dur");
		else if( kart=='E') System.out.println("10'dan az ürün aldiginiz icin %10 indirim ile toplam fiyat "+ indirimisizToplamFiyat*90/100+ "€ dur");
		else if( kart=='H' && adet>10) System.out.println("10'dan fazla ürün aldiginiz icin %15 indirim ile toplam fiyat "+ indirimisizToplamFiyat*85/100+ "€ dur");
		else if( kart=='H') System.out.println("10'dan az ürün aldiginiz icin %5 indirim ile toplam fiyat "+ indirimisizToplamFiyat*95/100+ "€ dur");
		else 
			System.out.println("Girilen deger hesaplanamiyor!!!");
	}

}

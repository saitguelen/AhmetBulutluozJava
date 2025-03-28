package day09_ifElseIfStatements_nestedIfElse;
import java.util.Scanner;
public class C08_NestedIfElse_Indirim {

	public static void main(String[] args) {
		// Kullanicidan aldigi urun adedini ve indirimsiz birim fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //                        az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                        az alirsa %5 indirim yapin
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen ürün adedini yazin: ");
		int adet = scanner.nextInt();
		System.out.print("Lütfen ürün fiyatini yazin: ");
		double fiyat= scanner.nextDouble();
		System.out.print("Müsteri kartiniz var mi?...E:Evet, H:Hayir..: ");
		char kart= scanner.next().toUpperCase().charAt(0);
		double topFiy = adet*fiyat;
		// musteri karti olanlar bolgesi
		if(kart=='E') {
			if(adet>10) System.out.println("10'dan fazla ürün aldiginiz ve müsterimiz oldugunz icin %20 indirim ile toplam ödeyeceginiz tutar "+ topFiy*80/100+ " liradir" );
			else if (adet>0) System.out.println("10'dan az ürün aldiginiz ve müsterimiz oldugunuz icin %15 indirim ile toplam ödeyeceginiz tutar: "+topFiy*85/100+" liradir" );
			 else // adet olarak 0 veya negatif deger girenler
	                System.out.println("urun adedi olarak pozitif bir deger girmelisiniz...");
		}else if(kart=='H' ) {
			
			if(adet>10) System.out.println("10'dan fazla ürün aldiginiz icin %15 indirim ile toplam ödeyeceginiz tutar "+ topFiy*85/100+ " liradir" );
			else if (adet>0) System.out.println("10'dan az ürün aldiginiz icin %5 indirim ile toplam ödeyeceginiz tutar: "+topFiy*95/100+" liradir" );
			 else // adet olarak 0 veya negatif deger girenler
	                System.out.println("urun adedi olarak pozitif bir deger girmelisiniz...");
		}else {
			System.out.println("kart var mi sorusuna girilen deger HATALI...");
		}

	}

}

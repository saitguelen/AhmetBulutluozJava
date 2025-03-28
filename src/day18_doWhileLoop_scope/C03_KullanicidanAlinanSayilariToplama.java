package day18_doWhileLoop_scope;

import java.util.Scanner;

public class C03_KullanicidanAlinanSayilariToplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // kullanicidan toplanmak uzere tamsayilar isteyin
        // kullanici 0'a basincaya kadar islemi devam ettirin
        // kullanici 0'a bastiginda (0 haric)
        // kac sayi girdigini ve toplamlarinin kac oldugunu yazdirin


        Scanner scanner = new Scanner(System.in);

        int girilenSayi ;
        int toplam = 0;
        int sayac = 0;



//        while (girilenSayi != 0){ // loop calismaz yukarida biz girilen deger 0 dedigimiz icin loop calismadan biter
//
//            System.out.println("Lutfen toplanmak uzere bir sayi giriniz...\nbitirmek icin 0'a basiniz");
//            girilenSayi = scanner.nextInt();
//
//            if (girilenSayi != 0){
//
//                toplam += girilenSayi;
//                sayac++;
//            }
//        }


        // bizim ilk atama yaptigimiz degeri while kontrolune sokmadan
        // kullanicidan deger aliyor,
        // boylece ilk deger atamasi yaparken hata yapmamizi engelliyor

        do {
            System.out.println("Lutfen toplanmak uzere bir sayi giriniz...\nbitirmek icin 0'a basiniz");
            girilenSayi = scanner.nextInt();

            if (girilenSayi != 0){
                toplam += girilenSayi;
                sayac++;
            }


        }while (girilenSayi != 0);


        System.out.println("Girilen " + sayac + " adet sayinin toplami : " + toplam);


	}

}

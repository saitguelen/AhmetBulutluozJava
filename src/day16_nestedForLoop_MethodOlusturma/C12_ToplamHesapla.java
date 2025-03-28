package day16_nestedForLoop_MethodOlusturma;

public class C12_ToplamHesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// verilen iki tamsayi ve aralarindaki tum tamsayilari toplayip
        // sonucu donduren bir method olusturun

        araliktakiToplamiGetir(4,6);  // calisir ama , yazdirmadigimiz icin goremeyiz
                                                  // kaydetmedigimiz icin kullanamayiz

        System.out.println(araliktakiToplamiGetir(8, 10)); // 27
                            // yazdirir ama tekrar kullanamayiz

        int ikiBasSayilarToplami = araliktakiToplamiGetir(10,99);
                    // yazdirmadigimiz icin konsolda gormeyiz
                    // ama istedigimiz zaman yazdirabilir veya kullanabiliriz
        System.out.println("iki basamakli sayilar toplami: "+ ikiBasSayilarToplami);

        // iki basamakli sayilarin toplaminin asal olup olmadigini yazdirin

        C11_AsalSayiMi.asalMiYazdir(ikiBasSayilarToplami); // false
        
        System.out.println(araliktakiToplamiGetir(12,23));
        
        C11_AsalSayiMi.asalMiYazdir(araliktakiToplamiGetir(12,23));




    }


    public static int araliktakiToplamiGetir(  int baslangic, int bitis  ){

        int toplam = 0;

        if (baslangic < bitis){

            for (int i = baslangic; i <=bitis ; i++) {

                toplam += i;
            }


        }else {

            for (int i = baslangic; i >=bitis ; i--) {

                toplam += i;
            }

        }

        return toplam;


	}

}

package day15_forLoop;

import java.util.Scanner;

public class C03_AradakiSayilarinToplami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucukse,
        //        uyari yazdirip islemi sonlandirin

		int toplam=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen baslangic degeri icin pozitif bir sayi girin..");
        int baslangic = scanner.nextInt();
        System.out.println("Lütfen bitis degeri icin pozitif bir sayi girin..");
        int bitis = scanner.nextInt();
        
        if(bitis<baslangic) {
        	System.out.println("!!Bitis degeri baslangictan kücük oldu, Program sonlandirildi");
        	
        }else {
        	for (int i = baslangic; i<=bitis; i++) {
        		toplam +=i;
        	}System.out.println("baslangic ve bitis sayilari dahil aradaki sayilarin toplami: "+ toplam);
        }

	}

}

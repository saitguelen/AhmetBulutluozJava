package day18_doWhileLoop_scope;

import java.util.Scanner;

public class C02_DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // kullanicidan bir sayi alin
        // sayidan baslayarak 0'a kadar(0 haric) olan sayilari yazdirin
        // ornek input : 5    output : 5 4 3 2 1


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();




        // 1.negatif durum : loop body calisma sayisindan, daha fazla kontrol var

//        while (girilenSayi > 0){
//
//            System.out.print(girilenSayi + " ");
//            girilenSayi--;
//        }//do while döngüsünde basda kontrol olmaz ilk basda kod calisir sonra kontrol edilir





        // loop body calisma sayisi ile kontrol sayisi ayni

        do {

            System.out.print(girilenSayi + " ");
            girilenSayi--;

        }while (girilenSayi > 0);






	}

}

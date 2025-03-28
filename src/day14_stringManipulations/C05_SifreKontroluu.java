package day14_stringManipulations;
import java.util.*;
public class C05_SifreKontroluu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Soru 4 : Kullanicidan bir sifre isteyip,
        //         asagidaki sartlari kontrol edin
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali

		Scanner scanner= new Scanner(System.in);
		
		System.out.println("L�tfen sifrenizi giriniz...");
		
		String sifre = scanner.nextLine();
		
		int flag=10;
		
      //      - ilk harf kucuk harf olmali
		
		char ilkHarf = sifre.charAt(0);
		
		if( ! Character.isLowerCase(ilkHarf)) {
			System.out.println("Ilk harf k�c�k olmali");
			flag=11;
		}
		
     //         - son karakter rakam olmali
		
		char sonKarakter=sifre.charAt(sifre.length()-1);
		
		if (sonKarakter<'0' || sonKarakter>'9') {
			System.out.println("Son karakter rakam olmali!!");
			flag=11;
		}
     //         - sifre bosluk icermemeli
		
		if(sifre.contains(" ")) {
			
			System.out.println("Sifre bosluk icermemeli!!");
			flag=11;
		}
		
     //         - uzunlugu en az 10 karakter olmali
		
		if(sifre.length()<10) {            //veya if (  !(sifre.length() >= 10)  ){
			System.out.println("Sifre en az 10 karakter olmali!!");
			flag=11;
		}
		
		 /*
        Sona gelindiginde, flag 10 veya 11 degerini alabilir
        flag == 10 ==> hic bir hata mesaji yazdirilmadi demektir
        flag == 11 ==> hata mesaji yazdirildi, ama kac mesaj yazdirildigini bilemeyiz
     */
		
		if(flag==10) {
			System.out.println("Sifre basari ile kaydedildi");
		}

	}

}

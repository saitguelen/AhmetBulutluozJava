package day13_stringManipulations;

import java.util.*;

public class C03_Soru {

	public static void main(String[] args) {
		
		
		// Kullanicidan bir cumle ve cumlede aratilacak bir metin isteyin
        // girilen cumle ve metin'e gore asagidaki 3 sonucdan uygun olani yazdirin
        // 1- cumle aranan metni icermiyor
        // 2- cumle aranan metni sadece 1 adet iceriyor
        // 3- cumle aranan metni 1'den fazla iceriyor
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen bir metin giriniz: ");
		
		String metin = scanner.nextLine();
		System.out.print("Lütfen yukarida yazdiginiz metinde aranacak kelimeyi yaziniz: ");
		
		String kelime = scanner.nextLine();
		
		int kelimeIlkIndex= metin.indexOf(kelime);
		int kelimeIkinciIndex=metin.indexOf(kelime, kelimeIlkIndex+1);
		
		if (kelimeIlkIndex==-1) {
			System.out.println("cumle aranan metni icermiyor");
		}else if(kelimeIkinciIndex == -1) {
			System.out.println("cumle aranan metni sadece 1 adet iceriyor");
		}else {
			System.out.println("Aradiginiz metin cumlede 1'den fazla kere kullanilmis");
		}

	}

}

package day11_switchStatement_stringManipulations;

import java.util.Scanner;

public class C03_SayiyiYaziyaCevirme {

    public static void main(String[] args) {

        // kullanicidan bir rakam isteyin
        // girilen rakami yazi ile yazdirin
        // orn input : 7 , output : yedi
        // 0-9 arasindaki sayilar disinda sayi yazarsa hata mesaji verin
    	boolean i = true;
    	while (i=true) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Lütfen bir rakam giriniz: ");
    	int rakam = scanner.nextInt();
    	
    	String mesaj = "  ";
    	
    	switch(rakam) {
    	case 0:
    		mesaj= "sifir";
    		break;
    	case 1:
    		mesaj= "Bir";
    		break;
    	case 2:
    		mesaj="Iki";
    		break;
    	case 3:
    		mesaj="Üc";
    		break;
    	case 4:
    		mesaj="Dört";
    		break;
    	case 5:
    		mesaj="Bes";
    		break;
    	case 6:
    		mesaj="Alti";
    		break;
    	case 7:
    		mesaj="Yedi";
    		break;
    	case 8:
    		mesaj="sekiz";
    		break;
    	case 9:
    		mesaj="Dokuz";
    		break;
    	default:
    		mesaj="Girilen sayi rakam degil..Beni kandiramazsin!!.";
    		
    		
    	}System.out.println(mesaj);
	}

}
}

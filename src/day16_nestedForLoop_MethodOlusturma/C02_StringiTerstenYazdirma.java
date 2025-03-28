package day16_nestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C02_StringiTerstenYazdirma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Kullanicidan bir String isteyin ve String’i tersten yazdirin.
        // orn input : Sabri output : irbaS


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();
        
        System.out.println("metnin tersten yazilisi: ");
        
        for (int i= metin.length()-1; i>=0; i--) {
        	System.out.print(metin.charAt(i));
        }

	}

}

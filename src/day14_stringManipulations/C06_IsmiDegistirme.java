package day14_stringManipulations;

import java.util.Scanner;

public class C06_IsmiDegistirme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Kullanicidan isim ve soyismini ayri ayri alin.
        //	- ismi daha uzun ise,
        //    isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        //  - soyisim daha uzun ise,
        //    ismi ilk harf buyuk digerleri kucuk, soyismin tamamini buyuk harflerle yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz...");
        String isim = scanner.nextLine();
        System.out.println("Lütfen Soyisminizi girin...");
        String soyisim= scanner.nextLine();
        
        
        //- ismi daha uzun ise,
        //    isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        
        if( isim.length()> soyisim.length()) {
        	System.out.println(
        			
        			isim.substring(0,1).toUpperCase()+
        			isim.substring(1).toLowerCase()+
        			" "+
        			soyisim.substring(0,1).toUpperCase()+
        			soyisim.substring(1).toLowerCase()+
        			".");
        	 //  - soyisim daha uzun ise,
            //    ismi ilk harf buyuk digerleri kucuk, soyismin tamamini buyuk harflerle yazdirin.
        	
        }else if( isim.length()< soyisim.length()) {  //burada else kullanmadik cünkü esitlik ile alakali bize bir sey soylememis dolayisiyla esitlikten kurtulmak icin else if kullaniriz
        	System.out.println(
        			isim.substring(0,1).toUpperCase()+
        			isim.substring(1).toLowerCase()+
        			" "+
        			soyisim.toUpperCase()+
        			"."
        			);
        }
        
	}

}

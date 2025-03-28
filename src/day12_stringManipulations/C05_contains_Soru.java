package day12_stringManipulations;

import java.util.Scanner;

public class C05_contains_Soru {

	public static void main(String[] args) {
		
		
		// kullanicidan bir metin isteyin
        // metin ev iceriyorsa "Ev gibisi var mi?",
        // metin is iceriyorsa "Calismak ne guzel",
        // metin hem ev hem is iceriyorsa "Evden calismak gibisi yok"
        // metin bu iki kelimeyi de icermiyorsa "Cok calismak lazim, coook" yazdirin
		//while(true) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("Lütfen bir metin giriniz: ");
		
		String str=scanner.nextLine();
		System.out.println(str.length());
		
		if(str.contains("ev" ) && str.contains("is")) {
			System.out.println("Evden calismak gibisi yok");
		}else if(str.contains("ev")) {
			System.out.println("Ev gibisi var mi?");
		}else if(str.contains("is")) {
			System.out.println("Calismak ne guzel");
		}else {
			System.out.println( "Cok calismak lazim, coook");
			System.out.println(str.substring(6, 10));
				
			}
		}

	}


//}

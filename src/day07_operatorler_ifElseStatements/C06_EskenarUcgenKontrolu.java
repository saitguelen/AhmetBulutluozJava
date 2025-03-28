package day07_operatorler_ifElseStatements;
import java.util.*;
public class C06_EskenarUcgenKontrolu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Ücgenin kenarlarini giriniz...");
		int knr1=scanner.nextInt();
		int knr2=scanner.nextInt();
		int knr3=scanner.nextInt();
		if (knr1>0 && knr2>0 && knr3>0) {
			
		
			if (knr1==knr2 && knr2==knr3) {
				
				System.out.println("Bu bir eskenar ücgendir...");
			}
			
		}

	}

}

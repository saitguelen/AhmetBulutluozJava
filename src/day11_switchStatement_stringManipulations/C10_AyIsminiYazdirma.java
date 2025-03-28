package day11_switchStatement_stringManipulations;
import java.util.*;
public class C10_AyIsminiYazdirma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen ögrenmek istediginiz ayin numarasini yazin ben de size ayi ve mevsimi gireyim: ");
		int ay= scanner.nextInt();
		
		String mesaj1 =" ";
		String mesaj2=" ";
		
		switch(ay) {
		
		case 1:
			mesaj1= "Ocak";
			mesaj2="\nKis";
			break;
			
		case 2:
			mesaj1= "Subat";
			mesaj2="\nKis";
			break;
			
		case 3:
			mesaj1= "Mart";
			mesaj2="\nBahar";
			break;
			
		case 4:
			mesaj1= "Nisan";
			mesaj2="\nBahar";
			break;
			
		case 5:
			mesaj1= "Mayis";
			mesaj2="\nBahar";
			break;
			
		case 6:
			mesaj1= "Haziran";
			mesaj2="\nYaz";
			break;
			
		case 7:
			mesaj1= "Temmuz";
			mesaj2="\nYaz";
			break;
			
		case 8:
			mesaj1= "Agustos";
			mesaj2="\nYaz";
			break;
			
		case 9:
			mesaj1= "Eylül";
			mesaj2="\nGüz";
			break;
			
		case 10:
			mesaj1= "Ekim";
			mesaj2="\nGüz";
			break;
			
		case 11:
			mesaj1= "Kasim";
			mesaj2="\nGüz";
			break;
			
		case 12:
			mesaj1= "Aralik";
			mesaj2="\nKis";
			break;
			
		default:
			mesaj1="Girdiginiz sayida bir ay yok";
			mesaj2="\nGirdiginiz sayida bir mevsim yok";
			
		}
		
		System.out.println(mesaj1);
		System.out.println(mesaj2);
		

	}

}

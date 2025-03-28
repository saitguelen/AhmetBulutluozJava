package day08_ifElseStatements;
import java.util.Scanner;
public class C05_IfElse_SinifGecme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdiri

		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie  bitte Ihre Note ein:  ");
		double not= scanner.nextDouble();
		if (not >= 50) {
			System.out.println("Sinifi gectin 🎉");
		}else {
			System.out.println("Maalesef kaldin ❌ ");
		}
	}

}

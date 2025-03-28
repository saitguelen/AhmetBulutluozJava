package day16_nestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C11_SekilUcgenOlursa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
        Kullanicidan satir sayisini alip
        asagidaki sekli olusturun

        *       ==> satir 1      sutunlar 1
        * *     ==> satir 2      sutunlar 1 2
        * * *   ==> satir 3      sutunlar 1 2 3
        * * * * ==> satir 4      sutunlar 1 2 3 4

     */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Lutfen satir sayisini giriniz...");
    int satirSayisi = scanner.nextInt();


    for (int i = 1; i <= satirSayisi ; i++) { // satirlari kontrol eder

        for (int j = 1; j <=i ; j++) { // her satirdaki sutunlari kontrol eder

            System.out.print("* ");

        }
        System.out.println("");
    }

	}

}

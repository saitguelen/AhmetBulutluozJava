package day16_nestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C12_Odev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /*
        Kullanicidan satir sayisini alip
        asagidaki sekli olusturun

            1
           1 1
          1 2 1
         1 2 2 1
        1 2 3 2 1
       1 2 3 3 2 1

     */
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("lütfen Satir sayisini giriniz..");
		
		int satir = scanner.nextInt();
		 for (int i = 1; i <= satir; i++) {
	            // Başlangıçtaki boşlukları yazdır
	            for (int j = 1; j <= satir - i; j++) {
	                System.out.print(" ");
	            }
	            
	            // Her satırdaki sayıları yazdır
	            for (int j = 1; j <= i; j++) {
	                // j değeri, o anki satırın yarısına kadar artar, sonra sabit kalır
	                int sayi = j <= (i+1)/2 ? j : i-j+1;//Ternary Operatörü
	                System.out.print(sayi + " ");
	            }
	            
	            System.out.println();
	        }
	        
	        scanner.close();
	        /*Bu kod:

				Tek bir iç döngü kullanarak her satırdaki tüm sayıları yazdırır
				Ternary operatör (? :) kullanarak sayının artıp artmayacağını veya azalacağını belirler
				Her satırın ortasına kadar sayılar artar, sonra azalır veya aynı kalır
				Tek/çift satır kontrolü yapılmadan desen doğru şekilde oluşturulur*/
		
	        /*for (int i = 1; i <= satir; i++) {//satirlar
            // bosluklari yazariz
            for (int j = 1; j <= satir - i; j++) {
                System.out.print(" ");
            }
            
            // For odd rows: 1, 1 2 1, 1 2 3 2 1, ...
            if (i % 2 == 1) {
                int middle = (i + 1) / 2;
                
                // Print increasing numbers
                for (int j = 1; j <= middle; j++) {
                    System.out.print(j + " ");
                }
                
                // Print decreasing numbers
                for (int j = middle - 1; j >= 1; j--) {
                    System.out.print(j + " ");
                }
            } 
            // For even rows: 1 1, 1 2 2 1, 1 2 3 3 2 1, ...
            else {
                int middle = i / 2;
                
                // Print increasing numbers
                for (int j = 1; j <= middle-1; j++) {
                    System.out.print(j + " ");
                }
                
                // Print the middle number twice
                System.out.print(middle + " " + middle + " ");
                
                // Print decreasing numbers
                for (int j = middle - 1; j >= 1; j--) {
                    System.out.print(j + " ");
                }
            }
            
            System.out.println();
        }
        
        scanner.close();*/
    }
}
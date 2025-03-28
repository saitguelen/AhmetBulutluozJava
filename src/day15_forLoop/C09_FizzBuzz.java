package day15_forLoop;

import java.util.Scanner;

public class C09_FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
		for(char i ='f'; i>'a';i--) {
			System.out.print(i+ " ");
			i--;  //burada iki kere i-- girilmis normalde alttaki olmasa
					// kodumuz f e d c b diye cikti vermesi lazimdi ama
			           //ikiciyide yazinca iki kere azaltir bir atlayarak cikti verir yani: f d b	olur 
			
		}
		System.out.println();
		
		//2.Übung
		for(int i =1; i<=5;i++) {
			for(int j=(5-i);j>1; j--) {
				System.out.print(i+j);
			}System.out.println();
		}
		
		// Kullanicidan pozitif bir sayi alin,
        // 1’den baslayarak o sayiya kadar tum tamsayilari yazdirin, sira
        //	- 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        //	- 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        //	- hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin

        // 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzBuzz

		System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi girin");
        int girilensayi = scanner.nextInt();

        for (int i = 1; i <=girilensayi ; i++) {

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("fizz ");
            } else if (i % 5 == 0) {
                System.out.print("buzz ");
            }else { // 3 veya 5' e bolunmeyenler
                System.out.print( i + " ");
            }


        }

	}

}

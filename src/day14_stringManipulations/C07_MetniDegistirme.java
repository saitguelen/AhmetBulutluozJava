package day14_stringManipulations;

import java.util.Scanner;

public class C07_MetniDegistirme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//  Kullanicidan bir String alin,
        //  String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        //  String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();
        
        if(metin.length()%2==0) {
        	System.out.println(
        			metin.substring(0,metin.length()/2)+
        			":)"+
        			metin.substring(metin.length()/2)
        			);
        }else {
        	System.out.println(
        			
        			metin.substring(0,metin.length()/2)+
        			":("+
        			metin.substring(metin.length()/2+1)  //neden arti 1 yazdik cünkü bizden ortadaki harfi silmemizi istedi dolaysiyla 
        			                                     // uzunluk bölü 2 arti 1 den baslar
        			
        			);
        }
	}

}

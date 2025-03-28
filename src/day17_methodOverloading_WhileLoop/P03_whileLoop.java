package day17_methodOverloading_WhileLoop;

public class P03_whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /*
	      While loop kullanarak 2 basamakli
	      7 ile bolunebilen pozitif tamsayilari yazdirin.

	    */

	        //while  ile yaptığımız için
	        //başlangıç, bitiş değerini ve artış miktarını belirlemeliyiz
		
		int sayi =10;
		System.out.println("7 ile bölünebilen sayilar: ");
		while(sayi<100) {
			if(sayi%7==0) {
				System.out.print(sayi +" ");	
				
			}
			sayi++;
		}
		
		   /*
        While loop kullanarak 2 basamakli
        7 ile bolunebilen pozitif tamsayilarin toplamını yazdirin.
      */

		
		System.out.println();
		
		int toplam=0;
		int sayi2=10;
		while(sayi2<100) {
			if (sayi2%7==0) {
				toplam += sayi2;
				
			}sayi2++;
			
		}System.out.println("7 ile bölünen iki basamakli sayilar toplami: "+toplam);


	}
	

}

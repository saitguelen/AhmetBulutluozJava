package day18_doWhileLoop_scope;

public class C08_Hastane {
	
	static String hastaneIsmi  = "Yildiz Hastanesi";
    static String hastaneAdresi = "Yenimahalle";
    static String bashekim = "Doktor Ali";


    String perIsmi= "Isim atanmadi";
                                      //Static yazmadi isek instance oldugunu java anlar herkes icin farkli 
                                      //olan degerlere isim atamaya gerek yok
    String perAdres= "Adres atanmadi";
    String perTel= "Telefon atanmadi";
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C08_Hastane per1 =new C08_Hastane();
		
		System.out.println(per1.perIsmi);//Isim atanmadi
		System.out.println(per1.perAdres);//Adres atanmadi
		System.out.println(per1.perTel);//Telefon atanmadi
		
		per1.perIsmi= "Hamza";
		per1.perAdres= "Balgat";
		per1.perTel= "1234567896";
		
		System.out.println(per1.perIsmi);  //Hamza
		System.out.println(per1.perAdres);//Balgat
		System.out.println(per1.perTel);//1234567896
		
		C08_Hastane per2 =new C08_Hastane();//yeni obje olusturdugumuzda java hemen yukaridaki yazdiklarimizi 
		                                    //hemen buraya yapistirir.
		
		
		System.out.println(per2.perAdres);//Adres atanmadi
		System.out.println(per2.perIsmi);//Isim atanmadi
		System.out.println(per2.perTel);//Telefon atanmadi  diye yine yukarida ilk yazdzgimiz string otomatik atar
		
		//simdi atama yapalim
		
		per2.perIsmi="Cansu";
		per2.perAdres="Yenimahalle";
		per2.perTel="05323245676";
		
		//simdi  yazdirisak yukaridaki bilgileri girer
		
		System.out.println(per2.perAdres);//Yenimahalle
		System.out.println(per2.perIsmi);//Cansu
		System.out.println(per2.perTel);//05323245676
		
		System.out.println(per1.perAdres);//Balgat
		System.out.println(per2.perAdres);//Yenimahalle
		
		//3. personeli olusturmak istersek Java hemen yeni obje olusturur 
		//ve uzerine class level deki instance vaiablaleleri yapistirir.
		
		
		C08_Hastane per3=new C08_Hastane();
		
		
		System.out.println(per3.perAdres);//Adres atanmadi
		System.out.println(per3.perIsmi);//Isim atanmadi
		System.out.println(per3.perTel);//Telefon atanmadi yine ilk instance haline döndük
		
		//System.out.println(perIsmi); //direk yazamayiz, cünkü bunlar instance ama biz static deyiz,
		                             //ve static instance kabul etmez, direk kullanamyiz
		
		//mesela Cansu Cankaya ya tasindi
		//yani per2 adresini cankaya yapicaz
		
		per2.perAdres="Cankaya";  //yani cansu artik Yeni mahalle yerine Cankaya yazar.
		
		System.out.println(per2.perAdres); //Cankaya
		System.out.println();
		
		System.out.println(per2.perAdres);//Yenimahalle degil Cankaya
		System.out.println(per2.perIsmi);//Cansu
		System.out.println(per2.perTel);//05323245676
		System.out.println(per2.hastaneIsmi);//Yildiz Hastanesi//burasi genel yani static oldugu icin herkes de aayni olur.
		System.out.println(per1.hastaneIsmi);//Yildiz Hastanesi
		
		per2.hastaneIsmi="java hastanesi"; //Sadece bir personalde bile static degisirsek herkesde degisir
		
		System.out.println(per2.hastaneIsmi);//artik hastanemizin isi Yildiz Hastanesi degil java hastanesi
		System.out.println(per1.hastaneIsmi);//java hastanesi
		
		
		
		
		
		
		

	}

}

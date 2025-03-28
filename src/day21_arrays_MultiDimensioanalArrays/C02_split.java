package day21_arrays_MultiDimensioanalArrays;

import java.util.Arrays;

import day20_arrays.C01_ElemanArama;
import day20_arrays.C04_EnUzunEnKisaKelime;

public class C02_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str = "Java gun gectikce daha da guzellesiyor";

	        // cumledeki en kisa ve en uzun kelimeyi yazdirin

	        String[] kelimeler = str.split(" ");

	        System.out.println(Arrays.toString(kelimeler));

	        //  [Java, gun, gectikce, daha, da, guzellesiyor]

	        C04_EnUzunEnKisaKelime.enKisaVeEnUzunuYazdir(kelimeler);
	        // Array'deki en kisa kelime : da
	        // Array'deki en uzun kelime : guzellesiyor
	        // Esit uzunlukta olan kelimeler gozardi edilmistir



	        // "Java gun gectikce daha da guzellesiyor"

	        String[] aDanAyir = str.split("a");

	        System.out.println(Arrays.toString(aDanAyir));
	        //  [J, v,  gun gectikce d, h,  d,  guzellesiyor]


	        // tum harfleri bir array olarak kaydedin

	        String[] harfler = str.split("");

	        System.out.println(Arrays.toString(harfler));

	        // [J, a, v, a,  , g, u, n,  , g, e, c, t, i, k, c, e,  , d, a, h, a,  , d, a,  , g, u, z, e, l, l, e, s, i, y, o, r]
	        
	        

	        harfler = str.replace(" ","").split("");

	        System.out.println(Arrays.toString(harfler));
	        // [J, a, v, a, g, u, n, g, e, c, t, i, k, c, e, d, a, h, a, d, a, g, u, z, e, l, l, e, s, i, y, o, r]
	        
	        C01_ElemanArama.arraydekiArananElemaninSayisiniYazdir(harfler, "a");
	        C01_ElemanArama.arraydekiArananElemaninSayisiniYazdir(harfler, "x");



	}

}

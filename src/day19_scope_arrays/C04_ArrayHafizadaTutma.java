package day19_scope_arrays;

import java.util.Arrays;

public class C04_ArrayHafizadaTutma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] sayilar = {3,5,6,7};

	        System.out.println(Arrays.toString(sayilar)); // [3, 5, 6, 7]

	        // 5'in yerine 8 degerini atayin

	        sayilar[1] = 8 ;

	        System.out.println(Arrays.toString(sayilar)); // [3, 8, 6, 7]

	        String[] metinler = { "Java" , "Python", "C#"};
	        sayilar[2]=15;
	        //metinler[3]="C++";//Array a ekstra atama yapilmaz, hata verir.

	        System.out.println(metinler[1]); //
	        System.out.println(Arrays.toString(metinler));
	        System.out.println(Arrays.toString(sayilar));

	}

}

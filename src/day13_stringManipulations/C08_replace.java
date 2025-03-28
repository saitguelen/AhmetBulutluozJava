package day13_stringManipulations;

public class C08_replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str = "Java Candir";

	        System.out.println(str.replace('a', 'A')); // JAvA CAndir

	        System.out.println(str.replace('J','H')); // Hava Candir

	        System.out.println(str.replace("Java", "tava")); // tava candir

	        System.out.println( str.replace("Java" , "Python")); // Python Candir

	        System.out.println( str.replace("Java" , "Nesibe")); // Python Candir
	        
	        System.out.println( str.replace("a","") ); // Jv Cndir


	}

}

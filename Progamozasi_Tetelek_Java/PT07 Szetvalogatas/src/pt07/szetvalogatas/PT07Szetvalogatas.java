package pt07.szetvalogatas;


public class PT07Szetvalogatas {

    	public static void main (String[] args) {
		//Lényeg
		int[] tomb = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int meret = tomb.length;
		int[] tomb2 = new int[5];
		int[] tomb3 = new int[5];
		
		int j = 0;
		int k = 0;
		for (int i = 0; i < meret; i++) {
			if(tomb[i] > 5) {
				tomb2[j++] = tomb[i]; //j++--> 0 indexre berakja az értéket, majd ++al 1. indexre ugrik, ez fog lenni a köv találatnál a j
			}
			else
				tomb3[k++] = tomb[i];//k++--> 0 indexre berakja az értéket, majd ++al 1. indexre ugrik, ez fog lenni a köv találatnál a k
		}
		//Ellenőrzés	
		System.out.println("Eredeti tömb");
		for (int i = 0; i < tomb.length; i++) {
			System.out.println(tomb[i]);
		}
		System.out.println("2. tömb");	
		for (int i = 0; i < tomb2.length; i++) {
		System.out.println(tomb2[i]);
		}
		System.out.println("3. tömb");	
		for (int i = 0; i < tomb3.length; i++) {
		System.out.println(tomb3[i]);
		}
	}	
}
package pt10.unio;


public class PT10Unio {
    
        public static void main (String[] args) {
		
		int[] tomb = {2, 3, 4, 5, 1, 10, 7, 8, 9, 6};
		int meret = tomb.length;
		int[] tomb2 = {44, 5, 13, 10, 7, 12, 14, 61};
		int meret2 = tomb2.length;
		int[] tombUnio = new int[15];
		
		for (int i = 0; i < meret; i++) {
			tombUnio[i] = tomb[i];
		}
		
		int k = meret;
		
		for (int j= 0; j < meret2; j++) {
			int i = 0;
			while (i < meret && tomb[i] != tomb2[j])
				i++;
			if(i >= meret) {
				tombUnio[k++] = tomb2[j];
			}
		}
		//Ellenorzes
		System.out.println(tombUnio.length);
		for (int v = 0; v < tombUnio.length; v++) {
			System.out.println(tombUnio[v]);
		}
	}	
}	

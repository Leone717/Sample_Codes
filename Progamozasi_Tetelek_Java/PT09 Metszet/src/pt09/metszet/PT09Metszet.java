package pt09.metszet;

public class PT09Metszet {

	public static void main (String[] args) {
		
		int[] tomb = { 2, 3, 4, 5, 1, 10, 7, 8, 9, 6};
		int meret = tomb.length;
		int[] tomb2 = { 44, 5, 13, 10, 7, 12, 14, 61};
		int meret2 = tomb2.length;
		
		int[] metszetTomb = new int[3];
		int j;
		int k = 0;
		
		for (int i = 0; i < meret; i++) {
			j = 0;
			while (j < meret2 && tomb2[j] != tomb[i])
				j++;
			if(j < meret2) {						//ha pl. 2-es semmivel nem egyezett meg, ez akkor fut le
				metszetTomb[k++] = tomb[i];
			}
		}	
		//Ellenőrzés
		for (int v = 0; v < metszetTomb.length; v++) {
			System.out.println(metszetTomb[v]);
		}	
	}	
}

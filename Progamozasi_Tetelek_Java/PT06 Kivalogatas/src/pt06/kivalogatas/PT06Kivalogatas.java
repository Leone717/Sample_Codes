package pt06.kivalogatas;


public class PT06Kivalogatas {

    	public static void main (String[] args) {
		
		int[] tomb = {1, 3, 5, 6, 43, 8 };
		int meret = tomb.length;
		int[] ujTomb = new int[3];
		
		int j = 0;
		for (int i = 0; i < meret; i++) {
			if(tomb[i] > 6) {
				ujTomb[j++] = tomb[i];		//ujTomb[j++] itt a j++ első esetben 0, mivel a ++ művelet utólag következik, úgy 0 indexxel kezdünk
			}								//a tömb megkapja az adott értéket és úgy lép ki a ciklus hogy a ++ művelettel 0 után 1-re növekszik
		}									//a köv. találatnál az 1. indexbe teszi be, majd az is utólag értékadást követően növekszik
		int ujTombMeret = j;
		
		for (int i=0; i<meret; i++) {
			System.out.println(tomb[i]);
			}
		for (int i=0; i < ujTombMeret; i++) {
			System.out.println(ujTomb[i]);
		}
	}	
}
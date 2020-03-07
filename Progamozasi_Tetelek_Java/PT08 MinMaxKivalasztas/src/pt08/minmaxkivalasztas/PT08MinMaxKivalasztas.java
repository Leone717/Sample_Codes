package pt08.minmaxkivalasztas;


public class PT08MinMaxKivalasztas {

   	public static void main (String[] args) {
		
		int[] tomb = { 2, 3, 4, 5, 1, 6, 7, 8, 9, 10, 222, -2};
		int meret = tomb.length;
		int min = tomb[0];
		int max = 0;
		
		for (int i = 0; i < meret; i++) {
			if(tomb[i] < min) {
				min = tomb[i];
			}
		}
		System.out.println(min);
		
		for (int i = 0; i < meret; i++) {
			if(tomb[i] > max) {
				max = tomb[i];
			}
		}
		System.out.println(max);
	}	
}
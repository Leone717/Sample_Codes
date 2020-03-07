package tizenharomtobbszoros;


public class TizenharomTobbszoros {
	public static void main(String[] arg) {
		for (int dex = 1; dex <= 400; dex++) {	//for ciklus, int dex v�ltoz�val mely 400ig fut egyes�vel
			int multiple = 13 * dex;			//multiple v�ltoz�, mely a 13*dex(1,2,3,4,5...) 
			System.out.print(multiple + " ");	//ki�rja a multiple v�ltoz� (13 t�bbsz�r�s) �rt�k�t
		}
	}
}

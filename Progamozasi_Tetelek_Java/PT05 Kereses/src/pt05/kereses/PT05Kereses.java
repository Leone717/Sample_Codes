package pt05.kereses;


public class PT05Kereses {

  public static void main (String[] args) {
		
		int[] tomb = {1, 3, 5, 6, 43, 8 };
		int keresett = 43;
		
		int i = 0;
		while(i < tomb.length && tomb[i]!= keresett)
			i++;
		
		if(i < tomb.length) {
				 System.out.println("Van találat az " + (i + 1) + ".-ik helyen");
		}
		else {
				 System.out.println("Nincs találat");
		}
	}
}

package pt03.eldontes;

public class PT03Eldontes {

  public static void main (String[] args) {
		
		int[] tomb = {1, 3, 5, 5, 43, 8};
		int keresendo = 8;
		
		int i = 0;
		
		while(i < tomb.length && tomb[i] != keresendo)	
			i++;										
		
	
		if(i < tomb.length) {
				System.out.println("Találat");
			}
		else 
				System.out.println("Nincs találat");
		}
	}
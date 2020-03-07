package pt04.kivalasztas;


public class PT04Kivalasztas {
   
        public static void main (String[] args) {
		
		int[] tomb = {1, 3, 5, 5,  43, 8 };
		int keresett = 43;
		
		int i = 0;
		while(tomb[i] != keresett && i < tomb.length)
			i++;
		
		int eredemeny = i + 1; 
			
				 System.out.println(eredemeny);
			
		}
	}


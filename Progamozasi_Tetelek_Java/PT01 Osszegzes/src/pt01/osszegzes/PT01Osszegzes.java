package pt01.osszegzes;


public class PT01Osszegzes {

      /**
  Ez egy többsoros dokumentáció a konstruktorhoz.
  */
	public PT01Osszegzes () {
		
	 int[] tomb = {1, 2, 4, 5, 6, 8, 10};
	 int osszeg = 0;

		for (int i = 0; i < tomb.length; i++) {
			osszeg = osszeg + tomb[i];
		}
		System.out.println(osszeg);
	}					 
	
  /*
  Ez nem többsoros dokumentáció a main függvényhez...
  Mert nem /**-gal kezdődik, hanem csak /*-gal...
  */
  public static void main (String[] args) {
			 
      
			new PT01Osszegzes();
		 }
}

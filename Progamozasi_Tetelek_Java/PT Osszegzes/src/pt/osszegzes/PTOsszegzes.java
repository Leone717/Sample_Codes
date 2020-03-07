/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.osszegzes;

/**
 *
 * @author hunga
 */
public class PTOsszegzes {

	public PTOsszegzes () {}
	
	public static void main (String[] args) {
		new PTOsszegzes();
		int[] tomb = {1, 2, 4, 5, 6, 8, 10};
		 int osszeg = 0;
		 
			for (int i = 0; i < tomb.length; i++) {
				osszeg = osszeg + tomb[i];
				System.out.println(osszeg);
		 }
	}
	
}

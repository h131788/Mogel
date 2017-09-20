package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Integer.*;

public class OmformeTilKarakter {
	
	public static void main(String[] args) {
		
		final int ANTALL_STUDENTER = 10;
		
		int poengTall = 0;
		boolean riktigTall = true;		
		
		for (int i = 0; i < ANTALL_STUDENTER; i++) {
			do {
				poengTall = parseInt(showInputDialog("Skriv inn din poengsum: "));
				if (poengTall < 0 || poengTall > 100) {
					riktigTall = false;
					showMessageDialog(null, "Poengsummen må være mellom 0 og 100");
				}
				else {
					riktigTall = true;
				}
			} while (!riktigTall);
			
			if (poengTall < 40) {
				showMessageDialog(null, "Din karakter er: F");
			}
			
			else if (poengTall < 50) {
				showMessageDialog(null, "Din karakter er: E");
			}
			
			else if (poengTall < 60) {
				showMessageDialog(null, "Din karakter er: D");
			}
			
			else if (poengTall < 80) {
				showMessageDialog(null, "Din karakter er: C");
			}
			
			else if (poengTall < 90) {
				showMessageDialog(null, "Din karakter er: B");
			}
			
			else {
				showMessageDialog(null, "Din karakter er: A");
			}
		}
	}
}

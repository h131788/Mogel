package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class StringTabeller {

	public static void main(String[] args) {
		
		//Oppgave 3a)
		int antallOrd = 0;
		String tabellen ="";
		
		antallOrd = Integer.parseInt(showInputDialog("Hvor mange ord?"));
		
		String[] ordTabell = new String[antallOrd];
		
		for (int i = 0; i < antallOrd; i++) {
			ordTabell[i] = showInputDialog("Skriv inn ord nummer " + (i + 1) + ":");
		}
		
		showMessageDialog(null, "Tabell lagret.");
		
		for (int i = 0; i < antallOrd; i++) {
			if (i < (antallOrd - 1)) {
				tabellen = tabellen + ordTabell[i] + "\n";
			}
			else {
				tabellen = tabellen + ordTabell[i];
			}			
		}
		
		showMessageDialog(null, "Din tabell: \n" + tabellen);
		
		//Oppgave 3b)
		String monster = showInputDialog("Hvilket mønster skal letes etter?");
		int monsterTeller = 0;
		
		for (int i = 0; i < antallOrd; i++) {
			if ( ordTabell[i].contains(monster)) {
				monsterTeller = monsterTeller + 1;
			}
		}
		
		showMessageDialog(null, "Du har " + monsterTeller + " ord som inneholder: " + monster);
		
		//Oppgave 3c)
		int lengde = 0;
		
		for (int i = 0; i < antallOrd; i++) {
			lengde = ordTabell[i].length();
			
			if (lengde < 4) {
				showMessageDialog(null, "Midten av ord " + (i + 1) + " er: " + ordTabell[i]);
			}
			else if ((ordTabell[i].length() % 2) == 0) {
				showMessageDialog(null, "Midten av ord " + (i + 1) + " er: " + ordTabell[i].substring(((lengde / 2) - 1), (lengde / 2) + 1));
			}
			else {
				showMessageDialog(null, "Midten av ord " + (i + 1) + " er: " + ordTabell[i].substring(((lengde / 2) - 1), (lengde / 2) + 2));
			}
		}		
	}
}

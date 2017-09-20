package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class TemperaturTabell {

	public static void main(String[] args) {
		
		final int DAGER = 7;
		
		double[] temperatur = new double[DAGER];
		
		System.out.println("Analyse av temperaturer");
		System.out.println("***********************");
		System.out.println("Skriv inn temperaturene:");
		
		for (int i = 0; i < DAGER; i++) {
			
			System.out.print(String.format("%d. dag: ", (i + 1)));
			temperatur[i] = Double.parseDouble(showInputDialog("Skriv inn temperaturen for dag " + (i + 1)));
			System.out.println(String.format("%.2f", temperatur[i]));
		}
		
		System.out.println();
		
		System.out.println(String.format("Gjennomsnittstemperaturern var %.2f grader denne uken.", gjennomsnitt(temperatur)));
		System.out.println(String.format("Maksimum temperatur denne uken var %.2f grader", maksimum(temperatur)));		
	}
	
	public static double gjennomsnitt(double[] tabell) {
		
		double snitt = 0;
		
		for (int i = 0; i < tabell.length; i++) {
			snitt = snitt + tabell[i];
		}
		
		snitt = snitt / tabell.length;
		
		return snitt;
	}
	
	public static double maksimum(double[] tabell) {
		
		double maks = tabell[0];
		
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] > maks) {
				maks = tabell[i];
			}
		}
		
		return maks;
	}
}

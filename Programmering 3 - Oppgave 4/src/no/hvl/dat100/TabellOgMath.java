package no.hvl.dat100;

public class TabellOgMath {
	
	public static void main(String[] args) {
		
		int[] vinkel = new int[13];
		double [] vinkelRad = new double[13];
		double [] sinus = new double[13];
		double [] cosinus = new double[13];
		
		for (int i = 0; i < vinkel.length; i++) {
			vinkel[i] = i * 15;
			vinkelRad[i] = Math.toRadians(vinkel[i]);
			sinus[i] = Math.sin(vinkelRad[i]);
			cosinus[i] = Math.cos(vinkelRad[i]);
		}
		
		System.out.println("x i grader | x i radianer | sin(x) | cos(x)");
		System.out.println("-------------------------------------------");
		
		for (int i = 0; i < vinkel.length; i++) {
			System.out.println(String.format("%10d | %12.3f | %6.3f | %6.3f", vinkel[i], vinkelRad[i], sinus[i], cosinus[i]));
		}
		
		System.out.println("-------------------------------------------");
	}
}

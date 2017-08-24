package no.hvl.dat100;

import easygraphics.*;

public class Grafikk extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}
	
	public void run() {
		makeWindow("Grafikk", 350, 150);
		drawCircle(50, 30, 25);
		drawCircle(50, 85, 30);
	}

}

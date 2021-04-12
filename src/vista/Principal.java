package vista;

import control.Controlador;
import processing.core.PApplet;

public class Principal extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Principal.class.getName());
	}
	
	public void settings() {
		size(800,800);
	}
	
	Controlador control;
	
	public void setup() {
		control = new Controlador(this);
	}
	
	public void draw() {
		background(255);
		control.getLogic().pintar();
	}
	
	public void mousePressed() {
		if(mouseButton == RIGHT) {
			control.getLogic().nuevaFigura();
		}
		control.getLogic().moverFigura();
	}

}

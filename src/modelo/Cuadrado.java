package modelo;

import processing.core.PApplet;

public class Cuadrado extends Figura{

	public Cuadrado(PApplet app, int tam, int posX, int posY, int dir, int valor) {
		super(app, tam, posX, posY, dir, valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		
		this.getApp().fill(0);
		this.getApp().rect(getPosX(), getPosY(), getTam(), getTam());
	}

}

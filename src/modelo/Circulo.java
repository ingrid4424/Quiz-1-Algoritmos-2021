package modelo;

import processing.core.PApplet;

public class Circulo extends Figura {

	public Circulo(PApplet app, int tam, int posX, int posY, int dir, int valor) {
		super(app, tam, posX, posY, dir, valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		this.getApp().fill(0);

		getApp().circle(getPosX(), getPosY(), getTam());
	}

}

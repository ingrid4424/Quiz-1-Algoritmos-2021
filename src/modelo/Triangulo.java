package modelo;

import processing.core.PApplet;

public class Triangulo extends Figura{

	public Triangulo(PApplet app, int tam, int posX, int posY, int dir, int valor) {
		super(app, tam, posX, posY, dir, valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		getApp().triangle(getPosX()-getTam(), getPosY()+getTam(), getPosX(), getPosY()-getTam(), getPosX()+getTam(), getPosY()+getTam());
	}

}

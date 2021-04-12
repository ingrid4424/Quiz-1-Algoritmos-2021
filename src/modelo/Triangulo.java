package modelo;

import processing.core.PApplet;

public class Triangulo extends Figura{
	private int  r,g,b;

	public Triangulo(PApplet app, int tam, int posX, int posY, int dir, int valor) {
		super(app, tam, posX, posY, dir, valor);
		// TODO Auto-generated constructor stub
		
		 r = (int) getApp().random(255);
		 g = (int) getApp().random(255);
		 b = (int) getApp().random(255);
	}

	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		this.getApp().fill(r,g,b);
		getApp().triangle(getPosX()-getTam(), getPosY()+getTam(), getPosX(), getPosY()-getTam(), getPosX()+getTam(), getPosY()+getTam());
		this.getApp().fill(0);
		this.getApp().text(""+ getValor(), getPosX(), getPosY());
	}

}

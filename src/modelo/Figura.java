package modelo;

import processing.core.PApplet;

public abstract class Figura {
	private PApplet app;
	private int tam;
	private int posX;
	private int posY;
	private int dir;
	private int valor;

	/*Cuadrado 50 400 30 -1 5
	Circulo 30 300 40 1 8
	Cuadrado 20 350 50 1 9
	Circulo 10 100 200 -1 10
	Círculo 60 250 100 1 4
	Cuadrado 80 50 50 1 3
	Cuadrado 10 100 300 -1 5*/
	public Figura(PApplet app, int tam, int posX, int posY, int dir, int valor) {
		this.app = app;
		this.tam = tam;
		this.posX = posX;
		this.posY = posY;
		this.dir = dir;
		this.valor = valor;
		
	}
	
	public abstract void pintar();
	
	public void mover() {
		this.posX += this.dir;
		this.posY += 1;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}

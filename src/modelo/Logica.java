package modelo;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logica {
	private PApplet app;
	private String[] txtBase;
	private ArrayList<Cuadrado> listCuadrados;
	private ArrayList<Circulo> listCirculos;
	
	public Logica(PApplet app) {
		this.app = app;
		txtBase = this.app.loadStrings("./../Recursos/baseElem");
		
		listCirculos = new ArrayList<>();
		listCuadrados = new ArrayList<>();
		
		for(int i=0; i< txtBase.length;i++) {
			String [] items = txtBase[i].split(" ");
			System.out.println(items[1]);
			if(items[0].equals("Cuadrado")) {
				listCuadrados.add(new Cuadrado(app, Integer.parseInt(items[1]),Integer.parseInt(items[2]), Integer.parseInt(items[3]),Integer.parseInt(items[4]), Integer.parseInt(items[5])));

			} else
				if(items[0].equals("Circulo")) {
					listCirculos.add(new Circulo(app, Integer.parseInt(items[1]),Integer.parseInt(items[2]), Integer.parseInt(items[3]),Integer.parseInt(items[4]), Integer.parseInt(items[5])));
				}
		}
	}
	
	public void pintar() {
		for(int i = 0; i< listCirculos.size(); i++) {
			listCirculos.get(i).pintar();
			listCirculos.get(i).mover();
		}
		
		for(int i = 0; i< listCuadrados.size(); i++) {
			listCuadrados.get(i).pintar();
			listCuadrados.get(i).mover();
		}
	
	}
	
	public void nuevaFigura() {
		int r = (int)this.app.random(3);
		if(r==1) {
			listCuadrados.add(new Cuadrado(this.app, (int) this.app.random(30,100),(int) this.app.random(100,500) , (int) this.app.random(100,500), (int) this.app.random(10), (int) this.app.random(30)));
		} 
		if(r==2) {
			listCirculos.add(new Circulo(this.app, (int) this.app.random(30,100),(int) this.app.random(100,500) , (int) this.app.random(100,500), (int) this.app.random(10), (int) this.app.random(30)));
		}
	}
}

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
		}
		
		for(int i = 0; i< listCuadrados.size(); i++) {
			listCuadrados.get(i).pintar();
		}
	
	}
}

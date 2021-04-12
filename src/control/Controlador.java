package control;

import modelo.Logica;
import processing.core.PApplet;
import vista.Principal;

public class Controlador {

	private PApplet app;
	private Logica logic;

	public Controlador(PApplet app) {
		// TODO Auto-generated constructor stub
		this.app = app;
		this.logic = new Logica(app);
	}

	public Logica getLogic() {
		return logic;
	}

	public void setLogic(Logica logic) {
		this.logic = logic;
	}
	
	

}

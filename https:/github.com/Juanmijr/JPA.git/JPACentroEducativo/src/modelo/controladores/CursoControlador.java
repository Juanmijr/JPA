package modelo.controladores;

public class CursoControlador extends Controlador {
	
	
	//Instancia SINGLETON
	private static CursoControlador instancia = null;
	
	public CursoControlador() {
		super("Curso");
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @return
	 */
	public static CursoControlador getInstancia () {
		if (instancia == null) {
			instancia = new CursoControlador();
		}
		return instancia;
	}

}



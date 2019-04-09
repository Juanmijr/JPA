package modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the valoracionmateria database table.
 * 
 */
@Entity
@Table(name="valoracionmateria")
@NamedQuery(name="ValoracionMateria.findAll", query="SELECT v FROM ValoracionMateria v")
public class ValoracionMateria extends Entidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private float valoracion;

	//bi-directional many-to-one association to Materia
	@ManyToOne
	@JoinColumn(name="idMateria")
	private Materia materia;

	//bi-directional many-to-one association to Estudiante
	@ManyToOne
	@JoinColumn(name="idEstudiante")
	private Estudiante estudiante;

	//bi-directional many-to-one association to Profesor
	@ManyToOne
	@JoinColumn(name="idProfesor")
	private Profesor profesor;

	public ValoracionMateria() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getValoracion() {
		return this.valoracion;
	}

	public void setValoracion(float valoracion) {
		this.valoracion = valoracion;
	}

	public Materia getMateria() {
		return this.materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Estudiante getEstudiante() {
		return this.estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Profesor getProfesor() {
		return this.profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

}
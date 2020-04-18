package datos;
import java.util.List;

public  class Estudiante extends Persona {

	private int matricula;
	private String programa;
	private String facultad;
	private List<Grupo> estaEn;
	private List<Asignatura> estaViendo;
	private double promedio;

	public Estudiante(String nombre, String apellido, String nacimiento, int id, int edad, String correo, int matricula, String programa, String facultad, List<Grupo> estaEn, List<Asignatura> estaViendo, double promedio) {
		super(nombre, apellido, nacimiento, id, edad, correo);
		this.matricula = matricula;
		this.programa = programa;
		this.facultad = facultad;
		this.estaEn = estaEn;
		this.estaViendo = estaViendo;
		this.promedio = promedio;
	}
	public Estudiante(String nombre, String apellido, String programa) {
		super(nombre, apellido);
		this.programa = programa;
	}

	public Estudiante() {
	}

	public void setMatricula(int numeroMatriculas) {
		this.matricula = numeroMatriculas;
	}
	public int getMatricula() {
		return this.matricula;
	}

	public void setPrograma(String carrera) {
		this.programa = carrera;
	}
	public String getPrograma() {
		return this.programa;
	}
	public void setEstaEn(List<Grupo> estaEn) {
		this.estaEn = estaEn;
	}
	public List<Grupo> getEstaEn() {
		return estaEn;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;	
	}
	public double getPromedio() {
		return promedio;
	}

	public void setEstaViendo(List<Asignatura> estaViendo) {
		this.estaViendo = estaViendo;
	}
	public List<Asignatura> getEstaViendo() {
		return estaViendo;
	}

	@Override
	public String toString() {
		return "Buen día, mi nombre es " +this.getNombre()+". Tengo " +this.getEdad() +" años de edad" 
	+ "\n" + "Soy estudiante de " + this.getPrograma() + " y estoy en mi matrícula número "+this.getMatricula() + "\n";
	}

}
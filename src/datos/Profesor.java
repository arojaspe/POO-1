package datos;
import java.util.List;

public class Profesor extends Persona {

	private String facultad;
	private List<Grupo> ensenaA;


	public Profesor() {
		
	}
	
	public Profesor(String nombre, String apellido, String nacimiento, int id, int edad, String correo, String facultad, List<Grupo> ensenaA) {
		super(nombre, apellido, nacimiento, id, edad, correo);
		this.facultad = facultad;
		this.ensenaA = ensenaA;
	}
	
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	public String getFacultad() {
		return this.facultad;
	}

	public void setEnseñaA(List<Grupo> ensenaAGrupo) {
		this.ensenaA = ensenaAGrupo;
	}
	public List<Grupo> getEnseñaA() {
		return this.ensenaA;
	}
	
	public void darNotaPregrado(EstudiantePregrado estudiante, double papa) {
		estudiante.setPromedio(papa);
	}
	public void darNotaPosgrado(EstudiantePosgrado estudiante, double papa) {
		estudiante.setPromedio(papa);
	}  	 	 	
		

	@Override
	public String toString() {
		return "Buenas mañanas, soy el Profesor " +this.getNombre() + " " + this.getApellido() + ", estoy adscrito a la facultad de " + this.getFacultad();
		
	}
}

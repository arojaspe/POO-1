package datos;
import java.util.List;

public class Grupo {

	private int numeroGru;
	private Aula aulaClase;
	private List<Estudiante> tieneEnLista;
	private Profesor profesor;

	public Grupo(int numeroGru, Aula aulaClase, List<Estudiante> tieneEnLista, Profesor profesor) {
		this.numeroGru = numeroGru;
		this.aulaClase = aulaClase;
		this.tieneEnLista = tieneEnLista;
		this.profesor = profesor;
	}

	public void setNumeroGru(int numeroGrupo) {
		this.numeroGru = numeroGrupo;
	}
	public int getNumeroGru() {
		return this.numeroGru;
	}

	public void setAulaClase(Aula aulaDeClase) {
		this.aulaClase = aulaDeClase;
	}
	public Aula getAulaClase() {
		return this.aulaClase;
	}

	public void setTieneEnLista(List<Estudiante> tieneEnLaLista) {
		this.tieneEnLista = tieneEnLaLista;
	}
	public List<Estudiante> getTieneEnLista() {
		return this.tieneEnLista;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public Profesor getProfesor() {
		return this.profesor;
	}

	@Override
	public String toString() {
		return "Grupo{" +
				"numeroGru=" + numeroGru +
				", aulaClase=" + aulaClase +
				", tieneEnLista=" + tieneEnLista +
				", profesor=" + profesor +
				'}';
	}
}
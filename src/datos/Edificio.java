package datos;
import java.util.List;

public class Edificio {

	private String nombreEdi;
	private int numeroEdi;
	private List<Aula> aulasEnEdificio;

	public Edificio(String nombreEdi, int numeroEdi, List<Aula> aulasEnEdificio) {
		this.nombreEdi = nombreEdi;
		this.numeroEdi = numeroEdi;
		this.aulasEnEdificio = aulasEnEdificio;
	}

	public Edificio() {

	}

	public void setNombreEdi(String nombreEdificio) {
		this.nombreEdi = nombreEdificio;
	}
	public String getNombreEdi() {
		return this.nombreEdi;
	}

	public void setNumeroEdi(int numeroEdificio) {
		this.numeroEdi = numeroEdificio;
	}
	public int getNumeroEdi() {
		return this.numeroEdi;
	}

	public void setAulasEnEdificio(List<Aula> aulasEnEdificio) {
		this.aulasEnEdificio = aulasEnEdificio;
	}
	public List<Aula> getAulasEnEdificio() {
		return this.aulasEnEdificio;
	}

	@Override
	public String toString() {
		return "Edificio " +	getNombreEdi() + '\n' + "Número " + getNumeroEdi() +", aulas en edificio =" + getAulasEnEdificio();
	}
}
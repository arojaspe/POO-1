package datos;
import java.util.List;

public class Aula {

	private int numeroAul;
	private List<Grupo> lleganGrupos;

	public Aula(int numeroAul, List<Grupo> lleganGrupos) {
		this.numeroAul = numeroAul;
		this.lleganGrupos = lleganGrupos;
	}

	public void setNumeroAul(int numeroDeAula) {
		this.numeroAul = numeroDeAula;
	}
	public int getNumeroAul() {
		return this.numeroAul;
	}

	public void setLleganGrupos(List<Grupo> lleganLosGrupos) {
		this.lleganGrupos = lleganLosGrupos;
	}
	public List<Grupo> getLleganGrupos() {
		return lleganGrupos;
	}

	@Override
	public String toString() {
		return "Aula{" +
				"numeroAul=" + numeroAul +
				", lleganGrupos=" + lleganGrupos +
				'}';
	}
}
package datos;
import java.util.List;

public class Asignatura {
	private String nombreAsi;
	private int codigoAsi;
	private List<Estudiante> laVen;
	private List<Grupo> laVenGrupos;
	private List<Aula> laVenEn;
	private List<Profesor> laDan;
	
	public void setNombreAsi(String nombreAsignatura) {
		this.nombreAsi = nombreAsignatura;
	}
	public String getNombreAsi() {
		return this.nombreAsi;
	}
	public void setCodigoAsi(int codigoAsignatura) {
		this.codigoAsi = codigoAsignatura;
	}
	public int getCodigoAsi() {
		return this.codigoAsi;
	}
	public void setLaVenGrupos(List<Grupo> laVenLosGrupos) {
		this.laVenGrupos = laVenLosGrupos;
	}
	public List<Grupo> getLaVenGrupos() {
		return this.laVenGrupos;
	}
	public void setLaVenEn(List<Aula> laVenEnLosSalones) {
		this.laVenEn = laVenEnLosSalones;
	}
	public List<Aula> getLaVenEn() {
		return this.laVenEn;
	}	
	public void setLaDan(List<Profesor> laDanLosProfesores) {
		this.laDan = laDanLosProfesores;
	}
	public List<Profesor> getLaDan() {
		return this.laDan;
	}
	
	
	@Override
	public String toString() {
		return "Asignatura: " + getNombreAsi() + ", código: " + getCodigoAsi();
	}
	public String generarAsignatura(String nombre, int codigo) {
		this.nombreAsi = nombre;
		this.codigoAsi = codigo;
		return "Asignatura: " + nombre +"\n" + "Código: " +codigo;
	}

		
}
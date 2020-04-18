package datos;
//import java.util.List;

public class PAPA {

	private double papa;
	private Estudiante estudiante;
	private double[] notas;
	private int[] creditos;
	
    public double calcularPapa(double[] notas, int[] creditos) {
    	int resultado = 0;
    	int credi = 0;
		for(int i=0;i<=notas.length;i++) {
			double prepapa = notas[i];
			int numCreditos = creditos[i];
			int total = creditos[i]*=prepapa;
			resultado += total;
			credi += numCreditos;
				
			}
		double promedio = resultado/credi;
		return promedio;
		}
    	
	public void setPapa(double papa) {
		this.papa = papa;
	}
	public double getPapa() {
		return this.papa;
	}

	void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	Estudiante getEstudiante() {
		return this.estudiante;
	}
}
package datos;

import java.util.List;

public class EstudiantePregrado extends Estudiante{
    private int nivelIngles;
    private int pbm;
    
    public EstudiantePregrado(){

    }

    public EstudiantePregrado(String nombre, String apellido, String nacimiento, int id, int edad, String correo, int matricula, String programa, String facultad, List<Grupo> estaEn, List<Asignatura> estaViendo, double promedio, int nivelIngles, int pbm) {
        super(nombre, apellido, nacimiento, id, edad, correo, matricula, programa, facultad, estaEn, estaViendo, promedio);
        this.nivelIngles = nivelIngles;
        this.pbm = pbm;
    }


	@Override
    public String toString() {
    	return "Buen día, mi nombre es " +this.getNombre()+". Tengo " +this.getEdad() +" años de edad" 
    			+ "\n" + "Soy estudiante de " + this.getPrograma() + " y estoy en mi matrícula número "+this.getMatricula() 
    			+ "\n" + "Soy Estudiante de Pregrado, mi nivel Inglés es " + this.nivelIngles + " y mi pbm es " + this.pbm;
    }
}
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
    	return "Buen d�a, mi nombre es " +this.getNombre()+". Tengo " +this.getEdad() +" a�os de edad" 
    			+ "\n" + "Soy estudiante de " + this.getPrograma() + " y estoy en mi matr�cula n�mero "+this.getMatricula() 
    			+ "\n" + "Soy Estudiante de Pregrado, mi nivel Ingl�s es " + this.nivelIngles + " y mi pbm es " + this.pbm;
    }
}
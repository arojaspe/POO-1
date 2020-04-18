package datos;

import java.util.List;

public class EstudiantePosgrado extends  Estudiante{
    private  String programaDePregrado;
    private  String lugarDeEmpleo;

    public EstudiantePosgrado(String nombre, String apellido, String nacimiento, int id, int edad, String correo, int matricula, String programa, String facultad, List<Grupo> estaEn, List<Asignatura> estaViendo, double promedio, String programaDePregrado, String lugarDeEmpleo) {
        super(nombre, apellido, nacimiento, id, edad, correo, matricula, programa, facultad, estaEn, estaViendo, promedio);
        this.programaDePregrado = programaDePregrado;
        this.lugarDeEmpleo = lugarDeEmpleo;
    }

    @Override
    public String toString() {
        return "Buen d�a, mi nombre es " +this.getNombre()+". Tengo " +this.getEdad() +" a�os de edad" 
    			+ "\n" + "Soy estudiante de " + this.getPrograma()
    			+ "\n" + "Soy Estudiante de Posgrado, trabajo en " + this.lugarDeEmpleo + " y me gradu� de " + this.programaDePregrado;
    }
}
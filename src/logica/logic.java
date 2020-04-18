package logica;

import java.util.Scanner;
import IU.principal;
import datos.Asignatura;
import datos.Edificio;
import datos.Estudiante;
import datos.EstudiantePosgrado;
import datos.EstudiantePregrado;
import datos.Grupo;
import datos.Persona;
import datos.Profesor;

public class logic {
	public static void main(String[] args) {
		while (true) {
		mostrarMenu();		
		principal.main(args);
		}
		}
	
		
	

public  static void mostrarMenu(){
	System.out.print("---------------------------");
	System.out.print("          SIA UN           ");
	System.out.print("---------------------------");
	System.out.print("\n---------------------------------------------------------------------------------\n");
	System.out.println("1.) Consultar estudiantes");
	System.out.println("2.) Consultar docentes");
	System.out.println("3.) Consultar edificios");
	System.out.println("4.) Consultar asignaturas");
	System.out.println("0.) Salir");
	System.out.println("--------------------------------------------------------------------------------");
}



}



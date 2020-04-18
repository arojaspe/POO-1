package IU;
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import datos.Asignatura;
import datos.Edificio;
import datos.Estudiante;
import datos.EstudiantePosgrado;
import datos.EstudiantePregrado;
import datos.Grupo;
import datos.Persona;
import datos.Profesor;

public class principal {

	private static char[] a;
	public static void main(String[] args) {
		
		ArrayList<Asignatura>  asignaturas = new ArrayList<Asignatura>();
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		ArrayList<Edificio> edificios = new ArrayList<Edificio>();
		//List grupos = new List(Grupo);

		Estudiante a1 = new EstudiantePregrado();
		a1.setNombre("Will");
		a1.setApellido("Smith");
		a1.setEdad(18);
		a1.setNacimiento("01/04/2200");
		a1.setCorreo("williscrack@unal.edu.co");
		a1.setId(100201);
		a1.setPrograma("Ingeniería de Sistemas y Computación");
		a1.setMatricula(4);
		estudiantes.add(a1);

		Estudiante a2 = new EstudiantePregrado();
		a2.setNombre("Homero");
		a2.setApellido("Simpson");
		a2.setEdad(22);
		a2.setNacimiento("01/04/2098");
		a2.setCorreo("homeros@unal.edu.co");
		a2.setId(3354541);
		a2.setPrograma("Sociologia");
		a2.setMatricula(6);
		estudiantes.add(a2);

		Estudiante a3 = new EstudiantePregrado();
		a3.setNombre("Rick");
		a3.setApellido("Sanchez");
		a3.setEdad(99);
		a3.setNacimiento("01/04/2050");
		a3.setCorreo("ricks@unal.edu.co");
		a3.setId(101201);
		a3.setPrograma("Ingeniería de Sistemas y Computación");
		a3.setMatricula(1);
		estudiantes.add(a3);

		Profesor p1 = new Profesor();
		p1.setNombre("Arpepitosenio");
		p1.setApellido("Pecha");
		p1.setCorreo("pepitos@unal.edu.co");
		p1.setEdad(40);
		p1.setId(12323);
		p1.setNacimiento("03/02/2060");
		p1.setFacultad("Ciencias");
		profesores.add(p1);

		Profesor p2 = new Profesor();
		p2.setNombre("Mario");
		p2.setApellido("Bros");
		p2.setCorreo("marioss@unal.edu.co");
		p2.setEdad(50);
		p2.setId(134343);
		p2.setNacimiento("03/06/2050");
		p2.setFacultad("Memeologia");
		profesores.add(p2);

		Profesor p3 = new Profesor();
		p3.setNombre("Morty");
		p3.setApellido("Perez");
		p3.setCorreo("mortys@unal.edu.co");
		p3.setEdad(65);
		p3.setId(121213);
		p3.setNacimiento("02/01/2070");
		p3.setFacultad("Artes");
		profesores.add(p3);

		Edificio e1 = new Edificio();
		e1.setNombreEdi("Yu takeuchi");
		e1.setNumeroEdi(433);
		edificios.add(e1);

		Edificio e2 = new Edificio();
		e2.setNombreEdi("Aulas de Ingenieria");
		e2.setNumeroEdi(403);
		edificios.add(e2);

		Edificio e3 = new Edificio();
		e3.setNombreEdi("Ciencia y tecnologia");
		e3.setNumeroEdi(404);
		edificios.add(e3);
		
		Edificio e4 = new Edificio();
		e4.setNombreEdi("Edificio Insignia: Julio Garavito Armero");

		Asignatura m1 = new Asignatura();
		m1.setNombreAsi("Gatología del ser");
		m1.setCodigoAsi(777);
		asignaturas.add(m1);

		Asignatura m2 = new Asignatura();
		m2.setNombreAsi("Memes II");
		m2.setCodigoAsi(231);
		asignaturas.add(m2);

		Asignatura m3 = new Asignatura();
		m3.setNombreAsi("el");
		m3.setCodigoAsi(234343);
		asignaturas.add(m3);
		
		int caso =  principal.leerNumero();
		switch (caso){
			case 0:
				System.out.println("exit");
				System.exit(0);					
			case 1:
				System.out.println("Consultar estudiantes");
				System.out.println();
				System.out.println(a1.toString());
				System.out.println();
				System.out.println(a2.toString());
				System.out.println();
				System.out.println(a3.toString());
				break;
			case 2:
				System.out.println("Consultar docentes");
				System.out.println();
				System.out.println(p1.toString());
				System.out.println();
				System.out.println(p2.toString());
				System.out.println();
				System.out.println(p3.toString());
				break;
			case 3:
				System.out.println("Consultar edificios");
				System.out.println();
				System.out.println(e1.toString());
				System.out.println();
				System.out.println(e2.toString());
				System.out.println();
				System.out.println(e3.toString());
				break;
			case 4:
				System.out.println("ConsulTar asignaturas");
				System.out.println();
				System.out.println(m1.toString());
				System.out.println();
				System.out.println(m2.toString());
				break;
		}
	}
	
public static int leerNumero(){
	Scanner lector = new Scanner(System.in);
	String entrada;
	while (true){
		System.out.println("Ingresa un numero");
		entrada = lector.nextLine();
		int valorAscii = (int)entrada.charAt(0);
		if ( 48 <= valorAscii  && valorAscii <= 52){
			return Integer.parseInt(entrada);
			}else{
				System.out.println("Entrada invalida");
			}
		}
	}
}


	
	

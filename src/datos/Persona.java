package datos;

public class Persona {
	private String nombre;
    private String apellido;
    private String nacimiento;
    private int id;
    private int edad;
    private String correo;

    public Persona(String nombre, String apellido, String nacimiento, int id, int edad, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.id = id;
        this.edad = edad;
        this.correo = correo;
    }
    public Persona (String nombre, String apellido) {
    	this.nombre = nombre;
    	this.apellido = apellido;
    }

    public Persona() {
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getNacimiento() { return nacimiento; }
    public void setNacimiento(String nacimiento) { this.nacimiento = nacimiento; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nacimiento='" + nacimiento + '\'' +
                ", id=" + id +
                ", edad=" + edad +
                ", correo='" + correo + '\'' +
                '}';
    }

}

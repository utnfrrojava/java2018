package entidades;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getDesc(){
		return this.getApellido()+", "+this.getNombre()+" tiene "+this.getEdad()+" años";
	}
	
	public Persona(String nombre, String apellido){
		this();
		this.setApellido(apellido);
		this.setNombre(nombre);
	}
	
	public Persona(){
		this.setApellido("sin apellido");
		this.setNombre("sin nombre");
		this.setEdad(-1);
	}
}

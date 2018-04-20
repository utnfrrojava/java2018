package entities;

public class Persona {
	private int dni;
	private String nombre;
	private String apellido;
	
	public Persona(){}
	
	public Persona(int dni, String nombre, String apellido){
		this.setDni(dni);
		this.setNombre(nombre);
		this.setApellido(apellido);
	}
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
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
	
	@Override
	public String toString(){
		return "DNI: "+getDni()+", Nombre: "+getNombre()+", Apellido: "+getApellido();
	}
	
}

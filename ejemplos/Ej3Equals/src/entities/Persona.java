package entities;

public class Persona {

	public int dni;
	public String nombre;
	public String apellido;
	
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
	public boolean equals(Object o){
		return (o instanceof Persona) && this.getDni()==((Persona)o).getDni();
	}
	
	@Override
	public String toString(){
		return super.toString()+" - "+
				this.getDni()+ ": "+this.getNombre()+
				" "+this.getApellido();
	}
}

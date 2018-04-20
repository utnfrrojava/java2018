
public class Persona {
	private String nombre;
	private String apellido;
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
	
	public Persona(){}
	
	public Persona(String nombre, String apellido){
		this.nombre=nombre;
		this.apellido=apellido;
	}
	
	@Override
	public String toString(){
		return this.getApellido()+", "+this.getNombre();
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Persona){
			Persona p=(Persona) o;
			return this.getApellido().equals(p.getApellido()) 
					&& this.getNombre().equals(p.getNombre());
		}
		return false;
	}
	
}

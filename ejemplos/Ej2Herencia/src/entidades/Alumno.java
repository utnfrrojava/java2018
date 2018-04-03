package entidades;


public class Alumno extends Persona {
	
	
	public Alumno(){
		this.setEdad(18);
	}
	
	public String getDesc(){
		return "El alumno "+super.getDesc();
	}
}

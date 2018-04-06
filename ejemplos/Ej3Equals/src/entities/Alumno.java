package entities;

public class Alumno extends Persona{
	public int legajo;

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
	@Override
	public String toString(){
		return getClass().getName()+": "+
				this.getApellido()+
				", "+this.getNombre()+
				" DNI: "+this.getDni()+" Leg:" +
				this.getLegajo();
	}
	
}

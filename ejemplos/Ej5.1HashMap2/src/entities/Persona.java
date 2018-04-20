package entities;

public class Persona {
	private Documento documento;
	private String nombre;
	private String apellido;
	
	public Persona(String tipo, int nro, String nombre, String apellido){
		this.setDocumento(new Documento(tipo, nro));
		this.setApellido(apellido);
		this.setNombre(nombre);
	}
	
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
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
		return "Doc: "+getDocumento()+", Nombre: "+getNombre()+
				", Apellido: "+getApellido();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((documento == null) ? 0 : documento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Persona)) {
			return false;
		}
		Persona other = (Persona) obj;
		if (documento == null) {
			if (other.documento != null) {
				return false;
			}
		} else if (!documento.equals(other.documento)) {
			return false;
		}
		return true;
	}
	
	
}

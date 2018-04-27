package entities;

public class Documento implements Comparable<Documento> {
	private String tipo;
	private int nro;
	
	public Documento(String tipo, int nro){
		this.setTipo(tipo);
		this.setNro(nro);
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	
	@Override
	public String toString(){
		return getTipo()+": "+getNro();
	}

	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + nro;
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		if (!(obj instanceof Documento)) {
			return false;
		}
		Documento other = (Documento) obj;
		if (nro != other.nro) {
			return false;
		}
		if (tipo == null) {
			if (other.tipo != null) {
				return false;
			}
		} else if (!tipo.equals(other.tipo)) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Documento o) {
		return this.getNro() - o.getNro();
	}
	
	
	
	
}

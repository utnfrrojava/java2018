package entities;
import java.util.Comparator;

public class PersonaLexicographicComparator implements Comparator<Persona>{

	@Override
	public int compare(Persona per, Persona otraPer) {
		int comparaApellido=per.getApellido().compareTo(otraPer.getApellido());
		if(comparaApellido != 0){
			return comparaApellido;
		} else {
			return per.getNombre().compareTo(otraPer.getNombre());
		}
	}
	

}

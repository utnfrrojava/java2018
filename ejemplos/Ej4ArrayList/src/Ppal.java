import java.util.ArrayList;

public class Ppal {

	public static void main(String[] args) {
		ArrayList<String> palabras = new ArrayList<String>();
		
		System.out.println("Palabras:");
		System.out.println("tamaño: "+palabras.size());
		palabras.add("Juan");
		palabras.add("auto");
		palabras.add("noche");
		palabras.add(1, "pizarron");
		palabras.add("pizarron");
		palabras.add("noche");
				
		System.out.println("tamaño: "+palabras.size());
		for (String pal : palabras) {
			System.out.println(pal);
		}
		
		palabras.remove("pizarron");
		palabras.remove(1);
		
		System.out.println("tamaño: "+palabras.size());
		
		
		System.out.println("");
		for (int i = 0; i < palabras.size(); i++) {
			System.out.println(palabras.get(i));
		}
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		Persona miPer=new Persona("John", "Doe");
		personas.add(miPer);
		
		personas.add(new Persona("Juan","Perez"));
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		for (Persona persona : personas) {
			System.out.println(persona);
		}
		
		System.out.print("John Doe? ");
		System.out.println("Contiene: "+personas.contains(miPer)); 
		System.out.println("Ubicación: "+personas.indexOf(miPer));
		
		miPer=new Persona("John", "Doe");
		System.out.print("nuevo John Doe? ");
		System.out.println("Contiene: "+personas.contains(miPer)); 
		System.out.println("Ubicación: "+personas.indexOf(miPer));
		
		
	}

}

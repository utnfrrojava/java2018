package ui;

import java.util.List;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

import entities.*;

public class Ppal {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("dni", 123, "Juan", "Perez");
		Persona p2 = new Persona("dni", 456, "John", "Doe");
		Persona p3 = new Persona("dni", 111, "Alguien", "Perez");
		
		System.out.println("p1 comparado p2");
		System.out.println(p1.compareTo(p2));
		System.out.println("p1 comparado p3");
		System.out.println(p1.compareTo(p3));
		
		HashMap<Documento, Persona> map= new HashMap<Documento, Persona>();
		
		map.put(p1.getDocumento(), p1);
		map.put(p2.getDocumento(), p2);
		map.put(p3.getDocumento(), p3);
		
		printForeach(map, "Map inicial");
		
		System.out.println("Ordenado por Apellido y Nombre");
		for(Persona p: sortByApellidoNombre(map)){
			System.out.println(p);
		}
		
		
	}
	
	private static List<Persona> sortByApellidoNombre(HashMap<Documento, Persona> map) {
		List<Persona> l= new LinkedList<Persona>(map.values());
		Collections.sort(l,new PersonaLexicographicComparator());
		return l;
	}

	private static void printForeach(Map<Documento, Persona> map, String title){
		System.out.println("");
		System.out.println("");
		System.out.println(title);
		for (Map.Entry entry: map.entrySet()) {
			System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
		}
	}

}

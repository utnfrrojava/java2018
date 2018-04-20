package ui;

import java.util.HashMap;
import java.util.Map;

import entities.Documento;
import entities.Persona;

public class Ppal {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("dni", 123, "Juan", "Perez");
		Persona p2 = new Persona("dni", 456, "John", "Doe");
		
		HashMap<Documento, Persona> map= new HashMap<Documento, Persona>();
		
		map.put(p1.getDocumento(), p1);
		map.put(p2.getDocumento(), p2);
		
		printForeach(map, "Map inicial");
		
		System.out.println("");
		System.out.println("get p1");
		System.out.println(map.get(p1.getDocumento()));
		Documento d=new Documento("dni", 123);//probar comentando hashCode e equals de documento
		System.out.println(map.get(d));
		System.out.println("");
		System.out.println("buscar p1 por valor");
		Persona pseudoP1=new Persona("dni", 123, null, null);
		System.out.println(map.containsValue(pseudoP1));
		
		
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

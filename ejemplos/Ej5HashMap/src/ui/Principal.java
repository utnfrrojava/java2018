package ui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import entities.Persona;

public class Principal {

	public static void main(String[] args) {

		HashMap<Integer,Persona> map=new HashMap<Integer,Persona>();
		
		Persona p1=new Persona(123, "Juan", "Perez");
		Persona p2=new Persona(456, "John", "Doe");
		Persona p3=new Persona(678, "Nadie", "Sabe");
		Persona p4=new Persona(901, "Fulano", "de Tal");
		Persona p5=new Persona(901, "Identidad", "Desconocida");
		
		map.put(p1.getDni(), p1);
		map.put(p2.getDni(), p2);
		map.put(p3.getDni(), p3);
		map.put(p4.getDni(), p4);
		map.put(p5.getDni(), p5);
		
		System.out.println("Size: "+map.size());
		
		System.out.println("");
		System.out.println("");
		System.out.println("foreach");
		
		for (Map.Entry ent: map.entrySet()) {
			Integer key=(Integer)ent.getKey();
			Persona per=(Persona)ent.getValue();
			System.out.println("Key: "+key+", Value: "+per);
		}
		
		Iterator it = map.keySet().iterator();
		
		System.out.println("");
		System.out.println("");
		System.out.println("while");
		
		while(it.hasNext()){
			Integer key= (Integer)it.next();
			System.out.println("Key: "+key+", Value: "+map.get(key));
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("values");
		for (Persona per : map.values()) {
			System.out.println(per);
		}
		
		System.out.println("");
		
		map.remove(p3.getDni());
		printForeach(map, "removed p3");
		
		System.out.println("");
		System.out.println("");
		System.out.println("Contains");
		System.out.println("Contains key "+p2.getDni()+"? "+map.containsKey(p2.getDni()));
		System.out.println("Contains value "+p2.getDni()+"? "+map.containsValue(p2.getDni()));
		System.out.println("Contains value p2? "+map.containsValue(p2));
		
		System.out.println("");
		System.out.println("");
		System.out.println("get");
		
		System.out.println("Persona con dni 123: "+ map.get(123));
		
		HashMap<Integer, Persona> map2= new HashMap<Integer, Persona>(map);
		
		printForeach(map2, "map2");
		
		Map<Integer, Persona> sortedMap = new TreeMap<Integer, Persona>(map2);
		printForeach(sortedMap, "sort");
		
	}
	
	private static void printForeach(Map<Integer, Persona> map, String title){
		System.out.println("");
		System.out.println("");
		System.out.println(title);
		for (Map.Entry entry: map.entrySet()) {
			System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
		}
	}

}

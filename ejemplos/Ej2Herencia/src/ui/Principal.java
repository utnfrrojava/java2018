package ui;

import entidades.*;

public class Principal {

	public static void main(String[] args){
		Persona p = new Persona();
		p.setApellido("Perez");
		p.setNombre("Juan");
		p.setEdad(3);
		System.out.println(p.getDesc());
		
		Persona p2=new Persona();
		p2.setApellido("algo");
		System.out.println(p2.getDesc());
		
		Persona p3=new Persona("feo", "algo");
		System.out.println(p3.getDesc());
		
		Alumno a=new Alumno();
		System.out.println(a.getDesc());
		
		Persona p4=new Alumno();
		System.out.println(p4.getDesc());
		
	}
	
}

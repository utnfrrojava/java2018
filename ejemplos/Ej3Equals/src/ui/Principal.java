package ui;

import java.util.Scanner;

import entities.Alumno;
import entities.Persona;

public class Principal {
	
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.print("Ingrese A: ");
		String A=s.nextLine();
		System.out.print("Ingrese B: ");
		String B=s.nextLine();
		
		System.out.print("A: "+A+" B: "+B+" => ");
		System.out.print("A==B -> ");
		System.out.println(A==B);
		
		System.out.print("A: "+A+" B: "+B+" => ");
		System.out.print("A.equals(B) -> ");
		System.out.println(A.equals(B));
		
		s.close();
		
		Persona p1=new Persona();
		p1.setDni(12345678);
		p1.setNombre("Juan");
		p1.setApellido("Perez");
		
		Persona p2=new Persona();
		p2.setDni(12345678);
		p2.setNombre("Juancho");
		p2.setApellido("Perez");
		
		Alumno a=new Alumno();
		a.setDni(12345678);
		a.setNombre("Juan");
		a.setApellido("Perez");
		a.setLegajo(12345);
		
		System.out.print("p1 == p2 ");
		System.out.println(p1 == p2);
		
		System.out.print("p1.equals(p2) ");
		System.out.println(p1.equals(p2));
		
		System.out.print("p1 == a ");
		System.out.println(p1 == a);
		System.out.print("p1.equals(a) ");
		System.out.println(p1.equals(a));
		
		System.out.println("p1: "+p1.toString());
		System.out.println("p2: "+p2.toString());
		System.out.println("a: "+a.toString());
		
	}
}

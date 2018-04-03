package ejemplo1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String dato = s.nextLine();
		int d=Integer.parseInt(dato);
		System.out.println("El dato es: "+d);
		
		String[] palabras = new String[10];
		
		for (int i = 0; i < palabras.length; i++) {
			System.out.print("Ingrese la palabra siguiente: ");
			palabras[i]=s.nextLine();
		}
		
		for (int i = palabras.length-1; i >=0; i--) {
			System.out.println(palabras[i]);
		}
		
		System.out.print("Ingrese el numero a comparar: ");
		int nro=Integer.parseInt(s.nextLine());
		
		int[] nros=new int[20];
		for (int i = 0; i < nros.length; i++) {
			System.out.print("Ingrese el siguiente nro: ");
			nros[i]=Integer.parseInt(s.nextLine());
		}
		System.out.println("Mayores");
		for (int i = 0; i < nros.length; i++) {
			if(nros[i]>nro){
				System.out.println(nros[i]);
			}
		}
		
		s.close();
		
		
		
	}

}

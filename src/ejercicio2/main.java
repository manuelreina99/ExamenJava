package ejercicio2;

import java.util.Scanner;
import ejercicio2.*;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		entradas[] listado = new entradas[1000];
		concertSala lista1 = new concertSala(listado);
		
		
		entradas principal= new entradas(1000, "principal");
		entradas platea= new entradas(200, "platea");
		entradas vip= new entradas(25, "vip");
		
		
	
		
		
		lista1.anadirEntrada(principal);
		lista1.anadirEntrada(platea);
		lista1.anadirEntrada(vip);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("introduzca 1 para mostrar el numero de entradas ");
		System.out.println("introduzca 2 para vender  entradas ");
		System.out.println("introduzca 3 para salir ");
		
		int  opcion= scanner.nextInt();
		
		while(opcion != 3) {
			
			if (opcion==1) {
				
				
				
				lista1.mostrarLista();
				
				
			}
			
			else if (opcion==2) {
				
				System.out.println("introduzca zona, principal, platea o vip");
				String n = scanner.next();
				
				lista1.venderEntradas(n);
				lista1.mostrarLista();
			}
			
			
			
			
			opcion= scanner.nextInt();
		}
		
		System.out.println("ha salido del programa");

	}
	
	public static void numeroEntradas(String tipo) {
		
		
		
	}

}

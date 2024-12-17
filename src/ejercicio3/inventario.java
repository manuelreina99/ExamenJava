package ejercicio3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import ejercicio2.entradas;

public class inventario {
	
	private productos[] listado = new productos[100];

	public productos[] getListado() {
		return listado;
	}

	public void setListado(productos[] listado) {
		this.listado = listado;
	}

	public inventario(productos[] listado) {
		super();
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "inventario [listado=" + Arrays.toString(listado) + "]";
	}
	
	public void buscarproducto(String n) {
		Scanner scanner= new Scanner(System.in);
		
		for(int i =0; i<listado.length; i++) {
			
			if (listado[i]==null) {
				
			}else {
				
			
			
				if (listado[i].getNombre().equals(n)) {
				
				System.out.println("modificar informacion de "+ n);
				
				System.out.print("nombre: ");
               
				
                
                String nombre = scanner.nextLine();
                
                listado[i].setNombre(nombre);
                
                System.out.print("stock: ");
                
                int stock = scanner.nextInt();
                
                listado[i].setStock(stock);
                
                System.out.print("Precio: ");
                
                double precio = scanner.nextDouble();
                listado[i].setPrecio(precio);
                
                
				break;
				
				
				}
			}
		}
		
		
	}
	
	
	public void mostrarLista() {
		
		for(int i =0; i<listado.length;i++) {
			
			
			if (listado[i] != null) {
				System.out.println(listado[i]);
			}
			
		}
		
		
		
	}
	
	public void anadirproducto( productos n) {
		
		
		
		
		for (int i = 0; i < listado.length; i++) {
				if (listado[i] == null) {
					listado[i] = n;
					break;
				}
			}
		}
	
	
	public void eliminarproducto() {
		
		var sc = new Scanner(System.in);
		System.out.println("Introduce el producto a eliminar ");
		String nombre = sc.nextLine();
		for (int i = 0; i < listado.length; i++) {
			
			if (listado[i]==null) {
				
			}else {
				
			
			if (nombre.equalsIgnoreCase(listado[i].getNombre())) {
				listado[i] = null;
				break; 
			}
			}
		}
	}
	
	public void valortotal() {
		
		double contador=0;
		
		
		for (int i = 0; i < listado.length; i++) {
			
			if (listado[i]==null) {
				
			}else {
				
			
			
			contador = contador + listado[i].getPrecio();
			}
		}
		
		System.out.println("el valor total del inventario es: "+ contador);
		
	}
	
	public void stockseguridad() {
		
		for (int i = 0; i < listado.length; i++) {
			
			if (listado[i]==null) {
				
			}else {
				
				if(listado[i].getStock()<50) {
					
					System.out.println(listado[i]);
					
				}
				
			}
			
		}
		
	}
	
	
	public void rellenarArray() {
		
		
			Scanner scanner= new Scanner(System.in);
			
			for(int i =0; i<listado.length; i++) {
				
				if (listado[i]==null) {
					
				}else {
					
					System.out.println("Esta usted rellenando el producto: "+ i);
					
					System.out.print("nombre: ");
	               
					
	                
	                String nombre = scanner.next();
	                
	                listado[i].setNombre(nombre);
	                
	                System.out.print("stock: ");
	                
	                int stock = scanner.nextInt();
	                
	                listado[i].setStock(stock);
	                
	                System.out.print("Precio: ");
	                
	                double precio = scanner.nextDouble();
	                listado[i].setPrecio(precio);
		
				}

			}
			
	}
	
}




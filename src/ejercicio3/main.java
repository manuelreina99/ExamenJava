package ejercicio3;

import java.util.Scanner;

import ejercicio2.concertSala;
import ejercicio2.entradas;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		productos[] articulos = new productos[100];
		Scanner scanner= new Scanner(System.in);
		int opcion;
		
		
		
		
	
		
		inventario inventario1 = new inventario(articulos);
		
		
		productos camiseta = new productos("Camiseta", 100, 12.00);
		productos sudadera = new productos("Sudadera", 70, 20.00);
		productos pantalones = new productos("pantalones", 38, 35.00);
		productos chaqueta = new productos("Chaqueta", 40, 70.00);
		productos camisa = new productos("camisa", 57, 50.00);
		
		inventario1.anadirproducto(camiseta);
		inventario1.anadirproducto(sudadera);
		inventario1.anadirproducto(pantalones);
		inventario1.anadirproducto(chaqueta);
		inventario1.anadirproducto(camisa);
		
		
		
		
		
		 do {
	            
	            System.out.println("1. Introducir datos nuevo inventario");
	            System.out.println("2. Nuevo producto");
	            System.out.println("3. Buscar producto y modificar información.");
	            System.out.println("4. eliminar");
	            System.out.println("5. Mostrar valor total del inventario");
	            System.out.println("6. Informe rotura de stock");
	            	
	            System.out.println("7. Salir");
	            System.out.print("Seleccione una opción: ");
	            opcion = scanner.nextInt();

	            switch (opcion) {
	            
	            
	                case 1:
	                	
	                	inventario1.rellenarArray();
	                	
	                	
	                	inventario1.mostrarLista();
	                	
	                	
	                   
	                    break;

	                case 2:
	                    System.out.print("nombre: ");
	                    scanner.nextLine();
	                    
	                    String nombre = scanner.nextLine();
	                    
	                    System.out.print("stock: ");
	                    
	                    int stock = scanner.nextInt();
	                    
	                    System.out.print("Precio: ");
	                    
	                    double precio = scanner.nextDouble();
	                    
	                
	                    
	                    productos a = new productos(nombre, stock, precio);
	                    
	                    inventario1.anadirproducto(a);
	                    
	                    System.out.println("se ha añadido el articulo");
	                    
	                    inventario1.mostrarLista();
	                    
	                    
	                    
	                    break;

	                case 3:
	                	
	                	
	                	System.out.println("introduzca producto a modificar");
	                	
	                	String nombre1 = scanner.next();
	                	inventario1.buscarproducto(nombre1);
	                	
	                	inventario1.mostrarLista();
	                	
	                	
	                    break;

	                case 4:
	                    
	                	inventario1.eliminarproducto();
	                	
	                	inventario1.mostrarLista();
	                	break;

	                case 5:
	                    
	                	inventario1.valortotal();
	                	
	                    break;

	                case 6:
	                    
	                     
	                     inventario1.stockseguridad();
	                    
	                   
	                    break;

	                case 7:
	                    System.out.println("Saliendo del programa.");
	                    break;

	                default:
	                    System.out.println("Opción no válida.");
	            }

	        } while (opcion != 7);

	        scanner.close();
	        
	        
	    
	        
	        
	  
	
	
		
	

	}
	
	
	
	
	
}



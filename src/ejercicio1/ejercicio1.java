package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("introduzca palabra ");
		
		String palabraString= scanner.nextLine();
		
		
		
		System.out.println("tiene "+ contador_palabras(palabraString)+ " palabras");
		
		
			
			}
	
	public static int contador_palabras(String frase) {
		
		int contadorEspacios = 1;

        
        for (int i = 0; i < frase.length(); i++) {
        	
        	
            if (frase.charAt(i) == ' ') {
            	
                contadorEspacios++;
            }
        }

       return contadorEspacios;
	}
		
		
		
		
		
		
		}



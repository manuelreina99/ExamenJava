package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("introduzca palabra ");
		
		String palabraString= scanner.next();
		int contador = 1;
		
		for( int i=0; i<palabraString.length(); i++) {
			
			
			if (palabraString.charAt(i) == ' ') {
            	
                contador++;
                
			
			}
		
		

        
       
        }
		System.out.println("tiene "+ contador+ " palabras");
		
		for(int i=0; i<palabraString.length();i++) {
			
			
			
			
			}
		
		
		
		
		
		
		}

}

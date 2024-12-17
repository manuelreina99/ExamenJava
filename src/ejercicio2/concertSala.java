package ejercicio2;

import java.util.Arrays;
import java.util.Iterator;



public class concertSala {
	
	private entradas[] listado = new entradas[1000];
	
	

	public entradas[] getListado() {
		return listado;
	}

	public void setListado(entradas[] listado) {
		this.listado = listado;
	}

	public concertSala(entradas[] listado) {
		super();
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "concertSala [listado=" + Arrays.toString(listado) + "]";
	}
	
	
	public void mostrarLista() {
		
		for(int i =0; i<listado.length;i++) {
			
			
			if (listado[i] != null) {
				System.out.println(listado[i]);
			}
			
		}
		
		
		
	}
	
	
	public void anadirEntrada( entradas n) {
		
		
		
		
		for (int i = 0; i < listado.length; i++) {
				if (listado[i] == null) {
					listado[i] = n;
					break;
				}
			}
		}
	


	public void venderEntradas(String n) {
		
		for(int i = 0; i<listado.length; i++) {
			
			if (listado[i]==null) {
				
			}else {
				
				if (n.equals(listado[i].getZonas())) {
					
					int a=listado[i].getNumero();
					a=a-1;
					listado[i].setNumero(a);
					
				}
				
			}
			
			
		}
	}
		
}
	



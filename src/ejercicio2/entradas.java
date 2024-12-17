package ejercicio2;

public class entradas {
	
	private int numero;
	private String zonas;
	
	
	
	public entradas(int numero, String zonas) {
		super();
		this.numero = numero;
		this.zonas = zonas;
		
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public String getZonas() {
		return zonas;
	}



	public void setZonas(String zonas) {
		this.zonas = zonas;
	}



	@Override
	public String toString() {
		return "entradas [numero=" + numero + ", zonas=" + zonas + "]";
	}
	
	
	
	
	
	
	
	
	

}

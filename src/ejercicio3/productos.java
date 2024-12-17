package ejercicio3;

public class productos {
	
	private String nombre;
	private int stock;
	private double precio;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	public productos(String nombre, int stock, double precio) {
		super();
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "productos [nombre=" + nombre + ", stock=" + stock + ", precio=" + precio + "]";
	}
	
	
	
	
		
		
		
	}
	
	



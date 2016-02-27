package wwc.libros;



public class Libro {
	
	private String nombre;
	private Autor autor;
	private int precio;
	private boolean enStock;
	
	public Libro(String nombre, Autor autor, int precio, boolean enStock) {
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
		this.enStock = enStock;
	}
	
	// Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public boolean isEnStock() {
		return enStock;
	}
	public void setEnStock(boolean enStock) {
		this.enStock = enStock;
	}
	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autor=" + autor + ", precio="
				+ precio + ", enStock=" + enStock + "]";
	}
	
}


public class Persona {
	
	private String nombre;
	private int edad ;
	
	public Persona(String nombre) {
		this.nombre = nombre;
		this.edad = 20;
	}
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void saludar(){
		System.out.println("Hola "+nombre);
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	

}

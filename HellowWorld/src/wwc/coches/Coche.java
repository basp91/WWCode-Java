package wwc.coches;

public class Coche {

	private String marca;
	private String modelo;
	private Motor motor;
	
	public Coche(String marca, String modelo){
		this.marca = marca;
		this.modelo = modelo;
		this.motor = new Motor(1200,2);
	}
	
	// Getters & Setters 
	
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", motor="
				+ motor + "]";
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
		
}

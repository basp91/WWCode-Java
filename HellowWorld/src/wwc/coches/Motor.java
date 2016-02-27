package wwc.coches;

public class Motor {

	private int potencia;
	private int tiempos;
	
	public Motor(int potencia, int tiempos){
		this.potencia = potencia;
		this.tiempos = tiempos;
	}
	
	// Getters & Setters
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getTiempos() {
		return tiempos;
	}
	public void setTiempos(int tiempos) {
		this.tiempos = tiempos;
	}

	@Override
	public String toString() {
		return "Motor [potencia=" + potencia + ", tiempos=" + tiempos + "]";
	}
	
}

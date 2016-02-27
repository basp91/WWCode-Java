package wwc.figuras;

public class Circulo implements Geometria {
	
	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double getArea() {
		return Math.PI*radio*radio;
	}

	@Override
	public double getPerimetro() {
		return Math.PI*2*radio;
	}
	
}

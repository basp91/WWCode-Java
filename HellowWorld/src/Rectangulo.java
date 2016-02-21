
public class Rectangulo extends Figura{

	private double largo;
	private double ancho;
	
	public Rectangulo(String color, boolean relleno, double largo, double ancho) {
		super(color, relleno);
		this.largo = largo;
		this.ancho = ancho;
	}

	public Rectangulo(double largo, double ancho) {
		super();
		this.largo = largo;
		this.ancho = ancho;
	}
	
	public Rectangulo(){
		super();
		this.largo = 1;
		this.ancho = 1;
	}
	
	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	@Override
	public double getArea() {
		return largo*ancho;
	}

	@Override
	public double getPerimetro() {
		return 2*(largo+ancho);
	}

	@Override
	public String toString() {
		return "Rectangulo [largo=" + largo + ", ancho=" + ancho + ", color="
				+ color + ", relleno=" + relleno + "]";
	}
	
	

}

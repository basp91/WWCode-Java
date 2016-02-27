package wwc.figuras;

public class Cuadrado extends Rectangulo {
	
	public Cuadrado() {
		super();
	}

	public Cuadrado(double lado) {
		super(lado, lado);
	}

	public Cuadrado(String color, boolean relleno, double lado) {
		super(color, relleno, lado, lado);
	}

	public void setLado(double lado) {
		super.setAncho(lado);
		super.setLargo(lado);
	}
	
	public double getLado(){
		return super.getAncho();
	}

//	@Override
//	public void setLargo(double largo) {
//		this.setLado(largo);
//	}
//
//	@Override
//	public void setAncho(double ancho) {
//		this.setLado(ancho);
//	}

	@Override
	public String toString() {
		return "Cuadrado [color=" + color + ", relleno=" + relleno + ", lado=" + getLado() + "]";
	}
	
}

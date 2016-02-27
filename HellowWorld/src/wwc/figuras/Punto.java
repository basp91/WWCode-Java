package wwc.figuras;

public class Punto {
	
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	public double distancia(Punto punto){
		System.out.println("Calculando la distancia");
		System.out.println(punto.toString());
		System.out.println(this.toString());
		
		return Math.sqrt(Math.pow(x-punto.getX(), 2)
				+Math.pow(y-punto.getY(),2));
	}
	public void desplazar(double dx, double dy){
		x+=dx;
		y+=dy;
	}
	
}

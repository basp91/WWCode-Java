
public abstract class Figura implements Coloreable, Geometria{

	protected String color;
	protected boolean relleno;
	
	public Figura(String color, boolean relleno) {
		this.color = color;
		this.relleno = relleno;
	}
	
	public Figura(){
		this.color = "Rojo";
		this.relleno = true;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isRelleno() {
		return relleno;
	}
	public void setRelleno(boolean relleno) {
		this.relleno = relleno;
	}
	
	@Override
	public String toString() {
		return "Figura [color=" + color + ", relleno=" + relleno + "]";
	}
	
}

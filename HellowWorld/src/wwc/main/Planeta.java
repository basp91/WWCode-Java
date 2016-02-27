package wwc.main;

public enum Planeta {
	MERCURIO(3.303+23, 2.4397e6),
	TIERRA(5.976e+24, 6.37814e6),
	MARTE(6.421e+23,3.3972e6),
	JUPITER(1.9e+27,7.1492e7);
	
	private double masa;
	private double radio;
	
	Planeta(double masa, double radio){
		this.masa = masa;
		this.radio = radio;
	}

	public double getMasa() {
		return masa;
	}

	public double getRadio() {
		return radio;
	}
	
	public double dobleMasa(){
		return masa*2;
	}
	

}

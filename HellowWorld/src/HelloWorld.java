
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("HelloWorld");
		Persona betty = new Persona("Betty");
		betty.saludar();
		Persona ana = new Persona("Ana");
		ana.saludar();
		System.out.println(ana.getNombre());
		System.out.println(ana.getEdad());
		
		Persona victor = new Persona("Victor", 30);
		System.out.println(victor.getNombre()+ " tiene " +victor.getEdad()+ " años");
		
		Planeta planetaMercurio = Planeta.JUPITER; 
		switch(planetaMercurio){
			case JUPITER:
				System.out.println(planetaMercurio.dobleMasa());
				break;
			case MERCURIO:
				System.out.println("hola Mercurio");
				break;
			default :
				System.out.println("Hola planeta");
				break;			
		}
		
		Punto p1 = new Punto(1,2);
		Punto p2 = new Punto(3,4);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		p1.desplazar(2, 1);
		System.out.println(" P! desplazado" + p1.toString());
		System.out.println("la distancia es " + p1.distancia(p2));
	
		
	}
}

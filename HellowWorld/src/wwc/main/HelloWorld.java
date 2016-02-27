package wwc.main;
import wwc.figuras.*;
import wwc.libros.*;
import wwc.coches.*;

public class HelloWorld {

	public static void main(String[] args) {
		
		// HELLO WORLD
		
		System.out.println("Hello World!");
		
		// EJERCICIO DE PERSONA
		
		Persona betty = new Persona("Betty");
		betty.saludar();
		Persona ana = new Persona("Ana");
		ana.saludar();
		System.out.println(ana.getNombre());
		System.out.println(ana.getEdad());
		
		Persona victor = new Persona("Victor", 30);
		System.out.println(victor.getNombre()+ " tiene " +victor.getEdad()+ " años");
		
		// EJERCICIO DE ENUM
		
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
		
		// EJERCICIO DE CLASE PUNTO
		
		Punto p1 = new Punto(1,2);
		Punto p2 = new Punto(3,4);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		p1.desplazar(2, 1);
		System.out.println(" P! desplazado" + p1.toString());
		System.out.println("la distancia es " + p1.distancia(p2));
	
		
		// EJERCICIO DE COMPOSICIÓN COCHE - MOTOR
		
		Coche cochecito = new Coche("Ford", "Mustang");
		
		System.out.println(cochecito);
		System.out.println(cochecito.getMarca());
		System.out.println(cochecito.getModelo());
		System.out.println("potencia: "+cochecito.getMotor().getPotencia());
	
		// EJERCICIO DE AGREGACIÓN LIBRO - AUTOR
		
		Autor jkRowling = new Autor("JK Rowling", "jk@gmail.com", "+431234-2345");
		Libro HPLPF = new Libro("Harry Potter y la Piedra Filosofal", jkRowling, 250, true);
		
		System.out.println(HPLPF);
		System.out.println(HPLPF.getNombre());
		System.out.println(HPLPF.getAutor().getNombre());
		
		// EJERCICIO FIGURAS GEOMETRICAS
		
		Circulo cir = new Circulo(3.5);
		Triangulo tri = new Triangulo(2, 7);
		System.out.println(cir.getArea());
		System.out.println(cir.getRadio());
		System.out.println(tri.getArea());		
		Geometria geo = new Circulo(2); // POLIMORFISMO
		System.out.println(geo.getArea());
		
		Rectangulo rec = new Rectangulo(2,4);
		Cuadrado cuad = new Cuadrado("verde", false, 5);
		System.out.println(rec);
		System.out.println(cuad);
		
		
	}
			
}

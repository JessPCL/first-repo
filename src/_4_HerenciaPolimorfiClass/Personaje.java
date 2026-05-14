package _4_HerenciaPolimorfiClass;

public class Personaje {
	  String nombre;
	     int salud;

	    public Personaje(String nombre, int salud) {
	        this.nombre = nombre;
	        this.salud = salud;
	    }

	    public void recibirDanio(int danio) {
	        salud -= danio;
	        System.out.println(nombre + " recibió " + danio + " de daño. Salud restante: " + salud);
	    }

	    public String getNombre() {
	        return nombre;
	    }
	    
	    public int getSalud() {
	        return salud;
	    }
	    
	    @Override
	    public String toString() {
	    	return "Nombre: "+nombre+"\nSalud: "+salud;
	    }
		  
}

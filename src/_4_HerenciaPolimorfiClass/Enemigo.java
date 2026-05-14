package _4_HerenciaPolimorfiClass;

public class Enemigo extends Personaje {
	
	  public Enemigo(String nombre, int salud) {
	        super(nombre, salud);
	    }
	  // Método que debe ser sobrescrito por las subclases
	    public void atacar(Jugador jugador, int d) {
	        System.out.println(nombre + " ataca a " + jugador.getNombre());
	        jugador.recibirDanio(d);
	    }
	    
	   
		  
}

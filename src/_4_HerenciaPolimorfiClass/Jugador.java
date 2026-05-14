package _4_HerenciaPolimorfiClass;

public class Jugador extends Personaje {
	 public Jugador(String nombre, int salud) {
	        super(nombre, salud);
	    }

	    public void atacar(Enemigo enemigo, int d) {
	        System.out.println(nombre + " ataca a " + enemigo.getNombre());
	        enemigo.recibirDanio(d);
	    }

	    // Método que debe ser sobrescrito por las subclases
	    public void habilidadEspecial() {
	        System.out.println("Jugador utiliza una habilidad especial.");
	    }
   
	    

}

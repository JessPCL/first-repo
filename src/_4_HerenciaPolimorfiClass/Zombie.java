package _4_HerenciaPolimorfiClass;

public class Zombie extends Enemigo {
	 public Zombie(String nombre, int salud) {
	        super(nombre, salud);
	    }

	    // Sobrescribe el método de atacar
	    @Override
	    public void atacar(Jugador jugador, int d) {
	        System.out.println("Zombie muerde a " + jugador.getNombre());
	        jugador.recibirDanio(d);
	    }
}

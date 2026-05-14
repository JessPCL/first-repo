package _4_HerenciaPolimorfiClass;

public class Mago extends Jugador {
	 public Mago(String nombre, int salud) {
	        super(nombre, salud);
	    }
	    // Sobrescribe el método de atacar
	    @Override
	    public void atacar(Enemigo enemigo, int d) {
	        System.out.println("Mago ataca a " + enemigo.getNombre());
	        enemigo.recibirDanio(d);
	    }
	    @Override
	    public void habilidadEspecial() {
	        System.out.println(nombre+" utiliza una habilidad especial.");
	    }
}

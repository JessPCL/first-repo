package _4_HerenciaPolimorfiClass;

public class Guerrero extends Jugador {
	public Guerrero(String nombre, int salud) {
        super(nombre, salud);
    }
    // Sobrescribe el método de atacar
    @Override
    public void atacar(Enemigo enemigo, int d) {
        System.out.println("El Guerrero: "+nombre+ " ataca al enemigo " + enemigo.getNombre());
        enemigo.recibirDanio(d);
    }
   @Override
    public void habilidadEspecial() {
       super.habilidadEspecial(); //PORQUE LLAMA A LA DE PADRE XD
    }
 

   
}

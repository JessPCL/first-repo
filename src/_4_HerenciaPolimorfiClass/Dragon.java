package _4_HerenciaPolimorfiClass;
public class Dragon extends Enemigo {
	public Dragon(String nombre, int salud) {
        super(nombre, salud);
    }

    // Sobrescribe el método de atacar
    @Override
    public void atacar(Jugador jugador, int d) {
        System.out.println("Dragon lanza una llamarada de fuego.");
        jugador.recibirDanio(d);
    }

}

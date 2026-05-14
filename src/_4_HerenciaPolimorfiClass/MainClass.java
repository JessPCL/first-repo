package _4_HerenciaPolimorfiClass;
import java.util.Scanner;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Enemigo d=null;
Enemigo z=null;

		
		ArrayList<Jugador> equipo= new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		
	
			System.out.print("Cuantos heroes quieres? : \n");	
			
			int n=sc.nextInt();
			sc.nextLine();
		for(int i=0; i<n;i++) {
			System.out.print("ELige un tipo de heroe:\n1.Guerrero.\n2.Mago\n3.SALIR \n");
			
			
			int op=sc.nextInt();
			
			sc.nextLine();
			
			
			System.out.print("Ingresa un nombre:\n");
			String nombre=sc.nextLine();
			
			System.out.print("Ingresa salud:\n");
			int salud=sc.nextInt();
			sc.nextLine();
			
			
			if(op==2) {//MAGO
						equipo.add(new Mago(nombre, salud));	
				}
			else if(op==1) {//GUERRERO
					
						equipo.add(new Guerrero(nombre, salud));
					}
			
		}
		
		
System.out.print("!Contamos con los siguientes enemigos!\r\n"
		+ "1. Dragon (D)\r\n"
		+ "2. Zombie (Z)");

		int op2=sc.nextInt();
		sc.nextLine();
		

		System.out.print("Ingresa un nombre para dragon:\n");
		String nD=sc.nextLine();
		
		System.out.print("Ingresa salud dragon:\n");
		int sD=sc.nextInt();
		sc.nextLine();
		
		d=new Dragon(nD, sD);
		
		System.out.print("Ingresa un nombre para zombie:\n");
		String zD=sc.nextLine();
		
		System.out.print("Ingresa salud zombie:\n");
		int zN=sc.nextInt();
		sc.nextLine();
		z=new Zombie(zD, zN);

		
		
		
		boolean cont=true;
		while(cont) {
			System.out.print("Ingresa a que enemigo quieres atacar!\r\n1."+ d.getNombre()+"\n2. "+z.getNombre());
			int enemigoOP=sc.nextInt();
			sc.nextLine();
					
			
			System.out.print("!Ingresa con que héroe quieres atacar!\r\n");
			for(int i=0;i<(equipo.size());i++) {
				System.out.print((i)+"."+equipo.get(i).getNombre()+"\n");
			}
			int Heroe=sc.nextInt();
			sc.nextLine();
			
			
			if(enemigoOP==1) {
				System.out.print("Ingrese el danio (numero entero entre 1-1"
						+ "\00) para atacar al "+ d.getNombre());
				int danioDragon=sc.nextInt();
				sc.nextLine();
				
				if(equipo.get(Heroe) instanceof Guerrero) {
					Guerrero g=(Guerrero)equipo.get(Heroe);
					g.atacar(d,danioDragon);
				} else if(equipo.get(Heroe) instanceof Mago) {
					Mago g=(Mago)equipo.get(Heroe);
					g.atacar(d,danioDragon);
				}
				
			}else if(enemigoOP==2){
				System.out.print("Ingrese el danio (numero entero entre 1-100) para atacar al "+ z.getNombre());
				int danioDragon=sc.nextInt();
				sc.nextLine();
				
				if(equipo.get(Heroe) instanceof Guerrero) {
					Guerrero g=(Guerrero)equipo.get(Heroe);
					g.atacar(z,danioDragon);
				} else if(equipo.get(Heroe) instanceof Mago) {
					Mago g=(Mago)equipo.get(Heroe);
					g.atacar(z,danioDragon);
				}
			}
			
			int opSalida=0;
			if(d.getSalud()>0 && z.getSalud()>0) {
				System.out.print("Escoge una opcion si quieres seguir atacando\r\n"
						+ "1. Si\r\n"
						+ "2. No (Salir del Juego)\n");
				opSalida=sc.nextInt();
				sc.nextLine();
				
				
			}else {
				if(d.getSalud()<=0) {
					System.out.print(d.getNombre()+"(HA MUERTO)");
					break;
				}else if(z.getSalud()<=0) {
					System.out.print(z.getNombre()+"(HA MUERTO)");
					break;
				}
			}
			
			if (opSalida == 2) {
                cont = false;
            }
			
			
			
				
				

		
		
		
			
	}
		
		sc.close();
		}
		
	
}
	



	

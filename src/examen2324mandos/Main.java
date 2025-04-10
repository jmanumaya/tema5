package examen2324mandos;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Mando> mandos = new ArrayList<Mando>();
	
		mandos.add(new MandoAire("Aire99", 10, 5, 3));
		mandos.add(new MandoTelevisor("Tv5", 10, 5, 4));
		mandos.add(new MandoMinicadena("Mini80", 10, 5, 2));
		mandos.add(new MandoAspiradora("Aspirador3000", 10, 5, 1));
		
		System.out.println(mandos);
		
		System.err.println();
		
		mandos.sort(new ComparaPrecios());
		
		System.out.println(mandos);
		
		Collections.sort(mandos);
		
		System.out.println();
		
		System.out.println(mandos);
		
		System.out.println();
		
		System.out.println("~~ ACCIONES CON LOS MANDOS ~~");
			
		for(Mando mando : mandos) {
			
			System.out.println(mando);
			
			mando.onOff();
			
			System.out.println(mando);
			
			if (mando instanceof MandoTelevisor) {
				
				MandoTelevisor m1 = (MandoTelevisor) mando;
				
				m1.subirCanal();
				m1.subirVolumen();
				System.out.println(mando);
				m1.bajarVolumen();
				
			} else if (mando instanceof MandoMinicadena) {
				
				MandoMinicadena m2 = (MandoMinicadena) mando;
				
				m2.subirVolumen();
				System.out.println(mando);
				m2.bajarVolumen();
				
			} else if (mando instanceof MandoAspiradora) {
				
				MandoAspiradora m3 = (MandoAspiradora) mando;
				
				m3.subirVelocidad();
				System.out.println(mando);
				m3.bajarVelocidad();
				
			} else if (mando instanceof MandoAire){
				
				MandoAire m4 = (MandoAire) mando;
				
				m4.cambiarModo();
				m4.subirTemperatura();
				m4.subirVelocidad();
				System.out.println(mando);
				m4.bajarVelocidad();
			}
			
			System.out.println(mando);
			
			System.out.println("----------------------------\n");
		
		}

	}

}

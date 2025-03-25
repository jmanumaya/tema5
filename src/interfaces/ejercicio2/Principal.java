package interfaces.ejercicio2;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		List<Futbolista> futbolistas = new ArrayList<>();
        
        futbolistas.add(new Futbolista(10, "Messi", 36, 800));
        futbolistas.add(new Futbolista(7, "Cristiano", 39, 850));
        futbolistas.add(new Futbolista(9, "Lewandowski", 35, 600));
        futbolistas.add(new Futbolista(11, "Neymar", 32, 400));
        futbolistas.add(new Futbolista(7, "Mbappe", 25, 300));
        
        Collections.sort(futbolistas);
        
        for (Futbolista f : futbolistas) {
            System.out.println(f);
        }

	}

}

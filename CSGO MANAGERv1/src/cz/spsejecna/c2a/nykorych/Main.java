package cz.spsejecna.c2a.nykorych;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//------------------------------------------------------------ArrayListy---------------------------------------------------------------
		ArrayList<Team> ListOfTeams1 = new ArrayList<Team>();
//------------------------------------------------------------HashMapy-----------------------------------------------------------------
		HashMap<Integer, Team> ListOfTeamsHM1 = new HashMap<Integer, Team>();
		
		
		
//------------------------------------------------------------Natus Vincere------------------------------------------------------------

		Player S1mple = new Player("Alexandr", "Kostylev", "s1mple", 1500000, 22, "Sniper");
		Player Electronic = new Player("Denis", "Sharipov", "electroNic", 650000, 21, "Rifler");
		Player Boombl4 = new Player("Kirill", "Mikhailov", "boombl4", 200000, 21, "In-game leader");
		Player Flamie = new Player("Egor", "Vasilev", "flamie", 100000, 23, "Support");
		Player Perfecto = new Player("Ilya", "Zalutskiy", "Perfecto", 100000, 20, "Lurker");

		Team NatusVincere = new Team("Natus Vincere", S1mple, Electronic, Boombl4, Flamie, Perfecto, 1, 3);
		ListOfTeams1.add(NatusVincere);
		ListOfTeamsHM1.put(1, NatusVincere);
//------------------------------------------------------------Astralis------------------------------------------------------------------		

		Player Dev1ce = new Player("Nicolai", "Reedtz", "dev1ce", 800000, 24, "Sniper");
		Player Dupreeh = new Player("Peter", "Rasmussen", "dupreeh", 400000, 27, "Second sniper");
		Player Gla1ve = new Player("Lukas", "Rossander", "gla1ve", 200000, 24, "In-game Leader");
		Player Magisk = new Player("Emil", "Reif", "Magisk", 350000, 22, "Rifler");
		Player X9pyx = new Player("Andreas", "Hojsleth", "x9pyx", 200000, 24, "Support");

		Team Astralis = new Team("Astralis", X9pyx, Dev1ce, Dupreeh, Gla1ve, Magisk, 1, 1);
		ListOfTeams1.add(Astralis);
		ListOfTeamsHM1.put(2, Astralis);
		
		System.out.println("Vitej ve hře: CS:GO Manager v1");
		System.out.println("Vyber si možnost kterou budeš postupovat dal: ");
		System.out.println("1 .. Zacit za tym");
		System.out.println("2 .. Koupit roster");

		Scanner ZacatekVBR1 = new Scanner(System.in);

		int VyberZacatecniMoznosti = ZacatekVBR1.nextInt();

		if (VyberZacatecniMoznosti == 1) {
			System.out.println("Vybrali jste si možnost vybrat si team! Tymy:");
			System.out.println("1 .. Natus Vincere");
			System.out.println("2 .. Astralis");
			Scanner VyberTeamu1 = new Scanner(System.in);
			int vyberTeamuZacatek1 = VyberTeamu1.nextInt();
			
			System.out.println(ListOfTeamsHM1.get(vyberTeamuZacatek1));
		}

	}

}

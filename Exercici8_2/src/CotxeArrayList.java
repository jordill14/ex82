/*
 * CotxeArrayList.java        1.0 22/09/2015
 *
 * class CotxeArrayList
 *
 * Copyright 2015 Jordi Llonch Neira <jordill14@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class CotxeArrayList {
	public static void main(String[] args) {
		//Auto-generated method stub
		//ArrayList de cinc objectes
		ArrayList<Cotxe> car = new ArrayList<Cotxe>(5);
		//Afegim cinc objectes
		car.add(new Cotxe("Alfa Romeo","Giulia",2900,6));
		car.add(new Cotxe("Dacia","Sandero",1200,4));
		car.add(new Cotxe("Ford","Focus",2000,4));
		car.add(new Cotxe("Opel","Insignia",2200,4));
		car.add(new Cotxe("Seat","Ibiza",2900,6));
		//Imprimim potencia fiscal del cotxe en la posició 2(0,1,"2") del arraylist
		System.out.println("El cotxe a la posició 2 té una potència fiscal: " + car.get(2).pFiscal() + "\n");
		//Afegim dos cotxes nous
		car.add(new Cotxe("Hyundai", "Atos", 1500, 3));
		car.add(new Cotxe("Ford", "Focus", 2000, 4));
		//ArrayList permet duplicats
		car.add(new Cotxe("Seat","Ibiza",2900,6));
		for (int i = 0; i < car.size(); i++) {
			System.out.println(car.get(i).toString());
		}
		System.out.println("\nHem afegit un objecte duplicat, Seat Ibiza\n");
		//Afegim un nou objecte  a la posició 1(0,"1")
		car.add(1, new Cotxe("Audi", "A8", 4600, 8));
		System.out.println("Hem afegit el nou objecte a la posició 1\n");
		for (int i = 0; i < car.size(); i++) {
			System.out.println(car.get(i).toString());
		}
		//Substituim "set" un objecte per un altre de nou, comparem la marca i el model de cada objecte
		for (int i = 0; i < car.size(); i++) {
			if (car.get(i).getMarca().equals("Seat") && car.get(i).getModelo().equals("Ibiza")) {
				car.set(i, new Cotxe("Seat", "Mii", 1000, 3));
			}
		}
		//Posicio d'un objecte en concret
		for (int i = 0; i < car.size(); i++) {
			if (car.get(i).getMarca().equals("Ford") && car.get(i).getModelo().equals("Focus")) {
				System.out.println("\nFord Focus té la posició: " + (i + 1) + "\n"); 
			}
		}
		//Imprimim tots el objectes bucle normal
		System.out.println("\nBUCLE NORMAL FINS AL TAMANY\n");
		for (int i = 0; i < car.size(); i++) {
			System.out.println(car.get(i).toString());
		}
		//Imprimim tots el objectes amb for-each
		System.out.println("\nFOR-EACH\n");
		for (Cotxe c : car) {
			System.out.println(c.toString());
		}
		//Imprimim tots el objectes bucle normal
		System.out.println("\nAMB ITERATOR\n");
		Iterator<Cotxe> p =  car.iterator();
		while(p.hasNext()) {
			System.out.println(p.next()); 
		}
	}
}

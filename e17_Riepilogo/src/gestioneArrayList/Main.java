/*
Creazione e gestione di un ArrayList

Crea un programma che:

Crei un ArrayList di stringhe.
Aggiunga i nomi di 5 città.
Stampi tutte le città contenute nella lista.
Rimuova la seconda città.
Stampi nuovamente le città aggiornate.
 */
package gestioneArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/* DICHIARAZIONE VARIABILI:
		 * - ArrayList di tipo stringhe che conterrà le città
		 * - Oggetto di tipo scanner per gli input*/
		ArrayList<String> cities = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci 5 città: ");
		
		// for per l'input delle Stringhe
		for (int c = 0; c<5; c++) {
			String inserisci = scanner.nextLine();
			cities.add(inserisci);		
		}
		
		// chiusura scanner
		scanner.close();
		
		// prima stampa (tutti gli elementi dell'ArrayList, tramite for-each)
		System.out.println("Prima stampa: \n");
		
		for (String st1:cities) {
			System.out.println(st1);
		}
		
		// metodo remove per rimuovere il secondo elemento dell'ArrayList
		cities.remove(1);
		
		// seconda stampa
		System.out.println("Seconda stampa (dopo rimozione indice 1): \n");
		
		for (String st2:cities) {
			System.out.println(st2);
		}
	}

}

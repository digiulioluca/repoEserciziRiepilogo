/*
Traccia Modificata:

Crea una classe Prodotto con attributi nome, categoria e prezzo.
Crea una classe Negozio con un ArrayList di prodotti disponibili e metodi per:
- Filtrare i prodotti per categoria.
- Aggiungere nuovi prodotti al negozio.
Crea una classe Carrello che contiene un ArrayList di prodotti selezionati.
- Implementa un metodo per aggiungere un prodotto al carrello.
- Implementa un metodo per calcolare il totale del carrello.
Simula un negozio con almeno 5 prodotti e un carrello per un utente, includendo 
operazioni di filtraggio e acquisto.
 */
package negozio2aVers;

import java.util.ArrayList;
import java.util.Scanner;

import filtraggio.Prodotto;

public class Main {
	
	static void menu(Scanner scanner, ArrayList<Prodotto> prod, Carrello carr1, Negozio neg1) {
		// menù negozio/gestore regolato da un do-while e da uno switch case
		int scelta = 1;
		
		do {
			System.out.println("MENU' CLIENTE: \n1) Aggiungi prodotti al carrello"
					+ "\n2) Visualizza lista prodotti\n3) Filtra per categoria\n"
					+ "4) Calcola il totale del carrello\n5) Accedi al menù negozio"
					+ "\n6) Esci");
			scelta = scanner.nextInt();
			switch(scelta) {
			case 1:
				scanner.nextLine();
				carr1.aggiungiProdotto(scanner);
				break;
			case 2:
				neg1.stampaLista();
				break;
			case 3:
				scanner.nextLine();
				neg1.filtraElemento(scanner);
				break;
			case 4:
				carr1.stampaImporto();
				break;
			case 5:
				neg1.menuNegozio(scanner);
				break;
			case 6:
				System.out.println("Stai uscendo dal programma.");
				break;
			default:
				System.out.println("Codice errato.");
			}
			
		}while(scelta!=6);
	}

	public static void main(String[] args) {
		// DICHIARAZIONE
		ArrayList<Prodotto> carrello = new ArrayList<Prodotto>();
		Carrello carr2 = new Carrello();
		Negozio neg2 = new Negozio();
		
		Scanner scanner = new Scanner(System.in);
		menu(scanner, carrello, carr2, neg2);
		scanner.close();
		
		System.exit(0);
	}

}

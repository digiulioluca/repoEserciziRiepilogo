package negozio2aVers;

import java.util.ArrayList;
import java.util.Scanner;

public class Negozio {

	ArrayList<Prodotto> lista = new ArrayList<Prodotto>();

	public void aggiungiElemento(Scanner scanner) {
		/*
		 * metodo aggiungiElemento: dopo aver inserito il numero di elementi che si
		 * vogliono inserire, faccio partire un for (con termine ultimo il numero
		 * inserito da tastiera dall'utente) per aggiungere, tramite scanner e il metodo
		 * set, gli oggetti di tipo Prodotto nell'ArrayList che li conterà tutti.
		 */
		System.out.println("Selezione quanti prodotti vuoi inserire: ");
		int num = scanner.nextInt();
		
		if (num<0) {
			num = num*(-1);
		}

		System.out.println("INPUT DI "+num+" PRODOTTI");
		for (int c = 1; c <= num; c++) {
			Prodotto prod = new Prodotto();
			scanner.nextLine();
			System.out.println("Inserisci nome prodotto " + c + ": ");
			String nome = scanner.nextLine();
			prod.setNome(nome);
			System.out.println("Inserisci categoria prodotto " + c + ": ");
			String categoria = scanner.nextLine();
			prod.setCategoria(categoria);
			System.out.println("Inserisci prezzo prodotto " + c + ": ");
			double prezzo = scanner.nextDouble();
			if (prezzo<0) {
				prezzo=prezzo*(-1);
			}
			prod.setPrezzo(prezzo);
			// aggiunta nell'ArrayList
			lista.add(prod);
		}
	}

	public void filtraElemento(Scanner scanner) {
		/*
		 * metodo filtra: dopo aver raccolto da tastiera la categoria da filtrare,
		 * scorro con il for-each l'ArrayList per ricerca tutti gli elementi che
		 * contengono la stringa inserita dall'utente
		 */
		scanner.nextLine();
		System.out.println("Inserisci categoria per la ricerca: ");
		String categoria = scanner.nextLine();

		// booleana per gestire i risultati della ricerca
		boolean trovato = false;

		System.out.println("Elementi categoria " + categoria + ": ");
		for (Prodotto ricerca : lista) {
			if (categoria.equalsIgnoreCase(ricerca.getCategoria())) {
				trovato = true;
				System.out.println("Nome: " + ricerca.getNome() + ", Prezzo: " + ricerca.getPrezzo());
			}
		}

		if (trovato == false)
			System.out.println("Input errato o categoria non presente" + " nel nostro archivio");
	}

	public void stampaLista() {
		if (lista.isEmpty()) {
			System.out.println("Lista vuota.");
		} else {
			for (Prodotto stampa : lista) {
				System.out.println(stampa.toString());
			}
		}
	}

	public void menuNegozio(Scanner scanner) {
		int scelta = 1;
		do {
			System.out.println("MENU' NEGOZIO: \n1) Aggiungi prodotti" + "\n2) Filtra per categoria\n"
					+ "3) Stampa la lista completa dei prodotti\n4) Torna al menù cliente");
			scelta = scanner.nextInt();
			switch (scelta) {
			case 1:
				scanner.nextLine();
				aggiungiElemento(scanner);
				break;
			case 2:
				scanner.nextLine();
				filtraElemento(scanner);
				break;
			case 3:
				stampaLista();
				break;
			case 4:
				System.out.println("Ritorno al menù principale...");
				break;
			default:
				System.out.println("Codice errato.");
			}

		} while (scelta != 4);

	}
}

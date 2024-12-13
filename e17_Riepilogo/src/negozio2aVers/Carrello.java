package negozio2aVers;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {
	/* attributi:
	  - ArrayList di tipo Prodotto dove andrò a inserire i prodotti scelti dall'utente
	  - istanza di un oggetto dalla classe Negozio per richiamare metodi e attributi*/
	ArrayList<Prodotto> selezionati = new ArrayList<Prodotto>();
	Negozio negozio = new Negozio();

	public void aggiungiProdotto(Scanner scanner) {
		/* metodo aggiungi prodotto al carrello:
		 * dopo aver stampato la lista di tutti i prodotti per facilitare la scelta,
		 * avvio un for-each per scorrere la lista di tutti i prodotti del negozio e trovare
		 * quello selezionato dall'utente; una volta terminata la ricerca, se andata a buon fine,
		 * aggiungo l'elemento ricercato nell'ArrayList 'selezionati'*/
		boolean trovato = false;
		
		negozio.stampaLista();

		System.out.println("Selezionare il prodotto da aggiungere al carrello (input nome): ");
		String nome = scanner.nextLine();
		for (Prodotto aggiungi : negozio.lista) {
			if (nome.equalsIgnoreCase(aggiungi.getNome())) {
				trovato = true;
				selezionati.add(aggiungi);
			}
		}
		
		if (trovato==false) System.out.println("Prodotto non trovato");
	}
	
	public void stampaImporto() {
		// stampa importo: aggiungo alla variabile somma tutti i prezzi dei prodotti selezionati
		double somma=0;
		for(Prodotto d:selezionati) {
			somma += d.getPrezzo();
		}
		System.out.println("Totale carrello: "+somma);
	}

}

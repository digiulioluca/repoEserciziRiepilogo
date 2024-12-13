package negozio2aVers;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {
	
	ArrayList<Prodotto> selezionati = new ArrayList<Prodotto>();
	Negozio negozio = new Negozio();

	public void aggiungiProdotto(Scanner scanner) {
		negozio.stampaLista();

		System.out.println("Selezionare il prodotto da aggiungere al carrello (input nome): ");
		String nome = scanner.nextLine();
		for (Prodotto aggiungi : negozio.lista) {
			if (nome.equalsIgnoreCase(aggiungi.getNome())) {
				selezionati.add(aggiungi);
			}
		}
	}
	
	public void stampaImporto() {
		double somma=0;
		for(Prodotto d:selezionati) {
			somma += d.getPrezzo();
		}
		System.out.println("Totale carrello: "+somma);
	}

}

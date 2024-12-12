/*
Filtraggio dei dati

Crea una classe Prodotto con attributi nome, categoria e prezzo.
Crea un ArrayList di prodotti con almeno 5 elementi.

Implementa un metodo che filtra e restituisce solo i prodotti appartenenti
a una determinata categoria (ad esempio, "Elettronica").

Stampa i prodotti filtrati.
 */
package filtraggio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// DICHIARAZIONE
		ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();
		Prodotto objProd = new Prodotto();
		
		Scanner scanner = new Scanner(System.in);
		objProd.aggiungiElemento(scanner, prodotti);
		objProd.filtra(scanner, prodotti);
		scanner.close();

	}

}

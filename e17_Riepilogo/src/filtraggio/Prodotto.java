package filtraggio;

import java.util.ArrayList;
import java.util.Scanner;

public class Prodotto {
	// attributi
	private String nome;
	private String categoria;
	private Double prezzo;
	
	public Prodotto() {
		// costruttore
	}
	
	// vari set e get (prove per inserimento e stampa)
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public void aggiungiElemento(Scanner scanner, ArrayList<Prodotto> prodotti) {
		/* metodo aggiungiElemento:
		 * dopo aver inserito il numero di elementi che si vogliono inserire, 
		 * faccio partire un for (con termine ultimo il numero inserito da tastiera
		 * dall'utente) per aggiungere, tramite scanner e il metodo set, gli
		 * oggetti di tipo Prodotto nell'ArrayList che li conterà tutti.*/
		System.out.println("Selezione quanti prodotti vuoi inserire: ");
		int num = scanner.nextInt();
		
		System.out.println("INPUT PRODOTTI");
		for (int c=1; c<=num; c++) {
			Prodotto prod = new Prodotto();
			scanner.nextLine();
			System.out.println("Inserisci nome prodotto "+c+": ");
			String nome = scanner.nextLine();
			prod.setNome(nome);
			System.out.println("Inserisci categoria prodotto "+c+": ");
			String categoria = scanner.nextLine();
			prod.setCategoria(categoria);
			System.out.println("Inserisci prezzo prodotto "+c+": ");
			double prezzo = scanner.nextDouble();
			prod.setPrezzo(prezzo);
			// aggiunta nell'ArrayList
			prodotti.add(prod);
		}
	}
	
	public void filtra(Scanner scanner, ArrayList<Prodotto> prod) {
		/*metodo filtra: 
		  dopo aver raccolto da tastiera la categoria da filtrare, 
		  scorro con il for-each l'ArrayList per ricerca tutti gli elementi
		  che contengono la stringa inserita dall'utente*/
		scanner.nextLine();
		System.out.println("Inserisci categoria per la ricerca: ");
		String categoria = scanner.nextLine();
		
		// booleana per gestire i risultati della ricerca
		boolean trovato=false;
		
		System.out.println("Elementi categoria "+categoria+": ");
		for(Prodotto ricerca:prod) {
			if(categoria.equalsIgnoreCase(ricerca.categoria)) {
				trovato=true;
				System.out.println("Nome: "+ricerca.nome+", Prezzo: "+ricerca.prezzo);
			}
		}
		
		if (trovato==false) System.out.println("Input errato o categoria non presente"
				+ " nel nostro archivio");
	}
	
}

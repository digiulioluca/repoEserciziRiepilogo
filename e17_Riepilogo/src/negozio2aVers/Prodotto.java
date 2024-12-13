package negozio2aVers;

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
		
		@Override
		public String toString() {
			return "Nome: "+nome+", Categoria: "+categoria+", Prezzo: "+prezzo;
		}
}

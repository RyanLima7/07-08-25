package encapsulamento;

public class Livro {

	private String titulo;
	private int numeroPaginas;
	private String autor;
	

	public String getTitulo() {
		return titulo;

	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		if (numeroPaginas < 5) {
			System.out.println("Erro: O número mínimo de página é 5 páginas");
		} else {
			this.numeroPaginas = numeroPaginas;
		}

	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}


}

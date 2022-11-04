package servlets;

public class LivroModel {
	
	private int codlivro;
	private String titulo;
	private String autor;
	private float valor;
	
	public int getCodlivro() {
		return codlivro;
	}
	public void setCodlivro(int codlivro) {
		this.codlivro = codlivro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
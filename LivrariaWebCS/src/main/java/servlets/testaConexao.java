package servlets;



import java.util.List;

public class testaConexao {

	public static void main(String[] args){
		
		CategoriaDao dao = new CategoriaDao();
		LivroDao daoLivro = new LivroDao();
		
		String cat = "Design";
		List<CategoriaModel> categorias = dao.getListaCategorias();
		List<LivroModel> livros = daoLivro.getListaLivros(cat);
		
		for(CategoriaModel categoria : categorias) {
			System.out.println("Categoria: "+ categoria.getCategoria());
		}
		
		for(LivroModel livro : livros) {
			System.out.println("codlivro: "+ livro.getCodlivro());
			System.out.println("titulo: "+ livro.getTitulo());
			System.out.println("autor: "+ livro.getAutor());
			System.out.println("categoria: "+ livro.getCategoria());
			System.out.println("valor: "+ livro.getValor() +"\n");
		}
	}

}

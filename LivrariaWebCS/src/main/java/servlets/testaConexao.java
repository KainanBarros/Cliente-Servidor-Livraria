package servlets;



import java.util.List;

public class testaConexao {

	public static void main(String[] args){
		
		CategoriaDao dao = new CategoriaDao();
		LivroDao daoLivro = new LivroDao();
		
		List<CategoriaModel> categorias = dao.getListaCategorias();
		List<LivroModel> livros = daoLivro.getListaLivros("Informática") ;
		
		for(CategoriaModel categoria : categorias) {
			System.out.println("Categoria: "+ categoria.getCategoria());
		}
		
		for(LivroModel livro : livros) {
			System.out.println("codlivro: "+ livro.getCodlivro());
			System.out.println("titulo: "+ livro.getTitulo());
			System.out.println("autor: "+ livro.getAutor());
			System.out.println("valor: "+ livro.getValor() +"\n");
		}
	}

}

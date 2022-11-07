<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= " java.sql.*, servlets.*, java.util.*, java.sql.*"  %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="./css/cabecalho.css">
	<link rel="stylesheet" href="./css/corpoExibicao.css">
	<title>Lista livros por categoria</title>
</head>
<body>


	<header>
	<nav>
		<ul>
			<li><a href="home.jsp">Home</a></li>
			<li><a href="listaLivrosPorCategoria.jsp">Livros por categorias</a></li>
			<li><a href="formLivro.jsp">Cadastrar/Atualizar/Deletar Livro</a></li>
			<li><a href="mostrarLivros.jsp">Mostrar Livro</a></li>
		</ul>
	</nav>
	</header>

	<main>
		<section class="form-busca-categoria">
			<form action="ExibicaoDosLivro" method="post">
				<select name="tipoLivros">
					<option value="">Selecione uma Categoria</option>
			<%
			CategoriaDao categorias = new CategoriaDao();
			List<CategoriaModel> listCategorias = categorias.getListaCategorias();
			Iterator<CategoriaModel> itListCategoria = listCategorias.iterator();
						
			while(itListCategoria.hasNext()){
			CategoriaModel cat = new CategoriaModel();
			cat = itListCategoria.next();
		%>
					<option value="<%=cat.getCategoria()%>"><%=cat.getCategoria()%></option>
					<% } %>
				</select>
				<button type="submit">Buscar</button>
			</form>
			<table>
				<tr>
				  <th>codLivro</th>
				  <th>Titulo</th>
				  <th>Autor</th>
				  <th>Categoria</th>
				  <th>Valor</th>
				</tr>
			<%

				LivroDao livroDao = new LivroDao();
				List<LivroModel> listLivro = livroDao.getListaLivros(request.getParameter("tipoLivros"));
				Iterator<LivroModel> itListLivro = listLivro.iterator();
				while(itListLivro.hasNext()){
					LivroModel livro = new LivroModel();
					livro = itListLivro.next();
			%>

				<tr>
				<td><%= livro.getCodlivro() %></td>
				<td><%= livro.getTitulo() %></td>
				<td><%= livro.getAutor() %></td>
				<td><%= livro.getCategoria() %></td>
				<td><%= livro.getValor() %></td>
					<% }%>
				</tr>
			  </table>
		</section>
	</main>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= " java.sql.*, servlets.*, java.util.*, java.sql.*"  %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="./css/cabecalho.css">
	<title>Form livro</title>
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
		<form action="InserirLivro" method="post">
		
		<label>Codigo</label>
		<input type="text" name="codlivro"><br>
		<label>Titulo</label>
		<input type="text" name="titulo"><br>
		<label>Autor</label>
		<input type="text" name="autor"><br>
				<select name="categoria">
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
				</select><br>
		<label>Valor</label>
		<input type="text" name="valor">
		
		<button type="submit">Adicionar</button>
		</form>
	</main>
</body>
</html>
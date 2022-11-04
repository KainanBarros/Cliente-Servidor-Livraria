<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="./css/cabecalho.css">
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
		<section>
			<form action="" method="POST">
				<select name="categorias" id="">
					<option value="">Selecione uma Categoria</option>
					<option value="">teste</option>
					<option value="">teste</option>
					<option value="">teste</option>
					<option value="">teste</option>
				</select>
			</form>
		</section>
	</main>
</body>
</html>
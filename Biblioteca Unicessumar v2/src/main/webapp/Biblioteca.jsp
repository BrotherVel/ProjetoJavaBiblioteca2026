<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.JavaBeans" %>
<%@ page import="java.util.ArrayList" %>
<%
	@SuppressWarnings("unchecked")
	ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("livros");
%>
	
<!DOCTYPE html>
<html lang= "pt-br">
<head>
<meta charset="UTF-8">
<title>Biblioteca</title>
<link rel="icon" href="imagens/favicon.png">
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Biblioteca Universidade UniCesumar</h1>
	<a href="novo.html" class= "botao1">Cadastrar Livro</a>
	<table id="tabela">
		<thead >
			<tr>
				<th>ID</th>
				<th>Titulo</th>
				<th>Autor</th>
				<th>Ano de Publicação</th>
				<th>ISBN</th>
				<th></th>
			</tr>			
		</thead>
		<tbody>
			<% for (int i = 0; i < lista.size(); i++) { %>
				<tr>
					<td><%out.println(lista.get(i).getIdcon());%></td>
					<td><%out.println(lista.get(i).getTitulo());%></td>
					<td><%out.println(lista.get(i).getAutor());%></td>
					<td><%out.println(lista.get(i).getAno_Publicacao());%></td>
					<td><%out.println(lista.get(i).getISBN());%></td>
					<td><a href="javascript: confirmar(<%out.println(lista.get(i).getIdcon());%>)" class="botao2">Excluir</a></td>
				</tr>
			<%} %>
		</tbody>
	</table>
	<script src="scripts/confirmador.js"></script>
</body>
</html>
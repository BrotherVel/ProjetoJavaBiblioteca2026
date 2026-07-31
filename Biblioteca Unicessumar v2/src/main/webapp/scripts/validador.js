/**
 * Validação de Formulário
 */

function validar() {
	let titulo = frmLivro.titulo.value
	let autor = frmLivro.autor.value
	let ano_Publicacao = frmLivro.ano_Publicacao.value
	let ISBN = frmLivro.ISBN.value
	
	if (titulo === "") {
		alert('Preencha o campo Título')
		frmLivro.titulo.focus()
		return false
		
	} else if (autor === "") {
		alert('Preencha o campo Autor')
		frmLivro.autor.focus()
		return false
		
	} else if (ano_Publicacao === "") {
		alert('Preencha o campo Ano de Publicação')
		frmLivro.ano_Publicacao.focus()
		return false
		
	} else if (ISBN === "") {
		alert('Preencha o campo ISBN')
		frmLivro.ISBN.focus()
		return false
	} else {
		document.forms["frmLivro"].submit()
	}
}
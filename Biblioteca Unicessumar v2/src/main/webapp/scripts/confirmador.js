/**
 * Confirmação de exlusão de um contato
 */

function confirmar(idcon){
	let resposta = confirm("Confirmar a exclusão deste contato ID: " + idcon +"?")
	if (resposta === true) {
		window.location.href = "delete?idcon=" + idcon
	}
	
}
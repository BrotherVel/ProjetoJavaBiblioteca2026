package model;

// TODO: Auto-generated Javadoc
/**
 * The Class JavaBeans.
 */
public class JavaBeans {
	
	/** The idcon. */
	private String idcon;
	
	/** The Titulo. */
	private String Titulo;
	
	/** The Autor. */
	private String Autor;
	
	/** The Ano publicacao. */
	private String Ano_Publicacao;
	
	/** The isbn. */
	private String ISBN;
		
	/**
	 * Instantiates a new java beans.
	 */
	public JavaBeans() {
		super();
	}

	/**
	 * Instantiates a new java beans.
	 *
	 * @param idcon the idcon
	 * @param titulo the titulo
	 * @param autor the autor
	 * @param ano_Publicacao the ano publicacao
	 * @param iSBN the i SBN
	 */
	public JavaBeans(String idcon, String titulo, String autor, String ano_Publicacao, String iSBN) {
		super();
		this.idcon = idcon;
		Titulo = titulo;
		Autor = autor;
		Ano_Publicacao = ano_Publicacao;
		ISBN = iSBN;
	}
	
	
	// Get e Seters dos itens das colunas do banco de dados MYSQL
	
	/**
	 * Gets the idcon.
	 *
	 * @return the idcon
	 */
	public String getIdcon() {
		return idcon;
	}
	
	/**
	 * Sets the idcon.
	 *
	 * @param idcon the new idcon
	 */
	public void setIdcon(String idcon) {
		this.idcon = idcon;
	}
	
	/**
	 * Gets the titulo.
	 *
	 * @return the titulo
	 */
	public String getTitulo() {
		return Titulo;
	}
	
	/**
	 * Sets the titulo.
	 *
	 * @param titulo the new titulo
	 */
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	
	/**
	 * Gets the autor.
	 *
	 * @return the autor
	 */
	public String getAutor() {
		return Autor;
	}
	
	/**
	 * Sets the autor.
	 *
	 * @param autor the new autor
	 */
	public void setAutor(String autor) {
		Autor = autor;
	}
	
	/**
	 * Gets the ano publicacao.
	 *
	 * @return the ano publicacao
	 */
	public String getAno_Publicacao() {
		return Ano_Publicacao;
	}
	
	/**
	 * Sets the ano publicacao.
	 *
	 * @param ano_Publicacao the new ano publicacao
	 */
	public void setAno_Publicacao(String ano_Publicacao) {
		Ano_Publicacao = ano_Publicacao;
	}
	
	/**
	 * Gets the isbn.
	 *
	 * @return the isbn
	 */
	public String getISBN() {
		return ISBN;
	}
	
	/**
	 * Sets the isbn.
	 *
	 * @param iSBN the new isbn
	 */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
}

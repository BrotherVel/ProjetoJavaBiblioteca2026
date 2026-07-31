package model;

import java.sql.Connection; //JDBC
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class DAO.
 */
public class DAO {
	// Módulo de Conexão
	
	// Parâmetros de conexão
	
	/** The driver. */
	private String driver = "com.mysql.cj.jdbc.Driver";
	
	/** The url. */
	private String url = "jdbc:mysql://127.0.0.1:3306/biblioteca?useTimezone=true&serverTimezone=UTC";
	
	/** The user. */
	private String user = "root";
	
	/** The password. */
	private String password = "AWSelfSport";
	
	// Método de conexão
	
	/**
	 * Conectar.
	 *
	 * @return the connection
	 */
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	/**
	 * CRUD CREATE *.
	 *
	 * @param livro the livro
	 */
	
	public void inserirLivro(JavaBeans livro) {
		String create = "insert into livros (Titulo, Autor, Ano_Publicacao, ISBN) values (?,?,?,?)";
		try {
			// abrir a conexão com o banco
			Connection con = conectar();
			// Preparar a query para execução no banco de dados
			PreparedStatement pst = con.prepareStatement(create);
			// Substitur os paramentros (?) pelo conteúdo das variáveis
			pst.setString(1, livro.getTitulo());
			pst.setString(2, livro.getAutor());
			pst.setString(3, livro.getAno_Publicacao());
			pst.setString(4, livro.getISBN());
			// Execultar a query
			pst.executeUpdate();
			// Encerrar a conexão com o banco
			con.close();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/**
	 * CRUD READ *.
	 *
	 * @return the array list
	 */
	
	public ArrayList<JavaBeans> listarLivros() {
		// Criando um objeto para acessar a classe JavaBeans
		ArrayList<JavaBeans> livros = new ArrayList<>();
		
		
		String read = "select * from livros order by Titulo";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			// o laço abaico será exevutado enquanto houver contatos
			
			while (rs.next()) {
				// variáveis de apoio para receber dados do banco
				String idcon = rs.getString(1);
				String titulo = rs.getString(2);
				String autor = rs.getString(3);
				String ano_publicacao = rs.getString(4);
				String ISBN = rs.getString(5);
				
				// Populando o ArrayList
				livros.add(new JavaBeans(idcon, titulo, autor, ano_publicacao, ISBN));				
			}
			con.close();
			return livros;
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	/**
	 * CRUD DELETE *.
	 *
	 * @param livro the livro
	 */
	
	public void deletarLivro(JavaBeans livro) {
		
		String delete = "delete from livros where Idcon=?";
		
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setString(1, livro.getIdcon());
			pst.executeUpdate();
			con.close();
						
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	// Teste de conexão
	
	/**
	 * Teste conexão.
	 */
	public void testeConexão() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
}

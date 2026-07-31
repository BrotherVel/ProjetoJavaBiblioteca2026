package controller;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DAO;
import model.JavaBeans;

// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
@WebServlet(urlPatterns = {"/Controller", "/main", "/insert", "/delete"})
public class Controller extends HttpServlet {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
    
    /** The dao. */
    DAO dao = new DAO();
    
    /** The livro. */
    JavaBeans livro = new JavaBeans();
    
    /**
     * Instantiates a new controller.
     */
    public Controller() {
        super();

    }

	/**
	 * Do get.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/main")) {
			livros(request, response);
			
		} else if (action.equals("/insert")){
			novoLivro(request, response);
			
		} else if (action.equals("/delete")){
			removerLivro(request, response);
			
		} else {
			response.sendRedirect("index.html");
		}
				
	}
	
	// Listar livros
	
	/**
	 * Livros.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void livros(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Criando um objeto que irá receber os dados JavaBeans
		ArrayList<JavaBeans> lista = dao.listarLivros();
		// Encaminhar a lista ao documento Biblioteca.jsp
		request.setAttribute("livros", lista);
		RequestDispatcher rd = request.getRequestDispatcher("Biblioteca.jsp");
		rd.forward(request, response);
		
	}
	
	
	// Novo livro
	
	/**
	 * Novo livro.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void novoLivro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// teste
			// System.out.println(request.getParameter("titulo"));
			// System.out.println(request.getParameter("autor"));
			// System.out.println(request.getParameter("ano_Publicacao"));
			//System.out.println(request.getParameter("ISBN"));
			
			//set das variáveis JavaBeans
			livro.setTitulo(request.getParameter("titulo"));
			livro.setAutor(request.getParameter("autor"));
			livro.setAno_Publicacao(request.getParameter("ano_Publicacao"));
			livro.setISBN(request.getParameter("ISBN"));
			
			// invocar o método inserirLivro passando o objeto contato
			dao.inserirLivro(livro);
			
			// redirecionar para a pagina biblioteca (Biblioteca.jsp)
			response.sendRedirect("main");
	}
	
	// Remover um contato
	
	/**
	 * Remover livro.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void removerLivro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idcon = request.getParameter("idcon");
		// System.out.println(idcon);
		
		// setar a variável idcon JavaBeans
		livro.setIdcon(idcon);
		// executar o método deletarLivro (DAO) passando o objeto livro
		dao.deletarLivro(livro);
		// redirecionar para a pagina biblioteca (Biblioteca.jsp)
		response.sendRedirect("main");
	}
	
}

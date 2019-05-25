package br.com.SistemaLogin.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class LoginControllers
 */
@WebServlet("/Login")
public class LoginControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginControllers() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}


	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		validaDadosRecebidos(request);
		RequestDispatcher rd = request.getRequestDispatcher("logado.jsp");
		rd.forward(request, response);
		
	}//processRequest


	private void validaDadosRecebidos(HttpServletRequest request) throws ServletException {
		String nomeUsuario = request.getParameter("txtUsuario");
		String senha = request.getParameter("txtSenha");
		
		if(nomeUsuario.trim().equals("") || senha.trim().equals("")) {
			throw new ServletException("Preencha os campos");
		
		}else if(!nomeUsuario.trim().equals("rafael") || !senha.trim().equals("123")) {
			throw new ServletException("Dados invalidos");
		}
	}//validaDadosRecebidos

}

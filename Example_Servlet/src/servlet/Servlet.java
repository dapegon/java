/*
 * Creado el 26-nov-08
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generaci�n de c�digo&gt;C�digo y comentarios
 */
package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * @author dperez
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generaci�n de c�digo&gt;C�digo y comentarios
 */
public class Servlet extends HttpServlet {



	/**
	 * 
	 */
	private static final long serialVersionUID = -5535290244220509612L;

	public final void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		RequestDispatcher rd = getServletContext().getNamedDispatcher("goToGet");
		rd.forward(request, response);
	}
	
	public final void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		RequestDispatcher rd = getServletContext().getNamedDispatcher("goToPost");
		rd.forward(request, response);
	}
}

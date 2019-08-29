package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		Boolean isNotNull = true;

		String firstName = "First Name", lastName = "Last Name", email = "Email";
		try {
			if (checkForBlanks(request.getParameter("firstName"), "First Name"))
				firstName = request.getParameter("firstName");
		} catch (FieldIsNull e) {
			// TODO Auto-generated catch block
			out.println("<p style=\"color:red;\">ERROR. Field Left Blank</p>");
			e.printStackTrace();
		}

		try {
			if (checkForBlanks(request.getParameter("lastName"), "Last Name"))
				lastName = request.getParameter("lastName");
		} catch (FieldIsNull e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.println("<p style=\"color:red;\">ERROR. Field Left Blank</p>");
		}

		try {
			if (checkForBlanks(request.getParameter("email"), "Email"))
				email = request.getParameter("email");
		} catch (FieldIsNull e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.println("<p style=\"color:red;\">ERROR. Field Left Blank</p>");
		}

		out.println("<h1>Servlet</h1><br/>" + firstName + "<br/>" + lastName + "<br/>" + email + "<br/>");

		doGet(request, response);
	}

	private Boolean checkForBlanks(String request, String type) throws FieldIsNull {
		if (request != "")
			return true;
		else {
			throw new FieldIsNull("The field " + type + " can not be null!");
		}
	}

}

class FieldIsNull extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FieldIsNull(String message) {
		super(message);
	}

}
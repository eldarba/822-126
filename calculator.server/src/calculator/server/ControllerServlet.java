package calculator.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calculator.core.Calculator;

// http://localhost:8080/calculator.server/ControllerServlet
@WebServlet({ "/ControllerServlet", "/aaa", "/bbb" })
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Calculator calculatorModel = new Calculator();

	@Override
	public void init() throws ServletException {
		getServletContext().setAttribute("model", calculatorModel);
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// output to the server console
		System.out.println("from controller servlet");

		// output to the client (response)
		PrintWriter out = response.getWriter();
		out.print("Hello from server");

//		// redirect request to view
//		String command = request.getParameter("command");
//		System.out.println(command);
//
//		String path = "";
//
//		switch (command) {
//		case "add": // ControllerServlet?command=add&a=10&b=30
//			path = "view1.jsp";
//			break;
//		case "greet":// ControllerServlet?command=greet&user=Dan
//			path = "view2.jsp";
//			break;
//
//		default:
//			break;
//		}
//
//		// we need an object that can forward requests
//		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
//		// forward the request to the view
//		dispatcher.forward(request, response);
	}

}

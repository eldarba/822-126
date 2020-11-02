package a;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public MyServlet() {
		System.out.println("the container created an instance of MyServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// cgi is doing output to clients
		
		// we need output object
		PrintWriter out = resp.getWriter();
		out.println("Hello World from Servlet");
//		out.println("</br>");
		int x = (int) (Math.random()*101);
		out.println("Your lucky number is: " + x);
	}

}

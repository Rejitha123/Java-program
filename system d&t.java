

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class prgm1
 */
public class prgm1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();

		try{
		Date d=new Date(0,0,0);
		out.println("<html>");
		out.println("<head>");
		out.println("<title>date and time</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1><font color=blue> welcome </font></h1>");
		out.println("<h1> system date and time </h1>");
		out.println("<h2>"+d+" </h2>");
		out.println("<h1>servlet port"+request.getServerPort()+"</h1>");
		out.println("<h1>protocol"+request.getProtocol() +"</h1>");
		out.println("<h1>remote address"+request.getRemoteAddr()+"</h1>");
		out.println("<h1>remote host"+request.getRemoteHost()+" </h1>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		}
		finally{
		out.close();
		}
	}
	
}

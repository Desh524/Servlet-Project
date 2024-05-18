package db;

import jakarta.servlet.ServletException; 
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.coyote.Response;

/**
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = request.getParameter("txtuname");
		String password = request.getParameter("txtpass");
	
	try(Connection connection = Database.getconnection()){
		String query = "SELECT * FROM user WHERE username=? AND password=?";
		try(PreparedStatement prepareStatement = connection.prepareStatement(query)){
			prepareStatement.setString(1, username);
			prepareStatement.setString(2, password);
			
			try(ResultSet rs = prepareStatement.executeQuery()){
				if(rs.next()) {
					response.sendRedirect("homepage.jsp");
				}else {
					response.sendRedirect("Login.jsp?error=invalid");
					
				}
				
			}
			}
		
		}catch(Exception e) {
		e.printStackTrace();
		response.sendRedirect("Login.jsp?error=database");
		}
	}
}
	



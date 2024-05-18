package db;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		String username = request.getParameter("txtName");
		String address = request.getParameter("txtAddress");
		String mobile = request.getParameter("txtNumber");
		String password = request.getParameter("txtPassword");
		
		
		try(Connection connection = Database.getconnection()){
			String insert_query ="INSERT INTO user(username,Address,Number,password)"+" VALUES(?,?,?,?)";
			try(PreparedStatement ps = connection.prepareStatement(insert_query)){
				ps.setString(1, username);
				ps.setString(2, address);
				ps.setString(3, mobile);
				ps.setString(4, password);
				
				int rowsAffected = ps.executeUpdate();
				if(rowsAffected>0) {
					response.sendRedirect("homepage.jsp");
				}
				else {
					response.sendRedirect("Login.jsp?error=Invalid");
				}
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			response.sendRedirect("Error connection between databse & can't insert values to table");
		}
		
			}
	}



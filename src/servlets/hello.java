package servlets;
import com.google.gson.Gson; 

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CategoryDao;
import dao.UserDao;
import model.Category;
import model.User;

/**
 * Servlet implementation class hello
 */

public class hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public hello() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		UserDao userdao = new UserDao();
		List<User> users = new ArrayList<User>();
		users= userdao.viewUsers();
		
		PrintWriter out = response.getWriter();
		out.println("Its just the start dude!");
		Gson gson = new Gson();
		for(User user: users) {
			
			out.println(gson.toJson(user));
			//out.println(user.getName());
		//	out.println(user.getNumber());
			//out.println(user.getEmail());
		}
		CategoryDao categorydao = new CategoryDao();
		List<Category> categories =  categorydao.allCategories();
		for(Category category: categories) {
			
			out.println(gson.toJson(category));
			//out.println(user.getName());
		//	out.println(user.getNumber());
			//out.println(user.getEmail());
		}
		List<String> rssLinks =  categorydao.getRssLinks(users.get(0));
		for(String rssLink: rssLinks) {
			
			out.println(gson.toJson(rssLink));
			//out.println(user.getName());
		//	out.println(user.getNumber());
			//out.println(user.getEmail());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Category;
import model.User;

public class CategoryDao {
	Connection con;
	public CategoryDao(){
		con=DB.getConnection();
	}
	public List<Category> allCategories() {
		List<Category> categories= new ArrayList<Category>();
		try {
			PreparedStatement ps=con.prepareStatement("select * from category;");
			ResultSet rs= ps.executeQuery();
			while(rs.next()!=false) {
				Category category = new Category();
				category.setId(rs.getInt("id"));
				category.setName(rs.getString("name"));
				
				
				categories.add(category);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return categories;
		
	}
	public List<Category> userCategories(User user) {
		List<Category> categories= new ArrayList<Category>();
		try {
			PreparedStatement ps=con.prepareStatement("select category.name from category join users on category.id=users.id and users.id=?;");
			ps.setInt(1,user.id);
			ResultSet rs= ps.executeQuery();
			while(rs.next()!=false) {
				Category category = new Category();
				category.setId(rs.getInt("id"));
				category.setName(rs.getString("name"));
				
				
				categories.add(category);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return categories;
		
	}
	public List<String> getRssLinks(User user) {
		List<String> rssLinks = new ArrayList<String>();
		
		try {
			PreparedStatement ps=con.prepareStatement("select category.rss_link from category join users on category.id=users.id where users.id =?;");
			ps.setInt(1,user.id);
			ResultSet rs= ps.executeQuery();
			while(rs.next()!=false) {
				String rssLink;
				rssLink = rs.getString("rss_link");
				
				
				rssLinks.add(rssLink);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rssLinks;
	}
}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserDao {
	Connection con;
		public UserDao(){
			con=DB.getConnection();
		}
		public List<User> viewUsers() {
			List<User> users= new ArrayList<User>();
			try {
				PreparedStatement ps=con.prepareStatement("select * from users;");
				ResultSet rs= ps.executeQuery();
				while(rs.next()!=false) {
					User user = new User();
					user.setId(rs.getInt("id"));
					user.setName(rs.getString("name"));
					user.setPassword(rs.getString("password"));
					user.setNumber(rs.getString("phone_number"));
					user.setEmail(rs.getString("email"));
					
					users.add(user);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return users;
			
		}
}

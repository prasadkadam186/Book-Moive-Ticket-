package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServicePage {
	
	static Connection con=null;
	static double bill=0;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","sql@123");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public double getBill(String name,int ticket)
	{
		int amount=0;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String quary="select name,price from moive where name='"+name+"'";
		try {
			pstmt=con.prepareStatement(quary);
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				String mname=rs.getString(1);
				int price=rs.getInt(2);
				
				if(mname.equalsIgnoreCase("AVATAR"))
				{
					 amount=price*ticket;
					 bill=amount+amount*0.18;
					
				}
				else if(mname.equalsIgnoreCase("LIFE OF PIE"))
				{
					 amount=price*ticket;
					 bill=amount+amount*0.18;
					
				}
				else if(mname.equalsIgnoreCase("AVANGERS AND GAME"))
				{
					 amount=price*ticket;
					 bill=amount+amount*0.18;
					
				}
				else if(mname.equalsIgnoreCase("ANABELLA"))
				{
					 amount=price*ticket;
					 bill=amount+amount*0.18;
					
				}
				else if(mname.equalsIgnoreCase("CONJURING 3"))
				{
					 amount=price*ticket;
					 bill=amount+amount*0.18;
					
				}
				else
				{
					bill=bill;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bill;
		
	}
	
	public void updateticket(String name,int ticket)
	{
		PreparedStatement pstmt=null;
		String quary="update moive set ticket=ticket-"+ticket+" where name='"+name+"'";
		try {
			pstmt=con.prepareStatement(quary);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}

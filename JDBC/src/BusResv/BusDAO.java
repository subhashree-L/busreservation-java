package BusResv;
import java.sql.*;

public class BusDAO {
	public void displayBusInfo() throws SQLException {
		String query = "select * from bus";
		Connection con = Dbconnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
	
		while(rs.next()) {
			 System.out.println("Bus No: " + rs.getInt(1));
			 if(rs.getInt(2)==0)
				 System.out.println("Ac: no");
			 else
				 System.out.println("Ac: yes");
			 System.out.println("Capacity:" + rs.getInt(3));
		}
		
		System.out.println("--------------------------------------------");
	}
     
	public int getCapacity(int id)throws SQLException {
		String query = "Select capacity from bus where id=" + id;
		Connection con = Dbconnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
	}
}

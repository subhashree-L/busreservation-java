package BusResv;

import java.util.Date;
import java.sql.*;

public class BookingDAO {

	  public int getBookedCount(int busNo,Date date,String Location)throws SQLException {
		  
		  String query = "SELECT COUNT(passenger_name) FROM booking WHERE bus_no = ? AND travel_date = ? AND location = ?";
		  Connection con = Dbconnection.getConnection();
		  PreparedStatement pst = con.prepareStatement(query);
		  java.sql.Date sqldate = new java.sql.Date(date.getTime());
		  pst.setInt(1, busNo);
		  pst.setDate(2,sqldate);
		  pst.setString(3, Location); // Set the location parameter
		  pst.executeQuery();
		  ResultSet rs = pst.executeQuery();
		  rs.next();
		  return rs.getInt(1);
	  }
	  
	  public void addBooking(Booking booking)throws SQLException {
		  String query = "INSERT INTO booking VALUES (?, ?, ?, ?)";
		  Connection con = Dbconnection.getConnection();
		  java.sql.Date sqldate = new java.sql.Date(booking.date.getTime());
		  PreparedStatement pst = con.prepareStatement(query);
		  pst.setString(1,booking.passengerName);
		  pst.setInt(2,booking.busNo);
		  pst.setDate(3, sqldate);
		  pst.setString(4,booking.Location);//set the parameter
		  
		  pst.executeUpdate();
	  }
}

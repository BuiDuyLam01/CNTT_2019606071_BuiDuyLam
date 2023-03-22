package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.CNTT;

public class connect_CNTT {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			String url = "jdbc:mySQL://localhost:3306/quanlithisinh";
			String user = "root";
			String password = "";
			connection = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
	public static List<CNTT>findAll(){
		List<CNTT>dstk = new ArrayList<>();
		
		String query = "SELECT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh,\r\n"
				+ "khoithi.TongDiem, thisinh.DiemHocBa\r\n"
				+ "FROM taikhoan, thisinh, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = thisinh.MaThiSinh\r\n"
				+ "AND khoithi.MaThiSinh = thisinh.MaThiSinh";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				CNTT tk = new CNTT(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dstk;
	}
}

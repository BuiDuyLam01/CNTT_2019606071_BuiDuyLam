package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.taiKhoan;

public class connect_taiKhoan {
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
	
	public static List<taiKhoan>findAll(){
		List<taiKhoan>dstk = new ArrayList<>();

		String query = "SELECT MaThiSinh, HoVaTen, TenDangNhap, MatKhau, Gmail FROM taikhoan ";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				taiKhoan tk = new taiKhoan(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getString("TenDangNhap"),
						rs.getString("MatKhau"), rs.getString("Gmail"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dstk;
	}
	
}

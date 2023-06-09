package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.khoiA01;
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
	
	public static List<taiKhoan>findbyTen(taiKhoan s) {
		List<taiKhoan>taikhoanl = new ArrayList<>();
		String query = "SELECT MaThiSinh, HoVaTen, TenDangNhap, MatKhau, Gmail FROM taikhoan WHERE HoVaTen = '"+ s.getHoVaTen() +"' ";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				taiKhoan tk = new taiKhoan(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getString("TenDangNhap"),
						rs.getString("MatKhau"), rs.getString("Gmail"));
				taikhoanl.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return taikhoanl;
	}
	
	public static String NgauNhien() {
		String characters = "ABCDEFGHIKMNLO123456789";
		String st = "";
		int length = 5;
		Random rand = new Random();
		char[] text = new char[length];
		for(int i= 0; i<length; i++) {
			text[i] = characters.charAt(rand.nextInt(characters.length()));
		}
		for(int i = 0; i < text.length; i++) {
			st += text[i];
		}
		return st;
	}
	
	public static void Reset(taiKhoan tk) {
		String query = "UPDATE taikhoan SET taikhoan.`MatKhau` = ? WHERE taikhoan.TenDangNhap = '"+tk.getMaThiSinh()+"'";
		
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setString(1, NgauNhien());;
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void delete(taiKhoan tk) {
		String query = "DELETE FROM `quanlithisinh`.`taikhoan` WHERE  `HoVaTen`='"+ tk.getHoVaTen() +"'";

		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean kiemtratontai(String s) {
		String query = "select*from taikhoan where taikhoan.MaThiSinh = '"+s+"'";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			if(rs.next()) {
				System.out.println("That bai");
				return true;
			} else {
				System.out.println("Thanh cong");
			}
		} catch (Exception e) {
			
		}
		return false;
	}
	
	public static taiKhoan find_HoTen_bySBD(String username) {
		taiKhoan us = new taiKhoan();
		String query = "SELECT taikhoan.MaThiSinh, taikhoan.HoVaTen, taikhoan.TenDangNhap, taikhoan.MatKhau, taikhoan.Gmail\r\n"
				+ "FROM taikhoan \r\n"
				+ "WHERE taikhoan.MaThiSinh = '"+username+"'";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			if(rs.next()) {
				us = new taiKhoan(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getString("TenDangNhap"), rs.getString("MatKhau"), rs.getString("Gmail"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return us;
	}
	
	public static void DoiPass(taiKhoan us, String username) {
		String query = "UPDATE taikhoan SET taikhoan.`MatKhau` = ? WHERE taikhoan.TenDangNhap = '"+username+"'";
		
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setString(1, us.getMatKhau());
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String KTPassCu(String username) {
		taiKhoan tk = new taiKhoan();
		String query = "SELECT taikhoan.MaThiSinh, taikhoan.HoVaTen, taikhoan.TenDangNhap, taikhoan.MatKhau, taikhoan.Gmail\r\n"
				+ "FROM taikhoan \r\n"
				+ "WHERE taikhoan.MaThiSinh = '"+username+"'";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			if(rs.next()) {
				tk = new taiKhoan(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getString("TenDangNhap"), rs.getString("MatKhau"), rs.getString("Gmail"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tk.getMatKhau();
	}
	
	public static void UpTT(taiKhoan us, String username) {
		String query = "UPDATE taikhoan SET taikhoan.HoVaTen = ?, taikhoan.Gmail = ? WHERE taikhoan.TenDangNhap = '"+username+"'";
		
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setString(1, us.getHoVaTen());
			pstmt.setString(2, us.getGmail());
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

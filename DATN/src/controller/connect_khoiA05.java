package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.khoiA05;

public class connect_khoiA05 {
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
	
	//khối A01
	public static List<khoiA05>findAll(){
		List<khoiA05>dstk = new ArrayList<>();

		String query = "SELECT khoi_a05.MaThiSinh, taikhoan.HoVaTen, thisinh.NamSinh, thisinh.GioiTinh, Van, Toan, Anh, thisinh.DiemUuTien, TongDiem, thisinh.DiemHocBa\r\n"
				+ "FROM taikhoan, thisinh, khoi_a05\r\n"
				+ "WHERE taikhoan.MaThiSinh = khoi_a05.MaThiSinh\r\n"
				+ "AND thisinh.MaThiSinh = khoi_a05.MaThiSinh ";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				khoiA05 tk = new khoiA05(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("NamSinh"), rs.getInt("GioiTinh"), 
						rs.getFloat("Van"), rs.getFloat("Toan"), rs.getFloat("Anh"), rs.getFloat("DiemUuTien"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dstk;
	}
	
	public static void insert(khoiA05 ts) {
		
		String query1 = "INSERT INTO `quanlithisinh`.`khoi_a05` (`MaThiSinh`, `MaKhoi`, `Van`, `Toan`, `Anh`, `TongDiem`) VALUES (?, ?, ?, ?, ?, ?);";
		
		String query2 = "UPDATE khoithi SET khoithi.TongDiem = ? WHERE  MaThiSinh = '"+ts.getMaThiSinh()+"' AND MaKhoi = 'A05';";

		try {
			Connection connection = getConnection();
			PreparedStatement pstmt1 = connection.prepareStatement(query1);
			PreparedStatement pstmt2 = connection.prepareStatement(query2);
			
			pstmt1.setString(1, ts.getMaThiSinh());
			pstmt1.setString(2, "A05");
			pstmt1.setFloat(3, ts.getVan());
			pstmt1.setFloat(4, ts.getToan());
			pstmt1.setFloat(5, ts.getAnh());
			pstmt1.setFloat(6, ts.getTongdiem());
			
			pstmt2.setFloat(1, ts.getTongdiem());
			
			pstmt1.execute();
			pstmt2.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void update(khoiA05 ts) {
		String query = "update thisinh set MaThiSinh=?, NamSinh=?, GioiTinh=?, DiemUuTien=?, DiemHocBa=? where MaThiSinh = '"+ts.getMaThiSinh()+"'";
		
		String query1 = "update khoi_a05 set MaThiSinh=?, MaKhoi=?, Van=?, Toan=?, Anh=?, TongDiem=? where MaThiSinh = '"+ts.getMaThiSinh()+"'";
		
		String query2 = "UPDATE khoithi SET khoithi.TongDiem = ? WHERE  MaThiSinh = '"+ts.getMaThiSinh()+"' AND MaKhoi = 'A05'";
		
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			PreparedStatement pstmt1 = connection.prepareStatement(query1);
			PreparedStatement pstmt2 = connection.prepareStatement(query2);

			pstmt.setString(1, ts.getMaThiSinh());
			pstmt.setInt(2, ts.getNamSinh());
			pstmt.setInt(3, ts.getGioiTinh());
			pstmt.setFloat(4, ts.getUuTien());
			pstmt.setFloat(5, ts.getDiemHocBa());
			
			pstmt1.setString(1, ts.getMaThiSinh());
			pstmt1.setString(2, "A05");
			pstmt1.setFloat(3, ts.getVan());
			pstmt1.setFloat(4, ts.getToan());
			pstmt1.setFloat(5, ts.getAnh());
			pstmt1.setFloat(6, ts.getTongdiem());
			
			pstmt2.setFloat(1, ts.getTongdiem());
			
			pstmt.execute();
			pstmt1.execute();
			pstmt2.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void delete(khoiA05 ts) {
		String query = "DELETE FROM thisinh WHERE MaThiSinh='"+ts.getMaThiSinh()+"'";
		String query2 = "DELETE FROM khoi_a05 WHERE  MaThiSinh='"+ts.getMaThiSinh()+"'";
		String query3 = "UPDATE khoithi SET khoithi.TongDiem = 0 WHERE  MaThiSinh = '"+ts.getMaThiSinh()+"' AND MaKhoi = 'A05'";
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt2 = connection.prepareStatement(query2);
			PreparedStatement pstmt3 = connection.prepareStatement(query3);
			pstmt2.executeUpdate();
			pstmt3.executeUpdate();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<khoiA05>findbySBD(khoiA05 s) {
		List<khoiA05>thisinhl = new ArrayList<>();
		String query = "SELECT khoi_a05.MaThiSinh, taikhoan.HoVaTen, thisinh.NamSinh, thisinh.GioiTinh, Van, Toan, Anh, thisinh.DiemUuTien, TongDiem, thisinh.DiemHocBa\r\n"
				+ "FROM taikhoan, thisinh, khoi_a05\r\n"
				+ "WHERE taikhoan.MaThiSinh = khoi_a05.MaThiSinh\r\n"
				+ "AND thisinh.MaThiSinh = khoi_a05.MaThiSinh "
				+ "AND thisinh.MaThiSinh = '"+ s.getMaThiSinh() +"'";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				khoiA05 tk = new khoiA05(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("NamSinh"), rs.getInt("GioiTinh"), 
						rs.getFloat("Van"), rs.getFloat("Toan"), rs.getFloat("Anh"), rs.getFloat("DiemUuTien"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				thisinhl.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return thisinhl;
	}
	
	public static boolean kiemtratontai(khoiA05 s) {
		String query = "select*from khoi_a05 where khoi_a05.MaThiSinh = '"+s.getMaThiSinh()+"'";
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
	
}

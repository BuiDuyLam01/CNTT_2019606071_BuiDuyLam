package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.khoiA00;

public class connect_khoiA00 {
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
	
	//khối A00
	public static List<khoiA00>findAll(){
		List<khoiA00>dstk = new ArrayList<>();

		String query = "SELECT khoi_a00.MaThiSinh, taikhoan.HoVaTen, thisinh.NamSinh, thisinh.GioiTinh, Toan, Li, Hoa, thisinh.DiemUuTien, TongDiem, thisinh.DiemHocBa\r\n"
				+ "FROM taikhoan, thisinh, khoi_a00\r\n"
				+ "WHERE taikhoan.MaThiSinh = khoi_a00.MaThiSinh\r\n"
				+ "AND thisinh.MaThiSinh = khoi_a00.MaThiSinh ";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				khoiA00 tk = new khoiA00(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("NamSinh"), rs.getInt("GioiTinh"), 
						rs.getFloat("Toan"), rs.getFloat("Li"), rs.getFloat("Hoa"), rs.getFloat("DiemUuTien"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dstk;
	}
	
	public static void insert(khoiA00 ts) {
		String query = "INSERT INTO `quanlithisinh`.`thisinh` (`MaThiSinh`, `NamSinh`, `GioiTinh`, `DiemUuTien`, `DiemHocBa`) VALUES (?, ?, ?, ?, ?);";
		
		String query1 = "INSERT INTO `quanlithisinh`.`khoi_a00` (`MaThiSinh`, `MaKhoi`, `Toan`, `Li`, `Hoa`, `TongDiem`) VALUES (?, ?, ?, ?, ?, ?);";
		
		String query2 = "UPDATE khoithi SET khoithi.TongDiem = ? WHERE  MaThiSinh = '"+ts.getMaThiSinh()+"' AND MaKhoi = 'A00';";

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
			pstmt1.setString(2, "A00");
			pstmt1.setFloat(3, ts.getToan());
			pstmt1.setFloat(4, ts.getLi());
			pstmt1.setFloat(5, ts.getHoa());
			pstmt1.setFloat(6, ts.getTongdiem());
			
			pstmt2.setFloat(1, ts.getTongdiem());
			
			pstmt.execute();
			pstmt1.execute();
			pstmt2.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void update(khoiA00 ts) {
		String query = "update thisinh set MaThiSinh=?, NamSinh=?, GioiTinh=?, DiemUuTien=?, DiemHocBa=? where MaThiSinh = '"+ts.getMaThiSinh()+"'";
		
		String query1 = "update khoi_a00 set MaThiSinh=?, MaKhoi=?, Toan=?, Li=?, Hoa=?, TongDiem=? where MaThiSinh = '"+ts.getMaThiSinh()+"'";
		
		String query2 = "UPDATE khoithi SET khoithi.TongDiem = ? WHERE  MaThiSinh = '"+ts.getMaThiSinh()+"' AND MaKhoi = 'A00'";
		
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
			pstmt1.setString(2, "A00");
			pstmt1.setFloat(3, ts.getToan());
			pstmt1.setFloat(4, ts.getLi());
			pstmt1.setFloat(5, ts.getHoa());
			pstmt1.setFloat(6, ts.getTongdiem());
			
			pstmt2.setFloat(1, ts.getTongdiem());
			
			pstmt.execute();
			pstmt1.execute();
			pstmt2.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void delete(khoiA00 ts) {
		String query = "DELETE FROM thisinh WHERE MaThiSinh='"+ts.getMaThiSinh()+"'";
		String query2 = "DELETE FROM khoi_a00 WHERE  MaThiSinh='"+ts.getMaThiSinh()+"'";
		String query3 = "UPDATE khoithi SET khoithi.TongDiem = 0 WHERE  MaThiSinh = '"+ts.getMaThiSinh()+"' AND MaKhoi = 'A00'";
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
	
	public static List<khoiA00>findbySBD(khoiA00 s) {
		List<khoiA00>thisinhl = new ArrayList<>();
		String query = "SELECT khoi_a00.MaThiSinh, taikhoan.HoVaTen, thisinh.NamSinh, thisinh.GioiTinh, Toan, Li, Hoa, thisinh.DiemUuTien, TongDiem, thisinh.DiemHocBa\r\n"
				+ "FROM taikhoan, thisinh, khoi_a00\r\n"
				+ "WHERE taikhoan.MaThiSinh = khoi_a00.MaThiSinh\r\n"
				+ "AND thisinh.MaThiSinh = khoi_a00.MaThiSinh "
				+ "AND thisinh.MaThiSinh = '"+ s.getMaThiSinh() +"'";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				khoiA00 tk = new khoiA00(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("NamSinh"), rs.getInt("GioiTinh"), 
						rs.getFloat("Toan"), rs.getFloat("Li"), rs.getFloat("Hoa"), rs.getFloat("DiemUuTien"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				thisinhl.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return thisinhl;
	}
	
	public static boolean kiemtratontai(khoiA00 s) {
		String query = "select*from khoi_a00 where khoi_a00.MaThiSinh = '"+s.getMaThiSinh()+"'";
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

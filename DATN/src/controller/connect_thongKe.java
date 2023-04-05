package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.ImageIcon;

import model.thongKe;


public class connect_thongKe {
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
	
	public static List<thongKe>findAll(){
		List<thongKe>dstk = new ArrayList<>();
		
		String query = "SELECT khoithi.MaThiSinh, taikhoan.HoVaTen, taikhoan.HinhAnh, khoithi.MaNganh,\r\n"
				+ "khoithi.MaKhoi, khoithi.TongDiem, khoithi.ThuTuNV\r\n"
				+ "FROM taikhoan, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = khoithi.MaThiSinh";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				byte[] imageBytes = rs.getBytes("HinhAnh");
				ImageIcon imageIcon = new ImageIcon(imageBytes);
				thongKe tk = new thongKe(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), imageIcon,
						rs.getString("MaNganh"), rs.getString("MaKhoi"), rs.getFloat("TongDiem") , rs.getInt("ThuTuNV"));
				dstk.add(tk);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dstk;
	}
	
	public static List<thongKe> SapXepTheoKhoi() {
		List<thongKe> dstk = new ArrayList<>();

		String query = "SELECT khoithi.MaThiSinh, taikhoan.HoVaTen, taikhoan.HinhAnh, khoithi.MaNganh,\r\n"
				+ "khoithi.MaKhoi, khoithi.TongDiem, khoithi.ThuTuNV\r\n"
				+ "FROM taikhoan, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = khoithi.MaThiSinh";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				byte[] imageBytes = rs.getBytes("HinhAnh");
				ImageIcon imageIcon = new ImageIcon(imageBytes);
				thongKe tk = new thongKe(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), imageIcon,
						rs.getString("MaNganh"), rs.getString("MaKhoi"), rs.getFloat("TongDiem") , rs.getInt("ThuTuNV"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Comparator<thongKe> compa = new Comparator<thongKe>() {

			@Override
			public int compare(thongKe o1, thongKe o2) {
				String name1 = o1.getKhoiThi();
				String name2 = o2.getKhoiThi();
				return name1.compareTo(name2);	
			}
		};
		Collections.sort(dstk, compa);
		
		return dstk;
	}
	
	public static List<thongKe> SapXepTheoNganh() {
		List<thongKe> dstk = new ArrayList<>();

		String query = "SELECT khoithi.MaThiSinh, taikhoan.HoVaTen, taikhoan.HinhAnh, khoithi.MaNganh,\r\n"
				+ "khoithi.MaKhoi, khoithi.TongDiem, khoithi.ThuTuNV\r\n"
				+ "FROM taikhoan, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = khoithi.MaThiSinh";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				byte[] imageBytes = rs.getBytes("HinhAnh");
				ImageIcon imageIcon = new ImageIcon(imageBytes);
				thongKe tk = new thongKe(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), imageIcon,
						rs.getString("MaNganh"), rs.getString("MaKhoi"), rs.getFloat("TongDiem") , rs.getInt("ThuTuNV"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Comparator<thongKe> compa = new Comparator<thongKe>() {

			@Override
			public int compare(thongKe o1, thongKe o2) {
				String name1 = o1.getNganhThi();
				String name2 = o2.getNganhThi();
				return name1.compareTo(name2);	
			}
		};
		Collections.sort(dstk, compa);
		
		return dstk;
	}
	
	public static List<thongKe> SapXepTheoĐiem() {
		List<thongKe> dstk = new ArrayList<>();

		String query = "SELECT khoithi.MaThiSinh, taikhoan.HoVaTen, taikhoan.HinhAnh, khoithi.MaNganh,\r\n"
				+ "khoithi.MaKhoi, khoithi.TongDiem, khoithi.ThuTuNV\r\n"
				+ "FROM taikhoan, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = khoithi.MaThiSinh";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				byte[] imageBytes = rs.getBytes("HinhAnh");
				ImageIcon imageIcon = new ImageIcon(imageBytes);
				thongKe tk = new thongKe(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), imageIcon,
						rs.getString("MaNganh"), rs.getString("MaKhoi"), rs.getFloat("TongDiem") , rs.getInt("ThuTuNV"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Comparator<thongKe> compa = new Comparator<thongKe>() {

			@Override
			public int compare(thongKe o1, thongKe o2) {
				Float name1 = o1.getTongDiem();
				Float name2 = o2.getTongDiem();
				return name2.compareTo(name1);	
			}
		};
		Collections.sort(dstk, compa);
		
		return dstk;
	}
	
}

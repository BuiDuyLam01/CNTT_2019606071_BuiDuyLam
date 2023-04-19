package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.ImageIcon;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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

	public static List<thongKe> findAll() {
		List<thongKe> dstk = new ArrayList<>();

		String query = "SELECT khoithi.MaThiSinh, taikhoan.HoVaTen, taikhoan.HinhAnh, khoithi.MaNganh,\r\n"
				+ "khoithi.MaKhoi, khoithi.TongDiem, khoithi.ThuTuNV\r\n" + "FROM taikhoan, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = khoithi.MaThiSinh";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				byte[] imageBytes = rs.getBytes("HinhAnh");
				ImageIcon imageIcon = new ImageIcon(imageBytes);
				thongKe tk = new thongKe(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), imageIcon,
						rs.getString("MaNganh"), rs.getString("MaKhoi"), rs.getFloat("TongDiem"), rs.getInt("ThuTuNV"));
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
				+ "khoithi.MaKhoi, khoithi.TongDiem, khoithi.ThuTuNV\r\n" + "FROM taikhoan, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = khoithi.MaThiSinh";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				byte[] imageBytes = rs.getBytes("HinhAnh");
				ImageIcon imageIcon = new ImageIcon(imageBytes);
				thongKe tk = new thongKe(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), imageIcon,
						rs.getString("MaNganh"), rs.getString("MaKhoi"), rs.getFloat("TongDiem"), rs.getInt("ThuTuNV"));
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
				+ "khoithi.MaKhoi, khoithi.TongDiem, khoithi.ThuTuNV\r\n" + "FROM taikhoan, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = khoithi.MaThiSinh";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				byte[] imageBytes = rs.getBytes("HinhAnh");
				ImageIcon imageIcon = new ImageIcon(imageBytes);
				thongKe tk = new thongKe(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), imageIcon,
						rs.getString("MaNganh"), rs.getString("MaKhoi"), rs.getFloat("TongDiem"), rs.getInt("ThuTuNV"));
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
				+ "khoithi.MaKhoi, khoithi.TongDiem, khoithi.ThuTuNV\r\n" + "FROM taikhoan, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = khoithi.MaThiSinh";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				byte[] imageBytes = rs.getBytes("HinhAnh");
				ImageIcon imageIcon = new ImageIcon(imageBytes);
				thongKe tk = new thongKe(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), imageIcon,
						rs.getString("MaNganh"), rs.getString("MaKhoi"), rs.getFloat("TongDiem"), rs.getInt("ThuTuNV"));
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

	// dữ liệu từ excel
	public static void update() {
		Connection conn = null;
		FileInputStream fis = null;
		Workbook workbook = null;

		try {
			// Kết nối đến cơ sở dữ liệu
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlithisinh", "root", "");

			// Đọc tệp Excel
			File file = new File("C:\\Users\\liam\\OneDrive\\Desktop\\vidu.xlsx");
			if (!file.exists()) {
				throw new FileNotFoundException("Không tìm thấy tệp Excel");
			}
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheetAt(0);

			for (Row row : sheet) {
			    Cell maThiSinhCell = row.getCell(0);
			    String maThiSinh = String.valueOf((int) maThiSinhCell.getNumericCellValue());
			    Cell diemCell = row.getCell(1);
			    String khoithi = row.getCell(2).getStringCellValue();
			    float diem;
			    if (diemCell == null || diemCell.getCellType() == CellType.BLANK) {
			        System.err.println("Dòng " + row.getRowNum() + ": Không tìm thấy điểm thi.");
			        continue;
			    }
			    if (diemCell.getCellType() == CellType.NUMERIC) {
			        diem = (float) diemCell.getNumericCellValue();
			    } else {
			        diem = Float.parseFloat(diemCell.getStringCellValue());
			    }
			    String sql = "UPDATE khoithi SET tongdiem = ? WHERE MaThiSinh = ? AND MaKhoi = ?";
			    PreparedStatement pstmt = conn.prepareStatement(sql);
			    pstmt.setFloat(1, diem);
			    pstmt.setString(2, maThiSinh);
			    pstmt.setString(3, khoithi);
			    pstmt.executeUpdate();
			}

		} catch (FileNotFoundException e) {
			System.err.println("Không tìm thấy tệp Excel: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Lỗi khi đọc tệp Excel: " + e.getMessage());
		} catch (SQLException e) {
			System.err.println("Lỗi khi cập nhật cơ sở dữ liệu: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Lỗi không xác định: " + e.getMessage());
		} finally {
			// Đóng kết nối và giải phóng tài nguyên
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.err.println("Lỗi khi đóng FileInputStream: " + e.getMessage());
				}
			}
			if (workbook != null) {
				try {
					workbook.close();
				} catch (IOException e) {
					System.err.println("Lỗi khi đóng Workbook: " + e.getMessage());
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					System.err.println("Lỗi khi đóng Connection: " + e.getMessage());
				}
			}
		}
	}

	public static void update2() {
		Connection conn = null;
		FileInputStream fis = null;
		Workbook workbook = null;

		try {
			// Kết nối đến cơ sở dữ liệu
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlithisinh", "root", "");

			// Đọc tệp Excel
			File file = new File("C:\\Users\\liam\\OneDrive\\Desktop\\vidu2.xlsx");
			if (!file.exists()) {
				throw new FileNotFoundException("Không tìm thấy tệp Excel");
			}
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheetAt(0);

			// Cập nhật cơ sở dữ liệu
			// Assume that you have a Sheet object named sheet containing the data

			for (Row row : sheet) {
				Cell maThiSinhCell = row.getCell(0);
			    String maThiSinh = String.valueOf((int) maThiSinhCell.getNumericCellValue());

				Cell namSinhCell = row.getCell(1);
				int namSinh = (int) namSinhCell.getNumericCellValue();

				Cell gioiTinhCell = row.getCell(2);
				int gioiTinh = (int) gioiTinhCell.getNumericCellValue();

				Cell diemUuTienCell = row.getCell(3);
				float diemUuTien = (float) diemUuTienCell.getNumericCellValue();

				Cell diemHocBaCell = row.getCell(4);
				float diemHocBa = (float) diemHocBaCell.getNumericCellValue();

				String sql = "INSERT IGNORE INTO thisinh (MaThiSinh, NamSinh, GioiTinh, DiemUuTien, DiemHocBa) VALUES (?, ?, ?, ?, ?);\r\n";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, maThiSinh);
				pstmt.setInt(2, namSinh);
				pstmt.setInt(3, gioiTinh);
				pstmt.setFloat(4, diemUuTien);
				pstmt.setFloat(5, diemHocBa);
				pstmt.executeUpdate();
			}

		} catch (FileNotFoundException e) {
			System.err.println("Không tìm thấy tệp Excel: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Lỗi khi đọc tệp Excel: " + e.getMessage());
		} catch (SQLException e) {
			System.err.println("Lỗi khi cập nhật cơ sở dữ liệu: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Lỗi không xác định: " + e.getMessage());
		} finally {
			// Đóng kết nối và giải phóng tài nguyên
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.err.println("Lỗi khi đóng FileInputStream: " + e.getMessage());
				}
			}
			if (workbook != null) {
				try {
					workbook.close();
				} catch (IOException e) {
					System.err.println("Lỗi khi đóng Workbook: " + e.getMessage());
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					System.err.println("Lỗi khi đóng Connection: " + e.getMessage());
				}
			}
		}
	}
}

package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.protobuf.Int32Value;
import model.thiSinh;

public class connect_thiSinh {

	private static String[] columns = { "Mã thí sinh", "Họ và tên", "Giới tính", "Năm sinh", "Tổng điểm",
			"Điểm học bạ" };

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

	// Ngành công nghệ thông tin - khoa công nghệ thông tin
	public static List<thiSinh> findAll_CNTT() {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh,\r\n"
				+ "khoithi.TongDiem, thisinh.DiemHocBa\r\n" + "FROM taikhoan, thisinh, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = thisinh.MaThiSinh\r\n" + "AND khoithi.MaThiSinh = thisinh.MaThiSinh\r\n"
				+ "AND khoithi.MaNganh = \"CNTT\"";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static List<thiSinh> TrungTuyen_CNTT(int top1, int top2) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"CNTT\"\r\n"
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static void XuatFile_CNTT(int top1, int top2) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"CNTT\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				while (rs.next()) {
					thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
							rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
					ds.add(tk);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();

		Row headerRow = sheet.createRow(0);
		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
		}

		int rowNum = 1;
		for (thiSinh taikhoan : ds) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(taikhoan.getMaThiSinh());
			row.createCell(1).setCellValue(taikhoan.getHoVaTen());
			row.createCell(2).setCellValue(taikhoan.getGioiTinh() == 0 ? "Nam" : "Nữ");
			row.createCell(3).setCellValue(taikhoan.getNamSinh());
			row.createCell(4).setCellValue(taikhoan.getTongDiem());
			row.createCell(5).setCellValue(taikhoan.getDiemHocBa());
		}

		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\liam\\OneDrive\\Desktop\\ds.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();
	}

	// Ngành khoa học máy tính - khoa công nghệ thông tin
	public static List<thiSinh> findAll_KHMT() {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh,\r\n"
				+ "khoithi.TongDiem, thisinh.DiemHocBa\r\n" + "FROM taikhoan, thisinh, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = thisinh.MaThiSinh\r\n" + "AND khoithi.MaThiSinh = thisinh.MaThiSinh\r\n"
				+ "AND khoithi.MaNganh = \"KHMT\"";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static List<thiSinh> TrungTuyen_KHMT(int top1, int top2) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"KHMT\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static void XuatFile_KHMT(int top1, int top2) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"KHMT\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				while (rs.next()) {
					thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
							rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
					ds.add(tk);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();

		Row headerRow = sheet.createRow(0);
		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
		}

		int rowNum = 1;
		for (thiSinh taikhoan : ds) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(taikhoan.getMaThiSinh());
			row.createCell(1).setCellValue(taikhoan.getHoVaTen());
			row.createCell(2).setCellValue(taikhoan.getGioiTinh() == 0 ? "Nam" : "Nữ");
			row.createCell(3).setCellValue(taikhoan.getNamSinh());
			row.createCell(4).setCellValue(taikhoan.getTongDiem());
			row.createCell(5).setCellValue(taikhoan.getDiemHocBa());
		}

		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\liam\\OneDrive\\Desktop\\ds.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();
	}

	// Ngành hệ thống thông tin - khoa công nghệ thông tin
	public static List<thiSinh> findAll_HTTT() {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh,\r\n"
				+ "khoithi.TongDiem, thisinh.DiemHocBa\r\n" + "FROM taikhoan, thisinh, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = thisinh.MaThiSinh\r\n" + "AND khoithi.MaThiSinh = thisinh.MaThiSinh\r\n"
				+ "AND khoithi.MaNganh = \"HTTT\"";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static List<thiSinh> TrungTuyen_HTTT(int top1, int top2) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"HTTT\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static void XuatFile_HTTT(int top1, int top2) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"HTTT\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				while (rs.next()) {
					thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
							rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
					ds.add(tk);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();

		Row headerRow = sheet.createRow(0);
		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
		}

		int rowNum = 1;
		for (thiSinh taikhoan : ds) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(taikhoan.getMaThiSinh());
			row.createCell(1).setCellValue(taikhoan.getHoVaTen());
			row.createCell(2).setCellValue(taikhoan.getGioiTinh() == 0 ? "Nam" : "Nữ");
			row.createCell(3).setCellValue(taikhoan.getNamSinh());
			row.createCell(4).setCellValue(taikhoan.getTongDiem());
			row.createCell(5).setCellValue(taikhoan.getDiemHocBa());
		}

		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\liam\\OneDrive\\Desktop\\ds.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();
	}

	// Ngành kỹ thuật phần mềm - khoa công nghệ thông tin
	public static List<thiSinh> findAll_KTPM() {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh,\r\n"
				+ "khoithi.TongDiem, thisinh.DiemHocBa\r\n" + "FROM taikhoan, thisinh, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = thisinh.MaThiSinh\r\n" + "AND khoithi.MaThiSinh = thisinh.MaThiSinh\r\n"
				+ "AND khoithi.MaNganh = \"KTPM\"";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static List<thiSinh> TrungTuyen_KTPM(int top1, int top2) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"KTPM\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static void XuatFile_KTPM(int top1, int top2) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"KTPM\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				while (rs.next()) {
					thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
							rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
					ds.add(tk);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();

		Row headerRow = sheet.createRow(0);
		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
		}

		int rowNum = 1;
		for (thiSinh taikhoan : ds) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(taikhoan.getMaThiSinh());
			row.createCell(1).setCellValue(taikhoan.getHoVaTen());
			row.createCell(2).setCellValue(taikhoan.getGioiTinh() == 0 ? "Nam" : "Nữ");
			row.createCell(3).setCellValue(taikhoan.getNamSinh());
			row.createCell(4).setCellValue(taikhoan.getTongDiem());
			row.createCell(5).setCellValue(taikhoan.getDiemHocBa());
		}

		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\liam\\OneDrive\\Desktop\\ds.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();
	}

	// Ngành học sư phạm - khoa giáo dục và đào tạo
	public static List<thiSinh> findAll_HSP() {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh,\r\n"
				+ "khoithi.TongDiem, thisinh.DiemHocBa\r\n" + "FROM taikhoan, thisinh, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = thisinh.MaThiSinh\r\n" + "AND khoithi.MaThiSinh = thisinh.MaThiSinh\r\n"
				+ "AND khoithi.MaNganh = \"HSP\"";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static List<thiSinh> TrungTuyen_HSP(int top1, int top2) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"HSP\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static void XuatFile_HSP(int top1, int top2) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"HSP\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				while (rs.next()) {
					thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
							rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
					ds.add(tk);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();

		Row headerRow = sheet.createRow(0);
		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
		}

		int rowNum = 1;
		for (thiSinh taikhoan : ds) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(taikhoan.getMaThiSinh());
			row.createCell(1).setCellValue(taikhoan.getHoVaTen());
			row.createCell(2).setCellValue(taikhoan.getGioiTinh() == 0 ? "Nam" : "Nữ");
			row.createCell(3).setCellValue(taikhoan.getNamSinh());
			row.createCell(4).setCellValue(taikhoan.getTongDiem());
			row.createCell(5).setCellValue(taikhoan.getDiemHocBa());
		}

		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\liam\\OneDrive\\Desktop\\ds.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();
	}

	// Ngành giáo dục trẻ em - khoa giáo dục và đào tạo
	public static List<thiSinh> findAll_GDTE() {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh,\r\n"
				+ "khoithi.TongDiem, thisinh.DiemHocBa\r\n" + "FROM taikhoan, thisinh, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = thisinh.MaThiSinh\r\n" + "AND khoithi.MaThiSinh = thisinh.MaThiSinh\r\n"
				+ "AND khoithi.MaNganh = \"GDTE\"";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static List<thiSinh> TrungTuyen_GDTE(int top1, int top2) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"GDTE\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static void XuatFile_GDTE(int top1, int top2) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"GDTE\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				while (rs.next()) {
					thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
							rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
					ds.add(tk);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();

		Row headerRow = sheet.createRow(0);
		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
		}

		int rowNum = 1;
		for (thiSinh taikhoan : ds) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(taikhoan.getMaThiSinh());
			row.createCell(1).setCellValue(taikhoan.getHoVaTen());
			row.createCell(2).setCellValue(taikhoan.getGioiTinh() == 0 ? "Nam" : "Nữ");
			row.createCell(3).setCellValue(taikhoan.getNamSinh());
			row.createCell(4).setCellValue(taikhoan.getTongDiem());
			row.createCell(5).setCellValue(taikhoan.getDiemHocBa());
		}

		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\liam\\OneDrive\\Desktop\\ds.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();
	}

	// Ngành giáo dục người lớn - khoa giáo dục và đào tạo
	public static List<thiSinh> findAll_GDNL() {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh,\r\n"
				+ "khoithi.TongDiem, thisinh.DiemHocBa\r\n" + "FROM taikhoan, thisinh, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = thisinh.MaThiSinh\r\n" + "AND khoithi.MaThiSinh = thisinh.MaThiSinh\r\n"
				+ "AND khoithi.MaNganh = \"GDNL\"";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static List<thiSinh> TrungTuyen_GDNL(int top1, int top2) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"GDNL\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static void XuatFile_GDNL(int top1, int top2) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"GDNL\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				while (rs.next()) {
					thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
							rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
					ds.add(tk);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();

		Row headerRow = sheet.createRow(0);
		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
		}

		int rowNum = 1;
		for (thiSinh taikhoan : ds) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(taikhoan.getMaThiSinh());
			row.createCell(1).setCellValue(taikhoan.getHoVaTen());
			row.createCell(2).setCellValue(taikhoan.getGioiTinh() == 0 ? "Nam" : "Nữ");
			row.createCell(3).setCellValue(taikhoan.getNamSinh());
			row.createCell(4).setCellValue(taikhoan.getTongDiem());
			row.createCell(5).setCellValue(taikhoan.getDiemHocBa());
		}

		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\liam\\OneDrive\\Desktop\\ds.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();
	}

	// Ngành quản lí giáo dục - khoa giáo dục và đào tạo
	public static List<thiSinh> findAll_QLGD() {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh,\r\n"
				+ "khoithi.TongDiem, thisinh.DiemHocBa\r\n" + "FROM taikhoan, thisinh, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = thisinh.MaThiSinh\r\n" + "AND khoithi.MaThiSinh = thisinh.MaThiSinh\r\n"
				+ "AND khoithi.MaNganh = \"QLGD\"";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static List<thiSinh> TrungTuyen_QLGD(int top1, int top2) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"QLGD\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static void XuatFile_QLGD(int top1, int top2) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"QLGD\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				while (rs.next()) {
					thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
							rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
					ds.add(tk);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();

		Row headerRow = sheet.createRow(0);
		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
		}

		int rowNum = 1;
		for (thiSinh taikhoan : ds) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(taikhoan.getMaThiSinh());
			row.createCell(1).setCellValue(taikhoan.getHoVaTen());
			row.createCell(2).setCellValue(taikhoan.getGioiTinh() == 0 ? "Nam" : "Nữ");
			row.createCell(3).setCellValue(taikhoan.getNamSinh());
			row.createCell(4).setCellValue(taikhoan.getTongDiem());
			row.createCell(5).setCellValue(taikhoan.getDiemHocBa());
		}

		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\liam\\OneDrive\\Desktop\\ds.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();
	}

	// Ngành kỹ thuật cơ khí - khoa kỹ thuật
	public static List<thiSinh> findAll_KTCK() {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh,\r\n"
				+ "khoithi.TongDiem, thisinh.DiemHocBa\r\n" + "FROM taikhoan, thisinh, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = thisinh.MaThiSinh\r\n" + "AND khoithi.MaThiSinh = thisinh.MaThiSinh\r\n"
				+ "AND khoithi.MaNganh = \"KTCK\"";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static List<thiSinh> TrungTuyen_KTCK(int top1, int top2) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"KTCK\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static void XuatFile_KTCK(int top1, int top2) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"KTCK\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				while (rs.next()) {
					thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
							rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
					ds.add(tk);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();

		Row headerRow = sheet.createRow(0);
		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
		}

		int rowNum = 1;
		for (thiSinh taikhoan : ds) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(taikhoan.getMaThiSinh());
			row.createCell(1).setCellValue(taikhoan.getHoVaTen());
			row.createCell(2).setCellValue(taikhoan.getGioiTinh() == 0 ? "Nam" : "Nữ");
			row.createCell(3).setCellValue(taikhoan.getNamSinh());
			row.createCell(4).setCellValue(taikhoan.getTongDiem());
			row.createCell(5).setCellValue(taikhoan.getDiemHocBa());
		}

		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\liam\\OneDrive\\Desktop\\ds.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();
	}

	// Ngành kỹ thuật ô tô - khoa kỹ thuật
	public static List<thiSinh> findAll_KTOT() {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh,\r\n"
				+ "khoithi.TongDiem, thisinh.DiemHocBa\r\n" + "FROM taikhoan, thisinh, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = thisinh.MaThiSinh\r\n" + "AND khoithi.MaThiSinh = thisinh.MaThiSinh\r\n"
				+ "AND khoithi.MaNganh = \"KTOT\"";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static List<thiSinh> TrungTuyen_KTOT(int top1, int top2) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"KTOT\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static void XuatFile_KTOT(int top1, int top2) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"KTOT\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				while (rs.next()) {
					thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
							rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
					ds.add(tk);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();

		Row headerRow = sheet.createRow(0);
		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
		}

		int rowNum = 1;
		for (thiSinh taikhoan : ds) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(taikhoan.getMaThiSinh());
			row.createCell(1).setCellValue(taikhoan.getHoVaTen());
			row.createCell(2).setCellValue(taikhoan.getGioiTinh() == 0 ? "Nam" : "Nữ");
			row.createCell(3).setCellValue(taikhoan.getNamSinh());
			row.createCell(4).setCellValue(taikhoan.getTongDiem());
			row.createCell(5).setCellValue(taikhoan.getDiemHocBa());
		}

		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\liam\\OneDrive\\Desktop\\ds.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();
	}

	// Ngành khoa học hàng hải - khoa kỹ thuật
	public static List<thiSinh> findAll_KHHH() {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh,\r\n"
				+ "khoithi.TongDiem, thisinh.DiemHocBa\r\n" + "FROM taikhoan, thisinh, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = thisinh.MaThiSinh\r\n" + "AND khoithi.MaThiSinh = thisinh.MaThiSinh\r\n"
				+ "AND khoithi.MaNganh = \"KHHH\"";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static List<thiSinh> TrungTuyen_KHHH(int top1, int top2) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"KHHH\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static void XuatFile_KHHH(int top1, int top2) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"KHHH\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				while (rs.next()) {
					thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
							rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
					ds.add(tk);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();

		Row headerRow = sheet.createRow(0);
		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
		}

		int rowNum = 1;
		for (thiSinh taikhoan : ds) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(taikhoan.getMaThiSinh());
			row.createCell(1).setCellValue(taikhoan.getHoVaTen());
			row.createCell(2).setCellValue(taikhoan.getGioiTinh() == 0 ? "Nam" : "Nữ");
			row.createCell(3).setCellValue(taikhoan.getNamSinh());
			row.createCell(4).setCellValue(taikhoan.getTongDiem());
			row.createCell(5).setCellValue(taikhoan.getDiemHocBa());
		}

		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\liam\\OneDrive\\Desktop\\ds.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();
	}

	// Ngành cơ điện tử - khoa kỹ thuật
	public static List<thiSinh> findAll_CDT() {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh,\r\n"
				+ "khoithi.TongDiem, thisinh.DiemHocBa\r\n" + "FROM taikhoan, thisinh, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = thisinh.MaThiSinh\r\n" + "AND khoithi.MaThiSinh = thisinh.MaThiSinh\r\n"
				+ "AND khoithi.MaNganh = \"CDT\"";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static List<thiSinh> TrungTuyen_CDT(int top1, int top2) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"CDT\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static void XuatFile_CDT(int top1, int top2) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"CDT\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				while (rs.next()) {
					thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
							rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
					ds.add(tk);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();

		Row headerRow = sheet.createRow(0);
		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
		}

		int rowNum = 1;
		for (thiSinh taikhoan : ds) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(taikhoan.getMaThiSinh());
			row.createCell(1).setCellValue(taikhoan.getHoVaTen());
			row.createCell(2).setCellValue(taikhoan.getGioiTinh() == 0 ? "Nam" : "Nữ");
			row.createCell(3).setCellValue(taikhoan.getNamSinh());
			row.createCell(4).setCellValue(taikhoan.getTongDiem());
			row.createCell(5).setCellValue(taikhoan.getDiemHocBa());
		}

		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\liam\\OneDrive\\Desktop\\ds.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();
	}

	// Ngành thương mại điện tử - khoa kinh doanh vào quản lí
	public static List<thiSinh> findAll_TMDT() {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh,\r\n"
				+ "khoithi.TongDiem, thisinh.DiemHocBa\r\n" + "FROM taikhoan, thisinh, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = thisinh.MaThiSinh\r\n" + "AND khoithi.MaThiSinh = thisinh.MaThiSinh\r\n"
				+ "AND khoithi.MaNganh = \"TMDT\"";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static List<thiSinh> TrungTuyen_TMDT(int top1, int top2) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"TMDT\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static void XuatFile_TMDT(int top1, int top2) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"TMDT\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				while (rs.next()) {
					thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
							rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
					ds.add(tk);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();

		Row headerRow = sheet.createRow(0);
		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
		}

		int rowNum = 1;
		for (thiSinh taikhoan : ds) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(taikhoan.getMaThiSinh());
			row.createCell(1).setCellValue(taikhoan.getHoVaTen());
			row.createCell(2).setCellValue(taikhoan.getGioiTinh() == 0 ? "Nam" : "Nữ");
			row.createCell(3).setCellValue(taikhoan.getNamSinh());
			row.createCell(4).setCellValue(taikhoan.getTongDiem());
			row.createCell(5).setCellValue(taikhoan.getDiemHocBa());
		}

		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\liam\\OneDrive\\Desktop\\ds.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();
	}

	// Ngành kế toán - khoa kinh doanh vào quản lí
	public static List<thiSinh> findAll_KT() {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh,\r\n"
				+ "khoithi.TongDiem, thisinh.DiemHocBa\r\n" + "FROM taikhoan, thisinh, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = thisinh.MaThiSinh\r\n" + "AND khoithi.MaThiSinh = thisinh.MaThiSinh\r\n"
				+ "AND khoithi.MaNganh = \"KT\"";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static List<thiSinh> TrungTuyen_KT(int top1, int top2) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"KT\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static void XuatFile_KT(int top1, int top2) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"KT\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				while (rs.next()) {
					thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
							rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
					ds.add(tk);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();

		Row headerRow = sheet.createRow(0);
		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
		}

		int rowNum = 1;
		for (thiSinh taikhoan : ds) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(taikhoan.getMaThiSinh());
			row.createCell(1).setCellValue(taikhoan.getHoVaTen());
			row.createCell(2).setCellValue(taikhoan.getGioiTinh() == 0 ? "Nam" : "Nữ");
			row.createCell(3).setCellValue(taikhoan.getNamSinh());
			row.createCell(4).setCellValue(taikhoan.getTongDiem());
			row.createCell(5).setCellValue(taikhoan.getDiemHocBa());
		}

		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\liam\\OneDrive\\Desktop\\ds.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();
	}

	// Ngành quản lí chất lượng - khoa kinh doanh vào quản lí
	public static List<thiSinh> findAll_QLCL() {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh,\r\n"
				+ "khoithi.TongDiem, thisinh.DiemHocBa\r\n" + "FROM taikhoan, thisinh, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = thisinh.MaThiSinh\r\n" + "AND khoithi.MaThiSinh = thisinh.MaThiSinh\r\n"
				+ "AND khoithi.MaNganh = \"QLCL\"";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static List<thiSinh> TrungTuyen_QLCL(int top1, int top2) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"QLCL\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static void XuatFile_QLCL(int top1, int top2) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"QLCL\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				while (rs.next()) {
					thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
							rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
					ds.add(tk);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();

		Row headerRow = sheet.createRow(0);
		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
		}

		int rowNum = 1;
		for (thiSinh taikhoan : ds) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(taikhoan.getMaThiSinh());
			row.createCell(1).setCellValue(taikhoan.getHoVaTen());
			row.createCell(2).setCellValue(taikhoan.getGioiTinh() == 0 ? "Nam" : "Nữ");
			row.createCell(3).setCellValue(taikhoan.getNamSinh());
			row.createCell(4).setCellValue(taikhoan.getTongDiem());
			row.createCell(5).setCellValue(taikhoan.getDiemHocBa());
		}

		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\liam\\OneDrive\\Desktop\\ds.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();
	}

	// Ngành marketing - khoa kinh doanh vào quản lí
	public static List<thiSinh> findAll_MKT() {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh,\r\n"
				+ "khoithi.TongDiem, thisinh.DiemHocBa\r\n" + "FROM taikhoan, thisinh, khoithi\r\n"
				+ "WHERE taikhoan.MaThiSinh = thisinh.MaThiSinh\r\n" + "AND khoithi.MaThiSinh = thisinh.MaThiSinh\r\n"
				+ "AND khoithi.MaNganh = \"MKT\"";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static List<thiSinh> TrungTuyen_MKT(int top1, int top2) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"MKT\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				dstk.add(tk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstk;
	}

	public static void XuatFile_MKT(int top1, int top2) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT ts.MaThiSinh, tk.HoVaTen, ts.GioiTinh, ts.NamSinh, kt.TongDiem, ts.DiemHocBa\r\n"
				+ "FROM taikhoan tk\r\n" + "JOIN thisinh ts ON tk.MaThiSinh = ts.MaThiSinh\r\n"
				+ "JOIN khoithi kt ON ts.MaThiSinh = kt.MaThiSinh\r\n" + "WHERE kt.MaNganh = \"MKT\""
				+ "AND kt.TongDiem >= (SELECT DISTINCT TongDiem FROM khoithi ORDER BY TongDiem DESC LIMIT " + top1
				+ ",1)\r\n"
				+ "   OR (ts.DiemHocBa >= (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top2
				+ ",1) AND\r\n"
				+ "       ts.DiemHocBa < (SELECT DISTINCT DiemHocBa FROM thisinh ORDER BY DiemHocBa DESC LIMIT " + top1
				+ ",1))\r\n" + "ORDER BY kt.TongDiem DESC, ts.DiemHocBa DESC\r\n" + "LIMIT " + (top1 + top2) + ";";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				while (rs.next()) {
					thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
							rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
					ds.add(tk);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();

		Row headerRow = sheet.createRow(0);
		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
		}

		int rowNum = 1;
		for (thiSinh taikhoan : ds) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(taikhoan.getMaThiSinh());
			row.createCell(1).setCellValue(taikhoan.getHoVaTen());
			row.createCell(2).setCellValue(taikhoan.getGioiTinh() == 0 ? "Nam" : "Nữ");
			row.createCell(3).setCellValue(taikhoan.getNamSinh());
			row.createCell(4).setCellValue(taikhoan.getTongDiem());
			row.createCell(5).setCellValue(taikhoan.getDiemHocBa());
		}

		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\liam\\OneDrive\\Desktop\\ds.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();
	}

}

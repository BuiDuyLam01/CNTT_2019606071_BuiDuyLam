package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

	public static List<thiSinh> TrungTuyen_CNTT(int top1) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'CNTT'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
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

	public static void XuatFile_CNTT(int top1) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'CNTT'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				ds.add(tk);
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

	public static List<thiSinh> TrungTuyen_KHMT(int top1) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'KHMT'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
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

	public static void XuatFile_KHMT(int top1) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'KHMT'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				ds.add(tk);
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

	public static List<thiSinh> TrungTuyen_HTTT(int top1) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'HTTT'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
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

	public static void XuatFile_HTTT(int top1) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'HTTT'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				ds.add(tk);
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

	public static List<thiSinh> TrungTuyen_KTPM(int top1) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'KTPM'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
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

	public static void XuatFile_KTPM(int top1) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'KTPM'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				ds.add(tk);
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

	public static List<thiSinh> TrungTuyen_HSP(int top1) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'HSP'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
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

	public static void XuatFile_HSP(int top1) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'HSP'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				ds.add(tk);
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

	public static List<thiSinh> TrungTuyen_GDTE(int top1) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'GDTE'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
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

	public static void XuatFile_GDTE(int top1) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'GDTE'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				ds.add(tk);
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

	public static List<thiSinh> TrungTuyen_GDNL(int top1) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'GDNL'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
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

	public static void XuatFile_GDNL(int top1) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'GDNL'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				ds.add(tk);
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

	public static List<thiSinh> TrungTuyen_QLGD(int top1) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'QLGD'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
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

	public static void XuatFile_QLGD(int top1) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'QLGD'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				ds.add(tk);
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

	public static List<thiSinh> TrungTuyen_KTCK(int top1) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'KTCK'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
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

	public static void XuatFile_KTCK(int top1) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'KTCK'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				ds.add(tk);
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

	public static List<thiSinh> TrungTuyen_KTOT(int top1) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'KTOT'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
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

	public static void XuatFile_KTOT(int top1) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'KTOT'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				ds.add(tk);
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

	public static List<thiSinh> TrungTuyen_KHHH(int top1) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'KHHH'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
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

	public static void XuatFile_KHHH(int top1) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'KHHH'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				ds.add(tk);
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

	public static List<thiSinh> TrungTuyen_CDT(int top1) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'CDT'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
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

	public static void XuatFile_CDT(int top1) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'CDT'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				ds.add(tk);
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

	public static List<thiSinh> TrungTuyen_TMDT(int top1) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'TMDT'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
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

	public static void XuatFile_TMDT(int top1) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'TMDT'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				ds.add(tk);
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

	public static List<thiSinh> TrungTuyen_KT(int top1) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'KT'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
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

	public static void XuatFile_KT(int top1) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'KT'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
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

	public static List<thiSinh> TrungTuyen_QLCL(int top1) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'QLCL'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
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

	public static void XuatFile_QLCL(int top1) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'QLCL'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				ds.add(tk);
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

	public static List<thiSinh> TrungTuyen_MKT(int top1) {
		List<thiSinh> dstk = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'MKT'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
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

	public static void XuatFile_MKT(int top1) throws IOException {

		List<thiSinh> ds = new ArrayList<>();

		String query = "SELECT DISTINCT thisinh.MaThiSinh, taikhoan.HoVaTen, thisinh.GioiTinh, thisinh.NamSinh, MAX(khoithi.TongDiem) AS TongDiem, MAX(thisinh.DiemHocBa) AS DiemHocBa\r\n"
				+ "FROM khoithi, thisinh, taikhoan\r\n"
				+ "WHERE khoithi.MaThiSinh = taikhoan.MaThiSinh AND taikhoan.MaThiSinh = thisinh.MaThiSinh AND MaNganh = 'MKT'\r\n"
				+ "GROUP BY thisinh.MaThiSinh\r\n"
				+ "ORDER BY TongDiem DESC, DiemHocBa DESC\r\n"
				+ "LIMIT " + top1 + " ;";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				thiSinh tk = new thiSinh(rs.getString("MaThiSinh"), rs.getString("HoVaTen"), rs.getInt("GioiTinh"),
						rs.getInt("NamSinh"), rs.getFloat("TongDiem"), rs.getFloat("DiemHocBa"));
				ds.add(tk);
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

	public static boolean kiemTraDangKy(String s) {
		String query = "SELECT COUNT(*) as count FROM khoithi WHERE mathisinh = '"+ s +"'";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			if (rs.next()) {
				int count = rs.getInt("count");
				if (count > 0) {
					System.out.println("That bai");
					return true;
				} else {
					System.out.println("Thanh cong");
					return false;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}

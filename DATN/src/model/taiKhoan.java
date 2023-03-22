package model;

public class taiKhoan {
	private String maThiSinh;
	private String hoVaTen;
	private String tenDangNhap;
	private String matKhau;
	private String gmail;
	
	public taiKhoan() {
		
	}

	public taiKhoan(String maThiSinh, String hoVaTen, String tenDangNhap, String matKhau, String gmail) {
		super();
		this.maThiSinh = maThiSinh;
		this.hoVaTen = hoVaTen;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.gmail = gmail;
	}

	public String getMaThiSinh() {
		return maThiSinh;
	}

	public void setMaThiSinh(String maThiSinh) {
		this.maThiSinh = maThiSinh;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getTenDangNhap() {
		return tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	
}

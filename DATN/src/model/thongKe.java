package model;

import javax.swing.ImageIcon;

public class thongKe {
	private String maThiSinh;
	private String hoVaTen;
	private ImageIcon anh;
	private String nganhThi;
	private String khoiThi;
	private float tongDiem;
	private int thuTuNV;
	
	public thongKe() {
		
	}

	public thongKe(String maThiSinh, String hoVaTen, ImageIcon anh, String nganhThi, String khoiThi, float tongDiem,
			int thuTuNV) {
		super();
		this.maThiSinh = maThiSinh;
		this.hoVaTen = hoVaTen;
		this.anh = anh;
		this.nganhThi = nganhThi;
		this.khoiThi = khoiThi;
		this.tongDiem = tongDiem;
		this.thuTuNV = thuTuNV;
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

	public ImageIcon getAnh() {
		return anh;
	}

	public void setAnh(ImageIcon anh) {
		this.anh = anh;
	}

	public String getNganhThi() {
		return nganhThi;
	}

	public void setNganhThi(String nganhThi) {
		this.nganhThi = nganhThi;
	}

	public String getKhoiThi() {
		return khoiThi;
	}

	public void setKhoiThi(String khoiThi) {
		this.khoiThi = khoiThi;
	}

	public float getTongDiem() {
		return tongDiem;
	}

	public void setTongDiem(float tongDiem) {
		this.tongDiem = tongDiem;
	}

	public int getThuTuNV() {
		return thuTuNV;
	}

	public void setThuTuNV(int thuTuNV) {
		this.thuTuNV = thuTuNV;
	}

	
	
}

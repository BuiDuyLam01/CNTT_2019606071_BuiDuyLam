package model;

public class thiSinh {
	private String maThiSinh;
	private String hoVaTen;
	private int gioiTinh;
	private int namSinh;
	private float tongDiem;
	private float diemHocBa;
	
	public thiSinh() {
		
	}

	public thiSinh(String maThiSinh, String hoVaTen, int gioiTinh, int namSinh, float tongDiem, float diemHocBa) {
		this.maThiSinh = maThiSinh;
		this.hoVaTen = hoVaTen;
		this.gioiTinh = gioiTinh;
		this.namSinh = namSinh;
		this.tongDiem = tongDiem;
		this.diemHocBa = diemHocBa;
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

	public int getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public float getTongDiem() {
		return tongDiem;
	}

	public void setTongDiem(float tongDiem) {
		this.tongDiem = tongDiem;
	}

	public float getDiemHocBa() {
		return diemHocBa;
	}

	public void setDiemHocBa(float diemHocBa) {
		this.diemHocBa = diemHocBa;
	}
	
	
}

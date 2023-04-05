package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Window;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import controller.connect_thiSinh;
import controller.connect_khoiA00;
import controller.connect_khoiA01;
import controller.connect_khoiA02;
import controller.connect_khoiA03;
import controller.connect_khoiA04;
import controller.connect_khoiA05;
import controller.connect_khoiA06;
import controller.connect_khoiA07;
import controller.connect_khoiA08;
import controller.connect_taiKhoan;
import controller.connect_thongKe;
import model.thiSinh;
import model.khoiA00;
import model.khoiA01;
import model.khoiA02;
import model.khoiA03;
import model.khoiA04;
import model.khoiA05;
import model.khoiA06;
import model.khoiA07;
import model.khoiA08;
import model.taiKhoan;
import model.thongKe;

import javax.swing.JComboBox;

public class HomeAdmin extends JFrame {

	private JPanel contentPane;
	private JPanel panel_NganhCNTT;
	private JPanel panel_NganhKHMT;
	private JPanel panel_NganhHTTT;
	private JPanel panel_NganhKTPM;
	private JPanel panel_NganhCNTT_TT;
	private JPanel panel_KhoaGDDT;
	private JPanel panel_KhoaKTH;
	private JPanel panel_KhoaCNTT;
	private JPanel panel_KhoaQLKD;
	private JPanel panel_QuanLiDiemThi;
	private JPanel panel_QuanLiTaiKhoan;
	private JPanel panel_ThongKe;
	private JPanel panel_TrangChu;
	private JTable table_CNTT;
	private JPanel panelA00;
	private JPanel panelA01;
	private JPanel panelA02;
	private JPanel panelA03;
	private JPanel panelA04;
	private JPanel panelA05;
	private JPanel panelA06;
	private JPanel panelA07;
	private JPanel panelA08;
	private JTable table_CNTT_TT;
	private JTextField txtMa_A00;
	private JTextField txtTen_A00;
	private JTextField txtNam_A00;
	private JTextField txtToan_A00;
	private JTextField txtLi_A00;
	private JTextField txtHoa_A00;
	private JTextField txtDUT_A00;
	private JTable table_A00;
	private JTextField txtTK_A00;
	private JTextField txtDHB_A00;
	private JButton btnA00;
	private JTable table_QLTK;
	private JTextField txt_Ma_QLTK;
	private JTextField txt_Ten_QLTK;
	private JTextField txt_User_QLTK;
	private JTextField txt_Pass_QLTK;
	private JTextField txt_TK_QLTK;
	private JTextField txt_Gmail_QLTK;
	private JTable table_TK;
	private JTextField txt_Ma_TK;
	private JTextField txt_Ten_TK;
	private JTextField txt_Nganh_TK;
	private JTextField txt_Khoi_TK;
	private JTextField txt_Tong_TK;
	private JButton btnLuu_A00;
	private JLabel lbThongBao;
	private JLabel Logo;
	private JLabel lbNHCNTT;
	private JSeparator separator_CNTT;
	private JButton btn_NCNTT;
	private AbstractButton btn_NKHMT;
	private JButton btn_NHTTT;
	private JButton btn_NKTPM;
	private JLabel lbKCNTT;
	private JLabel lbCTDT_CNTT;
	private JButton btn_XDSTT_CNTT;
	private JLabel lb_DSTS_CNTT;
	private JScrollPane scrollPane_CNTT;
	private JLabel lbCTHB_CNTT;
	private JComboBox cboCTDT_CNTT;
	private JComboBox cboCTHB_CNTT;
	private JScrollPane scrollPane_CNTT_TT;
	private JLabel lbDSTT_CNTT;
	private JButton btnQL_CNTT;
	private JButton btnXF_CNTT;
	private JLabel lbKhoiThi;
	private JSeparator separatorKT;
	private JButton btnA01;
	private JButton btnA02;
	private JButton btnA03;
	private JButton btnA04;
	private JButton btnA05;
	private JButton btnA06;
	private JButton btnA07;
	private JButton btnA08;
	private JLabel lbKhoiA00;
	private JSeparator separator_A00;
	private Container lbMaA00;
	private JLabel lbTenA00;
	private JLabel lbNamA00;
	private JLabel lbGTA00;
	private JLabel lbToanA00;
	private JLabel lbLiA00;
	private JLabel lbHoaA00;
	private JLabel lbUT_A00;
	private JComboBox cboGT_A00;
	private JSeparator separator_A00_1;
	private JButton btnLM_A00;
	private JButton btnCN_A00;
	private JButton btnXoa_A00;
	private JScrollPane scrollPane_A00;
	private JLabel lbTK_A00;
	private JButton btnTK_A00;
	private JButton btnHT_A00;
	private JLabel lbDHB_A00;
	private JLabel lblDSXT_TK;
	private JScrollPane scrollPane_TK;
	private JScrollPane scrollPane_TK_1;
	private JButton btn_SXKhoi_TK;
	private JButton btn_SXNganh_TK;
	private JButton btn_SXDiem_TK;
	private JLabel lblMTS_TK;
	private JLabel lbTen_TK;
	private JLabel lbNganhThi_TK;
	private JLabel lbKhoiThi_TK;
	private Container lbTongDiem_TK;
	private JButton btn_TaoDiem_TK;
	private JLabel lblDSTK;
	private JScrollPane scrollPane_QLTK;
	private JScrollPane scrollPaneQLTK;
	private JButton btn_TK_QLTK;
	private JLabel lblMTS_QLTK;
	private JLabel lblHVT_QLTK;
	private JLabel lblTDN_QLTK;
	private JLabel lblMK_QLTK;
	private JButton btn_Reset_QLTK;
	private JButton btn_HT_QLTK;
	private Container lbTKTT_QLTK;
	private Container lbGmail_QLTK;
	private JButton btn_XTK_QLTK;
	private JLabel lbCTDT_KHMT;
	private JButton btn_XDSTT_KHMT;
	private JSeparator separator_KHMT;
	private JLabel lb_DSTS_KHMT;
	private JTable table_KHMT;
	private JScrollPane scrollPane_KHMT;
	private JLabel lbCTHB_KHMT;
	private JComboBox cboCTDT_KHMT;
	private JComboBox cboCTHB_KHMT;
	private JPanel panel_NganhKHMT_TT;
	private JTable table_KHMT_TT;
	private JScrollPane scrollPane_KHMT_TT;
	private JLabel lbDSTT_KHMT;
	private JButton btnQL_KHMT;
	private JButton btnXF_KHMT;
	private JSeparator separator_A01;
	private JLabel lbMaA01;
	private JTextField txtMa_A01;
	private JLabel lbTenA01;
	private JLabel lbNamA01;
	private JLabel lbGTA01;
	private Container lbToanA01;
	private Container lbLiA01;
	private JLabel lbHoaA01;
	private Container lbUT_A01;
	private JTextField txtTen_A01;
	private JTextField txtNam_A01;
	private JComboBox cboGT_A01;
	private JTextField txtToan_A01;
	private JTextField txtLi_A01;
	private JTextField txtHoa_A01;
	private JTextField txtDUT_A01;
	private JSeparator separator_A01_1;
	private JButton btnLuu_A01;
	private JButton btnLM_A01;
	private JButton btnCN_A01;
	private JButton btnXoa_A01;
	private JTable table_A01;
	private JScrollPane scrollPane_A01;
	private Container lbTK_A01;
	private JTextField txtTK_A01;
	private JButton btnTK_A01;
	private JButton btnHT_A01;
	private JLabel lbDHB_A01;
	private JTextField txtDHB_A01;
	private JButton btn_CapNhat_TK;
	private JLabel lbCTDT_HTTT;
	private JButton btn_XDSTT_HTTT;
	private JSeparator separator_HTTT;
	private JLabel lb_DSTS_HTTT;
	private JTable table_HTTT;
	private JScrollPane scrollPane_HTTT;
	private JLabel lbCTHB_HTTT;
	private JComboBox cboCTDT_HTTT;
	private JComboBox cboCTHB_HTTT;
	private JPanel panel_NganhHTTT_TT;
	private JTable table_HTTT_TT;
	private JScrollPane scrollPane_HTTT_TT;
	private JLabel lbDSTT_HTTT;
	private JButton btnQL_HTTT;
	private JButton btnXF_HTTT;
	private JLabel lbCTDT_KTPM;
	private JButton btn_XDSTT_KTPM;
	private JSeparator separator_KTPM;
	private Container lb_DSTS_KTPM;
	private JTable table_KTPM;
	private JScrollPane scrollPane_KTPM;
	private JLabel lbCTHB_KTPM;
	private JComboBox cboCTDT_KTPM;
	private JComboBox cboCTHB_KTPM;
	private JPanel panel_NganhKTPM_TT;
	private JTable table_KTPM_TT;
	private JScrollPane scrollPane_KTPM_TT;
	private JLabel lbDSTT_KTPM;
	private JButton btnQL_KTPM;
	private JButton btnXF_KTPM;
	private JSeparator separator_A02;
	private JLabel lbMaA02;
	private JTextField txtMa_A02;
	private JLabel lbTenA02;
	private JLabel lbNamA02;
	private JLabel lbGTA02;
	private JLabel lbToanA02;
	private JLabel lbLiA02;
	private JLabel lbHoaA02;
	private JLabel lbUT_A02;
	private JTextField txtTen_A02;
	private JTextField txtNam_A02;
	private JComboBox cboGT_A02;
	private JTextField txtToan_A02;
	private JTextField txtLi_A02;
	private JTextField txtHoa_A02;
	private JTextField txtDUT_A02;
	private Component separator_A02_1;
	private JButton btnLuu_A02;
	private JButton btnLM_A02;
	private JButton btnCN_A02;
	private JButton btnXoa_A02;
	private JTable table_A02;
	private JScrollPane scrollPane_A02;
	private JLabel lbTK_A02;
	private JTextField txtTK_A02;
	private JButton btnTK_A02;
	private JButton btnHT_A02;
	private JLabel lbDHB_A02;
	private JTextField txtDHB_A02;
	private JSeparator separator_A03;
	private JLabel lbMaA03;
	private JTextField txtMa_A03;
	private JLabel lbTenA03;
	private JLabel lbNamA03;
	private JLabel lbGTA03;
	private JLabel lbToanA03;
	private JLabel lbLiA03;
	private JLabel lbHoaA03;
	private Container lbUT_A03;
	private JTextField txtTen_A03;
	private JTextField txtNam_A03;
	private JComboBox cboGT_A03;
	private JTextField txtToan_A03;
	private JTextField txtLi_A03;
	private JTextField txtHoa_A03;
	private JTextField txtDUT_A03;
	private JSeparator separator_A03_1;
	private AbstractButton btnLuu_A03;
	private JButton btnLM_A03;
	private AbstractButton btnCN_A03;
	private JButton btnXoa_A03;
	private JTable table_A03;
	private JScrollPane scrollPane_A03;
	private Container lbTK_A03;
	private JTextField txtTK_A03;
	private JButton btnTK_A03;
	private JButton btnHT_A03;
	private Container lbDHB_A03;
	private JTextField txtDHB_A03;
	private JSeparator separator_A04;
	private JLabel lbMaA04;
	private JTextField txtMa_A04;
	private JLabel lbTenA04;
	private JLabel lbNamA04;
	private JLabel lbGTA04;
	private Container lbToanA04;
	private JLabel lbLiA04;
	private JLabel lbHoaA04;
	private JLabel lbUT_A04;
	private JTextField txtTen_A04;
	private JTextField txtNam_A04;
	private JComboBox cboGT_A04;
	private JTextField txtToan_A04;
	private JTextField txtLi_A04;
	private JTextField txtHoa_A04;
	private JTextField txtDUT_A04;
	private JSeparator separator_A04_1;
	private AbstractButton btnLuu_A04;
	private JButton btnLM_A04;
	private JButton btnCN_A04;
	private JButton btnXoa_A04;
	private JTable table_A04;
	private JScrollPane scrollPane_A04;
	private JLabel lbTK_A04;
	private JTextField txtTK_A04;
	private JButton btnTK_A04;
	private JButton btnHT_A04;
	private JLabel lbDHB_A04;
	private JTextField txtDHB_A04;
	private JSeparator separator_A05;
	private JLabel lbMaA05;
	private JTextField txtMa_A05;
	private Container lbTenA05;
	private Container lbNamA05;
	private Container lbGTA05;
	private JLabel lbToanA05;
	private Container lbLiA05;
	private Container lbHoaA05;
	private JLabel lbUT_A05;
	private JTextField txtTen_A05;
	private JTextField txtNam_A05;
	private JComboBox cboGT_A05;
	private JTextField txtToan_A05;
	private JTextField txtLi_A05;
	private JTextField txtHoa_A05;
	private JTextField txtDUT_A05;
	private JButton btnLuu_A05;
	private JSeparator separator_A05_1;
	private JButton btnCN_A05;
	private JButton btnXoa_A05;
	private JTable table_A05;
	private JScrollPane scrollPane_A05;
	private Container lbTK_A05;
	private JTextField txtTK_A05;
	private AbstractButton btnTK_A05;
	private JButton btnHT_A05;
	private JLabel lbDHB_A05;
	private JTextField txtDHB_A05;
	private JButton btnLM_A05;
	private JSeparator separator_A06;
	private JLabel lbMaA06;
	private JTextField txtMa_A06;
	private Container lbTenA06;
	private JLabel lbNamA06;
	private JLabel lbGTA06;
	private Container lbToanA06;
	private JLabel lbLiA06;
	private Container lbHoaA06;
	private Container lbUT_A06;
	private JTextField txtTen_A06;
	private JTextField txtNam_A06;
	private JComboBox cboGT_A06;
	private JTextField txtToan_A06;
	private JTextField txtLi_A06;
	private JTextField txtHoa_A06;
	private JTextField txtDUT_A06;
	private JSeparator separator_A06_1;
	private JButton btnLuu_A06;
	private JButton btnLM_A06;
	private JButton btnCN_A06;
	private JButton btnXoa_A06;
	private JTable table_A06;
	private JScrollPane scrollPane_A06;
	private JLabel lbTK_A06;
	private JTextField txtTK_A06;
	private JButton btnTK_A06;
	private JButton btnHT_A06;
	private Container lbDHB_A06;
	private JTextField txtDHB_A06;
	private JSeparator separator_A07;
	private JLabel lbMaA07;
	private JTextField txtMa_A07;
	private JLabel lbTenA07;
	private JLabel lbNamA07;
	private JLabel lbGTA07;
	private JLabel lbToanA07;
	private JLabel lbLiA07;
	private JLabel lbHoaA07;
	private JLabel lbUT_A07;
	private JTextField txtTen_A07;
	private JTextField txtNam_A07;
	private JComboBox cboGT_A07;
	private JTextField txtToan_A07;
	private JTextField txtLi_A07;
	private JTextField txtHoa_A07;
	private JTextField txtDUT_A07;
	private JSeparator separator_A07_1;
	private AbstractButton btnLuu_A07;
	private JButton btnLM_A07;
	private JButton btnCN_A07;
	private JButton btnXoa_A07;
	private JTable table_A07;
	private JScrollPane scrollPane_A07;
	private Container lbTK_A07;
	private JTextField txtTK_A07;
	private JButton btnTK_A07;
	private JButton btnHT_A07;
	private JLabel lbDHB_A07;
	private JTextField txtDHB_A07;
	private JSeparator separator_A08;
	private JLabel lbMaA08;
	private JTextField txtMa_A08;
	private JLabel lbTenA08;
	private Container lbNamA08;
	private JLabel lbGTA08;
	private JLabel lbToanA08;
	private JLabel lbLiA08;
	private JLabel lbHoaA08;
	private JLabel lbUT_A08;
	private JTextField txtTen_A08;
	private JTextField txtNam_A08;
	private JComboBox cboGT_A08;
	private JTextField txtToan_A08;
	private JTextField txtLi_A08;
	private JTextField txtHoa_A08;
	private JTextField txtDUT_A08;
	private JSeparator separator_A08_1;
	private AbstractButton btnLuu_A08;
	private JButton btnLM_A08;
	private JButton btnCN_A08;
	private JButton btnXoa_A08;
	private JTable table_A08;
	private JScrollPane scrollPane_A08;
	private Container lbTK_A08;
	private JTextField txtTK_A08;
	private AbstractButton btnTK_A08;
	private JButton btnHT_A08;
	private JLabel lbDHB_A08;
	private JTextField txtDHB_A08;
	private JLabel lbKhoiA01;
	private JLabel lbKhoiA02;
	private JLabel lbKhoiA03;
	private JLabel lbKhoiA04;
	private JLabel lbKhoiA05;
	private JLabel lbKhoiA06;
	private JLabel lbKhoiA07;
	private JLabel lbKhoiA08;
	private JLabel lbNHGDDT;
	private JSeparator separator_GDDT;
	private JLabel lbKGDDT;
	private JButton btn_NQLGD;
	private JButton btn_NGDNL;
	private JButton btn_NGDTE;
	private JButton btn_NHSP;
	private JPanel panel_NganhHSP;
	private JLabel lbCTDT_HSP;
	private JButton btn_XDSTT_HSP;
	private JSeparator separator_HSP;
	private Container lb_DSTS_HSP;
	private JTable table_HSP;
	private JScrollPane scrollPane_HSP;
	private JLabel lbCTHB_HSP;
	private JComboBox cboCTDT_HSP;
	private JComboBox cboCTHB_HSP;
	private JPanel panel_NganhHSP_TT;
	private JTable table_HSP_TT;
	private JScrollPane scrollPane_HSP_TT;
	private JLabel lbDSTT_HSP;
	private JButton btnQL_HSP;
	private JButton btnXF_HSP;
	private JPanel panel_NganhGDTE;
	private JLabel lbCTDT_GDTE;
	private JButton btn_XDSTT_GDTE;
	private JSeparator separator_GDTE;
	private JLabel lb_DSTS_GDTE;
	private JTable table_GDTE;
	private JScrollPane scrollPane_GDTE;
	private Container lbCTHB_GDTE;
	private JComboBox cboCTDT_GDTE;
	private JComboBox cboCTHB_GDTE;
	private JPanel panel_NganhGDTE_TT;
	private JTable table_GDTE_TT;
	private JScrollPane scrollPane_GDTE_TT;
	private JLabel lbDSTT_GDTE;
	private JButton btnQL_GDTE;
	private JButton btnXF_GDTE;
	private JPanel panel_NganhGDNL;
	private JLabel lbCTDT_GDNL;
	private JButton btn_XDSTT_GDNL;
	private JSeparator separator_GDNL;
	private JLabel lb_DSTS_GDNL;
	private JTable table_GDNL;
	private JScrollPane scrollPane_GDNL;
	private JLabel lbCTHB_GDNL;
	private JComboBox cboCTDT_GDNL;
	private JComboBox cboCTHB_GDNL;
	private JPanel panel_NganhGDNL_TT;
	private JTable table_GDNL_TT;
	private JScrollPane scrollPane_GDNL_TT;
	private Container lbDSTT_GDNL;
	private JButton btnQL_GDNL;
	private AbstractButton btnXF_GDNL;
	private JPanel panel_NganhQLGD;
	private JLabel lbCTDT_QLGD;
	private JButton btn_XDSTT_QLGD;
	private JSeparator separator_QLGD;
	private JLabel lb_DSTS_QLGD;
	private JTable table_QLGD;
	private JScrollPane scrollPane_QLGD;
	private Container lbCTHB_QLGD;
	private JComboBox cboCTDT_QLGD;
	private JComboBox cboCTHB_QLGD;
	private JPanel panel_NganhQLGD_TT;
	private JTable table_QLGD_TT;
	private JScrollPane scrollPane_QLGD_TT;
	private Container lbDSTT_QLGD;
	private JButton btnQL_QLGD;
	private JButton btnXF_QLGD;
	private JLabel lbNHKTH;
	private JSeparator separator_KTH;
	private JButton btn_NKTCK;
	private JButton btn_NKTOT;
	private AbstractButton btn_NKHHH;
	private AbstractButton btn_NCDT;
	private JLabel lbKKTH;
	private JLabel lbKQLKD;
	private JLabel lbNHQLKD;
	private JSeparator separator_QLKD;
	private JButton btn_NTMDT;
	private JButton btn_NKT;
	private JButton btn_NQLCL;
	private JButton btn_NMKT;
	private JPanel panel_NganhKTCK;
	private JLabel lbCTDT_KTCK;
	private JButton btn_XDSTT_KTCK;
	private JSeparator separator_KTCK;
	private JLabel lb_DSTS_KTCK;
	private JTable table_KTCK;
	private JScrollPane scrollPane_KTCK;
	private JLabel lbCTHB_KTCK;
	private JComboBox cboCTDT_KTCK;
	private JComboBox cboCTHB_KTCK;
	private JPanel panel_NganhKTCK_TT;
	private JTable table_KTCK_TT;
	private JScrollPane scrollPane_KTCK_TT;
	private Container lbDSTT_KTCK;
	private JButton btnQL_KTCK;
	private JButton btnXF_KTCK;
	private JPanel panel_NganhKTOT;
	private JLabel lbCTDT_KTOT;
	private JButton btn_XDSTT_KTOT;
	private JSeparator separator_KTOT;
	private Container lb_DSTS_KTOT;
	private JTable table_KTOT;
	private JScrollPane scrollPane_KTOT;
	private JLabel lbCTHB_KTOT;
	private JComboBox cboCTDT_KTOT;
	private JComboBox cboCTHB_KTOT;
	private JPanel panel_NganhKTOT_TT;
	private JTable table_KTOT_TT;
	private JScrollPane scrollPane_KTOT_TT;
	private JLabel lbDSTT_KTOT;
	private JButton btnQL_KTOT;
	private JButton btnXF_KTOT;
	private JPanel panel_NganhKHHH;
	private JLabel lbCTDT_KHHH;
	private JButton btn_XDSTT_KHHH;
	private JSeparator separator_KHHH;
	private JLabel lb_DSTS_KHHH;
	private JTable table_KHHH;
	private JScrollPane scrollPane_KHHH;
	private Container lbCTHB_KHHH;
	private JComboBox cboCTDT_KHHH;
	private JComboBox cboCTHB_KHHH;
	private JPanel panel_NganhKHHH_TT;
	private JTable table_KHHH_TT;
	private JScrollPane scrollPane_KHHH_TT;
	private JLabel lbDSTT_KHHH;
	private JButton btnQL_KHHH;
	private JButton btnXF_KHHH;
	private JPanel panel_NganhCDT;
	private JLabel lbCTDT_CDT;
	private JButton btn_XDSTT_CDT;
	private JSeparator separator_CDT;
	private JLabel lb_DSTS_CDT;
	private JTable table_CDT;
	private JScrollPane scrollPane_CDT;
	private JLabel lbCTHB_CDT;
	private JComboBox cboCTDT_CDT;
	private JComboBox cboCTHB_CDT;
	private JPanel panel_NganhCDT_TT;
	private JTable table_CDT_TT;
	private JScrollPane scrollPane_CDT_TT;
	private JLabel lbDSTT_CDT;
	private JButton btnQL_CDT;
	private JButton btnXF_CDT;
	private JPanel panel_NganhTMDT;
	private JLabel lbCTDT_TMDT;
	private JButton btn_XDSTT_TMDT;
	private JSeparator separator_TMDT;
	private JLabel lb_DSTS_TMDT;
	private JTable table_TMDT;
	private JScrollPane scrollPane_TMDT;
	private JLabel lbCTHB_TMDT;
	private JComboBox cboCTDT_TMDT;
	private JComboBox cboCTHB_TMDT;
	private JPanel panel_NganhTMDT_TT;
	private JTable table_TMDT_TT;
	private JScrollPane scrollPane_TMDT_TT;
	private JLabel lbDSTT_TMDT;
	private JButton btnQL_TMDT;
	private JButton btnXF_TMDT;
	private JPanel panel_NganhKT;
	private JLabel lbCTDT_KT;
	private JButton btn_XDSTT_KT;
	private JSeparator separator_KT;
	private JLabel lb_DSTS_KT;
	private JTable table_KT;
	private JScrollPane scrollPane_KT;
	private JLabel lbCTHB_KT;
	private JComboBox cboCTDT_KT;
	private JComboBox cboCTHB_KT;
	private JPanel panel_NganhKT_TT;
	private JTable table_KT_TT;
	private JScrollPane scrollPane_KT_TT;
	private JLabel lbDSTT_KT;
	private JButton btnQL_KT;
	private JButton btnXF_KT;
	private JPanel panel_NganhQLCL;
	private JLabel lbCTDT_QLCL;
	private JButton btn_XDSTT_QLCL;
	private JSeparator separator_QLCL;
	private JLabel lb_DSTS_QLCL;
	private JTable table_QLCL;
	private JScrollPane scrollPane_QLCL;
	private JLabel lbCTHB_QLCL;
	private JComboBox cboCTDT_QLCL;
	private JComboBox cboCTHB_QLCL;
	private JPanel panel_NganhQLCL_TT;
	private JTable table_QLCL_TT;
	private JScrollPane scrollPane_QLCL_TT;
	private JLabel lbDSTT_QLCL;
	private JButton btnQL_QLCL;
	private JButton btnXF_QLCL;
	private JPanel panel_NganhMKT;
	private JLabel lbCTDT_MKT;
	private JButton btn_XDSTT_MKT;
	private JSeparator separator_MKT;
	private Container lb_DSTS_MKT;
	private JTable table_MKT;
	private JScrollPane scrollPane_MKT;
	private Container lbCTHB_MKT;
	private JComboBox cboCTDT_MKT;
	private JComboBox cboCTHB_MKT;
	private JPanel panel_NganhMKT_TT;
	private JTable table_MKT_TT;
	private JScrollPane scrollPane_MKT_TT;
	private JLabel lbDSTT_MKT;
	private JButton btnQL_MKT;
	private JButton btnXF_MKT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeAdmin frame = new HomeAdmin();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomeAdmin() {
		setTitle("TRANG CHỦ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1448, 768);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuHT = new JMenu("Hệ thống");
		menuHT.setForeground(Color.BLACK);
		menuHT.setFont(new Font("Tahoma", Font.BOLD, 14));
		menuBar.add(menuHT);

		JMenu menuTG = new JMenu("Trợ giúp");
		menuTG.setForeground(Color.BLACK);
		menuTG.setFont(new Font("Tahoma", Font.BOLD, 14));
		menuBar.add(menuTG);

		JMenu menuGT = new JMenu("Giới thiệu");
		menuGT.setForeground(Color.BLACK);
		menuGT.setFont(new Font("Tahoma", Font.BOLD, 14));
		menuBar.add(menuGT);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// menu trang chủ
		panel_TrangChu = new JPanel();
		panel_TrangChu.setBackground(SystemColor.control);
		panel_TrangChu.setBounds(0, 35, 1440, 673);
		contentPane.add(panel_TrangChu);
		panel_TrangChu.setLayout(null);

		lbThongBao = new JLabel("THÔNG BÁO TỪ BAN TUYỂN SINH TRƯỜNG ĐẠI HỌC VIỆT Á");
		lbThongBao.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbThongBao.setBounds(345, 21, 734, 42);
		panel_TrangChu.add(lbThongBao);

		Logo = new JLabel("");
		Image img_Logo = new ImageIcon(this.getClass().getResource("/image/logo.jpg")).getImage();
		Logo.setIcon(new ImageIcon(img_Logo));
		Logo.setBounds(1170, 73, 242, 240);
		panel_TrangChu.add(Logo);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textArea.setBounds(52, 73, 1360, 558);
		textArea.setText(
				"1.1 Đối tượng tuyển sinh\r\n\r\nLà những thí sinh đã tốt nghiệp Trung học phổ thông hoặc tương đương.\r\n\r\n1.2 Phạm vi tuyển sinh\r\n\r\nTuyển sinh trên toàn quốc.\r\n\r\n1.3 Phương thức tuyển sinh\r\n\r\nNăm 2023, Trường Đại học Việt Á tuyển sinh 3600 chỉ tiêu trình độ Đại học chính quy với 47 chuyên ngành đào tạo theo 03 phương thức xét tuyển độc lập:\r\n\r\n- Phương thức 1 (PT1): Xét tuyển dựa trên kết quả Kỳ thi tốt nghiệp Trung học phổ thông năm 2022. Áp dụng cho toàn bộ các chuyên ngành.\r\n\r\n- Phương thức 2 (PT2): Xét tuyển thẳng theo đề án riêng của Trường Đại học Việt Á (Xét tuyển kết hợp) áp dụng cho toàn bộ các chuyên ngành đối với những thí sinh có tổng điểm các môn thi\n\n tốt nghiệp THPT năm 2022 trong tổ hợp môn xét tuyển đạt ngưỡng chất lượng đầu vào theo Quy định của Nhà trường và đáp ứng một trong các tiêu chí sau:\r\n\r\nTiêu chí 1: Có chứng chỉ Tiếng Anh quốc tế IELTS 5.0 hoặc TOEFL 494 ITP hoặc TOEFL 58 iBT hoặc Toeic (L&R) 595 trở lên trong thời hạn (tính đến ngày 30/08/2022).\r\n\r\nTiêu chí 2:  Đạt các giải Nhất, Nhì, Ba các môn thi Toán học, Vật lý, Hóa học, Sinh học, Ngữ văn, Lịch sử, Địa lý, Tin học và Ngoại ngữ trong kỳ thi chọn học sinh giỏi cấp Tỉnh, Thành phố trở lên.\r\n\r\nTiêu chí 3:  Học 03 năm THPT tại các lớp Chuyên: Toán học, Vật Lý, Hóa học, Sinh học, Ngữ văn, Tiếng Anh, Tin học, Khoa học tự nhiên thuộc các trường Chuyên cấp Tỉnh/Thành phố. Có học lực\n\n Khá trở lên và hạnh kiểm Tốt các năm lớp 10, 11, 12.\r\n\r\n- Phương thức 3 (PT3): Xét tuyển dựa trên kết quả học tập và rèn luyện trung học phổ thông (xét Học bạ) với 30% chỉ tiêu. Áp dụng 28 chuyên ngành thuộc nhóm Kỹ thuật & Công nghệ,\n\n 02 chuyên ngành thuộc nhóm Chất lượng cao (Công nghệ thông tin và Điện tự động công nghiệp).");
		panel_TrangChu.add(textArea);

		JLabel lblNewLabel = new JLabel(
				"Địa chỉ: Số 128, đường Hoàng Quốc Việt, quân Cầu Giấy, Hà Nội          Holine: 1900 8569");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(881, 641, 531, 22);
		panel_TrangChu.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Trường Đại Học Việt Á");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(52, 641, 531, 22);
		panel_TrangChu.add(lblNewLabel_1);

		// Khoa công nghệ thông tin
		panel_KhoaCNTT = new JPanel();
		panel_KhoaCNTT.setBackground(SystemColor.control);
		panel_KhoaCNTT.setBounds(0, 35, 1440, 673);
		contentPane.add(panel_KhoaCNTT);
		panel_KhoaCNTT.setLayout(null);

		lbNHCNTT = new JLabel("Ngành học");
		lbNHCNTT.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbNHCNTT.setBounds(71, 45, 86, 32);
		panel_KhoaCNTT.add(lbNHCNTT);

		separator_CNTT = new JSeparator();
		separator_CNTT.setBounds(0, 35, 1402, 2);
		panel_KhoaCNTT.add(separator_CNTT);

		btn_NCNTT = new JButton("Công nghệ thông tin");
		btn_NCNTT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaCNTT.remove(panel_NganhKTPM_TT);
				panel_KhoaCNTT.remove(panel_NganhHTTT_TT);
				panel_KhoaCNTT.remove(panel_NganhKHMT_TT);
				panel_KhoaCNTT.remove(panel_NganhCNTT_TT);
				panel_KhoaCNTT.remove(panel_NganhKHMT);
				panel_KhoaCNTT.remove(panel_NganhHTTT);
				panel_KhoaCNTT.remove(panel_NganhKTPM);
				panel_KhoaCNTT.add(panel_NganhCNTT);
				panel_KhoaCNTT.revalidate();
				panel_KhoaCNTT.repaint();
				showData_CNTT(connect_thiSinh.findAll_CNTT());
			}
		});
		btn_NCNTT.setBackground(SystemColor.info);
		btn_NCNTT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_NCNTT.setBounds(0, 84, 234, 36);
		panel_KhoaCNTT.add(btn_NCNTT);

		btn_NKHMT = new JButton("Khoa học máy tính");
		btn_NKHMT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaCNTT.remove(panel_NganhKTPM_TT);
				panel_KhoaCNTT.remove(panel_NganhHTTT_TT);
				panel_KhoaCNTT.remove(panel_NganhKHMT_TT);
				panel_KhoaCNTT.remove(panel_NganhCNTT_TT);
				panel_KhoaCNTT.remove(panel_NganhCNTT);
				panel_KhoaCNTT.remove(panel_NganhHTTT);
				panel_KhoaCNTT.remove(panel_NganhKTPM);
				panel_KhoaCNTT.add(panel_NganhKHMT);
				panel_KhoaCNTT.revalidate();
				panel_KhoaCNTT.repaint();
				showData_KHMT(connect_thiSinh.findAll_KHMT());
			}
		});
		btn_NKHMT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_NKHMT.setBackground(SystemColor.info);
		btn_NKHMT.setBounds(0, 118, 234, 36);
		panel_KhoaCNTT.add(btn_NKHMT);

		btn_NHTTT = new JButton("Hệ thống thông tin");
		btn_NHTTT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaCNTT.remove(panel_NganhKTPM_TT);
				panel_KhoaCNTT.remove(panel_NganhHTTT_TT);
				panel_KhoaCNTT.remove(panel_NganhKHMT_TT);
				panel_KhoaCNTT.remove(panel_NganhCNTT_TT);
				panel_KhoaCNTT.remove(panel_NganhKHMT);
				panel_KhoaCNTT.remove(panel_NganhCNTT);
				panel_KhoaCNTT.remove(panel_NganhKTPM);
				panel_KhoaCNTT.add(panel_NganhHTTT);
				panel_KhoaCNTT.revalidate();
				panel_KhoaCNTT.repaint();
				showData_HTTT(connect_thiSinh.findAll_HTTT());
			}
		});
		btn_NHTTT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_NHTTT.setBackground(SystemColor.info);
		btn_NHTTT.setBounds(0, 152, 234, 36);
		panel_KhoaCNTT.add(btn_NHTTT);

		btn_NKTPM = new JButton("Kỹ thuật phần mềm");
		btn_NKTPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaCNTT.remove(panel_NganhKTPM_TT);
				panel_KhoaCNTT.remove(panel_NganhHTTT_TT);
				panel_KhoaCNTT.remove(panel_NganhKHMT_TT);
				panel_KhoaCNTT.remove(panel_NganhCNTT_TT);
				panel_KhoaCNTT.remove(panel_NganhKHMT);
				panel_KhoaCNTT.remove(panel_NganhHTTT);
				panel_KhoaCNTT.remove(panel_NganhCNTT);
				panel_KhoaCNTT.add(panel_NganhKTPM);
				panel_KhoaCNTT.revalidate();
				panel_KhoaCNTT.repaint();
				showData_KTPM(connect_thiSinh.findAll_KTPM());
			}
		});
		btn_NKTPM.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_NKTPM.setBackground(SystemColor.info);
		btn_NKTPM.setBounds(0, 186, 234, 36);
		panel_KhoaCNTT.add(btn_NKTPM);

		lbKCNTT = new JLabel("KHOA CÔNG NGHỆ THÔNG TIN");
		lbKCNTT.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbKCNTT.setBounds(645, 1, 270, 32);
		panel_KhoaCNTT.add(lbKCNTT);

		// khoa công nghệ thông tin - ngành công nghệ thông tin
		panel_NganhCNTT = new JPanel();
		panel_NganhCNTT.setBackground(Color.WHITE);
		panel_NganhCNTT.setBounds(234, 35, 1171, 610);
		panel_KhoaCNTT.add(panel_NganhCNTT);
		panel_NganhCNTT.setLayout(null);

		lbCTDT_CNTT = new JLabel("Chỉ tiêu điểm thi");
		lbCTDT_CNTT.setBounds(514, 8, 129, 32);
		panel_NganhCNTT.add(lbCTDT_CNTT);
		lbCTDT_CNTT.setFont(new Font("Tahoma", Font.BOLD, 14));

		btn_XDSTT_CNTT = new JButton("Xuất danh sách trúng tuyển");
		btn_XDSTT_CNTT.setBounds(952, 6, 207, 32);
		panel_NganhCNTT.add(btn_XDSTT_CNTT);
		btn_XDSTT_CNTT.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_CNTT.getSelectedItem();
				value2 = (String) cboCTHB_CNTT.getSelectedItem();
				panel_KhoaCNTT.remove(panel_NganhKTPM_TT);
				panel_KhoaCNTT.remove(panel_NganhHTTT_TT);
				panel_KhoaCNTT.remove(panel_NganhCNTT);
				panel_KhoaCNTT.remove(panel_NganhKHMT);
				panel_KhoaCNTT.remove(panel_NganhKHMT_TT);
				panel_KhoaCNTT.remove(panel_NganhHTTT);
				panel_KhoaCNTT.remove(panel_NganhKTPM);
				panel_KhoaCNTT.add(panel_NganhCNTT_TT);
				panel_KhoaCNTT.revalidate();
				panel_KhoaCNTT.repaint();
				showData_CNTT_TT(connect_thiSinh.TrungTuyen_CNTT(Integer.parseInt(value1), Integer.parseInt(value2)));
			}
		});
		btn_XDSTT_CNTT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_XDSTT_CNTT.setBackground(SystemColor.info);

		separator_CNTT = new JSeparator();
		separator_CNTT.setBounds(0, 49, 1182, 2);
		panel_NganhCNTT.add(separator_CNTT);

		lb_DSTS_CNTT = new JLabel("DANH SÁCH THÍ SINH");
		lb_DSTS_CNTT.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb_DSTS_CNTT.setBounds(458, 55, 207, 32);
		panel_NganhCNTT.add(lb_DSTS_CNTT);

		class STTCellRenderer extends DefaultTableCellRenderer {
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {
				super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
				setText(String.valueOf(row + 1));
				return this;
			}
		}

		table_CNTT = new JTable();
		table_CNTT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_CNTT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1" }));
		table_CNTT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_CNTT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_CNTT.getColumnModel().getColumn(2).setMinWidth(33);
		table_CNTT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_CNTT.getColumnModel().getColumn(4).setMinWidth(29);
		table_CNTT.getColumnModel().getColumn(5).setPreferredWidth(59);

		scrollPane_CNTT = new JScrollPane(table_CNTT);
		scrollPane_CNTT.setBounds(51, 104, 1041, 477);
		panel_NganhCNTT.add(scrollPane_CNTT);

		lbCTHB_CNTT = new JLabel("Chỉ tiêu học bạ");
		lbCTHB_CNTT.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbCTHB_CNTT.setBounds(730, 8, 129, 32);
		panel_NganhCNTT.add(lbCTHB_CNTT);

		cboCTDT_CNTT = new JComboBox();
		cboCTDT_CNTT
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTDT_CNTT.setBounds(641, 14, 49, 21);
		panel_NganhCNTT.add(cboCTDT_CNTT);

		cboCTHB_CNTT = new JComboBox();
		cboCTHB_CNTT
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTHB_CNTT.setBounds(849, 14, 49, 21);
		panel_NganhCNTT.add(cboCTHB_CNTT);

		// khoa công nghệ thông tin - trúng tuyển ngành công nghệ thông tin
		panel_NganhCNTT_TT = new JPanel();
		panel_NganhCNTT_TT.setBackground(Color.WHITE);
		panel_NganhCNTT_TT.setBounds(234, 35, 1171, 610);
		panel_KhoaCNTT.add(panel_NganhCNTT_TT);

		table_CNTT_TT = new JTable();
		table_CNTT_TT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_CNTT_TT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null } },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1", "STT" }));
		table_CNTT_TT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_CNTT_TT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_CNTT_TT.getColumnModel().getColumn(2).setMinWidth(33);
		table_CNTT_TT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_CNTT_TT.getColumnModel().getColumn(4).setMinWidth(29);
		table_CNTT_TT.getColumnModel().getColumn(5).setPreferredWidth(59);
		table_CNTT_TT.getColumnModel().getColumn(6).setCellRenderer(new STTCellRenderer());
		panel_NganhCNTT_TT.setLayout(null);

		scrollPane_CNTT_TT = new JScrollPane(table_CNTT_TT);
		scrollPane_CNTT_TT.setBounds(85, 77, 996, 448);
		panel_NganhCNTT_TT.add(scrollPane_CNTT_TT);

		lbDSTT_CNTT = new JLabel("DANH SÁCH THÍ SINH TRÚNG TUYỂN");
		lbDSTT_CNTT.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbDSTT_CNTT.setBounds(382, 10, 363, 34);
		panel_NganhCNTT_TT.add(lbDSTT_CNTT);

		btnQL_CNTT = new JButton("Quay lại");
		btnQL_CNTT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQL_CNTT.setBounds(985, 550, 91, 25);
		btnQL_CNTT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaCNTT.remove(panel_NganhKTPM_TT);
				panel_KhoaCNTT.remove(panel_NganhHTTT_TT);
				panel_KhoaCNTT.remove(panel_NganhKHMT_TT);
				panel_KhoaCNTT.remove(panel_NganhCNTT_TT);
				panel_KhoaCNTT.remove(panel_NganhKHMT);
				panel_KhoaCNTT.remove(panel_NganhHTTT);
				panel_KhoaCNTT.remove(panel_NganhKTPM);
				panel_KhoaCNTT.add(panel_NganhCNTT);
				panel_KhoaCNTT.revalidate();
				panel_KhoaCNTT.repaint();
			}
		});
		panel_NganhCNTT_TT.add(btnQL_CNTT);

		btnXF_CNTT = new JButton("Xuất file");
		btnXF_CNTT.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_CNTT.getSelectedItem();
				value2 = (String) cboCTHB_CNTT.getSelectedItem();
				try {
					JOptionPane.showMessageDialog(null, "Xuất file thành công!");
					connect_thiSinh.XuatFile_CNTT(Integer.parseInt(value1), Integer.parseInt(value2));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnXF_CNTT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXF_CNTT.setBounds(873, 550, 91, 25);
		panel_NganhCNTT_TT.add(btnXF_CNTT);

		// khoa công nghệ thông tin - ngành khoa học máy tính
		panel_NganhKHMT = new JPanel();
		panel_NganhKHMT.setBackground(Color.WHITE);
		panel_NganhKHMT.setBounds(234, 35, 1171, 610);
		panel_KhoaCNTT.add(panel_NganhKHMT);
		panel_NganhKHMT.setLayout(null);

		lbCTDT_KHMT = new JLabel("Chỉ tiêu điểm thi");
		lbCTDT_KHMT.setBounds(514, 8, 129, 32);
		panel_NganhKHMT.add(lbCTDT_KHMT);
		lbCTDT_KHMT.setFont(new Font("Tahoma", Font.BOLD, 14));

		btn_XDSTT_KHMT = new JButton("Xuất danh sách trúng tuyển");
		btn_XDSTT_KHMT.setBounds(952, 6, 207, 32);
		panel_NganhKHMT.add(btn_XDSTT_KHMT);
		btn_XDSTT_KHMT.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_KHMT.getSelectedItem();
				value2 = (String) cboCTHB_KHMT.getSelectedItem();
				panel_KhoaCNTT.remove(panel_NganhKTPM_TT);
				panel_KhoaCNTT.remove(panel_NganhHTTT_TT);
				panel_KhoaCNTT.remove(panel_NganhCNTT);
				panel_KhoaCNTT.remove(panel_NganhCNTT_TT);
				panel_KhoaCNTT.remove(panel_NganhKHMT);
				panel_KhoaCNTT.remove(panel_NganhHTTT);
				panel_KhoaCNTT.remove(panel_NganhKTPM);
				panel_KhoaCNTT.add(panel_NganhKHMT_TT);
				panel_KhoaCNTT.revalidate();
				panel_KhoaCNTT.repaint();
				showData_KHMT_TT(connect_thiSinh.TrungTuyen_KHMT(Integer.parseInt(value1), Integer.parseInt(value2)));
			}
		});
		btn_XDSTT_KHMT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_XDSTT_KHMT.setBackground(SystemColor.info);

		separator_KHMT = new JSeparator();
		separator_KHMT.setBounds(0, 49, 1182, 2);
		panel_NganhKHMT.add(separator_KHMT);

		lb_DSTS_KHMT = new JLabel("DANH SÁCH THÍ SINH");
		lb_DSTS_KHMT.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb_DSTS_KHMT.setBounds(458, 55, 207, 32);
		panel_NganhKHMT.add(lb_DSTS_KHMT);

		table_KHMT = new JTable();
		table_KHMT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_KHMT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1" }));
		table_KHMT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_KHMT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_KHMT.getColumnModel().getColumn(2).setMinWidth(33);
		table_KHMT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_KHMT.getColumnModel().getColumn(4).setMinWidth(29);
		table_KHMT.getColumnModel().getColumn(5).setPreferredWidth(59);

		scrollPane_KHMT = new JScrollPane(table_KHMT);
		scrollPane_KHMT.setBounds(51, 104, 1041, 477);
		panel_NganhKHMT.add(scrollPane_KHMT);

		lbCTHB_KHMT = new JLabel("Chỉ tiêu học bạ");
		lbCTHB_KHMT.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbCTHB_KHMT.setBounds(730, 8, 129, 32);
		panel_NganhKHMT.add(lbCTHB_KHMT);

		cboCTDT_KHMT = new JComboBox();
		cboCTDT_KHMT
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTDT_KHMT.setBounds(641, 14, 49, 21);
		panel_NganhKHMT.add(cboCTDT_KHMT);

		cboCTHB_KHMT = new JComboBox();
		cboCTHB_KHMT
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTHB_KHMT.setBounds(849, 14, 49, 21);
		panel_NganhKHMT.add(cboCTHB_KHMT);

		// khoa công nghệ thông tin - trúng tuyển ngành khoa học máy tính
		panel_NganhKHMT_TT = new JPanel();
		panel_NganhKHMT_TT.setBackground(Color.WHITE);
		panel_NganhKHMT_TT.setBounds(234, 35, 1171, 610);
		panel_KhoaCNTT.add(panel_NganhKHMT_TT);

		table_KHMT_TT = new JTable();
		table_KHMT_TT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_KHMT_TT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null } },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1", "STT" }));
		table_KHMT_TT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_KHMT_TT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_KHMT_TT.getColumnModel().getColumn(2).setMinWidth(33);
		table_KHMT_TT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_KHMT_TT.getColumnModel().getColumn(4).setMinWidth(29);
		table_KHMT_TT.getColumnModel().getColumn(5).setPreferredWidth(59);
		table_KHMT_TT.getColumnModel().getColumn(6).setCellRenderer(new STTCellRenderer());
		panel_NganhKHMT_TT.setLayout(null);

		scrollPane_KHMT_TT = new JScrollPane(table_KHMT_TT);
		scrollPane_KHMT_TT.setBounds(85, 77, 996, 448);
		panel_NganhKHMT_TT.add(scrollPane_KHMT_TT);

		lbDSTT_KHMT = new JLabel("DANH SÁCH THÍ SINH TRÚNG TUYỂN");
		lbDSTT_KHMT.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbDSTT_KHMT.setBounds(382, 10, 363, 34);
		panel_NganhKHMT_TT.add(lbDSTT_KHMT);

		btnQL_KHMT = new JButton("Quay lại");
		btnQL_KHMT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQL_KHMT.setBounds(985, 550, 91, 25);
		btnQL_KHMT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaCNTT.remove(panel_NganhKTPM_TT);
				panel_KhoaCNTT.remove(panel_NganhHTTT_TT);
				panel_KhoaCNTT.remove(panel_NganhKHMT_TT);
				panel_KhoaCNTT.remove(panel_NganhCNTT_TT);
				panel_KhoaCNTT.remove(panel_NganhCNTT);
				panel_KhoaCNTT.remove(panel_NganhHTTT);
				panel_KhoaCNTT.remove(panel_NganhKTPM);
				panel_KhoaCNTT.add(panel_NganhKHMT);
				panel_KhoaCNTT.revalidate();
				panel_KhoaCNTT.repaint();
			}
		});
		panel_NganhKHMT_TT.add(btnQL_KHMT);

		btnXF_KHMT = new JButton("Xuất file");
		btnXF_KHMT.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_KHMT.getSelectedItem();
				value2 = (String) cboCTHB_KHMT.getSelectedItem();
				try {
					JOptionPane.showMessageDialog(null, "Xuất file thành công!");
					connect_thiSinh.XuatFile_KHMT(Integer.parseInt(value1), Integer.parseInt(value2));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnXF_KHMT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXF_KHMT.setBounds(873, 550, 91, 25);
		panel_NganhKHMT_TT.add(btnXF_KHMT);

		// khoa công nghệ thông tin - ngành hệ thống thông tin
		panel_NganhHTTT = new JPanel();
		panel_NganhHTTT.setBackground(Color.WHITE);
		panel_NganhHTTT.setBounds(234, 35, 1171, 610);
		panel_KhoaCNTT.add(panel_NganhHTTT);
		panel_NganhHTTT.setLayout(null);

		lbCTDT_HTTT = new JLabel("Chỉ tiêu điểm thi");
		lbCTDT_HTTT.setBounds(514, 8, 129, 32);
		panel_NganhHTTT.add(lbCTDT_HTTT);
		lbCTDT_HTTT.setFont(new Font("Tahoma", Font.BOLD, 14));

		btn_XDSTT_HTTT = new JButton("Xuất danh sách trúng tuyển");
		btn_XDSTT_HTTT.setBounds(952, 6, 207, 32);
		panel_NganhHTTT.add(btn_XDSTT_HTTT);
		btn_XDSTT_HTTT.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_HTTT.getSelectedItem();
				value2 = (String) cboCTHB_HTTT.getSelectedItem();
				panel_KhoaCNTT.remove(panel_NganhKTPM_TT);
				panel_KhoaCNTT.remove(panel_NganhCNTT);
				panel_KhoaCNTT.remove(panel_NganhKHMT);
				panel_KhoaCNTT.remove(panel_NganhKHMT_TT);
				panel_KhoaCNTT.remove(panel_NganhHTTT);
				panel_KhoaCNTT.remove(panel_NganhCNTT_TT);
				panel_KhoaCNTT.remove(panel_NganhKTPM);
				panel_KhoaCNTT.add(panel_NganhHTTT_TT);
				panel_KhoaCNTT.revalidate();
				panel_KhoaCNTT.repaint();
				showData_HTTT_TT(connect_thiSinh.TrungTuyen_HTTT(Integer.parseInt(value1), Integer.parseInt(value2)));
			}
		});
		btn_XDSTT_HTTT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_XDSTT_HTTT.setBackground(SystemColor.info);

		separator_HTTT = new JSeparator();
		separator_HTTT.setBounds(0, 49, 1182, 2);
		panel_NganhHTTT.add(separator_HTTT);

		lb_DSTS_HTTT = new JLabel("DANH SÁCH THÍ SINH");
		lb_DSTS_HTTT.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb_DSTS_HTTT.setBounds(458, 55, 207, 32);
		panel_NganhHTTT.add(lb_DSTS_HTTT);

		table_HTTT = new JTable();
		table_HTTT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_HTTT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1" }));
		table_HTTT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_HTTT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_HTTT.getColumnModel().getColumn(2).setMinWidth(33);
		table_HTTT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_HTTT.getColumnModel().getColumn(4).setMinWidth(29);
		table_HTTT.getColumnModel().getColumn(5).setPreferredWidth(59);

		scrollPane_HTTT = new JScrollPane(table_HTTT);
		scrollPane_HTTT.setBounds(51, 104, 1041, 477);
		panel_NganhHTTT.add(scrollPane_HTTT);

		lbCTHB_HTTT = new JLabel("Chỉ tiêu học bạ");
		lbCTHB_HTTT.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbCTHB_HTTT.setBounds(730, 8, 129, 32);
		panel_NganhHTTT.add(lbCTHB_HTTT);

		cboCTDT_HTTT = new JComboBox();
		cboCTDT_HTTT
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTDT_HTTT.setBounds(641, 14, 49, 21);
		panel_NganhHTTT.add(cboCTDT_HTTT);

		cboCTHB_HTTT = new JComboBox();
		cboCTHB_HTTT
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTHB_HTTT.setBounds(849, 14, 49, 21);
		panel_NganhHTTT.add(cboCTHB_HTTT);

		// khoa công nghệ thông tin - trúng tuyển ngành hệ thống thông tin
		panel_NganhHTTT_TT = new JPanel();
		panel_NganhHTTT_TT.setBackground(Color.WHITE);
		panel_NganhHTTT_TT.setBounds(234, 35, 1171, 610);
		panel_KhoaCNTT.add(panel_NganhHTTT_TT);

		table_HTTT_TT = new JTable();
		table_HTTT_TT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_HTTT_TT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null } },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1", "STT" }));
		table_HTTT_TT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_HTTT_TT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_HTTT_TT.getColumnModel().getColumn(2).setMinWidth(33);
		table_HTTT_TT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_HTTT_TT.getColumnModel().getColumn(4).setMinWidth(29);
		table_HTTT_TT.getColumnModel().getColumn(5).setPreferredWidth(59);
		table_HTTT_TT.getColumnModel().getColumn(6).setCellRenderer(new STTCellRenderer());
		panel_NganhHTTT_TT.setLayout(null);

		scrollPane_HTTT_TT = new JScrollPane(table_HTTT_TT);
		scrollPane_HTTT_TT.setBounds(85, 77, 996, 448);
		panel_NganhHTTT_TT.add(scrollPane_HTTT_TT);

		lbDSTT_HTTT = new JLabel("DANH SÁCH THÍ SINH TRÚNG TUYỂN");
		lbDSTT_HTTT.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbDSTT_HTTT.setBounds(382, 10, 363, 34);
		panel_NganhHTTT_TT.add(lbDSTT_HTTT);

		btnQL_HTTT = new JButton("Quay lại");
		btnQL_HTTT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQL_HTTT.setBounds(985, 550, 91, 25);
		btnQL_HTTT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaCNTT.remove(panel_NganhKTPM_TT);
				panel_KhoaCNTT.remove(panel_NganhHTTT_TT);
				panel_KhoaCNTT.remove(panel_NganhKHMT_TT);
				panel_KhoaCNTT.remove(panel_NganhCNTT_TT);
				panel_KhoaCNTT.remove(panel_NganhCNTT);
				panel_KhoaCNTT.remove(panel_NganhHTTT);
				panel_KhoaCNTT.remove(panel_NganhKTPM);
				panel_KhoaCNTT.add(panel_NganhHTTT);
				panel_KhoaCNTT.revalidate();
				panel_KhoaCNTT.repaint();
			}
		});
		panel_NganhHTTT_TT.add(btnQL_HTTT);

		btnXF_HTTT = new JButton("Xuất file");
		btnXF_HTTT.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_HTTT.getSelectedItem();
				value2 = (String) cboCTHB_HTTT.getSelectedItem();
				try {
					JOptionPane.showMessageDialog(null, "Xuất file thành công!");
					connect_thiSinh.XuatFile_HTTT(Integer.parseInt(value1), Integer.parseInt(value2));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnXF_HTTT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXF_HTTT.setBounds(873, 550, 91, 25);
		panel_NganhHTTT_TT.add(btnXF_HTTT);

		// khoa công nghệ thông tin - ngành kỹ thuật phần mềm
		panel_NganhKTPM = new JPanel();
		panel_NganhKTPM.setBackground(Color.WHITE);
		panel_NganhKTPM.setBounds(234, 35, 1171, 610);
		panel_KhoaCNTT.add(panel_NganhKTPM);
		panel_NganhKTPM.setLayout(null);

		lbCTDT_KTPM = new JLabel("Chỉ tiêu điểm thi");
		lbCTDT_KTPM.setBounds(514, 8, 129, 32);
		panel_NganhKTPM.add(lbCTDT_KTPM);
		lbCTDT_KTPM.setFont(new Font("Tahoma", Font.BOLD, 14));

		btn_XDSTT_KTPM = new JButton("Xuất danh sách trúng tuyển");
		btn_XDSTT_KTPM.setBounds(952, 6, 207, 32);
		panel_NganhKTPM.add(btn_XDSTT_KTPM);
		btn_XDSTT_KTPM.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_KTPM.getSelectedItem();
				value2 = (String) cboCTHB_KTPM.getSelectedItem();
				panel_KhoaCNTT.remove(panel_NganhKHMT_TT);
				panel_KhoaCNTT.remove(panel_NganhCNTT_TT);
				panel_KhoaCNTT.remove(panel_NganhHTTT_TT);
				panel_KhoaCNTT.remove(panel_NganhCNTT);
				panel_KhoaCNTT.remove(panel_NganhKHMT);
				panel_KhoaCNTT.remove(panel_NganhHTTT);
				panel_KhoaCNTT.remove(panel_NganhKTPM);
				panel_KhoaCNTT.add(panel_NganhKTPM_TT);
				panel_KhoaCNTT.revalidate();
				panel_KhoaCNTT.repaint();
				showData_KTPM_TT(connect_thiSinh.TrungTuyen_KTPM(Integer.parseInt(value1), Integer.parseInt(value2)));
			}
		});
		btn_XDSTT_KTPM.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_XDSTT_KTPM.setBackground(SystemColor.info);

		separator_KTPM = new JSeparator();
		separator_KTPM.setBounds(0, 49, 1182, 2);
		panel_NganhKTPM.add(separator_KTPM);

		lb_DSTS_KTPM = new JLabel("DANH SÁCH THÍ SINH");
		lb_DSTS_KTPM.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb_DSTS_KTPM.setBounds(458, 55, 207, 32);
		panel_NganhKTPM.add(lb_DSTS_KTPM);

		table_KTPM = new JTable();
		table_KTPM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_KTPM.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1" }));
		table_KTPM.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_KTPM.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_KTPM.getColumnModel().getColumn(2).setMinWidth(33);
		table_KTPM.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_KTPM.getColumnModel().getColumn(4).setMinWidth(29);
		table_KTPM.getColumnModel().getColumn(5).setPreferredWidth(59);

		scrollPane_KTPM = new JScrollPane(table_KTPM);
		scrollPane_KTPM.setBounds(51, 104, 1041, 477);
		panel_NganhKTPM.add(scrollPane_KTPM);

		lbCTHB_KTPM = new JLabel("Chỉ tiêu học bạ");
		lbCTHB_KTPM.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbCTHB_KTPM.setBounds(730, 8, 129, 32);
		panel_NganhKTPM.add(lbCTHB_KTPM);

		cboCTDT_KTPM = new JComboBox();
		cboCTDT_KTPM
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTDT_KTPM.setBounds(641, 14, 49, 21);
		panel_NganhKTPM.add(cboCTDT_KTPM);

		cboCTHB_KTPM = new JComboBox();
		cboCTHB_KTPM
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTHB_KTPM.setBounds(849, 14, 49, 21);
		panel_NganhKTPM.add(cboCTHB_KTPM);

		// khoa công nghệ thông tin - trúng tuyển ngành kỹ thuật phần mềm
		panel_NganhKTPM_TT = new JPanel();
		panel_NganhKTPM_TT.setBackground(Color.WHITE);
		panel_NganhKTPM_TT.setBounds(234, 35, 1171, 610);
		panel_KhoaCNTT.add(panel_NganhKTPM_TT);

		table_KTPM_TT = new JTable();
		table_KTPM_TT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_KTPM_TT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null } },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1", "STT" }));
		table_KTPM_TT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_KTPM_TT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_KTPM_TT.getColumnModel().getColumn(2).setMinWidth(33);
		table_KTPM_TT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_KTPM_TT.getColumnModel().getColumn(4).setMinWidth(29);
		table_KTPM_TT.getColumnModel().getColumn(5).setPreferredWidth(59);
		table_KTPM_TT.getColumnModel().getColumn(6).setCellRenderer(new STTCellRenderer());
		panel_NganhKTPM_TT.setLayout(null);

		scrollPane_KTPM_TT = new JScrollPane(table_KTPM_TT);
		scrollPane_KTPM_TT.setBounds(85, 77, 996, 448);
		panel_NganhKTPM_TT.add(scrollPane_KTPM_TT);

		lbDSTT_KTPM = new JLabel("DANH SÁCH THÍ SINH TRÚNG TUYỂN");
		lbDSTT_KTPM.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbDSTT_KTPM.setBounds(382, 10, 363, 34);
		panel_NganhKTPM_TT.add(lbDSTT_KTPM);

		btnQL_KTPM = new JButton("Quay lại");
		btnQL_KTPM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQL_KTPM.setBounds(985, 550, 91, 25);
		btnQL_KTPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaCNTT.remove(panel_NganhHTTT_TT);
				panel_KhoaCNTT.remove(panel_NganhKHMT_TT);
				panel_KhoaCNTT.remove(panel_NganhCNTT_TT);
				panel_KhoaCNTT.remove(panel_NganhKTPM_TT);
				panel_KhoaCNTT.remove(panel_NganhCNTT);
				panel_KhoaCNTT.remove(panel_NganhHTTT);
				panel_KhoaCNTT.remove(panel_NganhKTPM);
				panel_KhoaCNTT.add(panel_NganhKTPM);
				panel_KhoaCNTT.revalidate();
				panel_KhoaCNTT.repaint();
			}
		});
		panel_NganhKTPM_TT.add(btnQL_KTPM);

		btnXF_KTPM = new JButton("Xuất file");
		btnXF_KTPM.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_KTPM.getSelectedItem();
				value2 = (String) cboCTHB_KTPM.getSelectedItem();
				try {
					JOptionPane.showMessageDialog(null, "Xuất file thành công!");
					connect_thiSinh.XuatFile_KTPM(Integer.parseInt(value1), Integer.parseInt(value2));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnXF_KTPM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXF_KTPM.setBounds(873, 550, 91, 25);
		panel_NganhKTPM_TT.add(btnXF_KTPM);

		// khoa giáo dục và đào tạo
		panel_KhoaGDDT = new JPanel();
		panel_KhoaGDDT.setBackground(SystemColor.control);
		panel_KhoaGDDT.setBounds(0, 35, 1440, 673);
		contentPane.add(panel_KhoaGDDT);
		panel_KhoaGDDT.setLayout(null);

		lbNHGDDT = new JLabel("Ngành học");
		lbNHGDDT.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbNHGDDT.setBounds(71, 45, 86, 32);
		panel_KhoaGDDT.add(lbNHGDDT);

		separator_GDDT = new JSeparator();
		separator_GDDT.setBounds(0, 35, 1402, 2);
		panel_KhoaGDDT.add(separator_GDDT);

		btn_NHSP = new JButton("Học sư phạm");
		btn_NHSP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaGDDT.remove(panel_NganhHSP_TT);
				panel_KhoaGDDT.remove(panel_NganhGDTE_TT);
				panel_KhoaGDDT.remove(panel_NganhGDNL_TT);
				panel_KhoaGDDT.remove(panel_NganhQLGD_TT);
				panel_KhoaGDDT.remove(panel_NganhGDTE);
				panel_KhoaGDDT.remove(panel_NganhGDNL);
				panel_KhoaGDDT.remove(panel_NganhQLGD);
				panel_KhoaGDDT.add(panel_NganhHSP);
				panel_KhoaGDDT.revalidate();
				panel_KhoaGDDT.repaint();
				showData_HSP(connect_thiSinh.findAll_HSP());
			}
		});
		btn_NHSP.setBackground(SystemColor.info);
		btn_NHSP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_NHSP.setBounds(0, 84, 234, 36);
		panel_KhoaGDDT.add(btn_NHSP);

		btn_NGDTE = new JButton("Giáo dục trẻ em");
		btn_NGDTE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaGDDT.remove(panel_NganhHSP_TT);
				panel_KhoaGDDT.remove(panel_NganhGDTE_TT);
				panel_KhoaGDDT.remove(panel_NganhGDNL_TT);
				panel_KhoaGDDT.remove(panel_NganhQLGD_TT);
				panel_KhoaGDDT.remove(panel_NganhHSP);
				panel_KhoaGDDT.remove(panel_NganhGDNL);
				panel_KhoaGDDT.remove(panel_NganhQLGD);
				panel_KhoaGDDT.add(panel_NganhGDTE);
				panel_KhoaGDDT.revalidate();
				panel_KhoaGDDT.repaint();
				showData_GDTE(connect_thiSinh.findAll_GDTE());
			}
		});
		btn_NGDTE.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_NGDTE.setBackground(SystemColor.info);
		btn_NGDTE.setBounds(0, 118, 234, 36);
		panel_KhoaGDDT.add(btn_NGDTE);

		btn_NGDNL = new JButton("Giáo dục người lớn");
		btn_NGDNL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaGDDT.remove(panel_NganhHSP_TT);
				panel_KhoaGDDT.remove(panel_NganhGDTE_TT);
				panel_KhoaGDDT.remove(panel_NganhGDNL_TT);
				panel_KhoaGDDT.remove(panel_NganhQLGD_TT);
				panel_KhoaGDDT.remove(panel_NganhGDTE);
				panel_KhoaGDDT.remove(panel_NganhHSP);
				panel_KhoaGDDT.remove(panel_NganhQLGD);
				panel_KhoaGDDT.add(panel_NganhGDNL);
				panel_KhoaGDDT.revalidate();
				panel_KhoaGDDT.repaint();
				showData_GDNL(connect_thiSinh.findAll_GDNL());
			}
		});
		btn_NGDNL.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_NGDNL.setBackground(SystemColor.info);
		btn_NGDNL.setBounds(0, 152, 234, 36);
		panel_KhoaGDDT.add(btn_NGDNL);

		btn_NQLGD = new JButton("Quản lí giáo dục");
		btn_NQLGD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaGDDT.remove(panel_NganhHSP_TT);
				panel_KhoaGDDT.remove(panel_NganhGDTE_TT);
				panel_KhoaGDDT.remove(panel_NganhGDNL_TT);
				panel_KhoaGDDT.remove(panel_NganhQLGD_TT);
				panel_KhoaGDDT.remove(panel_NganhGDTE);
				panel_KhoaGDDT.remove(panel_NganhGDNL);
				panel_KhoaGDDT.remove(panel_NganhHSP);
				panel_KhoaGDDT.add(panel_NganhQLGD);
				panel_KhoaGDDT.revalidate();
				panel_KhoaGDDT.repaint();
				showData_QLGD(connect_thiSinh.findAll_QLGD());
			}
		});
		btn_NQLGD.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_NQLGD.setBackground(SystemColor.info);
		btn_NQLGD.setBounds(0, 186, 234, 36);
		panel_KhoaGDDT.add(btn_NQLGD);

		lbKGDDT = new JLabel("KHOA GIÁO DỤC VÀ ĐÀO TẠO");
		lbKGDDT.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbKGDDT.setBounds(645, 1, 270, 32);
		panel_KhoaGDDT.add(lbKGDDT);

		// khoa giáo dục và đào tạo - ngành học sư phạm

		panel_NganhHSP = new JPanel();
		panel_NganhHSP.setBackground(Color.WHITE);
		panel_NganhHSP.setBounds(234, 35, 1171, 610);
		panel_KhoaGDDT.add(panel_NganhHSP);
		panel_NganhHSP.setLayout(null);

		lbCTDT_HSP = new JLabel("Chỉ tiêu điểm thi");
		lbCTDT_HSP.setBounds(514, 8, 129, 32);
		panel_NganhHSP.add(lbCTDT_HSP);
		lbCTDT_HSP.setFont(new Font("Tahoma", Font.BOLD, 14));

		btn_XDSTT_HSP = new JButton("Xuất danh sách trúng tuyển");
		btn_XDSTT_HSP.setBounds(952, 6, 207, 32);
		panel_NganhHSP.add(btn_XDSTT_HSP);
		btn_XDSTT_HSP.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_HSP.getSelectedItem();
				value2 = (String) cboCTHB_HSP.getSelectedItem();
				panel_KhoaGDDT.remove(panel_NganhQLGD);
				panel_KhoaGDDT.remove(panel_NganhGDTE_TT);
				panel_KhoaGDDT.remove(panel_NganhGDNL_TT);
				panel_KhoaGDDT.remove(panel_NganhQLGD_TT);
				panel_KhoaGDDT.remove(panel_NganhGDTE);
				panel_KhoaGDDT.remove(panel_NganhGDNL);
				panel_KhoaGDDT.remove(panel_NganhHSP);
				panel_KhoaGDDT.add(panel_NganhHSP_TT);
				panel_KhoaGDDT.revalidate();
				panel_KhoaGDDT.repaint();
				showData_HSP_TT(connect_thiSinh.TrungTuyen_HSP(Integer.parseInt(value1), Integer.parseInt(value2)));
			}
		});
		btn_XDSTT_HSP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_XDSTT_HSP.setBackground(SystemColor.info);

		separator_HSP = new JSeparator();
		separator_HSP.setBounds(0, 49, 1182, 2);
		panel_NganhHSP.add(separator_HSP);

		lb_DSTS_HSP = new JLabel("DANH SÁCH THÍ SINH");
		lb_DSTS_HSP.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb_DSTS_HSP.setBounds(458, 55, 207, 32);
		panel_NganhHSP.add(lb_DSTS_HSP);

		table_HSP = new JTable();
		table_HSP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_HSP.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1" }));
		table_HSP.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_HSP.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_HSP.getColumnModel().getColumn(2).setMinWidth(33);
		table_HSP.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_HSP.getColumnModel().getColumn(4).setMinWidth(29);
		table_HSP.getColumnModel().getColumn(5).setPreferredWidth(59);

		scrollPane_HSP = new JScrollPane(table_HSP);
		scrollPane_HSP.setBounds(51, 104, 1041, 477);
		panel_NganhHSP.add(scrollPane_HSP);

		lbCTHB_HSP = new JLabel("Chỉ tiêu học bạ");
		lbCTHB_HSP.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbCTHB_HSP.setBounds(730, 8, 129, 32);
		panel_NganhHSP.add(lbCTHB_HSP);

		cboCTDT_HSP = new JComboBox();
		cboCTDT_HSP
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTDT_HSP.setBounds(641, 14, 49, 21);
		panel_NganhHSP.add(cboCTDT_HSP);

		cboCTHB_HSP = new JComboBox();
		cboCTHB_HSP
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTHB_HSP.setBounds(849, 14, 49, 21);
		panel_NganhHSP.add(cboCTHB_HSP);

		// khoa giáo dục và đào tạo - trúng tuyển ngành học sư phạm
		panel_NganhHSP_TT = new JPanel();
		panel_NganhHSP_TT.setBackground(Color.WHITE);
		panel_NganhHSP_TT.setBounds(234, 35, 1171, 610);
		panel_KhoaGDDT.add(panel_NganhHSP_TT);

		table_HSP_TT = new JTable();
		table_HSP_TT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_HSP_TT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null } },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1", "STT" }));
		table_HSP_TT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_HSP_TT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_HSP_TT.getColumnModel().getColumn(2).setMinWidth(33);
		table_HSP_TT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_HSP_TT.getColumnModel().getColumn(4).setMinWidth(29);
		table_HSP_TT.getColumnModel().getColumn(5).setPreferredWidth(59);
		table_HSP_TT.getColumnModel().getColumn(6).setCellRenderer(new STTCellRenderer());
		panel_NganhHSP_TT.setLayout(null);

		scrollPane_HSP_TT = new JScrollPane(table_HSP_TT);
		scrollPane_HSP_TT.setBounds(85, 77, 996, 448);
		panel_NganhHSP_TT.add(scrollPane_HSP_TT);

		lbDSTT_HSP = new JLabel("DANH SÁCH THÍ SINH TRÚNG TUYỂN");
		lbDSTT_HSP.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbDSTT_HSP.setBounds(382, 10, 363, 34);
		panel_NganhHSP_TT.add(lbDSTT_HSP);

		btnQL_HSP = new JButton("Quay lại");
		btnQL_HSP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQL_HSP.setBounds(985, 550, 91, 25);
		btnQL_HSP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaGDDT.remove(panel_NganhHSP_TT);
				panel_KhoaGDDT.remove(panel_NganhGDTE_TT);
				panel_KhoaGDDT.remove(panel_NganhGDNL_TT);
				panel_KhoaGDDT.remove(panel_NganhQLGD_TT);
				panel_KhoaGDDT.remove(panel_NganhGDTE);
				panel_KhoaGDDT.remove(panel_NganhGDNL);
				panel_KhoaGDDT.remove(panel_NganhQLGD);
				panel_KhoaGDDT.add(panel_NganhHSP);
				panel_KhoaGDDT.revalidate();
				panel_KhoaGDDT.repaint();
			}
		});
		panel_NganhHSP_TT.add(btnQL_HSP);

		btnXF_HSP = new JButton("Xuất file");
		btnXF_HSP.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_HSP.getSelectedItem();
				value2 = (String) cboCTHB_HSP.getSelectedItem();
				try {
					JOptionPane.showMessageDialog(null, "Xuất file thành công!");
					connect_thiSinh.XuatFile_HSP(Integer.parseInt(value1), Integer.parseInt(value2));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnXF_HSP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXF_HSP.setBounds(873, 550, 91, 25);
		panel_NganhHSP_TT.add(btnXF_HSP);

		// khoa giáo dục và đào tạo - ngành giáo dục trẻ em

		panel_NganhGDTE = new JPanel();
		panel_NganhGDTE.setBackground(Color.WHITE);
		panel_NganhGDTE.setBounds(234, 35, 1171, 610);
		panel_KhoaGDDT.add(panel_NganhGDTE);
		panel_NganhGDTE.setLayout(null);

		lbCTDT_GDTE = new JLabel("Chỉ tiêu điểm thi");
		lbCTDT_GDTE.setBounds(514, 8, 129, 32);
		panel_NganhGDTE.add(lbCTDT_GDTE);
		lbCTDT_GDTE.setFont(new Font("Tahoma", Font.BOLD, 14));

		btn_XDSTT_GDTE = new JButton("Xuất danh sách trúng tuyển");
		btn_XDSTT_GDTE.setBounds(952, 6, 207, 32);
		panel_NganhGDTE.add(btn_XDSTT_GDTE);
		btn_XDSTT_GDTE.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_GDTE.getSelectedItem();
				value2 = (String) cboCTHB_GDTE.getSelectedItem();
				panel_KhoaGDDT.remove(panel_NganhQLGD);
				panel_KhoaGDDT.remove(panel_NganhHSP_TT);
				panel_KhoaGDDT.remove(panel_NganhGDNL_TT);
				panel_KhoaGDDT.remove(panel_NganhQLGD_TT);
				panel_KhoaGDDT.remove(panel_NganhGDTE);
				panel_KhoaGDDT.remove(panel_NganhGDNL);
				panel_KhoaGDDT.remove(panel_NganhHSP);
				panel_KhoaGDDT.add(panel_NganhGDTE_TT);
				panel_KhoaGDDT.revalidate();
				panel_KhoaGDDT.repaint();
				showData_GDTE_TT(connect_thiSinh.TrungTuyen_GDTE(Integer.parseInt(value1), Integer.parseInt(value2)));
			}
		});
		btn_XDSTT_GDTE.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_XDSTT_GDTE.setBackground(SystemColor.info);

		separator_GDTE = new JSeparator();
		separator_GDTE.setBounds(0, 49, 1182, 2);
		panel_NganhGDTE.add(separator_GDTE);

		lb_DSTS_GDTE = new JLabel("DANH SÁCH THÍ SINH");
		lb_DSTS_GDTE.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb_DSTS_GDTE.setBounds(458, 55, 207, 32);
		panel_NganhGDTE.add(lb_DSTS_GDTE);

		table_GDTE = new JTable();
		table_GDTE.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_GDTE.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1" }));
		table_GDTE.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_GDTE.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_GDTE.getColumnModel().getColumn(2).setMinWidth(33);
		table_GDTE.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_GDTE.getColumnModel().getColumn(4).setMinWidth(29);
		table_GDTE.getColumnModel().getColumn(5).setPreferredWidth(59);

		scrollPane_GDTE = new JScrollPane(table_GDTE);
		scrollPane_GDTE.setBounds(51, 104, 1041, 477);
		panel_NganhGDTE.add(scrollPane_GDTE);

		lbCTHB_GDTE = new JLabel("Chỉ tiêu học bạ");
		lbCTHB_GDTE.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbCTHB_GDTE.setBounds(730, 8, 129, 32);
		panel_NganhGDTE.add(lbCTHB_GDTE);

		cboCTDT_GDTE = new JComboBox();
		cboCTDT_GDTE
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTDT_GDTE.setBounds(641, 14, 49, 21);
		panel_NganhGDTE.add(cboCTDT_GDTE);

		cboCTHB_GDTE = new JComboBox();
		cboCTHB_GDTE
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTHB_GDTE.setBounds(849, 14, 49, 21);
		panel_NganhGDTE.add(cboCTHB_GDTE);

		// khoa giáo dục và đào tạo - trúng tuyển ngành giáo dục trẻ em
		panel_NganhGDTE_TT = new JPanel();
		panel_NganhGDTE_TT.setBackground(Color.WHITE);
		panel_NganhGDTE_TT.setBounds(234, 35, 1171, 610);
		panel_KhoaGDDT.add(panel_NganhGDTE_TT);

		table_GDTE_TT = new JTable();
		table_GDTE_TT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_GDTE_TT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null } },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1", "STT" }));
		table_GDTE_TT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_GDTE_TT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_GDTE_TT.getColumnModel().getColumn(2).setMinWidth(33);
		table_GDTE_TT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_GDTE_TT.getColumnModel().getColumn(4).setMinWidth(29);
		table_GDTE_TT.getColumnModel().getColumn(5).setPreferredWidth(59);
		table_GDTE_TT.getColumnModel().getColumn(6).setCellRenderer(new STTCellRenderer());
		panel_NganhGDTE_TT.setLayout(null);

		scrollPane_GDTE_TT = new JScrollPane(table_GDTE_TT);
		scrollPane_GDTE_TT.setBounds(85, 77, 996, 448);
		panel_NganhGDTE_TT.add(scrollPane_GDTE_TT);

		lbDSTT_GDTE = new JLabel("DANH SÁCH THÍ SINH TRÚNG TUYỂN");
		lbDSTT_GDTE.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbDSTT_GDTE.setBounds(382, 10, 363, 34);
		panel_NganhGDTE_TT.add(lbDSTT_GDTE);

		btnQL_GDTE = new JButton("Quay lại");
		btnQL_GDTE.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQL_GDTE.setBounds(985, 550, 91, 25);
		btnQL_GDTE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaGDDT.remove(panel_NganhHSP_TT);
				panel_KhoaGDDT.remove(panel_NganhGDTE_TT);
				panel_KhoaGDDT.remove(panel_NganhGDNL_TT);
				panel_KhoaGDDT.remove(panel_NganhQLGD_TT);
				panel_KhoaGDDT.remove(panel_NganhHSP);
				panel_KhoaGDDT.remove(panel_NganhGDNL);
				panel_KhoaGDDT.remove(panel_NganhQLGD);
				panel_KhoaGDDT.add(panel_NganhGDTE);
				panel_KhoaGDDT.revalidate();
				panel_KhoaGDDT.repaint();
			}
		});
		panel_NganhGDTE_TT.add(btnQL_GDTE);

		btnXF_GDTE = new JButton("Xuất file");
		btnXF_GDTE.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_GDTE.getSelectedItem();
				value2 = (String) cboCTHB_GDTE.getSelectedItem();
				try {
					JOptionPane.showMessageDialog(null, "Xuất file thành công!");
					connect_thiSinh.XuatFile_GDTE(Integer.parseInt(value1), Integer.parseInt(value2));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnXF_GDTE.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXF_GDTE.setBounds(873, 550, 91, 25);
		panel_NganhGDTE_TT.add(btnXF_GDTE);

		// khoa giáo dục và đào tạo - ngành giáo dục người lớn

		panel_NganhGDNL = new JPanel();
		panel_NganhGDNL.setBackground(Color.WHITE);
		panel_NganhGDNL.setBounds(234, 35, 1171, 610);
		panel_KhoaGDDT.add(panel_NganhGDNL);
		panel_NganhGDNL.setLayout(null);

		lbCTDT_GDNL = new JLabel("Chỉ tiêu điểm thi");
		lbCTDT_GDNL.setBounds(514, 8, 129, 32);
		panel_NganhGDNL.add(lbCTDT_GDNL);
		lbCTDT_GDNL.setFont(new Font("Tahoma", Font.BOLD, 14));

		btn_XDSTT_GDNL = new JButton("Xuất danh sách trúng tuyển");
		btn_XDSTT_GDNL.setBounds(952, 6, 207, 32);
		panel_NganhGDNL.add(btn_XDSTT_GDNL);
		btn_XDSTT_GDNL.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_GDNL.getSelectedItem();
				value2 = (String) cboCTHB_GDNL.getSelectedItem();
				panel_KhoaGDDT.remove(panel_NganhQLGD);
				panel_KhoaGDDT.remove(panel_NganhGDTE_TT);
				panel_KhoaGDDT.remove(panel_NganhHSP_TT);
				panel_KhoaGDDT.remove(panel_NganhQLGD_TT);
				panel_KhoaGDDT.remove(panel_NganhGDTE);
				panel_KhoaGDDT.remove(panel_NganhGDNL);
				panel_KhoaGDDT.remove(panel_NganhHSP);
				panel_KhoaGDDT.add(panel_NganhGDNL_TT);
				panel_KhoaGDDT.revalidate();
				panel_KhoaGDDT.repaint();
				showData_GDNL_TT(connect_thiSinh.TrungTuyen_GDNL(Integer.parseInt(value1), Integer.parseInt(value2)));
			}
		});
		btn_XDSTT_GDNL.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_XDSTT_GDNL.setBackground(SystemColor.info);

		separator_GDNL = new JSeparator();
		separator_GDNL.setBounds(0, 49, 1182, 2);
		panel_NganhGDNL.add(separator_GDNL);

		lb_DSTS_GDNL = new JLabel("DANH SÁCH THÍ SINH");
		lb_DSTS_GDNL.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb_DSTS_GDNL.setBounds(458, 55, 207, 32);
		panel_NganhGDNL.add(lb_DSTS_GDNL);

		table_GDNL = new JTable();
		table_GDNL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_GDNL.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1" }));
		table_GDNL.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_GDNL.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_GDNL.getColumnModel().getColumn(2).setMinWidth(33);
		table_GDNL.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_GDNL.getColumnModel().getColumn(4).setMinWidth(29);
		table_GDNL.getColumnModel().getColumn(5).setPreferredWidth(59);

		scrollPane_GDNL = new JScrollPane(table_GDNL);
		scrollPane_GDNL.setBounds(51, 104, 1041, 477);
		panel_NganhGDNL.add(scrollPane_GDNL);

		lbCTHB_GDNL = new JLabel("Chỉ tiêu học bạ");
		lbCTHB_GDNL.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbCTHB_GDNL.setBounds(730, 8, 129, 32);
		panel_NganhGDNL.add(lbCTHB_GDNL);

		cboCTDT_GDNL = new JComboBox();
		cboCTDT_GDNL
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTDT_GDNL.setBounds(641, 14, 49, 21);
		panel_NganhGDNL.add(cboCTDT_GDNL);

		cboCTHB_GDNL = new JComboBox();
		cboCTHB_GDNL
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTHB_GDNL.setBounds(849, 14, 49, 21);
		panel_NganhGDNL.add(cboCTHB_GDNL);

		// khoa giáo dục và đào tạo - trúng tuyển ngành giáo dục người lớn
		panel_NganhGDNL_TT = new JPanel();
		panel_NganhGDNL_TT.setBackground(Color.WHITE);
		panel_NganhGDNL_TT.setBounds(234, 35, 1171, 610);
		panel_KhoaGDDT.add(panel_NganhGDNL_TT);

		table_GDNL_TT = new JTable();
		table_GDNL_TT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_GDNL_TT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null } },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1", "STT" }));
		table_GDNL_TT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_GDNL_TT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_GDNL_TT.getColumnModel().getColumn(2).setMinWidth(33);
		table_GDNL_TT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_GDNL_TT.getColumnModel().getColumn(4).setMinWidth(29);
		table_GDNL_TT.getColumnModel().getColumn(5).setPreferredWidth(59);
		table_GDNL_TT.getColumnModel().getColumn(6).setCellRenderer(new STTCellRenderer());
		panel_NganhGDNL_TT.setLayout(null);

		scrollPane_GDNL_TT = new JScrollPane(table_GDNL_TT);
		scrollPane_GDNL_TT.setBounds(85, 77, 996, 448);
		panel_NganhGDNL_TT.add(scrollPane_GDNL_TT);

		lbDSTT_GDNL = new JLabel("DANH SÁCH THÍ SINH TRÚNG TUYỂN");
		lbDSTT_GDNL.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbDSTT_GDNL.setBounds(382, 10, 363, 34);
		panel_NganhGDNL_TT.add(lbDSTT_GDNL);

		btnQL_GDNL = new JButton("Quay lại");
		btnQL_GDNL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQL_GDNL.setBounds(985, 550, 91, 25);
		btnQL_GDNL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaGDDT.remove(panel_NganhHSP_TT);
				panel_KhoaGDDT.remove(panel_NganhGDTE_TT);
				panel_KhoaGDDT.remove(panel_NganhGDNL_TT);
				panel_KhoaGDDT.remove(panel_NganhQLGD_TT);
				panel_KhoaGDDT.remove(panel_NganhGDTE);
				panel_KhoaGDDT.remove(panel_NganhHSP);
				panel_KhoaGDDT.remove(panel_NganhQLGD);
				panel_KhoaGDDT.add(panel_NganhGDNL);
				panel_KhoaGDDT.revalidate();
				panel_KhoaGDDT.repaint();
			}
		});
		panel_NganhGDNL_TT.add(btnQL_GDNL);

		btnXF_GDNL = new JButton("Xuất file");
		btnXF_GDNL.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_GDNL.getSelectedItem();
				value2 = (String) cboCTHB_GDNL.getSelectedItem();
				try {
					JOptionPane.showMessageDialog(null, "Xuất file thành công!");
					connect_thiSinh.XuatFile_GDNL(Integer.parseInt(value1), Integer.parseInt(value2));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnXF_GDNL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXF_GDNL.setBounds(873, 550, 91, 25);
		panel_NganhGDNL_TT.add(btnXF_GDNL);

		// khoa giáo dục và đào tạo - ngành quản lí giáo dục

		panel_NganhQLGD = new JPanel();
		panel_NganhQLGD.setBackground(Color.WHITE);
		panel_NganhQLGD.setBounds(234, 35, 1171, 610);
		panel_KhoaGDDT.add(panel_NganhQLGD);
		panel_NganhQLGD.setLayout(null);

		lbCTDT_QLGD = new JLabel("Chỉ tiêu điểm thi");
		lbCTDT_QLGD.setBounds(514, 8, 129, 32);
		panel_NganhQLGD.add(lbCTDT_QLGD);
		lbCTDT_QLGD.setFont(new Font("Tahoma", Font.BOLD, 14));

		btn_XDSTT_QLGD = new JButton("Xuất danh sách trúng tuyển");
		btn_XDSTT_QLGD.setBounds(952, 6, 207, 32);
		panel_NganhQLGD.add(btn_XDSTT_QLGD);
		btn_XDSTT_QLGD.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_QLGD.getSelectedItem();
				value2 = (String) cboCTHB_QLGD.getSelectedItem();
				panel_KhoaGDDT.remove(panel_NganhQLGD);
				panel_KhoaGDDT.remove(panel_NganhGDTE_TT);
				panel_KhoaGDDT.remove(panel_NganhHSP_TT);
				panel_KhoaGDDT.remove(panel_NganhGDNL_TT);
				panel_KhoaGDDT.remove(panel_NganhGDTE);
				panel_KhoaGDDT.remove(panel_NganhGDNL);
				panel_KhoaGDDT.remove(panel_NganhHSP);
				panel_KhoaGDDT.add(panel_NganhQLGD_TT);
				panel_KhoaGDDT.revalidate();
				panel_KhoaGDDT.repaint();
				showData_QLGD_TT(connect_thiSinh.TrungTuyen_QLGD(Integer.parseInt(value1), Integer.parseInt(value2)));
			}
		});
		btn_XDSTT_QLGD.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_XDSTT_QLGD.setBackground(SystemColor.info);

		separator_QLGD = new JSeparator();
		separator_QLGD.setBounds(0, 49, 1182, 2);
		panel_NganhQLGD.add(separator_QLGD);

		lb_DSTS_QLGD = new JLabel("DANH SÁCH THÍ SINH");
		lb_DSTS_QLGD.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb_DSTS_QLGD.setBounds(458, 55, 207, 32);
		panel_NganhQLGD.add(lb_DSTS_QLGD);

		table_QLGD = new JTable();
		table_QLGD.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_QLGD.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1" }));
		table_QLGD.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_QLGD.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_QLGD.getColumnModel().getColumn(2).setMinWidth(33);
		table_QLGD.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_QLGD.getColumnModel().getColumn(4).setMinWidth(29);
		table_QLGD.getColumnModel().getColumn(5).setPreferredWidth(59);

		scrollPane_QLGD = new JScrollPane(table_QLGD);
		scrollPane_QLGD.setBounds(51, 104, 1041, 477);
		panel_NganhQLGD.add(scrollPane_QLGD);

		lbCTHB_QLGD = new JLabel("Chỉ tiêu học bạ");
		lbCTHB_QLGD.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbCTHB_QLGD.setBounds(730, 8, 129, 32);
		panel_NganhQLGD.add(lbCTHB_QLGD);

		cboCTDT_QLGD = new JComboBox();
		cboCTDT_QLGD
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTDT_QLGD.setBounds(641, 14, 49, 21);
		panel_NganhQLGD.add(cboCTDT_QLGD);

		cboCTHB_QLGD = new JComboBox();
		cboCTHB_QLGD
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTHB_QLGD.setBounds(849, 14, 49, 21);
		panel_NganhQLGD.add(cboCTHB_QLGD);

		// khoa giáo dục và đào tạo - trúng tuyển ngành quản lí giáo dục
		panel_NganhQLGD_TT = new JPanel();
		panel_NganhQLGD_TT.setBackground(Color.WHITE);
		panel_NganhQLGD_TT.setBounds(234, 35, 1171, 610);
		panel_KhoaGDDT.add(panel_NganhQLGD_TT);

		table_QLGD_TT = new JTable();
		table_QLGD_TT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_QLGD_TT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null } },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1", "STT" }));
		table_QLGD_TT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_QLGD_TT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_QLGD_TT.getColumnModel().getColumn(2).setMinWidth(33);
		table_QLGD_TT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_QLGD_TT.getColumnModel().getColumn(4).setMinWidth(29);
		table_QLGD_TT.getColumnModel().getColumn(5).setPreferredWidth(59);
		table_QLGD_TT.getColumnModel().getColumn(6).setCellRenderer(new STTCellRenderer());
		panel_NganhQLGD_TT.setLayout(null);

		scrollPane_QLGD_TT = new JScrollPane(table_QLGD_TT);
		scrollPane_QLGD_TT.setBounds(85, 77, 996, 448);
		panel_NganhQLGD_TT.add(scrollPane_QLGD_TT);

		lbDSTT_QLGD = new JLabel("DANH SÁCH THÍ SINH TRÚNG TUYỂN");
		lbDSTT_QLGD.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbDSTT_QLGD.setBounds(382, 10, 363, 34);
		panel_NganhQLGD_TT.add(lbDSTT_QLGD);

		btnQL_QLGD = new JButton("Quay lại");
		btnQL_QLGD.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQL_QLGD.setBounds(985, 550, 91, 25);
		btnQL_QLGD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaGDDT.remove(panel_NganhHSP_TT);
				panel_KhoaGDDT.remove(panel_NganhGDTE_TT);
				panel_KhoaGDDT.remove(panel_NganhGDNL_TT);
				panel_KhoaGDDT.remove(panel_NganhQLGD_TT);
				panel_KhoaGDDT.remove(panel_NganhGDTE);
				panel_KhoaGDDT.remove(panel_NganhGDNL);
				panel_KhoaGDDT.remove(panel_NganhHSP);
				panel_KhoaGDDT.add(panel_NganhQLGD);
				panel_KhoaGDDT.revalidate();
				panel_KhoaGDDT.repaint();
			}
		});
		panel_NganhQLGD_TT.add(btnQL_QLGD);

		btnXF_QLGD = new JButton("Xuất file");
		btnXF_QLGD.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_QLGD.getSelectedItem();
				value2 = (String) cboCTHB_QLGD.getSelectedItem();
				try {
					JOptionPane.showMessageDialog(null, "Xuất file thành công!");
					connect_thiSinh.XuatFile_QLGD(Integer.parseInt(value1), Integer.parseInt(value2));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnXF_QLGD.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXF_QLGD.setBounds(873, 550, 91, 25);
		panel_NganhQLGD_TT.add(btnXF_QLGD);

		// khoa kỹ thuật
		panel_KhoaKTH = new JPanel();
		panel_KhoaKTH.setBackground(Color.WHITE);
		panel_KhoaKTH.setBounds(0, 35, 1440, 673);
		contentPane.add(panel_KhoaKTH);
		panel_KhoaKTH.setLayout(null);

		lbNHKTH = new JLabel("Ngành học");
		lbNHKTH.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbNHKTH.setBounds(71, 45, 86, 32);
		panel_KhoaKTH.add(lbNHKTH);

		separator_KTH = new JSeparator();
		separator_KTH.setBounds(0, 35, 1402, 2);
		panel_KhoaKTH.add(separator_KTH);

		btn_NKTCK = new JButton("Kỹ thuật cơ khí");
		btn_NKTCK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaKTH.remove(panel_NganhKTCK_TT);
				panel_KhoaKTH.remove(panel_NganhKTOT_TT);
				panel_KhoaKTH.remove(panel_NganhKHHH_TT);
				panel_KhoaKTH.remove(panel_NganhCDT_TT);
				panel_KhoaKTH.remove(panel_NganhKTOT);
				panel_KhoaKTH.remove(panel_NganhKHHH);
				panel_KhoaKTH.remove(panel_NganhCDT);
				panel_KhoaKTH.add(panel_NganhKTCK);
				panel_KhoaKTH.revalidate();
				panel_KhoaKTH.repaint();
				showData_KTCK(connect_thiSinh.findAll_KTCK());
			}
		});
		btn_NKTCK.setBackground(SystemColor.info);
		btn_NKTCK.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_NKTCK.setBounds(0, 84, 234, 36);
		panel_KhoaKTH.add(btn_NKTCK);

		btn_NKTOT = new JButton("Kỹ thuật ô tô");
		btn_NKTOT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaKTH.remove(panel_NganhKTCK_TT);
				panel_KhoaKTH.remove(panel_NganhKTOT_TT);
				panel_KhoaKTH.remove(panel_NganhKHHH_TT);
				panel_KhoaKTH.remove(panel_NganhCDT_TT);
				panel_KhoaKTH.remove(panel_NganhKTCK);
				panel_KhoaKTH.remove(panel_NganhKHHH);
				panel_KhoaKTH.remove(panel_NganhCDT);
				panel_KhoaKTH.add(panel_NganhKTOT);
				panel_KhoaKTH.revalidate();
				panel_KhoaKTH.repaint();
				showData_KTOT(connect_thiSinh.findAll_KTOT());
			}
		});
		btn_NKTOT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_NKTOT.setBackground(SystemColor.info);
		btn_NKTOT.setBounds(0, 118, 234, 36);
		panel_KhoaKTH.add(btn_NKTOT);

		btn_NKHHH = new JButton("Khoa học hàng hải");
		btn_NKHHH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaKTH.remove(panel_NganhKTCK_TT);
				panel_KhoaKTH.remove(panel_NganhKTOT_TT);
				panel_KhoaKTH.remove(panel_NganhKHHH_TT);
				panel_KhoaKTH.remove(panel_NganhCDT_TT);
				panel_KhoaKTH.remove(panel_NganhKTOT);
				panel_KhoaKTH.remove(panel_NganhKTCK);
				panel_KhoaKTH.remove(panel_NganhCDT);
				panel_KhoaKTH.add(panel_NganhKHHH);
				panel_KhoaKTH.revalidate();
				panel_KhoaKTH.repaint();
				showData_KHHH(connect_thiSinh.findAll_KHHH());
			}
		});
		btn_NKHHH.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_NKHHH.setBackground(SystemColor.info);
		btn_NKHHH.setBounds(0, 152, 234, 36);
		panel_KhoaKTH.add(btn_NKHHH);

		btn_NCDT = new JButton("Cơ điện tử");
		btn_NCDT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaKTH.remove(panel_NganhKTCK_TT);
				panel_KhoaKTH.remove(panel_NganhKTOT_TT);
				panel_KhoaKTH.remove(panel_NganhKHHH_TT);
				panel_KhoaKTH.remove(panel_NganhCDT_TT);
				panel_KhoaKTH.remove(panel_NganhKTOT);
				panel_KhoaKTH.remove(panel_NganhKHHH);
				panel_KhoaKTH.remove(panel_NganhKTCK);
				panel_KhoaKTH.add(panel_NganhCDT);
				panel_KhoaKTH.revalidate();
				panel_KhoaKTH.repaint();
				showData_CDT(connect_thiSinh.findAll_CDT());
			}
		});
		btn_NCDT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_NCDT.setBackground(SystemColor.info);
		btn_NCDT.setBounds(0, 186, 234, 36);
		panel_KhoaKTH.add(btn_NCDT);

		lbKKTH = new JLabel("KHOA KỸ THUẬT");
		lbKKTH.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbKKTH.setBounds(645, 1, 270, 32);
		panel_KhoaKTH.add(lbKKTH);

		// khoa kỹ thuật - ngành kỹ thuật cơ khí

		panel_NganhKTCK = new JPanel();
		panel_NganhKTCK.setBackground(Color.WHITE);
		panel_NganhKTCK.setBounds(234, 35, 1171, 610);
		panel_KhoaKTH.add(panel_NganhKTCK);
		panel_NganhKTCK.setLayout(null);

		lbCTDT_KTCK = new JLabel("Chỉ tiêu điểm thi");
		lbCTDT_KTCK.setBounds(514, 8, 129, 32);
		panel_NganhKTCK.add(lbCTDT_KTCK);
		lbCTDT_KTCK.setFont(new Font("Tahoma", Font.BOLD, 14));

		btn_XDSTT_KTCK = new JButton("Xuất danh sách trúng tuyển");
		btn_XDSTT_KTCK.setBounds(952, 6, 207, 32);
		panel_NganhKTCK.add(btn_XDSTT_KTCK);
		btn_XDSTT_KTCK.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_KTCK.getSelectedItem();
				value2 = (String) cboCTHB_KTCK.getSelectedItem();
				panel_KhoaKTH.remove(panel_NganhKTCK);
				panel_KhoaKTH.remove(panel_NganhKTOT_TT);
				panel_KhoaKTH.remove(panel_NganhKHHH_TT);
				panel_KhoaKTH.remove(panel_NganhCDT_TT);
				panel_KhoaKTH.remove(panel_NganhKTOT);
				panel_KhoaKTH.remove(panel_NganhKHHH);
				panel_KhoaKTH.remove(panel_NganhCDT);
				panel_KhoaKTH.add(panel_NganhKTCK_TT);
				panel_KhoaKTH.revalidate();
				panel_KhoaKTH.repaint();
				showData_KTCK_TT(connect_thiSinh.TrungTuyen_KTCK(Integer.parseInt(value1), Integer.parseInt(value2)));
			}
		});
		btn_XDSTT_KTCK.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_XDSTT_KTCK.setBackground(SystemColor.info);

		separator_KTCK = new JSeparator();
		separator_KTCK.setBounds(0, 49, 1182, 2);
		panel_NganhKTCK.add(separator_KTCK);

		lb_DSTS_KTCK = new JLabel("DANH SÁCH THÍ SINH");
		lb_DSTS_KTCK.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb_DSTS_KTCK.setBounds(458, 55, 207, 32);
		panel_NganhKTCK.add(lb_DSTS_KTCK);

		table_KTCK = new JTable();
		table_KTCK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_KTCK.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1" }));
		table_KTCK.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_KTCK.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_KTCK.getColumnModel().getColumn(2).setMinWidth(33);
		table_KTCK.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_KTCK.getColumnModel().getColumn(4).setMinWidth(29);
		table_KTCK.getColumnModel().getColumn(5).setPreferredWidth(59);

		scrollPane_KTCK = new JScrollPane(table_KTCK);
		scrollPane_KTCK.setBounds(51, 104, 1041, 477);
		panel_NganhKTCK.add(scrollPane_KTCK);

		lbCTHB_KTCK = new JLabel("Chỉ tiêu học bạ");
		lbCTHB_KTCK.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbCTHB_KTCK.setBounds(730, 8, 129, 32);
		panel_NganhKTCK.add(lbCTHB_KTCK);

		cboCTDT_KTCK = new JComboBox();
		cboCTDT_KTCK
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTDT_KTCK.setBounds(641, 14, 49, 21);
		panel_NganhKTCK.add(cboCTDT_KTCK);

		cboCTHB_KTCK = new JComboBox();
		cboCTHB_KTCK
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTHB_KTCK.setBounds(849, 14, 49, 21);
		panel_NganhKTCK.add(cboCTHB_KTCK);

		// khoa giáo dục và đào tạo - trúng tuyển ngành kỹ thuật cơ khí
		panel_NganhKTCK_TT = new JPanel();
		panel_NganhKTCK_TT.setBackground(Color.WHITE);
		panel_NganhKTCK_TT.setBounds(234, 35, 1171, 610);
		panel_KhoaKTH.add(panel_NganhKTCK_TT);

		table_KTCK_TT = new JTable();
		table_KTCK_TT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_KTCK_TT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null } },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1", "STT" }));
		table_KTCK_TT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_KTCK_TT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_KTCK_TT.getColumnModel().getColumn(2).setMinWidth(33);
		table_KTCK_TT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_KTCK_TT.getColumnModel().getColumn(4).setMinWidth(29);
		table_KTCK_TT.getColumnModel().getColumn(5).setPreferredWidth(59);
		table_KTCK_TT.getColumnModel().getColumn(6).setCellRenderer(new STTCellRenderer());
		panel_NganhKTCK_TT.setLayout(null);

		scrollPane_KTCK_TT = new JScrollPane(table_KTCK_TT);
		scrollPane_KTCK_TT.setBounds(85, 77, 996, 448);
		panel_NganhKTCK_TT.add(scrollPane_KTCK_TT);

		lbDSTT_KTCK = new JLabel("DANH SÁCH THÍ SINH TRÚNG TUYỂN");
		lbDSTT_KTCK.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbDSTT_KTCK.setBounds(382, 10, 363, 34);
		panel_NganhKTCK_TT.add(lbDSTT_KTCK);

		btnQL_KTCK = new JButton("Quay lại");
		btnQL_KTCK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQL_KTCK.setBounds(985, 550, 91, 25);
		btnQL_KTCK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaKTH.remove(panel_NganhKTCK_TT);
				panel_KhoaKTH.remove(panel_NganhKTOT_TT);
				panel_KhoaKTH.remove(panel_NganhKHHH_TT);
				panel_KhoaKTH.remove(panel_NganhCDT_TT);
				panel_KhoaKTH.remove(panel_NganhKTOT);
				panel_KhoaKTH.remove(panel_NganhKHHH);
				panel_KhoaKTH.remove(panel_NganhCDT);
				panel_KhoaKTH.add(panel_NganhKTCK);
				panel_KhoaKTH.revalidate();
				panel_KhoaKTH.repaint();
			}
		});
		panel_NganhKTCK_TT.add(btnQL_KTCK);

		btnXF_KTCK = new JButton("Xuất file");
		btnXF_KTCK.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_KTCK.getSelectedItem();
				value2 = (String) cboCTHB_KTCK.getSelectedItem();
				try {
					JOptionPane.showMessageDialog(null, "Xuất file thành công!");
					connect_thiSinh.XuatFile_KTCK(Integer.parseInt(value1), Integer.parseInt(value2));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnXF_KTCK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXF_KTCK.setBounds(873, 550, 91, 25);
		panel_NganhKTCK_TT.add(btnXF_KTCK);

		// khoa kỹ thuật - ngành kỹ thuật ô tô

		panel_NganhKTOT = new JPanel();
		panel_NganhKTOT.setBackground(Color.WHITE);
		panel_NganhKTOT.setBounds(234, 35, 1171, 610);
		panel_KhoaKTH.add(panel_NganhKTOT);
		panel_NganhKTOT.setLayout(null);

		lbCTDT_KTOT = new JLabel("Chỉ tiêu điểm thi");
		lbCTDT_KTOT.setBounds(514, 8, 129, 32);
		panel_NganhKTOT.add(lbCTDT_KTOT);
		lbCTDT_KTOT.setFont(new Font("Tahoma", Font.BOLD, 14));

		btn_XDSTT_KTOT = new JButton("Xuất danh sách trúng tuyển");
		btn_XDSTT_KTOT.setBounds(952, 6, 207, 32);
		panel_NganhKTOT.add(btn_XDSTT_KTOT);
		btn_XDSTT_KTOT.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_KTOT.getSelectedItem();
				value2 = (String) cboCTHB_KTOT.getSelectedItem();
				panel_KhoaKTH.remove(panel_NganhKTCK);
				panel_KhoaKTH.remove(panel_NganhKTCK_TT);
				panel_KhoaKTH.remove(panel_NganhKHHH_TT);
				panel_KhoaKTH.remove(panel_NganhCDT_TT);
				panel_KhoaKTH.remove(panel_NganhKTOT);
				panel_KhoaKTH.remove(panel_NganhKHHH);
				panel_KhoaKTH.remove(panel_NganhCDT);
				panel_KhoaKTH.add(panel_NganhKTOT_TT);
				panel_KhoaKTH.revalidate();
				panel_KhoaKTH.repaint();
				showData_KTOT_TT(connect_thiSinh.TrungTuyen_KTOT(Integer.parseInt(value1), Integer.parseInt(value2)));
			}
		});
		btn_XDSTT_KTOT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_XDSTT_KTOT.setBackground(SystemColor.info);

		separator_KTOT = new JSeparator();
		separator_KTOT.setBounds(0, 49, 1182, 2);
		panel_NganhKTOT.add(separator_KTOT);

		lb_DSTS_KTOT = new JLabel("DANH SÁCH THÍ SINH");
		lb_DSTS_KTOT.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb_DSTS_KTOT.setBounds(458, 55, 207, 32);
		panel_NganhKTOT.add(lb_DSTS_KTOT);

		table_KTOT = new JTable();
		table_KTOT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_KTOT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1" }));
		table_KTOT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_KTOT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_KTOT.getColumnModel().getColumn(2).setMinWidth(33);
		table_KTOT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_KTOT.getColumnModel().getColumn(4).setMinWidth(29);
		table_KTOT.getColumnModel().getColumn(5).setPreferredWidth(59);

		scrollPane_KTOT = new JScrollPane(table_KTOT);
		scrollPane_KTOT.setBounds(51, 104, 1041, 477);
		panel_NganhKTOT.add(scrollPane_KTOT);

		lbCTHB_KTOT = new JLabel("Chỉ tiêu học bạ");
		lbCTHB_KTOT.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbCTHB_KTOT.setBounds(730, 8, 129, 32);
		panel_NganhKTOT.add(lbCTHB_KTOT);

		cboCTDT_KTOT = new JComboBox();
		cboCTDT_KTOT
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTDT_KTOT.setBounds(641, 14, 49, 21);
		panel_NganhKTOT.add(cboCTDT_KTOT);

		cboCTHB_KTOT = new JComboBox();
		cboCTHB_KTOT
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTHB_KTOT.setBounds(849, 14, 49, 21);
		panel_NganhKTOT.add(cboCTHB_KTOT);

		// khoa kỹ thuật - trúng tuyển ngành kỹ thuật ô tô
		panel_NganhKTOT_TT = new JPanel();
		panel_NganhKTOT_TT.setBackground(Color.WHITE);
		panel_NganhKTOT_TT.setBounds(234, 35, 1171, 610);
		panel_KhoaKTH.add(panel_NganhKTOT_TT);

		table_KTOT_TT = new JTable();
		table_KTOT_TT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_KTOT_TT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null } },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1", "STT" }));
		table_KTOT_TT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_KTOT_TT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_KTOT_TT.getColumnModel().getColumn(2).setMinWidth(33);
		table_KTOT_TT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_KTOT_TT.getColumnModel().getColumn(4).setMinWidth(29);
		table_KTOT_TT.getColumnModel().getColumn(5).setPreferredWidth(59);
		table_KTOT_TT.getColumnModel().getColumn(6).setCellRenderer(new STTCellRenderer());
		panel_NganhKTOT_TT.setLayout(null);

		scrollPane_KTOT_TT = new JScrollPane(table_KTOT_TT);
		scrollPane_KTOT_TT.setBounds(85, 77, 996, 448);
		panel_NganhKTOT_TT.add(scrollPane_KTOT_TT);

		lbDSTT_KTOT = new JLabel("DANH SÁCH THÍ SINH TRÚNG TUYỂN");
		lbDSTT_KTOT.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbDSTT_KTOT.setBounds(382, 10, 363, 34);
		panel_NganhKTOT_TT.add(lbDSTT_KTOT);

		btnQL_KTOT = new JButton("Quay lại");
		btnQL_KTOT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQL_KTOT.setBounds(985, 550, 91, 25);
		btnQL_KTOT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaKTH.remove(panel_NganhKTCK_TT);
				panel_KhoaKTH.remove(panel_NganhKTOT_TT);
				panel_KhoaKTH.remove(panel_NganhKHHH_TT);
				panel_KhoaKTH.remove(panel_NganhCDT_TT);
				panel_KhoaKTH.remove(panel_NganhKTCK);
				panel_KhoaKTH.remove(panel_NganhKHHH);
				panel_KhoaKTH.remove(panel_NganhCDT);
				panel_KhoaKTH.add(panel_NganhKTOT);
				panel_KhoaKTH.revalidate();
				panel_KhoaKTH.repaint();
			}
		});
		panel_NganhKTOT_TT.add(btnQL_KTOT);

		btnXF_KTOT = new JButton("Xuất file");
		btnXF_KTOT.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_KTOT.getSelectedItem();
				value2 = (String) cboCTHB_KTOT.getSelectedItem();
				try {
					JOptionPane.showMessageDialog(null, "Xuất file thành công!");
					connect_thiSinh.XuatFile_KTOT(Integer.parseInt(value1), Integer.parseInt(value2));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnXF_KTOT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXF_KTOT.setBounds(873, 550, 91, 25);
		panel_NganhKTOT_TT.add(btnXF_KTOT);

		// khoa kỹ thuật - ngành khoa học hàng hải

		panel_NganhKHHH = new JPanel();
		panel_NganhKHHH.setBackground(Color.WHITE);
		panel_NganhKHHH.setBounds(234, 35, 1171, 610);
		panel_KhoaKTH.add(panel_NganhKHHH);
		panel_NganhKHHH.setLayout(null);

		lbCTDT_KHHH = new JLabel("Chỉ tiêu điểm thi");
		lbCTDT_KHHH.setBounds(514, 8, 129, 32);
		panel_NganhKHHH.add(lbCTDT_KHHH);
		lbCTDT_KHHH.setFont(new Font("Tahoma", Font.BOLD, 14));

		btn_XDSTT_KHHH = new JButton("Xuất danh sách trúng tuyển");
		btn_XDSTT_KHHH.setBounds(952, 6, 207, 32);
		panel_NganhKHHH.add(btn_XDSTT_KHHH);
		btn_XDSTT_KHHH.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_KHHH.getSelectedItem();
				value2 = (String) cboCTHB_KHHH.getSelectedItem();
				panel_KhoaKTH.remove(panel_NganhKTCK);
				panel_KhoaKTH.remove(panel_NganhKTOT_TT);
				panel_KhoaKTH.remove(panel_NganhKTCK_TT);
				panel_KhoaKTH.remove(panel_NganhCDT_TT);
				panel_KhoaKTH.remove(panel_NganhKTOT);
				panel_KhoaKTH.remove(panel_NganhKHHH);
				panel_KhoaKTH.remove(panel_NganhCDT);
				panel_KhoaKTH.add(panel_NganhKHHH_TT);
				panel_KhoaKTH.revalidate();
				panel_KhoaKTH.repaint();
				showData_KHHH_TT(connect_thiSinh.TrungTuyen_KHHH(Integer.parseInt(value1), Integer.parseInt(value2)));
			}
		});
		btn_XDSTT_KHHH.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_XDSTT_KHHH.setBackground(SystemColor.info);

		separator_KHHH = new JSeparator();
		separator_KHHH.setBounds(0, 49, 1182, 2);
		panel_NganhKHHH.add(separator_KHHH);

		lb_DSTS_KHHH = new JLabel("DANH SÁCH THÍ SINH");
		lb_DSTS_KHHH.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb_DSTS_KHHH.setBounds(458, 55, 207, 32);
		panel_NganhKHHH.add(lb_DSTS_KHHH);

		table_KHHH = new JTable();
		table_KHHH.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_KHHH.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1" }));
		table_KHHH.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_KHHH.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_KHHH.getColumnModel().getColumn(2).setMinWidth(33);
		table_KHHH.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_KHHH.getColumnModel().getColumn(4).setMinWidth(29);
		table_KHHH.getColumnModel().getColumn(5).setPreferredWidth(59);

		scrollPane_KHHH = new JScrollPane(table_KHHH);
		scrollPane_KHHH.setBounds(51, 104, 1041, 477);
		panel_NganhKHHH.add(scrollPane_KHHH);

		lbCTHB_KHHH = new JLabel("Chỉ tiêu học bạ");
		lbCTHB_KHHH.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbCTHB_KHHH.setBounds(730, 8, 129, 32);
		panel_NganhKHHH.add(lbCTHB_KHHH);

		cboCTDT_KHHH = new JComboBox();
		cboCTDT_KHHH
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTDT_KHHH.setBounds(641, 14, 49, 21);
		panel_NganhKHHH.add(cboCTDT_KHHH);

		cboCTHB_KHHH = new JComboBox();
		cboCTHB_KHHH
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTHB_KHHH.setBounds(849, 14, 49, 21);
		panel_NganhKHHH.add(cboCTHB_KHHH);

		// khoa kỹ thuật - trúng tuyển ngành khoa học hàng hải
		panel_NganhKHHH_TT = new JPanel();
		panel_NganhKHHH_TT.setBackground(Color.WHITE);
		panel_NganhKHHH_TT.setBounds(234, 35, 1171, 610);
		panel_KhoaKTH.add(panel_NganhKHHH_TT);

		table_KHHH_TT = new JTable();
		table_KHHH_TT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_KHHH_TT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null } },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1", "STT" }));
		table_KHHH_TT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_KHHH_TT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_KHHH_TT.getColumnModel().getColumn(2).setMinWidth(33);
		table_KHHH_TT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_KHHH_TT.getColumnModel().getColumn(4).setMinWidth(29);
		table_KHHH_TT.getColumnModel().getColumn(5).setPreferredWidth(59);
		table_KHHH_TT.getColumnModel().getColumn(6).setCellRenderer(new STTCellRenderer());
		panel_NganhKHHH_TT.setLayout(null);

		scrollPane_KHHH_TT = new JScrollPane(table_KHHH_TT);
		scrollPane_KHHH_TT.setBounds(85, 77, 996, 448);
		panel_NganhKHHH_TT.add(scrollPane_KHHH_TT);

		lbDSTT_KHHH = new JLabel("DANH SÁCH THÍ SINH TRÚNG TUYỂN");
		lbDSTT_KHHH.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbDSTT_KHHH.setBounds(382, 10, 363, 34);
		panel_NganhKHHH_TT.add(lbDSTT_KHHH);

		btnQL_KHHH = new JButton("Quay lại");
		btnQL_KHHH.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQL_KHHH.setBounds(985, 550, 91, 25);
		btnQL_KHHH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaKTH.remove(panel_NganhKTCK_TT);
				panel_KhoaKTH.remove(panel_NganhKTOT_TT);
				panel_KhoaKTH.remove(panel_NganhKHHH_TT);
				panel_KhoaKTH.remove(panel_NganhCDT_TT);
				panel_KhoaKTH.remove(panel_NganhKTOT);
				panel_KhoaKTH.remove(panel_NganhKTCK);
				panel_KhoaKTH.remove(panel_NganhCDT);
				panel_KhoaKTH.add(panel_NganhKHHH);
				panel_KhoaKTH.revalidate();
				panel_KhoaKTH.repaint();
			}
		});
		panel_NganhKHHH_TT.add(btnQL_KHHH);

		btnXF_KHHH = new JButton("Xuất file");
		btnXF_KHHH.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_KHHH.getSelectedItem();
				value2 = (String) cboCTHB_KHHH.getSelectedItem();
				try {
					JOptionPane.showMessageDialog(null, "Xuất file thành công!");
					connect_thiSinh.XuatFile_KHHH(Integer.parseInt(value1), Integer.parseInt(value2));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnXF_KHHH.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXF_KHHH.setBounds(873, 550, 91, 25);
		panel_NganhKHHH_TT.add(btnXF_KHHH);

		// khoa kỹ thuật - ngành cơ điện tử

		panel_NganhCDT = new JPanel();
		panel_NganhCDT.setBackground(Color.WHITE);
		panel_NganhCDT.setBounds(234, 35, 1171, 610);
		panel_KhoaKTH.add(panel_NganhCDT);
		panel_NganhCDT.setLayout(null);

		lbCTDT_CDT = new JLabel("Chỉ tiêu điểm thi");
		lbCTDT_CDT.setBounds(514, 8, 129, 32);
		panel_NganhCDT.add(lbCTDT_CDT);
		lbCTDT_CDT.setFont(new Font("Tahoma", Font.BOLD, 14));

		btn_XDSTT_CDT = new JButton("Xuất danh sách trúng tuyển");
		btn_XDSTT_CDT.setBounds(952, 6, 207, 32);
		panel_NganhCDT.add(btn_XDSTT_CDT);
		btn_XDSTT_CDT.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_CDT.getSelectedItem();
				value2 = (String) cboCTHB_CDT.getSelectedItem();
				panel_KhoaKTH.remove(panel_NganhKTCK);
				panel_KhoaKTH.remove(panel_NganhKTOT_TT);
				panel_KhoaKTH.remove(panel_NganhKHHH_TT);
				panel_KhoaKTH.remove(panel_NganhKTCK_TT);
				panel_KhoaKTH.remove(panel_NganhKTOT);
				panel_KhoaKTH.remove(panel_NganhKHHH);
				panel_KhoaKTH.remove(panel_NganhCDT);
				panel_KhoaKTH.add(panel_NganhCDT_TT);
				panel_KhoaKTH.revalidate();
				panel_KhoaKTH.repaint();
				showData_CDT_TT(connect_thiSinh.TrungTuyen_CDT(Integer.parseInt(value1), Integer.parseInt(value2)));
			}
		});
		btn_XDSTT_CDT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_XDSTT_CDT.setBackground(SystemColor.info);

		separator_CDT = new JSeparator();
		separator_CDT.setBounds(0, 49, 1182, 2);
		panel_NganhCDT.add(separator_CDT);

		lb_DSTS_CDT = new JLabel("DANH SÁCH THÍ SINH");
		lb_DSTS_CDT.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb_DSTS_CDT.setBounds(458, 55, 207, 32);
		panel_NganhCDT.add(lb_DSTS_CDT);

		table_CDT = new JTable();
		table_CDT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_CDT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1" }));
		table_CDT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_CDT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_CDT.getColumnModel().getColumn(2).setMinWidth(33);
		table_CDT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_CDT.getColumnModel().getColumn(4).setMinWidth(29);
		table_CDT.getColumnModel().getColumn(5).setPreferredWidth(59);

		scrollPane_CDT = new JScrollPane(table_CDT);
		scrollPane_CDT.setBounds(51, 104, 1041, 477);
		panel_NganhCDT.add(scrollPane_CDT);

		lbCTHB_CDT = new JLabel("Chỉ tiêu học bạ");
		lbCTHB_CDT.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbCTHB_CDT.setBounds(730, 8, 129, 32);
		panel_NganhCDT.add(lbCTHB_CDT);

		cboCTDT_CDT = new JComboBox();
		cboCTDT_CDT
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTDT_CDT.setBounds(641, 14, 49, 21);
		panel_NganhCDT.add(cboCTDT_CDT);

		cboCTHB_CDT = new JComboBox();
		cboCTHB_CDT
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTHB_CDT.setBounds(849, 14, 49, 21);
		panel_NganhCDT.add(cboCTHB_CDT);

		// khoa kỹ thuật - trúng tuyển ngành cơ điện tử
		panel_NganhCDT_TT = new JPanel();
		panel_NganhCDT_TT.setBackground(Color.WHITE);
		panel_NganhCDT_TT.setBounds(234, 35, 1171, 610);
		panel_KhoaKTH.add(panel_NganhCDT_TT);

		table_CDT_TT = new JTable();
		table_CDT_TT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_CDT_TT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null } },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1", "STT" }));
		table_CDT_TT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_CDT_TT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_CDT_TT.getColumnModel().getColumn(2).setMinWidth(33);
		table_CDT_TT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_CDT_TT.getColumnModel().getColumn(4).setMinWidth(29);
		table_CDT_TT.getColumnModel().getColumn(5).setPreferredWidth(59);
		table_CDT_TT.getColumnModel().getColumn(6).setCellRenderer(new STTCellRenderer());
		panel_NganhCDT_TT.setLayout(null);

		scrollPane_CDT_TT = new JScrollPane(table_CDT_TT);
		scrollPane_CDT_TT.setBounds(85, 77, 996, 448);
		panel_NganhCDT_TT.add(scrollPane_CDT_TT);

		lbDSTT_CDT = new JLabel("DANH SÁCH THÍ SINH TRÚNG TUYỂN");
		lbDSTT_CDT.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbDSTT_CDT.setBounds(382, 10, 363, 34);
		panel_NganhCDT_TT.add(lbDSTT_CDT);

		btnQL_CDT = new JButton("Quay lại");
		btnQL_CDT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQL_CDT.setBounds(985, 550, 91, 25);
		btnQL_CDT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaKTH.remove(panel_NganhKTCK_TT);
				panel_KhoaKTH.remove(panel_NganhKTOT_TT);
				panel_KhoaKTH.remove(panel_NganhKHHH_TT);
				panel_KhoaKTH.remove(panel_NganhCDT_TT);
				panel_KhoaKTH.remove(panel_NganhKTOT);
				panel_KhoaKTH.remove(panel_NganhKHHH);
				panel_KhoaKTH.remove(panel_NganhKTCK);
				panel_KhoaKTH.add(panel_NganhCDT);
				panel_KhoaKTH.revalidate();
				panel_KhoaKTH.repaint();
			}
		});
		panel_NganhCDT_TT.add(btnQL_CDT);

		btnXF_CDT = new JButton("Xuất file");
		btnXF_CDT.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_CDT.getSelectedItem();
				value2 = (String) cboCTHB_CDT.getSelectedItem();
				try {
					JOptionPane.showMessageDialog(null, "Xuất file thành công!");
					connect_thiSinh.XuatFile_CDT(Integer.parseInt(value1), Integer.parseInt(value2));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnXF_CDT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXF_CDT.setBounds(873, 550, 91, 25);
		panel_NganhCDT_TT.add(btnXF_CDT);

		// khoa kinh doanh và quản lí
		panel_KhoaQLKD = new JPanel();
		panel_KhoaQLKD.setBackground(Color.WHITE);
		panel_KhoaQLKD.setBounds(0, 35, 1440, 673);
		contentPane.add(panel_KhoaQLKD);
		panel_KhoaQLKD.setLayout(null);

		lbNHQLKD = new JLabel("Ngành học");
		lbNHQLKD.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbNHQLKD.setBounds(71, 45, 86, 32);
		panel_KhoaQLKD.add(lbNHQLKD);

		separator_QLKD = new JSeparator();
		separator_QLKD.setBounds(0, 35, 1402, 2);
		panel_KhoaQLKD.add(separator_QLKD);

		btn_NTMDT = new JButton("Thương mại điện tử");
		btn_NTMDT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaQLKD.remove(panel_NganhTMDT_TT);
				panel_KhoaQLKD.remove(panel_NganhKT_TT);
				panel_KhoaQLKD.remove(panel_NganhQLCL_TT);
				panel_KhoaQLKD.remove(panel_NganhMKT_TT);
				panel_KhoaQLKD.remove(panel_NganhKT);
				panel_KhoaQLKD.remove(panel_NganhQLCL);
				panel_KhoaQLKD.remove(panel_NganhMKT);
				panel_KhoaQLKD.add(panel_NganhTMDT);
				panel_KhoaQLKD.revalidate();
				panel_KhoaQLKD.repaint();
				showData_TMDT(connect_thiSinh.findAll_TMDT());
			}
		});
		btn_NTMDT.setBackground(SystemColor.info);
		btn_NTMDT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_NTMDT.setBounds(0, 84, 234, 36);
		panel_KhoaQLKD.add(btn_NTMDT);

		btn_NKT = new JButton("Kế toán");
		btn_NKT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaQLKD.remove(panel_NganhTMDT_TT);
				panel_KhoaQLKD.remove(panel_NganhKT_TT);
				panel_KhoaQLKD.remove(panel_NganhQLCL_TT);
				panel_KhoaQLKD.remove(panel_NganhMKT_TT);
				panel_KhoaQLKD.remove(panel_NganhTMDT);
				panel_KhoaQLKD.remove(panel_NganhQLCL);
				panel_KhoaQLKD.remove(panel_NganhMKT);
				panel_KhoaQLKD.add(panel_NganhKT);
				panel_KhoaQLKD.revalidate();
				panel_KhoaQLKD.repaint();
				showData_KT(connect_thiSinh.findAll_KT());
			}
		});
		btn_NKT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_NKT.setBackground(SystemColor.info);
		btn_NKT.setBounds(0, 118, 234, 36);
		panel_KhoaQLKD.add(btn_NKT);

		btn_NQLCL = new JButton("Quản lí chất lượng");
		btn_NQLCL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaQLKD.remove(panel_NganhTMDT_TT);
				panel_KhoaQLKD.remove(panel_NganhKT_TT);
				panel_KhoaQLKD.remove(panel_NganhQLCL_TT);
				panel_KhoaQLKD.remove(panel_NganhMKT_TT);
				panel_KhoaQLKD.remove(panel_NganhKT);
				panel_KhoaQLKD.remove(panel_NganhTMDT);
				panel_KhoaQLKD.remove(panel_NganhMKT);
				panel_KhoaQLKD.add(panel_NganhQLCL);
				panel_KhoaQLKD.revalidate();
				panel_KhoaQLKD.repaint();
				showData_QLCL(connect_thiSinh.findAll_QLCL());
			}
		});
		btn_NQLCL.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_NQLCL.setBackground(SystemColor.info);
		btn_NQLCL.setBounds(0, 152, 234, 36);
		panel_KhoaQLKD.add(btn_NQLCL);

		btn_NMKT = new JButton("Marketing");
		btn_NMKT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaQLKD.remove(panel_NganhTMDT_TT);
				panel_KhoaQLKD.remove(panel_NganhKT_TT);
				panel_KhoaQLKD.remove(panel_NganhQLCL_TT);
				panel_KhoaQLKD.remove(panel_NganhMKT_TT);
				panel_KhoaQLKD.remove(panel_NganhKT);
				panel_KhoaQLKD.remove(panel_NganhQLCL);
				panel_KhoaQLKD.remove(panel_NganhTMDT);
				panel_KhoaQLKD.add(panel_NganhMKT);
				panel_KhoaQLKD.revalidate();
				panel_KhoaQLKD.repaint();
				showData_MKT(connect_thiSinh.findAll_MKT());
			}
		});
		btn_NMKT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_NMKT.setBackground(SystemColor.info);
		btn_NMKT.setBounds(0, 186, 234, 36);
		panel_KhoaQLKD.add(btn_NMKT);

		lbKQLKD = new JLabel("KHOA QUẢN LÍ KINH DOANH");
		lbKQLKD.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbKQLKD.setBounds(645, 1, 270, 32);
		panel_KhoaQLKD.add(lbKQLKD);

		// khoa quản lí kinh doanh - ngành thương mại điện tử

		panel_NganhTMDT = new JPanel();
		panel_NganhTMDT.setBackground(Color.WHITE);
		panel_NganhTMDT.setBounds(234, 35, 1171, 610);
		panel_KhoaQLKD.add(panel_NganhTMDT);
		panel_NganhTMDT.setLayout(null);

		lbCTDT_TMDT = new JLabel("Chỉ tiêu điểm thi");
		lbCTDT_TMDT.setBounds(514, 8, 129, 32);
		panel_NganhTMDT.add(lbCTDT_TMDT);
		lbCTDT_TMDT.setFont(new Font("Tahoma", Font.BOLD, 14));

		btn_XDSTT_TMDT = new JButton("Xuất danh sách trúng tuyển");
		btn_XDSTT_TMDT.setBounds(952, 6, 207, 32);
		panel_NganhTMDT.add(btn_XDSTT_TMDT);
		btn_XDSTT_TMDT.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_TMDT.getSelectedItem();
				value2 = (String) cboCTHB_TMDT.getSelectedItem();
				panel_KhoaQLKD.remove(panel_NganhTMDT);
				panel_KhoaQLKD.remove(panel_NganhKT_TT);
				panel_KhoaQLKD.remove(panel_NganhQLCL_TT);
				panel_KhoaQLKD.remove(panel_NganhMKT_TT);
				panel_KhoaQLKD.remove(panel_NganhKT);
				panel_KhoaQLKD.remove(panel_NganhQLCL);
				panel_KhoaQLKD.remove(panel_NganhMKT);
				panel_KhoaQLKD.add(panel_NganhTMDT_TT);
				panel_KhoaQLKD.revalidate();
				panel_KhoaQLKD.repaint();
				showData_TMDT_TT(connect_thiSinh.TrungTuyen_TMDT(Integer.parseInt(value1), Integer.parseInt(value2)));
			}
		});
		btn_XDSTT_TMDT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_XDSTT_TMDT.setBackground(SystemColor.info);

		separator_TMDT = new JSeparator();
		separator_TMDT.setBounds(0, 49, 1182, 2);
		panel_NganhTMDT.add(separator_TMDT);

		lb_DSTS_TMDT = new JLabel("DANH SÁCH THÍ SINH");
		lb_DSTS_TMDT.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb_DSTS_TMDT.setBounds(458, 55, 207, 32);
		panel_NganhTMDT.add(lb_DSTS_TMDT);

		table_TMDT = new JTable();
		table_TMDT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_TMDT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1" }));
		table_TMDT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_TMDT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_TMDT.getColumnModel().getColumn(2).setMinWidth(33);
		table_TMDT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_TMDT.getColumnModel().getColumn(4).setMinWidth(29);
		table_TMDT.getColumnModel().getColumn(5).setPreferredWidth(59);

		scrollPane_TMDT = new JScrollPane(table_TMDT);
		scrollPane_TMDT.setBounds(51, 104, 1041, 477);
		panel_NganhTMDT.add(scrollPane_TMDT);

		lbCTHB_TMDT = new JLabel("Chỉ tiêu học bạ");
		lbCTHB_TMDT.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbCTHB_TMDT.setBounds(730, 8, 129, 32);
		panel_NganhTMDT.add(lbCTHB_TMDT);

		cboCTDT_TMDT = new JComboBox();
		cboCTDT_TMDT
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTDT_TMDT.setBounds(641, 14, 49, 21);
		panel_NganhTMDT.add(cboCTDT_TMDT);

		cboCTHB_TMDT = new JComboBox();
		cboCTHB_TMDT
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTHB_TMDT.setBounds(849, 14, 49, 21);
		panel_NganhTMDT.add(cboCTHB_TMDT);

		// khoa quản lí kinh doanh - trúng tuyển ngành thương mại điện tử
		panel_NganhTMDT_TT = new JPanel();
		panel_NganhTMDT_TT.setBackground(Color.WHITE);
		panel_NganhTMDT_TT.setBounds(234, 35, 1171, 610);
		panel_KhoaQLKD.add(panel_NganhTMDT_TT);

		table_TMDT_TT = new JTable();
		table_TMDT_TT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_TMDT_TT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null } },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1", "STT" }));
		table_TMDT_TT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_TMDT_TT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_TMDT_TT.getColumnModel().getColumn(2).setMinWidth(33);
		table_TMDT_TT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_TMDT_TT.getColumnModel().getColumn(4).setMinWidth(29);
		table_TMDT_TT.getColumnModel().getColumn(5).setPreferredWidth(59);
		table_TMDT_TT.getColumnModel().getColumn(6).setCellRenderer(new STTCellRenderer());
		panel_NganhTMDT_TT.setLayout(null);

		scrollPane_TMDT_TT = new JScrollPane(table_TMDT_TT);
		scrollPane_TMDT_TT.setBounds(85, 77, 996, 448);
		panel_NganhTMDT_TT.add(scrollPane_TMDT_TT);

		lbDSTT_TMDT = new JLabel("DANH SÁCH THÍ SINH TRÚNG TUYỂN");
		lbDSTT_TMDT.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbDSTT_TMDT.setBounds(382, 10, 363, 34);
		panel_NganhTMDT_TT.add(lbDSTT_TMDT);

		btnQL_TMDT = new JButton("Quay lại");
		btnQL_TMDT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQL_TMDT.setBounds(985, 550, 91, 25);
		btnQL_TMDT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaQLKD.remove(panel_NganhTMDT_TT);
				panel_KhoaQLKD.remove(panel_NganhKT_TT);
				panel_KhoaQLKD.remove(panel_NganhQLCL_TT);
				panel_KhoaQLKD.remove(panel_NganhMKT_TT);
				panel_KhoaQLKD.remove(panel_NganhKT);
				panel_KhoaQLKD.remove(panel_NganhQLCL);
				panel_KhoaQLKD.remove(panel_NganhMKT);
				panel_KhoaQLKD.add(panel_NganhTMDT);
				panel_KhoaQLKD.revalidate();
				panel_KhoaQLKD.repaint();
			}
		});
		panel_NganhTMDT_TT.add(btnQL_TMDT);

		btnXF_TMDT = new JButton("Xuất file");
		btnXF_TMDT.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_TMDT.getSelectedItem();
				value2 = (String) cboCTHB_TMDT.getSelectedItem();
				try {
					JOptionPane.showMessageDialog(null, "Xuất file thành công!");
					connect_thiSinh.XuatFile_TMDT(Integer.parseInt(value1), Integer.parseInt(value2));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnXF_TMDT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXF_TMDT.setBounds(873, 550, 91, 25);
		panel_NganhTMDT_TT.add(btnXF_TMDT);

		// khoa quản lí kinh doanh - ngành kế toán

		panel_NganhKT = new JPanel();
		panel_NganhKT.setBackground(Color.WHITE);
		panel_NganhKT.setBounds(234, 35, 1171, 610);
		panel_KhoaQLKD.add(panel_NganhKT);
		panel_NganhKT.setLayout(null);

		lbCTDT_KT = new JLabel("Chỉ tiêu điểm thi");
		lbCTDT_KT.setBounds(514, 8, 129, 32);
		panel_NganhKT.add(lbCTDT_KT);
		lbCTDT_KT.setFont(new Font("Tahoma", Font.BOLD, 14));

		btn_XDSTT_KT = new JButton("Xuất danh sách trúng tuyển");
		btn_XDSTT_KT.setBounds(952, 6, 207, 32);
		panel_NganhKT.add(btn_XDSTT_KT);
		btn_XDSTT_KT.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_KT.getSelectedItem();
				value2 = (String) cboCTHB_KT.getSelectedItem();
				panel_KhoaQLKD.remove(panel_NganhTMDT);
				panel_KhoaQLKD.remove(panel_NganhTMDT_TT);
				panel_KhoaQLKD.remove(panel_NganhQLCL_TT);
				panel_KhoaQLKD.remove(panel_NganhMKT_TT);
				panel_KhoaQLKD.remove(panel_NganhKT);
				panel_KhoaQLKD.remove(panel_NganhQLCL);
				panel_KhoaQLKD.remove(panel_NganhMKT);
				panel_KhoaQLKD.add(panel_NganhKT_TT);
				panel_KhoaQLKD.revalidate();
				panel_KhoaQLKD.repaint();
				showData_KT_TT(connect_thiSinh.TrungTuyen_KT(Integer.parseInt(value1), Integer.parseInt(value2)));
			}
		});
		btn_XDSTT_KT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_XDSTT_KT.setBackground(SystemColor.info);

		separator_KT = new JSeparator();
		separator_KT.setBounds(0, 49, 1182, 2);
		panel_NganhKT.add(separator_KT);

		lb_DSTS_KT = new JLabel("DANH SÁCH THÍ SINH");
		lb_DSTS_KT.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb_DSTS_KT.setBounds(458, 55, 207, 32);
		panel_NganhKT.add(lb_DSTS_KT);

		table_KT = new JTable();
		table_KT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_KT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1" }));
		table_KT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_KT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_KT.getColumnModel().getColumn(2).setMinWidth(33);
		table_KT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_KT.getColumnModel().getColumn(4).setMinWidth(29);
		table_KT.getColumnModel().getColumn(5).setPreferredWidth(59);

		scrollPane_KT = new JScrollPane(table_KT);
		scrollPane_KT.setBounds(51, 104, 1041, 477);
		panel_NganhKT.add(scrollPane_KT);

		lbCTHB_KT = new JLabel("Chỉ tiêu học bạ");
		lbCTHB_KT.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbCTHB_KT.setBounds(730, 8, 129, 32);
		panel_NganhKT.add(lbCTHB_KT);

		cboCTDT_KT = new JComboBox();
		cboCTDT_KT
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTDT_KT.setBounds(641, 14, 49, 21);
		panel_NganhKT.add(cboCTDT_KT);

		cboCTHB_KT = new JComboBox();
		cboCTHB_KT
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTHB_KT.setBounds(849, 14, 49, 21);
		panel_NganhKT.add(cboCTHB_KT);

		// khoa quản lí kinh doanh - trúng tuyển ngành kế toán
		panel_NganhKT_TT = new JPanel();
		panel_NganhKT_TT.setBackground(Color.WHITE);
		panel_NganhKT_TT.setBounds(234, 35, 1171, 610);
		panel_KhoaQLKD.add(panel_NganhKT_TT);

		table_KT_TT = new JTable();
		table_KT_TT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_KT_TT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null } },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1", "STT" }));
		table_KT_TT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_KT_TT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_KT_TT.getColumnModel().getColumn(2).setMinWidth(33);
		table_KT_TT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_KT_TT.getColumnModel().getColumn(4).setMinWidth(29);
		table_KT_TT.getColumnModel().getColumn(5).setPreferredWidth(59);
		table_KT_TT.getColumnModel().getColumn(6).setCellRenderer(new STTCellRenderer());
		panel_NganhKT_TT.setLayout(null);

		scrollPane_KT_TT = new JScrollPane(table_KT_TT);
		scrollPane_KT_TT.setBounds(85, 77, 996, 448);
		panel_NganhKT_TT.add(scrollPane_KT_TT);

		lbDSTT_KT = new JLabel("DANH SÁCH THÍ SINH TRÚNG TUYỂN");
		lbDSTT_KT.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbDSTT_KT.setBounds(382, 10, 363, 34);
		panel_NganhKT_TT.add(lbDSTT_KT);

		btnQL_KT = new JButton("Quay lại");
		btnQL_KT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQL_KT.setBounds(985, 550, 91, 25);
		btnQL_KT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaQLKD.remove(panel_NganhTMDT_TT);
				panel_KhoaQLKD.remove(panel_NganhKT_TT);
				panel_KhoaQLKD.remove(panel_NganhQLCL_TT);
				panel_KhoaQLKD.remove(panel_NganhMKT_TT);
				panel_KhoaQLKD.remove(panel_NganhTMDT);
				panel_KhoaQLKD.remove(panel_NganhQLCL);
				panel_KhoaQLKD.remove(panel_NganhMKT);
				panel_KhoaQLKD.add(panel_NganhKT);
				panel_KhoaQLKD.revalidate();
				panel_KhoaQLKD.repaint();
			}
		});
		panel_NganhKT_TT.add(btnQL_KT);

		btnXF_KT = new JButton("Xuất file");
		btnXF_KT.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_KT.getSelectedItem();
				value2 = (String) cboCTHB_KT.getSelectedItem();
				try {
					JOptionPane.showMessageDialog(null, "Xuất file thành công!");
					connect_thiSinh.XuatFile_KT(Integer.parseInt(value1), Integer.parseInt(value2));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnXF_KT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXF_KT.setBounds(873, 550, 91, 25);
		panel_NganhKT_TT.add(btnXF_KT);

		// khoa quản lí kinh doanh - ngành quản lí chất lượng

		panel_NganhQLCL = new JPanel();
		panel_NganhQLCL.setBackground(Color.WHITE);
		panel_NganhQLCL.setBounds(234, 35, 1171, 610);
		panel_KhoaQLKD.add(panel_NganhQLCL);
		panel_NganhQLCL.setLayout(null);

		lbCTDT_QLCL = new JLabel("Chỉ tiêu điểm thi");
		lbCTDT_QLCL.setBounds(514, 8, 129, 32);
		panel_NganhQLCL.add(lbCTDT_QLCL);
		lbCTDT_QLCL.setFont(new Font("Tahoma", Font.BOLD, 14));

		btn_XDSTT_QLCL = new JButton("Xuất danh sách trúng tuyển");
		btn_XDSTT_QLCL.setBounds(952, 6, 207, 32);
		panel_NganhQLCL.add(btn_XDSTT_QLCL);
		btn_XDSTT_QLCL.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_QLCL.getSelectedItem();
				value2 = (String) cboCTHB_QLCL.getSelectedItem();
				panel_KhoaQLKD.remove(panel_NganhTMDT);
				panel_KhoaQLKD.remove(panel_NganhKT_TT);
				panel_KhoaQLKD.remove(panel_NganhTMDT_TT);
				panel_KhoaQLKD.remove(panel_NganhMKT_TT);
				panel_KhoaQLKD.remove(panel_NganhKT);
				panel_KhoaQLKD.remove(panel_NganhQLCL);
				panel_KhoaQLKD.remove(panel_NganhMKT);
				panel_KhoaQLKD.add(panel_NganhQLCL_TT);
				panel_KhoaQLKD.revalidate();
				panel_KhoaQLKD.repaint();
				showData_QLCL_TT(connect_thiSinh.TrungTuyen_QLCL(Integer.parseInt(value1), Integer.parseInt(value2)));
			}
		});
		btn_XDSTT_QLCL.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_XDSTT_QLCL.setBackground(SystemColor.info);

		separator_QLCL = new JSeparator();
		separator_QLCL.setBounds(0, 49, 1182, 2);
		panel_NganhQLCL.add(separator_QLCL);

		lb_DSTS_QLCL = new JLabel("DANH SÁCH THÍ SINH");
		lb_DSTS_QLCL.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb_DSTS_QLCL.setBounds(458, 55, 207, 32);
		panel_NganhQLCL.add(lb_DSTS_QLCL);

		table_QLCL = new JTable();
		table_QLCL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_QLCL.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1" }));
		table_QLCL.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_QLCL.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_QLCL.getColumnModel().getColumn(2).setMinWidth(33);
		table_QLCL.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_QLCL.getColumnModel().getColumn(4).setMinWidth(29);
		table_QLCL.getColumnModel().getColumn(5).setPreferredWidth(59);

		scrollPane_QLCL = new JScrollPane(table_QLCL);
		scrollPane_QLCL.setBounds(51, 104, 1041, 477);
		panel_NganhQLCL.add(scrollPane_QLCL);

		lbCTHB_QLCL = new JLabel("Chỉ tiêu học bạ");
		lbCTHB_QLCL.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbCTHB_QLCL.setBounds(730, 8, 129, 32);
		panel_NganhQLCL.add(lbCTHB_QLCL);

		cboCTDT_QLCL = new JComboBox();
		cboCTDT_QLCL
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTDT_QLCL.setBounds(641, 14, 49, 21);
		panel_NganhQLCL.add(cboCTDT_QLCL);

		cboCTHB_QLCL = new JComboBox();
		cboCTHB_QLCL
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTHB_QLCL.setBounds(849, 14, 49, 21);
		panel_NganhQLCL.add(cboCTHB_QLCL);

		// khoa quản lí kinh doanh - trúng tuyển ngành quản lí chất lượng
		panel_NganhQLCL_TT = new JPanel();
		panel_NganhQLCL_TT.setBackground(Color.WHITE);
		panel_NganhQLCL_TT.setBounds(234, 35, 1171, 610);
		panel_KhoaQLKD.add(panel_NganhQLCL_TT);

		table_QLCL_TT = new JTable();
		table_QLCL_TT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_QLCL_TT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null } },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1", "STT" }));
		table_QLCL_TT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_QLCL_TT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_QLCL_TT.getColumnModel().getColumn(2).setMinWidth(33);
		table_QLCL_TT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_QLCL_TT.getColumnModel().getColumn(4).setMinWidth(29);
		table_QLCL_TT.getColumnModel().getColumn(5).setPreferredWidth(59);
		table_QLCL_TT.getColumnModel().getColumn(6).setCellRenderer(new STTCellRenderer());
		panel_NganhQLCL_TT.setLayout(null);

		scrollPane_QLCL_TT = new JScrollPane(table_QLCL_TT);
		scrollPane_QLCL_TT.setBounds(85, 77, 996, 448);
		panel_NganhQLCL_TT.add(scrollPane_QLCL_TT);

		lbDSTT_QLCL = new JLabel("DANH SÁCH THÍ SINH TRÚNG TUYỂN");
		lbDSTT_QLCL.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbDSTT_QLCL.setBounds(382, 10, 363, 34);
		panel_NganhQLCL_TT.add(lbDSTT_QLCL);

		btnQL_QLCL = new JButton("Quay lại");
		btnQL_QLCL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQL_QLCL.setBounds(985, 550, 91, 25);
		btnQL_QLCL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaQLKD.remove(panel_NganhTMDT_TT);
				panel_KhoaQLKD.remove(panel_NganhKT_TT);
				panel_KhoaQLKD.remove(panel_NganhQLCL_TT);
				panel_KhoaQLKD.remove(panel_NganhMKT_TT);
				panel_KhoaQLKD.remove(panel_NganhKT);
				panel_KhoaQLKD.remove(panel_NganhTMDT);
				panel_KhoaQLKD.remove(panel_NganhMKT);
				panel_KhoaQLKD.add(panel_NganhQLCL);
				panel_KhoaQLKD.revalidate();
				panel_KhoaQLKD.repaint();
			}
		});
		panel_NganhQLCL_TT.add(btnQL_QLCL);

		btnXF_QLCL = new JButton("Xuất file");
		btnXF_QLCL.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_QLCL.getSelectedItem();
				value2 = (String) cboCTHB_QLCL.getSelectedItem();
				try {
					JOptionPane.showMessageDialog(null, "Xuất file thành công!");
					connect_thiSinh.XuatFile_QLCL(Integer.parseInt(value1), Integer.parseInt(value2));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnXF_QLCL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXF_QLCL.setBounds(873, 550, 91, 25);
		panel_NganhQLCL_TT.add(btnXF_QLCL);

		// khoa quản lí kinh doanh - ngành marketing

		panel_NganhMKT = new JPanel();
		panel_NganhMKT.setBackground(Color.WHITE);
		panel_NganhMKT.setBounds(234, 35, 1171, 610);
		panel_KhoaQLKD.add(panel_NganhMKT);
		panel_NganhMKT.setLayout(null);

		lbCTDT_MKT = new JLabel("Chỉ tiêu điểm thi");
		lbCTDT_MKT.setBounds(514, 8, 129, 32);
		panel_NganhMKT.add(lbCTDT_MKT);
		lbCTDT_MKT.setFont(new Font("Tahoma", Font.BOLD, 14));

		btn_XDSTT_MKT = new JButton("Xuất danh sách trúng tuyển");
		btn_XDSTT_MKT.setBounds(952, 6, 207, 32);
		panel_NganhMKT.add(btn_XDSTT_MKT);
		btn_XDSTT_MKT.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_MKT.getSelectedItem();
				value2 = (String) cboCTHB_MKT.getSelectedItem();
				panel_KhoaQLKD.remove(panel_NganhTMDT);
				panel_KhoaQLKD.remove(panel_NganhKT_TT);
				panel_KhoaQLKD.remove(panel_NganhQLCL_TT);
				panel_KhoaQLKD.remove(panel_NganhTMDT_TT);
				panel_KhoaQLKD.remove(panel_NganhKT);
				panel_KhoaQLKD.remove(panel_NganhQLCL);
				panel_KhoaQLKD.remove(panel_NganhMKT);
				panel_KhoaQLKD.add(panel_NganhMKT_TT);
				panel_KhoaQLKD.revalidate();
				panel_KhoaQLKD.repaint();
				showData_MKT_TT(connect_thiSinh.TrungTuyen_MKT(Integer.parseInt(value1), Integer.parseInt(value2)));
			}
		});
		btn_XDSTT_MKT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_XDSTT_MKT.setBackground(SystemColor.info);

		separator_MKT = new JSeparator();
		separator_MKT.setBounds(0, 49, 1182, 2);
		panel_NganhMKT.add(separator_MKT);

		lb_DSTS_MKT = new JLabel("DANH SÁCH THÍ SINH");
		lb_DSTS_MKT.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb_DSTS_MKT.setBounds(458, 55, 207, 32);
		panel_NganhMKT.add(lb_DSTS_MKT);

		table_MKT = new JTable();
		table_MKT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_MKT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1" }));
		table_MKT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_MKT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_MKT.getColumnModel().getColumn(2).setMinWidth(33);
		table_MKT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_MKT.getColumnModel().getColumn(4).setMinWidth(29);
		table_MKT.getColumnModel().getColumn(5).setPreferredWidth(59);

		scrollPane_MKT = new JScrollPane(table_MKT);
		scrollPane_MKT.setBounds(51, 104, 1041, 477);
		panel_NganhMKT.add(scrollPane_MKT);

		lbCTHB_MKT = new JLabel("Chỉ tiêu học bạ");
		lbCTHB_MKT.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbCTHB_MKT.setBounds(730, 8, 129, 32);
		panel_NganhMKT.add(lbCTHB_MKT);

		cboCTDT_MKT = new JComboBox();
		cboCTDT_MKT
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTDT_MKT.setBounds(641, 14, 49, 21);
		panel_NganhMKT.add(cboCTDT_MKT);

		cboCTHB_MKT = new JComboBox();
		cboCTHB_MKT
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboCTHB_MKT.setBounds(849, 14, 49, 21);
		panel_NganhMKT.add(cboCTHB_MKT);

		// khoa quản lí kinh doanh - trúng tuyển ngành marketing
		panel_NganhMKT_TT = new JPanel();
		panel_NganhMKT_TT.setBackground(Color.WHITE);
		panel_NganhMKT_TT.setBounds(234, 35, 1171, 610);
		panel_KhoaQLKD.add(panel_NganhMKT_TT);

		table_MKT_TT = new JTable();
		table_MKT_TT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_MKT_TT.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null } },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh",
						"N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1", "STT" }));
		table_MKT_TT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_MKT_TT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_MKT_TT.getColumnModel().getColumn(2).setMinWidth(33);
		table_MKT_TT.getColumnModel().getColumn(3).setPreferredWidth(59);
		table_MKT_TT.getColumnModel().getColumn(4).setMinWidth(29);
		table_MKT_TT.getColumnModel().getColumn(5).setPreferredWidth(59);
		table_MKT_TT.getColumnModel().getColumn(6).setCellRenderer(new STTCellRenderer());
		panel_NganhMKT_TT.setLayout(null);

		scrollPane_MKT_TT = new JScrollPane(table_MKT_TT);
		scrollPane_MKT_TT.setBounds(85, 77, 996, 448);
		panel_NganhMKT_TT.add(scrollPane_MKT_TT);

		lbDSTT_MKT = new JLabel("DANH SÁCH THÍ SINH TRÚNG TUYỂN");
		lbDSTT_MKT.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbDSTT_MKT.setBounds(382, 10, 363, 34);
		panel_NganhMKT_TT.add(lbDSTT_MKT);

		btnQL_MKT = new JButton("Quay lại");
		btnQL_MKT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQL_MKT.setBounds(985, 550, 91, 25);
		btnQL_MKT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_KhoaQLKD.remove(panel_NganhTMDT_TT);
				panel_KhoaQLKD.remove(panel_NganhKT_TT);
				panel_KhoaQLKD.remove(panel_NganhQLCL_TT);
				panel_KhoaQLKD.remove(panel_NganhMKT_TT);
				panel_KhoaQLKD.remove(panel_NganhKT);
				panel_KhoaQLKD.remove(panel_NganhQLCL);
				panel_KhoaQLKD.remove(panel_NganhTMDT);
				panel_KhoaQLKD.add(panel_NganhMKT);
				panel_KhoaQLKD.revalidate();
				panel_KhoaQLKD.repaint();
			}
		});
		panel_NganhMKT_TT.add(btnQL_MKT);

		btnXF_MKT = new JButton("Xuất file");
		btnXF_MKT.addActionListener(new ActionListener() {
			private String value1;
			private String value2;

			public void actionPerformed(ActionEvent e) {
				value1 = (String) cboCTDT_MKT.getSelectedItem();
				value2 = (String) cboCTHB_MKT.getSelectedItem();
				try {
					JOptionPane.showMessageDialog(null, "Xuất file thành công!");
					connect_thiSinh.XuatFile_MKT(Integer.parseInt(value1), Integer.parseInt(value2));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnXF_MKT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXF_MKT.setBounds(873, 550, 91, 25);
		panel_NganhMKT_TT.add(btnXF_MKT);

		// Nội dung quản lí điểm thi
		panel_QuanLiDiemThi = new JPanel();
		panel_QuanLiDiemThi.setBackground(Color.WHITE);
		panel_QuanLiDiemThi.setBounds(0, 35, 1440, 673);
		contentPane.add(panel_QuanLiDiemThi);
		panel_QuanLiDiemThi.setLayout(null);

		lbKhoiThi = new JLabel("KHỐI THI");
		lbKhoiThi.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbKhoiThi.setBounds(677, 5, 103, 29);
		panel_QuanLiDiemThi.add(lbKhoiThi);

		separatorKT = new JSeparator();
		separatorKT.setBounds(0, 39, 1430, 2);
		panel_QuanLiDiemThi.add(separatorKT);

		btnA00 = new JButton("Khối A00");
		Image img10 = new ImageIcon(this.getClass().getResource("/image/A00.png")).getImage().getScaledInstance(20, 20,
				DO_NOTHING_ON_CLOSE);
		btnA00.setIcon(new ImageIcon(img10));
		btnA00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_QuanLiDiemThi.remove(panelA08);
				panel_QuanLiDiemThi.remove(panelA07);
				panel_QuanLiDiemThi.remove(panelA06);
				panel_QuanLiDiemThi.remove(panelA05);
				panel_QuanLiDiemThi.remove(panelA04);
				panel_QuanLiDiemThi.remove(panelA03);
				panel_QuanLiDiemThi.remove(panelA02);
				panel_QuanLiDiemThi.remove(panelA01);
				panel_QuanLiDiemThi.add(panelA00);
				panel_QuanLiDiemThi.revalidate();
				panel_QuanLiDiemThi.repaint();
			}
		});
		btnA00.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnA00.setBackground(SystemColor.activeCaption);
		btnA00.setBounds(0, 39, 162, 36);
		panel_QuanLiDiemThi.add(btnA00);

		btnA01 = new JButton("Khối A01");
		Image img11 = new ImageIcon(this.getClass().getResource("/image/A01.png")).getImage().getScaledInstance(20, 20,
				DO_NOTHING_ON_CLOSE);
		btnA01.setIcon(new ImageIcon(img11));
		btnA01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_QuanLiDiemThi.remove(panelA08);
				panel_QuanLiDiemThi.remove(panelA07);
				panel_QuanLiDiemThi.remove(panelA06);
				panel_QuanLiDiemThi.remove(panelA05);
				panel_QuanLiDiemThi.remove(panelA04);
				panel_QuanLiDiemThi.remove(panelA03);
				panel_QuanLiDiemThi.remove(panelA02);
				panel_QuanLiDiemThi.remove(panelA00);
				panel_QuanLiDiemThi.add(panelA01);
				panel_QuanLiDiemThi.revalidate();
				panel_QuanLiDiemThi.repaint();
			}
		});
		btnA01.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnA01.setBackground(SystemColor.activeCaption);
		btnA01.setBounds(160, 39, 162, 36);
		panel_QuanLiDiemThi.add(btnA01);

		btnA02 = new JButton("Khối A02");
		Image img12 = new ImageIcon(this.getClass().getResource("/image/A02.png")).getImage().getScaledInstance(20, 20,
				DO_NOTHING_ON_CLOSE);
		btnA02.setIcon(new ImageIcon(img12));
		btnA02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_QuanLiDiemThi.remove(panelA08);
				panel_QuanLiDiemThi.remove(panelA07);
				panel_QuanLiDiemThi.remove(panelA06);
				panel_QuanLiDiemThi.remove(panelA05);
				panel_QuanLiDiemThi.remove(panelA04);
				panel_QuanLiDiemThi.remove(panelA03);
				panel_QuanLiDiemThi.remove(panelA00);
				panel_QuanLiDiemThi.remove(panelA01);
				panel_QuanLiDiemThi.add(panelA02);
				panel_QuanLiDiemThi.revalidate();
				panel_QuanLiDiemThi.repaint();
			}
		});
		btnA02.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnA02.setBackground(SystemColor.activeCaption);
		btnA02.setBounds(320, 39, 162, 36);
		panel_QuanLiDiemThi.add(btnA02);

		btnA03 = new JButton("Khối A03");
		Image img13 = new ImageIcon(this.getClass().getResource("/image/A03.png")).getImage().getScaledInstance(20, 20,
				DO_NOTHING_ON_CLOSE);
		btnA03.setIcon(new ImageIcon(img13));
		btnA03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_QuanLiDiemThi.remove(panelA08);
				panel_QuanLiDiemThi.remove(panelA07);
				panel_QuanLiDiemThi.remove(panelA06);
				panel_QuanLiDiemThi.remove(panelA05);
				panel_QuanLiDiemThi.remove(panelA04);
				panel_QuanLiDiemThi.remove(panelA02);
				panel_QuanLiDiemThi.remove(panelA00);
				panel_QuanLiDiemThi.remove(panelA01);
				panel_QuanLiDiemThi.add(panelA03);
				panel_QuanLiDiemThi.revalidate();
				panel_QuanLiDiemThi.repaint();
			}
		});
		btnA03.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnA03.setBackground(SystemColor.activeCaption);
		btnA03.setBounds(480, 39, 162, 36);
		panel_QuanLiDiemThi.add(btnA03);

		btnA04 = new JButton("Khối A04");
		Image img14 = new ImageIcon(this.getClass().getResource("/image/A04.png")).getImage().getScaledInstance(20, 20,
				DO_NOTHING_ON_CLOSE);
		btnA04.setIcon(new ImageIcon(img14));
		btnA04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_QuanLiDiemThi.remove(panelA08);
				panel_QuanLiDiemThi.remove(panelA07);
				panel_QuanLiDiemThi.remove(panelA06);
				panel_QuanLiDiemThi.remove(panelA05);
				panel_QuanLiDiemThi.remove(panelA02);
				panel_QuanLiDiemThi.remove(panelA03);
				panel_QuanLiDiemThi.remove(panelA00);
				panel_QuanLiDiemThi.remove(panelA01);
				panel_QuanLiDiemThi.add(panelA04);
				panel_QuanLiDiemThi.revalidate();
				panel_QuanLiDiemThi.repaint();
			}
		});
		btnA04.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnA04.setBackground(SystemColor.activeCaption);
		btnA04.setBounds(640, 39, 162, 36);
		panel_QuanLiDiemThi.add(btnA04);

		btnA05 = new JButton("Khối A05");
		Image img15 = new ImageIcon(this.getClass().getResource("/image/A05.png")).getImage().getScaledInstance(20, 20,
				DO_NOTHING_ON_CLOSE);
		btnA05.setIcon(new ImageIcon(img15));
		btnA05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_QuanLiDiemThi.remove(panelA08);
				panel_QuanLiDiemThi.remove(panelA07);
				panel_QuanLiDiemThi.remove(panelA06);
				panel_QuanLiDiemThi.remove(panelA02);
				panel_QuanLiDiemThi.remove(panelA04);
				panel_QuanLiDiemThi.remove(panelA03);
				panel_QuanLiDiemThi.remove(panelA00);
				panel_QuanLiDiemThi.remove(panelA01);
				panel_QuanLiDiemThi.add(panelA05);
				panel_QuanLiDiemThi.revalidate();
				panel_QuanLiDiemThi.repaint();
			}
		});
		btnA05.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnA05.setBackground(SystemColor.activeCaption);
		btnA05.setBounds(800, 39, 162, 36);
		panel_QuanLiDiemThi.add(btnA05);

		btnA06 = new JButton("Khối A06");
		Image img16 = new ImageIcon(this.getClass().getResource("/image/A06.png")).getImage().getScaledInstance(20, 20,
				DO_NOTHING_ON_CLOSE);
		btnA06.setIcon(new ImageIcon(img16));
		btnA06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_QuanLiDiemThi.remove(panelA08);
				panel_QuanLiDiemThi.remove(panelA07);
				panel_QuanLiDiemThi.remove(panelA02);
				panel_QuanLiDiemThi.remove(panelA05);
				panel_QuanLiDiemThi.remove(panelA04);
				panel_QuanLiDiemThi.remove(panelA03);
				panel_QuanLiDiemThi.remove(panelA00);
				panel_QuanLiDiemThi.remove(panelA01);
				panel_QuanLiDiemThi.add(panelA06);
				panel_QuanLiDiemThi.revalidate();
				panel_QuanLiDiemThi.repaint();
			}
		});
		btnA06.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnA06.setBackground(SystemColor.activeCaption);
		btnA06.setBounds(960, 39, 162, 36);
		panel_QuanLiDiemThi.add(btnA06);

		btnA07 = new JButton("Khối A07");
		Image img17 = new ImageIcon(this.getClass().getResource("/image/A07.png")).getImage().getScaledInstance(20, 20,
				DO_NOTHING_ON_CLOSE);
		btnA07.setIcon(new ImageIcon(img17));
		btnA07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_QuanLiDiemThi.remove(panelA08);
				panel_QuanLiDiemThi.remove(panelA02);
				panel_QuanLiDiemThi.remove(panelA06);
				panel_QuanLiDiemThi.remove(panelA05);
				panel_QuanLiDiemThi.remove(panelA04);
				panel_QuanLiDiemThi.remove(panelA03);
				panel_QuanLiDiemThi.remove(panelA00);
				panel_QuanLiDiemThi.remove(panelA01);
				panel_QuanLiDiemThi.add(panelA07);
				panel_QuanLiDiemThi.revalidate();
				panel_QuanLiDiemThi.repaint();
			}
		});
		btnA07.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnA07.setBackground(SystemColor.activeCaption);
		btnA07.setBounds(1120, 39, 162, 36);
		panel_QuanLiDiemThi.add(btnA07);

		btnA08 = new JButton("Khối A08");
		Image img18 = new ImageIcon(this.getClass().getResource("/image/A08.png")).getImage().getScaledInstance(20, 20,
				DO_NOTHING_ON_CLOSE);
		btnA08.setIcon(new ImageIcon(img18));
		btnA08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_QuanLiDiemThi.remove(panelA02);
				panel_QuanLiDiemThi.remove(panelA07);
				panel_QuanLiDiemThi.remove(panelA06);
				panel_QuanLiDiemThi.remove(panelA05);
				panel_QuanLiDiemThi.remove(panelA04);
				panel_QuanLiDiemThi.remove(panelA03);
				panel_QuanLiDiemThi.remove(panelA00);
				panel_QuanLiDiemThi.remove(panelA01);
				panel_QuanLiDiemThi.add(panelA08);
				panel_QuanLiDiemThi.revalidate();
				panel_QuanLiDiemThi.repaint();
			}
		});
		btnA08.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnA08.setBackground(SystemColor.activeCaption);
		btnA08.setBounds(1278, 39, 162, 36);
		panel_QuanLiDiemThi.add(btnA08);

		// Chi tiết khối A00
		panelA00 = new JPanel();
		panelA00.setBounds(0, 74, 1440, 589);
		panelA00.setBackground(Color.WHITE);
		panel_QuanLiDiemThi.add(panelA00);
		panelA00.setLayout(null);

		lbKhoiA00 = new JLabel("KHỐI A00");
		lbKhoiA00.setBounds(678, 9, 100, 22);
		lbKhoiA00.setFont(new Font("Tahoma", Font.BOLD, 18));
		panelA00.add(lbKhoiA00);

		separator_A00 = new JSeparator();
		separator_A00.setBounds(0, 38, 1430, 2);
		panelA00.add(separator_A00);

		lbMaA00 = new JLabel("Mã thí sinh");
		lbMaA00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbMaA00.setBounds(109, 73, 83, 22);
		panelA00.add(lbMaA00);

		txtMa_A00 = new JTextField();
		txtMa_A00.setBounds(202, 72, 100, 29);
		panelA00.add(txtMa_A00);
		txtMa_A00.setColumns(10);

		lbTenA00 = new JLabel("Họ và tên");
		lbTenA00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbTenA00.setBounds(109, 120, 83, 22);
		panelA00.add(lbTenA00);

		lbNamA00 = new JLabel("Năm sinh");
		lbNamA00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbNamA00.setBounds(109, 174, 83, 22);
		panelA00.add(lbNamA00);

		lbGTA00 = new JLabel("Giới tính");
		lbGTA00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbGTA00.setBounds(109, 225, 83, 22);
		panelA00.add(lbGTA00);

		lbToanA00 = new JLabel("Điểm Toán");
		lbToanA00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbToanA00.setBounds(109, 285, 83, 22);
		panelA00.add(lbToanA00);

		lbLiA00 = new JLabel("Điểm Lí");
		lbLiA00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbLiA00.setBounds(346, 285, 83, 22);
		panelA00.add(lbLiA00);

		lbHoaA00 = new JLabel("Điểm Hóa");
		lbHoaA00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbHoaA00.setBounds(109, 343, 83, 22);
		panelA00.add(lbHoaA00);

		lbUT_A00 = new JLabel("Điểm ưu tiên");
		lbUT_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbUT_A00.setBounds(319, 343, 114, 22);
		panelA00.add(lbUT_A00);

		txtTen_A00 = new JTextField();
		txtTen_A00.setColumns(10);
		txtTen_A00.setBounds(202, 119, 212, 29);
		panelA00.add(txtTen_A00);

		txtNam_A00 = new JTextField();
		txtNam_A00.setColumns(10);
		txtNam_A00.setBounds(202, 173, 114, 29);
		panelA00.add(txtNam_A00);

		cboGT_A00 = new JComboBox();
		cboGT_A00.setModel(new DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));
		cboGT_A00.setBounds(202, 224, 74, 29);
		panelA00.add(cboGT_A00);

		txtToan_A00 = new JTextField();
		txtToan_A00.setColumns(10);
		txtToan_A00.setBounds(202, 284, 74, 29);
		panelA00.add(txtToan_A00);

		txtLi_A00 = new JTextField();
		txtLi_A00.setColumns(10);
		txtLi_A00.setBounds(418, 284, 74, 29);
		panelA00.add(txtLi_A00);

		txtHoa_A00 = new JTextField();
		txtHoa_A00.setColumns(10);
		txtHoa_A00.setBounds(202, 342, 74, 29);
		panelA00.add(txtHoa_A00);

		txtDUT_A00 = new JTextField();
		txtDUT_A00.setColumns(10);
		txtDUT_A00.setBounds(418, 342, 74, 29);
		panelA00.add(txtDUT_A00);

		separator_A00_1 = new JSeparator();
		separator_A00_1.setBounds(0, 466, 1430, 2);
		panelA00.add(separator_A00_1);

		btnLuu_A00 = new JButton("Lưu");
		btnLuu_A00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMa_A00.getText().isEmpty() || txtTen_A00.getText().isEmpty() || txtNam_A00.getText().isEmpty()
						|| txtToan_A00.getText().isEmpty() || txtLi_A00.getText().isEmpty()
						|| txtHoa_A00.getText().isEmpty() || txtDUT_A00.getText().isEmpty()
						|| txtDHB_A00.getText().isEmpty() || cboGT_A00.getSelectedItem() == "") {
					JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");
				} else {
					khoiA00 ts = new khoiA00();
					ts.setMaThiSinh(txtMa_A00.getText());
					ts.setHoVaTen(txtTen_A00.getText());
					ts.setNamSinh(Integer.parseInt(txtNam_A00.getText()));
					ts.setGioiTinh(cboGT_A00.getSelectedIndex());
					ts.setToan(Float.parseFloat(txtToan_A00.getText()));
					ts.setLi(Float.parseFloat(txtLi_A00.getText()));
					ts.setHoa(Float.parseFloat(txtHoa_A00.getText()));
					ts.setUuTien(Float.parseFloat(txtDUT_A00.getText()));
					ts.setTongdiem(Float.parseFloat(txtToan_A00.getText()) + Float.parseFloat(txtLi_A00.getText())
							+ Float.parseFloat(txtHoa_A00.getText()) + Float.parseFloat(txtDUT_A00.getText()));
					ts.setDiemHocBa(Float.parseFloat(txtDHB_A00.getText()));
					if (connect_khoiA00.kiemtratontai(ts) == true) {
						JOptionPane.showMessageDialog(null, "Thí sinh này đã có điểm!");
					} else {
						connect_khoiA00.insert(ts);
						JOptionPane.showMessageDialog(null, "Lưu thông tin thành công!");
						showData_QLDT_A00(connect_khoiA00.findAll());
					}
				}
			}
		});
		btnLuu_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLuu_A00.setBounds(163, 490, 114, 34);
		panelA00.add(btnLuu_A00);

		btnLM_A00 = new JButton("Làm mới");
		btnLM_A00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDHB_A00.setText("");
				txtDUT_A00.setText("");
				txtHoa_A00.setText("");
				txtLi_A00.setText("");
				txtMa_A00.setText("");
				txtNam_A00.setText("");
				txtTen_A00.setText("");
				txtTK_A00.setText("");
				txtToan_A00.setText("");
				showData_QLDT_A00(connect_khoiA00.findAll());
			}
		});
		btnLM_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLM_A00.setBounds(304, 490, 114, 34);
		panelA00.add(btnLM_A00);

		btnCN_A00 = new JButton("Cập nhật");
		btnCN_A00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA00 ts = new khoiA00();
				ts.setMaThiSinh(txtMa_A00.getText());
				ts.setHoVaTen(txtTen_A00.getText());
				ts.setNamSinh(Integer.parseInt(txtNam_A00.getText()));
				ts.setGioiTinh(cboGT_A00.getSelectedIndex());
				ts.setToan(Float.parseFloat(txtToan_A00.getText()));
				ts.setLi(Float.parseFloat(txtLi_A00.getText()));
				ts.setHoa(Float.parseFloat(txtHoa_A00.getText()));
				ts.setUuTien(Float.parseFloat(txtDUT_A00.getText()));
				ts.setTongdiem(Float.parseFloat(txtToan_A00.getText()) + Float.parseFloat(txtLi_A00.getText())
						+ Float.parseFloat(txtHoa_A00.getText()) + Float.parseFloat(txtDUT_A00.getText()));
				ts.setDiemHocBa(Float.parseFloat(txtDHB_A00.getText()));
				connect_khoiA00.update(ts);
				JOptionPane.showMessageDialog(null, "Cập nhật thông tin thành công!");
				showData_QLDT_A00(connect_khoiA00.findAll());
			}
		});
		btnCN_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCN_A00.setBounds(163, 545, 114, 34);
		panelA00.add(btnCN_A00);

		btnXoa_A00 = new JButton("Xóa");
		btnXoa_A00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA00 ts = new khoiA00();
				ts.setMaThiSinh(txtMa_A00.getText());
				int luachon = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa không?");
				if (luachon == JOptionPane.YES_OPTION) {
					connect_khoiA00.delete(ts);
				}
				showData_QLDT_A00(connect_khoiA00.findAll());
			}
		});
		btnXoa_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXoa_A00.setBounds(304, 545, 114, 34);
		panelA00.add(btnXoa_A00);

		table_A00 = new JTable();
		table_A00.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "N\u0103m sinh",
						"Gi\u1EDBi t\u00EDnh", "To\u00E1n", "L\u00ED", "H\u00F3a", "\u01AFu ti\u00EAn",
						"T\u1ED5ng \u0111i\u1EC3m", "\u0110i\u1EC3m h\u1ECDc b\u1EA1" }));
		table_A00.getColumnModel().getColumn(0).setPreferredWidth(88);
		table_A00.getColumnModel().getColumn(1).setPreferredWidth(168);
		table_A00.getColumnModel().getColumn(3).setPreferredWidth(67);
		table_A00.getColumnModel().getColumn(4).setPreferredWidth(46);
		table_A00.getColumnModel().getColumn(5).setPreferredWidth(48);
		table_A00.getColumnModel().getColumn(6).setPreferredWidth(50);
		table_A00.getColumnModel().getColumn(7).setPreferredWidth(53);
		table_A00.getColumnModel().getColumn(8).setPreferredWidth(63);
		table_A00.getColumnModel().getColumn(9).setPreferredWidth(73);

		table_A00.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model_table = (DefaultTableModel) table_A00.getModel();
				int selectedIndex = table_A00.getSelectedRow();

				txtMa_A00.setText(model_table.getValueAt(selectedIndex, 0).toString());
				txtTen_A00.setText(model_table.getValueAt(selectedIndex, 1).toString());
				txtNam_A00.setText(model_table.getValueAt(selectedIndex, 2).toString());
				cboGT_A00.setSelectedItem(model_table.getValueAt(selectedIndex, 3).toString());
				txtToan_A00.setText(model_table.getValueAt(selectedIndex, 4).toString());
				txtLi_A00.setText(model_table.getValueAt(selectedIndex, 5).toString());
				txtHoa_A00.setText(model_table.getValueAt(selectedIndex, 6).toString());
				txtDUT_A00.setText(model_table.getValueAt(selectedIndex, 7).toString());
				txtDHB_A00.setText(model_table.getValueAt(selectedIndex, 9).toString());
			}
		});

		scrollPane_A00 = new JScrollPane(table_A00);
		scrollPane_A00.setBounds(540, 105, 849, 362);
		panelA00.add(scrollPane_A00);

		lbTK_A00 = new JLabel("Tìm kiếm thông tin(theo mã thí sinh)");
		lbTK_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbTK_A00.setBounds(645, 63, 265, 22);
		panelA00.add(lbTK_A00);

		txtTK_A00 = new JTextField();
		txtTK_A00.setColumns(10);
		txtTK_A00.setBounds(901, 56, 135, 29);
		panelA00.add(txtTK_A00);

		btnTK_A00 = new JButton("Tìm kiếm");
		btnTK_A00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA00 ts = new khoiA00();
				ts.setMaThiSinh(txtTK_A00.getText());
				showData_QLDT_A00(connect_khoiA00.findbySBD(ts));
				if (table_A00.getRowCount() == 0) {
					JOptionPane.showMessageDialog(null, "Không có thí sinh này.\n" + "Vui lòng nhập lại!");
				}
			}
		});
		btnTK_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTK_A00.setBounds(1072, 56, 123, 29);
		panelA00.add(btnTK_A00);

		btnHT_A00 = new JButton("Hủy tìm");
		btnHT_A00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showData_QLDT_A00(connect_khoiA00.findAll());
			}
		});
		btnHT_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHT_A00.setBounds(1221, 56, 123, 29);
		panelA00.add(btnHT_A00);

		lbDHB_A00 = new JLabel("Điểm học bạ");
		lbDHB_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbDHB_A00.setBounds(109, 396, 104, 22);
		panelA00.add(lbDHB_A00);

		txtDHB_A00 = new JTextField();
		txtDHB_A00.setColumns(10);
		txtDHB_A00.setBounds(202, 395, 74, 29);
		panelA00.add(txtDHB_A00);

		// Chi tiết khối A01
		panelA01 = new JPanel();
		panelA01.setBounds(0, 74, 1440, 589);
		panelA01.setBackground(Color.WHITE);
		panel_QuanLiDiemThi.add(panelA01);
		panelA01.setLayout(null);

		lbKhoiA01 = new JLabel("KHỐI A01");
		lbKhoiA01.setBounds(678, 9, 100, 22);
		lbKhoiA01.setFont(new Font("Tahoma", Font.BOLD, 18));
		panelA01.add(lbKhoiA01);

		separator_A01 = new JSeparator();
		separator_A01.setBounds(0, 38, 1430, 2);
		panelA01.add(separator_A01);

		lbMaA01 = new JLabel("Mã thí sinh");
		lbMaA01.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbMaA01.setBounds(109, 73, 83, 22);
		panelA01.add(lbMaA01);

		txtMa_A01 = new JTextField();
		txtMa_A01.setBounds(202, 72, 100, 29);
		panelA01.add(txtMa_A01);
		txtMa_A01.setColumns(10);

		lbTenA01 = new JLabel("Họ và tên");
		lbTenA01.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbTenA01.setBounds(109, 120, 83, 22);
		panelA01.add(lbTenA01);

		lbNamA01 = new JLabel("Năm sinh");
		lbNamA01.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbNamA01.setBounds(109, 174, 83, 22);
		panelA01.add(lbNamA01);

		lbGTA01 = new JLabel("Giới tính");
		lbGTA01.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbGTA01.setBounds(109, 225, 83, 22);
		panelA01.add(lbGTA01);

		lbToanA01 = new JLabel("Điểm Toán");
		lbToanA01.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbToanA01.setBounds(109, 285, 83, 22);
		panelA01.add(lbToanA01);

		lbLiA01 = new JLabel("Điểm Hóa");
		lbLiA01.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbLiA01.setBounds(346, 285, 83, 22);
		panelA01.add(lbLiA01);

		lbHoaA01 = new JLabel("Điểm Sinh");
		lbHoaA01.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbHoaA01.setBounds(109, 343, 83, 22);
		panelA01.add(lbHoaA01);

		lbUT_A01 = new JLabel("Điểm ưu tiên");
		lbUT_A01.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbUT_A01.setBounds(319, 343, 114, 22);
		panelA01.add(lbUT_A01);

		txtTen_A01 = new JTextField();
		txtTen_A01.setColumns(10);
		txtTen_A01.setBounds(202, 119, 212, 29);
		panelA01.add(txtTen_A01);

		txtNam_A01 = new JTextField();
		txtNam_A01.setColumns(10);
		txtNam_A01.setBounds(202, 173, 114, 29);
		panelA01.add(txtNam_A01);

		cboGT_A01 = new JComboBox();
		cboGT_A01.setModel(new DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));
		cboGT_A01.setBounds(202, 224, 74, 29);
		panelA01.add(cboGT_A01);

		txtToan_A01 = new JTextField();
		txtToan_A01.setColumns(10);
		txtToan_A01.setBounds(202, 284, 74, 29);
		panelA01.add(txtToan_A01);

		txtLi_A01 = new JTextField();
		txtLi_A01.setColumns(10);
		txtLi_A01.setBounds(418, 284, 74, 29);
		panelA01.add(txtLi_A01);

		txtHoa_A01 = new JTextField();
		txtHoa_A01.setColumns(10);
		txtHoa_A01.setBounds(202, 342, 74, 29);
		panelA01.add(txtHoa_A01);

		txtDUT_A01 = new JTextField();
		txtDUT_A01.setColumns(10);
		txtDUT_A01.setBounds(418, 342, 74, 29);
		panelA01.add(txtDUT_A01);

		separator_A01_1 = new JSeparator();
		separator_A01_1.setBounds(0, 466, 1430, 2);
		panelA01.add(separator_A01_1);

		btnLuu_A01 = new JButton("Lưu");
		btnLuu_A01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMa_A01.getText().isEmpty() || txtTen_A01.getText().isEmpty() || txtNam_A01.getText().isEmpty()
						|| txtToan_A01.getText().isEmpty() || txtLi_A01.getText().isEmpty()
						|| txtHoa_A01.getText().isEmpty() || txtDUT_A01.getText().isEmpty()
						|| txtDHB_A01.getText().isEmpty() || cboGT_A01.getSelectedItem() == "") {
					JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");
				} else {
					khoiA01 ts = new khoiA01();
					ts.setMaThiSinh(txtMa_A01.getText());
					ts.setHoVaTen(txtTen_A01.getText());
					ts.setNamSinh(Integer.parseInt(txtNam_A01.getText()));
					ts.setGioiTinh(cboGT_A01.getSelectedIndex());
					ts.setToan(Float.parseFloat(txtToan_A01.getText()));
					ts.setHoa(Float.parseFloat(txtLi_A01.getText()));
					ts.setSinh(Float.parseFloat(txtHoa_A01.getText()));
					ts.setUuTien(Float.parseFloat(txtDUT_A01.getText()));
					ts.setTongdiem(Float.parseFloat(txtToan_A01.getText()) + Float.parseFloat(txtLi_A01.getText())
							+ Float.parseFloat(txtHoa_A01.getText()) + Float.parseFloat(txtDUT_A01.getText()));
					ts.setDiemHocBa(Float.parseFloat(txtDHB_A01.getText()));
					if (connect_khoiA01.kiemtratontai(ts) == true) {
						JOptionPane.showMessageDialog(null, "Thí sinh này đã có điểm!");
					} else {
						connect_khoiA01.insert(ts);
						JOptionPane.showMessageDialog(null, "Lưu thông tin thành công!");
						showData_QLDT_A01(connect_khoiA01.findAll());
					}
				}
			}
		});
		btnLuu_A01.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLuu_A01.setBounds(163, 490, 114, 34);
		panelA01.add(btnLuu_A01);

		btnLM_A01 = new JButton("Làm mới");
		btnLM_A01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDHB_A01.setText("");
				txtDUT_A01.setText("");
				txtHoa_A01.setText("");
				txtLi_A01.setText("");
				txtMa_A01.setText("");
				txtNam_A01.setText("");
				txtTen_A01.setText("");
				txtTK_A01.setText("");
				txtToan_A01.setText("");
				showData_QLDT_A01(connect_khoiA01.findAll());
			}
		});
		btnLM_A01.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLM_A01.setBounds(304, 490, 114, 34);
		panelA01.add(btnLM_A01);

		btnCN_A01 = new JButton("Cập nhật");
		btnCN_A01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA01 ts = new khoiA01();
				ts.setMaThiSinh(txtMa_A01.getText());
				ts.setHoVaTen(txtTen_A01.getText());
				ts.setNamSinh(Integer.parseInt(txtNam_A01.getText()));
				ts.setGioiTinh(cboGT_A01.getSelectedIndex());
				ts.setToan(Float.parseFloat(txtToan_A01.getText()));
				ts.setHoa(Float.parseFloat(txtLi_A01.getText()));
				ts.setSinh(Float.parseFloat(txtHoa_A01.getText()));
				ts.setUuTien(Float.parseFloat(txtDUT_A01.getText()));
				ts.setTongdiem(Float.parseFloat(txtToan_A01.getText()) + Float.parseFloat(txtLi_A01.getText())
						+ Float.parseFloat(txtHoa_A01.getText()) + Float.parseFloat(txtDUT_A01.getText()));
				ts.setDiemHocBa(Float.parseFloat(txtDHB_A01.getText()));
				connect_khoiA01.update(ts);
				JOptionPane.showMessageDialog(null, "Lưu thông tin thành công!");
				showData_QLDT_A01(connect_khoiA01.findAll());
			}
		});
		btnCN_A01.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCN_A01.setBounds(163, 545, 114, 34);
		panelA01.add(btnCN_A01);

		btnXoa_A01 = new JButton("Xóa");
		btnXoa_A01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA01 ts = new khoiA01();
				ts.setMaThiSinh(txtMa_A01.getText());
				int luachon = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa không?");
				if (luachon == JOptionPane.YES_OPTION) {
					connect_khoiA01.delete(ts);
				}
				showData_QLDT_A01(connect_khoiA01.findAll());
			}
		});
		btnXoa_A01.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXoa_A01.setBounds(304, 545, 114, 34);
		panelA01.add(btnXoa_A01);

		table_A01 = new JTable();
		table_A01.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "Mã thí sinh", "Họ và tên", "Năm sinh", "Giới tính", "Toán", "Hóa", "Sinh", "Ưu tiên",
						"Tổng điểm", "Điểm học bạ" }));
		table_A01.getColumnModel().getColumn(0).setPreferredWidth(88);
		table_A01.getColumnModel().getColumn(1).setPreferredWidth(168);
		table_A01.getColumnModel().getColumn(3).setPreferredWidth(67);
		table_A01.getColumnModel().getColumn(4).setPreferredWidth(46);
		table_A01.getColumnModel().getColumn(5).setPreferredWidth(48);
		table_A01.getColumnModel().getColumn(6).setPreferredWidth(50);
		table_A01.getColumnModel().getColumn(7).setPreferredWidth(53);
		table_A01.getColumnModel().getColumn(8).setPreferredWidth(63);
		table_A01.getColumnModel().getColumn(9).setPreferredWidth(73);

		table_A01.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model_table = (DefaultTableModel) table_A01.getModel();
				int selectedIndex = table_A01.getSelectedRow();

				txtMa_A01.setText(model_table.getValueAt(selectedIndex, 0).toString());
				txtTen_A01.setText(model_table.getValueAt(selectedIndex, 1).toString());
				txtNam_A01.setText(model_table.getValueAt(selectedIndex, 2).toString());
				cboGT_A01.setSelectedItem(model_table.getValueAt(selectedIndex, 3).toString());
				txtToan_A01.setText(model_table.getValueAt(selectedIndex, 4).toString());
				txtLi_A01.setText(model_table.getValueAt(selectedIndex, 5).toString());
				txtHoa_A01.setText(model_table.getValueAt(selectedIndex, 6).toString());
				txtDUT_A01.setText(model_table.getValueAt(selectedIndex, 7).toString());
				txtDHB_A01.setText(model_table.getValueAt(selectedIndex, 9).toString());
			}
		});

		scrollPane_A01 = new JScrollPane(table_A01);
		scrollPane_A01.setBounds(540, 105, 849, 362);
		panelA01.add(scrollPane_A01);

		lbTK_A01 = new JLabel("Tìm kiếm thông tin(theo mã thí sinh)");
		lbTK_A01.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbTK_A01.setBounds(645, 63, 265, 22);
		panelA01.add(lbTK_A01);

		txtTK_A01 = new JTextField();
		txtTK_A01.setColumns(10);
		txtTK_A01.setBounds(901, 56, 135, 29);
		panelA01.add(txtTK_A01);

		btnTK_A01 = new JButton("Tìm kiếm");
		btnTK_A01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA01 ts = new khoiA01();
				ts.setMaThiSinh(txtTK_A01.getText());
				showData_QLDT_A01(connect_khoiA01.findbySBD(ts));
				if (table_A01.getRowCount() == 0) {
					JOptionPane.showMessageDialog(null, "Không có thí sinh này.\n" + "Vui lòng nhập lại!");
				}
			}
		});
		btnTK_A01.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTK_A01.setBounds(1072, 56, 123, 29);
		panelA01.add(btnTK_A01);

		btnHT_A01 = new JButton("Hủy tìm");
		btnHT_A01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showData_QLDT_A01(connect_khoiA01.findAll());
			}
		});
		btnHT_A01.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHT_A01.setBounds(1221, 56, 123, 29);
		panelA01.add(btnHT_A01);

		lbDHB_A01 = new JLabel("Điểm học bạ");
		lbDHB_A01.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbDHB_A01.setBounds(109, 396, 104, 22);
		panelA01.add(lbDHB_A01);

		txtDHB_A01 = new JTextField();
		txtDHB_A01.setColumns(10);
		txtDHB_A01.setBounds(202, 395, 74, 29);
		panelA01.add(txtDHB_A01);

		// Chi tiết khối A02
		panelA02 = new JPanel();
		panelA02.setBounds(0, 74, 1440, 589);
		panelA02.setBackground(Color.WHITE);
		panel_QuanLiDiemThi.add(panelA02);
		panelA02.setLayout(null);

		lbKhoiA02 = new JLabel("KHỐI A02");
		lbKhoiA02.setBounds(678, 9, 100, 22);
		lbKhoiA02.setFont(new Font("Tahoma", Font.BOLD, 18));
		panelA02.add(lbKhoiA02);

		separator_A02 = new JSeparator();
		separator_A02.setBounds(0, 38, 1430, 2);
		panelA02.add(separator_A02);

		lbMaA02 = new JLabel("Mã thí sinh");
		lbMaA02.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbMaA02.setBounds(109, 73, 83, 22);
		panelA02.add(lbMaA02);

		txtMa_A02 = new JTextField();
		txtMa_A02.setBounds(202, 72, 100, 29);
		panelA02.add(txtMa_A02);
		txtMa_A02.setColumns(10);

		lbTenA02 = new JLabel("Họ và tên");
		lbTenA02.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbTenA02.setBounds(109, 120, 83, 22);
		panelA02.add(lbTenA02);

		lbNamA02 = new JLabel("Năm sinh");
		lbNamA02.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbNamA02.setBounds(109, 174, 83, 22);
		panelA02.add(lbNamA02);

		lbGTA02 = new JLabel("Giới tính");
		lbGTA02.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbGTA02.setBounds(109, 225, 83, 22);
		panelA02.add(lbGTA02);

		lbToanA02 = new JLabel("Điểm Toán");
		lbToanA02.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbToanA02.setBounds(109, 285, 83, 22);
		panelA02.add(lbToanA02);

		lbLiA02 = new JLabel("Điểm Hóa");
		lbLiA02.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbLiA02.setBounds(346, 285, 83, 22);
		panelA02.add(lbLiA02);

		lbHoaA02 = new JLabel("Điểm Sử");
		lbHoaA02.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbHoaA02.setBounds(109, 343, 83, 22);
		panelA02.add(lbHoaA02);

		lbUT_A02 = new JLabel("Điểm ưu tiên");
		lbUT_A02.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbUT_A02.setBounds(319, 343, 114, 22);
		panelA02.add(lbUT_A02);

		txtTen_A02 = new JTextField();
		txtTen_A02.setColumns(10);
		txtTen_A02.setBounds(202, 119, 212, 29);
		panelA02.add(txtTen_A02);

		txtNam_A02 = new JTextField();
		txtNam_A02.setColumns(10);
		txtNam_A02.setBounds(202, 173, 114, 29);
		panelA02.add(txtNam_A02);

		cboGT_A02 = new JComboBox();
		cboGT_A02.setModel(new DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));
		cboGT_A02.setBounds(202, 224, 74, 29);
		panelA02.add(cboGT_A02);

		txtToan_A02 = new JTextField();
		txtToan_A02.setColumns(10);
		txtToan_A02.setBounds(202, 284, 74, 29);
		panelA02.add(txtToan_A02);

		txtLi_A02 = new JTextField();
		txtLi_A02.setColumns(10);
		txtLi_A02.setBounds(418, 284, 74, 29);
		panelA02.add(txtLi_A02);

		txtHoa_A02 = new JTextField();
		txtHoa_A02.setColumns(10);
		txtHoa_A02.setBounds(202, 342, 74, 29);
		panelA02.add(txtHoa_A02);

		txtDUT_A02 = new JTextField();
		txtDUT_A02.setColumns(10);
		txtDUT_A02.setBounds(418, 342, 74, 29);
		panelA02.add(txtDUT_A02);

		separator_A02_1 = new JSeparator();
		separator_A02_1.setBounds(0, 466, 1430, 2);
		panelA02.add(separator_A02_1);

		btnLuu_A02 = new JButton("Lưu");
		btnLuu_A02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMa_A02.getText().isEmpty() || txtTen_A02.getText().isEmpty() || txtNam_A02.getText().isEmpty()
						|| txtToan_A02.getText().isEmpty() || txtLi_A02.getText().isEmpty()
						|| txtHoa_A02.getText().isEmpty() || txtDUT_A02.getText().isEmpty()
						|| txtDHB_A02.getText().isEmpty() || cboGT_A02.getSelectedItem() == "") {
					JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");
				} else {
					khoiA02 ts = new khoiA02();
					ts.setMaThiSinh(txtMa_A02.getText());
					ts.setHoVaTen(txtTen_A02.getText());
					ts.setNamSinh(Integer.parseInt(txtNam_A02.getText()));
					ts.setGioiTinh(cboGT_A02.getSelectedIndex());
					ts.setToan(Float.parseFloat(txtToan_A02.getText()));
					ts.setHoa(Float.parseFloat(txtLi_A02.getText()));
					ts.setSu(Float.parseFloat(txtHoa_A02.getText()));
					ts.setUuTien(Float.parseFloat(txtDUT_A02.getText()));
					ts.setTongdiem(Float.parseFloat(txtToan_A02.getText()) + Float.parseFloat(txtLi_A02.getText())
							+ Float.parseFloat(txtHoa_A02.getText()) + Float.parseFloat(txtDUT_A02.getText()));
					ts.setDiemHocBa(Float.parseFloat(txtDHB_A02.getText()));
					if (connect_khoiA02.kiemtratontai(ts) == true) {
						JOptionPane.showMessageDialog(null, "Thí sinh này đã có điểm!");
					} else {
						connect_khoiA02.insert(ts);
						JOptionPane.showMessageDialog(null, "Lưu thông tin thành công!");
						showData_QLDT_A02(connect_khoiA02.findAll());
					}
				}
			}
		});
		btnLuu_A02.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLuu_A02.setBounds(163, 490, 114, 34);
		panelA02.add(btnLuu_A02);

		btnLM_A02 = new JButton("Làm mới");
		btnLM_A02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDHB_A02.setText("");
				txtDUT_A02.setText("");
				txtHoa_A02.setText("");
				txtLi_A02.setText("");
				txtMa_A02.setText("");
				txtNam_A02.setText("");
				txtTen_A02.setText("");
				txtTK_A02.setText("");
				txtToan_A02.setText("");
				showData_QLDT_A02(connect_khoiA02.findAll());
			}
		});
		btnLM_A02.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLM_A02.setBounds(304, 490, 114, 34);
		panelA02.add(btnLM_A02);

		btnCN_A02 = new JButton("Cập nhật");
		btnCN_A02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA02 ts = new khoiA02();
				ts.setMaThiSinh(txtMa_A02.getText());
				ts.setHoVaTen(txtTen_A02.getText());
				ts.setNamSinh(Integer.parseInt(txtNam_A02.getText()));
				ts.setGioiTinh(cboGT_A02.getSelectedIndex());
				ts.setToan(Float.parseFloat(txtToan_A02.getText()));
				ts.setHoa(Float.parseFloat(txtLi_A02.getText()));
				ts.setSu(Float.parseFloat(txtHoa_A02.getText()));
				ts.setUuTien(Float.parseFloat(txtDUT_A02.getText()));
				ts.setTongdiem(Float.parseFloat(txtToan_A02.getText()) + Float.parseFloat(txtLi_A02.getText())
						+ Float.parseFloat(txtHoa_A02.getText()) + Float.parseFloat(txtDUT_A02.getText()));
				ts.setDiemHocBa(Float.parseFloat(txtDHB_A02.getText()));
				connect_khoiA02.update(ts);
				JOptionPane.showMessageDialog(null, "Lưu thông tin thành công!");
				showData_QLDT_A02(connect_khoiA02.findAll());
			}
		});
		btnCN_A02.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCN_A02.setBounds(163, 545, 114, 34);
		panelA02.add(btnCN_A02);

		btnXoa_A02 = new JButton("Xóa");
		btnXoa_A02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA02 ts = new khoiA02();
				ts.setMaThiSinh(txtMa_A02.getText());
				int luachon = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa không?");
				if (luachon == JOptionPane.YES_OPTION) {
					connect_khoiA02.delete(ts);
				}
				showData_QLDT_A02(connect_khoiA02.findAll());
			}
		});
		btnXoa_A02.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXoa_A02.setBounds(304, 545, 114, 34);
		panelA02.add(btnXoa_A02);

		table_A02 = new JTable();
		table_A02.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "Mã thí sinh", "Họ và tên", "Năm sinh", "Giới tính", "Toán", "Hóa", "Sử", "Ưu tiên",
						"Tổng điểm", "Điểm học bạ" }));
		table_A02.getColumnModel().getColumn(0).setPreferredWidth(88);
		table_A02.getColumnModel().getColumn(1).setPreferredWidth(168);
		table_A02.getColumnModel().getColumn(3).setPreferredWidth(67);
		table_A02.getColumnModel().getColumn(4).setPreferredWidth(46);
		table_A02.getColumnModel().getColumn(5).setPreferredWidth(48);
		table_A02.getColumnModel().getColumn(6).setPreferredWidth(50);
		table_A02.getColumnModel().getColumn(7).setPreferredWidth(53);
		table_A02.getColumnModel().getColumn(8).setPreferredWidth(63);
		table_A02.getColumnModel().getColumn(9).setPreferredWidth(73);

		table_A02.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model_table = (DefaultTableModel) table_A02.getModel();
				int selectedIndex = table_A02.getSelectedRow();

				txtMa_A02.setText(model_table.getValueAt(selectedIndex, 0).toString());
				txtTen_A02.setText(model_table.getValueAt(selectedIndex, 1).toString());
				txtNam_A02.setText(model_table.getValueAt(selectedIndex, 2).toString());
				cboGT_A02.setSelectedItem(model_table.getValueAt(selectedIndex, 3).toString());
				txtToan_A02.setText(model_table.getValueAt(selectedIndex, 4).toString());
				txtLi_A02.setText(model_table.getValueAt(selectedIndex, 5).toString());
				txtHoa_A02.setText(model_table.getValueAt(selectedIndex, 6).toString());
				txtDUT_A02.setText(model_table.getValueAt(selectedIndex, 7).toString());
				txtDHB_A02.setText(model_table.getValueAt(selectedIndex, 9).toString());
			}
		});

		scrollPane_A02 = new JScrollPane(table_A02);
		scrollPane_A02.setBounds(540, 105, 849, 362);
		panelA02.add(scrollPane_A02);

		lbTK_A02 = new JLabel("Tìm kiếm thông tin(theo mã thí sinh)");
		lbTK_A02.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbTK_A02.setBounds(645, 63, 265, 22);
		panelA02.add(lbTK_A02);

		txtTK_A02 = new JTextField();
		txtTK_A02.setColumns(10);
		txtTK_A02.setBounds(901, 56, 135, 29);
		panelA02.add(txtTK_A02);

		btnTK_A02 = new JButton("Tìm kiếm");
		btnTK_A02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA02 ts = new khoiA02();
				ts.setMaThiSinh(txtTK_A02.getText());
				showData_QLDT_A02(connect_khoiA02.findbySBD(ts));
				if (table_A02.getRowCount() == 0) {
					JOptionPane.showMessageDialog(null, "Không có thí sinh này.\n" + "Vui lòng nhập lại!");
				}
			}
		});
		btnTK_A02.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTK_A02.setBounds(1072, 56, 123, 29);
		panelA02.add(btnTK_A02);

		btnHT_A02 = new JButton("Hủy tìm");
		btnHT_A02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showData_QLDT_A02(connect_khoiA02.findAll());
			}
		});
		btnHT_A02.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHT_A02.setBounds(1221, 56, 123, 29);
		panelA02.add(btnHT_A02);

		lbDHB_A02 = new JLabel("Điểm học bạ");
		lbDHB_A02.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbDHB_A02.setBounds(109, 396, 104, 22);
		panelA02.add(lbDHB_A02);

		txtDHB_A02 = new JTextField();
		txtDHB_A02.setColumns(10);
		txtDHB_A02.setBounds(202, 395, 74, 29);
		panelA02.add(txtDHB_A02);

		// Chi tiết khối A03
		panelA03 = new JPanel();
		panelA03.setBackground(Color.WHITE);
		panelA03.setBounds(0, 74, 1440, 589);
		panel_QuanLiDiemThi.add(panelA03);
		panelA03.setLayout(null);

		lbKhoiA03 = new JLabel("KHỐI A03");
		lbKhoiA03.setBounds(678, 9, 103, 22);
		lbKhoiA03.setFont(new Font("Tahoma", Font.BOLD, 18));
		panelA03.add(lbKhoiA03);

		separator_A03 = new JSeparator();
		separator_A03.setBounds(0, 38, 1430, 2);
		panelA03.add(separator_A03);

		lbMaA03 = new JLabel("Mã thí sinh");
		lbMaA03.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbMaA03.setBounds(109, 73, 83, 22);
		panelA03.add(lbMaA03);

		txtMa_A03 = new JTextField();
		txtMa_A03.setBounds(202, 72, 100, 29);
		panelA03.add(txtMa_A03);
		txtMa_A03.setColumns(10);

		lbTenA03 = new JLabel("Họ và tên");
		lbTenA03.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbTenA03.setBounds(109, 120, 83, 22);
		panelA03.add(lbTenA03);

		lbNamA03 = new JLabel("Năm sinh");
		lbNamA03.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbNamA03.setBounds(109, 174, 83, 22);
		panelA03.add(lbNamA03);

		lbGTA03 = new JLabel("Giới tính");
		lbGTA03.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbGTA03.setBounds(109, 225, 83, 22);
		panelA03.add(lbGTA03);

		lbToanA03 = new JLabel("Điểm Toán");
		lbToanA03.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbToanA03.setBounds(109, 285, 83, 22);
		panelA03.add(lbToanA03);

		lbLiA03 = new JLabel("Điểm Sử");
		lbLiA03.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbLiA03.setBounds(346, 285, 83, 22);
		panelA03.add(lbLiA03);

		lbHoaA03 = new JLabel("Điểm Địa");
		lbHoaA03.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbHoaA03.setBounds(109, 343, 83, 22);
		panelA03.add(lbHoaA03);

		lbUT_A03 = new JLabel("Điểm ưu tiên");
		lbUT_A03.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbUT_A03.setBounds(319, 343, 114, 22);
		panelA03.add(lbUT_A03);

		txtTen_A03 = new JTextField();
		txtTen_A03.setColumns(10);
		txtTen_A03.setBounds(202, 119, 212, 29);
		panelA03.add(txtTen_A03);

		txtNam_A03 = new JTextField();
		txtNam_A03.setColumns(10);
		txtNam_A03.setBounds(202, 173, 114, 29);
		panelA03.add(txtNam_A03);

		cboGT_A03 = new JComboBox();
		cboGT_A03.setModel(new DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));
		cboGT_A03.setBounds(202, 224, 74, 29);
		panelA03.add(cboGT_A03);

		txtToan_A03 = new JTextField();
		txtToan_A03.setColumns(10);
		txtToan_A03.setBounds(202, 284, 74, 29);
		panelA03.add(txtToan_A03);

		txtLi_A03 = new JTextField();
		txtLi_A03.setColumns(10);
		txtLi_A03.setBounds(418, 284, 74, 29);
		panelA03.add(txtLi_A03);

		txtHoa_A03 = new JTextField();
		txtHoa_A03.setColumns(10);
		txtHoa_A03.setBounds(202, 342, 74, 29);
		panelA03.add(txtHoa_A03);

		txtDUT_A03 = new JTextField();
		txtDUT_A03.setColumns(10);
		txtDUT_A03.setBounds(418, 342, 74, 29);
		panelA03.add(txtDUT_A03);

		separator_A03_1 = new JSeparator();
		separator_A03_1.setBounds(0, 466, 1430, 2);
		panelA03.add(separator_A03_1);

		btnLuu_A03 = new JButton("Lưu");
		btnLuu_A03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMa_A03.getText().isEmpty() || txtTen_A03.getText().isEmpty() || txtNam_A03.getText().isEmpty()
						|| txtToan_A03.getText().isEmpty() || txtLi_A03.getText().isEmpty()
						|| txtHoa_A03.getText().isEmpty() || txtDUT_A03.getText().isEmpty()
						|| txtDHB_A03.getText().isEmpty() || cboGT_A03.getSelectedItem() == "") {
					JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");
				} else {
					khoiA03 ts = new khoiA03();
					ts.setMaThiSinh(txtMa_A03.getText());
					ts.setHoVaTen(txtTen_A03.getText());
					ts.setNamSinh(Integer.parseInt(txtNam_A03.getText()));
					ts.setGioiTinh(cboGT_A03.getSelectedIndex());
					ts.setToan(Float.parseFloat(txtToan_A03.getText()));
					ts.setSu(Float.parseFloat(txtLi_A03.getText()));
					ts.setDia(Float.parseFloat(txtHoa_A03.getText()));
					ts.setUuTien(Float.parseFloat(txtDUT_A03.getText()));
					ts.setTongdiem(Float.parseFloat(txtToan_A03.getText()) + Float.parseFloat(txtLi_A03.getText())
							+ Float.parseFloat(txtHoa_A03.getText()) + Float.parseFloat(txtDUT_A03.getText()));
					ts.setDiemHocBa(Float.parseFloat(txtDHB_A03.getText()));
					if (connect_khoiA03.kiemtratontai(ts) == true) {
						JOptionPane.showMessageDialog(null, "Thí sinh này đã có điểm!");
					} else {
						connect_khoiA03.insert(ts);
						JOptionPane.showMessageDialog(null, "Lưu thông tin thành công!");
						showData_QLDT_A03(connect_khoiA03.findAll());
					}
				}
			}
		});
		btnLuu_A03.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLuu_A03.setBounds(163, 490, 114, 34);
		panelA03.add(btnLuu_A03);

		btnLM_A03 = new JButton("Làm mới");
		btnLM_A03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDHB_A03.setText("");
				txtDUT_A03.setText("");
				txtHoa_A03.setText("");
				txtLi_A03.setText("");
				txtMa_A03.setText("");
				txtNam_A03.setText("");
				txtTen_A03.setText("");
				txtTK_A03.setText("");
				txtToan_A03.setText("");
				showData_QLDT_A03(connect_khoiA03.findAll());
			}
		});
		btnLM_A03.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLM_A03.setBounds(304, 490, 114, 34);
		panelA03.add(btnLM_A03);

		btnCN_A03 = new JButton("Cập nhật");
		btnCN_A03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA03 ts = new khoiA03();
				ts.setMaThiSinh(txtMa_A03.getText());
				ts.setHoVaTen(txtTen_A03.getText());
				ts.setNamSinh(Integer.parseInt(txtNam_A03.getText()));
				ts.setGioiTinh(cboGT_A03.getSelectedIndex());
				ts.setToan(Float.parseFloat(txtToan_A03.getText()));
				ts.setSu(Float.parseFloat(txtLi_A03.getText()));
				ts.setDia(Float.parseFloat(txtHoa_A03.getText()));
				ts.setUuTien(Float.parseFloat(txtDUT_A03.getText()));
				ts.setTongdiem(Float.parseFloat(txtToan_A03.getText()) + Float.parseFloat(txtLi_A03.getText())
						+ Float.parseFloat(txtHoa_A03.getText()) + Float.parseFloat(txtDUT_A03.getText()));
				ts.setDiemHocBa(Float.parseFloat(txtDHB_A03.getText()));
				connect_khoiA03.update(ts);
				JOptionPane.showMessageDialog(null, "Lưu thông tin thành công!");
				showData_QLDT_A03(connect_khoiA03.findAll());
			}
		});
		btnCN_A03.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCN_A03.setBounds(163, 545, 114, 34);
		panelA03.add(btnCN_A03);

		btnXoa_A03 = new JButton("Xóa");
		btnXoa_A03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA03 ts = new khoiA03();
				ts.setMaThiSinh(txtMa_A03.getText());
				int luachon = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa không?");
				if (luachon == JOptionPane.YES_OPTION) {
					connect_khoiA03.delete(ts);
				}
				showData_QLDT_A03(connect_khoiA03.findAll());
			}
		});
		btnXoa_A03.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXoa_A03.setBounds(304, 545, 114, 34);
		panelA03.add(btnXoa_A03);

		table_A03 = new JTable();
		table_A03.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "Mã thí sinh", "Họ và tên", "Năm sinh", "Giới tính", "Toán", "Sử", "Địa", "Ưu tiên",
						"Tổng điểm", "Điểm học bạ" }));
		table_A03.getColumnModel().getColumn(0).setPreferredWidth(88);
		table_A03.getColumnModel().getColumn(1).setPreferredWidth(168);
		table_A03.getColumnModel().getColumn(3).setPreferredWidth(67);
		table_A03.getColumnModel().getColumn(4).setPreferredWidth(46);
		table_A03.getColumnModel().getColumn(5).setPreferredWidth(48);
		table_A03.getColumnModel().getColumn(6).setPreferredWidth(50);
		table_A03.getColumnModel().getColumn(7).setPreferredWidth(53);
		table_A03.getColumnModel().getColumn(8).setPreferredWidth(63);
		table_A03.getColumnModel().getColumn(9).setPreferredWidth(73);

		table_A03.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model_table = (DefaultTableModel) table_A03.getModel();
				int selectedIndex = table_A03.getSelectedRow();

				txtMa_A03.setText(model_table.getValueAt(selectedIndex, 0).toString());
				txtTen_A03.setText(model_table.getValueAt(selectedIndex, 1).toString());
				txtNam_A03.setText(model_table.getValueAt(selectedIndex, 2).toString());
				cboGT_A03.setSelectedItem(model_table.getValueAt(selectedIndex, 3).toString());
				txtToan_A03.setText(model_table.getValueAt(selectedIndex, 4).toString());
				txtLi_A03.setText(model_table.getValueAt(selectedIndex, 5).toString());
				txtHoa_A03.setText(model_table.getValueAt(selectedIndex, 6).toString());
				txtDUT_A03.setText(model_table.getValueAt(selectedIndex, 7).toString());
				txtDHB_A03.setText(model_table.getValueAt(selectedIndex, 9).toString());
			}
		});

		scrollPane_A03 = new JScrollPane(table_A03);
		scrollPane_A03.setBounds(540, 105, 849, 362);
		panelA03.add(scrollPane_A03);

		lbTK_A03 = new JLabel("Tìm kiếm thông tin(theo mã thí sinh)");
		lbTK_A03.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbTK_A03.setBounds(645, 63, 265, 22);
		panelA03.add(lbTK_A03);

		txtTK_A03 = new JTextField();
		txtTK_A03.setColumns(10);
		txtTK_A03.setBounds(903, 56, 135, 29);
		panelA03.add(txtTK_A03);

		btnTK_A03 = new JButton("Tìm kiếm");
		btnTK_A03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA03 ts = new khoiA03();
				ts.setMaThiSinh(txtTK_A03.getText());
				showData_QLDT_A03(connect_khoiA03.findbySBD(ts));
				if (table_A03.getRowCount() == 0) {
					JOptionPane.showMessageDialog(null, "Không có thí sinh này.\n" + "Vui lòng nhập lại!");
				}
			}
		});
		btnTK_A03.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTK_A03.setBounds(1072, 56, 123, 29);
		panelA03.add(btnTK_A03);

		btnHT_A03 = new JButton("Hủy tìm");
		btnHT_A03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showData_QLDT_A03(connect_khoiA03.findAll());
			}
		});
		btnHT_A03.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHT_A03.setBounds(1221, 56, 123, 29);
		panelA03.add(btnHT_A03);

		lbDHB_A03 = new JLabel("Điểm học bạ");
		lbDHB_A03.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbDHB_A03.setBounds(109, 396, 104, 22);
		panelA03.add(lbDHB_A03);

		txtDHB_A03 = new JTextField();
		txtDHB_A03.setColumns(10);
		txtDHB_A03.setBounds(202, 395, 74, 29);
		panelA03.add(txtDHB_A03);

		// Chi tiết khối A04
		panelA04 = new JPanel();
		panelA04.setBackground(Color.WHITE);
		panelA04.setBounds(0, 74, 1440, 589);
		panel_QuanLiDiemThi.add(panelA04);
		panelA04.setLayout(null);

		lbKhoiA04 = new JLabel("KHỐI A04");
		lbKhoiA04.setBounds(678, 9, 104, 22);
		lbKhoiA04.setFont(new Font("Tahoma", Font.BOLD, 18));
		panelA04.add(lbKhoiA04);

		separator_A04 = new JSeparator();
		separator_A04.setBounds(0, 38, 1430, 2);
		panelA04.add(separator_A04);

		lbMaA04 = new JLabel("Mã thí sinh");
		lbMaA04.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbMaA04.setBounds(109, 73, 83, 22);
		panelA04.add(lbMaA04);

		txtMa_A04 = new JTextField();
		txtMa_A04.setBounds(202, 72, 100, 29);
		panelA04.add(txtMa_A04);
		txtMa_A04.setColumns(10);

		lbTenA04 = new JLabel("Họ và tên");
		lbTenA04.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbTenA04.setBounds(109, 120, 83, 22);
		panelA04.add(lbTenA04);

		lbNamA04 = new JLabel("Năm sinh");
		lbNamA04.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbNamA04.setBounds(109, 174, 83, 22);
		panelA04.add(lbNamA04);

		lbGTA04 = new JLabel("Giới tính");
		lbGTA04.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbGTA04.setBounds(109, 225, 83, 22);
		panelA04.add(lbGTA04);

		lbToanA04 = new JLabel("Điểm Văn");
		lbToanA04.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbToanA04.setBounds(109, 285, 83, 22);
		panelA04.add(lbToanA04);

		lbLiA04 = new JLabel("Điểm Sử");
		lbLiA04.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbLiA04.setBounds(346, 285, 83, 22);
		panelA04.add(lbLiA04);

		lbHoaA04 = new JLabel("Điểm Địa");
		lbHoaA04.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbHoaA04.setBounds(109, 343, 83, 22);
		panelA04.add(lbHoaA04);

		lbUT_A04 = new JLabel("Điểm ưu tiên");
		lbUT_A04.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbUT_A04.setBounds(319, 343, 114, 22);
		panelA04.add(lbUT_A04);

		txtTen_A04 = new JTextField();
		txtTen_A04.setColumns(10);
		txtTen_A04.setBounds(202, 119, 212, 29);
		panelA04.add(txtTen_A04);

		txtNam_A04 = new JTextField();
		txtNam_A04.setColumns(10);
		txtNam_A04.setBounds(202, 173, 114, 29);
		panelA04.add(txtNam_A04);

		cboGT_A04 = new JComboBox();
		cboGT_A04.setModel(new DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));
		cboGT_A04.setBounds(202, 224, 74, 29);
		panelA04.add(cboGT_A04);

		txtToan_A04 = new JTextField();
		txtToan_A04.setColumns(10);
		txtToan_A04.setBounds(202, 284, 74, 29);
		panelA04.add(txtToan_A04);

		txtLi_A04 = new JTextField();
		txtLi_A04.setColumns(10);
		txtLi_A04.setBounds(418, 284, 74, 29);
		panelA04.add(txtLi_A04);

		txtHoa_A04 = new JTextField();
		txtHoa_A04.setColumns(10);
		txtHoa_A04.setBounds(202, 342, 74, 29);
		panelA04.add(txtHoa_A04);

		txtDUT_A04 = new JTextField();
		txtDUT_A04.setColumns(10);
		txtDUT_A04.setBounds(418, 342, 74, 29);
		panelA04.add(txtDUT_A04);

		separator_A04_1 = new JSeparator();
		separator_A04_1.setBounds(0, 466, 1430, 2);
		panelA04.add(separator_A04_1);

		btnLuu_A04 = new JButton("Lưu");
		btnLuu_A04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMa_A04.getText().isEmpty() || txtTen_A04.getText().isEmpty() || txtNam_A04.getText().isEmpty()
						|| txtToan_A04.getText().isEmpty() || txtLi_A04.getText().isEmpty()
						|| txtHoa_A04.getText().isEmpty() || txtDUT_A04.getText().isEmpty()
						|| txtDHB_A04.getText().isEmpty() || cboGT_A04.getSelectedItem() == "") {
					JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");
				} else {
					khoiA04 ts = new khoiA04();
					ts.setMaThiSinh(txtMa_A04.getText());
					ts.setHoVaTen(txtTen_A04.getText());
					ts.setNamSinh(Integer.parseInt(txtNam_A04.getText()));
					ts.setGioiTinh(cboGT_A04.getSelectedIndex());
					ts.setVan(Float.parseFloat(txtToan_A04.getText()));
					ts.setSu(Float.parseFloat(txtLi_A04.getText()));
					ts.setDia(Float.parseFloat(txtHoa_A04.getText()));
					ts.setUuTien(Float.parseFloat(txtDUT_A04.getText()));
					ts.setTongdiem(Float.parseFloat(txtToan_A04.getText()) + Float.parseFloat(txtLi_A04.getText())
							+ Float.parseFloat(txtHoa_A04.getText()) + Float.parseFloat(txtDUT_A04.getText()));
					ts.setDiemHocBa(Float.parseFloat(txtDHB_A04.getText()));
					if (connect_khoiA04.kiemtratontai(ts) == true) {
						JOptionPane.showMessageDialog(null, "Thí sinh này đã có điểm!");
					} else {
						connect_khoiA04.insert(ts);
						JOptionPane.showMessageDialog(null, "Lưu thông tin thành công!");
						showData_QLDT_A04(connect_khoiA04.findAll());
					}
				}
			}
		});
		btnLuu_A04.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLuu_A04.setBounds(163, 490, 114, 34);
		panelA04.add(btnLuu_A04);

		btnLM_A04 = new JButton("Làm mới");
		btnLM_A04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDHB_A04.setText("");
				txtDUT_A04.setText("");
				txtHoa_A04.setText("");
				txtLi_A04.setText("");
				txtMa_A04.setText("");
				txtNam_A04.setText("");
				txtTen_A04.setText("");
				txtTK_A04.setText("");
				txtToan_A04.setText("");
				showData_QLDT_A04(connect_khoiA04.findAll());
			}
		});
		btnLM_A04.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLM_A04.setBounds(304, 490, 114, 34);
		panelA04.add(btnLM_A04);

		btnCN_A04 = new JButton("Cập nhật");
		btnCN_A04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA04 ts = new khoiA04();
				ts.setMaThiSinh(txtMa_A04.getText());
				ts.setHoVaTen(txtTen_A04.getText());
				ts.setNamSinh(Integer.parseInt(txtNam_A04.getText()));
				ts.setGioiTinh(cboGT_A04.getSelectedIndex());
				ts.setVan(Float.parseFloat(txtToan_A04.getText()));
				ts.setSu(Float.parseFloat(txtLi_A04.getText()));
				ts.setDia(Float.parseFloat(txtHoa_A04.getText()));
				ts.setUuTien(Float.parseFloat(txtDUT_A04.getText()));
				ts.setTongdiem(Float.parseFloat(txtToan_A04.getText()) + Float.parseFloat(txtLi_A04.getText())
						+ Float.parseFloat(txtHoa_A04.getText()) + Float.parseFloat(txtDUT_A04.getText()));
				ts.setDiemHocBa(Float.parseFloat(txtDHB_A04.getText()));
				connect_khoiA04.update(ts);
				JOptionPane.showMessageDialog(null, "Lưu thông tin thành công!");
				showData_QLDT_A04(connect_khoiA04.findAll());
			}
		});
		btnCN_A04.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCN_A04.setBounds(163, 545, 114, 34);
		panelA04.add(btnCN_A04);

		btnXoa_A04 = new JButton("Xóa");
		btnXoa_A04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA04 ts = new khoiA04();
				ts.setMaThiSinh(txtMa_A04.getText());
				int luachon = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa không?");
				if (luachon == JOptionPane.YES_OPTION) {
					connect_khoiA04.delete(ts);
				}
				showData_QLDT_A04(connect_khoiA04.findAll());
			}
		});
		btnXoa_A04.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXoa_A04.setBounds(304, 545, 114, 34);
		panelA04.add(btnXoa_A04);

		table_A04 = new JTable();
		table_A04.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "Mã thí sinh", "Họ và tên", "Năm sinh", "Giới tính", "Văn", "Sử", "Địa", "Ưu tiên",
						"Tổng điểm", "Điểm học bạ" }));
		table_A04.getColumnModel().getColumn(0).setPreferredWidth(88);
		table_A04.getColumnModel().getColumn(1).setPreferredWidth(168);
		table_A04.getColumnModel().getColumn(3).setPreferredWidth(67);
		table_A04.getColumnModel().getColumn(4).setPreferredWidth(46);
		table_A04.getColumnModel().getColumn(5).setPreferredWidth(48);
		table_A04.getColumnModel().getColumn(6).setPreferredWidth(50);
		table_A04.getColumnModel().getColumn(7).setPreferredWidth(53);
		table_A04.getColumnModel().getColumn(8).setPreferredWidth(63);
		table_A04.getColumnModel().getColumn(9).setPreferredWidth(73);

		table_A04.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model_table = (DefaultTableModel) table_A04.getModel();
				int selectedIndex = table_A04.getSelectedRow();

				txtMa_A04.setText(model_table.getValueAt(selectedIndex, 0).toString());
				txtTen_A04.setText(model_table.getValueAt(selectedIndex, 1).toString());
				txtNam_A04.setText(model_table.getValueAt(selectedIndex, 2).toString());
				cboGT_A04.setSelectedItem(model_table.getValueAt(selectedIndex, 3).toString());
				txtToan_A04.setText(model_table.getValueAt(selectedIndex, 4).toString());
				txtLi_A04.setText(model_table.getValueAt(selectedIndex, 5).toString());
				txtHoa_A04.setText(model_table.getValueAt(selectedIndex, 6).toString());
				txtDUT_A04.setText(model_table.getValueAt(selectedIndex, 7).toString());
				txtDHB_A04.setText(model_table.getValueAt(selectedIndex, 9).toString());
			}
		});

		scrollPane_A04 = new JScrollPane(table_A04);
		scrollPane_A04.setBounds(540, 105, 849, 362);
		panelA04.add(scrollPane_A04);

		lbTK_A04 = new JLabel("Tìm kiếm thông tin(theo mã thí sinh)");
		lbTK_A04.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbTK_A04.setBounds(645, 63, 265, 22);
		panelA04.add(lbTK_A04);

		txtTK_A04 = new JTextField();
		txtTK_A04.setColumns(10);
		txtTK_A04.setBounds(904, 56, 135, 29);
		panelA04.add(txtTK_A04);

		btnTK_A04 = new JButton("Tìm kiếm");
		btnTK_A04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA04 ts = new khoiA04();
				ts.setMaThiSinh(txtTK_A04.getText());
				showData_QLDT_A04(connect_khoiA04.findbySBD(ts));
				if (table_A04.getRowCount() == 0) {
					JOptionPane.showMessageDialog(null, "Không có thí sinh này.\n" + "Vui lòng nhập lại!");
				}
			}
		});
		btnTK_A04.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTK_A04.setBounds(1072, 56, 123, 29);
		panelA04.add(btnTK_A04);

		btnHT_A04 = new JButton("Hủy tìm");
		btnHT_A04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showData_QLDT_A04(connect_khoiA04.findAll());
			}
		});
		btnHT_A04.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHT_A04.setBounds(1221, 56, 123, 29);
		panelA04.add(btnHT_A04);

		lbDHB_A04 = new JLabel("Điểm học bạ");
		lbDHB_A04.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbDHB_A04.setBounds(109, 396, 104, 22);
		panelA04.add(lbDHB_A04);

		txtDHB_A04 = new JTextField();
		txtDHB_A04.setColumns(10);
		txtDHB_A04.setBounds(202, 395, 74, 29);
		panelA04.add(txtDHB_A04);

		// Chi tiết khối A05
		panelA05 = new JPanel();
		panelA05.setBackground(Color.WHITE);
		panelA05.setBounds(0, 74, 1440, 589);
		panel_QuanLiDiemThi.add(panelA05);
		panelA05.setLayout(null);

		lbKhoiA05 = new JLabel("KHỐI A05");
		lbKhoiA05.setBounds(678, 9, 105, 22);
		lbKhoiA05.setFont(new Font("Tahoma", Font.BOLD, 18));
		panelA05.add(lbKhoiA05);

		separator_A05 = new JSeparator();
		separator_A05.setBounds(0, 38, 1430, 2);
		panelA05.add(separator_A05);

		lbMaA05 = new JLabel("Mã thí sinh");
		lbMaA05.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbMaA05.setBounds(109, 73, 83, 22);
		panelA05.add(lbMaA05);

		txtMa_A05 = new JTextField();
		txtMa_A05.setBounds(202, 72, 100, 29);
		panelA05.add(txtMa_A05);
		txtMa_A05.setColumns(10);

		lbTenA05 = new JLabel("Họ và tên");
		lbTenA05.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbTenA05.setBounds(109, 120, 83, 22);
		panelA05.add(lbTenA05);

		lbNamA05 = new JLabel("Năm sinh");
		lbNamA05.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbNamA05.setBounds(109, 174, 83, 22);
		panelA05.add(lbNamA05);

		lbGTA05 = new JLabel("Giới tính");
		lbGTA05.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbGTA05.setBounds(109, 225, 83, 22);
		panelA05.add(lbGTA05);

		lbToanA05 = new JLabel("Điểm Văn");
		lbToanA05.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbToanA05.setBounds(109, 285, 83, 22);
		panelA05.add(lbToanA05);

		lbLiA05 = new JLabel("Điểm Toán");
		lbLiA05.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbLiA05.setBounds(346, 285, 83, 22);
		panelA05.add(lbLiA05);

		lbHoaA05 = new JLabel("Điểm Anh");
		lbHoaA05.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbHoaA05.setBounds(109, 343, 83, 22);
		panelA05.add(lbHoaA05);

		lbUT_A05 = new JLabel("Điểm ưu tiên");
		lbUT_A05.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbUT_A05.setBounds(319, 343, 114, 22);
		panelA05.add(lbUT_A05);

		txtTen_A05 = new JTextField();
		txtTen_A05.setColumns(10);
		txtTen_A05.setBounds(202, 119, 212, 29);
		panelA05.add(txtTen_A05);

		txtNam_A05 = new JTextField();
		txtNam_A05.setColumns(10);
		txtNam_A05.setBounds(202, 173, 114, 29);
		panelA05.add(txtNam_A05);

		cboGT_A05 = new JComboBox();
		cboGT_A05.setModel(new DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));
		cboGT_A05.setBounds(202, 224, 74, 29);
		panelA05.add(cboGT_A05);

		txtToan_A05 = new JTextField();
		txtToan_A05.setColumns(10);
		txtToan_A05.setBounds(202, 284, 74, 29);
		panelA05.add(txtToan_A05);

		txtLi_A05 = new JTextField();
		txtLi_A05.setColumns(10);
		txtLi_A05.setBounds(418, 284, 74, 29);
		panelA05.add(txtLi_A05);

		txtHoa_A05 = new JTextField();
		txtHoa_A05.setColumns(10);
		txtHoa_A05.setBounds(202, 342, 74, 29);
		panelA05.add(txtHoa_A05);

		txtDUT_A05 = new JTextField();
		txtDUT_A05.setColumns(10);
		txtDUT_A05.setBounds(418, 342, 74, 29);
		panelA05.add(txtDUT_A05);

		separator_A05_1 = new JSeparator();
		separator_A05_1.setBounds(0, 466, 1430, 2);
		panelA05.add(separator_A05_1);

		btnLuu_A05 = new JButton("Lưu");
		btnLuu_A05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMa_A05.getText().isEmpty() || txtTen_A05.getText().isEmpty() || txtNam_A05.getText().isEmpty()
						|| txtToan_A05.getText().isEmpty() || txtLi_A05.getText().isEmpty()
						|| txtHoa_A05.getText().isEmpty() || txtDUT_A05.getText().isEmpty()
						|| txtDHB_A05.getText().isEmpty() || cboGT_A05.getSelectedItem() == "") {
					JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");
				} else {
					khoiA05 ts = new khoiA05();
					ts.setMaThiSinh(txtMa_A05.getText());
					ts.setHoVaTen(txtTen_A05.getText());
					ts.setNamSinh(Integer.parseInt(txtNam_A05.getText()));
					ts.setGioiTinh(cboGT_A05.getSelectedIndex());
					ts.setVan(Float.parseFloat(txtToan_A05.getText()));
					ts.setToan(Float.parseFloat(txtLi_A05.getText()));
					ts.setAnh(Float.parseFloat(txtHoa_A05.getText()));
					ts.setUuTien(Float.parseFloat(txtDUT_A05.getText()));
					ts.setTongdiem(Float.parseFloat(txtToan_A05.getText()) + Float.parseFloat(txtLi_A05.getText())
							+ Float.parseFloat(txtHoa_A05.getText()) + Float.parseFloat(txtDUT_A05.getText()));
					ts.setDiemHocBa(Float.parseFloat(txtDHB_A05.getText()));
					if (connect_khoiA05.kiemtratontai(ts) == true) {
						JOptionPane.showMessageDialog(null, "Thí sinh này đã có điểm!");
					} else {
						connect_khoiA05.insert(ts);
						JOptionPane.showMessageDialog(null, "Lưu thông tin thành công!");
						showData_QLDT_A05(connect_khoiA05.findAll());
					}
				}
			}
		});
		btnLuu_A05.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLuu_A05.setBounds(163, 490, 114, 34);
		panelA05.add(btnLuu_A05);

		btnLM_A05 = new JButton("Làm mới");
		btnLM_A05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDHB_A05.setText("");
				txtDUT_A05.setText("");
				txtHoa_A05.setText("");
				txtLi_A05.setText("");
				txtMa_A05.setText("");
				txtNam_A05.setText("");
				txtTen_A05.setText("");
				txtTK_A05.setText("");
				txtToan_A05.setText("");
				showData_QLDT_A05(connect_khoiA05.findAll());
			}
		});
		btnLM_A05.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLM_A05.setBounds(305, 490, 114, 34);
		panelA05.add(btnLM_A05);

		btnCN_A05 = new JButton("Cập nhật");
		btnCN_A05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA05 ts = new khoiA05();
				ts.setMaThiSinh(txtMa_A05.getText());
				ts.setHoVaTen(txtTen_A05.getText());
				ts.setNamSinh(Integer.parseInt(txtNam_A05.getText()));
				ts.setGioiTinh(cboGT_A05.getSelectedIndex());
				ts.setVan(Float.parseFloat(txtToan_A05.getText()));
				ts.setToan(Float.parseFloat(txtLi_A05.getText()));
				ts.setAnh(Float.parseFloat(txtHoa_A05.getText()));
				ts.setUuTien(Float.parseFloat(txtDUT_A05.getText()));
				ts.setTongdiem(Float.parseFloat(txtToan_A05.getText()) + Float.parseFloat(txtLi_A05.getText())
						+ Float.parseFloat(txtHoa_A05.getText()) + Float.parseFloat(txtDUT_A05.getText()));
				ts.setDiemHocBa(Float.parseFloat(txtDHB_A05.getText()));
				connect_khoiA05.update(ts);
				JOptionPane.showMessageDialog(null, "Lưu thông tin thành công!");
				showData_QLDT_A05(connect_khoiA05.findAll());
			}
		});
		btnCN_A05.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCN_A05.setBounds(163, 545, 114, 34);
		panelA05.add(btnCN_A05);

		btnXoa_A05 = new JButton("Xóa");
		btnXoa_A05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA05 ts = new khoiA05();
				ts.setMaThiSinh(txtMa_A05.getText());
				int luachon = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa không?");
				if (luachon == JOptionPane.YES_OPTION) {
					connect_khoiA05.delete(ts);
				}
				showData_QLDT_A05(connect_khoiA05.findAll());
			}
		});
		btnXoa_A05.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXoa_A05.setBounds(305, 545, 114, 34);
		panelA05.add(btnXoa_A05);

		table_A05 = new JTable();
		table_A05.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "Mã thí sinh", "Họ và tên", "Năm sinh", "Giới tính", "Văn", "Toán", "Anh", "Ưu tiên",
						"Tổng điểm", "Điểm học bạ" }));
		table_A05.getColumnModel().getColumn(0).setPreferredWidth(88);
		table_A05.getColumnModel().getColumn(1).setPreferredWidth(168);
		table_A05.getColumnModel().getColumn(3).setPreferredWidth(67);
		table_A05.getColumnModel().getColumn(4).setPreferredWidth(46);
		table_A05.getColumnModel().getColumn(5).setPreferredWidth(48);
		table_A05.getColumnModel().getColumn(6).setPreferredWidth(50);
		table_A05.getColumnModel().getColumn(7).setPreferredWidth(53);
		table_A05.getColumnModel().getColumn(8).setPreferredWidth(63);
		table_A05.getColumnModel().getColumn(9).setPreferredWidth(73);

		table_A05.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model_table = (DefaultTableModel) table_A05.getModel();
				int selectedIndex = table_A05.getSelectedRow();

				txtMa_A05.setText(model_table.getValueAt(selectedIndex, 0).toString());
				txtTen_A05.setText(model_table.getValueAt(selectedIndex, 1).toString());
				txtNam_A05.setText(model_table.getValueAt(selectedIndex, 2).toString());
				cboGT_A05.setSelectedItem(model_table.getValueAt(selectedIndex, 3).toString());
				txtToan_A05.setText(model_table.getValueAt(selectedIndex, 4).toString());
				txtLi_A05.setText(model_table.getValueAt(selectedIndex, 5).toString());
				txtHoa_A05.setText(model_table.getValueAt(selectedIndex, 6).toString());
				txtDUT_A05.setText(model_table.getValueAt(selectedIndex, 7).toString());
				txtDHB_A05.setText(model_table.getValueAt(selectedIndex, 9).toString());
			}
		});

		scrollPane_A05 = new JScrollPane(table_A05);
		scrollPane_A05.setBounds(540, 105, 849, 362);
		panelA05.add(scrollPane_A05);

		lbTK_A05 = new JLabel("Tìm kiếm thông tin(theo mã thí sinh)");
		lbTK_A05.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbTK_A05.setBounds(645, 63, 265, 22);
		panelA05.add(lbTK_A05);

		txtTK_A05 = new JTextField();
		txtTK_A05.setColumns(10);
		txtTK_A05.setBounds(905, 56, 135, 29);
		panelA05.add(txtTK_A05);

		btnTK_A05 = new JButton("Tìm kiếm");
		btnTK_A05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA05 ts = new khoiA05();
				ts.setMaThiSinh(txtTK_A05.getText());
				showData_QLDT_A05(connect_khoiA05.findbySBD(ts));
				if (table_A05.getRowCount() == 0) {
					JOptionPane.showMessageDialog(null, "Không có thí sinh này.\n" + "Vui lòng nhập lại!");
				}
			}
		});
		btnTK_A05.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTK_A05.setBounds(1072, 56, 123, 29);
		panelA05.add(btnTK_A05);

		btnHT_A05 = new JButton("Hủy tìm");
		btnHT_A05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showData_QLDT_A05(connect_khoiA05.findAll());
			}
		});
		btnHT_A05.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHT_A05.setBounds(1221, 56, 123, 29);
		panelA05.add(btnHT_A05);

		lbDHB_A05 = new JLabel("Điểm học bạ");
		lbDHB_A05.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbDHB_A05.setBounds(109, 396, 105, 22);
		panelA05.add(lbDHB_A05);

		txtDHB_A05 = new JTextField();
		txtDHB_A05.setColumns(10);
		txtDHB_A05.setBounds(202, 395, 74, 29);
		panelA05.add(txtDHB_A05);

		// Chi tiết khối A06
		panelA06 = new JPanel();
		panelA06.setBackground(Color.WHITE);
		panelA06.setBounds(0, 74, 1440, 589);
		panel_QuanLiDiemThi.add(panelA06);
		panelA06.setLayout(null);

		lbKhoiA06 = new JLabel("KHỐI A06");
		lbKhoiA06.setBounds(678, 9, 106, 22);
		lbKhoiA06.setFont(new Font("Tahoma", Font.BOLD, 18));
		panelA06.add(lbKhoiA06);

		separator_A06 = new JSeparator();
		separator_A06.setBounds(0, 38, 1430, 2);
		panelA06.add(separator_A06);

		lbMaA06 = new JLabel("Mã thí sinh");
		lbMaA06.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbMaA06.setBounds(109, 73, 83, 22);
		panelA06.add(lbMaA06);

		txtMa_A06 = new JTextField();
		txtMa_A06.setBounds(202, 72, 100, 29);
		panelA06.add(txtMa_A06);
		txtMa_A06.setColumns(10);

		lbTenA06 = new JLabel("Họ và tên");
		lbTenA06.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbTenA06.setBounds(109, 120, 83, 22);
		panelA06.add(lbTenA06);

		lbNamA06 = new JLabel("Năm sinh");
		lbNamA06.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbNamA06.setBounds(109, 174, 83, 22);
		panelA06.add(lbNamA06);

		lbGTA06 = new JLabel("Giới tính");
		lbGTA06.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbGTA06.setBounds(109, 225, 83, 22);
		panelA06.add(lbGTA06);

		lbToanA06 = new JLabel("Điểm Toán");
		lbToanA06.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbToanA06.setBounds(109, 285, 83, 22);
		panelA06.add(lbToanA06);

		lbLiA06 = new JLabel("Điểm Lí");
		lbLiA06.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbLiA06.setBounds(346, 285, 83, 22);
		panelA06.add(lbLiA06);

		lbHoaA06 = new JLabel("Điểm Sử");
		lbHoaA06.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbHoaA06.setBounds(109, 343, 83, 22);
		panelA06.add(lbHoaA06);

		lbUT_A06 = new JLabel("Điểm ưu tiên");
		lbUT_A06.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbUT_A06.setBounds(319, 343, 114, 22);
		panelA06.add(lbUT_A06);

		txtTen_A06 = new JTextField();
		txtTen_A06.setColumns(10);
		txtTen_A06.setBounds(202, 119, 212, 29);
		panelA06.add(txtTen_A06);

		txtNam_A06 = new JTextField();
		txtNam_A06.setColumns(10);
		txtNam_A06.setBounds(202, 173, 114, 29);
		panelA06.add(txtNam_A06);

		cboGT_A06 = new JComboBox();
		cboGT_A06.setModel(new DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));
		cboGT_A06.setBounds(202, 224, 74, 29);
		panelA06.add(cboGT_A06);

		txtToan_A06 = new JTextField();
		txtToan_A06.setColumns(10);
		txtToan_A06.setBounds(202, 284, 74, 29);
		panelA06.add(txtToan_A06);

		txtLi_A06 = new JTextField();
		txtLi_A06.setColumns(10);
		txtLi_A06.setBounds(418, 284, 74, 29);
		panelA06.add(txtLi_A06);

		txtHoa_A06 = new JTextField();
		txtHoa_A06.setColumns(10);
		txtHoa_A06.setBounds(202, 342, 74, 29);
		panelA06.add(txtHoa_A06);

		txtDUT_A06 = new JTextField();
		txtDUT_A06.setColumns(10);
		txtDUT_A06.setBounds(418, 342, 74, 29);
		panelA06.add(txtDUT_A06);

		separator_A06_1 = new JSeparator();
		separator_A06_1.setBounds(0, 466, 1430, 2);
		panelA06.add(separator_A06_1);

		btnLuu_A06 = new JButton("Lưu");
		btnLuu_A06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMa_A06.getText().isEmpty() || txtTen_A06.getText().isEmpty() || txtNam_A06.getText().isEmpty()
						|| txtToan_A06.getText().isEmpty() || txtLi_A06.getText().isEmpty()
						|| txtHoa_A06.getText().isEmpty() || txtDUT_A06.getText().isEmpty()
						|| txtDHB_A06.getText().isEmpty() || cboGT_A06.getSelectedItem() == "") {
					JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");
				} else {
					khoiA06 ts = new khoiA06();
					ts.setMaThiSinh(txtMa_A06.getText());
					ts.setHoVaTen(txtTen_A06.getText());
					ts.setNamSinh(Integer.parseInt(txtNam_A06.getText()));
					ts.setGioiTinh(cboGT_A06.getSelectedIndex());
					ts.setToan(Float.parseFloat(txtToan_A06.getText()));
					ts.setLi(Float.parseFloat(txtLi_A06.getText()));
					ts.setSu(Float.parseFloat(txtHoa_A06.getText()));
					ts.setUuTien(Float.parseFloat(txtDUT_A06.getText()));
					ts.setTongdiem(Float.parseFloat(txtToan_A06.getText()) + Float.parseFloat(txtLi_A06.getText())
							+ Float.parseFloat(txtHoa_A06.getText()) + Float.parseFloat(txtDUT_A06.getText()));
					ts.setDiemHocBa(Float.parseFloat(txtDHB_A06.getText()));
					if (connect_khoiA06.kiemtratontai(ts) == true) {
						JOptionPane.showMessageDialog(null, "Thí sinh này đã có điểm!");
					} else {
						connect_khoiA06.insert(ts);
						JOptionPane.showMessageDialog(null, "Lưu thông tin thành công!");
						showData_QLDT_A06(connect_khoiA06.findAll());
					}
				}
			}
		});
		btnLuu_A06.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLuu_A06.setBounds(163, 490, 114, 34);
		panelA06.add(btnLuu_A06);

		btnLM_A06 = new JButton("Làm mới");
		btnLM_A06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDHB_A06.setText("");
				txtDUT_A06.setText("");
				txtHoa_A06.setText("");
				txtLi_A06.setText("");
				txtMa_A06.setText("");
				txtNam_A06.setText("");
				txtTen_A06.setText("");
				txtTK_A06.setText("");
				txtToan_A06.setText("");
				showData_QLDT_A06(connect_khoiA06.findAll());
			}
		});
		btnLM_A06.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLM_A06.setBounds(306, 490, 114, 34);
		panelA06.add(btnLM_A06);

		btnCN_A06 = new JButton("Cập nhật");
		btnCN_A06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA06 ts = new khoiA06();
				ts.setMaThiSinh(txtMa_A06.getText());
				ts.setHoVaTen(txtTen_A06.getText());
				ts.setNamSinh(Integer.parseInt(txtNam_A06.getText()));
				ts.setGioiTinh(cboGT_A06.getSelectedIndex());
				ts.setToan(Float.parseFloat(txtToan_A06.getText()));
				ts.setLi(Float.parseFloat(txtLi_A06.getText()));
				ts.setSu(Float.parseFloat(txtHoa_A06.getText()));
				ts.setUuTien(Float.parseFloat(txtDUT_A06.getText()));
				ts.setTongdiem(Float.parseFloat(txtToan_A06.getText()) + Float.parseFloat(txtLi_A06.getText())
						+ Float.parseFloat(txtHoa_A06.getText()) + Float.parseFloat(txtDUT_A06.getText()));
				ts.setDiemHocBa(Float.parseFloat(txtDHB_A06.getText()));
				connect_khoiA06.update(ts);
				JOptionPane.showMessageDialog(null, "Lưu thông tin thành công!");
				showData_QLDT_A06(connect_khoiA06.findAll());
			}
		});
		btnCN_A06.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCN_A06.setBounds(163, 545, 114, 34);
		panelA06.add(btnCN_A06);

		btnXoa_A06 = new JButton("Xóa");
		btnXoa_A06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA06 ts = new khoiA06();
				ts.setMaThiSinh(txtMa_A06.getText());
				int luachon = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa không?");
				if (luachon == JOptionPane.YES_OPTION) {
					connect_khoiA06.delete(ts);
				}
				showData_QLDT_A06(connect_khoiA06.findAll());
			}
		});
		btnXoa_A06.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXoa_A06.setBounds(306, 545, 114, 34);
		panelA06.add(btnXoa_A06);

		table_A06 = new JTable();
		table_A06.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "Mã thí sinh", "Họ và tên", "Năm sinh", "Giới tính", "Toán", "Lí", "Sử", "Ưu tiên",
						"Tổng điểm", "Điểm học bạ" }));
		table_A06.getColumnModel().getColumn(0).setPreferredWidth(88);
		table_A06.getColumnModel().getColumn(1).setPreferredWidth(168);
		table_A06.getColumnModel().getColumn(3).setPreferredWidth(67);
		table_A06.getColumnModel().getColumn(4).setPreferredWidth(46);
		table_A06.getColumnModel().getColumn(5).setPreferredWidth(48);
		table_A06.getColumnModel().getColumn(6).setPreferredWidth(50);
		table_A06.getColumnModel().getColumn(7).setPreferredWidth(53);
		table_A06.getColumnModel().getColumn(8).setPreferredWidth(63);
		table_A06.getColumnModel().getColumn(9).setPreferredWidth(73);

		table_A06.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model_table = (DefaultTableModel) table_A06.getModel();
				int selectedIndex = table_A06.getSelectedRow();

				txtMa_A06.setText(model_table.getValueAt(selectedIndex, 0).toString());
				txtTen_A06.setText(model_table.getValueAt(selectedIndex, 1).toString());
				txtNam_A06.setText(model_table.getValueAt(selectedIndex, 2).toString());
				cboGT_A06.setSelectedItem(model_table.getValueAt(selectedIndex, 3).toString());
				txtToan_A06.setText(model_table.getValueAt(selectedIndex, 4).toString());
				txtLi_A06.setText(model_table.getValueAt(selectedIndex, 5).toString());
				txtHoa_A06.setText(model_table.getValueAt(selectedIndex, 6).toString());
				txtDUT_A06.setText(model_table.getValueAt(selectedIndex, 7).toString());
				txtDHB_A06.setText(model_table.getValueAt(selectedIndex, 9).toString());
			}
		});

		scrollPane_A06 = new JScrollPane(table_A06);
		scrollPane_A06.setBounds(540, 106, 849, 362);
		panelA06.add(scrollPane_A06);

		lbTK_A06 = new JLabel("Tìm kiếm thông tin(theo mã thí sinh)");
		lbTK_A06.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbTK_A06.setBounds(645, 63, 265, 22);
		panelA06.add(lbTK_A06);

		txtTK_A06 = new JTextField();
		txtTK_A06.setColumns(10);
		txtTK_A06.setBounds(906, 56, 135, 29);
		panelA06.add(txtTK_A06);

		btnTK_A06 = new JButton("Tìm kiếm");
		btnTK_A06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA06 ts = new khoiA06();
				ts.setMaThiSinh(txtTK_A06.getText());
				showData_QLDT_A06(connect_khoiA06.findbySBD(ts));
				if (table_A06.getRowCount() == 0) {
					JOptionPane.showMessageDialog(null, "Không có thí sinh này.\n" + "Vui lòng nhập lại!");
				}
			}
		});
		btnTK_A06.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTK_A06.setBounds(1072, 56, 123, 29);
		panelA06.add(btnTK_A06);

		btnHT_A06 = new JButton("Hủy tìm");
		btnHT_A06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showData_QLDT_A06(connect_khoiA06.findAll());
			}
		});
		btnHT_A06.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHT_A06.setBounds(1221, 56, 123, 29);
		panelA06.add(btnHT_A06);

		lbDHB_A06 = new JLabel("Điểm học bạ");
		lbDHB_A06.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbDHB_A06.setBounds(109, 396, 106, 22);
		panelA06.add(lbDHB_A06);

		txtDHB_A06 = new JTextField();
		txtDHB_A06.setColumns(10);
		txtDHB_A06.setBounds(202, 395, 74, 29);
		panelA06.add(txtDHB_A06);

		// Chi tiết khối A07
		panelA07 = new JPanel();
		panelA07.setBackground(Color.WHITE);
		panelA07.setBounds(0, 74, 1440, 589);
		panel_QuanLiDiemThi.add(panelA07);
		panelA07.setLayout(null);

		lbKhoiA07 = new JLabel("KHỐI A07");
		lbKhoiA07.setBounds(678, 9, 107, 22);
		lbKhoiA07.setFont(new Font("Tahoma", Font.BOLD, 18));
		panelA07.add(lbKhoiA07);

		separator_A07 = new JSeparator();
		separator_A07.setBounds(0, 38, 1430, 2);
		panelA07.add(separator_A07);

		lbMaA07 = new JLabel("Mã thí sinh");
		lbMaA07.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbMaA07.setBounds(109, 73, 83, 22);
		panelA07.add(lbMaA07);

		txtMa_A07 = new JTextField();
		txtMa_A07.setBounds(202, 72, 100, 29);
		panelA07.add(txtMa_A07);
		txtMa_A07.setColumns(10);

		lbTenA07 = new JLabel("Họ và tên");
		lbTenA07.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbTenA07.setBounds(109, 120, 83, 22);
		panelA07.add(lbTenA07);

		lbNamA07 = new JLabel("Năm sinh");
		lbNamA07.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbNamA07.setBounds(109, 174, 83, 22);
		panelA07.add(lbNamA07);

		lbGTA07 = new JLabel("Giới tính");
		lbGTA07.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbGTA07.setBounds(109, 225, 83, 22);
		panelA07.add(lbGTA07);

		lbToanA07 = new JLabel("Điểm Toán");
		lbToanA07.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbToanA07.setBounds(109, 285, 83, 22);
		panelA07.add(lbToanA07);

		lbLiA07 = new JLabel("Điểm Hóa");
		lbLiA07.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbLiA07.setBounds(346, 285, 83, 22);
		panelA07.add(lbLiA07);

		lbHoaA07 = new JLabel("Điểm Địa");
		lbHoaA07.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbHoaA07.setBounds(109, 343, 83, 22);
		panelA07.add(lbHoaA07);

		lbUT_A07 = new JLabel("Điểm ưu tiên");
		lbUT_A07.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbUT_A07.setBounds(319, 343, 114, 22);
		panelA07.add(lbUT_A07);

		txtTen_A07 = new JTextField();
		txtTen_A07.setColumns(10);
		txtTen_A07.setBounds(202, 119, 212, 29);
		panelA07.add(txtTen_A07);

		txtNam_A07 = new JTextField();
		txtNam_A07.setColumns(10);
		txtNam_A07.setBounds(202, 173, 114, 29);
		panelA07.add(txtNam_A07);

		cboGT_A07 = new JComboBox();
		cboGT_A07.setModel(new DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));
		cboGT_A07.setBounds(202, 224, 74, 29);
		panelA07.add(cboGT_A07);

		txtToan_A07 = new JTextField();
		txtToan_A07.setColumns(10);
		txtToan_A07.setBounds(202, 284, 74, 29);
		panelA07.add(txtToan_A07);

		txtLi_A07 = new JTextField();
		txtLi_A07.setColumns(10);
		txtLi_A07.setBounds(418, 284, 74, 29);
		panelA07.add(txtLi_A07);

		txtHoa_A07 = new JTextField();
		txtHoa_A07.setColumns(10);
		txtHoa_A07.setBounds(202, 342, 74, 29);
		panelA07.add(txtHoa_A07);

		txtDUT_A07 = new JTextField();
		txtDUT_A07.setColumns(10);
		txtDUT_A07.setBounds(418, 342, 74, 29);
		panelA07.add(txtDUT_A07);

		separator_A07_1 = new JSeparator();
		separator_A07_1.setBounds(0, 466, 1430, 2);
		panelA07.add(separator_A07_1);

		btnLuu_A07 = new JButton("Lưu");
		btnLuu_A07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMa_A07.getText().isEmpty() || txtTen_A07.getText().isEmpty() || txtNam_A07.getText().isEmpty()
						|| txtToan_A07.getText().isEmpty() || txtLi_A07.getText().isEmpty()
						|| txtHoa_A07.getText().isEmpty() || txtDUT_A07.getText().isEmpty()
						|| txtDHB_A07.getText().isEmpty() || cboGT_A07.getSelectedItem() == "") {
					JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");
				} else {
					khoiA07 ts = new khoiA07();
					ts.setMaThiSinh(txtMa_A07.getText());
					ts.setHoVaTen(txtTen_A07.getText());
					ts.setNamSinh(Integer.parseInt(txtNam_A07.getText()));
					ts.setGioiTinh(cboGT_A07.getSelectedIndex());
					ts.setToan(Float.parseFloat(txtToan_A07.getText()));
					ts.setHoa(Float.parseFloat(txtLi_A07.getText()));
					ts.setDia(Float.parseFloat(txtHoa_A07.getText()));
					ts.setUuTien(Float.parseFloat(txtDUT_A07.getText()));
					ts.setTongdiem(Float.parseFloat(txtToan_A07.getText()) + Float.parseFloat(txtLi_A07.getText())
							+ Float.parseFloat(txtHoa_A07.getText()) + Float.parseFloat(txtDUT_A07.getText()));
					ts.setDiemHocBa(Float.parseFloat(txtDHB_A07.getText()));
					if (connect_khoiA07.kiemtratontai(ts) == true) {
						JOptionPane.showMessageDialog(null, "Thí sinh này đã có điểm!");
					} else {
						connect_khoiA07.insert(ts);
						JOptionPane.showMessageDialog(null, "Lưu thông tin thành công!");
						showData_QLDT_A07(connect_khoiA07.findAll());
					}
				}
			}
		});
		btnLuu_A07.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLuu_A07.setBounds(163, 490, 114, 34);
		panelA07.add(btnLuu_A07);

		btnLM_A07 = new JButton("Làm mới");
		btnLM_A07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDHB_A07.setText("");
				txtDUT_A07.setText("");
				txtHoa_A07.setText("");
				txtLi_A07.setText("");
				txtMa_A07.setText("");
				txtNam_A07.setText("");
				txtTen_A07.setText("");
				txtTK_A07.setText("");
				txtToan_A07.setText("");
				showData_QLDT_A07(connect_khoiA07.findAll());
			}
		});
		btnLM_A07.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLM_A07.setBounds(307, 490, 114, 34);
		panelA07.add(btnLM_A07);

		btnCN_A07 = new JButton("Cập nhật");
		btnCN_A07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA07 ts = new khoiA07();
				ts.setMaThiSinh(txtMa_A07.getText());
				ts.setHoVaTen(txtTen_A07.getText());
				ts.setNamSinh(Integer.parseInt(txtNam_A07.getText()));
				ts.setGioiTinh(cboGT_A07.getSelectedIndex());
				ts.setToan(Float.parseFloat(txtToan_A07.getText()));
				ts.setHoa(Float.parseFloat(txtLi_A07.getText()));
				ts.setDia(Float.parseFloat(txtHoa_A07.getText()));
				ts.setUuTien(Float.parseFloat(txtDUT_A07.getText()));
				ts.setTongdiem(Float.parseFloat(txtToan_A07.getText()) + Float.parseFloat(txtLi_A07.getText())
						+ Float.parseFloat(txtHoa_A07.getText()) + Float.parseFloat(txtDUT_A07.getText()));
				ts.setDiemHocBa(Float.parseFloat(txtDHB_A07.getText()));
				connect_khoiA07.update(ts);
				JOptionPane.showMessageDialog(null, "Lưu thông tin thành công!");
				showData_QLDT_A07(connect_khoiA07.findAll());
			}
		});
		btnCN_A07.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCN_A07.setBounds(163, 545, 114, 34);
		panelA07.add(btnCN_A07);

		btnXoa_A07 = new JButton("Xóa");
		btnXoa_A07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA07 ts = new khoiA07();
				ts.setMaThiSinh(txtMa_A07.getText());
				int luachon = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa không?");
				if (luachon == JOptionPane.YES_OPTION) {
					connect_khoiA07.delete(ts);
				}
				showData_QLDT_A07(connect_khoiA07.findAll());
			}
		});
		btnXoa_A07.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXoa_A07.setBounds(307, 545, 114, 34);
		panelA07.add(btnXoa_A07);

		table_A07 = new JTable();
		table_A07.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "Mã thí sinh", "Họ và tên", "Năm sinh", "Giới tính", "Toán", "Hóa", "Địa", "Ưu tiên",
						"Tổng điểm", "Điểm học bạ" }));
		table_A07.getColumnModel().getColumn(0).setPreferredWidth(88);
		table_A07.getColumnModel().getColumn(1).setPreferredWidth(168);
		table_A07.getColumnModel().getColumn(3).setPreferredWidth(67);
		table_A07.getColumnModel().getColumn(4).setPreferredWidth(46);
		table_A07.getColumnModel().getColumn(5).setPreferredWidth(48);
		table_A07.getColumnModel().getColumn(6).setPreferredWidth(50);
		table_A07.getColumnModel().getColumn(7).setPreferredWidth(53);
		table_A07.getColumnModel().getColumn(8).setPreferredWidth(63);
		table_A07.getColumnModel().getColumn(9).setPreferredWidth(73);

		table_A07.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model_table = (DefaultTableModel) table_A07.getModel();
				int selectedIndex = table_A07.getSelectedRow();

				txtMa_A07.setText(model_table.getValueAt(selectedIndex, 0).toString());
				txtTen_A07.setText(model_table.getValueAt(selectedIndex, 1).toString());
				txtNam_A07.setText(model_table.getValueAt(selectedIndex, 2).toString());
				cboGT_A07.setSelectedItem(model_table.getValueAt(selectedIndex, 3).toString());
				txtToan_A07.setText(model_table.getValueAt(selectedIndex, 4).toString());
				txtLi_A07.setText(model_table.getValueAt(selectedIndex, 5).toString());
				txtHoa_A07.setText(model_table.getValueAt(selectedIndex, 6).toString());
				txtDUT_A07.setText(model_table.getValueAt(selectedIndex, 7).toString());
				txtDHB_A07.setText(model_table.getValueAt(selectedIndex, 9).toString());
			}
		});

		scrollPane_A07 = new JScrollPane(table_A07);
		scrollPane_A07.setBounds(540, 107, 849, 362);
		panelA07.add(scrollPane_A07);

		lbTK_A07 = new JLabel("Tìm kiếm thông tin(theo mã thí sinh)");
		lbTK_A07.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbTK_A07.setBounds(645, 63, 265, 22);
		panelA07.add(lbTK_A07);

		txtTK_A07 = new JTextField();
		txtTK_A07.setColumns(10);
		txtTK_A07.setBounds(907, 56, 135, 29);
		panelA07.add(txtTK_A07);

		btnTK_A07 = new JButton("Tìm kiếm");
		btnTK_A07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA07 ts = new khoiA07();
				ts.setMaThiSinh(txtTK_A07.getText());
				showData_QLDT_A07(connect_khoiA07.findbySBD(ts));
				if (table_A07.getRowCount() == 0) {
					JOptionPane.showMessageDialog(null, "Không có thí sinh này.\n" + "Vui lòng nhập lại!");
				}
			}
		});
		btnTK_A07.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTK_A07.setBounds(1072, 56, 123, 29);
		panelA07.add(btnTK_A07);

		btnHT_A07 = new JButton("Hủy tìm");
		btnHT_A07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showData_QLDT_A07(connect_khoiA07.findAll());
			}
		});
		btnHT_A07.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHT_A07.setBounds(1221, 56, 123, 29);
		panelA07.add(btnHT_A07);

		lbDHB_A07 = new JLabel("Điểm học bạ");
		lbDHB_A07.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbDHB_A07.setBounds(109, 396, 107, 22);
		panelA07.add(lbDHB_A07);

		txtDHB_A07 = new JTextField();
		txtDHB_A07.setColumns(10);
		txtDHB_A07.setBounds(202, 395, 74, 29);
		panelA07.add(txtDHB_A07);

		// Chi tiết khối A08
		panelA08 = new JPanel();
		panelA08.setBackground(Color.WHITE);
		panelA08.setBounds(0, 74, 1440, 589);
		panel_QuanLiDiemThi.add(panelA08);
		panelA08.setLayout(null);

		lbKhoiA08 = new JLabel("KHỐI A08");
		lbKhoiA08.setBounds(678, 9, 108, 22);
		lbKhoiA08.setFont(new Font("Tahoma", Font.BOLD, 18));
		panelA08.add(lbKhoiA08);

		separator_A08 = new JSeparator();
		separator_A08.setBounds(0, 38, 1430, 2);
		panelA08.add(separator_A08);

		lbMaA08 = new JLabel("Mã thí sinh");
		lbMaA08.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbMaA08.setBounds(109, 73, 83, 22);
		panelA08.add(lbMaA08);

		txtMa_A08 = new JTextField();
		txtMa_A08.setBounds(202, 72, 100, 29);
		panelA08.add(txtMa_A08);
		txtMa_A08.setColumns(10);

		lbTenA08 = new JLabel("Họ và tên");
		lbTenA08.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbTenA08.setBounds(109, 120, 83, 22);
		panelA08.add(lbTenA08);

		lbNamA08 = new JLabel("Năm sinh");
		lbNamA08.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbNamA08.setBounds(109, 174, 83, 22);
		panelA08.add(lbNamA08);

		lbGTA08 = new JLabel("Giới tính");
		lbGTA08.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbGTA08.setBounds(109, 225, 83, 22);
		panelA08.add(lbGTA08);

		lbToanA08 = new JLabel("Điểm Toán");
		lbToanA08.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbToanA08.setBounds(109, 285, 83, 22);
		panelA08.add(lbToanA08);

		lbLiA08 = new JLabel("Điểm Lí");
		lbLiA08.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbLiA08.setBounds(346, 285, 83, 22);
		panelA08.add(lbLiA08);

		lbHoaA08 = new JLabel("Điểm Mỹ");
		lbHoaA08.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbHoaA08.setBounds(109, 343, 83, 22);
		panelA08.add(lbHoaA08);

		lbUT_A08 = new JLabel("Điểm ưu tiên");
		lbUT_A08.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbUT_A08.setBounds(319, 343, 114, 22);
		panelA08.add(lbUT_A08);

		txtTen_A08 = new JTextField();
		txtTen_A08.setColumns(10);
		txtTen_A08.setBounds(202, 119, 212, 29);
		panelA08.add(txtTen_A08);

		txtNam_A08 = new JTextField();
		txtNam_A08.setColumns(10);
		txtNam_A08.setBounds(202, 173, 114, 29);
		panelA08.add(txtNam_A08);

		cboGT_A08 = new JComboBox();
		cboGT_A08.setModel(new DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));
		cboGT_A08.setBounds(202, 224, 74, 29);
		panelA08.add(cboGT_A08);

		txtToan_A08 = new JTextField();
		txtToan_A08.setColumns(10);
		txtToan_A08.setBounds(202, 284, 74, 29);
		panelA08.add(txtToan_A08);

		txtLi_A08 = new JTextField();
		txtLi_A08.setColumns(10);
		txtLi_A08.setBounds(418, 284, 74, 29);
		panelA08.add(txtLi_A08);

		txtHoa_A08 = new JTextField();
		txtHoa_A08.setColumns(10);
		txtHoa_A08.setBounds(202, 342, 74, 29);
		panelA08.add(txtHoa_A08);

		txtDUT_A08 = new JTextField();
		txtDUT_A08.setColumns(10);
		txtDUT_A08.setBounds(418, 342, 74, 29);
		panelA08.add(txtDUT_A08);

		separator_A08_1 = new JSeparator();
		separator_A08_1.setBounds(0, 466, 1430, 2);
		panelA08.add(separator_A08_1);

		btnLuu_A08 = new JButton("Lưu");
		btnLuu_A08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMa_A08.getText().isEmpty() || txtTen_A08.getText().isEmpty() || txtNam_A08.getText().isEmpty()
						|| txtToan_A08.getText().isEmpty() || txtLi_A08.getText().isEmpty()
						|| txtHoa_A08.getText().isEmpty() || txtDUT_A08.getText().isEmpty()
						|| txtDHB_A08.getText().isEmpty() || cboGT_A08.getSelectedItem() == "") {
					JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");
				} else {
					khoiA08 ts = new khoiA08();
					ts.setMaThiSinh(txtMa_A08.getText());
					ts.setHoVaTen(txtTen_A08.getText());
					ts.setNamSinh(Integer.parseInt(txtNam_A08.getText()));
					ts.setGioiTinh(cboGT_A08.getSelectedIndex());
					ts.setToan(Float.parseFloat(txtToan_A08.getText()));
					ts.setLi(Float.parseFloat(txtLi_A08.getText()));
					ts.setMy(Float.parseFloat(txtHoa_A08.getText()));
					ts.setUuTien(Float.parseFloat(txtDUT_A08.getText()));
					ts.setTongdiem(Float.parseFloat(txtToan_A08.getText()) + Float.parseFloat(txtLi_A08.getText())
							+ Float.parseFloat(txtHoa_A08.getText()) + Float.parseFloat(txtDUT_A08.getText()));
					ts.setDiemHocBa(Float.parseFloat(txtDHB_A08.getText()));
					if (connect_khoiA08.kiemtratontai(ts) == true) {
						JOptionPane.showMessageDialog(null, "Thí sinh này đã có điểm!");
					} else {
						connect_khoiA08.insert(ts);
						JOptionPane.showMessageDialog(null, "Lưu thông tin thành công!");
						showData_QLDT_A08(connect_khoiA08.findAll());
					}
				}
			}
		});
		btnLuu_A08.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLuu_A08.setBounds(163, 490, 114, 34);
		panelA08.add(btnLuu_A08);

		btnLM_A08 = new JButton("Làm mới");
		btnLM_A08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDHB_A08.setText("");
				txtDUT_A08.setText("");
				txtHoa_A08.setText("");
				txtLi_A08.setText("");
				txtMa_A08.setText("");
				txtNam_A08.setText("");
				txtTen_A08.setText("");
				txtTK_A08.setText("");
				txtToan_A08.setText("");
				showData_QLDT_A08(connect_khoiA08.findAll());
			}
		});
		btnLM_A08.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLM_A08.setBounds(308, 490, 114, 34);
		panelA08.add(btnLM_A08);

		btnCN_A08 = new JButton("Cập nhật");
		btnCN_A08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA08 ts = new khoiA08();
				ts.setMaThiSinh(txtMa_A08.getText());
				ts.setHoVaTen(txtTen_A08.getText());
				ts.setNamSinh(Integer.parseInt(txtNam_A08.getText()));
				ts.setGioiTinh(cboGT_A08.getSelectedIndex());
				ts.setToan(Float.parseFloat(txtToan_A08.getText()));
				ts.setLi(Float.parseFloat(txtLi_A08.getText()));
				ts.setMy(Float.parseFloat(txtHoa_A08.getText()));
				ts.setUuTien(Float.parseFloat(txtDUT_A08.getText()));
				ts.setTongdiem(Float.parseFloat(txtToan_A08.getText()) + Float.parseFloat(txtLi_A08.getText())
						+ Float.parseFloat(txtHoa_A08.getText()) + Float.parseFloat(txtDUT_A08.getText()));
				ts.setDiemHocBa(Float.parseFloat(txtDHB_A08.getText()));
				connect_khoiA08.update(ts);
				JOptionPane.showMessageDialog(null, "Lưu thông tin thành công!");
				showData_QLDT_A08(connect_khoiA08.findAll());
			}
		});
		btnCN_A08.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCN_A08.setBounds(163, 545, 114, 34);
		panelA08.add(btnCN_A08);

		btnXoa_A08 = new JButton("Xóa");
		btnXoa_A08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA08 ts = new khoiA08();
				ts.setMaThiSinh(txtMa_A08.getText());
				int luachon = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa không?");
				if (luachon == JOptionPane.YES_OPTION) {
					connect_khoiA08.delete(ts);
				}
				showData_QLDT_A08(connect_khoiA08.findAll());
			}
		});
		btnXoa_A08.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXoa_A08.setBounds(308, 545, 114, 34);
		panelA08.add(btnXoa_A08);

		table_A08 = new JTable();
		table_A08.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "Mã thí sinh", "Họ và tên", "Năm sinh", "Giới tính", "Toán", "Lí", "Mỹ", "Ưu tiên",
						"Tổng điểm", "Điểm học bạ" }));
		table_A08.getColumnModel().getColumn(0).setPreferredWidth(88);
		table_A08.getColumnModel().getColumn(1).setPreferredWidth(168);
		table_A08.getColumnModel().getColumn(3).setPreferredWidth(67);
		table_A08.getColumnModel().getColumn(4).setPreferredWidth(46);
		table_A08.getColumnModel().getColumn(5).setPreferredWidth(48);
		table_A08.getColumnModel().getColumn(6).setPreferredWidth(50);
		table_A08.getColumnModel().getColumn(7).setPreferredWidth(53);
		table_A08.getColumnModel().getColumn(8).setPreferredWidth(63);
		table_A08.getColumnModel().getColumn(9).setPreferredWidth(73);

		table_A08.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model_table = (DefaultTableModel) table_A08.getModel();
				int selectedIndex = table_A08.getSelectedRow();

				txtMa_A08.setText(model_table.getValueAt(selectedIndex, 0).toString());
				txtTen_A08.setText(model_table.getValueAt(selectedIndex, 1).toString());
				txtNam_A08.setText(model_table.getValueAt(selectedIndex, 2).toString());
				cboGT_A08.setSelectedItem(model_table.getValueAt(selectedIndex, 3).toString());
				txtToan_A08.setText(model_table.getValueAt(selectedIndex, 4).toString());
				txtLi_A08.setText(model_table.getValueAt(selectedIndex, 5).toString());
				txtHoa_A08.setText(model_table.getValueAt(selectedIndex, 6).toString());
				txtDUT_A08.setText(model_table.getValueAt(selectedIndex, 7).toString());
				txtDHB_A08.setText(model_table.getValueAt(selectedIndex, 9).toString());
			}
		});

		scrollPane_A08 = new JScrollPane(table_A08);
		scrollPane_A08.setBounds(540, 108, 849, 362);
		panelA08.add(scrollPane_A08);

		lbTK_A08 = new JLabel("Tìm kiếm thông tin(theo mã thí sinh)");
		lbTK_A08.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbTK_A08.setBounds(645, 63, 265, 22);
		panelA08.add(lbTK_A08);

		txtTK_A08 = new JTextField();
		txtTK_A08.setColumns(10);
		txtTK_A08.setBounds(908, 56, 135, 29);
		panelA08.add(txtTK_A08);

		btnTK_A08 = new JButton("Tìm kiếm");
		btnTK_A08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khoiA08 ts = new khoiA08();
				ts.setMaThiSinh(txtTK_A08.getText());
				showData_QLDT_A08(connect_khoiA08.findbySBD(ts));
				if (table_A08.getRowCount() == 0) {
					JOptionPane.showMessageDialog(null, "Không có thí sinh này.\n" + "Vui lòng nhập lại!");
				}
			}
		});
		btnTK_A08.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTK_A08.setBounds(1082, 56, 123, 29);
		panelA08.add(btnTK_A08);

		btnHT_A08 = new JButton("Hủy tìm");
		btnHT_A08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showData_QLDT_A08(connect_khoiA08.findAll());
			}
		});
		btnHT_A08.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHT_A08.setBounds(1221, 56, 123, 29);
		panelA08.add(btnHT_A08);

		lbDHB_A08 = new JLabel("Điểm học bạ");
		lbDHB_A08.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbDHB_A08.setBounds(109, 396, 108, 22);
		panelA08.add(lbDHB_A08);

		txtDHB_A08 = new JTextField();
		txtDHB_A08.setColumns(10);
		txtDHB_A08.setBounds(202, 395, 74, 29);
		panelA08.add(txtDHB_A08);

		// Nội dung thống kê
		panel_ThongKe = new JPanel();
		panel_ThongKe.setBackground(Color.WHITE);
		panel_ThongKe.setBounds(0, 35, 1440, 673);
		contentPane.add(panel_ThongKe);
		panel_ThongKe.setLayout(null);

		lblDSXT_TK = new JLabel("Danh sách xét tuyển");
		lblDSXT_TK.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDSXT_TK.setBounds(617, 5, 270, 37);
		panel_ThongKe.add(lblDSXT_TK);

		scrollPane_TK = new JScrollPane();
		scrollPane_TK.setBounds(0, 50, 1430, 2);
		panel_ThongKe.add(scrollPane_TK);

		table_TK = new JTable();
		table_TK.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Hình ảnh", "Ng\u00E0nh thi",
						"Kh\u1ED1i thi", "T\u1ED5ng \u0111i\u1EC3m", "Th\u1EE9 t\u1EF1 NV" }));

		class ImageRenderer extends DefaultTableCellRenderer {
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {
				JLabel label = new JLabel();
				if (value != null && value instanceof ImageIcon) {
					ImageIcon icon = (ImageIcon) value;
					label.setIcon(icon);
					label.setHorizontalAlignment(JLabel.CENTER);
				}
				return label;
			}
		}

		ImageRenderer renderer = new ImageRenderer();
		table_TK.getColumnModel().getColumn(2).setCellRenderer(renderer);

		TableColumn column = table_TK.getColumnModel().getColumn(2);
		column.setCellRenderer(renderer);
		column.setResizable(true);
		column.setPreferredWidth(150);
		table_TK.setRowHeight(100);

		// hiển thị bảng lên textbox của Quản lí tài khoản
		table_TK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model_table = (DefaultTableModel) table_TK.getModel();
				int selectedIndex = table_TK.getSelectedRow();

				txt_Ma_TK.setText(model_table.getValueAt(selectedIndex, 0).toString());
				txt_Ten_TK.setText(model_table.getValueAt(selectedIndex, 1).toString());
				txt_Nganh_TK.setText(model_table.getValueAt(selectedIndex, 3).toString());
				txt_Khoi_TK.setText(model_table.getValueAt(selectedIndex, 4).toString());
				txt_Tong_TK.setText(model_table.getValueAt(selectedIndex, 5).toString());
			}
		});

		scrollPane_TK_1 = new JScrollPane(table_TK);
		scrollPane_TK_1.setBounds(51, 140, 878, 473);
		panel_ThongKe.add(scrollPane_TK_1);

		btn_SXKhoi_TK = new JButton("Sắp xếp theo khối");
		btn_SXKhoi_TK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showData_ThongKe(connect_thongKe.SapXepTheoKhoi());
			}
		});
		btn_SXKhoi_TK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_SXKhoi_TK.setBounds(166, 77, 166, 37);
		panel_ThongKe.add(btn_SXKhoi_TK);

		btn_SXNganh_TK = new JButton("Sắp xếp theo ngành");
		btn_SXNganh_TK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showData_ThongKe(connect_thongKe.SapXepTheoNganh());
			}
		});
		btn_SXNganh_TK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_SXNganh_TK.setBounds(389, 77, 166, 37);
		panel_ThongKe.add(btn_SXNganh_TK);

		btn_SXDiem_TK = new JButton("Sắp xếp theo điểm");
		btn_SXDiem_TK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showData_ThongKe(connect_thongKe.SapXepTheoĐiem());
			}
		});
		btn_SXDiem_TK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_SXDiem_TK.setBounds(612, 77, 166, 37);
		panel_ThongKe.add(btn_SXDiem_TK);

		lblMTS_TK = new JLabel("Mã thí sinh");
		lblMTS_TK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMTS_TK.setBounds(1018, 140, 99, 27);
		panel_ThongKe.add(lblMTS_TK);

		txt_Ma_TK = new JTextField();
		txt_Ma_TK.setBounds(1144, 140, 154, 27);
		panel_ThongKe.add(txt_Ma_TK);
		txt_Ma_TK.setColumns(10);

		lbTen_TK = new JLabel("Họ và tên");
		lbTen_TK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbTen_TK.setBounds(1018, 208, 99, 27);
		panel_ThongKe.add(lbTen_TK);

		txt_Ten_TK = new JTextField();
		txt_Ten_TK.setColumns(10);
		txt_Ten_TK.setBounds(1144, 208, 237, 27);
		panel_ThongKe.add(txt_Ten_TK);

		lbNganhThi_TK = new JLabel("Ngành thi");
		lbNganhThi_TK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbNganhThi_TK.setBounds(1018, 271, 99, 27);
		panel_ThongKe.add(lbNganhThi_TK);

		txt_Nganh_TK = new JTextField();
		txt_Nganh_TK.setColumns(10);
		txt_Nganh_TK.setBounds(1144, 271, 204, 27);
		panel_ThongKe.add(txt_Nganh_TK);

		lbKhoiThi_TK = new JLabel("Khối thi");
		lbKhoiThi_TK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbKhoiThi_TK.setBounds(1018, 337, 99, 27);
		panel_ThongKe.add(lbKhoiThi_TK);

		txt_Khoi_TK = new JTextField();
		txt_Khoi_TK.setColumns(10);
		txt_Khoi_TK.setBounds(1144, 337, 131, 27);
		panel_ThongKe.add(txt_Khoi_TK);

		lbTongDiem_TK = new JLabel("Tổng điểm");
		lbTongDiem_TK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbTongDiem_TK.setBounds(1018, 407, 99, 27);
		panel_ThongKe.add(lbTongDiem_TK);

		txt_Tong_TK = new JTextField();
		txt_Tong_TK.setColumns(10);
		txt_Tong_TK.setBounds(1144, 407, 99, 27);
		panel_ThongKe.add(txt_Tong_TK);

		btn_TaoDiem_TK = new JButton("Tạo điểm");
		btn_TaoDiem_TK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Float.parseFloat(txt_Tong_TK.getText()) == 0) {
					contentPane.remove(panel_ThongKe);
					contentPane.remove(panel_QuanLiTaiKhoan);
					contentPane.remove(panel_KhoaKTH);
					contentPane.remove(panel_KhoaQLKD);
					contentPane.remove(panel_KhoaCNTT);
					contentPane.remove(panel_KhoaGDDT);
					contentPane.remove(panel_TrangChu);
					contentPane.add(panel_QuanLiDiemThi);
					contentPane.revalidate();
					contentPane.repaint();
				} else {
					JOptionPane.showMessageDialog(null, "Thí sinh này đã có điểm!");
				}
			}
		});
		btn_TaoDiem_TK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_TaoDiem_TK.setBounds(1282, 465, 99, 47);
		panel_ThongKe.add(btn_TaoDiem_TK);

		btn_CapNhat_TK = new JButton("Cập nhật");
		btn_CapNhat_TK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showData_ThongKe(connect_thongKe.findAll());
				JOptionPane.showMessageDialog(null, "Đã cập nhật dữ liệu!");
			}
		});
		btn_CapNhat_TK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_CapNhat_TK.setBounds(1282, 550, 99, 47);
		panel_ThongKe.add(btn_CapNhat_TK);

		// Nội dung menu Quản lí tài khoản
		panel_QuanLiTaiKhoan = new JPanel();
		panel_QuanLiTaiKhoan.setBackground(Color.WHITE);
		panel_QuanLiTaiKhoan.setBounds(0, 35, 1440, 673);
		contentPane.add(panel_QuanLiTaiKhoan);
		panel_QuanLiTaiKhoan.setLayout(null);

		lblDSTK = new JLabel("Danh sách tài khoản");
		lblDSTK.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDSTK.setBounds(617, 5, 270, 37);
		panel_QuanLiTaiKhoan.add(lblDSTK);

		scrollPane_QLTK = new JScrollPane();
		scrollPane_QLTK.setBounds(0, 50, 1430, 2);
		panel_QuanLiTaiKhoan.add(scrollPane_QLTK);

		table_QLTK = new JTable();
		table_QLTK.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, },
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "T\u00EAn \u0111\u0103ng nh\u1EADp",
						"M\u1EADt kh\u1EA9u", "Gmail" }));

		// hiển thị bảng lên textbox của Quản lí tài khoản
		table_QLTK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model_table = (DefaultTableModel) table_QLTK.getModel();
				int selectedIndex = table_QLTK.getSelectedRow();

				txt_Ma_QLTK.setText(model_table.getValueAt(selectedIndex, 0).toString());
				txt_Ten_QLTK.setText(model_table.getValueAt(selectedIndex, 1).toString());
				txt_User_QLTK.setText(model_table.getValueAt(selectedIndex, 2).toString());
				txt_Pass_QLTK.setText(model_table.getValueAt(selectedIndex, 3).toString());
				txt_Gmail_QLTK.setText(model_table.getValueAt(selectedIndex, 4).toString());
			}
		});

		scrollPaneQLTK = new JScrollPane(table_QLTK);
		scrollPaneQLTK.setBounds(51, 140, 878, 473);
		panel_QuanLiTaiKhoan.add(scrollPaneQLTK);

		btn_TK_QLTK = new JButton("Tìm kiếm");
		btn_TK_QLTK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taiKhoan tk = new taiKhoan();
				tk.setHoVaTen(txt_TK_QLTK.getText());
				showData_QLTK(connect_taiKhoan.findbyTen(tk));
				if (table_QLTK.getRowCount() == 0) {
					JOptionPane.showMessageDialog(null, "Không có thí sinh này.\n" + "Vui lòng nhập lại!");
				}
			}
		});
		btn_TK_QLTK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_TK_QLTK.setBounds(593, 72, 123, 37);
		panel_QuanLiTaiKhoan.add(btn_TK_QLTK);

		lblMTS_QLTK = new JLabel("Mã thí sinh");
		lblMTS_QLTK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMTS_QLTK.setBounds(1018, 140, 99, 27);
		panel_QuanLiTaiKhoan.add(lblMTS_QLTK);

		txt_Ma_QLTK = new JTextField();
		txt_Ma_QLTK.setBounds(1144, 140, 154, 27);
		panel_QuanLiTaiKhoan.add(txt_Ma_QLTK);
		txt_Ma_QLTK.setColumns(10);

		lblHVT_QLTK = new JLabel("Họ và tên");
		lblHVT_QLTK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHVT_QLTK.setBounds(1018, 208, 99, 27);
		panel_QuanLiTaiKhoan.add(lblHVT_QLTK);

		txt_Ten_QLTK = new JTextField();
		txt_Ten_QLTK.setColumns(10);
		txt_Ten_QLTK.setBounds(1144, 208, 237, 27);
		panel_QuanLiTaiKhoan.add(txt_Ten_QLTK);

		lblTDN_QLTK = new JLabel("Tên đăng nhập");
		lblTDN_QLTK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTDN_QLTK.setBounds(1018, 271, 99, 27);
		panel_QuanLiTaiKhoan.add(lblTDN_QLTK);

		txt_User_QLTK = new JTextField();
		txt_User_QLTK.setColumns(10);
		txt_User_QLTK.setBounds(1144, 271, 191, 27);
		panel_QuanLiTaiKhoan.add(txt_User_QLTK);

		lblMK_QLTK = new JLabel("Mật khẩu");
		lblMK_QLTK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMK_QLTK.setBounds(1018, 337, 99, 27);
		panel_QuanLiTaiKhoan.add(lblMK_QLTK);

		txt_Pass_QLTK = new JTextField();
		txt_Pass_QLTK.setColumns(10);
		txt_Pass_QLTK.setBounds(1144, 337, 191, 27);
		panel_QuanLiTaiKhoan.add(txt_Pass_QLTK);

		JLabel label1 = new JLabel();
		btn_Reset_QLTK = new JButton("Reset mật khẩu");
		btn_Reset_QLTK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taiKhoan tk = new taiKhoan();
				tk.setTenDangNhap(txt_User_QLTK.getText());

				JFrame fr = new JFrame("EXIT");
				Object[] options = { "Có, chắc chắn", "Không, tôi đã thay đổi ý định", "Hủy bỏ" };
				int result = JOptionPane.showOptionDialog(fr, "Bạn có chắc reset tài khoản này?", "Xác nhận",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				if (result == JOptionPane.YES_OPTION) {
					label1.setText("Bạn chọn: Yes");
					connect_taiKhoan.Reset(tk);
					JOptionPane.showMessageDialog(null, "Reset thành công!");
					showData_QLTK(connect_taiKhoan.findAll());
				} else if (result == JOptionPane.NO_OPTION) {
					label1.setText("Bạn chọn : No");
				} else if (result == JOptionPane.CANCEL_OPTION) {
					label1.setText("Ban chon cancel");
				} else {
					label1.setText("Chưa ");
				}
			}
		});
		btn_Reset_QLTK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_Reset_QLTK.setBounds(1048, 486, 154, 37);
		panel_QuanLiTaiKhoan.add(btn_Reset_QLTK);

		btn_HT_QLTK = new JButton("Hủy tìm");
		btn_HT_QLTK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showData_QLTK(connect_taiKhoan.findAll());
			}
		});
		btn_HT_QLTK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_HT_QLTK.setBounds(729, 72, 123, 37);
		panel_QuanLiTaiKhoan.add(btn_HT_QLTK);

		lbTKTT_QLTK = new JLabel("Tìm kiếm thông tin(theo họ tên)");
		lbTKTT_QLTK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbTKTT_QLTK.setBounds(93, 77, 219, 27);
		panel_QuanLiTaiKhoan.add(lbTKTT_QLTK);

		txt_TK_QLTK = new JTextField();
		txt_TK_QLTK.setBounds(304, 78, 239, 27);
		panel_QuanLiTaiKhoan.add(txt_TK_QLTK);
		txt_TK_QLTK.setColumns(10);

		lbGmail_QLTK = new JLabel("Gmail");
		lbGmail_QLTK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbGmail_QLTK.setBounds(1018, 407, 99, 27);
		panel_QuanLiTaiKhoan.add(lbGmail_QLTK);

		txt_Gmail_QLTK = new JTextField();
		txt_Gmail_QLTK.setColumns(10);
		txt_Gmail_QLTK.setBounds(1144, 407, 225, 27);
		panel_QuanLiTaiKhoan.add(txt_Gmail_QLTK);

		btn_XTK_QLTK = new JButton("Xóa tài khoản");
		btn_XTK_QLTK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taiKhoan tk = new taiKhoan();
				tk.setHoVaTen(txt_Ten_QLTK.getText());
				int luachon = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa không?");
				if (luachon == JOptionPane.YES_OPTION) {
					connect_taiKhoan.delete(tk);
				}
				showData_QLTK(connect_taiKhoan.findAll());
			}
		});
		btn_XTK_QLTK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_XTK_QLTK.setBounds(1218, 486, 154, 37);
		panel_QuanLiTaiKhoan.add(btn_XTK_QLTK);

		// Menu sự kiện và thông tin
		JButton btn_SKTT = new JButton("Sự kiện & Thông tin");
		btn_SKTT.setBackground(SystemColor.activeCaption);
		Image img = new ImageIcon(this.getClass().getResource("/image/event.png")).getImage().getScaledInstance(20, 20,
				DO_NOTHING_ON_CLOSE);
		btn_SKTT.setIcon(new ImageIcon(img));
		btn_SKTT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(panel_ThongKe);
				contentPane.remove(panel_QuanLiTaiKhoan);
				contentPane.remove(panel_QuanLiDiemThi);
				contentPane.remove(panel_KhoaQLKD);
				contentPane.remove(panel_KhoaKTH);
				contentPane.remove(panel_KhoaGDDT);
				contentPane.remove(panel_KhoaCNTT);
				contentPane.add(panel_TrangChu);
				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		btn_SKTT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_SKTT.setBounds(0, 0, 162, 36);
		contentPane.add(btn_SKTT);

		// Menu công nghệ thông tin
		JButton btn_CNTT = new JButton("Công nghệ thông tin");
		btn_CNTT.setBackground(SystemColor.activeCaption);
		Image img2 = new ImageIcon(this.getClass().getResource("/image/it.png")).getImage().getScaledInstance(20, 20,
				DO_NOTHING_ON_CLOSE);
		btn_CNTT.setIcon(new ImageIcon(img2));
		btn_CNTT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(panel_ThongKe);
				contentPane.remove(panel_QuanLiTaiKhoan);
				contentPane.remove(panel_QuanLiDiemThi);
				contentPane.remove(panel_KhoaQLKD);
				contentPane.remove(panel_KhoaKTH);
				contentPane.remove(panel_KhoaGDDT);
				contentPane.remove(panel_TrangChu);
				contentPane.add(panel_KhoaCNTT);
				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		btn_CNTT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_CNTT.setBounds(160, 0, 179, 36);
		contentPane.add(btn_CNTT);

		// Menu giáo dục và đào tạo
		JButton btn_GDDT = new JButton("Giáo dục & đào tạo");
		btn_GDDT.setBackground(SystemColor.activeCaption);
		Image img3 = new ImageIcon(this.getClass().getResource("/image/edu.png")).getImage().getScaledInstance(20, 20,
				DO_NOTHING_ON_CLOSE);
		btn_GDDT.setIcon(new ImageIcon(img3));
		btn_GDDT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(panel_ThongKe);
				contentPane.remove(panel_QuanLiTaiKhoan);
				contentPane.remove(panel_QuanLiDiemThi);
				contentPane.remove(panel_KhoaQLKD);
				contentPane.remove(panel_KhoaKTH);
				contentPane.remove(panel_KhoaCNTT);
				contentPane.remove(panel_TrangChu);
				contentPane.add(panel_KhoaGDDT);
				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		btn_GDDT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_GDDT.setBounds(333, 0, 162, 36);
		contentPane.add(btn_GDDT);

		// Menu kỹ thuật
		JButton btn_KT = new JButton("Kỹ thuật");
		btn_KT.setBackground(SystemColor.activeCaption);
		Image img4 = new ImageIcon(this.getClass().getResource("/image/car.png")).getImage().getScaledInstance(20, 20,
				DO_NOTHING_ON_CLOSE);
		btn_KT.setIcon(new ImageIcon(img4));
		btn_KT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(panel_ThongKe);
				contentPane.remove(panel_QuanLiTaiKhoan);
				contentPane.remove(panel_QuanLiDiemThi);
				contentPane.remove(panel_KhoaQLKD);
				contentPane.remove(panel_KhoaCNTT);
				contentPane.remove(panel_KhoaGDDT);
				contentPane.remove(panel_TrangChu);
				contentPane.add(panel_KhoaKTH);
				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		btn_KT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_KT.setBounds(493, 0, 149, 36);
		contentPane.add(btn_KT);

		// Menu kinh doanh quản lí
		JButton btn_KDQL = new JButton("Kinh doanh & Quản lí");
		btn_KDQL.setBackground(SystemColor.activeCaption);
		Image img5 = new ImageIcon(this.getClass().getResource("/image/busin.png")).getImage().getScaledInstance(20, 20,
				DO_NOTHING_ON_CLOSE);
		btn_KDQL.setIcon(new ImageIcon(img5));
		btn_KDQL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(panel_ThongKe);
				contentPane.remove(panel_QuanLiTaiKhoan);
				contentPane.remove(panel_QuanLiDiemThi);
				contentPane.remove(panel_KhoaCNTT);
				contentPane.remove(panel_KhoaKTH);
				contentPane.remove(panel_KhoaGDDT);
				contentPane.remove(panel_TrangChu);
				contentPane.add(panel_KhoaQLKD);
				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		btn_KDQL.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_KDQL.setBounds(638, 0, 179, 36);
		contentPane.add(btn_KDQL);

		// Menu quản lí điểm thi
		JButton btnQLDT = new JButton("Quản lí điểm thi");
		btnQLDT.setBackground(SystemColor.activeCaption);
		Image img6 = new ImageIcon(this.getClass().getResource("/image/score.png")).getImage().getScaledInstance(20, 20,
				DO_NOTHING_ON_CLOSE);
		btnQLDT.setIcon(new ImageIcon(img6));
		btnQLDT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(panel_ThongKe);
				contentPane.remove(panel_QuanLiTaiKhoan);
				contentPane.remove(panel_KhoaCNTT);
				contentPane.remove(panel_KhoaQLKD);
				contentPane.remove(panel_KhoaKTH);
				contentPane.remove(panel_KhoaGDDT);
				contentPane.remove(panel_TrangChu);
				contentPane.add(panel_QuanLiDiemThi);
				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		btnQLDT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnQLDT.setBounds(813, 0, 162, 36);
		contentPane.add(btnQLDT);

		// Menu quản lí tài khoản
		JButton btn_QLTK = new JButton("Quản lí tài khoản");
		btn_QLTK.setBackground(SystemColor.activeCaption);
		Image img7 = new ImageIcon(this.getClass().getResource("/image/account.png")).getImage().getScaledInstance(20,
				20, DO_NOTHING_ON_CLOSE);
		btn_QLTK.setIcon(new ImageIcon(img7));
		btn_QLTK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(panel_ThongKe);
				contentPane.remove(panel_KhoaCNTT);
				contentPane.remove(panel_QuanLiDiemThi);
				contentPane.remove(panel_KhoaQLKD);
				contentPane.remove(panel_KhoaKTH);
				contentPane.remove(panel_KhoaGDDT);
				contentPane.remove(panel_TrangChu);
				contentPane.add(panel_QuanLiTaiKhoan);
				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		btn_QLTK.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_QLTK.setBounds(973, 0, 162, 36);
		contentPane.add(btn_QLTK);

		// Menu thống kê
		JButton btn_TK = new JButton("Thống kê");
		btn_TK.setBackground(SystemColor.activeCaption);
		Image img8 = new ImageIcon(this.getClass().getResource("/image/list.png")).getImage().getScaledInstance(20, 20,
				DO_NOTHING_ON_CLOSE);
		btn_TK.setIcon(new ImageIcon(img8));
		btn_TK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(panel_KhoaCNTT);
				contentPane.remove(panel_QuanLiTaiKhoan);
				contentPane.remove(panel_QuanLiDiemThi);
				contentPane.remove(panel_KhoaQLKD);
				contentPane.remove(panel_KhoaKTH);
				contentPane.remove(panel_KhoaGDDT);
				contentPane.remove(panel_TrangChu);
				contentPane.add(panel_ThongKe);
				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		btn_TK.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_TK.setBounds(1133, 0, 162, 36);
		contentPane.add(btn_TK);

		// Nút đăng xuất
		JLabel label_QLTK = new JLabel();
		JButton btn_DX = new JButton("Đăng xuất");
		btn_DX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fr = new JFrame("EXIT");
				Object[] options = { "Đăng xuất", "Hủy bỏ" };
				int result = JOptionPane.showOptionDialog(fr, "Bạn có muốn đăng xuất không?", "EXIT",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				if (result == JOptionPane.YES_OPTION) {
					label_QLTK.setText("Bạn chọn: Yes");
					dispose();
					DangNhap cp = new DangNhap();
					cp.setLocationRelativeTo(null);
					cp.setVisible(true);
				} else if (result == JOptionPane.NO_OPTION) {
					label_QLTK.setText("Bạn chọn : No");
				} else {
					label_QLTK.setText("Chưa ");
				}
			}
		});
		btn_DX.setBackground(SystemColor.activeCaption);
		Image img9 = new ImageIcon(this.getClass().getResource("/image/logout.png")).getImage().getScaledInstance(20,
				20, DO_NOTHING_ON_CLOSE);
		btn_DX.setIcon(new ImageIcon(img9));
		btn_DX.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_DX.setBounds(1291, 0, 149, 36);
		contentPane.add(btn_DX);

		// hiển thị danh sách tài khoản trên bảng
		showData_QLTK(connect_taiKhoan.findAll());

		// hiển thị danh sách khối A00 trên bảng
		showData_QLDT_A00(connect_khoiA00.findAll());

		// hiển thị danh sách khối A01 trên bảng
		showData_QLDT_A01(connect_khoiA01.findAll());

		// hiển thị danh sách khối A02 trên bảng
		showData_QLDT_A02(connect_khoiA02.findAll());

		// hiển thị danh sách khối A03 trên bảng
		showData_QLDT_A03(connect_khoiA03.findAll());

		// hiển thị danh sách khối A04 trên bảng
		showData_QLDT_A04(connect_khoiA04.findAll());

		// hiển thị danh sách khối A05 trên bảng
		showData_QLDT_A05(connect_khoiA05.findAll());

		// hiển thị danh sách khối A06 trên bảng
		showData_QLDT_A06(connect_khoiA06.findAll());

		// hiển thị danh sách khối A07 trên bảng
		showData_QLDT_A07(connect_khoiA07.findAll());

		// hiển thị danh sách khối A08 trên bảng
		showData_QLDT_A08(connect_khoiA08.findAll());

		// hiển thị danh sách ngành công nghệ thông tin lên bảng
		showData_CNTT(connect_thiSinh.findAll_CNTT());

		// hiển thị danh sách ngành khoa học máy tính lên bảng
		showData_KHMT(connect_thiSinh.findAll_KHMT());

		// hiển thị danh sách ngành hệ thống thông tin lên bảng
		showData_HTTT(connect_thiSinh.findAll_HTTT());

		// hiển thị danh sách ngành kỹ thuật phần mềm lên bảng
		showData_KTPM(connect_thiSinh.findAll_KTPM());

		// hiển thị danh sách ngành học sư phạm lên bảng
		showData_HSP(connect_thiSinh.findAll_HSP());

		// hiển thị danh sách ngành giáo dục trẻ em lên bảng
		showData_GDTE(connect_thiSinh.findAll_GDTE());

		// hiển thị danh sách ngành giáo dục người lớn lên bảng
		showData_GDNL(connect_thiSinh.findAll_GDNL());

		// hiển thị danh sách ngành quản lí giáo dục lên bảng
		showData_HSP(connect_thiSinh.findAll_HSP());

		// hiển thị danh sách ngành kỹ thuật cơ khí lên bảng
		showData_KTCK(connect_thiSinh.findAll_KTCK());

		// hiển thị danh sách ngành kĩ thuật ô tô lên bảng
		showData_KTOT(connect_thiSinh.findAll_KTOT());

		// hiển thị danh sách ngành khoa học hàng hải lên bảng
		showData_KHHH(connect_thiSinh.findAll_KHHH());

		// hiển thị danh sách ngành cơ điện tử lên bảng
		showData_CDT(connect_thiSinh.findAll_CDT());

		// hiển thị danh sách ngành thương mại điện tử lên bảng
		showData_TMDT(connect_thiSinh.findAll_TMDT());

		// hiển thị danh sách ngành kế toán lên bảng
		showData_KT(connect_thiSinh.findAll_KT());

		// hiển thị danh sách ngành quản lí chất lượng lên bảng
		showData_QLCL(connect_thiSinh.findAll_QLCL());

		// hiển thị danh sách ngành marketing lên bảng
		showData_MKT(connect_thiSinh.findAll_MKT());

		// hiển thị danh sách thống kê
		showData_ThongKe(connect_thongKe.findAll());
	}

	// hàm gọi danh sách tài khoản
	public void showData_QLTK(List<taiKhoan> thisinhl) {
		List<taiKhoan> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModelTK;
		table_QLTK.getModel();
		tableModelTK = (DefaultTableModel) table_QLTK.getModel();
		tableModelTK.setRowCount(0);
		dsts.forEach((thisinh) -> {
			tableModelTK.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), thisinh.getTenDangNhap(),
					thisinh.getMatKhau(), thisinh.getGmail() });
		});
	}

	// hàm gọi danh sách khối A00
	public void showData_QLDT_A00(List<khoiA00> thisinhl) {
		List<khoiA00> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_A00.getModel();
		tableModel = (DefaultTableModel) table_A00.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), thisinh.getNamSinh(),
					gioitinh, thisinh.getToan(), thisinh.getLi(), thisinh.getHoa(), thisinh.getUuTien(),
					thisinh.getTongdiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách khối A01
	public void showData_QLDT_A01(List<khoiA01> thisinhl) {
		List<khoiA01> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_A01.getModel();
		tableModel = (DefaultTableModel) table_A01.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), thisinh.getNamSinh(),
					gioitinh, thisinh.getToan(), thisinh.getHoa(), thisinh.getSinh(), thisinh.getUuTien(),
					thisinh.getTongdiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách khối A02
	public void showData_QLDT_A02(List<khoiA02> thisinhl) {
		List<khoiA02> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_A02.getModel();
		tableModel = (DefaultTableModel) table_A02.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), thisinh.getNamSinh(),
					gioitinh, thisinh.getToan(), thisinh.getHoa(), thisinh.getSu(), thisinh.getUuTien(),
					thisinh.getTongdiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách khối A03
	public void showData_QLDT_A03(List<khoiA03> thisinhl) {
		List<khoiA03> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_A03.getModel();
		tableModel = (DefaultTableModel) table_A03.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), thisinh.getNamSinh(),
					gioitinh, thisinh.getToan(), thisinh.getSu(), thisinh.getDia(), thisinh.getUuTien(),
					thisinh.getTongdiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách khối A04
	public void showData_QLDT_A04(List<khoiA04> thisinhl) {
		List<khoiA04> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_A04.getModel();
		tableModel = (DefaultTableModel) table_A04.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), thisinh.getNamSinh(),
					gioitinh, thisinh.getVan(), thisinh.getSu(), thisinh.getDia(), thisinh.getUuTien(),
					thisinh.getTongdiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách khối A05
	public void showData_QLDT_A05(List<khoiA05> thisinhl) {
		List<khoiA05> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_A05.getModel();
		tableModel = (DefaultTableModel) table_A05.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), thisinh.getNamSinh(),
					gioitinh, thisinh.getVan(), thisinh.getToan(), thisinh.getAnh(), thisinh.getUuTien(),
					thisinh.getTongdiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách khối A06
	public void showData_QLDT_A06(List<khoiA06> thisinhl) {
		List<khoiA06> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_A06.getModel();
		tableModel = (DefaultTableModel) table_A06.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), thisinh.getNamSinh(),
					gioitinh, thisinh.getToan(), thisinh.getLi(), thisinh.getSu(), thisinh.getUuTien(),
					thisinh.getTongdiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách khối A07
	public void showData_QLDT_A07(List<khoiA07> thisinhl) {
		List<khoiA07> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_A07.getModel();
		tableModel = (DefaultTableModel) table_A07.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), thisinh.getNamSinh(),
					gioitinh, thisinh.getToan(), thisinh.getHoa(), thisinh.getDia(), thisinh.getUuTien(),
					thisinh.getTongdiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách khối A08
	public void showData_QLDT_A08(List<khoiA08> thisinhl) {
		List<khoiA08> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_A08.getModel();
		tableModel = (DefaultTableModel) table_A08.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), thisinh.getNamSinh(),
					gioitinh, thisinh.getToan(), thisinh.getLi(), thisinh.getMy(), thisinh.getUuTien(),
					thisinh.getTongdiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành công nghệ thông tin
	public void showData_CNTT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_CNTT.getModel();
		tableModel = (DefaultTableModel) table_CNTT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành khoa học máy tính
	public void showData_KHMT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_KHMT.getModel();
		tableModel = (DefaultTableModel) table_KHMT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành hệ thống thông tin
	public void showData_HTTT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_HTTT.getModel();
		tableModel = (DefaultTableModel) table_HTTT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành kỹ thuật phần mềm
	public void showData_KTPM(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_KTPM.getModel();
		tableModel = (DefaultTableModel) table_KTPM.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành học sư phạm
	public void showData_HSP(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_HSP.getModel();
		tableModel = (DefaultTableModel) table_HSP.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành giáo dục trẻ em
	public void showData_GDTE(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_GDTE.getModel();
		tableModel = (DefaultTableModel) table_GDTE.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành giáo dục trẻ em trúng tuyển
	public void showData_GDTE_TT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_GDTE_TT.getModel();
		tableModel = (DefaultTableModel) table_GDTE_TT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành giáo dục người lớn
	public void showData_GDNL(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_GDNL.getModel();
		tableModel = (DefaultTableModel) table_GDNL.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành giáo dục người lớn trúng tuyển
	public void showData_GDNL_TT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_GDNL_TT.getModel();
		tableModel = (DefaultTableModel) table_GDNL_TT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành quản lí giáo dục
	public void showData_QLGD(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_QLGD.getModel();
		tableModel = (DefaultTableModel) table_QLGD.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành quản lí giáo dục trúng tuyển
	public void showData_QLGD_TT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_QLGD_TT.getModel();
		tableModel = (DefaultTableModel) table_QLGD_TT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành công nghệ thông tin trúng tuyển
	public void showData_CNTT_TT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_CNTT_TT.getModel();
		tableModel = (DefaultTableModel) table_CNTT_TT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành khoa học máy tính trúng tuyển
	public void showData_KHMT_TT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_KHMT_TT.getModel();
		tableModel = (DefaultTableModel) table_KHMT_TT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành hệ thống thông tin trúng tuyển
	public void showData_HTTT_TT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_HTTT_TT.getModel();
		tableModel = (DefaultTableModel) table_HTTT_TT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành kỹ thuật phần mềm trúng tuyển
	public void showData_KTPM_TT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_KTPM_TT.getModel();
		tableModel = (DefaultTableModel) table_KTPM_TT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành học sư phạm trúng tuyển
	public void showData_HSP_TT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_HSP_TT.getModel();
		tableModel = (DefaultTableModel) table_HSP_TT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách thống kê
	public void showData_ThongKe(List<thongKe> thisinhl) {
		List<thongKe> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_TK.getModel();
		tableModel = (DefaultTableModel) table_TK.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), thisinh.getAnh(),
					thisinh.getNganhThi(), thisinh.getKhoiThi(), thisinh.getTongDiem(), thisinh.getThuTuNV() });
		});
	}

	// hàm gọi danh sách ngành kĩ thuật cơ khí
	public void showData_KTCK(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_KTCK.getModel();
		tableModel = (DefaultTableModel) table_KTCK.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành kĩ thuật cơ khí trúng tuyển
	public void showData_KTCK_TT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_KTCK_TT.getModel();
		tableModel = (DefaultTableModel) table_KTCK_TT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành kĩ thuật ô tô
	public void showData_KTOT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_KTOT.getModel();
		tableModel = (DefaultTableModel) table_KTOT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành kĩ thuật ô tô trúng tuyển
	public void showData_KTOT_TT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_KTOT_TT.getModel();
		tableModel = (DefaultTableModel) table_KTOT_TT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành khoa học hàng hải
	public void showData_KHHH(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_KHHH.getModel();
		tableModel = (DefaultTableModel) table_KHHH.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành khoa học hàng hải trúng tuyển
	public void showData_KHHH_TT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_KHHH_TT.getModel();
		tableModel = (DefaultTableModel) table_KHHH_TT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành cơ điện tử
	public void showData_CDT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_CDT.getModel();
		tableModel = (DefaultTableModel) table_CDT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành cơ điện tử trúng tuyển
	public void showData_CDT_TT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_CDT_TT.getModel();
		tableModel = (DefaultTableModel) table_CDT_TT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành thương mại điện tử
	public void showData_TMDT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_TMDT.getModel();
		tableModel = (DefaultTableModel) table_TMDT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành thương mại điện tử trúng tuyển
	public void showData_TMDT_TT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_TMDT_TT.getModel();
		tableModel = (DefaultTableModel) table_TMDT_TT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành kế toán
	public void showData_KT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_KT.getModel();
		tableModel = (DefaultTableModel) table_KT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành kế toán trúng tuyển
	public void showData_KT_TT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_KT_TT.getModel();
		tableModel = (DefaultTableModel) table_KT_TT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành quản lí chất lượng
	public void showData_QLCL(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_QLCL.getModel();
		tableModel = (DefaultTableModel) table_QLCL.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành quản lí chất lượng trúng tuyển
	public void showData_QLCL_TT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_QLCL_TT.getModel();
		tableModel = (DefaultTableModel) table_QLCL_TT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành marketing
	public void showData_MKT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_MKT.getModel();
		tableModel = (DefaultTableModel) table_MKT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}

	// hàm gọi danh sách ngành marketing trúng tuyển
	public void showData_MKT_TT(List<thiSinh> thisinhl) {
		List<thiSinh> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModel;
		table_MKT_TT.getModel();
		tableModel = (DefaultTableModel) table_MKT_TT.getModel();
		tableModel.setRowCount(0);
		dsts.forEach((thisinh) -> {
			String gioitinh;
			if (thisinh.getGioiTinh() == 0)
				gioitinh = "Nam";
			else {
				gioitinh = "Nữ";
			}
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), gioitinh,
					thisinh.getNamSinh(), thisinh.getTongDiem(), thisinh.getDiemHocBa() });
		});
	}
}

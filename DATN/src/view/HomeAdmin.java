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

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import controller.connect_CNTT;
import controller.connect_khoiA01;
import controller.connect_taiKhoan;
import controller.connect_thongKe;
import model.CNTT;
import model.khoiA01;
import model.taiKhoan;
import model.thongKe;

import javax.swing.JComboBox;

public class HomeAdmin extends JFrame {

	private JPanel contentPane;
	private JPanel panel2_1;
	private JPanel panel2_2;
	private JPanel panel2_3;
	private JPanel panel2_4;
	private JPanel panel2_1_1;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel2;
	private JPanel panel5;
	private JPanel panel6;
	private JPanel panel7;
	private JPanel panel8;
	private JPanel panel;
	private JTextField txtDCDT;
	private JTable table_CNTT;
	private JPanel pane6_0;
	private JPanel pane6_1;
	private JPanel pane6_2;
	private JPanel pane6_3;
	private JPanel pane6_4;
	private JPanel pane6_5;
	private JPanel pane6_6;
	private JPanel pane6_7;
	private JPanel pane6_8;
	private JTextField txtDCHB;
	private JTable table2;
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
		
		panel = new JPanel();
		panel.setBackground(SystemColor.control);
		panel.setBounds(0, 35, 1440, 673);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbThongBao = new JLabel("THÔNG BÁO TỪ BAN TUYỂN SINH TRƯỜNG ĐẠI HỌC VIỆT Á");
		lbThongBao.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbThongBao.setBounds(345, 21, 734, 42);
		panel.add(lbThongBao);
		
		JLabel Logo = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/image/logo.jpg")).getImage();
		Logo.setIcon(new ImageIcon(img1));
		Logo.setBounds(1170, 73, 242, 240);
		panel.add(Logo);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textArea.setBounds(52, 73, 1360, 558);
		textArea.setText("1.1 Đối tượng tuyển sinh\r\n\r\nLà những thí sinh đã tốt nghiệp Trung học phổ thông hoặc tương đương.\r\n\r\n1.2 Phạm vi tuyển sinh\r\n\r\nTuyển sinh trên toàn quốc.\r\n\r\n1.3 Phương thức tuyển sinh\r\n\r\nNăm 2023, Trường Đại học Việt Á tuyển sinh 3600 chỉ tiêu trình độ Đại học chính quy với 47 chuyên ngành đào tạo theo 03 phương thức xét tuyển độc lập:\r\n\r\n- Phương thức 1 (PT1): Xét tuyển dựa trên kết quả Kỳ thi tốt nghiệp Trung học phổ thông năm 2022. Áp dụng cho toàn bộ các chuyên ngành.\r\n\r\n- Phương thức 2 (PT2): Xét tuyển thẳng theo đề án riêng của Trường Đại học Việt Á (Xét tuyển kết hợp) áp dụng cho toàn bộ các chuyên ngành đối với những thí sinh có tổng điểm các môn thi\n\n tốt nghiệp THPT năm 2022 trong tổ hợp môn xét tuyển đạt ngưỡng chất lượng đầu vào theo Quy định của Nhà trường và đáp ứng một trong các tiêu chí sau:\r\n\r\nTiêu chí 1: Có chứng chỉ Tiếng Anh quốc tế IELTS 5.0 hoặc TOEFL 494 ITP hoặc TOEFL 58 iBT hoặc Toeic (L&R) 595 trở lên trong thời hạn (tính đến ngày 30/08/2022).\r\n\r\nTiêu chí 2:  Đạt các giải Nhất, Nhì, Ba các môn thi Toán học, Vật lý, Hóa học, Sinh học, Ngữ văn, Lịch sử, Địa lý, Tin học và Ngoại ngữ trong kỳ thi chọn học sinh giỏi cấp Tỉnh, Thành phố trở lên.\r\n\r\nTiêu chí 3:  Học 03 năm THPT tại các lớp Chuyên: Toán học, Vật Lý, Hóa học, Sinh học, Ngữ văn, Tiếng Anh, Tin học, Khoa học tự nhiên thuộc các trường Chuyên cấp Tỉnh/Thành phố. Có học lực\n\n Khá trở lên và hạnh kiểm Tốt các năm lớp 10, 11, 12.\r\n\r\n- Phương thức 3 (PT3): Xét tuyển dựa trên kết quả học tập và rèn luyện trung học phổ thông (xét Học bạ) với 30% chỉ tiêu. Áp dụng 28 chuyên ngành thuộc nhóm Kỹ thuật & Công nghệ,\n\n 02 chuyên ngành thuộc nhóm Chất lượng cao (Công nghệ thông tin và Điện tự động công nghiệp).");
		panel.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Địa chỉ: Số 128, đường Hoàng Quốc Việt, quân Cầu Giấy, Hà Nội          Holine: 1900 8569");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(881, 641, 531, 22);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Trường Đại Học Việt Á");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(52, 641, 531, 22);
		panel.add(lblNewLabel_1);
		
		panel2 = new JPanel();
		panel2.setBackground(SystemColor.control);
		panel2.setBounds(0, 35, 1440, 673);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		JLabel lbKT = new JLabel("Ngành học");
		lbKT.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbKT.setBounds(71, 45, 86, 32);
		panel2.add(lbKT);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 35, 1402, 2);
		panel2.add(separator);
		
		JButton btn_NCNTT = new JButton("Công nghệ thông tin");
		btn_NCNTT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.remove(panel2_1_1);
				panel2.remove(panel2_2);
				panel2.remove(panel2_3);
				panel2.remove(panel2_4);
				panel2.add(panel2_1);
				panel2.revalidate();
				panel2.repaint();
			}
		});
		btn_NCNTT.setBackground(SystemColor.info);
		btn_NCNTT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_NCNTT.setBounds(0, 84, 234, 36);
		panel2.add(btn_NCNTT);
		
		JButton btn_KHMT = new JButton("Khoa học máy tính");
		btn_KHMT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.remove(panel2_1_1);
				panel2.remove(panel2_1);
				panel2.remove(panel2_3);
				panel2.remove(panel2_4);
				panel2.add(panel2_2);
				panel2.revalidate();
				panel2.repaint();
			}
		});
		btn_KHMT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_KHMT.setBackground(SystemColor.info);
		btn_KHMT.setBounds(0, 118, 234, 36);
		panel2.add(btn_KHMT);
		
		JButton btn_HTTT = new JButton("Hệ thống thông tin");
		btn_HTTT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.remove(panel2_1_1);
				panel2.remove(panel2_2);
				panel2.remove(panel2_1);
				panel2.remove(panel2_4);
				panel2.add(panel2_3);
				panel2.revalidate();
				panel2.repaint();
			}
		});
		btn_HTTT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_HTTT.setBackground(SystemColor.info);
		btn_HTTT.setBounds(0, 152, 234, 36);
		panel2.add(btn_HTTT);
		
		JButton btn_KTPM = new JButton("Kỹ thuật phần mềm");
		btn_KTPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.remove(panel2_1_1);
				panel2.remove(panel2_2);
				panel2.remove(panel2_3);
				panel2.remove(panel2_1);
				panel2.add(panel2_4);
				panel2.revalidate();
				panel2.repaint();
			}
		});
		btn_KTPM.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_KTPM.setBackground(SystemColor.info);
		btn_KTPM.setBounds(0, 186, 234, 36);
		panel2.add(btn_KTPM);
		
		JLabel lblNewLabel_2 = new JLabel("KHOA CÔNG NGHỆ THÔNG TIN");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(645, 1, 270, 32);
		panel2.add(lblNewLabel_2);
		
		panel2_1 = new JPanel();
		panel2_1.setBackground(Color.WHITE);
		panel2_1.setBounds(234, 35, 1171, 610);
		panel2.add(panel2_1);
		panel2_1.setLayout(null);
		
		JLabel lbDC = new JLabel("Chỉ tiêu điểm thi");
		lbDC.setBounds(38, 8, 129, 32);
		panel2_1.add(lbDC);
		lbDC.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btn_XDSTT = new JButton("Xuất danh sách trúng tuyển");
		btn_XDSTT.setBounds(952, 6, 207, 32);
		panel2_1.add(btn_XDSTT);
		btn_XDSTT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.remove(panel2_1);
				panel2.remove(panel2_2);
				panel2.remove(panel2_3);
				panel2.remove(panel2_4);
				panel2.add(panel2_1_1);
				panel2.revalidate();
				panel2.repaint();
			}
		});
		btn_XDSTT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_XDSTT.setBackground(SystemColor.info);
		
		JLabel lbDC_1 = new JLabel("Điểm chuẩn điểm thi");
		lbDC_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbDC_1.setBounds(475, 8, 154, 32);
		panel2_1.add(lbDC_1);
		
		txtDCDT = new JTextField();
		txtDCDT.setColumns(10);
		txtDCDT.setBounds(628, 9, 62, 29);
		panel2_1.add(txtDCDT);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 49, 1182, 2);
		panel2_1.add(separator_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("DANH SÁCH THÍ SINH");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(458, 55, 207, 32);
		panel2_1.add(lblNewLabel_2_1);
		
		table_CNTT = new JTable();
		table_CNTT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_CNTT.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh", "N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1"
			}
		));
		table_CNTT.getColumnModel().getColumn(0).setPreferredWidth(66);
		table_CNTT.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_CNTT.getColumnModel().getColumn(1).setMinWidth(33);
		table_CNTT.getColumnModel().getColumn(2).setPreferredWidth(59);
		table_CNTT.getColumnModel().getColumn(2).setMinWidth(29);
		table_CNTT.getColumnModel().getColumn(3).setPreferredWidth(59);
		
		JScrollPane scrollPane = new JScrollPane(table_CNTT);
		scrollPane.setBounds(51, 104, 1041, 477);
		panel2_1.add(scrollPane);
		
		JLabel lbDC_2 = new JLabel("Chỉ tiêu học bạ");
		lbDC_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbDC_2.setBounds(254, 8, 129, 32);
		panel2_1.add(lbDC_2);
		
		JComboBox cboCTDT = new JComboBox();
		cboCTDT.setBounds(165, 14, 49, 21);
		panel2_1.add(cboCTDT);
		
		JComboBox cboCTHB = new JComboBox();
		cboCTHB.setBounds(373, 14, 49, 21);
		panel2_1.add(cboCTHB);
		
		JLabel lbDC_1_1 = new JLabel("Điểm chuẩn học bạ");
		lbDC_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbDC_1_1.setBounds(709, 8, 154, 32);
		panel2_1.add(lbDC_1_1);
		
		txtDCHB = new JTextField();
		txtDCHB.setColumns(10);
		txtDCHB.setBounds(850, 8, 62, 29);
		panel2_1.add(txtDCHB);
		
		panel2_2 = new JPanel();
		panel2_2.setBackground(Color.BLACK);
		panel2_2.setBounds(234, 35, 1171, 610);
		panel2.add(panel2_2);
		
		panel2_3 = new JPanel();
		panel2_3.setBackground(Color.BLUE);
		panel2_3.setBounds(234, 35, 1171, 610);
		panel2.add(panel2_3);
		
		panel2_4 = new JPanel();
		panel2_4.setBackground(Color.CYAN);
		panel2_4.setBounds(234, 35, 1171, 610);
		panel2.add(panel2_4);
		
		panel2_1_1 = new JPanel();
		panel2_1_1.setBackground(Color.WHITE);
		panel2_1_1.setBounds(234, 35, 1171, 610);
		panel2.add(panel2_1_1);
		
		table2 = new JTable();
		table2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh", "N\u0103m sinh", "T\u1ED5ng \u0111i\u1EC3m thi", "\u0110i\u1EC3m h\u1ECDc b\u1EA1"
			}
		));
		table2.getColumnModel().getColumn(0).setPreferredWidth(66);
		table2.getColumnModel().getColumn(1).setPreferredWidth(146);
		table2.getColumnModel().getColumn(1).setMinWidth(33);
		table2.getColumnModel().getColumn(2).setPreferredWidth(59);
		table2.getColumnModel().getColumn(2).setMinWidth(29);
		table2.getColumnModel().getColumn(3).setPreferredWidth(59);
		panel2_1_1.setLayout(null);
		
		JScrollPane scrollPane2 = new JScrollPane(table2);
		scrollPane2.setBounds(85, 77, 996, 448);
		panel2_1_1.add(scrollPane2);
		
		JLabel lblDSTT = new JLabel("DANH SÁCH THÍ SINH TRÚNG TUYỂN");
		lblDSTT.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDSTT.setBounds(382, 10, 363, 34);
		panel2_1_1.add(lblDSTT);
		
		JButton btnQL = new JButton("Quay lại");
		btnQL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQL.setBounds(985, 550, 91, 25);
		btnQL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.remove(panel2_1_1);
				panel2.remove(panel2_2);
				panel2.remove(panel2_3);
				panel2.remove(panel2_4);
				panel2.add(panel2_1);
				panel2.revalidate();
				panel2.repaint();
			}
		});
		panel2_1_1.add(btnQL);
		
		JButton btnXF = new JButton("Xuất file");
		btnXF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXF.setBounds(873, 550, 91, 25);
		panel2_1_1.add(btnXF);
		
		panel3 = new JPanel();
		panel3.setBackground(Color.RED);
		panel3.setBounds(0, 35, 1440, 673);
		contentPane.add(panel3);
		
		panel4 = new JPanel();
		panel4.setBackground(Color.MAGENTA);
		panel4.setBounds(0, 35, 1440, 673);
		contentPane.add(panel4);
		
		panel5 = new JPanel();
		panel5.setBackground(Color.YELLOW);
		panel5.setBounds(0, 35, 1440, 673);
		contentPane.add(panel5);
		
		//Nội dung quản lí điểm thi
		panel6 = new JPanel();
		panel6.setBackground(Color.WHITE);
		panel6.setBounds(0, 35, 1440, 673);
		contentPane.add(panel6);
		panel6.setLayout(null);
		
		JLabel lbKhoiThi = new JLabel("KHỐI THI");
		lbKhoiThi.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbKhoiThi.setBounds(677, 5, 103, 29);
		panel6.add(lbKhoiThi);
		
		JSeparator separator2 = new JSeparator();
		separator2.setBounds(0, 39, 1430, 2);
		panel6.add(separator2);
		
		btnA00 = new JButton("Khối A00");
		Image img10 = new ImageIcon(this.getClass().getResource("/image/A00.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btnA00.setIcon(new ImageIcon(img10));
		btnA00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel6.remove(pane6_8);
				panel6.remove(pane6_7);
				panel6.remove(pane6_6);
				panel6.remove(pane6_5);
				panel6.remove(pane6_4);
				panel6.remove(pane6_3);
				panel6.remove(pane6_2);
				panel6.remove(pane6_1);
				panel6.add(pane6_0);
				panel6.revalidate();
				panel6.repaint();
			}
		});
		btnA00.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnA00.setBackground(SystemColor.activeCaption);
		btnA00.setBounds(0, 39, 162, 36);
		panel6.add(btnA00);
		
		JButton btnA01 = new JButton("Khối A01");
		Image img11 = new ImageIcon(this.getClass().getResource("/image/A01.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btnA01.setIcon(new ImageIcon(img11));
		btnA01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel6.remove(pane6_8);
				panel6.remove(pane6_7);
				panel6.remove(pane6_6);
				panel6.remove(pane6_5);
				panel6.remove(pane6_4);
				panel6.remove(pane6_3);
				panel6.remove(pane6_2);
				panel6.remove(pane6_0);
				panel6.add(pane6_1);
				panel6.revalidate();
				panel6.repaint();
			}
		});
		btnA01.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnA01.setBackground(SystemColor.activeCaption);
		btnA01.setBounds(160, 39, 162, 36);
		panel6.add(btnA01);
		
		JButton btnA02 = new JButton("Khối A02");
		Image img12 = new ImageIcon(this.getClass().getResource("/image/A02.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btnA02.setIcon(new ImageIcon(img12));
		btnA02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel6.remove(pane6_8);
				panel6.remove(pane6_7);
				panel6.remove(pane6_6);
				panel6.remove(pane6_5);
				panel6.remove(pane6_4);
				panel6.remove(pane6_3);
				panel6.remove(pane6_0);
				panel6.remove(pane6_1);
				panel6.add(pane6_2);
				panel6.revalidate();
				panel6.repaint();
			}
		});
		btnA02.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnA02.setBackground(SystemColor.activeCaption);
		btnA02.setBounds(320, 39, 162, 36);
		panel6.add(btnA02);
		
		JButton btnA03 = new JButton("Khối A03");
		Image img13 = new ImageIcon(this.getClass().getResource("/image/A03.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btnA03.setIcon(new ImageIcon(img13));
		btnA03.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnA03.setBackground(SystemColor.activeCaption);
		btnA03.setBounds(480, 39, 162, 36);
		panel6.add(btnA03);
		
		JButton btnA04 = new JButton("Khối A04");
		Image img14 = new ImageIcon(this.getClass().getResource("/image/A04.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btnA04.setIcon(new ImageIcon(img14));
		btnA04.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnA04.setBackground(SystemColor.activeCaption);
		btnA04.setBounds(640, 39, 162, 36);
		panel6.add(btnA04);
		
		JButton btnA05 = new JButton("Khối A05");
		Image img15 = new ImageIcon(this.getClass().getResource("/image/A05.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btnA05.setIcon(new ImageIcon(img15));
		btnA05.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnA05.setBackground(SystemColor.activeCaption);
		btnA05.setBounds(800, 39, 162, 36);
		panel6.add(btnA05);
		
		JButton btnA06 = new JButton("Khối A06");
		Image img16 = new ImageIcon(this.getClass().getResource("/image/A06.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btnA06.setIcon(new ImageIcon(img16));
		btnA06.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnA06.setBackground(SystemColor.activeCaption);
		btnA06.setBounds(960, 39, 162, 36);
		panel6.add(btnA06);
		
		JButton btnA07 = new JButton("Khối A07");
		Image img17 = new ImageIcon(this.getClass().getResource("/image/A07.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btnA07.setIcon(new ImageIcon(img17));
		btnA07.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnA07.setBackground(SystemColor.activeCaption);
		btnA07.setBounds(1120, 39, 162, 36);
		panel6.add(btnA07);
		
		JButton btnA08 = new JButton("Khối A08");
		Image img18 = new ImageIcon(this.getClass().getResource("/image/A08.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btnA08.setIcon(new ImageIcon(img18));
		btnA08.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnA08.setBackground(SystemColor.activeCaption);
		btnA08.setBounds(1278, 39, 162, 36);
		panel6.add(btnA08);
		
		pane6_0 = new JPanel();
		pane6_0.setBounds(0, 74, 1440, 589);
		pane6_0.setBackground(Color.WHITE);
		panel6.add(pane6_0);
		pane6_0.setLayout(null);
		
		JLabel lbKhoiThi_1 = new JLabel("KHỐI A00");
		lbKhoiThi_1.setBounds(678, 9, 100, 22);
		lbKhoiThi_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		pane6_0.add(lbKhoiThi_1);
		
		JSeparator separator_A00_1 = new JSeparator();
		separator_A00_1.setBounds(0, 38, 1430, 2);
		pane6_0.add(separator_A00_1);
		
		JLabel lblNewLabelMa_A00 = new JLabel("Mã thí sinh");
		lblNewLabelMa_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabelMa_A00.setBounds(109, 73, 83, 22);
		pane6_0.add(lblNewLabelMa_A00);
		
		txtMa_A00 = new JTextField();
		txtMa_A00.setBounds(202, 72, 100, 29);
		pane6_0.add(txtMa_A00);
		txtMa_A00.setColumns(10);
		
		JLabel lblNewLabelTen_A00 = new JLabel("Họ và tên");
		lblNewLabelTen_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabelTen_A00.setBounds(109, 120, 83, 22);
		pane6_0.add(lblNewLabelTen_A00);
		
		JLabel lblNewLabelNam_A00 = new JLabel("Năm sinh");
		lblNewLabelNam_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabelNam_A00.setBounds(109, 174, 83, 22);
		pane6_0.add(lblNewLabelNam_A00);
		
		JLabel lblNewLabelGT_A00 = new JLabel("Giới tính");
		lblNewLabelGT_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabelGT_A00.setBounds(109, 225, 83, 22);
		pane6_0.add(lblNewLabelGT_A00);
		
		JLabel lblNewLabelToan_A00 = new JLabel("Điểm Toán");
		lblNewLabelToan_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabelToan_A00.setBounds(109, 285, 83, 22);
		pane6_0.add(lblNewLabelToan_A00);
		
		JLabel lblNewLabelLi_A00 = new JLabel("Điểm Lí");
		lblNewLabelLi_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabelLi_A00.setBounds(346, 285, 83, 22);
		pane6_0.add(lblNewLabelLi_A00);
		
		JLabel lblNewLabelHoa_A00 = new JLabel("Điểm Hóa");
		lblNewLabelHoa_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabelHoa_A00.setBounds(109, 343, 83, 22);
		pane6_0.add(lblNewLabelHoa_A00);
		
		JLabel lblNewLabelUT_A00 = new JLabel("Điểm ưu tiên");
		lblNewLabelUT_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabelUT_A00.setBounds(319, 343, 114, 22);
		pane6_0.add(lblNewLabelUT_A00);
		
		txtTen_A00 = new JTextField();
		txtTen_A00.setColumns(10);
		txtTen_A00.setBounds(202, 119, 212, 29);
		pane6_0.add(txtTen_A00);
		
		txtNam_A00 = new JTextField();
		txtNam_A00.setColumns(10);
		txtNam_A00.setBounds(202, 173, 114, 29);
		pane6_0.add(txtNam_A00);
		
		JComboBox cboGT_A00 = new JComboBox();
		cboGT_A00.setModel(new DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));
		cboGT_A00.setBounds(202, 224, 74, 29);
		pane6_0.add(cboGT_A00);
		
		txtToan_A00 = new JTextField();
		txtToan_A00.setColumns(10);
		txtToan_A00.setBounds(202, 284, 74, 29);
		pane6_0.add(txtToan_A00);
		
		txtLi_A00 = new JTextField();
		txtLi_A00.setColumns(10);
		txtLi_A00.setBounds(418, 284, 74, 29);
		pane6_0.add(txtLi_A00);
		
		txtHoa_A00 = new JTextField();
		txtHoa_A00.setColumns(10);
		txtHoa_A00.setBounds(202, 342, 74, 29);
		pane6_0.add(txtHoa_A00);
		
		txtDUT_A00 = new JTextField();
		txtDUT_A00.setColumns(10);
		txtDUT_A00.setBounds(418, 342, 74, 29);
		pane6_0.add(txtDUT_A00);
		
		JSeparator separator_A00 = new JSeparator();
		separator_A00.setBounds(0, 466, 1430, 2);
		pane6_0.add(separator_A00);
		
		JButton btnLuu_A00 = new JButton("Lưu");
		btnLuu_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLuu_A00.setBounds(163, 490, 114, 34);
		pane6_0.add(btnLuu_A00);
		
		JButton btnLM_A00 = new JButton("Làm mới");
		btnLM_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLM_A00.setBounds(304, 490, 114, 34);
		pane6_0.add(btnLM_A00);
		
		JButton btnCN_A00 = new JButton("Cập nhật");
		btnCN_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCN_A00.setBounds(163, 545, 114, 34);
		pane6_0.add(btnCN_A00);
		
		JButton btnXoa_A00 = new JButton("Xóa");
		btnXoa_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXoa_A00.setBounds(304, 545, 114, 34);
		pane6_0.add(btnXoa_A00);
		
		table_A00 = new JTable();
		table_A00.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "N\u0103m sinh", "Gi\u1EDBi t\u00EDnh", "To\u00E1n", "L\u00ED", "H\u00F3a", "\u01AFu ti\u00EAn", "T\u1ED5ng \u0111i\u1EC3m", "\u0110i\u1EC3m h\u1ECDc b\u1EA1"
			}
		));
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

		
		JScrollPane scrollPane3 = new JScrollPane(table_A00);
		scrollPane3.setBounds(540, 105, 849, 362);
		pane6_0.add(scrollPane3);
		
		JLabel lblNewLabelTK_A00_1 = new JLabel("Tìm kiếm thông tin(theo mã thí sinh)");
		lblNewLabelTK_A00_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabelTK_A00_1.setBounds(645, 63, 265, 22);
		pane6_0.add(lblNewLabelTK_A00_1);
		
		txtTK_A00 = new JTextField();
		txtTK_A00.setColumns(10);
		txtTK_A00.setBounds(901, 56, 135, 29);
		pane6_0.add(txtTK_A00);
		
		JButton btnTK_A00 = new JButton("Tìm kiếm");
		btnTK_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTK_A00.setBounds(1072, 56, 123, 29);
		pane6_0.add(btnTK_A00);
		
		JButton btnHT_A00 = new JButton("Hủy tìm");
		btnHT_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHT_A00.setBounds(1221, 56, 123, 29);
		pane6_0.add(btnHT_A00);
		
		JLabel lblNewLabelHB_A00 = new JLabel("Điểm học bạ");
		lblNewLabelHB_A00.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabelHB_A00.setBounds(109, 396, 104, 22);
		pane6_0.add(lblNewLabelHB_A00);
		
		txtDHB_A00 = new JTextField();
		txtDHB_A00.setColumns(10);
		txtDHB_A00.setBounds(202, 395, 74, 29);
		pane6_0.add(txtDHB_A00);
		
		pane6_1 = new JPanel();
		pane6_1.setBounds(0, 74, 1440, 589);
		pane6_1.setBackground(Color.BLACK);
		panel6.add(pane6_1);
		
		pane6_2 = new JPanel();
		pane6_2.setBounds(0, 74, 1440, 589);
		pane6_2.setBackground(Color.BLUE);
		panel6.add(pane6_2);
		
		pane6_3 = new JPanel();
		pane6_3.setBounds(0, 74, 1440, 589);
		panel6.add(pane6_3);
		
		pane6_4 = new JPanel();
		pane6_4.setBounds(0, 74, 1440, 589);
		panel6.add(pane6_4);
		
		pane6_5 = new JPanel();
		pane6_5.setBounds(0, 74, 1440, 589);
		panel6.add(pane6_5);
		
		pane6_6 = new JPanel();
		pane6_6.setBounds(0, 74, 1440, 589);
		panel6.add(pane6_6);
		
		pane6_7 = new JPanel();
		pane6_7.setBounds(0, 74, 1440, 589);
		panel6.add(pane6_7);
		
		pane6_8 = new JPanel();
		pane6_8.setBounds(0, 74, 1440, 589);
		panel6.add(pane6_8);
		
		//Nội dung thống kê
		panel8 = new JPanel();
		panel8.setBackground(Color.WHITE);
		panel8.setBounds(0, 35, 1440, 673);
		contentPane.add(panel8);
		panel8.setLayout(null);
		
		JLabel lblDSXT = new JLabel("Danh sách xét tuyển");
		lblDSXT.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDSXT.setBounds(617, 5, 270, 37);
		panel8.add(lblDSXT);
		
		JScrollPane scrollPane6 = new JScrollPane();
		scrollPane6.setBounds(0, 50, 1430, 2);
		panel8.add(scrollPane6);
		
		table_TK = new JTable();
		table_TK.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "Hình ảnh", "Ng\u00E0nh thi", "Kh\u1ED1i thi", "T\u1ED5ng \u0111i\u1EC3m", "Th\u1EE9 t\u1EF1 NV"
			}
		));
		
		class ImageRenderer extends DefaultTableCellRenderer {
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
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

		
		//hiển thị bảng lên textbox của Quản lí tài khoản
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
		
		JScrollPane scrollPane_1 = new JScrollPane(table_TK);
		scrollPane_1.setBounds(51, 140, 878, 473);
		panel8.add(scrollPane_1);
		
		JButton btn_SXKhoi_TK = new JButton("Sắp xếp theo khối");
		btn_SXKhoi_TK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_SXKhoi_TK.setBounds(166, 77, 166, 37);
		panel8.add(btn_SXKhoi_TK);
		
		JButton btn_SXNganh_TK = new JButton("Sắp xếp theo ngành");
		btn_SXNganh_TK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_SXNganh_TK.setBounds(389, 77, 166, 37);
		panel8.add(btn_SXNganh_TK);
		
		JButton btn_SXDiem_TK = new JButton("Sắp xếp theo điểm");
		btn_SXDiem_TK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_SXDiem_TK.setBounds(612, 77, 166, 37);
		panel8.add(btn_SXDiem_TK);
		
		JLabel lblMTS = new JLabel("Mã thí sinh");
		lblMTS.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMTS.setBounds(1018, 140, 99, 27);
		panel8.add(lblMTS);
		
		txt_Ma_TK = new JTextField();
		txt_Ma_TK.setBounds(1144, 140, 154, 27);
		panel8.add(txt_Ma_TK);
		txt_Ma_TK.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Họ và tên");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(1018, 208, 99, 27);
		panel8.add(lblNewLabel_1_1);
		
		txt_Ten_TK = new JTextField();
		txt_Ten_TK.setColumns(10);
		txt_Ten_TK.setBounds(1144, 208, 237, 27);
		panel8.add(txt_Ten_TK);
		
		JLabel lblNewLabel_1_2 = new JLabel("Ngành thi");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(1018, 271, 99, 27);
		panel8.add(lblNewLabel_1_2);
		
		txt_Nganh_TK = new JTextField();
		txt_Nganh_TK.setColumns(10);
		txt_Nganh_TK.setBounds(1144, 271, 204, 27);
		panel8.add(txt_Nganh_TK);
		
		JLabel lblNewLabel_1_3 = new JLabel("Khối thi");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(1018, 337, 99, 27);
		panel8.add(lblNewLabel_1_3);
		
		txt_Khoi_TK = new JTextField();
		txt_Khoi_TK.setColumns(10);
		txt_Khoi_TK.setBounds(1144, 337, 131, 27);
		panel8.add(txt_Khoi_TK);
		
		JLabel lblNewLabel_1_4 = new JLabel("Tổng điểm");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_4.setBounds(1018, 407, 99, 27);
		panel8.add(lblNewLabel_1_4);
		
		txt_Tong_TK = new JTextField();
		txt_Tong_TK.setColumns(10);
		txt_Tong_TK.setBounds(1144, 407, 99, 27);
		panel8.add(txt_Tong_TK);
		
		JButton btn_TaoDiem_TK = new JButton("Tạo điểm");
		btn_TaoDiem_TK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_TaoDiem_TK.setBounds(1282, 465, 99, 47);
		panel8.add(btn_TaoDiem_TK);
		
		
		//Nội dung menu Quản lí tài khoản
		panel7 = new JPanel();
		panel7.setBackground(Color.WHITE);
		panel7.setBounds(0, 35, 1440, 673);
		contentPane.add(panel7);
		panel7.setLayout(null);
		
		JLabel lblDSTK = new JLabel("Danh sách tài khoản");
		lblDSTK.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDSTK.setBounds(617, 5, 270, 37);
		panel7.add(lblDSTK);
		
		JScrollPane scrollPane7 = new JScrollPane();
		scrollPane7.setBounds(0, 50, 1430, 2);
		panel7.add(scrollPane7);
		
		table_QLTK = new JTable();
		table_QLTK.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 th\u00ED sinh", "H\u1ECD v\u00E0 t\u00EAn", "T\u00EAn \u0111\u0103ng nh\u1EADp", "M\u1EADt kh\u1EA9u", "Gmail"
			}
		));
		
		//hiển thị bảng lên textbox của Quản lí tài khoản
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
		
		JScrollPane scrollPane8 = new JScrollPane(table_QLTK);
		scrollPane8.setBounds(51, 140, 878, 473);
		panel7.add(scrollPane8);
		
		JButton btn_TK_QLTK = new JButton("Tìm kiếm");
		btn_TK_QLTK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_TK_QLTK.setBounds(593, 72, 123, 37);
		panel7.add(btn_TK_QLTK);
		
		JLabel lblMTS2 = new JLabel("Mã thí sinh");
		lblMTS2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMTS2.setBounds(1018, 140, 99, 27);
		panel7.add(lblMTS2);
		
		txt_Ma_QLTK = new JTextField();
		txt_Ma_QLTK.setBounds(1144, 140, 154, 27);
		panel7.add(txt_Ma_QLTK);
		txt_Ma_QLTK.setColumns(10);
		
		JLabel lblHVT = new JLabel("Họ và tên");
		lblHVT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHVT.setBounds(1018, 208, 99, 27);
		panel7.add(lblHVT);
		
		txt_Ten_QLTK = new JTextField();
		txt_Ten_QLTK.setColumns(10);
		txt_Ten_QLTK.setBounds(1144, 208, 237, 27);
		panel7.add(txt_Ten_QLTK);
		
		JLabel lblTDN = new JLabel("Tên đăng nhập");
		lblTDN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTDN.setBounds(1018, 271, 99, 27);
		panel7.add(lblTDN);
		
		txt_User_QLTK = new JTextField();
		txt_User_QLTK.setColumns(10);
		txt_User_QLTK.setBounds(1144, 271, 191, 27);
		panel7.add(txt_User_QLTK);
		
		JLabel lblMK = new JLabel("Mật khẩu");
		lblMK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMK.setBounds(1018, 337, 99, 27);
		panel7.add(lblMK);
		
		txt_Pass_QLTK = new JTextField();
		txt_Pass_QLTK.setColumns(10);
		txt_Pass_QLTK.setBounds(1144, 337, 191, 27);
		panel7.add(txt_Pass_QLTK);
		
		JButton btn_Reset_QLTK = new JButton("Reset mật khẩu");
		btn_Reset_QLTK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_Reset_QLTK.setBounds(1048, 486, 154, 37);
		panel7.add(btn_Reset_QLTK);
		
		JButton btn_HT_QLTK = new JButton("Hủy tìm");
		btn_HT_QLTK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_HT_QLTK.setBounds(729, 72, 123, 37);
		panel7.add(btn_HT_QLTK);
		
		JLabel lblNewLabel_1_5 = new JLabel("Tìm kiếm thông tin(theo họ tên)");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_5.setBounds(93, 77, 219, 27);
		panel7.add(lblNewLabel_1_5);
		
		txt_TK_QLTK = new JTextField();
		txt_TK_QLTK.setBounds(304, 78, 239, 27);
		panel7.add(txt_TK_QLTK);
		txt_TK_QLTK.setColumns(10);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Gmail");
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_4_1.setBounds(1018, 407, 99, 27);
		panel7.add(lblNewLabel_1_4_1);
		
		txt_Gmail_QLTK = new JTextField();
		txt_Gmail_QLTK.setColumns(10);
		txt_Gmail_QLTK.setBounds(1144, 407, 225, 27);
		panel7.add(txt_Gmail_QLTK);
		
		JButton btn_XTK_QLTK = new JButton("Xóa tài khoản");
		btn_XTK_QLTK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_XTK_QLTK.setBounds(1218, 486, 154, 37);
		panel7.add(btn_XTK_QLTK);
		
		//Menu sự kiện và thông tin
		JButton btn_SKTT = new JButton("Sự kiện & Thông tin");
		btn_SKTT.setBackground(SystemColor.activeCaption);
		Image img = new ImageIcon(this.getClass().getResource("/image/event.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btn_SKTT.setIcon(new ImageIcon(img));
		btn_SKTT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(panel8);
				contentPane.remove(panel7);
				contentPane.remove(panel6);
				contentPane.remove(panel5);
				contentPane.remove(panel4);
				contentPane.remove(panel3);
				contentPane.remove(panel2);
				contentPane.add(panel);
				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		btn_SKTT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_SKTT.setBounds(0, 0, 162, 36);
		contentPane.add(btn_SKTT);
		
		//Menu công nghệ thông tin
		JButton btn_CNTT = new JButton("Công nghệ thông tin");
		btn_CNTT.setBackground(SystemColor.activeCaption);
		Image img2 = new ImageIcon(this.getClass().getResource("/image/it.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btn_CNTT.setIcon(new ImageIcon(img2));
		btn_CNTT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(panel8);
				contentPane.remove(panel7);
				contentPane.remove(panel6);
				contentPane.remove(panel5);
				contentPane.remove(panel4);
				contentPane.remove(panel3);
				contentPane.remove(panel);
				contentPane.add(panel2);
				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		btn_CNTT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_CNTT.setBounds(160, 0, 179, 36);
		contentPane.add(btn_CNTT);	
		
		//Menu giáo dục và đào tạo
		JButton btn_GDDT = new JButton("Giáo dục & đào tạo");
		btn_GDDT.setBackground(SystemColor.activeCaption);
		Image img3 = new ImageIcon(this.getClass().getResource("/image/edu.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btn_GDDT.setIcon(new ImageIcon(img3));
		btn_GDDT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(panel8);
				contentPane.remove(panel7);
				contentPane.remove(panel6);
				contentPane.remove(panel5);
				contentPane.remove(panel4);
				contentPane.remove(panel2);
				contentPane.remove(panel);
				contentPane.add(panel3);
				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		btn_GDDT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_GDDT.setBounds(333, 0, 162, 36);
		contentPane.add(btn_GDDT);
		
		//Menu kỹ thuật
		JButton btn_KT = new JButton("Kỹ thuật");
		btn_KT.setBackground(SystemColor.activeCaption);
		Image img4 = new ImageIcon(this.getClass().getResource("/image/car.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btn_KT.setIcon(new ImageIcon(img4));
		btn_KT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(panel8);
				contentPane.remove(panel7);
				contentPane.remove(panel6);
				contentPane.remove(panel5);
				contentPane.remove(panel2);
				contentPane.remove(panel3);
				contentPane.remove(panel);
				contentPane.add(panel4);
				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		btn_KT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_KT.setBounds(493, 0, 149, 36);
		contentPane.add(btn_KT);
		
		//Menu kinh doanh quản lí
		JButton btn_KDQL = new JButton("Kinh doanh & Quản lí");
		btn_KDQL.setBackground(SystemColor.activeCaption);
		Image img5 = new ImageIcon(this.getClass().getResource("/image/busin.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btn_KDQL.setIcon(new ImageIcon(img5));
		btn_KDQL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(panel8);
				contentPane.remove(panel7);
				contentPane.remove(panel6);
				contentPane.remove(panel2);
				contentPane.remove(panel4);
				contentPane.remove(panel3);
				contentPane.remove(panel);
				contentPane.add(panel5);
				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		btn_KDQL.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_KDQL.setBounds(638, 0, 179, 36);
		contentPane.add(btn_KDQL);
		
		//Menu quản lí điểm thi
		JButton btnQLDT = new JButton("Quản lí điểm thi");
		btnQLDT.setBackground(SystemColor.activeCaption);
		Image img6 = new ImageIcon(this.getClass().getResource("/image/score.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btnQLDT.setIcon(new ImageIcon(img6));
		btnQLDT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(panel8);
				contentPane.remove(panel7);
				contentPane.remove(panel2);
				contentPane.remove(panel5);
				contentPane.remove(panel4);
				contentPane.remove(panel3);
				contentPane.remove(panel);
				contentPane.add(panel6);
				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		btnQLDT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnQLDT.setBounds(813, 0, 162, 36);
		contentPane.add(btnQLDT);
		
		//Menu quản lí tài khoản
		JButton btn_QLTK = new JButton("Quản lí tài khoản");
		btn_QLTK.setBackground(SystemColor.activeCaption);
		Image img7 = new ImageIcon(this.getClass().getResource("/image/account.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btn_QLTK.setIcon(new ImageIcon(img7));
		btn_QLTK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(panel8);
				contentPane.remove(panel2);
				contentPane.remove(panel6);
				contentPane.remove(panel5);
				contentPane.remove(panel4);
				contentPane.remove(panel3);
				contentPane.remove(panel);
				contentPane.add(panel7);
				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		btn_QLTK.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_QLTK.setBounds(973, 0, 162, 36);
		contentPane.add(btn_QLTK);
		
		//Menu thống kê
		JButton btn_TK = new JButton("Thống kê");
		btn_TK.setBackground(SystemColor.activeCaption);
		Image img8 = new ImageIcon(this.getClass().getResource("/image/list.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btn_TK.setIcon(new ImageIcon(img8));
		btn_TK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(panel2);
				contentPane.remove(panel7);
				contentPane.remove(panel6);
				contentPane.remove(panel5);
				contentPane.remove(panel4);
				contentPane.remove(panel3);
				contentPane.remove(panel);
				contentPane.add(panel8);
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
				Object[] options = {"Đăng xuất", "Hủy bỏ"};
                int result = JOptionPane.showOptionDialog(fr,
                        "Bạn có muốn đăng xuất không?",
                        "EXIT",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[0]);
                if(result == JOptionPane.YES_OPTION){
                	label_QLTK.setText("Bạn chọn: Yes");
					dispose();
					DangNhap cp = new DangNhap();
					cp.setLocationRelativeTo(null);
					cp.setVisible(true);
                }else if (result == JOptionPane.NO_OPTION){
                	label_QLTK.setText("Bạn chọn : No");
                } else {
                	label_QLTK.setText("Chưa ");
                }
			}
		});
		btn_DX.setBackground(SystemColor.activeCaption);
		Image img9 = new ImageIcon(this.getClass().getResource("/image/logout.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btn_DX.setIcon(new ImageIcon(img9));
		btn_DX.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_DX.setBounds(1291, 0, 149, 36);
		contentPane.add(btn_DX);
		
		// hiển thị danh sách tài khoản trên bảng
		showData_QLTK(connect_taiKhoan.findAll());
		
		//hiển thị danh sách khối A01 trên bảng
		showData_QLDT(connect_khoiA01.findAll());
		
		//hiển thị danh sách ngành công nghệ thông tin lên bảng
		showData_CNTT(connect_CNTT.findAll());
		
		//hiển thị danh sách thống kê
		showData_ThongKe(connect_thongKe.findAll());
	}
	
	//hàm gọi danh sách tài khoản
	public void showData_QLTK(List<taiKhoan> thisinhl) {
		List<taiKhoan> dsts = new ArrayList<>();
		dsts = thisinhl;
		DefaultTableModel tableModelTK;
		table_QLTK.getModel();
		tableModelTK = (DefaultTableModel) table_QLTK.getModel();
		tableModelTK.setRowCount(0);
		dsts.forEach((thisinh) -> {
			tableModelTK.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), thisinh.getTenDangNhap(), thisinh.getMatKhau(), thisinh.getGmail()});
		});
	}
	
	//hàm gọi danh sách khối A00
	public void showData_QLDT(List<khoiA01> thisinhl) {
		List<khoiA01> dsts = new ArrayList<>();
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
			tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), thisinh.getNamSinh(), gioitinh,
					thisinh.getToan(), thisinh.getLi(), thisinh.getHoa(), thisinh.getUuTien() ,thisinh.getTongdiem(), thisinh.getDiemHocBa()});
		});
	}
	
	//hàm gọi danh sách ngành công nghệ thông tin
		public void showData_CNTT(List<CNTT> thisinhl) {
			List<CNTT> dsts = new ArrayList<>();
			dsts = thisinhl;
			DefaultTableModel tableModel;
			table_CNTT.getModel();
			tableModel = (DefaultTableModel) table_CNTT.getModel();
			tableModel.setRowCount(0);
			dsts.forEach((thisinh) -> {
				tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), thisinh.getGioiTinh(), thisinh.getNamSinh(),
						thisinh.getTongDiem(), thisinh.getDiemHocBa()});
			});
		}
		//hàm gọi danh sách thống kê
		public void showData_ThongKe(List<thongKe> thisinhl) {
			List<thongKe> dsts = new ArrayList<>();
			dsts = thisinhl;
			DefaultTableModel tableModel;
			table_TK.getModel();
			tableModel = (DefaultTableModel) table_TK.getModel();
			tableModel.setRowCount(0);
			dsts.forEach((thisinh) -> {
				tableModel.addRow(new Object[] { thisinh.getMaThiSinh(), thisinh.getHoVaTen(), thisinh.getAnh(), thisinh.getNganhThi(),
						thisinh.getKhoiThi(), thisinh.getTongDiem(), thisinh.getThuTuNV()});
			});
		}
}

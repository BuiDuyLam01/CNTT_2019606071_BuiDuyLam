package view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.connect_taiKhoan;
import controller.connect_thiSinh;
import model.taiKhoan;

import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class HomeUser extends JFrame {

	private JPanel contentPane;
	private JPanel panel1;
	private JPanel panel1_1;
	private JPanel panel1_2;
	private JPanel panel1_3;
	private JTextField textField;
	private JTextField txt_KhoiCNTT;
	private JTextField txt_KhoiGDNL;
	private JTextField txt_KhoiKHMT;
	private JTextField txt_KhoiHTTT;
	private JTextField txt_KhoiKTPM;
	private JTextField txt_KhoiHSP;
	private JTextField txt_KhoiGDTE;
	private JTextField txt_KhoiKTCK;
	private JTextField txt_KhoiKTOT;
	private JTextField txt_KhoiKHHH;
	private JTextField txt_KhoiCDT;
	private JTextField txt_KhoiTMDT;
	private JTextField txt_KhoiKT;
	private JTextField txt_KhoiQLCL;
	private JTextField txt_HVT;
	private JTextField txt_Nam;
	private JTextField txt_Cu;
	private JTextField txt_Moi;
	private JTextField txt_Lai;
	private JTextField txt_KhoiQLGD;
	private JTextField txt_KhoiMKT;
	
	private int labelQLGD = 0;
	private int labelCNTT = 0;
	private int labelKHMT = 0;
	private int labelHTTT = 0;
	private int labelKTPM = 0;
	private int labelHSP = 0;
	private int labelGDTE = 0;
	private int labelGDNL = 0;
	private int labelKTCK = 0;
	private int labelKTOT = 0;
	private int labelKHHH = 0;
	private int labelCDT = 0;
	private int labelTMDT = 0;
	private int labelKT = 0;
	private int labelQLCL = 0;
	private int labelMKT = 0;
	private JLabel lblCNTT;
	private JLabel lblMKT;
	private JLabel lblKTOT;
	private JLabel lblCDT;
	private JLabel lblKT;
	private JLabel lblQLGD;
	
	private JLabel[] labels;
	private JLabel QLGD;
	private JLabel MKT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeUser frame = new HomeUser();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public HomeUser() {
		
	}

	/**
	 * Create the frame.
	 */
	public HomeUser(String username) {
		setTitle("TRANG CÁ NHÂN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1448, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1448, 23);
		contentPane.add(menuBar);
		
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
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(0, 21, 1440, 709);
		contentPane.add(panel1);
		
		JButton btn_SKTT = new JButton("Sự kiện & Thông tin");
		btn_SKTT.setForeground(new Color(255, 255, 255));
		btn_SKTT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.remove(panel1_3);
				panel1.remove(panel1_2);
				panel1.add(panel1_1);
				panel1.revalidate();
				panel1.repaint();
			}
		});
		Image img = new ImageIcon(this.getClass().getResource("/image/event.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btn_SKTT.setIcon(new ImageIcon(img));
		btn_SKTT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_SKTT.setBackground(new Color(255, 102, 0));
		btn_SKTT.setBounds(-1, 0, 162, 36);
		panel1.add(btn_SKTT);
		
		JButton btn_DKXT = new JButton("Đăng kí xét tuyển");
		btn_DKXT.setForeground(new Color(255, 255, 255));
		btn_DKXT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(connect_thiSinh.kiemTraDangKy(username) == true) {
					JOptionPane.showMessageDialog(null, "Bạn đã đăng ký xét tuyển!");
				} else {
					panel1.remove(panel1_3);
					panel1.remove(panel1_1);
					panel1.add(panel1_2);
					panel1.revalidate();
					panel1.repaint();
				}
			}
		});
		Image img2 = new ImageIcon(this.getClass().getResource("/image/regis.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btn_DKXT.setIcon(new ImageIcon(img2));
		btn_DKXT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_DKXT.setBackground(new Color(255, 102, 0));
		btn_DKXT.setBounds(159, 0, 162, 36);
		panel1.add(btn_DKXT);
		
		JButton btn_TTCN = new JButton("Thông tin cá nhân");
		btn_TTCN.setForeground(new Color(255, 255, 255));
		btn_TTCN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.remove(panel1_1);
				panel1.remove(panel1_2);
				panel1.add(panel1_3);
				panel1.revalidate();
				panel1.repaint();
			}
		});
		Image img3 = new ImageIcon(this.getClass().getResource("/image/person.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btn_TTCN.setIcon(new ImageIcon(img3));
		btn_TTCN.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_TTCN.setBackground(new Color(255, 102, 0));
		btn_TTCN.setBounds(319, 0, 162, 36);
		panel1.add(btn_TTCN);
		
		JLabel label_QLTK = new JLabel();
		JButton btn_DX = new JButton("Đăng xuất");
		btn_DX.setForeground(new Color(255, 255, 255));
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
		Image img4 = new ImageIcon(this.getClass().getResource("/image/logout.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btn_DX.setIcon(new ImageIcon(img4));
		btn_DX.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_DX.setBackground(new Color(255, 102, 0));
		btn_DX.setBounds(479, 0, 143, 36);
		panel1.add(btn_DX);
		
		panel1_1 = new JPanel();
		panel1_1.setLayout(null);
		panel1_1.setBackground(new Color(245, 255, 250));
		panel1_1.setBounds(0, 36, 1440, 673);
		panel1.add(panel1_1);
		
		JLabel lbThongBao_1 = new JLabel("THÔNG BÁO TỪ BAN TUYỂN SINH TRƯỜNG ĐẠI HỌC VIỆT Á");
		lbThongBao_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbThongBao_1.setBounds(345, 21, 734, 42);
		panel1_1.add(lbThongBao_1);
		
		JLabel Logo_1 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/image/logo.jpg")).getImage();
		Logo_1.setIcon(new ImageIcon(img1));
		Logo_1.setBounds(1170, 73, 242, 240);
		panel1_1.add(Logo_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(new Color(245, 255, 250));
		textArea_1.setText("Trường Đại học Việt Á trân trọng thông báo đến các thí sinh về kế hoạch tuyển sinh đại học cho năm 2023 như sau:\r\n\n"
				+ "1. Đối tượng tuyển sinh: Tất cả các thí sinh đã tốt nghiệp THPT hoặc có bằng tương đương.\r\n\n"
				+ "2. Phương thức xét tuyển:\r\n\n"
				+ "- Xét tuyển dựa trên tổng điểm thi các môn học THPT trong khối xét tuyển.\r\n\n"
				+ "- Thí sinh sẽ được cộng điểm ưu tiên tùy vào từng khu vực theo quy định của Bộ Giáo dục và Đào tạo.\r\n\n"
				+ "3. Hình thức đăng ký và nộp hồ sơ:\r\n\n"
				+ "- Đăng ký trực tuyến tại phần mềm tuyển sinh của trường.\r\n\n"
				+ "- Nộp hồ sơ tại phòng Tuyển sinh - Trường Đại học Việt Á, địa chỉ số 128, đường Hoàng Quốc Việt, quận Cầu Giấy, thành phố Hà Nội.\r\n\n"
				+ "4. Thời gian đăng ký và nộp hồ sơ:\r\n"
				+ "- Đăng ký trực tuyến: Từ ngày 1/6/2023 đến ngày 30/6/2023.\r\n\n"
				+ "- Nộp hồ sơ: Từ ngày 1/6/2023 đến ngày 30/6/2023.\r\n\n"
				+ "5. Liên hệ:\r\n"
				+ "- Phòng Tuyển sinh - Trường Đại học Việt Á.\r\n\n"
				+ "- Địa chỉ: Số 128, đường Hoàng Quốc Việt, quận Cầu Giấy, thành phố Hà Nội.\r\n\n"
				+ "- Điện thoại: (024) 1234 5678.\r\n\n"
				+ "Trường Đại học Việt Á kính chúc các thí sinh thành công trong kỳ thi tuyển sinh và chào đón các bạn đến với môi trường học tập chuyên nghiệp của trường chúng tôi.\r\n"
				+ "\r\n"
				+ "");
		textArea_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textArea_1.setBounds(52, 73, 1360, 558);
		panel1_1.add(textArea_1);
		
		JLabel lblNewLabel_2 = new JLabel("Địa chỉ: Số 128, đường Hoàng Quốc Việt, quân Cầu Giấy, Hà Nội          Holine: 1900 8569");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(881, 641, 531, 22);
		panel1_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Trường Đại Học Việt Á");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(52, 641, 531, 22);
		panel1_1.add(lblNewLabel_1_1);
		
		panel1_2 = new JPanel();
		panel1_2.setLayout(null);
		panel1_2.setBackground(new Color(245, 255, 250));
		panel1_2.setBounds(0, 36, 1440, 673);
		panel1.add(panel1_2);
		
		JLabel lblNewLabel = new JLabel("ĐĂNG KÝ XÉT TUYỂN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(624, 0, 213, 56);
		panel1_2.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 49, 1430, 2);
		panel1_2.add(scrollPane);
		
		textField = new JTextField();
		textField.setBounds(722, 113, 3, 496);
		panel1_2.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(1, 109, 1430, 2);
		panel1_2.add(scrollPane_1);
		
		JLabel lblNewLabel_1 = new JLabel("Thông tin mã khối để xét tuyển: Khối A00: A00; Khối A01: A01; Khối A02: A02; Khối A03: A03; Khối A04: A04; Khối A05: A05; Khối A06: A06; Khối A07: A07; Khối A08: A08. Ví dụ: Ngành xét tuyển: Công nghệ thông tin - Mã khối: A00.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(14, 56, 1347, 22);
		panel1_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Lưu ý: Số lần click 'Đăng ký' tương ứng với thứ tự nguyện vọng của bạn!");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_1.setBounds(16, 77, 974, 22);
		panel1_2.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel6_2 = new JLabel("Ngành đăng ký");
		lblNewLabel6_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel6_2.setBounds(85, 115, 125, 32);
		panel1_2.add(lblNewLabel6_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Khối đăng ký");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(271, 115, 125, 32);
		panel1_2.add(lblNewLabel_2_1);
		
		JLabel CNTT = new JLabel("CNTT");
		CNTT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		CNTT.setBounds(85, 203, 161, 32);
		panel1_2.add(CNTT);
		
		txt_KhoiCNTT = new JTextField();
		txt_KhoiCNTT.setBounds(290, 204, 59, 32);
		panel1_2.add(txt_KhoiCNTT);
		txt_KhoiCNTT.setColumns(10);
		
		JButton btnCNTT = new JButton("Đăng ký");
		btnCNTT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelCNTT++;
	            lblCNTT.setText("" + labelCNTT);
			}
		});
		btnCNTT.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCNTT.setBounds(582, 202, 86, 32);
		panel1_2.add(btnCNTT);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Nguyện vọng thứ");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(420, 115, 135, 32);
		panel1_2.add(lblNewLabel_2_1_1);
		
		lblCNTT = new JLabel("");
		lblCNTT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCNTT.setBounds(422, 203, 161, 32);
		panel1_2.add(lblCNTT);
		
		JLabel GDNL = new JLabel("GDNL");
		GDNL.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GDNL.setBounds(85, 565, 161, 32);
		panel1_2.add(GDNL);
		
		txt_KhoiGDNL = new JTextField();
		txt_KhoiGDNL.setColumns(10);
		txt_KhoiGDNL.setBounds(290, 566, 59, 32);
		panel1_2.add(txt_KhoiGDNL);
		
		JLabel lblGDNL = new JLabel("");
		lblGDNL.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGDNL.setBounds(422, 565, 161, 32);
		panel1_2.add(lblGDNL);
		
		JButton btnGDNL = new JButton("Đăng ký");
		btnGDNL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelGDNL++;
	            lblGDNL.setText("" + labelGDNL);
			}
		});
		btnGDNL.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGDNL.setBounds(582, 564, 86, 32);
		panel1_2.add(btnGDNL);
		
		JLabel KHMT = new JLabel("KHMT");
		KHMT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		KHMT.setBounds(85, 256, 161, 32);
		panel1_2.add(KHMT);
		
		txt_KhoiKHMT = new JTextField();
		txt_KhoiKHMT.setColumns(10);
		txt_KhoiKHMT.setBounds(290, 257, 59, 32);
		panel1_2.add(txt_KhoiKHMT);
		
		JLabel lblKHMT = new JLabel("");
		lblKHMT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKHMT.setBounds(422, 256, 161, 32);
		panel1_2.add(lblKHMT);
		
		JButton btnKHMT = new JButton("Đăng ký");
		btnKHMT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelKHMT++;
	            lblKHMT.setText("" + labelKHMT);
			}
		});
		btnKHMT.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnKHMT.setBounds(582, 255, 86, 32);
		panel1_2.add(btnKHMT);
		
		JLabel HTTT = new JLabel("HTTT");
		HTTT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		HTTT.setBounds(85, 497, 161, 32);
		panel1_2.add(HTTT);
		
		txt_KhoiHTTT = new JTextField();
		txt_KhoiHTTT.setColumns(10);
		txt_KhoiHTTT.setBounds(290, 498, 59, 32);
		panel1_2.add(txt_KhoiHTTT);
		
		JLabel lblHTTT = new JLabel("");
		lblHTTT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHTTT.setBounds(422, 497, 161, 32);
		panel1_2.add(lblHTTT);
		
		JButton btnHTTT = new JButton("Đăng ký");
		btnHTTT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelHTTT++;
	            lblHTTT.setText("" + labelHTTT);
			}
		});
		btnHTTT.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnHTTT.setBounds(582, 496, 86, 32);
		panel1_2.add(btnHTTT);
		
		JLabel KTPM = new JLabel("KTPM");
		KTPM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		KTPM.setBounds(85, 311, 161, 32);
		panel1_2.add(KTPM);
		
		txt_KhoiKTPM = new JTextField();
		txt_KhoiKTPM.setColumns(10);
		txt_KhoiKTPM.setBounds(290, 312, 59, 32);
		panel1_2.add(txt_KhoiKTPM);
		
		JLabel lblKTPM = new JLabel("");
		lblKTPM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKTPM.setBounds(422, 311, 161, 32);
		panel1_2.add(lblKTPM);
		
		JButton btnKTPM = new JButton("Đăng ký");
		btnKTPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelKTPM++;
	            lblKTPM.setText("" + labelKTPM);
			}
		});
		btnKTPM.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnKTPM.setBounds(582, 310, 86, 32);
		panel1_2.add(btnKTPM);
		
		JLabel HSP = new JLabel("HSP");
		HSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		HSP.setBounds(85, 431, 161, 32);
		panel1_2.add(HSP);
		
		txt_KhoiHSP = new JTextField();
		txt_KhoiHSP.setColumns(10);
		txt_KhoiHSP.setBounds(290, 432, 59, 32);
		panel1_2.add(txt_KhoiHSP);
		
		JLabel lblHSP = new JLabel("");
		lblHSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHSP.setBounds(422, 431, 161, 32);
		panel1_2.add(lblHSP);
		
		JButton btnHSP = new JButton("Đăng ký");
		btnHSP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelHSP++;
	            lblHSP.setText("" + labelHSP);
			}
		});
		btnHSP.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnHSP.setBounds(582, 430, 86, 32);
		panel1_2.add(btnHSP);
		
		JLabel GDTE = new JLabel("GDTE");
		GDTE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GDTE.setBounds(85, 369, 161, 32);
		panel1_2.add(GDTE);
		
		txt_KhoiGDTE = new JTextField();
		txt_KhoiGDTE.setColumns(10);
		txt_KhoiGDTE.setBounds(290, 370, 59, 32);
		panel1_2.add(txt_KhoiGDTE);
		
		JLabel lblGDTE = new JLabel("");
		lblGDTE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGDTE.setBounds(422, 369, 161, 32);
		panel1_2.add(lblGDTE);
		
		JButton btnGDTE = new JButton("Đăng ký");
		btnGDTE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelGDTE++;
	            lblGDTE.setText("" + labelGDTE);
			}
		});
		btnGDTE.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGDTE.setBounds(582, 368, 86, 32);
		panel1_2.add(btnGDTE);
		
		JLabel lblNewLabel_2_3 = new JLabel("Ngành đăng ký");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3.setBounds(801, 115, 125, 32);
		panel1_2.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Khối đăng ký");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_2.setBounds(987, 115, 125, 32);
		panel1_2.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Nguyện vọng thứ");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_1.setBounds(1136, 115, 135, 32);
		panel1_2.add(lblNewLabel_2_1_1_1);
		
		JLabel KTCK = new JLabel("KTCK");
		KTCK.setFont(new Font("Tahoma", Font.PLAIN, 15));
		KTCK.setBounds(801, 203, 161, 32);
		panel1_2.add(KTCK);
		
		txt_KhoiKTCK = new JTextField();
		txt_KhoiKTCK.setColumns(10);
		txt_KhoiKTCK.setBounds(1006, 204, 59, 32);
		panel1_2.add(txt_KhoiKTCK);
		
		JLabel lblKTCK = new JLabel("");
		lblKTCK.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKTCK.setBounds(1138, 203, 161, 32);
		panel1_2.add(lblKTCK);
		
		JButton btnKTCK = new JButton("Đăng ký");
		btnKTCK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelKTCK++;
	            lblKTCK.setText("" + labelKTCK);
			}
		});
		btnKTCK.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnKTCK.setBounds(1298, 202, 86, 32);
		panel1_2.add(btnKTCK);
		
		JButton btnKTOT = new JButton("Đăng ký");
		btnKTOT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelKTOT++;
	            lblKTOT.setText("" + labelKTOT);
			}
		});
		btnKTOT.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnKTOT.setBounds(1298, 255, 86, 32);
		panel1_2.add(btnKTOT);
		
		lblKTOT = new JLabel("");
		lblKTOT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKTOT.setBounds(1138, 256, 161, 32);
		panel1_2.add(lblKTOT);
		
		txt_KhoiKTOT = new JTextField();
		txt_KhoiKTOT.setColumns(10);
		txt_KhoiKTOT.setBounds(1006, 257, 59, 32);
		panel1_2.add(txt_KhoiKTOT);
		
		JLabel KTOT = new JLabel("KTOT");
		KTOT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		KTOT.setBounds(801, 256, 161, 32);
		panel1_2.add(KTOT);
		
		JLabel KHHH = new JLabel("KHHH");
		KHHH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		KHHH.setBounds(801, 311, 161, 32);
		panel1_2.add(KHHH);
		
		txt_KhoiKHHH = new JTextField();
		txt_KhoiKHHH.setColumns(10);
		txt_KhoiKHHH.setBounds(1006, 312, 59, 32);
		panel1_2.add(txt_KhoiKHHH);
		
		JLabel lblKHHH = new JLabel("");
		lblKHHH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKHHH.setBounds(1138, 311, 161, 32);
		panel1_2.add(lblKHHH);
		
		JButton btnKHHH = new JButton("Đăng ký");
		btnKHHH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelKHHH++;
	            lblKHHH.setText("" + labelKHHH);
			}
		});
		btnKHHH.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnKHHH.setBounds(1298, 310, 86, 32);
		panel1_2.add(btnKHHH);
		
		JButton btnCDT = new JButton("Đăng ký");
		btnCDT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelCDT++;
	            lblCDT.setText("" + labelCDT);
			}
		});
		btnCDT.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCDT.setBounds(1298, 368, 86, 32);
		panel1_2.add(btnCDT);
		
		lblCDT = new JLabel("");
		lblCDT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCDT.setBounds(1138, 369, 161, 32);
		panel1_2.add(lblCDT);
		
		txt_KhoiCDT = new JTextField();
		txt_KhoiCDT.setColumns(10);
		txt_KhoiCDT.setBounds(1006, 370, 59, 32);
		panel1_2.add(txt_KhoiCDT);
		
		JLabel CDT = new JLabel("CDT");
		CDT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		CDT.setBounds(801, 369, 161, 32);
		panel1_2.add(CDT);
		
		JLabel TMDT = new JLabel("TMDT");
		TMDT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TMDT.setBounds(801, 431, 161, 32);
		panel1_2.add(TMDT);
		
		txt_KhoiTMDT = new JTextField();
		txt_KhoiTMDT.setColumns(10);
		txt_KhoiTMDT.setBounds(1006, 432, 59, 32);
		panel1_2.add(txt_KhoiTMDT);
		
		JLabel lblTMDT = new JLabel("");
		lblTMDT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTMDT.setBounds(1138, 431, 161, 32);
		panel1_2.add(lblTMDT);
		
		JButton btnTMDT = new JButton("Đăng ký");
		btnTMDT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelTMDT++;
	            lblTMDT.setText("" + labelTMDT);
			}
		});
		btnTMDT.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTMDT.setBounds(1298, 430, 86, 32);
		panel1_2.add(btnTMDT);
		
		JButton btnKT = new JButton("Đăng ký");
		btnKT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelKT++;
	            lblKT.setText("" + labelKT);
			}
		});
		btnKT.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnKT.setBounds(1298, 496, 86, 32);
		panel1_2.add(btnKT);
		
		lblKT = new JLabel("");
		lblKT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKT.setBounds(1138, 497, 161, 32);
		panel1_2.add(lblKT);
		
		txt_KhoiKT = new JTextField();
		txt_KhoiKT.setColumns(10);
		txt_KhoiKT.setBounds(1006, 498, 59, 32);
		panel1_2.add(txt_KhoiKT);
		
		JLabel KT = new JLabel("KT");
		KT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		KT.setBounds(801, 497, 161, 32);
		panel1_2.add(KT);
		
		JLabel QLCL = new JLabel("QLCL");
		QLCL.setFont(new Font("Tahoma", Font.PLAIN, 15));
		QLCL.setBounds(801, 565, 161, 32);
		panel1_2.add(QLCL);
		
		txt_KhoiQLCL = new JTextField();
		txt_KhoiQLCL.setColumns(10);
		txt_KhoiQLCL.setBounds(1006, 566, 59, 32);
		panel1_2.add(txt_KhoiQLCL);
		
		JLabel lblQLCL = new JLabel("");
		lblQLCL.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQLCL.setBounds(1138, 565, 161, 32);
		panel1_2.add(lblQLCL);
		
		JButton btnQLCL = new JButton("Đăng ký");
		btnQLCL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelQLCL++;
	            lblQLCL.setText("" + labelQLCL);
			}
		});
		btnQLCL.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnQLCL.setBounds(1298, 564, 86, 32);
		panel1_2.add(btnQLCL);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 610, 1430, 2);
		panel1_2.add(scrollPane_2);
		
		JButton btn_XacNhan = new JButton("Xác nhận đăng ký");
//		btn_XacNhan.addActionListener(new ActionListener() {
//			private JTextField txts;
//
//			public void actionPerformed(ActionEvent e) {
//				//kiểm tra nguyện vọng bị trùng hay không
//				labels = new JLabel[16];
//		        labels[0] = lblCNTT;
//		        labels[1] = lblKHMT;
//		        labels[2] = lblHTTT;
//		        labels[3] = lblKTPM;
//		        labels[4] = lblHSP;
//		        labels[5] = lblGDTE;
//		        labels[6] = lblGDNL;
//		        labels[7] = lblQLGD;
//		        labels[8] = lblKTOT;
//		        labels[9] = lblKTCK;
//		        labels[10] = lblKHHH;
//		        labels[11] = lblCDT;
//		        labels[12] = lblTMDT;
//		        labels[13] = lblKT;
//		        labels[14] = lblQLCL;
//		        labels[15] = lblMKT;
//		        
//		        JTextField[] txts = {txt_KhoiCDT, txt_KhoiCNTT, txt_KhoiGDNL, txt_KhoiGDTE, txt_KhoiHSP, txt_KhoiHSP, txt_KhoiHTTT,
//		        		txt_KhoiKHHH, txt_KhoiKHMT, txt_KhoiKT, txt_KhoiKTCK, txt_KhoiKTOT, txt_KhoiKTPM, txt_KhoiMKT, txt_KhoiQLCL, txt_KhoiQLGD, txt_KhoiTMDT};
//		        
//		        boolean hasDuplicate = false;
//		        for (int i = 0; i < labels.length; i++) {
//		            String text = labels[i].getText().trim();
//		            if (!text.isEmpty()) {
//		                for (int j = i + 1; j < labels.length; j++) {
//		                    String otherText = labels[j].getText().trim();
//		                    if (text.equals(otherText)) {
//		                        hasDuplicate = true;
//		                        break;
//		                    }
//		                }
//		            }
//		            if (hasDuplicate) {
//		                break;
//		            }
//		        }
//				if (hasDuplicate) {
//		            JOptionPane.showMessageDialog(null, "Có giá trị bị trùng lặp.");
//		        } else {
//		        	String url = "jdbc:mysql://localhost:3306/quanlithisinh";
//		            String user = "root";
//		            String password = "";
//		            String sql = "INSERT INTO khoithi (MaNganh, MaKhoi, MaThiSinh, ThuTuNV, TongDiem, Ma) VALUES (?, ?, ?, ?, ?, ?)";
//
//		            try (Connection connection = DriverManager.getConnection(url, user, password);
//		                 PreparedStatement statement = connection.prepareStatement(sql)) {
//		            	
//		            	for (int i = 0; i < labels.length; i++) {
//		                    int labelValue = Integer.parseInt(labels[i].getText());
//		                    String textValue = txts[i].getText();
//		                    
//		                    statement.setString(1, "CNTT");
//		                    statement.setString(2, textValue);
//			                statement.setString(3, username);
//			                statement.setInt(4, labelValue);
//			                statement.setInt(5, 0);
//			                statement.setInt(6, 1);
//		                    
//		                    int rowsInserted = statement.executeUpdate();
//		                    if (rowsInserted > 0) {
//		                        System.out.println("Data inserted successfully");
//		                    }
//		                }
//
////		                // Lấy giá trị từ các JLabel và JTextField
////		                int thutunv = labelQLGD;
////		                String nganh = QLGD.getText();
////		                String khoi = txt_KhoiQLGD.getText();
////
////		                // Thiết lập các giá trị tham số
////		                statement.setString(1, nganh);
////		                statement.setString(2, khoi);
////		                statement.setString(3, username);
////		                statement.setInt(4, thutunv);
////		                statement.setInt(5, 0);
////		                statement.setInt(6, 1);
////
////		                // Thực hiện câu lệnh SQL và lưu dữ liệu vào cơ sở dữ liệu
////		                int rowsInserted = statement.executeUpdate();
////		                if (rowsInserted > 0) {
////		                	JOptionPane.showMessageDialog(null, "Đăng kí thành công!");
////		                } else {
////		                	JOptionPane.showMessageDialog(null, "Đăng kí thất bại!");
////		                }
//		            	
////		            	for (int i = 0; i < txts.length; i++) {
////		                    String nganh = txts.getText();
////		                    String khoi = txts.g
////		                    int thutunv = labels.
////
////		                    // Thiết lập các giá trị tham số
////		                    statement.setString(1, nganh);
////		                    statement.setString(2, khoi);
////		                    statement.setString(3, username);
////		                    statement.setInt(4, thutunv);
////		                    statement.setInt(5, 0);
////		                    statement.setInt(6, 1);
////
////		                    // Thực hiện câu lệnh SQL và lưu dữ liệu vào cơ sở dữ liệu
////		                    int rowsInserted = statement.executeUpdate();
////		                    if (rowsInserted > 0) {
////		                        JOptionPane.showMessageDialog(null, "Đăng kí thành công!");
////		                    } else {
////		                        JOptionPane.showMessageDialog(null, "Đăng kí thất bại!");
////		                    }
////		                }
//
//		            } catch (Exception e2) {
//						e2.printStackTrace();
//					}
//		        }
//			}
//		});

		btn_XacNhan.addActionListener(new ActionListener() {
		    private JTextField txts[];

		    public void actionPerformed(ActionEvent e) {
		        // Kiểm tra nguyện vọng bị trùng hay không
		        JLabel[] labels = {lblCNTT, lblKHMT, lblHTTT, lblKTPM, lblHSP, lblGDTE, lblGDNL, lblQLGD, lblKTOT, lblKTCK, lblKHHH, lblCDT, lblTMDT, lblKT, lblQLCL, lblMKT};
		        JTextField[] txts = {txt_KhoiCNTT, txt_KhoiKHMT, txt_KhoiHTTT, txt_KhoiKTPM, txt_KhoiHSP, txt_KhoiGDTE, txt_KhoiGDNL, txt_KhoiQLGD, txt_KhoiKTOT, txt_KhoiKTCK, txt_KhoiKHHH, txt_KhoiCDT, txt_KhoiTMDT, txt_KhoiKT, txt_KhoiQLCL, txt_KhoiMKT};
		        JLabel[] nganh = {CNTT, KHMT, HTTT, KTPM, HSP, GDTE, GDNL, QLGD, KTOT, KTCK, KHHH, CDT, TMDT, KT, QLCL, MKT};

		        boolean hasDuplicate = false;
		        for (int i = 0; i < labels.length; i++) {
		            String text = labels[i].getText().trim();
		            if (!text.isEmpty()) {
		                for (int j = i + 1; j < labels.length; j++) {
		                    String otherText = labels[j].getText().trim();
		                    if (text.equals(otherText)) {
		                        hasDuplicate = true;
		                        break;
		                    }
		                }
		            }
		            if (hasDuplicate) {
		                break;
		            }
		        }

		        if (hasDuplicate) {
		            JOptionPane.showMessageDialog(null, "Có giá trị bị trùng lặp.");
		        } else {
		            String url = "jdbc:mysql://localhost:3306/quanlithisinh";
		            String user = "root";
		            String password = "";
		            String sql = "INSERT INTO khoithi (MaNganh, MaKhoi, MaThiSinh, ThuTuNV, TongDiem) VALUES (?, ?, ?, ?, ?)";

		            try (Connection connection = DriverManager.getConnection(url, user, password);
		                PreparedStatement statement = connection.prepareStatement(sql)) {

		                for (int i = 0; i < labels.length; i++) {
		                    String text = labels[i].getText().trim();
		                    if (!text.isEmpty()) {
		                        int labelValue = Integer.parseInt(text);
		                        String textValue = txts[i].getText().trim();
		                        String ng = nganh[i].getText().trim();

		                        statement.setString(1, ng);
		                        statement.setString(2, textValue);
		                        statement.setString(3, username);
		                        statement.setInt(4, labelValue);
		                        statement.setInt(5, 0);

		                        int rowsInserted = statement.executeUpdate();
		                        if (rowsInserted > 0) {
		                        	JOptionPane.showMessageDialog(null, "Đăng kí thành công!");
		                        }
		                    }
		                }
		            } catch (Exception ex) {
		                ex.printStackTrace();
		            }
		        }
		    }
		});


		
		btn_XacNhan.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_XacNhan.setBounds(501, 625, 145, 32);
		panel1_2.add(btn_XacNhan);
		
		JButton btn_LamMoi = new JButton("Làm mới");
		btn_LamMoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblKHMT.setText(""); labelKHMT = 0;
				lblCDT.setText(""); labelCDT = 0;
				lblCNTT.setText(""); labelCNTT = 0;
				lblHTTT.setText(""); labelHTTT = 0;
				lblKTPM.setText(""); labelKTPM = 0;
				lblHSP.setText(""); labelHSP = 0;
				lblGDTE.setText(""); labelGDTE = 0;
				lblGDNL.setText(""); labelGDNL = 0;
				lblQLGD.setText(""); labelQLGD = 0;
				lblKTCK.setText(""); labelKTCK = 0;
				lblKTOT.setText(""); labelKTOT = 0;
				lblKHHH.setText(""); labelKHHH = 0;
				lblTMDT.setText(""); labelTMDT = 0;
				lblKT.setText(""); labelKT = 0;
				lblQLCL.setText(""); labelQLCL = 0;
				lblMKT.setText(""); labelMKT = 0;
				txt_KhoiCDT.setText(""); txt_KhoiCNTT.setText(""); txt_KhoiGDNL.setText(""); txt_KhoiGDTE.setText("");
				txt_KhoiHSP.setText(""); txt_KhoiHTTT.setText(""); txt_KhoiKHHH.setText(""); txt_KhoiKHMT.setText("");
				txt_KhoiKT.setText(""); txt_KhoiKTCK.setText(""); txt_KhoiKTOT.setText(""); txt_KhoiKTPM.setText("");
				txt_KhoiMKT.setText(""); txt_KhoiQLCL.setText(""); txt_KhoiQLGD.setText(""); txt_KhoiTMDT.setText("");
			}
		});
		btn_LamMoi.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_LamMoi.setBounds(663, 625, 135, 32);
		panel1_2.add(btn_LamMoi);
		
		JButton btn_Thoat = new JButton("Thoát");
		btn_Thoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.remove(panel1_3);
				panel1.remove(panel1_2);
				panel1.add(panel1_1);
				panel1.revalidate();
				panel1.repaint();
			}
		});
		btn_Thoat.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_Thoat.setBounds(817, 625, 135, 32);
		panel1_2.add(btn_Thoat);
		
		QLGD = new JLabel("QLGD");
		QLGD.setFont(new Font("Tahoma", Font.PLAIN, 15));
		QLGD.setBounds(85, 150, 161, 32);
		panel1_2.add(QLGD);
		
		txt_KhoiQLGD = new JTextField();
		txt_KhoiQLGD.setColumns(10);
		txt_KhoiQLGD.setBounds(290, 151, 59, 32);
		panel1_2.add(txt_KhoiQLGD);
		
		lblQLGD = new JLabel("");
		lblQLGD.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQLGD.setBounds(422, 150, 161, 32);
		panel1_2.add(lblQLGD);
		
		JButton btnQLGD = new JButton("Đăng ký");
		btnQLGD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelQLGD++;
	            lblQLGD.setText("" + labelQLGD);
			}
		});
		btnQLGD.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnQLGD.setBounds(582, 149, 86, 32);
		panel1_2.add(btnQLGD);
		
		MKT = new JLabel("MKT");
		MKT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		MKT.setBounds(801, 151, 161, 32);
		panel1_2.add(MKT);
		
		txt_KhoiMKT = new JTextField();
		txt_KhoiMKT.setColumns(10);
		txt_KhoiMKT.setBounds(1006, 152, 59, 32);
		panel1_2.add(txt_KhoiMKT);
		
		lblMKT = new JLabel("");
		lblMKT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMKT.setBounds(1138, 151, 161, 32);
		panel1_2.add(lblMKT);
		
		JButton btnMKT = new JButton("Đăng ký");
		btnMKT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelMKT++;
	            lblMKT.setText("" + labelMKT);
			}
		});
		btnMKT.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMKT.setBounds(1298, 150, 86, 32);
		panel1_2.add(btnMKT);
		
		panel1_3 = new JPanel();
		panel1_3.setLayout(null);
		panel1_3.setBackground(new Color(245, 255, 250));
		panel1_3.setBounds(0, 36, 1440, 673);
		panel1.add(panel1_3);
		
		JLabel lblHVT = new JLabel("Họ và tên");
		lblHVT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHVT.setBounds(57, 74, 90, 29);
		panel1_3.add(lblHVT);
		
		JLabel lblNS = new JLabel("Gmail");
		lblNS.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNS.setBounds(57, 123, 90, 29);
		panel1_3.add(lblNS);
		
		JLabel lblTTCN = new JLabel("Thông tin cá nhân");
		lblTTCN.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTTCN.setBounds(593, 12, 239, 29);
		panel1_3.add(lblTTCN);
		
		JScrollPane scrollPane3 = new JScrollPane();
		scrollPane3.setBounds(0, 49, 1430, 2);
		panel1_3.add(scrollPane3);
		
		txt_HVT = new JTextField();
		txt_HVT.setBounds(224, 76, 1175, 29);
		panel1_3.add(txt_HVT);
		txt_HVT.setColumns(10);
		
		txt_Nam = new JTextField();
		txt_Nam.setColumns(10);
		txt_Nam.setBounds(224, 125, 1175, 29);
		panel1_3.add(txt_Nam);
		
		JScrollPane scrollPane4 = new JScrollPane();
		scrollPane4.setBounds(0, 256, 1430, 2);
		panel1_3.add(scrollPane4);
		
		JLabel lblMK = new JLabel("Đổi mật khẩu");
		lblMK.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblMK.setBounds(29, 271, 176, 29);
		panel1_3.add(lblMK);
		
		JLabel lblNewLabel_3 = new JLabel("Mật khẩu cũ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(57, 338, 90, 29);
		panel1_3.add(lblNewLabel_3);
		
		txt_Cu = new JTextField();
		txt_Cu.setColumns(10);
		txt_Cu.setBounds(224, 340, 1175, 29);
		panel1_3.add(txt_Cu);
		
		JLabel lblMKM = new JLabel("Mật khẩu mới");
		lblMKM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMKM.setBounds(57, 403, 90, 29);
		panel1_3.add(lblMKM);
		
		txt_Moi = new JTextField();
		txt_Moi.setColumns(10);
		txt_Moi.setBounds(224, 405, 1175, 29);
		panel1_3.add(txt_Moi);
		
		txt_Lai = new JTextField();
		txt_Lai.setColumns(10);
		txt_Lai.setBounds(224, 474, 1175, 29);
		panel1_3.add(txt_Lai);
		
		JLabel lblNewLabel_3_1 = new JLabel("Nhập lại mật khẩu mới");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(57, 475, 164, 29);
		panel1_3.add(lblNewLabel_3_1);
		
		JButton btn_CN = new JButton("Cập nhật");
		btn_CN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taiKhoan us = new taiKhoan();
				us.setHoVaTen(txt_HVT.getText());
				us.setGmail(txt_Nam.getText());
				connect_taiKhoan.UpTT(us, username);
				JOptionPane.showMessageDialog(null, "Cập nhật thành công!");
				showdata(connect_taiKhoan.find_HoTen_bySBD(username));
			}
		});
		btn_CN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_CN.setBounds(1281, 183, 103, 37);
		panel1_3.add(btn_CN);
		
		JButton btn_XN = new JButton("Xác nhận");
		btn_XN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taiKhoan tk = new taiKhoan();
				tk.setMatKhau(txt_Moi.getText());
				String s1 = txt_Moi.getText();
				String s2 = txt_Lai.getText();
				String s3 = connect_taiKhoan.KTPassCu(username);
				String s4 = txt_Cu.getText();
				if(s1.equals(s2) && s3.equals(s4)) {
					connect_taiKhoan.DoiPass(tk, username);
					JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công!");
				} else {
					JOptionPane.showMessageDialog(null, "Sai  mật khẩu cũ hoặc chưa đồng bộ mật khẩu mới\nVui lòng nhập lại!");
				}
			}
		});
		btn_XN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_XN.setBounds(1281, 583, 103, 37);
		panel1_3.add(btn_XN);
        
		showdata(connect_taiKhoan.find_HoTen_bySBD(username));
	}
	
	public void showdata(taiKhoan us) {
		txt_HVT.setText(us.getHoVaTen());
		txt_Nam.setText(us.getGmail());
	}
}

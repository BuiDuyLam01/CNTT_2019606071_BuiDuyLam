package view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
	private JTextField txt;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField txt_HVT;
	private JTextField txt_Nam;
	private JTextField txt_Cu;
	private JTextField txt_Moi;
	private JTextField txt_Lai;
	private JTextField textField_1;
	private JTextField textField_15;

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

	/**
	 * Create the frame.
	 */
	public HomeUser() {
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
				panel1.remove(panel1_3);
				panel1.remove(panel1_1);
				panel1.add(panel1_2);
				panel1.revalidate();
				panel1.repaint();
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
		panel1_1.setBackground(Color.WHITE);
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
		textArea_1.setText("1.1 Đối tượng tuyển sinh\r\n\r\nLà những thí sinh đã tốt nghiệp Trung học phổ thông hoặc tương đương.\r\n\r\n1.2 Phạm vi tuyển sinh\r\n\r\nTuyển sinh trên toàn quốc.\r\n\r\n1.3 Phương thức tuyển sinh\r\n\r\nNăm 2023, Trường Đại học Việt Á tuyển sinh 3600 chỉ tiêu trình độ Đại học chính quy với 47 chuyên ngành đào tạo theo 03 phương thức xét tuyển độc lập:\r\n\r\n- Phương thức 1 (PT1): Xét tuyển dựa trên kết quả Kỳ thi tốt nghiệp Trung học phổ thông năm 2022. Áp dụng cho toàn bộ các chuyên ngành.\r\n\r\n- Phương thức 2 (PT2): Xét tuyển thẳng theo đề án riêng của Trường Đại học Việt Á (Xét tuyển kết hợp) áp dụng cho toàn bộ các chuyên ngành đối với những thí sinh có tổng điểm các môn thi\n\n tốt nghiệp THPT năm 2022 trong tổ hợp môn xét tuyển đạt ngưỡng chất lượng đầu vào theo Quy định của Nhà trường và đáp ứng một trong các tiêu chí sau:\r\n\r\nTiêu chí 1: Có chứng chỉ Tiếng Anh quốc tế IELTS 5.0 hoặc TOEFL 494 ITP hoặc TOEFL 58 iBT hoặc Toeic (L&R) 595 trở lên trong thời hạn (tính đến ngày 30/08/2022).\r\n\r\nTiêu chí 2:  Đạt các giải Nhất, Nhì, Ba các môn thi Toán học, Vật lý, Hóa học, Sinh học, Ngữ văn, Lịch sử, Địa lý, Tin học và Ngoại ngữ trong kỳ thi chọn học sinh giỏi cấp Tỉnh, Thành phố trở lên.\r\n\r\nTiêu chí 3:  Học 03 năm THPT tại các lớp Chuyên: Toán học, Vật Lý, Hóa học, Sinh học, Ngữ văn, Tiếng Anh, Tin học, Khoa học tự nhiên thuộc các trường Chuyên cấp Tỉnh/Thành phố. Có học lực\n\n Khá trở lên và hạnh kiểm Tốt các năm lớp 10, 11, 12.\r\n\r\n- Phương thức 3 (PT3): Xét tuyển dựa trên kết quả học tập và rèn luyện trung học phổ thông (xét Học bạ) với 30% chỉ tiêu. Áp dụng 28 chuyên ngành thuộc nhóm Kỹ thuật & Công nghệ,\n\n 02 chuyên ngành thuộc nhóm Chất lượng cao (Công nghệ thông tin và Điện tự động công nghiệp).");
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
		panel1_2.setBackground(Color.WHITE);
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
		
		JLabel lblNewLabel_2_2 = new JLabel("Công nghệ thông tin");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(85, 203, 161, 32);
		panel1_2.add(lblNewLabel_2_2);
		
		txt = new JTextField();
		txt.setBounds(290, 204, 59, 32);
		panel1_2.add(txt);
		txt.setColumns(10);
		
		JButton btn_DK1 = new JButton("Đăng ký");
		btn_DK1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_DK1.setBounds(582, 202, 86, 32);
		panel1_2.add(btn_DK1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Nguyện vọng thứ");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(420, 115, 135, 32);
		panel1_2.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Thành công");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_1.setBounds(422, 203, 161, 32);
		panel1_2.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Giáo dục người lớn");
		lblNewLabel_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_2.setBounds(85, 565, 161, 32);
		panel1_2.add(lblNewLabel_2_2_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(290, 566, 59, 32);
		panel1_2.add(textField_2);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Thành công");
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_1_1.setBounds(422, 565, 161, 32);
		panel1_2.add(lblNewLabel_2_2_1_1);
		
		JButton btn_DK1_1 = new JButton("Đăng ký");
		btn_DK1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_DK1_1.setBounds(582, 564, 86, 32);
		panel1_2.add(btn_DK1_1);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Khoa học máy tính");
		lblNewLabel_2_2_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_3.setBounds(85, 256, 161, 32);
		panel1_2.add(lblNewLabel_2_2_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(290, 257, 59, 32);
		panel1_2.add(textField_3);
		
		JLabel lblNewLabel_2_2_1_2 = new JLabel("Thành công");
		lblNewLabel_2_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_1_2.setBounds(422, 256, 161, 32);
		panel1_2.add(lblNewLabel_2_2_1_2);
		
		JButton btn_DK1_2 = new JButton("Đăng ký");
		btn_DK1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_DK1_2.setBounds(582, 255, 86, 32);
		panel1_2.add(btn_DK1_2);
		
		JLabel lblNewLabel_2_2_4 = new JLabel("Hệ thống thông tin");
		lblNewLabel_2_2_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_4.setBounds(85, 497, 161, 32);
		panel1_2.add(lblNewLabel_2_2_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(290, 498, 59, 32);
		panel1_2.add(textField_4);
		
		JLabel lblNewLabel_2_2_1_3 = new JLabel("Thành công");
		lblNewLabel_2_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_1_3.setBounds(422, 497, 161, 32);
		panel1_2.add(lblNewLabel_2_2_1_3);
		
		JButton btn_DK1_3 = new JButton("Đăng ký");
		btn_DK1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_DK1_3.setBounds(582, 496, 86, 32);
		panel1_2.add(btn_DK1_3);
		
		JLabel lblNewLabel_2_2_5 = new JLabel("Kỹ thuật phần mềm");
		lblNewLabel_2_2_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_5.setBounds(85, 311, 161, 32);
		panel1_2.add(lblNewLabel_2_2_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(290, 312, 59, 32);
		panel1_2.add(textField_5);
		
		JLabel lblNewLabel_2_2_1_4 = new JLabel("Thành công");
		lblNewLabel_2_2_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_1_4.setBounds(422, 311, 161, 32);
		panel1_2.add(lblNewLabel_2_2_1_4);
		
		JButton btn_DK1_4 = new JButton("Đăng ký");
		btn_DK1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_DK1_4.setBounds(582, 310, 86, 32);
		panel1_2.add(btn_DK1_4);
		
		JLabel lblNewLabel_2_2_6 = new JLabel("Học sư phạm");
		lblNewLabel_2_2_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_6.setBounds(85, 431, 161, 32);
		panel1_2.add(lblNewLabel_2_2_6);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(290, 432, 59, 32);
		panel1_2.add(textField_6);
		
		JLabel lblNewLabel_2_2_1_5 = new JLabel("Thành công");
		lblNewLabel_2_2_1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_1_5.setBounds(422, 431, 161, 32);
		panel1_2.add(lblNewLabel_2_2_1_5);
		
		JButton btn_DK1_5 = new JButton("Đăng ký");
		btn_DK1_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_DK1_5.setBounds(582, 430, 86, 32);
		panel1_2.add(btn_DK1_5);
		
		JLabel lblNewLabel_2_2_7 = new JLabel("Giáo dục trẻ em");
		lblNewLabel_2_2_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_7.setBounds(85, 369, 161, 32);
		panel1_2.add(lblNewLabel_2_2_7);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(290, 370, 59, 32);
		panel1_2.add(textField_7);
		
		JLabel lblNewLabel_2_2_1_6 = new JLabel("Thành công");
		lblNewLabel_2_2_1_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_1_6.setBounds(422, 369, 161, 32);
		panel1_2.add(lblNewLabel_2_2_1_6);
		
		JButton btn_DK1_6 = new JButton("Đăng ký");
		btn_DK1_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_DK1_6.setBounds(582, 368, 86, 32);
		panel1_2.add(btn_DK1_6);
		
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
		
		JLabel lblNewLabel_2_2_8 = new JLabel("Kỹ thuật cơ khí");
		lblNewLabel_2_2_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_8.setBounds(801, 203, 161, 32);
		panel1_2.add(lblNewLabel_2_2_8);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(1006, 204, 59, 32);
		panel1_2.add(textField_8);
		
		JLabel lblNewLabel_2_2_1_7 = new JLabel("Thành công");
		lblNewLabel_2_2_1_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_1_7.setBounds(1138, 203, 161, 32);
		panel1_2.add(lblNewLabel_2_2_1_7);
		
		JButton btn_DK1_7 = new JButton("Đăng ký");
		btn_DK1_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_DK1_7.setBounds(1298, 202, 86, 32);
		panel1_2.add(btn_DK1_7);
		
		JButton btn_DK1_2_1 = new JButton("Đăng ký");
		btn_DK1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_DK1_2_1.setBounds(1298, 255, 86, 32);
		panel1_2.add(btn_DK1_2_1);
		
		JLabel lblNewLabel_2_2_1_2_1 = new JLabel("Thành công");
		lblNewLabel_2_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_1_2_1.setBounds(1138, 256, 161, 32);
		panel1_2.add(lblNewLabel_2_2_1_2_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(1006, 257, 59, 32);
		panel1_2.add(textField_9);
		
		JLabel lblNewLabel_2_2_3_1 = new JLabel("Kỹ thuật ô tô");
		lblNewLabel_2_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_3_1.setBounds(801, 256, 161, 32);
		panel1_2.add(lblNewLabel_2_2_3_1);
		
		JLabel lblNewLabel_2_2_5_1 = new JLabel("Khoa học hàng hải");
		lblNewLabel_2_2_5_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_5_1.setBounds(801, 311, 161, 32);
		panel1_2.add(lblNewLabel_2_2_5_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(1006, 312, 59, 32);
		panel1_2.add(textField_10);
		
		JLabel lblNewLabel_2_2_1_4_1 = new JLabel("Thành công");
		lblNewLabel_2_2_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_1_4_1.setBounds(1138, 311, 161, 32);
		panel1_2.add(lblNewLabel_2_2_1_4_1);
		
		JButton btn_DK1_4_1 = new JButton("Đăng ký");
		btn_DK1_4_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_DK1_4_1.setBounds(1298, 310, 86, 32);
		panel1_2.add(btn_DK1_4_1);
		
		JButton btn_DK1_6_1 = new JButton("Đăng ký");
		btn_DK1_6_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_DK1_6_1.setBounds(1298, 368, 86, 32);
		panel1_2.add(btn_DK1_6_1);
		
		JLabel lblNewLabel_2_2_1_6_1 = new JLabel("Thành công");
		lblNewLabel_2_2_1_6_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_1_6_1.setBounds(1138, 369, 161, 32);
		panel1_2.add(lblNewLabel_2_2_1_6_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(1006, 370, 59, 32);
		panel1_2.add(textField_11);
		
		JLabel lblNewLabel_2_2_7_1 = new JLabel("Cơ điện tử");
		lblNewLabel_2_2_7_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_7_1.setBounds(801, 369, 161, 32);
		panel1_2.add(lblNewLabel_2_2_7_1);
		
		JLabel lblNewLabel_2_2_6_1 = new JLabel("Thương mại điện tử");
		lblNewLabel_2_2_6_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_6_1.setBounds(801, 431, 161, 32);
		panel1_2.add(lblNewLabel_2_2_6_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(1006, 432, 59, 32);
		panel1_2.add(textField_12);
		
		JLabel lblNewLabel_2_2_1_5_1 = new JLabel("Thành công");
		lblNewLabel_2_2_1_5_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_1_5_1.setBounds(1138, 431, 161, 32);
		panel1_2.add(lblNewLabel_2_2_1_5_1);
		
		JButton btn_DK1_5_1 = new JButton("Đăng ký");
		btn_DK1_5_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_DK1_5_1.setBounds(1298, 430, 86, 32);
		panel1_2.add(btn_DK1_5_1);
		
		JButton btn_DK1_3_1 = new JButton("Đăng ký");
		btn_DK1_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_DK1_3_1.setBounds(1298, 496, 86, 32);
		panel1_2.add(btn_DK1_3_1);
		
		JLabel lblNewLabel_2_2_1_3_1 = new JLabel("Thành công");
		lblNewLabel_2_2_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_1_3_1.setBounds(1138, 497, 161, 32);
		panel1_2.add(lblNewLabel_2_2_1_3_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(1006, 498, 59, 32);
		panel1_2.add(textField_13);
		
		JLabel lblNewLabel_2_2_4_1 = new JLabel("Kế toán");
		lblNewLabel_2_2_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_4_1.setBounds(801, 497, 161, 32);
		panel1_2.add(lblNewLabel_2_2_4_1);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("Quản lí chất lượng");
		lblNewLabel_2_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_2_1.setBounds(801, 565, 161, 32);
		panel1_2.add(lblNewLabel_2_2_2_1);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(1006, 566, 59, 32);
		panel1_2.add(textField_14);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Thành công");
		lblNewLabel_2_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_1_1_1.setBounds(1138, 565, 161, 32);
		panel1_2.add(lblNewLabel_2_2_1_1_1);
		
		JButton btn_DK1_1_1 = new JButton("Đăng ký");
		btn_DK1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_DK1_1_1.setBounds(1298, 564, 86, 32);
		panel1_2.add(btn_DK1_1_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 610, 1430, 2);
		panel1_2.add(scrollPane_2);
		
		JButton btn_XacNhan = new JButton("Xác nhận đăng ký");
		btn_XacNhan.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_XacNhan.setBounds(501, 625, 145, 32);
		panel1_2.add(btn_XacNhan);
		
		JButton btn_LamMoi = new JButton("Làm mới");
		btn_LamMoi.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_LamMoi.setBounds(663, 625, 135, 32);
		panel1_2.add(btn_LamMoi);
		
		JButton btn_Thoat = new JButton("Thoát");
		btn_Thoat.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_Thoat.setBounds(817, 625, 135, 32);
		panel1_2.add(btn_Thoat);
		
		JLabel lblNewLabel_2_2_9 = new JLabel("Quản lí giáo dục");
		lblNewLabel_2_2_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_9.setBounds(85, 150, 161, 32);
		panel1_2.add(lblNewLabel_2_2_9);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(290, 151, 59, 32);
		panel1_2.add(textField_1);
		
		JLabel lblNewLabel_2_2_1_8 = new JLabel("Thành công");
		lblNewLabel_2_2_1_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_1_8.setBounds(422, 150, 161, 32);
		panel1_2.add(lblNewLabel_2_2_1_8);
		
		JButton btn_DK1_8 = new JButton("Đăng ký");
		btn_DK1_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_DK1_8.setBounds(582, 149, 86, 32);
		panel1_2.add(btn_DK1_8);
		
		JLabel lblNewLabel_2_2_10 = new JLabel("Marketing");
		lblNewLabel_2_2_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_10.setBounds(801, 151, 161, 32);
		panel1_2.add(lblNewLabel_2_2_10);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(1006, 152, 59, 32);
		panel1_2.add(textField_15);
		
		JLabel lblNewLabel_2_2_1_9 = new JLabel("Thành công");
		lblNewLabel_2_2_1_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_1_9.setBounds(1138, 151, 161, 32);
		panel1_2.add(lblNewLabel_2_2_1_9);
		
		JButton btn_DK1_9 = new JButton("Đăng ký");
		btn_DK1_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_DK1_9.setBounds(1298, 150, 86, 32);
		panel1_2.add(btn_DK1_9);
		
		panel1_3 = new JPanel();
		panel1_3.setLayout(null);
		panel1_3.setBackground(Color.WHITE);
		panel1_3.setBounds(0, 36, 1440, 673);
		panel1.add(panel1_3);
		
		JLabel lblHVT = new JLabel("Họ và tên");
		lblHVT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHVT.setBounds(57, 74, 90, 29);
		panel1_3.add(lblHVT);
		
		JLabel lblNS = new JLabel("Năm sinh");
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
		btn_CN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_CN.setBounds(1281, 183, 103, 37);
		panel1_3.add(btn_CN);
		
		JButton btn_XN = new JButton("Xác nhận");
		btn_XN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_XN.setBounds(1281, 583, 103, 37);
		panel1_3.add(btn_XN);
	}
}

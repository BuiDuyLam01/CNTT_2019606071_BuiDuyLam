package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Home extends JFrame {

	private JPanel contentPane;
	private JPanel panel2_2;
	private JPanel panel2;
	private JPanel panel2_1;
	private JPanel panel2_2_1;
	private JPanel panel2_2_2;
	private JPanel panel2_2_3;
	private JPanel panel2_2_4;
	private JTable table2_2_1_1;
	private JTable table2_2_1_3;
	private JTable table2_2_1_2;
	private JTable table2_2_1_4;
	private JTable table2_2_2_1;
	private JTable table2_2_2_2;
	private JTable table2_2_2_3;
	private JTable table2_2_2_4;
	private JTable table2_2_3_1;
	private JTable table2_2_3_3;
	private JTable table2_2_3_2;
	private JTable table2_2_3_4;
	private JTable table2_2_4_1;
	private JTable table2_2_4_2;
	private JTable table2_2_4_3;
	private JTable table2_2_4_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setTitle("WELCOME TO DONG A UNIVERSITY");
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
		
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.WHITE);
		panel2.setBounds(0, 21, 1440, 709);
		contentPane.add(panel2);
		
		JButton btn_SKTT2 = new JButton("Sự kiện & Thông tin");
		btn_SKTT2.setForeground(new Color(255, 255, 255));
		btn_SKTT2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.remove(panel2_2);
				panel2.add(panel2_1);
				panel2.revalidate();
				panel2.repaint();
			}
		});
		Image img2_1 = new ImageIcon(this.getClass().getResource("/image/event.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btn_SKTT2.setIcon(new ImageIcon(img2_1));
		btn_SKTT2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_SKTT2.setBackground(new Color(255, 102, 0));
		btn_SKTT2.setBounds(-1, 0, 162, 36);
		panel2.add(btn_SKTT2);
		
		JButton btn_DKXT2 = new JButton("Dự báo điểm chuẩn");
		btn_DKXT2.setForeground(new Color(255, 255, 255));
		btn_DKXT2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.remove(panel2_1);
				panel2.add(panel2_2);
				panel2.revalidate();
				panel2.repaint();
			}
		});
		Image img2_2 = new ImageIcon(this.getClass().getResource("/image/regis.png")).getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE);
		btn_DKXT2.setIcon(new ImageIcon(img2_2));
		btn_DKXT2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_DKXT2.setBackground(new Color(255, 102, 0));
		btn_DKXT2.setBounds(159, 0, 162, 36);
		panel2.add(btn_DKXT2);

		panel2_1 = new JPanel();
		panel2_1.setLayout(null);
		panel2_1.setBackground(Color.WHITE);
		panel2_1.setBounds(0, 36, 1440, 673);
		panel2.add(panel2_1);
		
		JLabel lbThongBao_12 = new JLabel("THÔNG BÁO TỪ BAN TUYỂN SINH TRƯỜNG ĐẠI HỌC VIỆT Á");
		lbThongBao_12.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbThongBao_12.setBounds(345, 21, 734, 42);
		panel2_1.add(lbThongBao_12);
		
		JLabel Logo = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/image/logo.jpg")).getImage();
		Logo.setIcon(new ImageIcon(img1));
		Logo.setBounds(1170, 73, 242, 240);
		panel2_1.add(Logo);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setText("1.1 Đối tượng tuyển sinh\r\n\r\nLà những thí sinh đã tốt nghiệp Trung học phổ thông hoặc tương đương.\r\n\r\n1.2 Phạm vi tuyển sinh\r\n\r\nTuyển sinh trên toàn quốc.\r\n\r\n1.3 Phương thức tuyển sinh\r\n\r\nNăm 2023, Trường Đại học Việt Á tuyển sinh 3600 chỉ tiêu trình độ Đại học chính quy với 47 chuyên ngành đào tạo theo 03 phương thức xét tuyển độc lập:\r\n\r\n- Phương thức 1 (PT1): Xét tuyển dựa trên kết quả Kỳ thi tốt nghiệp Trung học phổ thông năm 2022. Áp dụng cho toàn bộ các chuyên ngành.\r\n\r\n- Phương thức 2 (PT2): Xét tuyển thẳng theo đề án riêng của Trường Đại học Việt Á (Xét tuyển kết hợp) áp dụng cho toàn bộ các chuyên ngành đối với những thí sinh có tổng điểm các môn thi\n\n tốt nghiệp THPT năm 2022 trong tổ hợp môn xét tuyển đạt ngưỡng chất lượng đầu vào theo Quy định của Nhà trường và đáp ứng một trong các tiêu chí sau:\r\n\r\nTiêu chí 1: Có chứng chỉ Tiếng Anh quốc tế IELTS 5.0 hoặc TOEFL 494 ITP hoặc TOEFL 58 iBT hoặc Toeic (L&R) 595 trở lên trong thời hạn (tính đến ngày 30/08/2022).\r\n\r\nTiêu chí 2:  Đạt các giải Nhất, Nhì, Ba các môn thi Toán học, Vật lý, Hóa học, Sinh học, Ngữ văn, Lịch sử, Địa lý, Tin học và Ngoại ngữ trong kỳ thi chọn học sinh giỏi cấp Tỉnh, Thành phố trở lên.\r\n\r\nTiêu chí 3:  Học 03 năm THPT tại các lớp Chuyên: Toán học, Vật Lý, Hóa học, Sinh học, Ngữ văn, Tiếng Anh, Tin học, Khoa học tự nhiên thuộc các trường Chuyên cấp Tỉnh/Thành phố. Có học lực\n\n Khá trở lên và hạnh kiểm Tốt các năm lớp 10, 11, 12.\r\n\r\n- Phương thức 3 (PT3): Xét tuyển dựa trên kết quả học tập và rèn luyện trung học phổ thông (xét Học bạ) với 30% chỉ tiêu. Áp dụng 28 chuyên ngành thuộc nhóm Kỹ thuật & Công nghệ,\n\n 02 chuyên ngành thuộc nhóm Chất lượng cao (Công nghệ thông tin và Điện tự động công nghiệp).");
		textArea_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textArea_2.setBounds(52, 73, 1360, 558);
		panel2_1.add(textArea_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Địa chỉ: Số 128, đường Hoàng Quốc Việt, quân Cầu Giấy, Hà Nội          Holine: 1900 8569");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2.setBounds(881, 641, 531, 22);
		panel2_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Trường Đại Học Việt Á");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_3.setBounds(52, 641, 531, 22);
		panel2_1.add(lblNewLabel_2_3);
		
		panel2_2 = new JPanel();
		panel2_2.setLayout(null);
		panel2_2.setBackground(Color.WHITE);
		panel2_2.setBounds(0, 36, 1440, 673);
		panel2.add(panel2_2);
		
		JLabel lblNewLabel_1 = new JLabel("DỰ BÁO ĐIỂM CHUẨN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(592, 3, 237, 51);
		panel2_2.add(lblNewLabel_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 52, 1441, 2);
		panel2_2.add(scrollPane_2);
		
		JButton btn_DKXT2_1_4 = new JButton("Dự báo điểm chuẩn 2023");
		btn_DKXT2_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2_2.remove(panel2_2_4);
				panel2_2.remove(panel2_2_3);
				panel2_2.remove(panel2_2_2);
				panel2_2.add(panel2_2_1);
				panel2_2.revalidate();
				panel2_2.repaint();
			}
		});
		btn_DKXT2_1_4.setForeground(Color.WHITE);
		btn_DKXT2_1_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_DKXT2_1_4.setBackground(new Color(60, 179, 113));
		btn_DKXT2_1_4.setBounds(321, 52, 192, 36);
		panel2_2.add(btn_DKXT2_1_4);
		
		JButton btn_DKXT2_1_1_1 = new JButton("Điểm chuẩn 2022");
		btn_DKXT2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2_2.remove(panel2_2_4);
				panel2_2.remove(panel2_2_3);
				panel2_2.remove(panel2_2_1);
				panel2_2.add(panel2_2_2);
				panel2_2.revalidate();
				panel2_2.repaint();
			}
		});
		btn_DKXT2_1_1_1.setForeground(Color.WHITE);
		btn_DKXT2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_DKXT2_1_1_1.setBackground(new Color(60, 179, 113));
		btn_DKXT2_1_1_1.setBounds(512, 52, 192, 36);
		panel2_2.add(btn_DKXT2_1_1_1);
		
		JButton btn_DKXT2_1_2_1 = new JButton("Điểm chuẩn 2021");
		btn_DKXT2_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2_2.remove(panel2_2_4);
				panel2_2.remove(panel2_2_1);
				panel2_2.remove(panel2_2_2);
				panel2_2.add(panel2_2_3);
				panel2_2.revalidate();
				panel2_2.repaint();
			}
		});
		btn_DKXT2_1_2_1.setForeground(Color.WHITE);
		btn_DKXT2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_DKXT2_1_2_1.setBackground(new Color(60, 179, 113));
		btn_DKXT2_1_2_1.setBounds(702, 52, 192, 36);
		panel2_2.add(btn_DKXT2_1_2_1);
		
		JButton btn_DKXT2_1_3_1 = new JButton("Điểm chuẩn 2020");
		btn_DKXT2_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2_2.remove(panel2_2_1);
				panel2_2.remove(panel2_2_3);
				panel2_2.remove(panel2_2_2);
				panel2_2.add(panel2_2_4);
				panel2_2.revalidate();
				panel2_2.repaint();
			}
		});
		btn_DKXT2_1_3_1.setForeground(Color.WHITE);
		btn_DKXT2_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_DKXT2_1_3_1.setBackground(new Color(60, 179, 113));
		btn_DKXT2_1_3_1.setBounds(892, 52, 192, 36);
		panel2_2.add(btn_DKXT2_1_3_1);
		
		panel2_2_1 = new JPanel();
		panel2_2_1.setBackground(Color.WHITE);
		panel2_2_1.setBounds(158, 113, 1121, 477);
		panel2_2.add(panel2_2_1);
		panel2_2_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Khoa công nghệ thông tin");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(153, 10, 194, 33);
		panel2_2_1.add(lblNewLabel);
		
		table2_2_1_1 = new JTable();
		table2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table2_2_1_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Ng\u00E0nh x\u00E9t tuy\u1EC3n", "D\u1EF1 b\u00E1o \u0111i\u1EC3m"
			}
		));
		table2_2_1_1.getColumnModel().getColumn(0).setPreferredWidth(104);
		
		JScrollPane scrollPane = new JScrollPane(table2_2_1_1);
		scrollPane.setBounds(105, 53, 300, 90);
		panel2_2_1.add(scrollPane);
		
		JLabel lblNewLabel_2 = new JLabel("Khoa kỹ thuật");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(153, 190, 194, 33);
		panel2_2_1.add(lblNewLabel_2);
		
		table2_2_1_3 = new JTable();
		table2_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table2_2_1_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Ng\u00E0nh x\u00E9t tuy\u1EC3n", "D\u1EF1 b\u00E1o \u0111i\u1EC3m"
			}
		));
		table2_2_1_3.getColumnModel().getColumn(0).setPreferredWidth(104);
		
		JScrollPane scrollPane_1 = new JScrollPane(table2_2_1_3);
		scrollPane_1.setBounds(105, 233, 300, 90);
		panel2_2_1.add(scrollPane_1);
		
		JLabel lblNewLabel_3 = new JLabel("Khoa giáo dục và đào tạo");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(745, 10, 194, 33);
		panel2_2_1.add(lblNewLabel_3);
		
		table2_2_1_2 = new JTable();
		table2_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table2_2_1_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Ng\u00E0nh x\u00E9t tuy\u1EC3n", "D\u1EF1 b\u00E1o \u0111i\u1EC3m"
			}
		));
		table2_2_1_2.getColumnModel().getColumn(0).setPreferredWidth(104);
		
		JScrollPane scrollPane_3 = new JScrollPane(table2_2_1_2);
		scrollPane_3.setBounds(697, 53, 300, 90);
		panel2_2_1.add(scrollPane_3);
		
		JLabel lblNewLabel_4 = new JLabel("Khoa kinh doanh và quản lí");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(745, 190, 194, 33);
		panel2_2_1.add(lblNewLabel_4);
		
		table2_2_1_4 = new JTable();
		table2_2_1_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table2_2_1_4.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Ng\u00E0nh x\u00E9t tuy\u1EC3n", "D\u1EF1 b\u00E1o \u0111i\u1EC3m"
			}
		));
		table2_2_1_4.getColumnModel().getColumn(0).setPreferredWidth(104);
		
		JScrollPane scrollPane_4 = new JScrollPane(table2_2_1_4);
		scrollPane_4.setBounds(697, 233, 300, 90);
		panel2_2_1.add(scrollPane_4);
		
		panel2_2_2 = new JPanel();
		panel2_2_2.setBackground(Color.WHITE);
		panel2_2_2.setBounds(158, 113, 1121, 477);
		panel2_2.add(panel2_2_2);
		panel2_2_2.setLayout(null);
		
		JLabel lblNewLabel2 = new JLabel("Khoa công nghệ thông tin");
		lblNewLabel2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel2.setBounds(153, 10, 194, 33);
		panel2_2_2.add(lblNewLabel2);
		
		table2_2_2_1 = new JTable();
		table2_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table2_2_2_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Công nghệ thông tin", 23},
				{"Khoa học máy tinh", 20},
				{"Hệ thống thông tin", 21},
				{"Kỹ thuật phần mềm", 22},
			},
			new String[] {
				"Ng\u00E0nh x\u00E9t tuy\u1EC3n", "\u0110i\u1EC3m chu\u1EA9n"
			}
		));
		table2_2_2_1.getColumnModel().getColumn(0).setPreferredWidth(104);
		
		JScrollPane scrollPane2 = new JScrollPane(table2_2_2_1);
		scrollPane2.setBounds(105, 53, 300, 90);
		panel2_2_2.add(scrollPane2);
		
		JLabel lblNewLabel2_3 = new JLabel("Khoa giáo dục và đào tạo");
		lblNewLabel2_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel2_3.setBounds(754, 10, 194, 33);
		panel2_2_2.add(lblNewLabel2_3);
		
		table2_2_2_2 = new JTable();
		table2_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table2_2_2_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"Học sư phạm", 20},
				{"Giáo dục trẻ em", 21},
				{"Giáo dục người lớn", 20.5},
				{"Quản lí giáo dục", 19},
			},
			new String[] {
				"Ng\u00E0nh x\u00E9t tuy\u1EC3n", "Điểm chuẩn"
			}
		));
		table2_2_2_2.getColumnModel().getColumn(0).setPreferredWidth(104);
		
		JScrollPane scrollPane2_3 = new JScrollPane(table2_2_2_2);
		scrollPane2_3.setBounds(697, 53, 300, 90);
		panel2_2_2.add(scrollPane2_3);
		
		JLabel lblNewLabel2_2 = new JLabel("Khoa kỹ thuật");
		lblNewLabel2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel2_2.setBounds(201, 190, 144, 33);
		panel2_2_2.add(lblNewLabel2_2);
		
		table2_2_2_3 = new JTable();
		table2_2_2_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table2_2_2_3.setModel(new DefaultTableModel(
			new Object[][] {
				{"Kỹ thuật cơ khí", 21},
				{"Kỹ thuật ô tô", 22},
				{"Khoa học hàng hải", 23},
				{"Cơ điện tử", 20},
			},
			new String[] {
				"Ng\u00E0nh x\u00E9t tuy\u1EC3n", "Điểm chuẩn"
			}
		));
		table2_2_2_3.getColumnModel().getColumn(0).setPreferredWidth(104);
		
		JScrollPane scrollPane2_1 = new JScrollPane(table2_2_2_3);
		scrollPane2_1.setBounds(105, 233, 300, 90);
		panel2_2_2.add(scrollPane2_1);
		
		JLabel lblNewLabel2_4 = new JLabel("Khoa kinh doanh và quản lí");
		lblNewLabel2_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel2_4.setBounds(750, 190, 213, 33);
		panel2_2_2.add(lblNewLabel2_4);
		
		table2_2_2_4 = new JTable();
		table2_2_2_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table2_2_2_4.setModel(new DefaultTableModel(
			new Object[][] {
				{"Thương mại điện tử", 20},
				{"Kế toán", 20},
				{"Quản lí chất lượng", 21},
				{"Marketing", 21},
			},
			new String[] {
				"Ng\u00E0nh x\u00E9t tuy\u1EC3n", "Điểm chuẩn"
			}
		));
		table2_2_2_4.getColumnModel().getColumn(0).setPreferredWidth(104);
		
		JScrollPane scrollPane2_4 = new JScrollPane(table2_2_2_4);
		scrollPane2_4.setBounds(697, 233, 300, 90);
		panel2_2_2.add(scrollPane2_4);
		
		panel2_2_3 = new JPanel();
		panel2_2_3.setBackground(Color.WHITE);
		panel2_2_3.setBounds(158, 113, 1121, 477);
		panel2_2.add(panel2_2_3);
		panel2_2_3.setLayout(null);
		
		JLabel lblNewLabel3 = new JLabel("Khoa công nghệ thông tin");
		lblNewLabel3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel3.setBounds(153, 10, 194, 33);
		panel2_2_3.add(lblNewLabel3);
		
		table2_2_3_1 = new JTable();
		table2_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table2_2_3_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Công nghệ thông tin", 23},
				{"Khoa học máy tinh", 20},
				{"Hệ thống thông tin", 21},
				{"Kỹ thuật phần mềm", 22},
			},
			new String[] {
				"Ng\u00E0nh x\u00E9t tuy\u1EC3n", "Điểm chuẩn"
			}
		));
		table2_2_3_1.getColumnModel().getColumn(0).setPreferredWidth(104);
		
		JScrollPane scrollPane3 = new JScrollPane(table2_2_3_1);
		scrollPane3.setBounds(105, 53, 300, 90);
		panel2_2_3.add(scrollPane3);
		
		JLabel lblNewLabel_6 = new JLabel("Khoa kỹ thuật");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(203, 190, 137, 33);
		panel2_2_3.add(lblNewLabel_6);
		
		table2_2_3_3 = new JTable();
		table2_2_3_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table2_2_3_3.setModel(new DefaultTableModel(
			new Object[][] {
				{"Kỹ thuật cơ khí", 21},
				{"Kỹ thuật ô tô", 22},
				{"Khoa học hàng hải", 23},
				{"Cơ điện tử", 20},
			},
			new String[] {
				"Ng\u00E0nh x\u00E9t tuy\u1EC3n", "Điểm chuẩn"
			}
		));
		table2_2_3_3.getColumnModel().getColumn(0).setPreferredWidth(104);
		
		JScrollPane scrollPane_6 = new JScrollPane(table2_2_3_3);
		scrollPane_6.setBounds(105, 233, 300, 90);
		panel2_2_3.add(scrollPane_6);
		
		JLabel lblNewLabel_7 = new JLabel("Khoa giáo dục và đào tạo");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(752, 10, 194, 33);
		panel2_2_3.add(lblNewLabel_7);
		
		table2_2_3_2 = new JTable();
		table2_2_3_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table2_2_3_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"Học sư phạm", 20},
				{"Giáo dục trẻ em", 21},
				{"Giáo dục người lớn", 20.5},
				{"Quản lí giáo dục", 19},
			},
			new String[] {
				"Ng\u00E0nh x\u00E9t tuy\u1EC3n", "Điểm chuẩn"
			}
		));
		table2_2_3_2.getColumnModel().getColumn(0).setPreferredWidth(104);
		
		JScrollPane scrollPane_7 = new JScrollPane(table2_2_3_2);
		scrollPane_7.setBounds(697, 53, 300, 90);
		panel2_2_3.add(scrollPane_7);
		
		JLabel lblNewLabel2_5 = new JLabel("Khoa kinh doanh và quản lí");
		lblNewLabel2_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel2_5.setBounds(747, 190, 219, 33);
		panel2_2_3.add(lblNewLabel2_5);
		
		table2_2_3_4 = new JTable();
		table2_2_3_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table2_2_3_4.setModel(new DefaultTableModel(
			new Object[][] {
				{"Thương mại điện tử", 20},
				{"Kế toán", 20},
				{"Quản lí chất lượng", 21},
				{"Marketing", 21},
			},
			new String[] {
				"Ng\u00E0nh x\u00E9t tuy\u1EC3n", "Điểm chuẩn"
			}
		));
		table2_2_3_4.getColumnModel().getColumn(0).setPreferredWidth(104);
		
		JScrollPane scrollPane2_5 = new JScrollPane(table2_2_3_4);
		scrollPane2_5.setBounds(697, 233, 300, 90);
		panel2_2_3.add(scrollPane2_5);
		
		panel2_2_4 = new JPanel();
		panel2_2_4.setBackground(Color.WHITE);
		panel2_2_4.setBounds(158, 113, 1121, 477);
		panel2_2.add(panel2_2_4);
		panel2_2_4.setLayout(null);
		
		JLabel lblNewLabel8 = new JLabel("Khoa công nghệ thông tin");
		lblNewLabel8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel8.setBounds(153, 10, 194, 33);
		panel2_2_4.add(lblNewLabel8);
		
		table2_2_4_1 = new JTable();
		table2_2_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table2_2_4_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Công nghệ thông tin", 23},
				{"Khoa học máy tinh", 20},
				{"Hệ thống thông tin", 21},
				{"Kỹ thuật phần mềm", 22},
			},
			new String[] {
				"Ng\u00E0nh x\u00E9t tuy\u1EC3n", "Điểm chuẩn"
			}
		));
		table2_2_4_1.getColumnModel().getColumn(0).setPreferredWidth(104);
		
		JScrollPane scrollPane8 = new JScrollPane(table2_2_4_1);
		scrollPane8.setBounds(105, 53, 300, 90);
		panel2_2_4.add(scrollPane8);
		
		JLabel lblNewLabel_8 = new JLabel("Khoa giáo dục và đào tạo");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(745, 10, 194, 33);
		panel2_2_4.add(lblNewLabel_8);
		
		table2_2_4_2 = new JTable();
		table2_2_4_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table2_2_4_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"Học sư phạm", 20},
				{"Giáo dục trẻ em", 21},
				{"Giáo dục người lớn", 20.5},
				{"Quản lí giáo dục", 19},
			},
			new String[] {
				"Ng\u00E0nh x\u00E9t tuy\u1EC3n", "Điểm chuẩn"
			}
		));
		table2_2_4_2.getColumnModel().getColumn(0).setPreferredWidth(104);
		
		JScrollPane scrollPane_8 = new JScrollPane(table2_2_4_2);
		scrollPane_8.setBounds(697, 53, 300, 90);
		panel2_2_4.add(scrollPane_8);
		
		JLabel lblNewLabel_9 = new JLabel("Khoa kỹ thuật");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_9.setBounds(210, 190, 194, 33);
		panel2_2_4.add(lblNewLabel_9);
		
		table2_2_4_3 = new JTable();
		table2_2_4_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table2_2_4_3.setModel(new DefaultTableModel(
			new Object[][] {
				{"Kỹ thuật cơ khí", 21},
				{"Kỹ thuật ô tô", 22},
				{"Khoa học hàng hải", 23},
				{"Cơ điện tử", 20},
			},
			new String[] {
				"Ng\u00E0nh x\u00E9t tuy\u1EC3n", "Điểm chuẩn"
			}
		));
		table2_2_4_3.getColumnModel().getColumn(0).setPreferredWidth(104);
		
		JScrollPane scrollPane_10 = new JScrollPane(table2_2_4_3);
		scrollPane_10.setBounds(105, 233, 300, 90);
		panel2_2_4.add(scrollPane_10);
		
		JLabel lblNewLabel4_6 = new JLabel("Khoa kinh doanh và quản lí");
		lblNewLabel4_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel4_6.setBounds(745, 190, 215, 33);
		panel2_2_4.add(lblNewLabel4_6);
		
		table2_2_4_4 = new JTable();
		table2_2_4_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table2_2_4_4.setModel(new DefaultTableModel(
			new Object[][] {
				{"Thương mại điện tử", 20},
				{"Kế toán", 20},
				{"Quản lí chất lượng", 21},
				{"Marketing", 21},
			},
			new String[] {
				"Ng\u00E0nh x\u00E9t tuy\u1EC3n", "Điểm chuẩn"
			}
		));
		table2_2_4_4.getColumnModel().getColumn(0).setPreferredWidth(104);
		
		JScrollPane scrollPane4_5 = new JScrollPane(table2_2_4_4);
		scrollPane4_5.setBounds(697, 233, 300, 90);
		panel2_2_4.add(scrollPane4_5);
		
		JButton btn_TTK = new JButton("Tạo tài khoản");
		btn_TTK.setForeground(new Color(255, 255, 255));
		btn_TTK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				DangKi DK = new DangKi();
				DK.setVisible(true);
				DK.setLocationRelativeTo(null);
			}
		});
		btn_TTK.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_TTK.setBackground(new Color(255, 102, 0));
		btn_TTK.setBounds(479, 0, 162, 36);
		panel2.add(btn_TTK);
		
		JButton btn_DN = new JButton("Đăng nhập");
		btn_DN.setForeground(new Color(255, 255, 255));
		btn_DN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				DangNhap DN = new DangNhap();
				DN.setVisible(true);
				DN.setLocationRelativeTo(null);
			}
		});
		btn_DN.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_DN.setBackground(new Color(255, 102, 0));
		btn_DN.setBounds(319, 0, 162, 36);
		panel2.add(btn_DN);
		
	}
}

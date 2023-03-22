package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;
import java.util.Random;

import javax.swing.JPasswordField;
import javax.swing.border.MatteBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableCellRenderer;

import controller.connect_thongKe;
import model.thongKe;

import javax.swing.filechooser.FileFilter;

public class DangKi extends JFrame {

	private JPanel contentPane;
	private JPanel panel_DK;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtHVT;
	private JLabel lblNewLabel_2;
	private JTextField txtMa;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_2_1;
	private JTextField txtGmail;
	private JButton btnMXT;
	private JTextField txtMXT;
	private JLabel lblNewLabel_2_2;
	private JButton btnDK;
	private JButton btnThoat;
	private JPanel panel_DN;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField txtUser;
	private JLabel lblImage;
	private JLabel lbl;
	private JTextField txtTDT;
	private JLabel lbl_1;
	private JTextField txtDHB;
	private JPasswordField txtPass;
	private String maxacthuc;
	public static Statement statement;
	public static Connection conn;
	public File file;
	String anh = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangKi frame = new DangKi();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static String NgauNhien() {
		String characters = "ABCDEFGHIKMNLO123456789";
		String st = "";
		int length = 5;
		Random rand = new Random();
		char[] text = new char[length];
		for(int i= 0; i<length; i++) {
			text[i] = characters.charAt(rand.nextInt(characters.length()));
		}
		for(int i = 0; i < text.length; i++) {
			st += text[i];
		}
		return st;
	}
	
	/**
	 * Create the frame.
	 */
	public DangKi() {
		setTitle("TRƯỜNG ĐẠI HỌC VIỆT Á");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_DK = new JPanel();
		panel_DK.setBackground(new Color(224, 255, 255));
		panel_DK.setBounds(0, 0, 866, 490);
		contentPane.add(panel_DK);
		panel_DK.setLayout(null);
		
		lblNewLabel = new JLabel("ĐĂNG KÝ TÀI KHOẢN");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(318, 2, 290, 30);
		panel_DK.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Họ và tên");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(161, 62, 119, 30);
		panel_DK.add(lblNewLabel_1);
		
		txtHVT = new JTextField();
		txtHVT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHVT.setColumns(10);
		txtHVT.setBounds(286, 61, 236, 30);
		panel_DK.add(txtHVT);
		
		lblNewLabel_2 = new JLabel("Mã thí sinh");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(161, 118, 119, 30);
		panel_DK.add(lblNewLabel_2);
		
		txtMa = new JTextField();
		txtMa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMa.setColumns(10);
		txtMa.setBounds(286, 118, 290, 30);
		panel_DK.add(txtMa);
		
		lblNewLabel_3 = new JLabel("Mật khẩu");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(160, 231, 119, 30);
		panel_DK.add(lblNewLabel_3);
		
		lblNewLabel_2_1 = new JLabel("Gmail");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(161, 290, 119, 30);
		panel_DK.add(lblNewLabel_2_1);
		
		txtGmail = new JTextField();
		txtGmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtGmail.setColumns(10);
		txtGmail.setBounds(286, 290, 290, 30);
		panel_DK.add(txtGmail);
		
		maxacthuc = NgauNhien();
		
		btnMXT = new JButton("Gửi mã xác thực");
		btnMXT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = txtGmail.getText();
				
				Properties properties = new Properties();
				properties.put("mail.smtp.host", "smtp.gmail.com");
				properties.put("mail.smtp.port", "465");
				properties.put("mail.smtp.auth", "true");
				properties.put("mail.smtp.ssl.enable", "true"); 
				properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
				
				Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
				    protected PasswordAuthentication getPasswordAuthentication() {
				        return new PasswordAuthentication("duylambadao@gmail.com", "chvrkqumbsidywru");
				    }
				});
				
				try {
					MimeMessage message =  new MimeMessage(session);
					message.setFrom(new InternetAddress("duylambadao@gmail.com"));
					message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
					message.setSubject("Thông báo");
					message.setText(maxacthuc);
					Transport.send(message);
				} catch (Exception e2) {
					System.out.println(""+e2);
				}
			}
		});
		btnMXT.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnMXT.setBackground(new Color(255, 222, 173));
		btnMXT.setBounds(606, 289, 119, 30);
		panel_DK.add(btnMXT);
		
		txtMXT = new JTextField();
		txtMXT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMXT.setColumns(10);
		txtMXT.setBounds(286, 350, 290, 30);
		panel_DK.add(txtMXT);
		
		lblNewLabel_2_2 = new JLabel("Mã xác thực");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_2.setBounds(161, 350, 119, 30);
		panel_DK.add(lblNewLabel_2_2);
		
		JButton btnMXT_1 = new JButton("Tải ảnh lên");
		btnMXT_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(contentPane);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try {
                        BufferedImage originalImage = ImageIO.read(selectedFile);
                        int scaledWidth = 100; 
                        int scaledHeight = (int) (((double) scaledWidth / originalImage.getWidth()) * originalImage.getHeight()); 
                        BufferedImage scaledImage = new BufferedImage(scaledWidth, scaledHeight, BufferedImage.TYPE_INT_RGB);
                        scaledImage.getGraphics().drawImage(originalImage.getScaledInstance(scaledWidth, scaledHeight, BufferedImage.SCALE_SMOOTH), 0, 0, null);
                        ImageIcon imageIcon = new ImageIcon(scaledImage);
                        lblImage.setIcon(imageIcon);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
				
			}
		});
		btnMXT_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnMXT_1.setBackground(new Color(255, 222, 173));
		btnMXT_1.setBounds(591, 231, 93, 30);
		panel_DK.add(btnMXT_1);
		
		btnDK = new JButton("Đăng ký");
		btnDK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// Lấy ảnh từ JLabel
					ImageIcon icon = (ImageIcon) lblImage.getIcon();
					Image image = icon.getImage();

					// Chuyển đổi ảnh thành mảng byte
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					ImageIO.write((BufferedImage) image, "jpg", baos);
					byte[] imageData = baos.toByteArray();

					// Kết nối tới cơ sở dữ liệu
					String url = "jdbc:mysql://localhost:3306/quanlithisinh";
					String user = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(url, user, password);

					// Thực hiện truy vấn để lưu ảnh vào cơ sở dữ liệu
					String sql = "INSERT INTO `quanlithisinh`.`taikhoan` (`MaThiSinh`, `HoVaTen`, `HinhAnh`, `MatKhau`, `Gmail`)\r\n"
							+ "VALUES (?, ?, ?, ?, ?);";
					PreparedStatement statement = conn.prepareStatement(sql);
					statement.setString(1, txtMa.getText());
					statement.setString(2, txtHVT.getText());
					statement.setBytes(3, imageData);
					statement.setString(4, txtPass.getText());
					statement.setString(5, txtGmail.getText());
					statement.executeUpdate();

					// Đóng kết nối
					statement.close();
					conn.close();
					
		            JOptionPane.showMessageDialog(null, "Đăng kí thành công!");
		            
		        } catch (Exception ex) {
		            ex.printStackTrace();
		            JOptionPane.showMessageDialog(null, "Đăng kí thất bại!");
		        }
				
			}
		});
		btnDK.setForeground(Color.WHITE);
		btnDK.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDK.setBackground(Color.RED);
		btnDK.setBounds(296, 418, 119, 47);
		panel_DK.add(btnDK);
		
		btnThoat = new JButton("Thoát");
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Home HU = new Home();
				HU.setVisible(true);
				HU.setLocationRelativeTo(null);
			}
		});
		btnThoat.setForeground(Color.WHITE);
		btnThoat.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnThoat.setBackground(Color.BLACK);
		btnThoat.setBounds(467, 418, 119, 47);
		panel_DK.add(btnThoat);
		
		lblImage = new JLabel("");
		lblImage.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		lblImage.setBackground(Color.PINK);
		lblImage.setForeground(Color.BLACK);
		lblImage.setBounds(694, 169, 100, 92);
		panel_DK.add(lblImage);
		
		lbl = new JLabel("Tổng điểm thi");
		lbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl.setBounds(161, 173, 119, 30);
		panel_DK.add(lbl);
		
		txtTDT = new JTextField();
		txtTDT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTDT.setColumns(10);
		txtTDT.setBounds(286, 173, 83, 30);
		panel_DK.add(txtTDT);
		
		lbl_1 = new JLabel("Điểm học bạ");
		lbl_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_1.setBounds(442, 173, 119, 30);
		panel_DK.add(lbl_1);
		
		txtDHB = new JTextField();
		txtDHB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDHB.setColumns(10);
		txtDHB.setBounds(557, 173, 83, 30);
		panel_DK.add(txtDHB);
		
		txtPass = new JPasswordField();
		txtPass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPass.setBounds(286, 232, 196, 27);
		panel_DK.add(txtPass);
		
		panel_DN = new JPanel();
		panel_DN.setBackground(new Color(255, 250, 240));
		panel_DN.setBounds(0, 0, 866, 490);
		contentPane.add(panel_DN);
		panel_DN.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Màn hình đăng nhập");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_4.setBounds(299, 20, 292, 46);
		panel_DN.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Mã thí sinh");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(232, 115, 134, 39);
		panel_DN.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Mật khẩu");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(232, 191, 134, 39);
		panel_DN.add(lblNewLabel_6);
		
		txtUser = new JTextField();
		txtUser.setBounds(361, 123, 253, 27);
		panel_DN.add(txtUser);
		txtUser.setColumns(10);
	}
	
}

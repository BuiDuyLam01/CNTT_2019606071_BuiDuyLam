package view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Random;

public class QuenMatKhau extends JFrame {

	private JPanel contentPane;
	private JPanel panel_DN;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField txtUser;
	private JTextField txt_PassMoi;
	private JTextField txtGmail;
	private String maxacthuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuenMatKhau frame = new QuenMatKhau();
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
	 * @return 
	 */
	public QuenMatKhau() {
		setTitle("TRƯỜNG ĐẠI HỌC VIỆT Á");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_DN = new JPanel();
		panel_DN.setBackground(new Color(255, 250, 240));
		panel_DN.setBounds(0, 0, 866, 490);
		contentPane.add(panel_DN);
		panel_DN.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Cấp lại mật khẩu");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_4.setBounds(344, 20, 240, 46);
		panel_DN.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Mã thí sinh");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(219, 131, 134, 39);
		panel_DN.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Gmail đăng kí");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(219, 207, 134, 39);
		panel_DN.add(lblNewLabel_6);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtUser.setBounds(375, 139, 253, 27);
		panel_DN.add(txtUser);
		txtUser.setColumns(10);
		
		maxacthuc = NgauNhien();
		
		JButton btnXN = new JButton("Xác nhận");
		btnXN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txt_PassMoi.getText().equals(maxacthuc))
				{
					JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công!");
				} else {
					JOptionPane.showMessageDialog(null, "Sai thông tin. Vui lòng kiểm tra lại !");
						}
			}
		});
		btnXN.setForeground(new Color(248, 248, 255));
		btnXN.setBackground(new Color(0, 0, 255));
		btnXN.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnXN.setBounds(317, 362, 127, 46);
		panel_DN.add(btnXN);
		
		JLabel lblNewLabel_6_1 = new JLabel("Nhập mật khẩu mới");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6_1.setBounds(219, 277, 146, 39);
		panel_DN.add(lblNewLabel_6_1);
		
		JButton btn_TaoMoi = new JButton("Tạo mật khẩu mới");
		btn_TaoMoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = txtUser.getText();
				String gmail = txtGmail.getText();
				try {
					Connection connection = (Connection) DriverManager
							.getConnection("jdbc:mysql://localhost:3306/quanlithisinh", "root", "");
					
					PreparedStatement st2 = (PreparedStatement) connection
							.prepareStatement("Select TenDangNhap, Gmail from taikhoan where TenDangNhap=? and Gmail=? and Quyen=0");
					
					st2.setString(1, userName);
					st2.setString(2, gmail);
					
					ResultSet rs2 = st2.executeQuery();
					if (rs2.next()) {
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
						JOptionPane.showMessageDialog(null, "Mật khẩu mới đã được gửi về gmail của bạn. Vui lòng kiểm tra!");
					} 
					else {
						JOptionPane.showMessageDialog(btnXN, "Tài khoản, gmail không chính xác hoặc không trùng khớp. Vui lòng nhập lại!");
					}
				} catch (SQLException sqlException) {
					sqlException.printStackTrace();
				}
			}
		});
		btn_TaoMoi.setFont(new Font("Tahoma", Font.BOLD, 10));
		btn_TaoMoi.setBounds(648, 207, 127, 27);
		panel_DN.add(btn_TaoMoi);
		
		txt_PassMoi = new JTextField();
		txt_PassMoi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_PassMoi.setColumns(10);
		txt_PassMoi.setBounds(375, 278, 253, 27);
		panel_DN.add(txt_PassMoi);
		
		txtGmail = new JTextField();
		txtGmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtGmail.setColumns(10);
		txtGmail.setBounds(375, 207, 253, 27);
		panel_DN.add(txtGmail);
		
		JButton btnQuayLai = new JButton("Quay lại");
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				DangNhap HU = new DangNhap();
				HU.setVisible(true);
				HU.setLocationRelativeTo(null);
			}
		});
		btnQuayLai.setForeground(new Color(248, 248, 255));
		btnQuayLai.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnQuayLai.setBackground(new Color(240, 128, 128));
		btnQuayLai.setBounds(480, 362, 127, 46);
		panel_DN.add(btnQuayLai);
		
	}
}

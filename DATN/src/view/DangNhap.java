package view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPasswordField;

public class DangNhap extends JFrame {

	private JPanel contentPane;
	private JPanel panel_DN;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField txtUser;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JButton btnDK_2;
	private JPasswordField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangNhap frame = new DangNhap();
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
	 * @return 
	 */
	public DangNhap() {
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
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtUser.setBounds(361, 123, 253, 27);
		panel_DN.add(txtUser);
		txtUser.setColumns(10);
		
		JButton btnDN = new JButton("Đăng nhập");
		btnDN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = txtUser.getText();
				String password = txtPass.getText();
				try {
					Connection connection = (Connection) DriverManager
							.getConnection("jdbc:mysql://localhost:3306/quanlithisinh", "root", "");

					PreparedStatement st = (PreparedStatement) connection
							.prepareStatement("Select TenDangNhap, MatKhau from taikhoan where TenDangNhap=? and MatKhau=? and Quyen=1");
					
					PreparedStatement st2 = (PreparedStatement) connection
							.prepareStatement("Select TenDangNhap, MatKhau from taikhoan where TenDangNhap=? and MatKhau=? and Quyen=0");

					st.setString(1, userName);
					st.setString(2, password);
					
					st2.setString(1, userName);
					st2.setString(2, password);
					
					ResultSet rs = st.executeQuery();
					
					ResultSet rs2 = st2.executeQuery();
					
					if (rs.next()) {
						dispose();
						HomeAdmin ah = new HomeAdmin();
						ah.setLocationRelativeTo(null);
						ah.setVisible(true);
					} else  if (rs2.next()) {
						dispose();
						HomeUser ah = new HomeUser(userName);
						ah.setLocationRelativeTo(null);
						ah.setVisible(true);
					} 
					else {
						JOptionPane.showMessageDialog(btnDN, "Tài khoản hoặc mật khẩu không đúng. Vui lòng nhập lại!");
					}
				} catch (SQLException sqlException) {
					sqlException.printStackTrace();
				}
			}
		});
		btnDN.setForeground(new Color(248, 248, 255));
		btnDN.setBackground(new Color(0, 0, 255));
		btnDN.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDN.setBounds(287, 276, 127, 46);
		panel_DN.add(btnDN);
		
		btnDK_2 = new JButton("Thoát");
		btnDK_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Home DK = new Home();
				DK.setVisible(true);
				DK.setLocationRelativeTo(null);
			}
		});
		btnDK_2.setForeground(new Color(255, 255, 255));
		btnDK_2.setBackground(new Color(255, 0, 0));
		btnDK_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDK_2.setBounds(462, 276, 127, 46);
		panel_DN.add(btnDK_2);
		
		lblNewLabel_7 = new JLabel("Quên mật khẩu ?");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				QuenMatKhau ah = new QuenMatKhau();
				ah.setLocationRelativeTo(null);
				ah.setVisible(true);
			}
		});
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(519, 220, 101, 32);
		panel_DN.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Hỗ trợ: 1900 8596");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(680, 428, 134, 39);
		panel_DN.add(lblNewLabel_8);
		
		txtPass = new JPasswordField();
		txtPass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPass.setBounds(361, 194, 253, 27);
		panel_DN.add(txtPass);
		
	}
}

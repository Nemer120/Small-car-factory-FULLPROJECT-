package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Employee;
import model.Main;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.awt.event.ActionEvent;

public class LogIn extends JFrame implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;


	/**
	 * Create the frame.
	 */
	public LogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setBounds(10, 33, 76, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(10, 90, 63, 30);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(90, 38, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(83, 95, 103, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = textField.getText();
				if(user.equals("Admin")&&String.copyValueOf(passwordField.getPassword()).equals("Admin")){
					JOptionPane.showMessageDialog(btnNewButton,"welcome admin");
					Admin adi = new Admin();
					adi.setVisible(true);
				}
				else {
					if(textField.equals("")||String.copyValueOf( passwordField.getPassword()).equals("")) {
						JOptionPane.showMessageDialog(btnNewButton,"Eror!!!");
					}
					else {
					for(Employee user1 : Main.libr.getAllEmployees().values()) {
						if(user.equals(user1.getID())) {
							JOptionPane.showMessageDialog(btnNewButton,"welcome user");
							User adi = new User(user);
							adi.setVisible(true);
						}
					}
					}
				}

			}
		});
		btnNewButton.setBounds(83, 143, 89, 23);
		contentPane.add(btnNewButton);
	}
}

package GUI;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Car;
import model.Department;
import model.Employee;
import utils.Color;
import utils.Gender;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Choice;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;

public class AddCar extends JInternalFrame {

	/**
	 * 
	 */
	//hi nemer
	//hi adi test
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;


	/**
	 * Create the frame.
	 */
	public AddCar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lisence Plate");
		lblNewLabel.setBounds(22, 11, 74, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Price");
		lblNewLabel_1.setBounds(22, 36, 74, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cost of Manu");
		lblNewLabel_2.setBounds(22, 61, 74, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Engine Capacity");
		lblNewLabel_3.setBounds(22, 86, 81, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Pollution Level");
		lblNewLabel_4.setBounds(22, 111, 74, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Number of seats");
		lblNewLabel_5.setBounds(22, 136, 81, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Is Convertible");
		lblNewLabel_6.setBounds(22, 161, 74, 14);
		contentPane.add(lblNewLabel_6);
		

		textField = new JTextField();
		textField.setBounds(113, 8, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1= new JTextField();
		textField_1.setBounds(113, 33, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(113, 58, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(113, 83, 96, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(113, 108, 96, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Yes");
		rdbtnNewRadioButton.setBounds(123, 157, 54, 23);
		contentPane.add(rdbtnNewRadioButton);
	
		
		JLabel lblNewLabel_7 = new JLabel("Color");
		lblNewLabel_7.setBounds(24, 186, 79, 14);
		contentPane.add(lblNewLabel_7);
		
		JComboBox<Color> comboBox = new JComboBox<Color>();
		comboBox.setBounds(113, 187, 96, 22);
		comboBox.setModel(new DefaultComboBoxModel<>(Color.values()));
		contentPane.add(comboBox);
		
		textField_5 = new JTextField();
		textField_5.setBounds(113, 133, 96, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!(Character.isDigit(c))|| (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		
		textField_1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!(Character.isDigit(c))|| (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		textField_2.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!(Character.isDigit(c))|| (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		textField_3.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!(Character.isDigit(c))|| (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		textField_4.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!(Character.isDigit(c))|| (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		textField_5.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!(Character.isDigit(c))|| (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")||textField_1.getText().equals("")||textField_2.getText().equals("")||textField_3.getText().equals("")||comboBox.getSelectedItem().equals("")||textField_4.getText().equals("")||textField_5.getText().equals(""))
					JOptionPane.showMessageDialog(btnNewButton, "alert", "alert", JOptionPane.ERROR_MESSAGE);
				else {
					if(model.Main.libr.getAllVehicleTransportation().containsKey("c"+textField.getText())) {
						JOptionPane.showMessageDialog(btnNewButton, "Car's License plate already exist");
					}
					else {
						Car h1= new Car(Double.parseDouble(textField.getText()),Double.parseDouble(textField_1.getText()),(Color)comboBox.getSelectedItem(),Integer.parseInt(textField_2.getText()),Double.parseDouble(textField_3.getText()),Integer.parseInt(textField_4.getText()),Integer.parseInt(textField_5.getText()),rdbtnNewRadioButton.isSelected());
						model.Main.libr.getAllVehicleTransportation().put(h1.getLicensePlate(), h1);
						JOptionPane.showMessageDialog(btnNewButton, "Car Added");
						
					}
				}
			}
		});
		btnNewButton.setBounds(299, 224, 89, 23);
		contentPane.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin frame = new Admin();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(44, 224, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}

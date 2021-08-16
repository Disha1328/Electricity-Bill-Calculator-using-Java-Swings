import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class electricity {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_unit;
	private JTextField textField_rpu;
	private JTextField textField_bill;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					electricity window = new electricity();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public electricity() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 615, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 599, 361);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(25, 60, 101, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(154, 58, 137, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblMotorId = new JLabel("Motor ID");
		lblMotorId.setFont(new Font("Arial", Font.BOLD, 14));
		lblMotorId.setBounds(25, 103, 101, 14);
		panel.add(lblMotorId);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Arial", Font.BOLD, 14));
		lblAddress.setBounds(25, 159, 101, 14);
		panel.add(lblAddress);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(154, 101, 137, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(154, 147, 137, 40);
		panel.add(textField_2);
		
		JLabel lblUnitsConsumed = new JLabel("Units Consumed");
		lblUnitsConsumed.setFont(new Font("Arial", Font.BOLD, 14));
		lblUnitsConsumed.setBounds(25, 221, 119, 18);
		panel.add(lblUnitsConsumed);
		
		JLabel lblRateunit = new JLabel("Rate/unit");
		lblRateunit.setFont(new Font("Arial", Font.BOLD, 14));
		lblRateunit.setBounds(25, 277, 101, 14);
		panel.add(lblRateunit);
		
		textField_unit = new JTextField();
		textField_unit.setColumns(10);
		textField_unit.setBounds(154, 221, 137, 20);
		panel.add(textField_unit);
		
		textField_rpu = new JTextField();
		textField_rpu.setColumns(10);
		textField_rpu.setBounds(154, 275, 137, 20);
		panel.add(textField_rpu);
		
		JButton btnNewButton = new JButton("GET AMOUNT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double units= Double.parseDouble(textField_unit.getText());
				double rate= Double.parseDouble(textField_rpu.getText());
				double amount= units*rate;
				
				textField_bill.setText(String.valueOf(amount));
				
			}
		});
		btnNewButton.setBounds(415, 97, 119, 50);
		panel.add(btnNewButton);
		
		JLabel lblBillAmount = new JLabel("Bill Amount");
		lblBillAmount.setFont(new Font("Arial", Font.BOLD, 14));
		lblBillAmount.setBounds(446, 221, 119, 18);
		panel.add(lblBillAmount);
		
		textField_bill = new JTextField();
		textField_bill.setColumns(10);
		textField_bill.setBounds(415, 243, 137, 20);
		panel.add(textField_bill);
		
		JLabel lblNewLabel_1 = new JLabel("ELECTRICITY BILL GENERATION APP");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel_1.setBounds(66, 11, 496, 36);
		panel.add(lblNewLabel_1);
	}

}


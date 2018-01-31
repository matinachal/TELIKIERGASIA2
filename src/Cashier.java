import javax.swing.*;

import java.awt.EventQueue;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Cashier {
	public static JFrame frame;

	protected static JButton selectButton;
	
	protected int r;
	private JLabel lblCashier;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cashier window = new Cashier();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
		

	}
	
	
	public Cashier() {
		initialize();
	}
	
	
	
	void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		this.frame.setVisible(true);

		
		

		JLabel lblCashier_1 = new JLabel("Cashier");
		lblCashier_1.setBounds(183, 11, 46, 14);
		frame.getContentPane().add(lblCashier_1);
	
		
		selectButton = new JButton("EPILOGI EKDILWSHS");
		selectButton.setBounds(40, 132, 359, 67);
		frame.getContentPane().add(selectButton);
		
		
		selectButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					 Select.main(null);
					
					}catch (Exception e) {
						e.printStackTrace();
					};
			}
		});
	
		
		

		
		
		
		
		
		
		

		
	}
}



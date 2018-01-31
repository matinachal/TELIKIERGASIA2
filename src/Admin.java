import javax.swing.*;

import java.awt.EventQueue;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Admin {
	public static JFrame frame;

	protected static JButton katButton;
	protected static JButton provButton;
	protected int r;
	private JLabel lblAdministrator;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
		

	}
	
	
	public Admin() {
		initialize();
	}
	
	
	
	void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		this.frame.setVisible(true);

		
		

		
	
		
		katButton = new JButton("KATAXWRISI NEAS EKDILWSIS");
		katButton.setBounds(40, 132, 359, 64);
		frame.getContentPane().add(katButton);
		katButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					 Kataxwrisi.main(null);
					
					}catch (Exception e) {
						e.printStackTrace();
					};
			}
		});
	
		
		provButton = new JButton("PROVOLI STATISTIKWN");
		provButton.setBounds(40, 62, 359, 59);
		frame.getContentPane().add(provButton);
		
		lblAdministrator = new JLabel("Administrator");
		lblAdministrator.setBounds(196, 11, 81, 40);
		frame.getContentPane().add(lblAdministrator);
		provButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					 Provolistat.main(null);

					}catch (Exception e) {
						e.printStackTrace();
					};

			}
		});
		

		
		
		
		
		
		
		

		
	}
}

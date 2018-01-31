import javax.swing.*;

import java.awt.EventQueue;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.BorderLayout;
import java.sql.*;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.sql.Connection;
import java.sql.DriverManager;

public class Home {
private String username;
private String[] users = {"Admin", "Cashier1", "Cashier2", "Casier3"};
int i;
boolean check=false;
static JFrame frame;
static JTextField un1;
static JButton btnNewButton1;
private JLabel lblWelcome;
private JLabel lblAdminForAdministrator;
private JLabel lblCashierFor;
 

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
  
					  

				
			}
		});
		

	}
	
	
	public Home() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		un1 = new JTextField();
		un1.setBounds(158, 68, 149, 20);
		frame.getContentPane().add(un1);
		un1.setColumns(20);
		
		btnNewButton1 = new JButton("Login");
		btnNewButton1.setBounds(169, 211, 89, 23);
		frame.getContentPane().add(btnNewButton1);
		
		
		
		JLabel user = new JLabel("Username:");
		user.setBounds(66, 71, 70, 14);
		frame.getContentPane().add(user);
		
		lblWelcome = new JLabel("Please Log in");
		lblWelcome.setBounds(186, 11, 89, 14);
		frame.getContentPane().add(lblWelcome);
		
		lblAdminForAdministrator = new JLabel("Admin for Administrator");
		lblAdminForAdministrator.setBounds(66, 115, 179, 14);
		frame.getContentPane().add(lblAdminForAdministrator);
		
		lblCashierFor = new JLabel("Cashier1/2/3 for Cashiers");
		lblCashierFor.setBounds(66, 153, 143, 14);
		frame.getContentPane().add(lblCashierFor);
		
		
		
		btnNewButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				username = un1.getText();
				
				 for (i=0; i<users.length; i++) {
					if(username.equals(users[i].toString())) {
						check=true;
						if((users[i].toString()).equals("Admin")) {
							 frame.setVisible(false);
							 Admin.main(null);
							 break;
						}
						else if((users[i].toString()).equals("Cashier1")) {
							 frame.setVisible(false);
							 Cashier.main(null);
							 break;
						}
						else if((users[i].toString()).equals("Cashier2")) {
							 frame.setVisible(false);
							 Cashier.main(null);
							 break;
						}
						else if((users[i].toString()).equals("Cashier3")) {
							 frame.setVisible(false);
							 Cashier.main(null);
							 break;
						}
						
						
						}

				}

					if (check==false) {
						JOptionPane.showMessageDialog(frame, "Wrong username");
							}



}

		});


	
}
	protected static Connection connection() {
		Connection conn = null;
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","1234");}
		 catch (Exception e) {e.printStackTrace();}
			return conn;
	}
}
	
	

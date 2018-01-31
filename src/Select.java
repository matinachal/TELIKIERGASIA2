import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.mysql.jdbc.Statement;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class Select {
	public static JFrame frame;

	protected static JButton printButton;
	
	protected int r; static void main(String[] args) {
		// TODO Auto-generated method stub
//
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select window = new Select();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
		

	}
	
	
	public Select() {
		initialize();
	}
	


	void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		this.frame.setVisible(true);
		
		
		
		JLabel lblCashier = new JLabel("Cashier");
		lblCashier.setBounds(191, 11, 46, 14);
		frame.getContentPane().add(lblCashier);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(70, 56, 233, 20);
		frame.getContentPane().add(comboBox);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","1234");
		Statement stat = (Statement) conn.createStatement();
		String selectQuery="select onoma from ekdilwseis";
		ResultSet rs=stat.executeQuery(selectQuery);
		while(rs.next()) {
			comboBox.addItem(rs.getString("onoma")
		);
		}
		
		}catch (Exception e) {e.printStackTrace();}
		
		
		
		
		printButton = new JButton("EKTUPWSH EISITIRIWN");
		printButton.setBounds(36, 158, 359, 60);
		frame.getContentPane().add(printButton);
		printButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					 Print.main(null);

					}catch (Exception e) {
						e.printStackTrace();
					};

			}
		
		});
	}
}
		

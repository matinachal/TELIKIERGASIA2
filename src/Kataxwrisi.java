
import javax.swing.*;
import java.awt.EventQueue;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.BorderLayout;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;


public class Kataxwrisi {
	public static JFrame kat1;
	private JTextField onoma;
	private JTextField xwritikotita;
	private JTextField imerominia;

	
	private JLabel label1, label2;
	private JButton eisagwgi;
	private String onoma1;
	private int xwritikotita1;
	private String imerominia1;
	String query;
	private JLabel lblAdministrator;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
		Kataxwrisi kat = new Kataxwrisi();
		kat.kat1.setVisible(true);


	}
		
	});
		// TODO Auto-generated method stub
//
	}
	
	
	public Kataxwrisi() {

		initialize();
	}
	
	private void initialize() {
		kat1 = new JFrame();
		kat1.setBounds(250, 250, 450, 300);
		kat1.getContentPane().setLayout(null);
		
		
		JLabel label = new JLabel("Onoma ekdilwsis");
		label.setBounds(15, 45, 150, 20);
		kat1.getContentPane().add(label);
		
		onoma = new JTextField();
		onoma.setBounds(177, 45, 90, 20);
		kat1.getContentPane().add(onoma);
		onoma.setColumns(20);
		
		
		label1 = new JLabel("xwritikotita ekdilwsis");
		label1.setBounds(15, 100, 150, 14);
		kat1.getContentPane().add(label1);
		
		xwritikotita = new JTextField();
		xwritikotita.setBounds(177, 97, 90, 20);
		kat1.getContentPane().add(xwritikotita);
		xwritikotita.setColumns(10);
		
		label2 = new JLabel("imerominia");
		label2.setBounds(15, 156, 150, 14);
		kat1.getContentPane().add(label2);
		
		imerominia = new JTextField();
		imerominia.setBounds(177, 153, 90, 20);
		kat1.getContentPane().add(imerominia);
		imerominia.setColumns(10);
		
		
		eisagwgi = new JButton("EISAGWGI EKDILWSIS");
		eisagwgi.addMouseListener(new MouseAdapter() {		
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 onoma1=onoma.getText();
				 xwritikotita1=Integer.parseInt(xwritikotita.getText());
				 imerominia1=imerominia.getText();
				
				 
				
				query = "INSERT INTO `db1`.`ekdilwseis`(`onoma`, `imerominia`, `xwritikotita`,) VALUES ('"+onoma1+"', '"+imerominia1+"', '"+xwritikotita1+"');";
				System.out.println(query);

				try{  
					 Connection conn= Home.connection();
						Statement stmt1=conn.createStatement();  
						stmt1.executeUpdate(query);  
					}catch(Exception e){ System.out.println(e);}
				
				

			}
		});

		eisagwgi.setBounds(274, 82,150, 50);
		kat1.getContentPane().add(eisagwgi);
		
		lblAdministrator = new JLabel("Administrator");
		lblAdministrator.setBounds(194, 11, 73, 14);
		kat1.getContentPane().add(lblAdministrator);
		
		
		
	}
	

}

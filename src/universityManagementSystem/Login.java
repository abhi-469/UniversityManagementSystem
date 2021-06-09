package universityManagementSystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;



public class Login extends JFrame implements ActionListener{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;
	
	Login()
	{
		super("Login");
		//setBackground(Color.white);
		setLayout(null);
		
		l1=new JLabel("Username");
		l1.setBounds(40,20,100,30);
		add(l1);
		
		l2=new JLabel("Password");
		l2.setBounds(40, 70, 100, 30);
		add(l2);
		
		t1=new JTextField();
		t1.setBounds(150, 20, 150, 30);
		add(t1);
		
		t2=new JPasswordField();
		t2.setBounds(150,70,150,30);
		add(t2);
		
		b1=new JButton("Login");
		b1.setBounds(40,150,100,30);
		b1.addActionListener(this);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		add(b1);
		
		
		b2=new JButton("Cancel");
		b2.setBounds(180,150,100,30);
		b2.addActionListener(this);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		add(b2);
		
		getContentPane().setBackground(Color.white);
		
		this.setVisible(true);
		this.setLocation(600,250);
		this.setSize(340,220);
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			try
			{
				String username=t1.getText();
				String password=t2.getText();
				
				Conn c=new Conn();
				ResultSet rs=c.s.executeQuery("select * from login where username='"+username+"' and password='"+password+"'");
				
				if(rs.next())
				{
					new Project().setVisible(true);
					this.setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid Login");
				}
			}
			catch(Exception e) {};
		}
		else if(ae.getSource()==b2)
		{
			System.exit(0);
		}
	}
	
}

package universityManagementSystem;

import java.awt.*;

import javax.swing.*;

public class About extends JFrame{
	JLabel l1,l2;
	
	public About()
	{
		super("About");
		setBounds(600,250,500,300);
		setLayout(null);
		
		l1=new JLabel("UNIVERSITY MANAGEMENT SYSTEM");
		l1.setBounds(50,50,400,100);
		l1.setFont(new Font("serif",Font.BOLD,20));
		l1.setForeground(Color.red);
		this.add(l1);
		
		l2=new JLabel("Created By Abhishek Kumar");
		l2.setBounds(150,190,300,80);
		this.add(l2);
	
	}
	
}

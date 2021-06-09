package universityManagementSystem;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
import java.sql.*;


public class StudentDetail extends JFrame implements ActionListener{
	JTable table;
	JLabel l1,l2,l3;
	JButton b1,b2,b3;
	JTextField t;
	

	String h[]= {"Name","Father's name","Age","DOB","Address","Phone","Email","10th","12th","Aadhar","Roll No","Course","Branch"};
	String d[][]=new String[50][13];
	
	
	public StudentDetail()
	{
		super("Students Detail");
		setBounds(250,150,1200,600);
		setLayout(null);
		
		try
		{
			String q="select * from student";
			Conn con=new Conn();
			ResultSet rs=con.s.executeQuery(q);
			
			int i=0;
			while(rs.next())
			{
				int j=0;
				d[i][j++]=rs.getString(1);
				d[i][j++]=rs.getString(2);
				d[i][j++]=rs.getString(3);
				d[i][j++]=rs.getString(4);
				d[i][j++]=rs.getString(5);
				d[i][j++]=rs.getString(6);
				d[i][j++]=rs.getString(7);
				d[i][j++]=rs.getString(8);
				d[i][j++]=rs.getString(9);
				d[i][j++]=rs.getString(10);
				d[i][j++]=rs.getString(11);
				d[i][j++]=rs.getString(12);
				d[i][j++]=rs.getString(13);
				i++;
			}
			
			table=new JTable(d,h);
		}
		catch(Exception e) {};
		
		
		JScrollPane sp=new JScrollPane(table);
		
		sp.setBounds(10,10,1160,300);
		add(sp);
		
		getContentPane().setBackground(Color.white);
		
		
		l1=new JLabel("Enter Roll To Delete Student:");
		l1.setBounds(10,320,200,25);
		add(l1);
		
		t=new JTextField();
		t.setBounds(230,320,400,25);
		add(t);
		
		b1=new JButton("Delete");
		b1.addActionListener(this);
		b1.setBounds(650,320,200,25);
		add(b1);
		
		b2=new JButton("Add Student");
		b3=new JButton("Update Student");
		b2.setBounds(10,400,200,50);
		b3.setBounds(10,470,200,50);
		b2.addActionListener(this);
		b3.addActionListener(this);
		add(b2);
		add(b3);
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String roll=t.getText();
			String q="delete from student where rollno='"+roll+"'";
			
			System.out.println(q);
			
			try
			{
				Conn con =new Conn();
				int ra=con.s.executeUpdate(q);
				
				System.out.println(ra);
				
				if(ra==0)
					JOptionPane.showMessageDialog(null,"Does Not Exist");
				else
				{
					JOptionPane.showMessageDialog(null,"Deleted");
					this.setVisible(false);
					new StudentDetail().setVisible(true);
				}
				
				
			}
			catch(Exception e) {
				System.out.println(e);
			};
		}
		else if(ae.getSource()==b2)
		{
			this.setVisible(false);
			new AddStudent().f.setVisible(true);
		}
		else if(ae.getSource()==b3) {
			this.setVisible(false);
		}
	}

}

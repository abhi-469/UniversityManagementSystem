package universityManagementSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class StudentAttendance extends JFrame implements ActionListener {
	private JPanel contentPane;
	private JLabel l1,l2,l3;
	private JButton b1,b2;
	private Choice roll,fh,sh;
	
	
	
	public StudentAttendance()
	{
		super("Student Attendance");
		setBounds(350,200,300,400);
		contentPane=new JPanel();
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		l1=new JLabel("Roll Number");
		l2=new JLabel("First Half");
		l3=new JLabel("Second half");
		
		l1.setBounds(40,50,80,20);
		l2.setBounds(40,120,80,20);
		l3.setBounds(40,190,80,20);
		contentPane.add(l1);
		contentPane.add(l2);
		contentPane.add(l3);
		
		roll= new Choice();
		roll.setBounds(140,50,120,20);
		try
		{
			Conn con=new Conn();
			ResultSet rs=con.s.executeQuery("select * from student");
			while(rs.next())
			{
				roll.add(rs.getString("rollno"));
			}
		}
		catch(Exception e)
		{
			
		}
		contentPane.add(roll);
		
		fh= new Choice();
		fh.setBounds(140,120,120,20);
		fh.add("Present");
		fh.add("Absent");
		contentPane.add(fh);
		
		sh= new Choice();
		sh.setBounds(140,190,120,20);
		sh.add("Present");
		sh.add("Absent");
		contentPane.add(sh);
		
		
		b1=new JButton("Submit");
		b1.setBounds(40,260,80,30);
		b1.addActionListener(this);
		contentPane.add(b1);
		
		b2=new JButton("Cancel");
		b2.setBounds(155,260,80,30);
		b2.addActionListener(this);
		contentPane.add(b2);
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand()=="Submit")
		{
			String r=roll.getSelectedItem();
			String f=fh.getSelectedItem();
			String s=sh.getSelectedItem();
			String d=new java.util.Date().toString();
			
			
			Conn con=new Conn();
			String query="insert into attendance_student values('"+r+"','"+d+"','"+f+"','"+s+"')";
			System.out.print(query);
			try
			{
				con.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null,"Attendance Confirmed");
			}
			catch(Exception e) {};
		}
		else if(ae.getActionCommand()=="Cancel")
		{
			this.setVisible(false);
		}
			
	}
}

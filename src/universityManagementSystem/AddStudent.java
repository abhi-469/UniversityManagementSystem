package universityManagementSystem;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class AddStudent   implements ActionListener{
	JFrame f;
	JLabel id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id13,id14,id15,id16,id17,lab1,lab2,lab3;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
	JButton b1,b2;
	JComboBox c1,c2;
	
	
	Random ran=new Random();
	long first4=(ran.nextLong() % 9000L)+1000L;
	long first=Math.abs(first4);
	
	
	
	public AddStudent()
	{
		f=new JFrame("Add Students");
		f.setBackground(Color.white);
		f.setLocation(400,100);
		f.setLayout(null);
		f.setSize(900,700);
		
		
		id15=new JLabel();
		id15.setBounds(0,0,900,700);
		f.add(id15);
		
		
		id8=new JLabel("New Student Details");
		id8.setFont(new Font("serif",Font.BOLD,35));
		id8.setBounds(300,30,500,50);
		id8.setForeground(Color.black);
		id15.add(id8);
		
		
		id1 = new JLabel("Name");
        id1.setBounds(50,150,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(200,150,150,30);
        id15.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(400,150,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(600,150,150,30);
        id15.add(t2);

        id3= new JLabel("Age");
        id3.setBounds(50,200,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(200,200,150,30);
        id15.add(t3);

        id4= new JLabel("DOB (dd/mm/yyyy)");  
        id4.setBounds(400,200,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(600,200,150,30);
        id15.add(t4);

        id5= new JLabel("Address");
        id5.setBounds(50,250,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id5);

        t5=new JTextField();
        t5.setBounds(200,250,150,30);
        id15.add(t5);

        id6= new JLabel("Phone");
        id6.setBounds(400,250,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id6);

        t6=new JTextField();
        t6.setBounds(600,250,150,30);
        id15.add(t6);

        id7= new JLabel("Email Id");
        id7.setBounds(50,300,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id7);

        t7=new JTextField();
        t7.setBounds(200,300,150,30);
        id15.add(t7);

        id9= new JLabel("Class X(%)");
        id9.setBounds(400,300,130,30);
        id9.setFont(new Font("serif",Font.BOLD,20));    
        id15.add(id9);

        t8=new JTextField();
        t8.setBounds(600,300,150,30);
        id15.add(t8);

        id10= new JLabel("Class XII(%)");
        id10.setBounds(50,350,130,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id10);

        t9=new JTextField();
        t9.setBounds(200,350,150,30);
        id15.add(t9);


        id11= new JLabel("Aadhar No");
        id11.setBounds(400,350,100,30);
        id11.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id11);

        t10=new JTextField();
        t10.setBounds(600,350,150,30);
        id15.add(t10);

        id12= new JLabel("Roll No");
        id12.setBounds(50,400,150,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id12);

        t11=new JTextField();   
        t11.setBounds(200,400,150,30);
        t11.setText("1533"+first);
        id15.add(t11);
        
        lab1=new JLabel("Course");
        lab1.setBounds(400,400,150,30);
        lab1.setFont(new Font("serif",Font.BOLD,20));
        id15.add(lab1);

        String course[] = {"B.Tech","BBA","BCA","Bsc","Msc","MBA","MCA","BA","BCom"};
        c1 = new JComboBox(course);
        c1.setBackground(Color.WHITE);
        c1.setBounds(600,400,150,30);
        id15.add(c1);

        lab2=new JLabel("Branch");
        lab2.setBounds(50,450,150,30);
        lab2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(lab2);

        String branch[] = {"Computer Science","Electronics","Electrical","Mechanical","Civil"};
        c2 = new JComboBox(branch);
        c2.setBackground(Color.WHITE);
        c2.setBounds(200,450,150,30);
        id15.add(c2);

        b1 = new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(250,550,150,40);
        b1.addActionListener(this);
        id15.add(b1);

        b2=new JButton("Cancel");   
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(450,550,150,40);
        b2.addActionListener(this);
        id15.add(b2);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String name=t1.getText();
			String fname=t2.getText();
			String age=t3.getText();
			String dob=t4.getText();
			String address=t5.getText();
			String phone=t6.getText();
			String email=t7.getText();
			String class10=t8.getText();
			String class12=t9.getText();
			String aadhar=t10.getText();
			String roll=t11.getText();
			String course=(String)c1.getSelectedItem();
			String branch=(String)c2.getSelectedItem();
			
			String query="insert into student values('"+name+"','"+fname+"','"+age+"','"+dob+"','"+address+"','"+phone+"','"+email+"','"+class10+"','"+class12+"','"+aadhar+"','"+roll+"','"+course+"','"+branch+"')";
			try
			{
				Conn c=new Conn();
				c.s.executeUpdate(query);
				
				JOptionPane.showMessageDialog(null,"Succesfully Added");
				f.setVisible(false);
				
			}
			catch(Exception e) {
				System.out.println(e);
			};
		}
		else if(ae.getSource()==b2)
		{
			f.setVisible(false);
		}
	}
	
}

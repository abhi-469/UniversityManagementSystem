package universityManagementSystem;


import javax.swing.*;
import java.sql.*;


public class StudentAttendanceDetail extends JFrame {
	JTable table;
	JButton b;
	
	String h[]= {"Roll Number","Date&Time","First Half","Second Half"};
	String d[][]=new String[50][4];
	
	
	public StudentAttendanceDetail()
	{
		super("Student Attendance Detail");
		setBounds(450,150,800,300);
		
		try
		{
			String q="select * from attendance_student";
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
				i++;
			}
			
			table=new JTable(d,h);
		}
		catch(Exception e) {};
		
		
		JScrollPane scrollPane=new JScrollPane(table);
		add(scrollPane);
		
	}
	
}

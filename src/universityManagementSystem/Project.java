package universityManagementSystem;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Project extends JFrame implements ActionListener{
	
	Project()
	{
		super("University Management system");
		setSize(1920,1030);
		
		
		
		JMenuBar mb=new JMenuBar();
		
		JMenu master=new JMenu("Master");
		JMenuItem m1=new JMenuItem("New Student Addmission");
		JMenuItem m2=new JMenuItem("New Faculty");
		master.setForeground(Color.blue);
		
		m1.setBackground(Color.white);
		m1.addActionListener(this);
		m2.setBackground(Color.white);
		m2.addActionListener(this);
		
		master.add(m1);
		master.add(m2);
		mb.add(master);
		
		
		
		JMenu details=new JMenu("Details");
		JMenuItem d1=new JMenuItem("Student Detail");
		JMenuItem d2=new JMenuItem("Faculty Detail");
		details.setForeground(Color.blue);
		
		d1.setBackground(Color.white);
		d1.addActionListener(this);
		d2.setBackground(Color.white);
		d2.addActionListener(this);
		
		details.add(d1);
		details.add(d2);
		mb.add(details);
		
		
		
		
		JMenu attendance=new JMenu("Attendance");
		JMenuItem a1=new JMenuItem("Student Attendance");
		JMenuItem a2=new JMenuItem("Faculty Attendance");
		attendance.setForeground(Color.blue);
		
		a1.setBackground(Color.white);
		a1.addActionListener(this);
		a2.setBackground(Color.white);
		a2.addActionListener(this);
		
		attendance.add(a1);
		attendance.add(a2);
		mb.add(attendance);
		
		JMenu attendanceDetails=new JMenu("Attendance Details");
		JMenuItem ad1=new JMenuItem("Student Attendance Details");
		JMenuItem ad2=new JMenuItem("Faculty Attendance Details");
		attendanceDetails.setForeground(Color.blue);
		
		ad1.setBackground(Color.white);
		ad1.addActionListener(this);
		ad2.setBackground(Color.white);
		ad2.addActionListener(this);
		
		attendanceDetails.add(ad1);
		attendanceDetails.add(ad2);
		mb.add(attendanceDetails);
		
		
		JMenu exam=new JMenu("Exam");
		JMenuItem e1=new JMenuItem("Exam Details");
		JMenuItem e2=new JMenuItem("Marks");
		exam.setForeground(Color.blue);
		
		e1.setBackground(Color.white);
		e1.addActionListener(this);
		e2.setBackground(Color.white);
		e2.addActionListener(this);
		
		exam.add(e1);
		exam.add(e2);
		mb.add(exam);
		
		
		JMenu update=new JMenu("Update Details");
		JMenuItem u1=new JMenuItem("Update Student Details");
		JMenuItem u2=new JMenuItem("Update Faculty Details");
		update.setForeground(Color.blue);
		
		u1.setBackground(Color.white);
		u1.addActionListener(this);
		u2.setBackground(Color.white);
		u2.addActionListener(this);
		
		update.add(u1);
		update.add(u2);
		mb.add(update);
		
		JMenu fee=new JMenu("Fee Detail");
		JMenuItem f1=new JMenuItem("Fee Structure");
		JMenuItem f2=new JMenuItem("Student Fee Form");
		fee.setForeground(Color.blue);
		
		f1.setBackground(Color.white);
		f1.addActionListener(this);
		f2.setBackground(Color.white);
		f2.addActionListener(this);
		
		fee.add(f1);
		fee.add(f2);
		mb.add(attendance);
		
		JMenu about=new JMenu("About");
		JMenuItem ab=new JMenuItem("About Us");
		about.setForeground(Color.blue);
		
		ab.setBackground(Color.white);
		ab.addActionListener(this);
		
		
		about.add(ab);
		mb.add(about);
		
		
		
		
		setJMenuBar(mb);
		setLayout(new FlowLayout());
		setVisible(false);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String msg=ae.getActionCommand();
		
		if(msg.equals("New Student Addmission"))
		{
			new AddStudent().f.setVisible(true);
		}
		else if(msg.equals("New Faculty"))
		{
			new AddFaculty().f.setVisible(true);
		}
		else if(msg.equals("Student Detail"))
		{
			new StudentDetail().setVisible(true);
		}
		else if(msg.equals("Faculty Detail"))
		{
			new FacultyDetail().setVisible(true);
		}
		else if(msg.equals("Student Attendance"))
		{
			new StudentAttendance().setVisible(true);
		}
		else if(msg.equals("Faculty Attendance"))
		{
			new FacultyAttendance().setVisible(true);
		}
		else if(msg.equals("Student Attendance Details"))
		{
			new StudentAttendanceDetail().setVisible(true);
		}
		else if(msg.equals("Faculty Attendance Details"))
		{
			new FacultyAttendanceDetail().setVisible(true);
		}
		else if(msg.equals("Exam Details"))
		{
			new ExaminationDetails().setVisible(true);
		}
		else if(msg.equals("Marks"))
		{
			new EnterMarks().setVisible(true);
		}
		else if(msg.equals("Update Student Details"))
		{
			new UpdateStudent().f.setVisible(true);
		}
		else if(msg.equals("Update Faculty Details"))
		{
			new UpdateFaculty().f.setVisible(true);
		}
		else if(msg.equals("About Us"))
		{
			new About().setVisible(true);
		}
		
		
	}
	
}

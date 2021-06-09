package universityManagementSystem;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;


public class ExaminationDetails extends JFrame implements ActionListener {
	private JPanel contentPane;
	private JTextField search;
	private JButton b;
	private JTable table;
	
	public ExaminationDetails()
	{
		super("Examination Details");
		setBounds(350,200,930,475);
		contentPane=new JPanel();
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane=new JScrollPane();
		scrollPane.setBounds(79,133,800,202);
		contentPane.add(scrollPane);
		
		table=new JTable();
		table.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent me)
			{
				int row=table.getSelectedRow();
				search.setText(table.getModel().getValueAt(row, 10).toString());
			}
			
		});
		
		table.setBackground(new Color(240,240,255));
		table.setForeground(Color.DARK_GRAY);
		scrollPane.setViewportView(table);
		
		b=new JButton("Search");
		b.setBackground(Color.pink);
		b.setForeground(Color.white);
		b.setBounds(450, 89, 130, 33);
		contentPane.add(b);
		
		search=new JTextField();
		search.setBounds(79,89,357,33);
		contentPane.add(search);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		
		

	}

}

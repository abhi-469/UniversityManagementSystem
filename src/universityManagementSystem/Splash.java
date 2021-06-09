package universityManagementSystem;
import java.awt.*;
import javax.swing.*;


public class Splash {
	public static void main(String[] args)
	{
		Frame f=new Frame();
	}
}

class Frame extends JFrame implements Runnable
{
	Thread t1;
	Frame()
	{
		
		
		super("University Management System");
		
		
		
		this.setVisible(true);
		this.setLocation(400,100);
		this.setSize(800,500);
		setLayout(null);
		
		JLabel jl=new JLabel("Starting....");
		jl.setBounds(300,100,200,100);
		jl.setFont(new Font("serif",Font.BOLD,40));
		jl.setForeground(Color.red);
		this.add(jl);
		
//		ImageIcon c1=new ImageIcon(ClassLoader.getSystemResource("first.jpg"));
//	    Image i1=c1.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
//		ImageIcon i2=new ImageIcon(i1);
//		
//		JLabel m1=new JLabel(i2);
//		add(m1);
		
		t1=new Thread(this);
		t1.start();
	}
	
	public void run()
	{
		try
		{
			Thread.sleep(3000);
			this.setVisible(false);
			Login l1=new Login();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

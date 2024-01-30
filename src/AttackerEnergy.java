import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import javax.swing.*;


public class AttackerEnergy extends JFrame implements ActionListener
{
	JPanel p1;
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JTextArea ta;
	JScrollPane pane;
	JButton b1,b2;
	String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";
	
	JComboBox c1,c2;
	
	public Font f1 = new Font("Times new roman", Font.BOLD, 25);
	public Font f2 = new Font("Times new roman", Font.BOLD, 15);
	
	AttackerEnergy()
	{
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBackground(Color.red);
		setTitle("Energy Attacker ::An Efficient Privacy Preserving Message Authentication Scheme for Internet of Things");
		
         ImageIcon banner = new ImageIcon(this.getClass().getResource("Attacker8.gif"));
		 JLabel title = new JLabel();
		 title.setIcon(banner);
		 title.setBounds(100, 0,250,200);
		
		
		l1=new JLabel("Select Cluster :");
		l1.setFont(f2);
		l1.setForeground(Color.white);
		l1.setBounds(90,100,110,30);
		
		
		l2=new JLabel("Select Node");
		l2.setFont(f2);
		l2.setForeground(Color.white);
		l2.setBounds(90,150,100,30);
		
		l3=new JLabel("Energy ");
		l3.setFont(f2);
		l3.setForeground(Color.white);
		l3.setBounds(90,200,100,30);
		
		t1=new JTextField();
		t1.setBounds(210,200,100,25);
		//t2=new JTextField();
	//	t2.setBounds(160,150,100,25);
		
		c1=new JComboBox();
		c1.addItem("CHOOSE");
		c1.addItem("Cluster1");
		c1.addItem("Cluster2");
		c1.addItem("Cluster3");
		c1.addItem("Cluster4");
		c1.setBounds(210,100,100,25);
		
		c2=new JComboBox();
		c2.addItem("Node9");
		c2.addItem("Node10");
		c2.addItem("Node11");
		c2.addItem("Node12");
		c2.addItem("Node13");
		
		c1.addActionListener(this);
		
		c2.setBounds(210,150,100,25);
		
		b1=new JButton("Get Energy");
		b1.setBounds(100,335,100,25);
		
		b2=new JButton("Modify");
		b2.setBounds(210,335,100,25);
		
		
	
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
	
//		p1.add(l1);
		p1.add(l2);
//		p1.add(c1);
		p1.add(t1);p1.add(b1);p1.add(l3);p1.add(c2);
		p1.add(b2);
		p1.add(title);
		add(p1);
		setSize(410,460);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) 
	{
		new AttackerEnergy();
		
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}catch(Exception es){System.out.println(es);}
		
	}
	
	
	public void actionPerformed(ActionEvent a1) 
	{
		
		if(a1.getSource()==c2)
		{
			
		}
		if(a1.getSource()==b1)
		{
//			String cluster=(c1.getSelectedItem()).toString();
			String node=(c2.getSelectedItem()).toString();
		
			
			try
			{
				
					Socket s1=new Socket("localhost",4445);
					DataOutputStream dos5=new DataOutputStream(s1.getOutputStream());
//					dos5.writeUTF(cluster);
					dos5.writeUTF(node);
				
					DataInputStream in5=new DataInputStream(s1.getInputStream());
					String msg=in5.readUTF();
					String ene=in5.readUTF();
					System.out.println(msg);
					t1.setText(ene);
					
					
				
			}catch(Exception es){System.out.println(es);}
		}
		
		if(a1.getSource()==b2)
		{
			String node=(c2.getSelectedItem()).toString();
			String mem=t1.getText();
			
			
			try
			{
				
				InetAddress ia = InetAddress.getLocalHost();
				String ip1 = ia.getHostAddress();
				
				Socket s1=new Socket("localhost",4444);
				DataOutputStream dos5=new DataOutputStream(s1.getOutputStream());
				dos5.writeUTF(node);
				dos5.writeUTF(mem);
				dos5.writeUTF(ip1);
				
				DataInputStream in5=new DataInputStream(s1.getInputStream());
				String msg=in5.readUTF();
				
				if(msg.equalsIgnoreCase("attack"))
				{
					JOptionPane.showMessageDialog(null,"Successfully Attacked");
				}
				if(msg.equalsIgnoreCase("block"))
				{
					JOptionPane.showMessageDialog(null,"You Are Blocked");
				}
					
					
				
					
				
			}catch(Exception es){System.out.println(es);}
		}
		
		
	}
	

}

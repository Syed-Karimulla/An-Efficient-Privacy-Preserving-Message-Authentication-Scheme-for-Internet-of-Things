import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.sql.Connection;
import javax.swing.*;


public class MalaciousAttacker extends JFrame implements ActionListener
{
	JPanel p1;
	JLabel l1,l2,l3;
//	JTextField t1;
	JTextArea t1;
	JScrollPane pane;
	JButton b1,b2;
	String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";
	
	JComboBox c1,n;
	JTextField c2;
	
	public Font f1 = new Font("Times new roman", Font.BOLD, 25);
	public Font f2 = new Font("Times new roman", Font.BOLD, 15);
	
	MalaciousAttacker()
	{
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBackground(Color.WHITE);
		
		setTitle("Malacious Attacker :: An Efficient Privacy Preserving Message Authentication Scheme for Internet of Things");
		
		l1=new JLabel("Select Node");
		l1.setFont(f2);
		l1.setForeground(Color.RED);
		l1.setBounds(80,180,110,30);
		
		l2=new JLabel("Select Packet");
		l2.setFont(f2);
		l2.setForeground(Color.RED);
		l2.setBounds(80,170,100,30);
		
		l3=new JLabel("Malicious Data ");
		l3.setFont(f2);
		l3.setForeground(Color.RED);
		l3.setBounds(80,230,120,30);
		
		t1=new JTextArea();
		t1.setBounds(210,240,250,260);
		t1.setBackground(Color.RED);
		t1.setForeground(Color.WHITE);
		
//		c1.setBounds(210,100,100,25);
		
		c2=new JTextField();
		
		 ImageIcon banner = new ImageIcon(this.getClass().getResource("Attacker5.gif"));
		 JLabel title = new JLabel();
		 title.setIcon(banner);
		 title.setBounds(300, 0,250,200);
		
		c2.setBounds(210,150,100,25);
		
		b1=new JButton("Get Energy");
		b1.setBounds(100,335,100,25);
		
		b2=new JButton("Attack");
		b2.setBounds(190,555,200,35);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		n=new JComboBox();
		n.addItem("PACKET1");
		n.addItem("PACKET2");
		n.addItem("PACKET3");
		n.addItem("PACKET4");
		n.addItem("PACKET5");
		
		n.setBounds(210,170,100,30);
		n.addActionListener(this);
		
		c1=new JComboBox();
		c1.addItem("Node9");
		c1.addItem("Node10");
		c1.addItem("Node11");
		c1.addItem("Node12");
		c1.addItem("Node13");
		
		
		c1.setBounds(210,180,100,30);
		c1.addActionListener(this);
		
		p1.add(l1);
		p1.add(t1);
		p1.add(l3);
		p1.add(c1);
		p1.add(b2);
		p1.add(title);
		add(p1);
		setSize(610,660);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) 
	{
		new MalaciousAttacker();
		
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch(Exception es){System.out.println(es);}
		
	}
	
	
	public void actionPerformed(ActionEvent a1) 
	{
		if(a1.getSource()==b2)
		{
			try
			{
				InetAddress ia = InetAddress.getLocalHost();
				String ip1 = ia.getHostAddress();
				String node=(c1.getSelectedItem()).toString();
				String packet=(n.getSelectedItem()).toString();
				
				String file="attack";
				PrintStream out = new PrintStream(new FileOutputStream("Attacker\\"+file+".txt"));
			    out.print(t1.getText());
				out.close();
				
				MessageDigest md = MessageDigest.getInstance("SHA1");
				FileInputStream in1 = new FileInputStream("Attacker\\" + file+".txt");
				DigestInputStream dis2 = new DigestInputStream(in1, md);
				BufferedInputStream bd = new BufferedInputStream(dis2);

				while (true) {
					int b2 = bd.read();
					if (b2 == -1)
						break;
				}

				BigInteger bi2 = new BigInteger(md.digest());
				String mac = bi2.toString(16);
				System.out.println("New MAC : "+mac);
				
				Socket s12=new Socket("localhost",1412);
				DataOutputStream dos5=new DataOutputStream(s12.getOutputStream());
				dos5.writeUTF(ip1);
				dos5.writeUTF(node);
				dos5.writeUTF(mac);
				
				DataInputStream in5=new DataInputStream(s12.getInputStream());
				String msg=in5.readUTF();
				
				if(msg.equalsIgnoreCase("attack"))
				{
					JOptionPane.showMessageDialog(null,"Successfully Attacked");
				}
				if(msg.equalsIgnoreCase("block"))
				{
					JOptionPane.showMessageDialog(null,"You Are Blocked");
				}
				if(msg.equalsIgnoreCase("nofile"))
				{
					JOptionPane.showMessageDialog(null,"File Not Found");
				}
					
					
			}catch(Exception es){System.out.println(es);}
		}
	}
}
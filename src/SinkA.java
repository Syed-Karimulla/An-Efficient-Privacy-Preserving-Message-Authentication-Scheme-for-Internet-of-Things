import java.awt.BorderLayout;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;







import java.io.*;
import java.awt.event.*;
import java.sql.*;

public class SinkA extends JFrame implements ActionListener {

	
	Socket socket;
	ServerSocket serverSocket;

	public Font f = new Font("Times new roman", Font.BOLD, 22);
	public Font f1 = new Font("Times new roman", Font.BOLD, 15);
	public Font f2 = new Font("Arial", Font.BOLD, 14);
	public Font f3 = new Font("Times new roman", Font.BOLD, 18);
	
	public JTextArea tf = new JTextArea();
	public JScrollPane pane = new JScrollPane();
	
	ImageIcon ic;
	JLabel l5;
	JButton b1;
	public JFrame jf;
	public Container c;
	FileOutputStream fout;
	String fname, tot;
	String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";
	String data;
	SinkA() {
		//	ImageIcon img1 = new ImageIcon(this.getClass().getResource("Node.png"));
        

		jf = new JFrame("Sink A::An Efficient Privacy Preserving Message Authentication Scheme for Internet of Things");
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setSize(600,600);
		jf.setResizable(false);
		c.setBackground(Color.white);
	
		b1 = new JButton("SAVE");
		b1.setBounds(250, 520, 100, 30);
		c.add(b1);
		b1.addActionListener(this);
		
		Border b11=BorderFactory.createLineBorder(Color.red,2);
		
		
		TitledBorder b22=new TitledBorder(b11);
		b22.setTitle("File Receiving");
		b22.setTitleColor(Color.black);
		b22.setTitleFont(f2);
		JLabel bord =new JLabel();
		bord.setBorder(b22);
		bord.setBackground(Color.red);
		bord.setBounds(80, 110, 440, 310);
		c.add(bord);
	
		
		pane.setBounds(100, 130, 410, 280);

		tf.setColumns(20);

		tf.setForeground(Color.MAGENTA);
		tf.setFont(f1);
		tf.setRows(10);
		
		tf.setEditable(false);
	
		pane.setViewportView(tf);
		
		 ic=new ImageIcon(this.getClass().getResource("Enduser2.png"));
			
			l5=new JLabel();
			l5.setIcon(ic);
			l5.setBounds(-10, 0, 600,600);
		
		jf.setVisible(true);
		
		c.add(pane, BorderLayout.CENTER);
		c.add(l5);
		
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent win) {
				System.exit(0);
			}
		});
		
		int[] ports = new int[] {9991,9996};
		for(int i=0;i<2;i++)
		{
			Thread th = new Thread(new PortListener(ports[i]));
			th.start();
		}
		
	
	}
	
	class PortListener implements Runnable
	{
		
		int port;
		
		public PortListener(int port)
		{
			this.port=port;
		}
		
		public void run()
		{
			if(this.port==9991)
			{
				try {
						
	
					ServerSocket serverSocket = new ServerSocket(9991);
					System.out.println("i am Receiver & listening...");

					while (true) {
						socket = serverSocket.accept();
						DataInputStream dis = new DataInputStream(socket.getInputStream());
						String fname =dis.readUTF();
						String da = dis.readUTF();
						String delay=dis.readUTF();
						String path=dis.readUTF();
						String dt=dis.readUTF();
						
						
						AES a = new AES();
						data =a.decrypt(da, keyWord);
			   		    tf.setText(data);
			   		    
			   		    String dest="A";
			   		    
			   		 Class.forName("com.mysql.jdbc.Driver");
			 		
			 		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proj18","root","root");
			   		
						Statement fin2=con.createStatement();
						long tpt=((Long.valueOf(delay))/data.length())*1000;
			            long roverhead=(data.length()/16)*100;
						
			            String sin2="insert into timedelay values('"+fname+"','"+dest+"','"+dt+"','"+delay+"','"+path+"','"+tpt+"','"+roverhead+"')";
						fin2.executeUpdate(sin2); 
						
				
						System.out.println("Fname="+fname);
						System.out.println("Table Delay Updated"+delay);
						System.out.println("Dest"+dest);
						System.out.println("DT"+dt);
						System.out.println("Table Delay Updated"+path);
			   		    
			   		    
			   		    
			   		    DataOutputStream d=new DataOutputStream(socket.getOutputStream());
						d.writeUTF("success");
						
						JOptionPane.showMessageDialog(null,"ROUTING PATH=="+path );
						JOptionPane.showMessageDialog(null,"Routing Delay=="+delay );
						JOptionPane.showMessageDialog(null,"Routing Throughput=="+tpt );
						JOptionPane.showMessageDialog(null,"Routing Overhead=="+roverhead );
						
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(this.port==9996)
			{
				try {
						
	
					ServerSocket serverSocket = new ServerSocket(9996);
					System.out.println("i am Receiver & listening...");

					while (true) {
						socket = serverSocket.accept();
						DataInputStream dis = new DataInputStream(socket.getInputStream());
						fname =dis.readUTF();
						String da = dis.readUTF();
						
						AES a = new AES();
						data =a.decrypt(da, keyWord);
			   		    tf.setText(data);
			   		    
			   		    DataOutputStream d=new DataOutputStream(socket.getOutputStream());
						d.writeUTF("success");
						
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String args[]) {
		//new NodeA();
		
				new SinkA();
		
	}

	public void actionPerformed(ActionEvent a1) 
	{
		if(a1.getSource()==b1)
		{
			
			try
			{
				PrintStream out1 = null;
				try {
				    out1= new PrintStream(new FileOutputStream("NodeA\\"+fname));
				    out1.print(data);
				}
				finally {
				    if (out1 != null) out1.close();
				}
				
				JOptionPane.showMessageDialog(null,"File Stored Successfully");
				tf.setText("");
			}catch(Exception es){System.out.println(es);}
		}
		
		
		
		
	}
	

}



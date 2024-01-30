import java.awt.BorderLayout;
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
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

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
import java.io.BufferedReader;

public class IOT_Device_Source implements ActionListener
{		
	byte[] b;
	String dd;
	String txtstr=null;
	String hash;
	String filename;
	String content,path1;
	ImageIcon ic;

	public JLabel T0= new JLabel();

	public JLabel confirm=new JLabel();
	public JLabel T2= new JLabel("File Name");
	public JLabel T4= new JLabel();
	
	
	public JButton btn = new JButton("Browse");
	public JTextArea tf = new JTextArea();
	public JScrollPane pane = new JScrollPane();
	public JButton btn1 = new JButton("Open");
	public JButton btn2 = new JButton("Initialise Nodes");
	public JButton btn3 = new JButton("Send");
	public JButton btn4 = new JButton("Recover");
	
	public JTextField txt=new JTextField();
	public JTextField txt1=new JTextField();
	public JTextField txt2=new JTextField();
	 
	public JLabel  leftButton,l5;
		
	JLabel back= new JLabel();
	public JFrame jf;
	public Container c;
	String event;
	String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";

	String send,event1,event2;
	
	//ImageIcon greengr = new ImageIcon(this.getClass().getResource("sp.png"));
	IOT_Device_Source()
	{	
		
		jf = new JFrame("IOT Device Source::An Efficient Privacy Preserving Message Authentication Scheme for Internet of Things");
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setSize(900,600);
	//	jf.setResizable(false);  
		c.setBackground(Color.white);
		
		ic=new ImageIcon(this.getClass().getResource("OwnerBack.png"));
		l5=new JLabel();
		l5.setIcon(ic);
		l5.setBounds(60, 50, 815,510);
	   
	    T0.setForeground(Color.CYAN);
		T2.setBounds(350, 110, 250,45);

		T2.setForeground(Color.blue);
		
		txt1.setBounds(450, 120, 300,25);
		txt1.setForeground(Color.MAGENTA);

		T4.setBounds(225, 540, 250,45);

		T4.setForeground(Color.RED);
		
		txt2.setBounds(220, 595, 250,30);
		txt2.setForeground(Color.BLUE);

	    confirm.setBounds(445, 520, 250,45);
	    
	    confirm.setForeground(new Color(255,0,0));

		btn.setBounds(130,150,120,30);
		btn2.setBounds(130,250,120,30);
		btn3.setBounds(130, 350,120,30);
		btn4.setBounds(130, 450,120,30);
		
	//	btn.setFont(f3);
		
		btn1.setBounds(420,198,70,25);
		
		txt.setBounds(260,150,180,25);
		txt.setForeground(Color.BLUE);
		
		pane.setBounds(350, 150, 400, 250);
		
		tf.setColumns(20);
		
		tf.setForeground(Color.MAGENTA);

		tf.setRows(10);
		tf.setName("tf");
		pane.setName("pane");
		pane.setViewportView(tf);
		
		btn1.addActionListener(this);
		btn.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		txt2.setEnabled(false);
		
		jf.show();
	 	
	 	c.add(txt1);
	 
		c.add(btn);
		c.add(btn2);
		c.add(confirm);
		c.add(T2);
		//c.add(T3);
		c.add(T4);
		//c.add(T5);
		c.add(pane, BorderLayout.CENTER);
		c.add(btn1);
		c.add(T0);
		
		c.add(btn3);
//		c.add(btn4);
		c.add(l5);
		
		
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent win) {
				System.exit(0);
			}
		});
		
	
		
	}		

		public void actionPerformed(ActionEvent e) {
		
			String dataname="";
		    	DataInputStream input;

		    	BufferedInputStream bis;
		    	BufferedOutputStream bos = null;
		    	BufferedWriter writer = null;
		    	int in;
		    	StringBuffer buffer = new StringBuffer();
		    			    			 
			    String strLine = null;
			    String newline = "\n";
			    if (e.getSource() == btn4) {
			    	
			    	try{
			    		
			    		String ip = JOptionPane.showInputDialog(null,"Please Enter the IP Address Of Router");
			    		
			    		Socket s = new Socket(ip,1111);
			    		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			    		dout.writeUTF("file");
			    		
			    		
			    		DataInputStream din = new DataInputStream(s.getInputStream());
			    		String msg = din.readUTF();
			    		
			    		if(msg.equalsIgnoreCase("nofile"))
			    		{
			    			JOptionPane.showMessageDialog(null, "Dropped Packets Not Found");
			    		}
			    		else
			    		{
	            			JOptionPane.showMessageDialog(null, "Recovered Successfully");
			    		}
			    		
			    	}catch (Exception e7) {
						// TODO: handle exception
					}
			    }
			    if (e.getSource() == btn) {
			    	String strLine1 = null;
				
					
					JFileChooser chooser = new JFileChooser();

						try {

							File f = new File(new File("filename.txt").getCanonicalPath());

							chooser.setSelectedFile(f);
						} catch (IOException e1) {
						}

						chooser.showOpenDialog(btn3);
						int retval = chooser.showOpenDialog(btn1);
						if (retval == JFileChooser.APPROVE_OPTION) {
							File field = chooser.getSelectedFile();
							 path1=field.getAbsolutePath();
							 
						}

						File curFile = chooser.getSelectedFile();
						String f = curFile.getName();
						txt1.setText(f);

						try {

							FileInputStream fstream = new FileInputStream(curFile);

							DataInputStream ins = new DataInputStream(fstream);
							BufferedReader br = new BufferedReader(new InputStreamReader(
									ins));

							StringBuffer buffer1 = new StringBuffer();
							while ((strLine1 = br.readLine()) != null) {

								System.out.println(strLine1);
								buffer1.append(strLine1 + "\n");

							}
							tf.setText(buffer1.toString());
							System.out.println(buffer1.length());
						} catch (Exception e1) {
							System.err.println("Error: " + e1.getMessage());
						}
					
				}
			    
			 if(e.getSource()== btn3)
			 {
					try {
						
						if(!(txt1.equals(null)&&tf.equals(null)))
						 {
							
						String[] dsname = { "Select Sink", "A", "B", "C", "D", "E" };
						
						 dataname = (String) JOptionPane.showInputDialog(null,"Select Sink", "Sink Name",
								JOptionPane.QUESTION_MESSAGE, null,  dsname,  dsname[0]);
						String ip = JOptionPane.showInputDialog(null,"Please Enter the IP Address Of Router");
						
						String dest = JOptionPane.showInputDialog(null,
								"Please Enter the IP Address Of "+dataname);
						AES a1=new AES();
						
						String cont=tf.getText();
						String fname = txt1.getText();
						String content=a1.encrypt(cont,keyWord);
						
						PrintStream out = null;
						try {
						    out = new PrintStream(new FileOutputStream("Sender\\"+fname));
						    out.print(content);
						}
						finally {
						    if (out != null) out.close();
						}
						MessageDigest md1 = MessageDigest.getInstance("SHA1");
						FileInputStream in11 = new FileInputStream("Sender\\"+ fname);
						DigestInputStream dis21 = new DigestInputStream(in11, md1);
						BufferedInputStream bd1 = new BufferedInputStream(dis21);

						while (true) {
							int b2 = bd1.read();
							if (b2 == -1)
								break;
						}

						BigInteger bi21 = new BigInteger(md1.digest());
						String mac1 = bi21.toString(16);
						System.out.println(mac1);
						SplitFile sp = new SplitFile();
						sp.splitFile(new File("Sender\\"+fname),5, 1024);
						
					
						int len = fname.length();
						String fil = fname.substring(0, len-5);
						MessageDigest md = MessageDigest.getInstance("SHA1");
						FileInputStream fis1 = new FileInputStream("Sender\\"+fil+"1"+".txt");
						byte	 bs1[] = new byte[fis1.available()];
						fis1.read(bs1);
						String split1 = new String(bs1);
						fis1.close();
						
						FileInputStream fis11 = new FileInputStream("Sender\\"+fil+"1"+".txt");
						DigestInputStream dis1 = new DigestInputStream(fis11, md);
						BufferedInputStream bis1 = new BufferedInputStream(dis1);
			 
						while (true) {
							int b1 = bis1.read();
							if (b1 == -1)
								break;
						}
			 
						BigInteger bi1 = new BigInteger(md.digest());
						String spl1 = bi1.toString();
						String	 h1 = bi1.toString(16);
						
						FileInputStream fis2 = new FileInputStream("Sender\\"+fil+"2"+".txt");//C:\java\mtechproject\cloudcomputing\pra1.txt
						byte bs2[] = new byte[fis2.available()];
						fis2.read(bs2);
						String split2 = new String(bs2);
						FileInputStream fis22 = new FileInputStream("Sender\\"+fil+"2"+".txt");
						DigestInputStream dis2 = new DigestInputStream(fis22, md);
						BufferedInputStream bis2 = new BufferedInputStream(dis2);
			 
						while (true) {
							int b2 = bis2.read();
							if (b2 == -1)
								break;
						}
			 
						BigInteger bi2 = new BigInteger(md.digest());
						String  h2 = bi2.toString(16);
						
						FileInputStream fis3 = new FileInputStream("Sender\\"+fil+"3"+".txt");//C:\java\mtechproject\cloudcomputing\pra1.txt
						byte bs3[] = new byte[fis3.available()];
						fis3.read(bs3);
						String split3 = new String(bs3);
						FileInputStream fis33 = new FileInputStream("Sender\\"+fil+"3"+".txt");
						DigestInputStream dis3 = new DigestInputStream(fis33, md);
						BufferedInputStream bis3 = new BufferedInputStream(dis3);
			 
						while (true) {
							int b3 = bis3.read();
							if (b3 == -1)
								break;
						}
			 
						BigInteger bi3 = new BigInteger(md.digest());
					String h3 = bi3.toString(16);
						
						FileInputStream fis4 = new FileInputStream("Sender\\"+fil+"4"+".txt");//C:\java\mtechproject\cloudcomputing\pra1.txt
						byte bs4[] = new byte[fis4.available()];
						fis4.read(bs4);
						String split4 = new String(bs4);
						
						FileInputStream fis44 = new FileInputStream("Sender\\"+fil+"4"+".txt");
						DigestInputStream dis4 = new DigestInputStream(fis44, md);
						BufferedInputStream bis4 = new BufferedInputStream(dis4);
			 
						while (true) {
							int b4 = bis4.read();
							if (b4 == -1)
								break;
						}
			 
						BigInteger bi4 = new BigInteger(md.digest());
						String	 h4 = bi4.toString(16);
						
						
						
						FileInputStream fis5 = new FileInputStream("Sender\\"+fil+"5"+".txt");//C:\java\mtechproject\cloudcomputing\pra1.txt
						byte bs5[] = new byte[fis5.available()];
						fis5.read(bs5);
						String split5 = new String(bs5);
						
						FileInputStream fis55 = new FileInputStream("Sender\\"+fil+"5"+".txt");
						DigestInputStream dis5 = new DigestInputStream(fis55, md);
						BufferedInputStream bis5 = new BufferedInputStream(dis5);
			 
						while (true) {
							int b5 = bis5.read();
							if (b5 == -1)
								break;
						}
			 
						BigInteger bi5 = new BigInteger(md.digest());
						String	h5 = bi5.toString(16);
						
                        Socket sc1 = new Socket(ip,8909);
                        DataOutputStream dout1 = new DataOutputStream(sc1.getOutputStream());
            			dout1.writeUTF(fname);
            			dout1.writeUTF(mac1);
            			dout1.writeUTF(content);
            			dout1.writeUTF(split1);
            			dout1.writeUTF(split2);
            			dout1.writeUTF(split3);
            			dout1.writeUTF(split4);
            			dout1.writeUTF(split5);
            			dout1.writeUTF(dataname);
            			dout1.writeUTF(dest);
            				
            			DataInputStream ins=new DataInputStream(sc1.getInputStream());
            			String msg=ins.readUTF();
     					System.out.println(msg);
     					
     					if(msg.equalsIgnoreCase("success"))
     					{
     						JOptionPane.showMessageDialog(null,"Data Sent Successfully");
     					}
            					 
					}
						else
						 {
							 JOptionPane.showMessageDialog(null,"Browse the File to Send");
						 }
						
					}
						

						catch (UnknownHostException e1) {
						
						e1.printStackTrace();
					} catch (Exception e1) {}
						
					finally {
						
					}
			 
				 	
			 }
			 if(e.getSource()== btn2)
			 {
				
				 try
					{
					 
					 if(!(txt1.equals(null)&&tf.equals(null)))
					 {
						
						AES a1=new AES();
						
						String cont=tf.getText();
						String fname = txt1.getText();
						String content=a1.encrypt(cont,keyWord);
						
						PrintStream out = new PrintStream(new FileOutputStream("Sender\\"+fname));
					    out.print(content);
						out.close();
						
						MessageDigest md = MessageDigest.getInstance("SHA1");
						FileInputStream in1 = new FileInputStream("Sender\\" + fname);
						DigestInputStream dis2 = new DigestInputStream(in1, md);
						BufferedInputStream bd = new BufferedInputStream(dis2);

						while (true) {
							int b2 = bd.read();
							if (b2 == -1)
								break;
						}

						BigInteger bi2 = new BigInteger(md.digest());
						String mac = bi2.toString(16);
						System.out.println(mac);
						

						String ip = JOptionPane.showInputDialog(null,"Enter Router Ip Address");
						
						Socket soc = new Socket(ip,3939);
						DataOutputStream dout = new DataOutputStream(soc.getOutputStream());
						
						dout.writeUTF(mac);
						dout.writeUTF(fname);
						
						DataInputStream dis = new DataInputStream(soc.getInputStream());
						String msg	= dis.readUTF();
						System.out.println(msg);
						JOptionPane.showMessageDialog(null,"Nodes Initialised Successfully");
					}
					 else
					 {
						 JOptionPane.showMessageDialog(null,"Browse the File to Initialise");
					 }
					}
					catch(Exception e1)
					{
						e1.printStackTrace();
					} 
			 }
	
			 }
		
	public static void main(String args[])
	{
		new IOT_Device_Source();
		
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
//				new ServiceProvider();
			}
		});
	}
}
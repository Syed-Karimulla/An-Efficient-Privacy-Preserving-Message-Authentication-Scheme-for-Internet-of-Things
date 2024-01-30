import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Router extends JFrame implements ActionListener
{
	JPanel p1;
	ImageIcon a1,a2,a3,a4,a5,a6,a7,a8,a9,a1g,a2g,a3g,a4g,a5g,a6g,a7g,a8g,a9g,a1r,a2r,a3r,a4r,a5r,a6r,a7r,a8r,a9r;
	ImageIcon b2,b3,b4,b5,b6,b7,b8,b2g,b3g,b4g,b5g,b6g,b7g,b8g,b1r,b2r,b3r,b4r,b5r,b6r,b7r,b8r;
	ImageIcon c2,c3,c4,c5,c6,c7,c8,c2g,c3g,c4g,c5g,c6g,c7g,c8g,c1r,c2r,c3r,c4r,c5r,c6r,c7r,c8r;
	ImageIcon black,green,red;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38;
	
	JLabel up,downd,down1,up1,aa,d2,d3,d4,d5,d6,d7,d22,d33,d44,d55,d66,d77,d88;
	JLabel e2,e3,e4,e5,e6,e7,e8,e22,e33,e44,e55,e66,e77,e88;
	JLabel f2,f3,f4,f5,f6,f7;
	
	ImageIcon up9,down9,down19,up19,aa9,d29,d39,d49,d59,d69,d79,d229,d339,d449,d559,d669,d779,d889;
	ImageIcon e29,e39,e49,e59,e69,e79,e89,e229,e339,e449,e559,e669,e779,e889;
	ImageIcon f29,f39,f49,f59,f69,f79;
	
	JLabel a11,a22,a33,a44,a55,a66,a77,a88,a99;
	JLabel b11,b22,b33,b44,b55,b66,b77,b88;
	JLabel c11,c22,c33,c44,c55,c66,c77,c88;
	
	String CHead1,CHead2,CHead3,CHead4;
	String CHp1,CHp2,CHp3,CHp4;


	
	MenuBar mbr;
	MenuItem i1,i2,i3,i4,i5,i9;
	Menu m1;
	Dbcon db = new Dbcon();
	Connection connect=db.getConnection();
	
	public Font f = new Font("Times new roman", Font.BOLD, 25);
	public Font f1 = new Font("Times new roman", Font.BOLD, 18);
	public Font f21 = new Font("Times new roman", Font.BOLD, 16);
	public Font f31 = new Font("Times new roman", Font.BOLD, 23);
	public Font f41 = new Font("Times new roman", Font.BOLD, 11);
	
	
	String node1="Node1",node2="Node2",node3="Node3" ,node4="Node4",node5="Node5",node6="Node6",node7="Node7",node8="Node8";
	String node9="Node9",node10="Node10",node11="Node11" ,node12="Node12",node13="Node13",node14="Node14",node15="Node15",node16="Node16";
	String node17="Node17",node18="Node18",node19="Node19" ,node20="Node20",node21="Node21",node22="Node22",node23="Node23",node24="Node24";
	String node25="Node25",node26="Node26",node27="Node27" ,node28="Node28",node29="Node29",node30="Node30",node31="Node31",node32="Node32";
	
	String dis1="",dis2="",dis3="",dis4="",dis5="",dis6="",dis7="",dis8="",dis9="",dis10="";
	String dis11="",dis12="",dis13="",dis14="",dis15="",dis16="",dis17="",dis18="",dis19="",dis20="";
	String dis21="",dis22="",dis23="",dis24="",dis25="",dis26="",dis27="",dis28="",dis29="",dis30="";
	String dis31="",dis32="";
	
	String mac=""; String fname=""; 
	String mac2="";String mac3="";String mac4="";String mac5="";String mac6="";String mac7="";String mac8="";
	String mac9="";String mac10="";String mac11="";String mac12="";String mac13="";String mac14="";String mac15="";String mac16="";
	String mac17="";String mac18="";String mac19="";String mac20="";String mac21="";String mac22="";String mac23="";String mac24="";
	String mac25="";String mac26="";String mac27="";String mac28="";String mac29="";String mac30="";String mac31="";String mac32="";
	
	String ene="";String ene2="";String ene3="";String ene4="";String ene5="";String ene6="";String ene7="";String ene8="";
	String ene9="";String ene10="";String ene11="";String ene12="";String ene13="";String ene14="";String ene15="";String ene16="";
	String ene17="";String ene18="";String ene19="";String ene20="";String ene21="";String ene22="";String ene23="";String ene24="";
	String ene25="";String ene26="";String ene27="";String ene28="";String ene29="";String ene30="";String ene31="";String ene32="";
	
	String no1="";String no2="";String no3="";String no4="";String no5="";String no6="";String no7="";String no8="";
	String no9="";String no10="";String no11="";String no12="";String no13="";String no14="";String no15="";String no16="";
	String no17="";String no18="";String no19="";String no20="";String no21="";String no22="";String no23="";String no24="";
	String no25="";String no26="";String no27="";String no28="";String no29="";String no30="";String no31="";String no32="";
	String path,dest,destip,ct;

	String n1="";String n2="";String n3="";String n4="";String n5="";String n6="";String n7="";String n8="";
	String n9="";String n10="";String n11="";String n12="";String n13="";String n14="";String n15="";String n16="";
	String n17="";String n18="";String n19="";String n20="";
	
	Socket cn=null;
	String Degree;
	ThreadMXBean threadBean;
	long start;
	String s;
	StringBuffer sb1;
	int fsize=0;
	ImageIcon nod,border,down,ids;
	JLabel nodl,borderl,downl,idsl,text;
	String frm="";String to="";String st="";String t="Trust";String nt="No Trust";
	ImageIcon a91,a911,a9111,a91111,line;
	JLabel a92,a912,a9112,a91112,line1;
	
	Router() throws SQLException
	{
		p1=new JPanel();
		p1.setLayout(null);
		setTitle("Router ::An Efficient Privacy Preserving Message Authentication Scheme for Internet of Things");
		p1.setBackground(Color.white);
		
		mbr=new MenuBar();
		setMenuBar(mbr);
		m1=new Menu("FILE");
		i1=new MenuItem("Update Energy");
		i9=new MenuItem("Update Distance");
		i2=new MenuItem("View NodesInfo");
		i3=new MenuItem("View Attackers");
		i4=new MenuItem("View Routing Details");
		i5=new MenuItem("View Recommendation");

		
		a91=new ImageIcon(this.getClass().getResource("rec.jpg"));
		a92=new JLabel("Recommended Node");
		a92.setIcon(a91);
		a92.setBounds(150, 400, 500,200);
		p1.add(a92);
		

		a911=new ImageIcon(this.getClass().getResource("g.jpg"));
		a912=new JLabel("Trust Node");
		a912.setIcon(a911);
		a912.setBounds(350, 400, 500,200);
		p1.add(a912);
		
		
		a9111=new ImageIcon(this.getClass().getResource("r.jpg"));
		a9112=new JLabel("Un Trust Node");
		a9112.setIcon(a9111);
		a9112.setBounds(530, 400, 500,200);
		p1.add(a9112);
		
		
		line=new ImageIcon(this.getClass().getResource("line.png"));
		line1=new JLabel("");
		line1.setIcon(line);
		line1.setBounds(70, 450, 850,14);
		p1.add(line1);
		

		a91111=new ImageIcon(this.getClass().getResource("b.jpg"));
		a91112=new JLabel("Default Node");
		a91112.setIcon(a91111);
		a91112.setBounds(700, 400, 500,200);
		p1.add(a91112);
		
		
		a1=new ImageIcon(this.getClass().getResource("sd.jpg"));
		a11=new JLabel("Source");
		a11.setIcon(a1);
		a11.setBounds(50, 150, 500,200);
		p1.add(a11);
		
		a2=new ImageIcon(this.getClass().getResource("b.jpg"));
		a22=new JLabel("Node2");
		a22.setIcon(a2);
		a22.setBounds(100, 240, 500,200);
		p1.add(a22);
		
		a3=new ImageIcon(this.getClass().getResource("b.jpg"));
		a33=new JLabel("Node3");
		a33.setIcon(a3);
		a33.setBounds(130, 50, 500,200);
		p1.add(a33);
		
		a4=new ImageIcon(this.getClass().getResource("b.jpg"));
		a44=new JLabel("Node4");
		a44.setIcon(a4);
		a44.setBounds(180, 180, 500,200);
		p1.add(a44);
	
		a5=new ImageIcon(this.getClass().getResource("b.jpg"));
		a55=new JLabel("Node5");
		a55.setIcon(a5);
		a55.setBounds(270, 80, 500,200);
		p1.add(a55);
		
		a6=new ImageIcon(this.getClass().getResource("b.jpg"));
		a66=new JLabel("Node6");
		a66.setIcon(a6);
		a66.setBounds(240, 230, 500,200);
		p1.add(a66);

		a7=new ImageIcon(this.getClass().getResource("b.jpg"));
		a77=new JLabel("Node7");
		a77.setIcon(a7);
		a77.setBounds(310, 300, 500,200);
		p1.add(a77);
		
		a8=new ImageIcon(this.getClass().getResource("b.jpg"));
		a88=new JLabel("Node8");
		a88.setIcon(a8);
		a88.setBounds(360, 30, 500,200);
		p1.add(a88);

		a9=new ImageIcon(this.getClass().getResource("b.jpg"));
		a99=new JLabel("Node9");
		a99.setIcon(a9);
		a99.setBounds(350, 140, 500,200);
		p1.add(a99);
		
		b2=new ImageIcon(this.getClass().getResource("b.jpg"));
		b22=new JLabel("Node10");
		b22.setIcon(b2);
		b22.setBounds(410, 280, 500,200);
		p1.add(b22);

		b3=new ImageIcon(this.getClass().getResource("b.jpg"));
		b33=new JLabel("Node11");
		b33.setIcon(b3);
		b33.setBounds(510, 10, 500,200);
		p1.add(b33);

		b4=new ImageIcon(this.getClass().getResource("b.jpg"));
		b44=new JLabel("Node12");
		b44.setIcon(b4);
		b44.setBounds(540, 120, 500,200);
		p1.add(b44);

		b5=new ImageIcon(this.getClass().getResource("b.jpg"));
		b55=new JLabel("Node13");
		b55.setIcon(b5);
		b55.setBounds(500, 200, 500,200);
		p1.add(b55);

		b6=new ImageIcon(this.getClass().getResource("b.jpg"));
		b66=new JLabel("Node14");
		b66.setIcon(b6);
		b66.setBounds(550, 280, 500,200);
		p1.add(b66);
		
		b7=new ImageIcon(this.getClass().getResource("b.jpg"));
		b77=new JLabel("Node15");
		b77.setIcon(b7);
		b77.setBounds(640, 100, 500,200);
		p1.add(b77);
		

		b8=new ImageIcon(this.getClass().getResource("b.jpg"));
		b88=new JLabel("Node16");
		b88.setIcon(b8);
		b88.setBounds(655, 230, 500,200);
		p1.add(b88);

		c2=new ImageIcon(this.getClass().getResource("b.jpg"));
		c22=new JLabel("Node17");
		c22.setIcon(c2);
		c22.setBounds(750, 40, 500,200);
		p1.add(c22);

		c3=new ImageIcon(this.getClass().getResource("b.jpg"));
		c33=new JLabel("Node18");
		c33.setIcon(c3);
		c33.setBounds(740, 190, 500,200);
		p1.add(c33);

		c4=new ImageIcon(this.getClass().getResource("b.jpg"));
		c44=new JLabel("Node19");
		c44.setIcon(c4);
		c44.setBounds(800, 120, 500,200);
		p1.add(c44);

		c5=new ImageIcon(this.getClass().getResource("sd.jpg"));
		c55=new JLabel("Dest");
		c55.setIcon(c5);
		c55.setBounds(900, 150, 500,200);
		p1.add(c55);
		
		m1.add(i1);
		m1.add(i2);
		m1.add(i9);
		m1.add(i3);
		m1.add(i4);
		m1.add(i5);
		mbr.add(m1);
		
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		i5.addActionListener(this);
		i9.addActionListener(this);
		
		setSize(1020,600);
		setVisible(true);
		add(p1);
		
		int[] ports = new int[]
			              		{8909,3939,1412,4445,4444,1111,2222};

			              		for (int i = 0; i < 7; i++)
			              		{
			              			Thread t = new Thread(new PortListener(ports[i]));
			              			t.setName("Listener-" + ports[i]);
			              			t.start();

			              		}
		
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
		Dbcon db=new Dbcon();
		Connection con=db.getConnection();
		if(ae.getSource()==i1)
		{
			try
			{
			String nname="";
			
				String cn4[]={"Node1","Node2","Node3","Node4","Node5","Node6","Node7","Node8","Node9","Node10","Node11","Node12","Node13","Node14","Node15","Node16","Node17","Node18","Node19","Node20"};
				JComboBox clust4=new JComboBox(cn4);
				JOptionPane.showMessageDialog(null,clust4,"Update Bandwidth",JOptionPane.QUESTION_MESSAGE);
				
				nname=clust4.getSelectedItem().toString();
					
				String Ener=JOptionPane.showInputDialog(null,"Enter Bandwidth");
				
				int dis=Integer.parseInt(Ener);
				Statement st=con.createStatement();
				String cname="NodesInfo";
				String n1="update "+cname+" set bw="+dis+" where node='"+nname+"' ";
				st.executeUpdate(n1);
				
				JOptionPane.showMessageDialog(null,"Bandwidth Updated Successfully");
				
			}catch(Exception es){System.out.println(es);}
			
		}
		
		if(ae.getSource()==i9)
		{
			try
			{
			String nname="";
			
				String cn4[]={"Node1","Node2","Node3","Node4","Node5","Node6","Node7","Node8","Node9","Node10","Node11","Node12","Node13","Node14","Node15","Node16","Node17","Node18","Node19","Node20","Node21","Node22"};
				JComboBox clust4=new JComboBox(cn4);
				JOptionPane.showMessageDialog(null,clust4,"Update Distance",JOptionPane.QUESTION_MESSAGE);
				
				nname=clust4.getSelectedItem().toString();
					
				String Ener=JOptionPane.showInputDialog(null,"Enter Distance");
				
				int dis=Integer.parseInt(Ener);
				Statement st=con.createStatement();
				String cname="NodesInfo";
				String n1="update "+cname+" set dist="+dis+" where node='"+nname+"' ";
				st.executeUpdate(n1);
				
				JOptionPane.showMessageDialog(null,"Distance Updated Successfully");
				
			}catch(Exception es){System.out.println(es);}
			
		}
		if(ae.getSource()==i2)
		{
				try
				{
					ViewRouter r = new ViewRouter();
					r.setSize(900, 600);
					r.setVisible(true);
				
		}catch (Exception e) {
			// TODO: handle exception
		}

	}
		if(ae.getSource()==i3)
		{
			ViewAttackers r = new ViewAttackers();
			r.setSize(900, 600);
			r.setVisible(true);
		}
		
		if(ae.getSource()==i4)
		{
			ViewTimeDelay r1 = new ViewTimeDelay();
			r1.setSize(900, 600);
			r1.setVisible(true);
		}
		if(ae.getSource()==i5)
		{
			ViewRecommendation r1 = new ViewRecommendation();
			r1.setSize(900, 600);
			r1.setVisible(true);
		}

	}	
	public static void main(String[] args) throws SQLException
	{
		new Router();
	}

	class PortListener implements Runnable
	{
		int port;

		public PortListener(int port)
		{
			this.port = port;
		}

		public void run()
		{
			Dbcon db = new Dbcon();
			Connection connect=db.getConnection();
			
			if(this.port==4445)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(4445);
					Socket con777;
					while (true) 
					{
					con777 = server909.accept();
					
					DataInputStream dis = new DataInputStream(con777.getInputStream());
					
					String node1	= dis.readUTF();
				
					String attack="Yes";
					SimpleDateFormat dateFormat = new SimpleDateFormat();
				    Date date = new Date();
				       
				    String dt=dateFormat.format(date);
					String energy="";
					
				    if(node1.equalsIgnoreCase("Node9"))
				    {
				    	ResultSet rs=  connect.createStatement().executeQuery("select * from NodesInfo where node='"+node1+"'");
				    	
				    	while(rs.next())
				    	{
				    		energy=rs.getString(4);
				    	}
				    }
				    if(node1.equalsIgnoreCase("Node10"))
				    {
				    	ResultSet rs=  connect.createStatement().executeQuery("select * from NodesInfo where node='"+node1+"'");
				    	
				    	while(rs.next())
				    	{
				    		energy=rs.getString(4);
				    	}
				    }
				    if(node1.equalsIgnoreCase("Node11"))
				    {
				    	ResultSet rs=  connect.createStatement().executeQuery("select * from NodesInfo where node='"+node1+"'");
				    	
				    	while(rs.next())
				    	{
				    		energy=rs.getString(4);
				    	}
				    }
				    if(node1.equalsIgnoreCase("Node12"))
				    {
				    	ResultSet rs=  connect.createStatement().executeQuery("select * from NodesInfo where node='"+node1+"'");
				    	
				    	while(rs.next())
				    	{
				    		energy=rs.getString(4);
				    	}
				    }
				    if(node1.equalsIgnoreCase("Node13"))
				    {
				    	ResultSet rs=  connect.createStatement().executeQuery("select * from NodesInfo where node='"+node1+"'");
				    	
				    	while(rs.next())
				    	{
				    		energy=rs.getString(4);
				    	}
				    }
				    
					DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
					ds.writeUTF("success");	
					ds.writeUTF(energy);			
					}
					
					}catch (Exception e4) {
						// TODO: handle exception
					}
			}
			if(this.port==8909)
			{
				try
				{
					ServerSocket ss = new ServerSocket(8909);
					
					while (true) 
					{
					cn = ss.accept();
					
					DataInputStream in3=new DataInputStream(cn.getInputStream());
					
					fname=in3.readUTF();
					mac=in3.readUTF();
					ct=in3.readUTF();
					String sp1=in3.readUTF();
					String sp2=in3.readUTF();
					String sp3=in3.readUTF();
					String sp4=in3.readUTF();
					String sp5=in3.readUTF();
					dest=in3.readUTF();
					destip=in3.readUTF();
					
					fsize=ct.length();
					SimpleDateFormat dateFormat = new SimpleDateFormat();
				    Date date = new Date();
				    String dt=dateFormat.format(date);

					int len = fname.length();
					String file = fname.substring(0, len-5);
					
					PrintStream out99 = null;
					try {
					    out99 = new PrintStream(new FileOutputStream("Router\\"+file+".txt"));
					    out99.print(ct);
					    
					}
					finally {
					    if (out99 != null) out99.close();
					}
					
					PrintStream out = null;
					try {
					    out = new PrintStream(new FileOutputStream("Router\\"+file+"1"+".txt"));
					    out.print(sp1);
					    
					}
					finally {
					    if (out != null) out.close();
					}
					
					PrintStream out1 = null;
					try {
					    out1 = new PrintStream(new FileOutputStream("Router\\"+file+"2"+".txt"));
					    out1.print(sp2);
					    
					}
					finally {
					    if (out1 != null) out1.close();
					}
					
					PrintStream out2 = null;
					try {
					    out2 = new PrintStream(new FileOutputStream("Router\\"+file+"3"+".txt"));
					    out2.print(sp3);
					    
					}
					finally {
					    if (out2 != null) out2.close();
					}
					
					
					PrintStream out3 = null;
					try {
					    out3 = new PrintStream(new FileOutputStream("Router\\"+file+"4"+".txt"));
					    out3.print(sp4);
					    
					}
					finally {
					    if (out3 != null) out3.close();
					}
					
					PrintStream out4 = null;
					try {
					    out4 = new PrintStream(new FileOutputStream("Router\\"+file+"5"+".txt"));
					    out4.print(sp5);
					    
					}
					finally {
					    if (out4 != null) out4.close();
					}
					
					Statement stmt = connect.createStatement();
					String query1 = "insert into Router values('"+fname+"','"+mac+"','"+dest+"','"+dt+"')";
					stmt.executeUpdate(query1);
					
				
					getdist();
					getband();
					getmac();
				    
					Thread.sleep(2000);
					a11.setVisible(false);
					Thread.sleep(1000);
					a11.setVisible(true);
					Thread.sleep(1000);
					a11.setVisible(false);
					Thread.sleep(1000);
					a11.setVisible(true);
					no1="Node1->";
					
					if(Integer.parseInt(dis2)<=Integer.parseInt(dis3))
					{
						Thread.sleep(2000);
						a2g=new ImageIcon(this.getClass().getResource("g.jpg"));
						a22.setIcon(a2g);
						no2="Node2->";
						
						Thread.sleep(2000);
						a2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
						a22.setIcon(a2g);
						no2="Node2->";
						frm=no1; to=no2; st=t; log(no1,no2,st);
						
						if(Integer.parseInt(dis3)<=Integer.parseInt(dis4))
						{
							Thread.sleep(2000);
							a3g=new ImageIcon(this.getClass().getResource("g.jpg"));
							a33.setIcon(a3g);
							no3="Node3->";
							
							Thread.sleep(2000);
							a3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							a33.setIcon(a3g);
							no3="Node3->";
							
							frm=no2; to=no3; st=t; log(no2,no3,st);
							
							if(Integer.parseInt(dis4)<=Integer.parseInt(dis5))
							{
								Thread.sleep(2000);
								a4g=new ImageIcon(this.getClass().getResource("g.jpg"));
								a44.setIcon(a4g);
								no4="Node4->";
								
								Thread.sleep(2000);
								a4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								a44.setIcon(a4g);
								no4="Node4->";
								
								frm=no3; to=no4; st=t; log(no3,no4,st);
								
								if(Integer.parseInt(dis5)<=Integer.parseInt(dis6))
								{
									Thread.sleep(2000);
									a5g=new ImageIcon(this.getClass().getResource("g.jpg"));
									a55.setIcon(a5g);
									no5="Node5->";
									
									Thread.sleep(2000);
									a5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
									a55.setIcon(a5g);
									no5="Node5->";
									
									frm=no4; to=no5; st=t; log(no4,no5,st);
									
									if(Integer.parseInt(dis6)<=Integer.parseInt(dis7))
									{
										Thread.sleep(2000);
										a6g=new ImageIcon(this.getClass().getResource("g.jpg"));
										a66.setIcon(a6g);
										no6="Node6->";
										
										Thread.sleep(2000);
										a6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
										a66.setIcon(a6g);
										no6="Node6->";
										
										frm=no5; to=no6; st=t; log(no5,no6,st);
										
										if(Integer.parseInt(dis7)<=Integer.parseInt(dis8))
										{
											Thread.sleep(2000);
											a7g=new ImageIcon(this.getClass().getResource("g.jpg"));
											a77.setIcon(a7g);
											no7="Node7->";
											
											Thread.sleep(2000);
											a7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											a77.setIcon(a7g);
											no7="Node7->";

											frm=no6; to=no7; st=t; log(no6,no7,st);
											
											if(Integer.parseInt(dis8)<=Integer.parseInt(dis9))
											{
												Thread.sleep(2000);
												a8g=new ImageIcon(this.getClass().getResource("g.jpg"));
												a88.setIcon(a8g);
												no8="Node8->";
												
												Thread.sleep(2000);
												a8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												a88.setIcon(a8g);
												no8="Node8->";

												frm=no7; to=no8; st=t; log(no7,no8,st);
												
												if(Integer.parseInt(dis9)<=Integer.parseInt(dis10))
												{
													if(Integer.parseInt(ene9)>=fsize)
													{
														if(mac.equalsIgnoreCase(mac9))
														{
															Thread.sleep(2000);
															a9g=new ImageIcon(this.getClass().getResource("g.jpg"));
															a99.setIcon(a9g);
															no9="Node9->";
														
															Thread.sleep(2000);
															a9g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															a99.setIcon(a9g);
															no9="Node9->";

															frm=no8; to=no9; st=t; log(no8,no9,st);
															
															
															if(Integer.parseInt(dis10)<=Integer.parseInt(dis11))
															{
																
																if(Integer.parseInt(ene10)>=fsize)
																{
																	if(mac.equalsIgnoreCase(mac10))
																	{
																		Thread.sleep(2000);
																		b2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																		b22.setIcon(b2g);
																		no10="Node10->";
																	
																		Thread.sleep(2000);
																		b2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																		b22.setIcon(b2g);
																		no10="Node10->";

																		frm=no9; to=no10; st=t; log(no9,no10,st);
																		
																		if(Integer.parseInt(dis11)<=Integer.parseInt(dis12))
																		{
																			
																			if(Integer.parseInt(ene11)>=fsize)
																			{
																				if(mac.equalsIgnoreCase(mac11))
																				{
																					Thread.sleep(2000);
																					b3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					b33.setIcon(b3g);
																					no11="Node11->";
																				
																					Thread.sleep(2000);
																					b3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					b33.setIcon(b3g);
																					no11="Node11->";

																					frm=no10; to=no11; st=t; log(no10,no11,st);
																					
																					if(Integer.parseInt(dis12)<=Integer.parseInt(dis13))
																					{
																						
																						if(Integer.parseInt(ene12)>=fsize)
																						{
																							if(mac.equalsIgnoreCase(mac12))
																							{
																								Thread.sleep(2000);
																								b4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								b44.setIcon(b4g);
																								no12="Node12->";
																							
																								Thread.sleep(2000);
																								b4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								b44.setIcon(b4g);
																								no12="Node12->";

																								frm=no11; to=no12; st=t; log(no11,no12,st);
																								
																								if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
																								{
																									
																									if(Integer.parseInt(ene13)>=fsize)
																									{
																										if(mac.equalsIgnoreCase(mac13))
																										{
																											Thread.sleep(2000);
																											b5g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											b55.setIcon(b5g);
																											no13="Node13->";
																										
																											Thread.sleep(2000);
																											b5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											b55.setIcon(b5g);
																											no13="Node13->";

																											frm=no12; to=no13; st=t; log(no12,no13,st);
																											
																											if(Integer.parseInt(dis14)<=Integer.parseInt(dis15))
																											{
																												Thread.sleep(2000);
																												b6g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												b66.setIcon(b6g);
																												no14="Node14->";
																												
																												Thread.sleep(2000);
																												b6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												b66.setIcon(b6g);
																												no14="Node14->";

																												frm=no13; to=no14; st=t; log(no13,no14,st);
																												
																												if(Integer.parseInt(dis15)<=Integer.parseInt(dis16))
																												{
																													Thread.sleep(2000);
																													b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
																													b77.setIcon(b7g);
																													no15="Node15->";
																													
																													Thread.sleep(2000);
																													b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																													b77.setIcon(b7g);
																													no15="Node15->";

																													frm=no14; to=no15; st=t; log(no14,no15,st);
																													
																													if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
																													{
																														Thread.sleep(2000);
																														b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																														b88.setIcon(b8g);
																														no16="Node16->";
																														
																														Thread.sleep(2000);
																														b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																														b88.setIcon(b8g);
																														no16="Node16->";

																														frm=no15; to=no16; st=t; log(no15,no16,st);
																														
																														if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																														{
																															Thread.sleep(2000);
																															c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																															c22.setIcon(c2g);
																															no17="Node17->";
																															
																															Thread.sleep(2000);
																															c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																															c22.setIcon(c2g);
																															no17="Node17->";

																															frm=no16; to=no17; st=t; log(no16,no17,st);
																															
																															if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																															{
																																Thread.sleep(2000);
																																c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																																c33.setIcon(c3g);
																																no18="Node18->";
																																
																																Thread.sleep(2000);
																																c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																																c33.setIcon(c3g);
																																no18="Node18->";

																																frm=no17; to=no18; st=t; log(no17,no18,st);
																																
																																if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																																{
																																	Thread.sleep(2000);
																																	c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																																	c44.setIcon(c4g);
																																	no19="Node19->";
																																	
																																	Thread.sleep(2000);
																																	c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																																	c44.setIcon(c4g);
																																	no19="Node19->";
																																	
																																	Thread.sleep(2000);
																																	c55.setVisible(false);
																																	Thread.sleep(1000);
																																	c55.setVisible(true);
																																	Thread.sleep(1000);
																																	c55.setVisible(false);
																																	Thread.sleep(1000);
																																	c55.setVisible(true);
																																	no20="Node20->";
																																	
																																	frm=no18; to=no19; st=t; log(no18,no19,st);

																																	frm=no19; to=no20; st=t; log(no19,no20,st);
																																	
																																	refresh();
																																	send(cn,dest,destip,ct);
																																}
																																else
																																{
																																	Thread.sleep(2000);
																																	c55.setVisible(false);
																																	Thread.sleep(1000);
																																	c55.setVisible(true);
																																	Thread.sleep(1000);
																																	c55.setVisible(false);
																																	Thread.sleep(1000);
																																	c55.setVisible(true);
																																	no20="Node20->";

																																	frm=no18; to=no20; st=t; log(no18,no20,st);
																																	
																																	refresh();
																																	send(cn,dest,destip,ct);
																																
																																}
																																
																															}
																															else
																															{
																																Thread.sleep(2000);
																																c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																																c44.setIcon(c4g);
																																no19="Node19->";
																																
																																Thread.sleep(2000);
																																c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																																c44.setIcon(c4g);
																																no19="Node19->";
																																
																																Thread.sleep(2000);
																																c55.setVisible(false);
																																Thread.sleep(1000);
																																c55.setVisible(true);
																																Thread.sleep(1000);
																																c55.setVisible(false);
																																Thread.sleep(1000);
																																c55.setVisible(true);
																																no20="Node20->";

																																frm=no17; to=no19; st=t; log(no17,no19,st);

																																frm=no19; to=no20; st=t; log(no19,no20,st);
																																
																																refresh();
																																send(cn,dest,destip,ct);
																															}
																														}
																														else
																														{
																															Thread.sleep(2000);
																															c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																															c33.setIcon(c3g);
																															no18="Node18->";
																															
																															Thread.sleep(2000);
																															c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																															c33.setIcon(c3g);
																															no18="Node18->";

																															frm=no16; to=no18; st=t; log(no16,no18,st);
																															
																															if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																															{
																																Thread.sleep(2000);
																																c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																																c44.setIcon(c4g);
																																no19="Node19->";
																																
																																Thread.sleep(2000);
																																c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																																c44.setIcon(c4g);
																																no19="Node19->";
																																
																																Thread.sleep(2000);
																																c55.setVisible(false);
																																Thread.sleep(1000);
																																c55.setVisible(true);
																																Thread.sleep(1000);
																																c55.setVisible(false);
																																Thread.sleep(1000);
																																c55.setVisible(true);
																																no20="Node20->";

																																frm=no18; to=no19; st=t; log(no18,no19,st);

																																frm=no19; to=no20; st=t; log(no19,no20,st);
																																
																																refresh();
																																send(cn,dest,destip,ct);
																															}
																															else
																															{
																																Thread.sleep(2000);
																																c55.setVisible(false);
																																Thread.sleep(1000);
																																c55.setVisible(true);
																																Thread.sleep(1000);
																																c55.setVisible(false);
																																Thread.sleep(1000);
																																c55.setVisible(true);
																																no20="Node20->";

																																frm=no18; to=no20; st=t; log(no18,no20,st);
																																
																																refresh();
																																send(cn,dest,destip,ct);
																															
																															}
																														}
																													}
																													else
																													{
																														Thread.sleep(2000);
																														c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																														c22.setIcon(c2g);
																														no17="Node17->";
																														
																														Thread.sleep(2000);
																														c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																														c22.setIcon(c2g);
																														no17="Node17->";

																														frm=no15; to=no17; st=t; log(no15,no17,st);
																														
																														if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																														{
																															Thread.sleep(2000);
																															c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																															c33.setIcon(c3g);
																															no18="Node18->";
																															
																															Thread.sleep(2000);
																															c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																															c33.setIcon(c3g);
																															no18="Node18->";

																															frm=no17; to=no18; st=t; log(no17,no18,st);
																															
																															if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																															{
																																Thread.sleep(2000);
																																c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																																c44.setIcon(c4g);
																																no19="Node19->";
																																
																																Thread.sleep(2000);
																																c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																																c44.setIcon(c4g);
																																no19="Node19->";
																																
																																Thread.sleep(2000);
																																c55.setVisible(false);
																																Thread.sleep(1000);
																																c55.setVisible(true);
																																Thread.sleep(1000);
																																c55.setVisible(false);
																																Thread.sleep(1000);
																																c55.setVisible(true);
																																no20="Node20->";

																																frm=no18; to=no19; st=t; log(no18,no19,st);

																																frm=no19; to=no20; st=t; log(no19,no20,st);
																																
																																refresh();
																																send(cn,dest,destip,ct);
																															}
																															else
																															{
																																Thread.sleep(2000);
																																c55.setVisible(false);
																																Thread.sleep(1000);
																																c55.setVisible(true);
																																Thread.sleep(1000);
																																c55.setVisible(false);
																																Thread.sleep(1000);
																																c55.setVisible(true);
																																no20="Node20->";

																																frm=no18; to=no20; st=t; log(no18,no20,st);
																																
																																refresh();
																																send(cn,dest,destip,ct);
																															
																															}
																															
																														}
																														else
																														{
																															Thread.sleep(2000);
																															c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																															c44.setIcon(c4g);
																															no19="Node19->";
																															
																															Thread.sleep(2000);
																															c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																															c44.setIcon(c4g);
																															no19="Node19->";
																															
																															Thread.sleep(2000);
																															c55.setVisible(false);
																															Thread.sleep(1000);
																															c55.setVisible(true);
																															Thread.sleep(1000);
																															c55.setVisible(false);
																															Thread.sleep(1000);
																															c55.setVisible(true);
																															no20="Node20->";

																															frm=no17; to=no19; st=t; log(no17,no19,st);

																															frm=no19; to=no20; st=t; log(no19,no20,st);
																															
																															refresh();
																															send(cn,dest,destip,ct);
																														}
																													}
																												}
																												else
																												{
																													Thread.sleep(2000);																														Thread.sleep(2000);
																													b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																													b88.setIcon(b8g);
																													no16="Node16->";
																													
																													Thread.sleep(2000);
																													b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																													b88.setIcon(b8g);
																													no16="Node16->";

																													frm=no14; to=no16; st=t; log(no14,no16,st);
																													
																													if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																													{
																														Thread.sleep(2000);
																														c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																														c22.setIcon(c2g);
																														no17="Node17->";
																														
																														Thread.sleep(2000);
																														c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																														c22.setIcon(c2g);
																														no17="Node17->";

																														frm=no16; to=no17; st=t; log(no16,no17,st);
																														
																														if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																														{
																															Thread.sleep(2000);
																															c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																															c33.setIcon(c3g);
																															no18="Node18->";
																															
																															Thread.sleep(2000);
																															c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																															c33.setIcon(c3g);
																															no18="Node18->";

																															frm=no17; to=no18; st=t; log(no17,no18,st);
																															
																															if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																															{
																																Thread.sleep(2000);
																																c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																																c44.setIcon(c4g);
																																no19="Node19->";
																																
																																Thread.sleep(2000);
																																c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																																c44.setIcon(c4g);
																																no19="Node19->";
																																
																																Thread.sleep(2000);
																																c55.setVisible(false);
																																Thread.sleep(1000);
																																c55.setVisible(true);
																																Thread.sleep(1000);
																																c55.setVisible(false);
																																Thread.sleep(1000);
																																c55.setVisible(true);
																																no20="Node20->";

																																frm=no18; to=no19; st=t; log(no18,no19,st);

																																frm=no19; to=no20; st=t; log(no19,no20,st);
																																
																																refresh();
																																send(cn,dest,destip,ct);
																															}
																															else
																															{
																																Thread.sleep(2000);
																																c55.setVisible(false);
																																Thread.sleep(1000);
																																c55.setVisible(true);
																																Thread.sleep(1000);
																																c55.setVisible(false);
																																Thread.sleep(1000);
																																c55.setVisible(true);
																																no20="Node20->";

																																frm=no18; to=no20; st=t; log(no18,no20,st);
																																
																																refresh();
																																send(cn,dest,destip,ct);
																															
																															}
																															
																														}
																														else
																														{
																															Thread.sleep(2000);
																															c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																															c44.setIcon(c4g);
																															no19="Node19->";
																															
																															Thread.sleep(2000);
																															c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																															c44.setIcon(c4g);
																															no19="Node19->";
																															
																															Thread.sleep(2000);
																															c55.setVisible(false);
																															Thread.sleep(1000);
																															c55.setVisible(true);
																															Thread.sleep(1000);
																															c55.setVisible(false);
																															Thread.sleep(1000);
																															c55.setVisible(true);
																															no20="Node20->";

																															frm=no17; to=no19; st=t; log(no17,no19,st);

																															frm=no19; to=no20; st=t; log(no19,no20,st);
																															
																															refresh();
																															send(cn,dest,destip,ct);
																														}
																													}
																													else
																													{
																														Thread.sleep(2000);
																														c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																														c33.setIcon(c3g);
																														no18="Node18->";
																														
																														Thread.sleep(2000);
																														c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																														c33.setIcon(c3g);
																														no18="Node18->";

																														frm=no16; to=no18; st=t; log(no16,no18,st);
																														
																														if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																														{
																															Thread.sleep(2000);
																															c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																															c44.setIcon(c4g);
																															no19="Node19->";
																															
																															Thread.sleep(2000);
																															c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																															c44.setIcon(c4g);
																															no19="Node19->";
																															
																															Thread.sleep(2000);
																															c55.setVisible(false);
																															Thread.sleep(1000);
																															c55.setVisible(true);
																															Thread.sleep(1000);
																															c55.setVisible(false);
																															Thread.sleep(1000);
																															c55.setVisible(true);
																															no20="Node20->";

																															frm=no18; to=no19; st=t; log(no18,no19,st);

																															frm=no19; to=no20; st=t; log(no19,no20,st);
																															
																															refresh();
																															send(cn,dest,destip,ct);
																														}
																														else
																														{
																															Thread.sleep(2000);
																															c55.setVisible(false);
																															Thread.sleep(1000);
																															c55.setVisible(true);
																															Thread.sleep(1000);
																															c55.setVisible(false);
																															Thread.sleep(1000);
																															c55.setVisible(true);
																															no20="Node20->";

																															frm=no18; to=no20; st=t; log(no18,no20,st);
																															
																															refresh();
																															send(cn,dest,destip,ct);
																														
																														}
																													}
																												}
																											}
																											else
																											{
																												Thread.sleep(2000);
																												b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												b77.setIcon(b7g);
																												no15="Node15->";
																												
																												Thread.sleep(2000);
																												b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												b77.setIcon(b7g);
																												no15="Node15->";

																												frm=no13; to=no15; st=t; log(no13,no15,st);
																												
																												if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
																												{
																													Thread.sleep(2000);
																													b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																													b88.setIcon(b8g);
																													no16="Node16->";
																													
																													Thread.sleep(2000);
																													b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																													b88.setIcon(b8g);
																													no16="Node16->";

																													frm=no15; to=no16; st=t; log(no15,no16,st);
																													
																													if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																													{
																														Thread.sleep(2000);
																														c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																														c22.setIcon(c2g);
																														no17="Node17->";
																														
																														Thread.sleep(2000);
																														c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																														c22.setIcon(c2g);
																														no17="Node17->";

																														frm=no16; to=no17; st=t; log(no16,no17,st);
																														
																														if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																														{
																															Thread.sleep(2000);
																															c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																															c33.setIcon(c3g);
																															no18="Node18->";
																															
																															Thread.sleep(2000);
																															c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																															c33.setIcon(c3g);
																															no18="Node18->";

																															frm=no17; to=no18; st=t; log(no17,no18,st);
																															
																															if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																															{
																																Thread.sleep(2000);
																																c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																																c44.setIcon(c4g);
																																no19="Node19->";
																																
																																Thread.sleep(2000);
																																c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																																c44.setIcon(c4g);
																																no19="Node19->";
																																
																																Thread.sleep(2000);
																																c55.setVisible(false);
																																Thread.sleep(1000);
																																c55.setVisible(true);
																																Thread.sleep(1000);
																																c55.setVisible(false);
																																Thread.sleep(1000);
																																c55.setVisible(true);
																																no20="Node20->";

																																frm=no18; to=no19; st=t; log(no18,no19,st);

																																frm=no19; to=no20; st=t; log(no19,no20,st);
																																
																																refresh();
																																send(cn,dest,destip,ct);
																															}
																															else
																															{
																																Thread.sleep(2000);
																																c55.setVisible(false);
																																Thread.sleep(1000);
																																c55.setVisible(true);
																																Thread.sleep(1000);
																																c55.setVisible(false);
																																Thread.sleep(1000);
																																c55.setVisible(true);
																																no20="Node20->";

																																frm=no18; to=no20; st=t; log(no18,no20,st);
																																
																																refresh();
																																send(cn,dest,destip,ct);
																															
																															}
																															
																														}
																														else
																														{
																															Thread.sleep(2000);
																															c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																															c44.setIcon(c4g);
																															no19="Node19->";
																															
																															Thread.sleep(2000);
																															c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																															c44.setIcon(c4g);
																															no19="Node19->";
																															
																															Thread.sleep(2000);
																															c55.setVisible(false);
																															Thread.sleep(1000);
																															c55.setVisible(true);
																															Thread.sleep(1000);
																															c55.setVisible(false);
																															Thread.sleep(1000);
																															c55.setVisible(true);
																															no20="Node20->";

																															frm=no17; to=no19; st=t; log(no17,no19,st);

																															frm=no19; to=no20; st=t; log(no19,no20,st);
																															
																															refresh();
																															send(cn,dest,destip,ct);
																														}
																													}
																													else
																													{
																														Thread.sleep(2000);
																														c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																														c33.setIcon(c3g);
																														no18="Node18->";
																														
																														Thread.sleep(2000);
																														c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																														c33.setIcon(c3g);
																														no18="Node18->";

																														frm=no16; to=no18; st=t; log(no16,no18,st);
																														
																														if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																														{
																															Thread.sleep(2000);
																															c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																															c44.setIcon(c4g);
																															no19="Node19->";
																															
																															Thread.sleep(2000);
																															c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																															c44.setIcon(c4g);
																															no19="Node19->";
																															
																															Thread.sleep(2000);
																															c55.setVisible(false);
																															Thread.sleep(1000);
																															c55.setVisible(true);
																															Thread.sleep(1000);
																															c55.setVisible(false);
																															Thread.sleep(1000);
																															c55.setVisible(true);
																															no20="Node20->";

																															frm=no18; to=no19; st=t; log(no18,no19,st);

																															frm=no19; to=no20; st=t; log(no19,no20,st);
																															
																															refresh();
																															send(cn,dest,destip,ct);
																														}
																														else
																														{
																															Thread.sleep(2000);
																															c55.setVisible(false);
																															Thread.sleep(1000);
																															c55.setVisible(true);
																															Thread.sleep(1000);
																															c55.setVisible(false);
																															Thread.sleep(1000);
																															c55.setVisible(true);
																															no20="Node20->";

																															frm=no18; to=no20; st=t; log(no18,no20,st);
																															
																															refresh();
																															send(cn,dest,destip,ct);
																														
																														}
																													}
																												}
																												else
																												{
																													Thread.sleep(2000);
																													c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																													c22.setIcon(c2g);
																													no17="Node17->";
																													
																													Thread.sleep(2000);
																													c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																													c22.setIcon(c2g);
																													no17="Node17->";

																													frm=no15; to=no17; st=t; log(no15,no17,st);
																													
																													if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																													{
																														Thread.sleep(2000);
																														c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																														c33.setIcon(c3g);
																														no18="Node18->";
																														
																														Thread.sleep(2000);
																														c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																														c33.setIcon(c3g);
																														no18="Node18->";

																														frm=no17; to=no18; st=t; log(no17,no18,st);
																														
																														if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																														{
																															Thread.sleep(2000);
																															c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																															c44.setIcon(c4g);
																															no19="Node19->";
																															
																															Thread.sleep(2000);
																															c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																															c44.setIcon(c4g);
																															no19="Node19->";
																															
																															Thread.sleep(2000);
																															c55.setVisible(false);
																															Thread.sleep(1000);
																															c55.setVisible(true);
																															Thread.sleep(1000);
																															c55.setVisible(false);
																															Thread.sleep(1000);
																															c55.setVisible(true);
																															no20="Node20->";

																															frm=no18; to=no19; st=t; log(no18,no19,st);

																															frm=no19; to=no20; st=t; log(no19,no20,st);
																															
																															refresh();
																															send(cn,dest,destip,ct);
																														}
																														else
																														{
																															Thread.sleep(2000);
																															c55.setVisible(false);
																															Thread.sleep(1000);
																															c55.setVisible(true);
																															Thread.sleep(1000);
																															c55.setVisible(false);
																															Thread.sleep(1000);
																															c55.setVisible(true);
																															no20="Node20->";

																															frm=no18; to=no20; st=t; log(no18,no20,st);
																															
																															refresh();
																															send(cn,dest,destip,ct);
																														
																														}
																														
																													}
																													else
																													{
																														Thread.sleep(2000);
																														c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																														c44.setIcon(c4g);
																														no19="Node19->";
																														
																														Thread.sleep(2000);
																														c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																														c44.setIcon(c4g);
																														no19="Node19->";
																														
																														Thread.sleep(2000);
																														c55.setVisible(false);
																														Thread.sleep(1000);
																														c55.setVisible(true);
																														Thread.sleep(1000);
																														c55.setVisible(false);
																														Thread.sleep(1000);
																														c55.setVisible(true);
																														no20="Node20->";

																														frm=no17; to=no19; st=t; log(no17,no19,st);

																														frm=no19; to=no20; st=t; log(no19,no20,st);
																														
																														refresh();
																														send(cn,dest,destip,ct);
																													}
																												}
																											}
																										}
																										else
																										{
																											mac13(no13,mac13);
																										}
																									}
																									else
																									{
																										ene13(no13,ene13);
																									}
																								}
																								else
																								{
																									dist13();
																								}
																							}
																							else
																							{
																								mac12(no12,mac12);
																							}
																						}
																						else
																						{
																							ene12(no12,ene12);
																						}
																					}
																					else
																					{
																						dist12();
																					}
																					
																				}
																				else
																				{
																					mac11(no11,mac11);
																				}
																			}
																			else
																			{
																				ene11(no11,ene11);
																			}
																		}
																		else
																		{
																			dist11();
																		}
																	}
																	else
																	{
																		mac10(no10,mac10);
																	}
																}
																else
																{
																	ene10(no10,ene10);
																}
															}
															else
															{
																dist10();
															}
														}
														else
														{
															mac9(no9,mac9);
														}
													}
													else
													{
														ene9(no9,ene9);
													}
														
												}
												else
												{
													dist9();
												}
												
											}
											else
											{
												dist8();
											}
											
										}
										else
										{
											dist7();
										}
									}
									else
									{
										dist6();
									}
								}
								else
								{
									dist5();
								}
							}
							else
							{
								dist4();
							}
						}
						else
						{
							dist3();
						}
					}
					else
					{
						dist2();
					}
					
					
				//	send(cn,dest,destip,ct);
					
						
					}
					/*
					Thread.sleep(2000);
					a1=new ImageIcon(this.getClass().getResource("b.jpg"));
					a11.setIcon(a1);
					a2=new ImageIcon(this.getClass().getResource("b.jpg"));
					a22.setIcon(a2);
					a3=new ImageIcon(this.getClass().getResource("b.jpg"));
					a33.setIcon(a3);
					a4=new ImageIcon(this.getClass().getResource("b.jpg"));
					a44.setIcon(a4);
					a5=new ImageIcon(this.getClass().getResource("b.jpg"));
					a55.setIcon(a5);
					a6=new ImageIcon(this.getClass().getResource("b.jpg"));
					a66.setIcon(a6);
					a7=new ImageIcon(this.getClass().getResource("b.jpg"));
					a77.setIcon(a7);
					a8=new ImageIcon(this.getClass().getResource("b.jpg"));
					a88.setIcon(a8);
					a9=new ImageIcon(this.getClass().getResource("b.jpg"));
					a99.setIcon(a9);
					b2=new ImageIcon(this.getClass().getResource("b.jpg"));
					b22.setIcon(b2);
					b3=new ImageIcon(this.getClass().getResource("b.jpg"));
					b33.setIcon(b3);
					b4=new ImageIcon(this.getClass().getResource("b.jpg"));
					b44.setIcon(b4);
					b5=new ImageIcon(this.getClass().getResource("b.jpg"));
					b55.setIcon(b5);
					b6=new ImageIcon(this.getClass().getResource("b.jpg"));
					b66.setIcon(b6);
					b7=new ImageIcon(this.getClass().getResource("b.jpg"));
					b77.setIcon(b7);
					b8=new ImageIcon(this.getClass().getResource("b.jpg"));
					b88.setIcon(b8);
					c2=new ImageIcon(this.getClass().getResource("b.jpg"));
					c22.setIcon(c2);
					c3=new ImageIcon(this.getClass().getResource("b.jpg"));
					c33.setIcon(c3);
					c4=new ImageIcon(this.getClass().getResource("b.jpg"));
					c44.setIcon(c4);
					c5=new ImageIcon(this.getClass().getResource("b.jpg"));
					c55.setIcon(c5);
					c6=new ImageIcon(this.getClass().getResource("b.jpg"));
					c66.setIcon(c6);
					c7=new ImageIcon(this.getClass().getResource("b.jpg"));
					c77.setIcon(c7);
					c8=new ImageIcon(this.getClass().getResource("b.jpg"));
					c88.setIcon(c8);
					
					l1.setVisible(false);
					l2.setVisible(false);
					l3.setVisible(false);
			*/		
				}catch (Exception e) {

				}
		}
			if(this.port==3939)
			{


				try
				{
					ServerSocket server909 = new ServerSocket(3939);
					Socket con777;
					while (true) 
					{
					con777 = server909.accept();
					
					DataInputStream dis = new DataInputStream(con777.getInputStream());
					
					mac	= dis.readUTF();
					fname	= dis.readUTF();
					
					String att="No";
					String b="20000";
					
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node1+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node2+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node3+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node4+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node5+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node6+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node7+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node8+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node9+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node10+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node11+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node12+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node13+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node14+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node15+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node16+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node17+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node18+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node19+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node20+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node21+"'");
					connect.createStatement().executeUpdate("update NodesInfo set fname='"+fname+"',mac='"+mac+"',attack1='"+att+"',attack2='"+att+"',bw='"+b+"' where node='"+node22+"'");
					
					DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
					ds.writeUTF("success");
						   
					
					
					}
					}catch (Exception e34) {
						// TODO: handle exception
					}
					
}
			
			if(this.port==1111)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(1111);
					Socket con777;
					while (true) 
					{
					con777 = server909.accept();
					
					DataInputStream dis = new DataInputStream(con777.getInputStream());
					
					String msg	= dis.readUTF();
					System.out.println(msg);
					
					ResultSet rss=connect.createStatement().executeQuery("select * from Dropped");
					
					if(rss.next()==true)
					{
						String file=rss.getString(2);
						String node=rss.getString(1);
						
						if(node.equalsIgnoreCase("Node13->"))
						{
							String[] dsname = { "Select Destination", "A", "B", "C", "D", "E" };
							
							 String dataname = (String) JOptionPane.showInputDialog(null,"Select Destination", "Destination Name",
									JOptionPane.QUESTION_MESSAGE, null,  dsname,  dsname[0]);
							 
							 String destip = JOptionPane.showInputDialog(null,
										"Please Enter the IP Address Of "+dataname);
							 
							 	Thread.sleep(2000);
								c5g=new ImageIcon(this.getClass().getResource("green.png"));
								c55.setIcon(c5g);
								no13="Node13->";
								
								Thread.sleep(2000);
								c6g=new ImageIcon(this.getClass().getResource("green.png"));
								c66.setIcon(c6g);
								no16="Node16->";
								
								Thread.sleep(2000);
								c7g=new ImageIcon(this.getClass().getResource("green.png"));
								c77.setIcon(c7g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c8g=new ImageIcon(this.getClass().getResource("green.png"));
								c88.setIcon(c8g);
								no22="Node22->";
								
								Thread.sleep(2000);
								a9g=new ImageIcon(this.getClass().getResource("green.png"));
								a99.setIcon(a9g);
								no23="Node23->";
								
								ref();
								
								String e="10000";
								connect.createStatement().executeUpdate("update NodesInfo set bw='"+e+"' where node='"+node13+"'");
								connect.createStatement().executeUpdate("update NodesInfo set bw='"+e+"' where node='"+node19+"'");
								connect.createStatement().executeUpdate("delete from dropped");
								
								String f = file.substring(0, file.indexOf("."));
								String cname = "Router\\";
								MergeFile mf = new MergeFile();
								mf.mergeFiles(f, cname);
								
								FileInputStream fs = new FileInputStream(cname + f + "x.txt");
								byte bs1[] = new byte[fs.available()];
								fs.read(bs1);
								String cont = new String(bs1);
								
								 if(dataname.equalsIgnoreCase("A"))
									{
										Socket dest1=new Socket(destip,9996);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg1=ins.readUTF();
										
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("B"))
									{
										Socket dest1=new Socket(destip,9997);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg2=ins.readUTF();
										
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("C"))
									{
										Socket dest1=new Socket(destip,9998);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg3=ins.readUTF();
										
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("D"))
									{
										Socket dest1=new Socket(destip,9999);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg4=ins.readUTF();
										
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("E"))
									{
										Socket dest1=new Socket(destip,9910);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg5=ins.readUTF();
										
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
								
						}
						
						if(node.equalsIgnoreCase("Node19->"))
						{
							String[] dsname = { "Select Destination", "A", "B", "C", "D", "E" };
							
							 String dataname = (String) JOptionPane.showInputDialog(null,"Select Destination", "Destination Name",
									JOptionPane.QUESTION_MESSAGE, null,  dsname,  dsname[0]);
							 
							 String destip = JOptionPane.showInputDialog(null,
										"Please Enter the IP Address Of "+dataname);
							 
							 	
								
								Thread.sleep(2000);
								c7g=new ImageIcon(this.getClass().getResource("green.png"));
								c77.setIcon(c7g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c8g=new ImageIcon(this.getClass().getResource("green.png"));
								c88.setIcon(c8g);
								no22="Node22->";
								
								Thread.sleep(2000);
								a9g=new ImageIcon(this.getClass().getResource("green.png"));
								a99.setIcon(a9g);
								no23="Node23->";
								
								ref();
								
								String e="10000";
								connect.createStatement().executeUpdate("update NodesInfo set bw='"+e+"' where node='"+node13+"'");
								connect.createStatement().executeUpdate("update NodesInfo set bw='"+e+"' where node='"+node19+"'");
								connect.createStatement().executeUpdate("delete from dropped");
								
								String f = file.substring(0, file.indexOf("."));
								String cname = "Router\\";
								MergeFile mf = new MergeFile();
								mf.mergeFiles(f, cname);
								
								FileInputStream fs = new FileInputStream(cname + f + "x.txt");
								byte bs1[] = new byte[fs.available()];
								fs.read(bs1);
								String cont = new String(bs1);
								
								 if(dataname.equalsIgnoreCase("A"))
									{
										Socket dest1=new Socket(destip,9996);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg1=ins.readUTF();
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("B"))
									{
										Socket dest1=new Socket(destip,9997);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg2=ins.readUTF();
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("C"))
									{
										Socket dest1=new Socket(destip,9998);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg3=ins.readUTF();
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("D"))
									{
										Socket dest1=new Socket(destip,9999);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg4=ins.readUTF();
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("E"))
									{
										Socket dest1=new Socket(destip,9910);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg5=ins.readUTF();
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
								
						}
					}
					else
					{
						DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
						ds.writeUTF("nofile");
					}
				   
									
					}
					
					}catch (Exception e4) {
						// TODO: handle exception
					}
			}
			if(this.port==2222)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(2222);
					Socket con777;
					while (true) 
					{
					con777 = server909.accept();
					
					DataInputStream dis = new DataInputStream(con777.getInputStream());
					
					String fname	= dis.readUTF();
					String dataname	= dis.readUTF();
					String destip	= dis.readUTF();
						
					String f = fname.substring(0, fname.indexOf("."));
					String cname = "Router\\";
					MergeFile mf = new MergeFile();
					mf.mergeFiles(f, cname);
					
					FileInputStream fs = new FileInputStream(cname + f + "x.txt");
					byte bs1[] = new byte[fs.available()];
					fs.read(bs1);
					String cont = new String(bs1);
					
					ResultSet rss=connect.createStatement().executeQuery("select * from Dropped");
					
					if(rss.next()==true)
					{
						String node=rss.getString(1);
						if(node.equalsIgnoreCase("Node13->"))
						{
							 	Thread.sleep(2000);
								c5g=new ImageIcon(this.getClass().getResource("green.png"));
								c55.setIcon(c5g);
								no13="Node13->";
								
								Thread.sleep(2000);
								c6g=new ImageIcon(this.getClass().getResource("green.png"));
								c66.setIcon(c6g);
								no16="Node16->";
								
								Thread.sleep(2000);
								c7g=new ImageIcon(this.getClass().getResource("green.png"));
								c77.setIcon(c7g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c8g=new ImageIcon(this.getClass().getResource("green.png"));
								c88.setIcon(c8g);
								no22="Node22->";
								
								Thread.sleep(2000);
								a9g=new ImageIcon(this.getClass().getResource("green.png"));
								a99.setIcon(a9g);
								no23="Node23->";
								
								ref();
								
								String e="10000";
								connect.createStatement().executeUpdate("update NodesInfo set bw='"+e+"' where node='"+node13+"'");
								connect.createStatement().executeUpdate("update NodesInfo set bw='"+e+"' where node='"+node19+"'");
								connect.createStatement().executeUpdate("delete from dropped");
							
								
								 if(dataname.equalsIgnoreCase("A"))
									{
										Socket dest1=new Socket(destip,9996);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg1=ins.readUTF();
										
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("B"))
									{
										Socket dest1=new Socket(destip,9997);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg2=ins.readUTF();
										
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("C"))
									{
										Socket dest1=new Socket(destip,9998);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg3=ins.readUTF();
										
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("D"))
									{
										Socket dest1=new Socket(destip,9999);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg4=ins.readUTF();
										
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("E"))
									{
										Socket dest1=new Socket(destip,9910);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg5=ins.readUTF();
										
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}	
						}
						
						if(node.equalsIgnoreCase("Node19->"))
						{
								Thread.sleep(2000);
								c7g=new ImageIcon(this.getClass().getResource("green.png"));
								c77.setIcon(c7g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c8g=new ImageIcon(this.getClass().getResource("green.png"));
								c88.setIcon(c8g);
								no22="Node22->";
								
								Thread.sleep(2000);
								a9g=new ImageIcon(this.getClass().getResource("green.png"));
								a99.setIcon(a9g);
								no23="Node23->";
								
								ref();
								
								String e="10000";
								connect.createStatement().executeUpdate("update NodesInfo set bw='"+e+"' where node='"+node13+"'");
								connect.createStatement().executeUpdate("update NodesInfo set bw='"+e+"' where node='"+node19+"'");
								connect.createStatement().executeUpdate("delete from dropped");
								
								 if(dataname.equalsIgnoreCase("A"))
									{
										Socket dest1=new Socket(destip,9996);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg1=ins.readUTF();
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("B"))
									{
										Socket dest1=new Socket(destip,9997);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg2=ins.readUTF();
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("C"))
									{
										Socket dest1=new Socket(destip,9998);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg3=ins.readUTF();
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("D"))
									{
										Socket dest1=new Socket(destip,9999);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg4=ins.readUTF();
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
									if(dataname.equalsIgnoreCase("E"))
									{
										Socket dest1=new Socket(destip,9910);
										DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
										dos91.writeUTF(fname);
										dos91.writeUTF(cont);
										
										DataInputStream ins=new DataInputStream(dest1.getInputStream());
										String msg5=ins.readUTF();
										DataOutputStream  da = new DataOutputStream(con777.getOutputStream());
										da.writeUTF("success");
									}
								
						}	
						}
					}
					}catch (Exception e4) {
						// TODO: handle exception
					}
			}
			if(this.port==4444)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(4444);
					Socket con777;
					while (true) 
					{
					con777 = server909.accept();
					
					DataInputStream dis = new DataInputStream(con777.getInputStream());
					
					String node1	= dis.readUTF();
					String mem	= dis.readUTF();
					String ip	= dis.readUTF();
					
					String attack="Yes";
					SimpleDateFormat dateFormat = new SimpleDateFormat();
				    Date date = new Date();
				       
				    String dt=dateFormat.format(date);
					String energy="";
					
					connect.createStatement().executeUpdate("update NodesInfo set bw='"+mem+"',attack2='"+attack+"' where node='"+node1+"'");
					connect.createStatement().executeUpdate("insert into Attacker values('"+ip+"','"+node1+"','"+mem+"','"+dt+"')");
					
					DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
					ds.writeUTF("attack");	
					ds.writeUTF(energy);			
					}
					
					}catch (Exception e4) {
						// TODO: handle exception
					}
			}
			
			
			
			if(this.port==1412)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(1412);
					Socket con777;
					while (true) 
					{
					con777 = server909.accept();
					
					DataInputStream dis = new DataInputStream(con777.getInputStream());
					String ip	= dis.readUTF();
					String node	= dis.readUTF();
					String mac	= dis.readUTF();
					
					attack(con777,ip,node,mac);
				
								
							
					}	
					
					}catch (Exception e) {
								e.printStackTrace();
						}
						
					 }

		}

		      void log(String n1, String n2,String s) throws SQLException {
			
		    	 // connect.createStatement().executeUpdate("insert into Logg values('"+n1+"','"+n2+"','"+s+"')");
		    	  
		    	  System.out.println("");
			
		}

			void dist2() throws InterruptedException, UnknownHostException, IOException, SQLException {
				
				Thread.sleep(2000);
				a3g=new ImageIcon(this.getClass().getResource("g.jpg"));
				a33.setIcon(a3g);
				no3="Node3->";
				
				Thread.sleep(2000);
				a3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
				a33.setIcon(a3g);
				no3="Node3->";
				
				frm=no1; to=no3; st=t; log(no1,no3,st);
				
				if(Integer.parseInt(dis4)<=Integer.parseInt(dis5))
				{
					Thread.sleep(2000);
					a4g=new ImageIcon(this.getClass().getResource("g.jpg"));
					a44.setIcon(a4g);
					no4="Node4->";
					
					Thread.sleep(2000);
					a4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
					a44.setIcon(a4g);
					no4="Node4->";
					
					frm=no3; to=no4; st=t; log(no3,no4,st);
					
					if(Integer.parseInt(dis5)<=Integer.parseInt(dis6))
					{
						Thread.sleep(2000);
						a5g=new ImageIcon(this.getClass().getResource("g.jpg"));
						a55.setIcon(a5g);
						no5="Node5->";
						
						Thread.sleep(2000);
						a5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
						a55.setIcon(a5g);
						no5="Node5->";
						
						frm=no4; to=no5; st=t; log(no4,no5,st);
						
						if(Integer.parseInt(dis6)<=Integer.parseInt(dis7))
						{
							Thread.sleep(2000);
							a6g=new ImageIcon(this.getClass().getResource("g.jpg"));
							a66.setIcon(a6g);
							no6="Node6->";
							
							Thread.sleep(2000);
							a6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							a66.setIcon(a6g);
							no6="Node6->";
							
							frm=no5; to=no6; st=t; log(no5,no6,st);
							
							if(Integer.parseInt(dis7)<=Integer.parseInt(dis8))
							{
								Thread.sleep(2000);
								a7g=new ImageIcon(this.getClass().getResource("g.jpg"));
								a77.setIcon(a7g);
								no7="Node7->";
								
								Thread.sleep(2000);
								a7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								a77.setIcon(a7g);
								no7="Node7->";

								frm=no6; to=no7; st=t; log(no6,no7,st);
								
								if(Integer.parseInt(dis8)<=Integer.parseInt(dis9))
								{
									Thread.sleep(2000);
									a8g=new ImageIcon(this.getClass().getResource("g.jpg"));
									a88.setIcon(a8g);
									no8="Node8->";
									
									Thread.sleep(2000);
									a8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
									a88.setIcon(a8g);
									no8="Node8->";

									frm=no7; to=no8; st=t; log(no7,no8,st);
									
									if(Integer.parseInt(dis9)<=Integer.parseInt(dis10))
									{
										if(Integer.parseInt(ene9)>=fsize)
										{
											if(mac.equalsIgnoreCase(mac9))
											{
												Thread.sleep(2000);
												a9g=new ImageIcon(this.getClass().getResource("g.jpg"));
												a99.setIcon(a9g);
												no9="Node9->";
											
												Thread.sleep(2000);
												a9g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												a99.setIcon(a9g);
												no9="Node9->";

												frm=no8; to=no9; st=t; log(no8,no9,st);
												
												
												if(Integer.parseInt(dis10)<=Integer.parseInt(dis11))
												{
													
													if(Integer.parseInt(ene10)>=fsize)
													{
														if(mac.equalsIgnoreCase(mac10))
														{
															Thread.sleep(2000);
															b2g=new ImageIcon(this.getClass().getResource("g.jpg"));
															b22.setIcon(b2g);
															no10="Node10->";
														
															Thread.sleep(2000);
															b2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															b22.setIcon(b2g);
															no10="Node10->";

															frm=no9; to=no10; st=t; log(no9,no10,st);
															
															if(Integer.parseInt(dis11)<=Integer.parseInt(dis12))
															{
																
																if(Integer.parseInt(ene11)>=fsize)
																{
																	if(mac.equalsIgnoreCase(mac11))
																	{
																		Thread.sleep(2000);
																		b3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																		b33.setIcon(b3g);
																		no11="Node11->";
																	
																		Thread.sleep(2000);
																		b3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																		b33.setIcon(b3g);
																		no11="Node11->";

																		frm=no10; to=no11; st=t; log(no10,no11,st);
																		
																		if(Integer.parseInt(dis12)<=Integer.parseInt(dis13))
																		{
																			
																			if(Integer.parseInt(ene12)>=fsize)
																			{
																				if(mac.equalsIgnoreCase(mac12))
																				{
																					Thread.sleep(2000);
																					b4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					b44.setIcon(b4g);
																					no12="Node12->";
																				
																					Thread.sleep(2000);
																					b4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					b44.setIcon(b4g);
																					no12="Node12->";

																					frm=no11; to=no12; st=t; log(no11,no12,st);
																					
																					if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
																					{
																						
																						if(Integer.parseInt(ene13)>=fsize)
																						{
																							if(mac.equalsIgnoreCase(mac13))
																							{
																								Thread.sleep(2000);
																								b5g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								b55.setIcon(b5g);
																								no13="Node13->";
																							
																								Thread.sleep(2000);
																								b5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								b55.setIcon(b5g);
																								no13="Node13->";

																								frm=no12; to=no13; st=t; log(no12,no13,st);
																								
																								if(Integer.parseInt(dis14)<=Integer.parseInt(dis15))
																								{
																									Thread.sleep(2000);
																									b6g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									b66.setIcon(b6g);
																									no14="Node14->";
																									
																									Thread.sleep(2000);
																									b6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									b66.setIcon(b6g);
																									no14="Node14->";

																									frm=no13; to=no14; st=t; log(no13,no14,st);
																									
																									if(Integer.parseInt(dis15)<=Integer.parseInt(dis16))
																									{
																										Thread.sleep(2000);
																										b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										b77.setIcon(b7g);
																										no15="Node15->";
																										
																										Thread.sleep(2000);
																										b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										b77.setIcon(b7g);
																										no15="Node15->";

																										frm=no14; to=no15; st=t; log(no14,no15,st);
																										
																										if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
																										{
																											Thread.sleep(2000);
																											b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											b88.setIcon(b8g);
																											no16="Node16->";
																											
																											Thread.sleep(2000);
																											b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											b88.setIcon(b8g);
																											no16="Node16->";

																											frm=no15; to=no16; st=t; log(no15,no16,st);
																											
																											if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																											{
																												Thread.sleep(2000);
																												c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c22.setIcon(c2g);
																												no17="Node17->";
																												
																												Thread.sleep(2000);
																												c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c22.setIcon(c2g);
																												no17="Node17->";

																												frm=no16; to=no17; st=t; log(no16,no17,st);
																												
																												if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																												{
																													Thread.sleep(2000);
																													c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																													c33.setIcon(c3g);
																													no18="Node18->";
																													
																													Thread.sleep(2000);
																													c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																													c33.setIcon(c3g);
																													no18="Node18->";

																													frm=no17; to=no18; st=t; log(no17,no18,st);
																													
																													if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																													{
																														Thread.sleep(2000);
																														c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																														c44.setIcon(c4g);
																														no19="Node19->";
																														
																														Thread.sleep(2000);
																														c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																														c44.setIcon(c4g);
																														no19="Node19->";
																														
																														Thread.sleep(2000);
																														c55.setVisible(false);
																														Thread.sleep(1000);
																														c55.setVisible(true);
																														Thread.sleep(1000);
																														c55.setVisible(false);
																														Thread.sleep(1000);
																														c55.setVisible(true);
																														no20="Node20->";

																														frm=no18; to=no19; st=t; log(no18,no19,st);

																														frm=no19; to=no20; st=t; log(no19,no20,st);
																														
																														refresh();
																														send(cn,dest,destip,ct);
																													}
																													else
																													{
																														Thread.sleep(2000);
																														c55.setVisible(false);
																														Thread.sleep(1000);
																														c55.setVisible(true);
																														Thread.sleep(1000);
																														c55.setVisible(false);
																														Thread.sleep(1000);
																														c55.setVisible(true);
																														no20="Node20->";

																														frm=no18; to=no20; st=t; log(no18,no20,st);
																														
																														refresh();
																														send(cn,dest,destip,ct);
																													
																													}
																													
																												}
																												else
																												{
																													Thread.sleep(2000);
																													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																													c44.setIcon(c4g);
																													no19="Node19->";
																													
																													Thread.sleep(2000);
																													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																													c44.setIcon(c4g);
																													no19="Node19->";
																													
																													Thread.sleep(2000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													Thread.sleep(1000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													no20="Node20->";

																													frm=no17; to=no19; st=t; log(no17,no19,st);

																													frm=no19; to=no20; st=t; log(no19,no20,st);
																													
																													refresh();
																													send(cn,dest,destip,ct);
																												}
																											}
																											else
																											{
																												Thread.sleep(2000);
																												c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c33.setIcon(c3g);
																												no18="Node18->";
																												
																												Thread.sleep(2000);
																												c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c33.setIcon(c3g);
																												no18="Node18->";

																												frm=no16; to=no18; st=t; log(no16,no18,st);
																												
																												if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																												{
																													Thread.sleep(2000);
																													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																													c44.setIcon(c4g);
																													no19="Node19->";
																													
																													Thread.sleep(2000);
																													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																													c44.setIcon(c4g);
																													no19="Node19->";
																													
																													Thread.sleep(2000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													Thread.sleep(1000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													no20="Node20->";

																													frm=no18; to=no19; st=t; log(no18,no19,st);

																													frm=no19; to=no20; st=t; log(no19,no20,st);
																													
																													refresh();
																													send(cn,dest,destip,ct);
																												}
																												else
																												{
																													Thread.sleep(2000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													Thread.sleep(1000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													no20="Node20->";

																													frm=no18; to=no20; st=t; log(no18,no20,st);
																													
																													refresh();
																													send(cn,dest,destip,ct);
																												
																												}
																											}
																										}
																										else
																										{
																											Thread.sleep(2000);
																											c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c22.setIcon(c2g);
																											no17="Node17->";
																											
																											Thread.sleep(2000);
																											c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c22.setIcon(c2g);
																											no17="Node17->";

																											frm=no15; to=no17; st=t; log(no15,no17,st);
																											
																											if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																											{
																												Thread.sleep(2000);
																												c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c33.setIcon(c3g);
																												no18="Node18->";
																												
																												Thread.sleep(2000);
																												c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c33.setIcon(c3g);
																												no18="Node18->";

																												frm=no17; to=no18; st=t; log(no17,no18,st);
																												
																												if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																												{
																													Thread.sleep(2000);
																													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																													c44.setIcon(c4g);
																													no19="Node19->";
																													
																													Thread.sleep(2000);
																													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																													c44.setIcon(c4g);
																													no19="Node19->";
																													
																													Thread.sleep(2000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													Thread.sleep(1000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													no20="Node20->";

																													frm=no18; to=no19; st=t; log(no18,no19,st);

																													frm=no19; to=no20; st=t; log(no19,no20,st);
																													
																													refresh();
																													send(cn,dest,destip,ct);
																												}
																												else
																												{
																													Thread.sleep(2000);
																													c5g=new ImageIcon(this.getClass().getResource("g.jpg"));
																													c55.setIcon(c5g);
																													no20="Node20->";
																													
																													Thread.sleep(2000);
																													c5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																													c55.setIcon(c5g);
																													no20="Node20->";

																													frm=no18; to=no20; st=t; log(no18,no20,st);
																													
																													refresh();
																													send(cn,dest,destip,ct);
																												
																												}
																												
																											}
																											else
																											{
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no17; to=no19; st=t; log(no17,no19,st);

																												frm=no19; to=no20; st=t; log(no19,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											}
																										}
																									}
																									else
																									{
																										Thread.sleep(2000);																														Thread.sleep(2000);
																										b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										b88.setIcon(b8g);
																										no16="Node16->";
																										
																										Thread.sleep(2000);
																										b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										b88.setIcon(b8g);
																										no16="Node16->";

																										frm=no14; to=no16; st=t; log(no14,no16,st);
																										
																										if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																										{
																											Thread.sleep(2000);
																											c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c22.setIcon(c2g);
																											no17="Node17->";
																											
																											Thread.sleep(2000);
																											c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c22.setIcon(c2g);
																											no17="Node17->";

																											frm=no16; to=no17; st=t; log(no16,no17,st);
																											
																											if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																											{
																												Thread.sleep(2000);
																												c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c33.setIcon(c3g);
																												no18="Node18->";
																												
																												Thread.sleep(2000);
																												c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c33.setIcon(c3g);
																												no18="Node18->";

																												frm=no17; to=no18; st=t; log(no17,no18,st);
																												
																												if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																												{
																													Thread.sleep(2000);
																													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																													c44.setIcon(c4g);
																													no19="Node19->";
																													
																													Thread.sleep(2000);
																													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																													c44.setIcon(c4g);
																													no19="Node19->";
																													
																													Thread.sleep(2000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													Thread.sleep(1000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													no20="Node20->";

																													frm=no18; to=no19; st=t; log(no18,no19,st);

																													frm=no19; to=no20; st=t; log(no19,no20,st);
																													
																													refresh();
																													send(cn,dest,destip,ct);
																												}
																												else
																												{
																													Thread.sleep(2000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													Thread.sleep(1000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													no20="Node20->";

																													frm=no18; to=no20; st=t; log(no18,no20,st);
																													
																													refresh();
																													send(cn,dest,destip,ct);
																												
																												}
																												
																											}
																											else
																											{
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no17; to=no19; st=t; log(no17,no19,st);

																												frm=no19; to=no20; st=t; log(no19,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											}
																										}
																										else
																										{
																											Thread.sleep(2000);
																											c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c33.setIcon(c3g);
																											no18="Node18->";
																											
																											Thread.sleep(2000);
																											c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c33.setIcon(c3g);
																											no18="Node18->";

																											frm=no16; to=no18; st=t; log(no16,no18,st);
																											
																											if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																											{
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no18; to=no19; st=t; log(no18,no19,st);

																												frm=no19; to=no20; st=t; log(no19,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											}
																											else
																											{
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no18; to=no20; st=t; log(no18,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											
																											}
																										}
																									}
																								}
																								else
																								{
																									Thread.sleep(2000);
																									b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									b77.setIcon(b7g);
																									no15="Node15->";
																									
																									Thread.sleep(2000);
																									b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									b77.setIcon(b7g);
																									no15="Node15->";

																									frm=no13; to=no15; st=t; log(no13,no15,st);
																									
																									if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
																									{
																										Thread.sleep(2000);
																										b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										b88.setIcon(b8g);
																										no16="Node16->";
																										
																										Thread.sleep(2000);
																										b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										b88.setIcon(b8g);
																										no16="Node16->";

																										frm=no15; to=no16; st=t; log(no15,no16,st);
																										
																										if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																										{
																											Thread.sleep(2000);
																											c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c22.setIcon(c2g);
																											no17="Node17->";
																											
																											Thread.sleep(2000);
																											c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c22.setIcon(c2g);
																											no17="Node17->";

																											frm=no16; to=no17; st=t; log(no16,no17,st);
																											
																											if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																											{
																												Thread.sleep(2000);
																												c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c33.setIcon(c3g);
																												no18="Node18->";
																												
																												Thread.sleep(2000);
																												c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c33.setIcon(c3g);
																												no18="Node18->";

																												frm=no17; to=no18; st=t; log(no17,no18,st);
																												
																												if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																												{
																													Thread.sleep(2000);
																													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																													c44.setIcon(c4g);
																													no19="Node19->";
																													
																													Thread.sleep(2000);
																													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																													c44.setIcon(c4g);
																													no19="Node19->";
																													
																													Thread.sleep(2000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													Thread.sleep(1000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													no20="Node20->";

																													frm=no18; to=no19; st=t; log(no18,no19,st);

																													frm=no19; to=no20; st=t; log(no19,no20,st);
																													
																													refresh();
																													send(cn,dest,destip,ct);
																												}
																												else
																												{
																													Thread.sleep(2000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													Thread.sleep(1000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													no20="Node20->";

																													frm=no18; to=no20; st=t; log(no18,no20,st);
																													
																													refresh();
																													send(cn,dest,destip,ct);
																												
																												}
																												
																											}
																											else
																											{
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no17; to=no19; st=t; log(no17,no19,st);

																												frm=no19; to=no20; st=t; log(no19,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											}
																										}
																										else
																										{
																											Thread.sleep(2000);
																											c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c33.setIcon(c3g);
																											no18="Node18->";
																											
																											Thread.sleep(2000);
																											c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c33.setIcon(c3g);
																											no18="Node18->";

																											frm=no16; to=no18; st=t; log(no16,no18,st);
																											
																											if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																											{
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no18; to=no19; st=t; log(no18,no19,st);

																												frm=no19; to=no20; st=t; log(no19,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											}
																											else
																											{
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no18; to=no20; st=t; log(no18,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											
																											}
																										}
																									}
																									else
																									{
																										Thread.sleep(2000);
																										c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c22.setIcon(c2g);
																										no17="Node17->";
																										
																										Thread.sleep(2000);
																										c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c22.setIcon(c2g);
																										no17="Node17->";

																										frm=no15; to=no17; st=t; log(no15,no17,st);
																										
																										if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																										{
																											Thread.sleep(2000);
																											c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c33.setIcon(c3g);
																											no18="Node18->";
																											
																											Thread.sleep(2000);
																											c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c33.setIcon(c3g);
																											no18="Node18->";

																											frm=no17; to=no18; st=t; log(no17,no18,st);
																											
																											if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																											{
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no18; to=no19; st=t; log(no18,no19,st);

																												frm=no19; to=no20; st=t; log(no19,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											}
																											else
																											{
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no18; to=no20; st=t; log(no18,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											
																											}
																											
																										}
																										else
																										{
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											Thread.sleep(1000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											no20="Node20->";

																											frm=no17; to=no19; st=t; log(no17,no19,st);

																											frm=no19; to=no20; st=t; log(no19,no20,st);
																											
																											refresh();
																											send(cn,dest,destip,ct);
																										}
																									}
																								}
																							}
																							else
																							{
																								mac13(no13,mac13);
																							}
																						}
																						else
																						{
																							ene13(no13,ene13);
																						}
																					}
																					else
																					{
																						dist13();
																					}
																				}
																				else
																				{
																					mac12(no12,mac12);
																				}
																			}
																			else
																			{
																				ene12(no12,ene12);
																			}
																		}
																		else
																		{
																			dist12();
																		}
																		
																	}
																	else
																	{
																		mac11(no11,mac11);
																	}
																}
																else
																{
																	ene11(no11,ene11);
																}
															}
															else
															{
																dist11();
															}
														}
														else
														{
															mac10(no10,mac10);
														}
													}
													else
													{
														ene10(no10,ene10);
													}
												}
												else
												{
													dist10();
												}
											}
											else
											{
												mac9(no9,mac9);
											}
										}
										else
										{
											ene9(no9,ene9);
										}
											
									}
									else
									{
										dist9();
									}
									
								}
								else
								{
									dist8();
								}
								
							}
							else
							{
								dist7();
							}
						}
						else
						{
							dist6();
						}
					}
					else
					{
						dist5();
					}
				}
				else
				{
					dist4();
				}
			}

			 void dist3() throws InterruptedException, UnknownHostException, IOException, SQLException {
				 
					Thread.sleep(2000);
					a4g=new ImageIcon(this.getClass().getResource("g.jpg"));
					a44.setIcon(a4g);
					no4="Node4->";
					
					Thread.sleep(2000);
					a4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
					a44.setIcon(a4g);
					no4="Node4->";
					
					frm=no2; to=no4; st=t; log(no2,no4,st);
					
					if(Integer.parseInt(dis5)<=Integer.parseInt(dis6))
					{
						Thread.sleep(2000);
						a5g=new ImageIcon(this.getClass().getResource("g.jpg"));
						a55.setIcon(a5g);
						no5="Node5->";
						
						Thread.sleep(2000);
						a5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
						a55.setIcon(a5g);
						no5="Node5->";
						
						frm=no4; to=no5; st=t; log(no4,no5,st);
						
						if(Integer.parseInt(dis6)<=Integer.parseInt(dis7))
						{
							Thread.sleep(2000);
							a6g=new ImageIcon(this.getClass().getResource("g.jpg"));
							a66.setIcon(a6g);
							no6="Node6->";
							
							Thread.sleep(2000);
							a6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							a66.setIcon(a6g);
							no6="Node6->";
							
							frm=no5; to=no6; st=t; log(no5,no6,st);
							
							if(Integer.parseInt(dis7)<=Integer.parseInt(dis8))
							{
								Thread.sleep(2000);
								a7g=new ImageIcon(this.getClass().getResource("g.jpg"));
								a77.setIcon(a7g);
								no7="Node7->";
								
								Thread.sleep(2000);
								a7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								a77.setIcon(a7g);
								no7="Node7->";

								frm=no6; to=no7; st=t; log(no6,no7,st);
								
								if(Integer.parseInt(dis8)<=Integer.parseInt(dis9))
								{
									Thread.sleep(2000);
									a8g=new ImageIcon(this.getClass().getResource("g.jpg"));
									a88.setIcon(a8g);
									no8="Node8->";
									
									Thread.sleep(2000);
									a8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
									a88.setIcon(a8g);
									no8="Node8->";

									frm=no7; to=no8; st=t; log(no7,no8,st);
									
									if(Integer.parseInt(dis9)<=Integer.parseInt(dis10))
									{
										if(Integer.parseInt(ene9)>=fsize)
										{
											if(mac.equalsIgnoreCase(mac9))
											{
												Thread.sleep(2000);
												a9g=new ImageIcon(this.getClass().getResource("g.jpg"));
												a99.setIcon(a9g);
												no9="Node9->";
											
												Thread.sleep(2000);
												a9g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												a99.setIcon(a9g);
												no9="Node9->";

												frm=no8; to=no9; st=t; log(no8,no9,st);
												
												
												if(Integer.parseInt(dis10)<=Integer.parseInt(dis11))
												{
													
													if(Integer.parseInt(ene10)>=fsize)
													{
														if(mac.equalsIgnoreCase(mac10))
														{
															Thread.sleep(2000);
															b2g=new ImageIcon(this.getClass().getResource("g.jpg"));
															b22.setIcon(b2g);
															no10="Node10->";
														
															Thread.sleep(2000);
															b2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															b22.setIcon(b2g);
															no10="Node10->";

															frm=no9; to=no10; st=t; log(no9,no10,st);
															
															if(Integer.parseInt(dis11)<=Integer.parseInt(dis12))
															{
																
																if(Integer.parseInt(ene11)>=fsize)
																{
																	if(mac.equalsIgnoreCase(mac11))
																	{
																		Thread.sleep(2000);
																		b3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																		b33.setIcon(b3g);
																		no11="Node11->";
																	
																		Thread.sleep(2000);
																		b3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																		b33.setIcon(b3g);
																		no11="Node11->";

																		frm=no10; to=no11; st=t; log(no10,no11,st);
																		
																		if(Integer.parseInt(dis12)<=Integer.parseInt(dis13))
																		{
																			
																			if(Integer.parseInt(ene12)>=fsize)
																			{
																				if(mac.equalsIgnoreCase(mac12))
																				{
																					Thread.sleep(2000);
																					b4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					b44.setIcon(b4g);
																					no12="Node12->";
																				
																					Thread.sleep(2000);
																					b4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					b44.setIcon(b4g);
																					no12="Node12->";

																					frm=no11; to=no12; st=t; log(no11,no12,st);
																					
																					if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
																					{
																						
																						if(Integer.parseInt(ene13)>=fsize)
																						{
																							if(mac.equalsIgnoreCase(mac13))
																							{
																								Thread.sleep(2000);
																								b5g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								b55.setIcon(b5g);
																								no13="Node13->";
																							
																								Thread.sleep(2000);
																								b5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								b55.setIcon(b5g);
																								no13="Node13->";

																								frm=no12; to=no13; st=t; log(no12,no13,st);
																								
																								if(Integer.parseInt(dis14)<=Integer.parseInt(dis15))
																								{
																									Thread.sleep(2000);
																									b6g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									b66.setIcon(b6g);
																									no14="Node14->";
																									
																									Thread.sleep(2000);
																									b6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									b66.setIcon(b6g);
																									no14="Node14->";

																									frm=no13; to=no14; st=t; log(no13,no14,st);
																									
																									if(Integer.parseInt(dis15)<=Integer.parseInt(dis16))
																									{
																										Thread.sleep(2000);
																										b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										b77.setIcon(b7g);
																										no15="Node15->";
																										
																										Thread.sleep(2000);
																										b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										b77.setIcon(b7g);
																										no15="Node15->";

																										frm=no14; to=no15; st=t; log(no14,no15,st);
																										
																										if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
																										{
																											Thread.sleep(2000);
																											b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											b88.setIcon(b8g);
																											no16="Node16->";
																											
																											Thread.sleep(2000);
																											b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											b88.setIcon(b8g);
																											no16="Node16->";

																											frm=no15; to=no16; st=t; log(no15,no16,st);
																											
																											if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																											{
																												Thread.sleep(2000);
																												c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c22.setIcon(c2g);
																												no17="Node17->";
																												
																												Thread.sleep(2000);
																												c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c22.setIcon(c2g);
																												no17="Node17->";

																												frm=no16; to=no17; st=t; log(no16,no17,st);
																												
																												if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																												{
																													Thread.sleep(2000);
																													c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																													c33.setIcon(c3g);
																													no18="Node18->";
																													
																													Thread.sleep(2000);
																													c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																													c33.setIcon(c3g);
																													no18="Node18->";

																													frm=no17; to=no18; st=t; log(no17,no18,st);
																													
																													if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																													{
																														Thread.sleep(2000);
																														c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																														c44.setIcon(c4g);
																														no19="Node19->";
																														
																														Thread.sleep(2000);
																														c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																														c44.setIcon(c4g);
																														no19="Node19->";
																														
																														Thread.sleep(2000);
																														c55.setVisible(false);
																														Thread.sleep(1000);
																														c55.setVisible(true);
																														Thread.sleep(1000);
																														c55.setVisible(false);
																														Thread.sleep(1000);
																														c55.setVisible(true);
																														no20="Node20->";

																														frm=no18; to=no19; st=t; log(no18,no19,st);

																														frm=no19; to=no20; st=t; log(no19,no20,st);
																														
																														refresh();
																														send(cn,dest,destip,ct);
																													}
																													else
																													{
																														Thread.sleep(2000);
																														c55.setVisible(false);
																														Thread.sleep(1000);
																														c55.setVisible(true);
																														Thread.sleep(1000);
																														c55.setVisible(false);
																														Thread.sleep(1000);
																														c55.setVisible(true);
																														no20="Node20->";

																														frm=no18; to=no20; st=t; log(no18,no20,st);
																														
																														refresh();
																														send(cn,dest,destip,ct);
																													
																													}
																													
																												}
																												else
																												{
																													Thread.sleep(2000);
																													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																													c44.setIcon(c4g);
																													no19="Node19->";
																													
																													Thread.sleep(2000);
																													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																													c44.setIcon(c4g);
																													no19="Node19->";
																													
																													Thread.sleep(2000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													Thread.sleep(1000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													no20="Node20->";

																													frm=no17; to=no19; st=t; log(no17,no19,st);

																													frm=no19; to=no20; st=t; log(no19,no20,st);
																													
																													refresh();
																													send(cn,dest,destip,ct);
																												}
																											}
																											else
																											{
																												Thread.sleep(2000);
																												c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c33.setIcon(c3g);
																												no18="Node18->";
																												
																												Thread.sleep(2000);
																												c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c33.setIcon(c3g);
																												no18="Node18->";

																												frm=no16; to=no18; st=t; log(no16,no18,st);
																												
																												if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																												{
																													Thread.sleep(2000);
																													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																													c44.setIcon(c4g);
																													no19="Node19->";
																													
																													Thread.sleep(2000);
																													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																													c44.setIcon(c4g);
																													no19="Node19->";
																													
																													Thread.sleep(2000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													Thread.sleep(1000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													no20="Node20->";

																													frm=no18; to=no19; st=t; log(no18,no19,st);

																													frm=no19; to=no20; st=t; log(no19,no20,st);
																													
																													refresh();
																													send(cn,dest,destip,ct);
																												}
																												else
																												{
																													Thread.sleep(2000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													Thread.sleep(1000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													no20="Node20->";

																													frm=no18; to=no20; st=t; log(no18,no20,st);
																													
																													refresh();
																													send(cn,dest,destip,ct);
																												
																												}
																											}
																										}
																										else
																										{
																											Thread.sleep(2000);
																											c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c22.setIcon(c2g);
																											no17="Node17->";
																											
																											Thread.sleep(2000);
																											c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c22.setIcon(c2g);
																											no17="Node17->";

																											frm=no15; to=no17; st=t; log(no15,no17,st);
																											
																											if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																											{
																												Thread.sleep(2000);
																												c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c33.setIcon(c3g);
																												no18="Node18->";
																												
																												Thread.sleep(2000);
																												c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c33.setIcon(c3g);
																												no18="Node18->";

																												frm=no17; to=no18; st=t; log(no17,no18,st);
																												
																												if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																												{
																													Thread.sleep(2000);
																													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																													c44.setIcon(c4g);
																													no19="Node19->";
																													
																													Thread.sleep(2000);
																													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																													c44.setIcon(c4g);
																													no19="Node19->";
																													
																													Thread.sleep(2000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													Thread.sleep(1000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													no20="Node20->";

																													frm=no18; to=no19; st=t; log(no18,no19,st);

																													frm=no19; to=no20; st=t; log(no19,no20,st);
																													
																													refresh();
																													send(cn,dest,destip,ct);
																												}
																												else
																												{
																													Thread.sleep(2000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													Thread.sleep(1000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													no20="Node20->";

																													frm=no18; to=no20; st=t; log(no18,no20,st);
																													
																													refresh();
																													send(cn,dest,destip,ct);
																												
																												}
																												
																											}
																											else
																											{
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no17; to=no19; st=t; log(no17,no19,st);

																												frm=no19; to=no20; st=t; log(no19,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											}
																										}
																									}
																									else
																									{
																										Thread.sleep(2000);																														Thread.sleep(2000);
																										b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										b88.setIcon(b8g);
																										no16="Node16->";
																										
																										Thread.sleep(2000);
																										b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										b88.setIcon(b8g);
																										no16="Node16->";

																										frm=no14; to=no16; st=t; log(no14,no16,st);
																										
																										if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																										{
																											Thread.sleep(2000);
																											c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c22.setIcon(c2g);
																											no17="Node17->";
																											
																											Thread.sleep(2000);
																											c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c22.setIcon(c2g);
																											no17="Node17->";

																											frm=no16; to=no17; st=t; log(no16,no17,st);
																											
																											if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																											{
																												Thread.sleep(2000);
																												c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c33.setIcon(c3g);
																												no18="Node18->";
																												
																												Thread.sleep(2000);
																												c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c33.setIcon(c3g);
																												no18="Node18->";

																												frm=no17; to=no18; st=t; log(no17,no18,st);
																												
																												if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																												{
																													Thread.sleep(2000);
																													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																													c44.setIcon(c4g);
																													no19="Node19->";
																													
																													Thread.sleep(2000);
																													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																													c44.setIcon(c4g);
																													no19="Node19->";
																													
																													Thread.sleep(2000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													Thread.sleep(1000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													no20="Node20->";

																													frm=no18; to=no19; st=t; log(no18,no19,st);

																													frm=no19; to=no20; st=t; log(no19,no20,st);
																													
																													refresh();
																													send(cn,dest,destip,ct);
																												}
																												else
																												{
																													Thread.sleep(2000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													Thread.sleep(1000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													no20="Node20->";

																													frm=no18; to=no20; st=t; log(no18,no20,st);
																													
																													refresh();
																													send(cn,dest,destip,ct);
																												
																												}
																												
																											}
																											else
																											{
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no17; to=no19; st=t; log(no17,no19,st);

																												frm=no19; to=no20; st=t; log(no19,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											}
																										}
																										else
																										{
																											Thread.sleep(2000);
																											c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c33.setIcon(c3g);
																											no18="Node18->";
																											
																											Thread.sleep(2000);
																											c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c33.setIcon(c3g);
																											no18="Node18->";

																											frm=no16; to=no18; st=t; log(no16,no18,st);
																											
																											if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																											{
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no18; to=no19; st=t; log(no18,no19,st);

																												frm=no19; to=no20; st=t; log(no19,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											}
																											else
																											{
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no18; to=no20; st=t; log(no18,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											
																											}
																										}
																									}
																								}
																								else
																								{
																									Thread.sleep(2000);
																									b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									b77.setIcon(b7g);
																									no15="Node15->";
																									
																									Thread.sleep(2000);
																									b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									b77.setIcon(b7g);
																									no15="Node15->";

																									frm=no13; to=no15; st=t; log(no13,no15,st);
																									
																									if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
																									{
																										Thread.sleep(2000);
																										b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										b88.setIcon(b8g);
																										no16="Node16->";
																										
																										Thread.sleep(2000);
																										b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										b88.setIcon(b8g);
																										no16="Node16->";

																										frm=no15; to=no16; st=t; log(no15,no16,st);
																										
																										if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																										{
																											Thread.sleep(2000);
																											c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c22.setIcon(c2g);
																											no17="Node17->";
																											
																											Thread.sleep(2000);
																											c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c22.setIcon(c2g);
																											no17="Node17->";

																											frm=no16; to=no17; st=t; log(no16,no17,st);
																											
																											if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																											{
																												Thread.sleep(2000);
																												c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c33.setIcon(c3g);
																												no18="Node18->";
																												
																												Thread.sleep(2000);
																												c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c33.setIcon(c3g);
																												no18="Node18->";

																												frm=no17; to=no18; st=t; log(no17,no18,st);
																												
																												if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																												{
																													Thread.sleep(2000);
																													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																													c44.setIcon(c4g);
																													no19="Node19->";
																													
																													Thread.sleep(2000);
																													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																													c44.setIcon(c4g);
																													no19="Node19->";
																													
																													Thread.sleep(2000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													Thread.sleep(1000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													no20="Node20->";

																													frm=no18; to=no19; st=t; log(no18,no19,st);

																													frm=no19; to=no20; st=t; log(no19,no20,st);
																													
																													refresh();
																													send(cn,dest,destip,ct);
																												}
																												else
																												{
																													Thread.sleep(2000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													Thread.sleep(1000);
																													c55.setVisible(false);
																													Thread.sleep(1000);
																													c55.setVisible(true);
																													no20="Node20->";

																													frm=no18; to=no20; st=t; log(no18,no20,st);
																													
																													refresh();
																													send(cn,dest,destip,ct);
																												
																												}
																												
																											}
																											else
																											{
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no17; to=no19; st=t; log(no17,no19,st);

																												frm=no19; to=no20; st=t; log(no19,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											}
																										}
																										else
																										{
																											Thread.sleep(2000);
																											c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c33.setIcon(c3g);
																											no18="Node18->";
																											
																											Thread.sleep(2000);
																											c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c33.setIcon(c3g);
																											no18="Node18->";

																											frm=no16; to=no18; st=t; log(no16,no18,st);
																											
																											if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																											{
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no18; to=no19; st=t; log(no18,no19,st);

																												frm=no19; to=no20; st=t; log(no19,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											}
																											else
																											{
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no18; to=no20; st=t; log(no18,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											
																											}
																										}
																									}
																									else
																									{
																										Thread.sleep(2000);
																										c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c22.setIcon(c2g);
																										no17="Node17->";
																										
																										Thread.sleep(2000);
																										c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c22.setIcon(c2g);
																										no17="Node17->";

																										frm=no15; to=no17; st=t; log(no15,no17,st);
																										
																										if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																										{
																											Thread.sleep(2000);
																											c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c33.setIcon(c3g);
																											no18="Node18->";
																											
																											Thread.sleep(2000);
																											c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c33.setIcon(c3g);
																											no18="Node18->";

																											frm=no17; to=no18; st=t; log(no17,no18,st);
																											
																											if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																											{
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no18; to=no19; st=t; log(no18,no19,st);

																												frm=no19; to=no20; st=t; log(no19,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											}
																											else
																											{
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no18; to=no20; st=t; log(no18,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											
																											}
																											
																										}
																										else
																										{
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											Thread.sleep(1000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											no20="Node20->";

																											frm=no17; to=no19; st=t; log(no17,no19,st);

																											frm=no19; to=no20; st=t; log(no19,no20,st);
																											
																											refresh();
																											send(cn,dest,destip,ct);
																										}
																									}
																								}
																							}
																							else
																							{
																								mac13(no13,mac13);
																							}
																						}
																						else
																						{
																							ene13(no13,ene13);
																						}
																					}
																					else
																					{
																						dist13();
																					}
																				}
																				else
																				{
																					mac12(no12,mac12);
																				}
																			}
																			else
																			{
																				ene12(no12,ene12);
																			}
																		}
																		else
																		{
																			dist12();
																		}
																		
																	}
																	else
																	{
																		mac11(no11,mac11);
																	}
																}
																else
																{
																	ene11(no11,ene11);
																}
															}
															else
															{
																dist11();
															}
														}
														else
														{
															mac10(no10,mac10);
														}
													}
													else
													{
														ene10(no10,ene10);
													}
												}
												else
												{
													dist10();
												}
											}
											else
											{
												mac9(no9,mac9);
											}
										}
										else
										{
											ene9(no9,ene9);
										}
											
									}
									else
									{
										dist9();
									}
									
								}
								else
								{
									dist8();
								}
								
							}
							else
							{
								dist7();
							}
						}
						else
						{
							dist6();
						}
					}
					else
					{
						dist5();
					}
			 }

			void dist4() throws InterruptedException, UnknownHostException, IOException, SQLException {
				
				Thread.sleep(2000);
				a5g=new ImageIcon(this.getClass().getResource("g.jpg"));
				a55.setIcon(a5g);
				no5="Node5->";
				
				Thread.sleep(2000);
				a5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
				a55.setIcon(a5g);
				no5="Node5->";
				
				frm=no3; to=no5; st=t; log(no3,no5,st);
				
				if(Integer.parseInt(dis6)<=Integer.parseInt(dis7))
				{
					Thread.sleep(2000);
					a6g=new ImageIcon(this.getClass().getResource("g.jpg"));
					a66.setIcon(a6g);
					no6="Node6->";
					
					Thread.sleep(2000);
					a6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
					a66.setIcon(a6g);
					no6="Node6->";
					
					frm=no5; to=no6; st=t; log(no5,no6,st);
					
					if(Integer.parseInt(dis7)<=Integer.parseInt(dis8))
					{
						Thread.sleep(2000);
						a7g=new ImageIcon(this.getClass().getResource("g.jpg"));
						a77.setIcon(a7g);
						no7="Node7->";
						
						Thread.sleep(2000);
						a7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
						a77.setIcon(a7g);
						no7="Node7->";

						frm=no6; to=no7; st=t; log(no6,no7,st);
						
						if(Integer.parseInt(dis8)<=Integer.parseInt(dis9))
						{
							Thread.sleep(2000);
							a8g=new ImageIcon(this.getClass().getResource("g.jpg"));
							a88.setIcon(a8g);
							no8="Node8->";
							
							Thread.sleep(2000);
							a8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							a88.setIcon(a8g);
							no8="Node8->";

							frm=no7; to=no8; st=t; log(no7,no8,st);
							
							if(Integer.parseInt(dis9)<=Integer.parseInt(dis10))
							{
								if(Integer.parseInt(ene9)>=fsize)
								{
									if(mac.equalsIgnoreCase(mac9))
									{
										Thread.sleep(2000);
										a9g=new ImageIcon(this.getClass().getResource("g.jpg"));
										a99.setIcon(a9g);
										no9="Node9->";
									
										Thread.sleep(2000);
										a9g=new ImageIcon(this.getClass().getResource("rec.jpg"));
										a99.setIcon(a9g);
										no9="Node9->";

										frm=no8; to=no9; st=t; log(no8,no9,st);
										
										
										if(Integer.parseInt(dis10)<=Integer.parseInt(dis11))
										{
											
											if(Integer.parseInt(ene10)>=fsize)
											{
												if(mac.equalsIgnoreCase(mac10))
												{
													Thread.sleep(2000);
													b2g=new ImageIcon(this.getClass().getResource("g.jpg"));
													b22.setIcon(b2g);
													no10="Node10->";
												
													Thread.sleep(2000);
													b2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													b22.setIcon(b2g);
													no10="Node10->";

													frm=no9; to=no10; st=t; log(no9,no10,st);
													
													if(Integer.parseInt(dis11)<=Integer.parseInt(dis12))
													{
														
														if(Integer.parseInt(ene11)>=fsize)
														{
															if(mac.equalsIgnoreCase(mac11))
															{
																Thread.sleep(2000);
																b3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																b33.setIcon(b3g);
																no11="Node11->";
															
																Thread.sleep(2000);
																b3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																b33.setIcon(b3g);
																no11="Node11->";

																frm=no10; to=no11; st=t; log(no10,no11,st);
																
																if(Integer.parseInt(dis12)<=Integer.parseInt(dis13))
																{
																	
																	if(Integer.parseInt(ene12)>=fsize)
																	{
																		if(mac.equalsIgnoreCase(mac12))
																		{
																			Thread.sleep(2000);
																			b4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																			b44.setIcon(b4g);
																			no12="Node12->";
																		
																			Thread.sleep(2000);
																			b4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																			b44.setIcon(b4g);
																			no12="Node12->";

																			frm=no11; to=no12; st=t; log(no11,no12,st);
																			
																			if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
																			{
																				
																				if(Integer.parseInt(ene13)>=fsize)
																				{
																					if(mac.equalsIgnoreCase(mac13))
																					{
																						Thread.sleep(2000);
																						b5g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						b55.setIcon(b5g);
																						no13="Node13->";
																					
																						Thread.sleep(2000);
																						b5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						b55.setIcon(b5g);
																						no13="Node13->";

																						frm=no12; to=no13; st=t; log(no12,no13,st);
																						
																						if(Integer.parseInt(dis14)<=Integer.parseInt(dis15))
																						{
																							Thread.sleep(2000);
																							b6g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							b66.setIcon(b6g);
																							no14="Node14->";
																							
																							Thread.sleep(2000);
																							b6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							b66.setIcon(b6g);
																							no14="Node14->";

																							frm=no13; to=no14; st=t; log(no13,no14,st);
																							
																							if(Integer.parseInt(dis15)<=Integer.parseInt(dis16))
																							{
																								Thread.sleep(2000);
																								b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								b77.setIcon(b7g);
																								no15="Node15->";
																								
																								Thread.sleep(2000);
																								b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								b77.setIcon(b7g);
																								no15="Node15->";

																								frm=no14; to=no15; st=t; log(no14,no15,st);
																								
																								if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
																								{
																									Thread.sleep(2000);
																									b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									b88.setIcon(b8g);
																									no16="Node16->";
																									
																									Thread.sleep(2000);
																									b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									b88.setIcon(b8g);
																									no16="Node16->";

																									frm=no15; to=no16; st=t; log(no15,no16,st);
																									
																									if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																									{
																										Thread.sleep(2000);
																										c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c22.setIcon(c2g);
																										no17="Node17->";
																										
																										Thread.sleep(2000);
																										c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c22.setIcon(c2g);
																										no17="Node17->";

																										frm=no16; to=no17; st=t; log(no16,no17,st);
																										
																										if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																										{
																											Thread.sleep(2000);
																											c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c33.setIcon(c3g);
																											no18="Node18->";
																											
																											Thread.sleep(2000);
																											c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c33.setIcon(c3g);
																											no18="Node18->";

																											frm=no17; to=no18; st=t; log(no17,no18,st);
																											
																											if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																											{
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no18; to=no19; st=t; log(no18,no19,st);

																												frm=no19; to=no20; st=t; log(no19,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											}
																											else
																											{
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no18; to=no20; st=t; log(no18,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											
																											}
																											
																										}
																										else
																										{
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											Thread.sleep(1000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											no20="Node20->";

																											frm=no17; to=no19; st=t; log(no17,no19,st);

																											frm=no19; to=no20; st=t; log(no19,no20,st);
																											
																											refresh();
																											send(cn,dest,destip,ct);
																										}
																									}
																									else
																									{
																										Thread.sleep(2000);
																										c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c33.setIcon(c3g);
																										no18="Node18->";
																										
																										Thread.sleep(2000);
																										c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c33.setIcon(c3g);
																										no18="Node18->";

																										frm=no16; to=no18; st=t; log(no16,no18,st);
																										
																										if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																										{
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											Thread.sleep(1000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											no20="Node20->";

																											frm=no18; to=no19; st=t; log(no18,no19,st);

																											frm=no19; to=no20; st=t; log(no19,no20,st);
																											
																											refresh();
																											send(cn,dest,destip,ct);
																										}
																										else
																										{
																											Thread.sleep(2000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											Thread.sleep(1000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											no20="Node20->";

																											frm=no18; to=no20; st=t; log(no18,no20,st);
																											
																											refresh();
																											send(cn,dest,destip,ct);
																										
																										}
																									}
																								}
																								else
																								{
																									Thread.sleep(2000);
																									c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									c22.setIcon(c2g);
																									no17="Node17->";
																									
																									Thread.sleep(2000);
																									c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									c22.setIcon(c2g);
																									no17="Node17->";

																									frm=no15; to=no17; st=t; log(no15,no17,st);
																									
																									if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																									{
																										Thread.sleep(2000);
																										c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c33.setIcon(c3g);
																										no18="Node18->";
																										
																										Thread.sleep(2000);
																										c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c33.setIcon(c3g);
																										no18="Node18->";

																										frm=no17; to=no18; st=t; log(no17,no18,st);
																										
																										if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																										{
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											Thread.sleep(1000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											no20="Node20->";

																											frm=no18; to=no19; st=t; log(no18,no19,st);

																											frm=no19; to=no20; st=t; log(no19,no20,st);
																											
																											refresh();
																											send(cn,dest,destip,ct);
																										}
																										else
																										{
																											Thread.sleep(2000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											Thread.sleep(1000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											no20="Node20->";

																											frm=no18; to=no20; st=t; log(no18,no20,st);
																											
																											refresh();
																											send(cn,dest,destip,ct);
																										
																										}
																										
																									}
																									else
																									{
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										Thread.sleep(1000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										no20="Node20->";

																										frm=no17; to=no19; st=t; log(no17,no19,st);

																										frm=no19; to=no20; st=t; log(no19,no20,st);
																										
																										refresh();
																										send(cn,dest,destip,ct);
																									}
																								}
																							}
																							else
																							{
																								Thread.sleep(2000);																														Thread.sleep(2000);
																								b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								b88.setIcon(b8g);
																								no16="Node16->";
																								
																								Thread.sleep(2000);
																								b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								b88.setIcon(b8g);
																								no16="Node16->";

																								frm=no14; to=no16; st=t; log(no14,no16,st);
																								
																								if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																								{
																									Thread.sleep(2000);
																									c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									c22.setIcon(c2g);
																									no17="Node17->";
																									
																									Thread.sleep(2000);
																									c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									c22.setIcon(c2g);
																									no17="Node17->";

																									frm=no16; to=no17; st=t; log(no16,no17,st);
																									
																									if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																									{
																										Thread.sleep(2000);
																										c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c33.setIcon(c3g);
																										no18="Node18->";
																										
																										Thread.sleep(2000);
																										c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c33.setIcon(c3g);
																										no18="Node18->";

																										frm=no17; to=no18; st=t; log(no17,no18,st);
																										
																										if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																										{
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											Thread.sleep(1000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											no20="Node20->";

																											frm=no18; to=no19; st=t; log(no18,no19,st);

																											frm=no19; to=no20; st=t; log(no19,no20,st);
																											
																											refresh();
																											send(cn,dest,destip,ct);
																										}
																										else
																										{
																											Thread.sleep(2000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											Thread.sleep(1000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											no20="Node20->";

																											frm=no18; to=no20; st=t; log(no18,no20,st);
																											
																											refresh();
																											send(cn,dest,destip,ct);
																										
																										}
																										
																									}
																									else
																									{
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										Thread.sleep(1000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										no20="Node20->";

																										frm=no17; to=no19; st=t; log(no17,no19,st);

																										frm=no19; to=no20; st=t; log(no19,no20,st);
																										
																										refresh();
																										send(cn,dest,destip,ct);
																									}
																								}
																								else
																								{
																									Thread.sleep(2000);
																									c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									c33.setIcon(c3g);
																									no18="Node18->";
																									
																									Thread.sleep(2000);
																									c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									c33.setIcon(c3g);
																									no18="Node18->";

																									frm=no16; to=no18; st=t; log(no16,no18,st);
																									
																									if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																									{
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										Thread.sleep(1000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										no20="Node20->";

																										frm=no18; to=no19; st=t; log(no18,no19,st);

																										frm=no19; to=no20; st=t; log(no19,no20,st);
																										
																										refresh();
																										send(cn,dest,destip,ct);
																									}
																									else
																									{
																										Thread.sleep(2000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										Thread.sleep(1000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										no20="Node20->";

																										frm=no18; to=no20; st=t; log(no18,no20,st);
																										
																										refresh();
																										send(cn,dest,destip,ct);
																									
																									}
																								}
																							}
																						}
																						else
																						{
																							Thread.sleep(2000);
																							b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							b77.setIcon(b7g);
																							no15="Node15->";
																							
																							Thread.sleep(2000);
																							b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							b77.setIcon(b7g);
																							no15="Node15->";

																							frm=no13; to=no15; st=t; log(no13,no15,st);
																							
																							if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
																							{
																								Thread.sleep(2000);
																								b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								b88.setIcon(b8g);
																								no16="Node16->";
																								
																								Thread.sleep(2000);
																								b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								b88.setIcon(b8g);
																								no16="Node16->";

																								frm=no15; to=no16; st=t; log(no15,no16,st);
																								
																								if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																								{
																									Thread.sleep(2000);
																									c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									c22.setIcon(c2g);
																									no17="Node17->";
																									
																									Thread.sleep(2000);
																									c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									c22.setIcon(c2g);
																									no17="Node17->";

																									frm=no16; to=no17; st=t; log(no16,no17,st);
																									
																									if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																									{
																										Thread.sleep(2000);
																										c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c33.setIcon(c3g);
																										no18="Node18->";
																										
																										Thread.sleep(2000);
																										c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c33.setIcon(c3g);
																										no18="Node18->";

																										frm=no17; to=no18; st=t; log(no17,no18,st);
																										
																										if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																										{
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											Thread.sleep(1000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											no20="Node20->";

																											frm=no18; to=no19; st=t; log(no18,no19,st);

																											frm=no19; to=no20; st=t; log(no19,no20,st);
																											
																											refresh();
																											send(cn,dest,destip,ct);
																										}
																										else
																										{
																											Thread.sleep(2000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											Thread.sleep(1000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											no20="Node20->";

																											frm=no18; to=no20; st=t; log(no18,no20,st);
																											
																											refresh();
																											send(cn,dest,destip,ct);
																										
																										}
																										
																									}
																									else
																									{
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										Thread.sleep(1000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										no20="Node20->";

																										frm=no17; to=no19; st=t; log(no17,no19,st);

																										frm=no19; to=no20; st=t; log(no19,no20,st);
																										
																										refresh();
																										send(cn,dest,destip,ct);
																									}
																								}
																								else
																								{
																									Thread.sleep(2000);
																									c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									c33.setIcon(c3g);
																									no18="Node18->";
																									
																									Thread.sleep(2000);
																									c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									c33.setIcon(c3g);
																									no18="Node18->";

																									frm=no16; to=no18; st=t; log(no16,no18,st);
																									
																									if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																									{
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										Thread.sleep(1000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										no20="Node20->";

																										frm=no18; to=no19; st=t; log(no18,no19,st);

																										frm=no19; to=no20; st=t; log(no19,no20,st);
																										
																										refresh();
																										send(cn,dest,destip,ct);
																									}
																									else
																									{
																										Thread.sleep(2000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										Thread.sleep(1000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										no20="Node20->";

																										frm=no18; to=no20; st=t; log(no18,no20,st);
																										
																										refresh();
																										send(cn,dest,destip,ct);
																									
																									}
																								}
																							}
																							else
																							{
																								Thread.sleep(2000);
																								c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								c22.setIcon(c2g);
																								no17="Node17->";
																								
																								Thread.sleep(2000);
																								c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								c22.setIcon(c2g);
																								no17="Node17->";

																								frm=no15; to=no17; st=t; log(no15,no17,st);
																								
																								if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																								{
																									Thread.sleep(2000);
																									c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									c33.setIcon(c3g);
																									no18="Node18->";
																									
																									Thread.sleep(2000);
																									c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									c33.setIcon(c3g);
																									no18="Node18->";

																									frm=no17; to=no18; st=t; log(no17,no18,st);
																									
																									if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																									{
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										Thread.sleep(1000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										no20="Node20->";

																										frm=no18; to=no19; st=t; log(no18,no19,st);

																										frm=no19; to=no20; st=t; log(no19,no20,st);
																										
																										refresh();
																										send(cn,dest,destip,ct);
																									}
																									else
																									{
																										Thread.sleep(2000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										Thread.sleep(1000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										no20="Node20->";

																										frm=no18; to=no20; st=t; log(no18,no20,st);
																										
																										refresh();
																										send(cn,dest,destip,ct);
																									
																									}
																									
																								}
																								else
																								{
																									Thread.sleep(2000);
																									c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									c44.setIcon(c4g);
																									no19="Node19->";
																									
																									Thread.sleep(2000);
																									c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									c44.setIcon(c4g);
																									no19="Node19->";
																									
																									Thread.sleep(2000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									Thread.sleep(1000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									no20="Node20->";

																									frm=no17; to=no19; st=t; log(no17,no19,st);

																									frm=no19; to=no20; st=t; log(no19,no20,st);
																									
																									refresh();
																									send(cn,dest,destip,ct);
																								}
																							}
																						}
																					}
																					else
																					{
																						mac13(no13,mac13);
																					}
																				}
																				else
																				{
																					ene13(no13,ene13);
																				}
																			}
																			else
																			{
																				dist13();
																			}
																		}
																		else
																		{
																			mac12(no12,mac12);
																		}
																	}
																	else
																	{
																		ene12(no12,ene12);
																	}
																}
																else
																{
																	dist12();
																}
																
															}
															else
															{
																mac11(no11,mac11);
															}
														}
														else
														{
															ene11(no11,ene11);
														}
													}
													else
													{
														dist11();
													}
												}
												else
												{
													mac10(no10,mac10);
												}
											}
											else
											{
												ene10(no10,ene10);
											}
										}
										else
										{
											dist10();
										}
									}
									else
									{
										mac9(no9,mac9);
									}
								}
								else
								{
									ene9(no9,ene9);
								}
									
							}
							else
							{
								dist9();
							}
							
						}
						else
						{
							dist8();
						}
						
					}
					else
					{
						dist7();
					}
				}
				else
				{
					dist6();
				}
			}

			 void dist5() throws InterruptedException, UnknownHostException, IOException, SQLException {

					Thread.sleep(2000);
					a6g=new ImageIcon(this.getClass().getResource("g.jpg"));
					a66.setIcon(a6g);
					no6="Node6->";
					
					Thread.sleep(2000);
					a6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
					a66.setIcon(a6g);
					no6="Node6->";
					
					frm=no4; to=no6; st=t; log(no4,no6,st);
					
					if(Integer.parseInt(dis7)<=Integer.parseInt(dis8))
					{
						Thread.sleep(2000);
						a7g=new ImageIcon(this.getClass().getResource("g.jpg"));
						a77.setIcon(a7g);
						no7="Node7->";
						
						Thread.sleep(2000);
						a7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
						a77.setIcon(a7g);
						no7="Node7->";

						frm=no6; to=no7; st=t; log(no6,no7,st);
						
						if(Integer.parseInt(dis8)<=Integer.parseInt(dis9))
						{
							Thread.sleep(2000);
							a8g=new ImageIcon(this.getClass().getResource("g.jpg"));
							a88.setIcon(a8g);
							no8="Node8->";
							
							Thread.sleep(2000);
							a8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							a88.setIcon(a8g);
							no8="Node8->";

							frm=no7; to=no8; st=t; log(no7,no8,st);
							
							if(Integer.parseInt(dis9)<=Integer.parseInt(dis10))
							{
								if(Integer.parseInt(ene9)>=fsize)
								{
									if(mac.equalsIgnoreCase(mac9))
									{
										Thread.sleep(2000);
										a9g=new ImageIcon(this.getClass().getResource("g.jpg"));
										a99.setIcon(a9g);
										no9="Node9->";
									
										Thread.sleep(2000);
										a9g=new ImageIcon(this.getClass().getResource("rec.jpg"));
										a99.setIcon(a9g);
										no9="Node9->";

										frm=no8; to=no9; st=t; log(no8,no9,st);
										
										
										if(Integer.parseInt(dis10)<=Integer.parseInt(dis11))
										{
											
											if(Integer.parseInt(ene10)>=fsize)
											{
												if(mac.equalsIgnoreCase(mac10))
												{
													Thread.sleep(2000);
													b2g=new ImageIcon(this.getClass().getResource("g.jpg"));
													b22.setIcon(b2g);
													no10="Node10->";
												
													Thread.sleep(2000);
													b2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													b22.setIcon(b2g);
													no10="Node10->";

													frm=no9; to=no10; st=t; log(no9,no10,st);
													
													if(Integer.parseInt(dis11)<=Integer.parseInt(dis12))
													{
														
														if(Integer.parseInt(ene11)>=fsize)
														{
															if(mac.equalsIgnoreCase(mac11))
															{
																Thread.sleep(2000);
																b3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																b33.setIcon(b3g);
																no11="Node11->";
															
																Thread.sleep(2000);
																b3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																b33.setIcon(b3g);
																no11="Node11->";

																frm=no10; to=no11; st=t; log(no10,no11,st);
																
																if(Integer.parseInt(dis12)<=Integer.parseInt(dis13))
																{
																	
																	if(Integer.parseInt(ene12)>=fsize)
																	{
																		if(mac.equalsIgnoreCase(mac12))
																		{
																			Thread.sleep(2000);
																			b4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																			b44.setIcon(b4g);
																			no12="Node12->";
																		
																			Thread.sleep(2000);
																			b4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																			b44.setIcon(b4g);
																			no12="Node12->";

																			frm=no11; to=no12; st=t; log(no11,no12,st);
																			
																			if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
																			{
																				
																				if(Integer.parseInt(ene13)>=fsize)
																				{
																					if(mac.equalsIgnoreCase(mac13))
																					{
																						Thread.sleep(2000);
																						b5g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						b55.setIcon(b5g);
																						no13="Node13->";
																					
																						Thread.sleep(2000);
																						b5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						b55.setIcon(b5g);
																						no13="Node13->";

																						frm=no12; to=no13; st=t; log(no12,no13,st);
																						
																						if(Integer.parseInt(dis14)<=Integer.parseInt(dis15))
																						{
																							Thread.sleep(2000);
																							b6g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							b66.setIcon(b6g);
																							no14="Node14->";
																							
																							Thread.sleep(2000);
																							b6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							b66.setIcon(b6g);
																							no14="Node14->";

																							frm=no13; to=no14; st=t; log(no13,no14,st);
																							
																							if(Integer.parseInt(dis15)<=Integer.parseInt(dis16))
																							{
																								Thread.sleep(2000);
																								b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								b77.setIcon(b7g);
																								no15="Node15->";
																								
																								Thread.sleep(2000);
																								b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								b77.setIcon(b7g);
																								no15="Node15->";

																								frm=no14; to=no15; st=t; log(no14,no15,st);
																								
																								if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
																								{
																									Thread.sleep(2000);
																									b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									b88.setIcon(b8g);
																									no16="Node16->";
																									
																									Thread.sleep(2000);
																									b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									b88.setIcon(b8g);
																									no16="Node16->";

																									frm=no15; to=no16; st=t; log(no15,no16,st);
																									
																									if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																									{
																										Thread.sleep(2000);
																										c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c22.setIcon(c2g);
																										no17="Node17->";
																										
																										Thread.sleep(2000);
																										c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c22.setIcon(c2g);
																										no17="Node17->";

																										frm=no16; to=no17; st=t; log(no16,no17,st);
																										
																										if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																										{
																											Thread.sleep(2000);
																											c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c33.setIcon(c3g);
																											no18="Node18->";
																											
																											Thread.sleep(2000);
																											c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c33.setIcon(c3g);
																											no18="Node18->";

																											frm=no17; to=no18; st=t; log(no17,no18,st);
																											
																											if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																											{
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																												c44.setIcon(c4g);
																												no19="Node19->";
																												
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no18; to=no19; st=t; log(no18,no19,st);

																												frm=no19; to=no20; st=t; log(no19,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											}
																											else
																											{
																												Thread.sleep(2000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												Thread.sleep(1000);
																												c55.setVisible(false);
																												Thread.sleep(1000);
																												c55.setVisible(true);
																												no20="Node20->";

																												frm=no18; to=no20; st=t; log(no18,no20,st);
																												
																												refresh();
																												send(cn,dest,destip,ct);
																											
																											}
																											
																										}
																										else
																										{
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											Thread.sleep(1000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											no20="Node20->";

																											frm=no17; to=no19; st=t; log(no17,no19,st);

																											frm=no19; to=no20; st=t; log(no19,no20,st);
																											
																											refresh();
																											send(cn,dest,destip,ct);
																										}
																									}
																									else
																									{
																										Thread.sleep(2000);
																										c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c33.setIcon(c3g);
																										no18="Node18->";
																										
																										Thread.sleep(2000);
																										c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c33.setIcon(c3g);
																										no18="Node18->";

																										frm=no16; to=no18; st=t; log(no16,no18,st);
																										
																										if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																										{
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											Thread.sleep(1000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											no20="Node20->";

																											frm=no18; to=no19; st=t; log(no18,no19,st);

																											frm=no19; to=no20; st=t; log(no19,no20,st);
																											
																											refresh();
																											send(cn,dest,destip,ct);
																										}
																										else
																										{
																											Thread.sleep(2000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											Thread.sleep(1000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											no20="Node20->";

																											frm=no18; to=no20; st=t; log(no18,no20,st);
																											
																											refresh();
																											send(cn,dest,destip,ct);
																										
																										}
																									}
																								}
																								else
																								{
																									Thread.sleep(2000);
																									c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									c22.setIcon(c2g);
																									no17="Node17->";
																									
																									Thread.sleep(2000);
																									c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									c22.setIcon(c2g);
																									no17="Node17->";

																									frm=no15; to=no17; st=t; log(no15,no17,st);
																									
																									if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																									{
																										Thread.sleep(2000);
																										c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c33.setIcon(c3g);
																										no18="Node18->";
																										
																										Thread.sleep(2000);
																										c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c33.setIcon(c3g);
																										no18="Node18->";

																										frm=no17; to=no18; st=t; log(no17,no18,st);
																										
																										if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																										{
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											Thread.sleep(1000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											no20="Node20->";

																											frm=no18; to=no19; st=t; log(no18,no19,st);

																											frm=no19; to=no20; st=t; log(no19,no20,st);
																											
																											refresh();
																											send(cn,dest,destip,ct);
																										}
																										else
																										{
																											Thread.sleep(2000);
																											c5g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c55.setIcon(c5g);
																											no20="Node20->";
																											
																											Thread.sleep(2000);
																											c5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c55.setIcon(c5g);
																											no20="Node20->";

																											frm=no18; to=no20; st=t; log(no18,no20,st);
																											
																											refresh();
																											send(cn,dest,destip,ct);
																										
																										}
																										
																									}
																									else
																									{
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										Thread.sleep(1000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										no20="Node20->";

																										frm=no17; to=no19; st=t; log(no17,no19,st);

																										frm=no19; to=no20; st=t; log(no19,no20,st);
																										
																										refresh();
																										send(cn,dest,destip,ct);
																									}
																								}
																							}
																							else
																							{
																								Thread.sleep(2000);																														Thread.sleep(2000);
																								b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								b88.setIcon(b8g);
																								no16="Node16->";
																								
																								Thread.sleep(2000);
																								b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								b88.setIcon(b8g);
																								no16="Node16->";

																								frm=no14; to=no16; st=t; log(no14,no16,st);
																								
																								if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																								{
																									Thread.sleep(2000);
																									c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									c22.setIcon(c2g);
																									no17="Node17->";
																									
																									Thread.sleep(2000);
																									c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									c22.setIcon(c2g);
																									no17="Node17->";

																									frm=no16; to=no17; st=t; log(no16,no17,st);
																									
																									if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																									{
																										Thread.sleep(2000);
																										c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c33.setIcon(c3g);
																										no18="Node18->";
																										
																										Thread.sleep(2000);
																										c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c33.setIcon(c3g);
																										no18="Node18->";

																										frm=no17; to=no18; st=t; log(no17,no18,st);
																										
																										if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																										{
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											Thread.sleep(1000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											no20="Node20->";

																											frm=no18; to=no19; st=t; log(no18,no19,st);

																											frm=no19; to=no20; st=t; log(no19,no20,st);
																											
																											refresh();
																											send(cn,dest,destip,ct);
																										}
																										else
																										{
																											Thread.sleep(2000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											Thread.sleep(1000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											no20="Node20->";

																											frm=no18; to=no20; st=t; log(no18,no20,st);
																											
																											refresh();
																											send(cn,dest,destip,ct);
																										
																										}
																										
																									}
																									else
																									{
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										Thread.sleep(1000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										no20="Node20->";
																										
																										frm=no17; to=no19; st=t; log(no17,no19,st);

																										frm=no19; to=no20; st=t; log(no19,no20,st);
																										
																										refresh();
																										send(cn,dest,destip,ct);
																									}
																								}
																								else
																								{
																									Thread.sleep(2000);
																									c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									c33.setIcon(c3g);
																									no18="Node18->";
																									
																									Thread.sleep(2000);
																									c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									c33.setIcon(c3g);
																									no18="Node18->";

																									frm=no16; to=no18; st=t; log(no16,no18,st);
																									
																									if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																									{
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										Thread.sleep(1000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										no20="Node20->";

																										frm=no18; to=no19; st=t; log(no18,no19,st);

																										frm=no19; to=no20; st=t; log(no19,no20,st);
																										
																										refresh();
																										send(cn,dest,destip,ct);
																									}
																									else
																									{
																										Thread.sleep(2000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										Thread.sleep(1000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										no20="Node20->";

																										frm=no18; to=no20; st=t; log(no18,no20,st);
																										
																										refresh();
																										send(cn,dest,destip,ct);
																									
																									}
																								}
																							}
																						}
																						else
																						{
																							Thread.sleep(2000);
																							b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							b77.setIcon(b7g);
																							no15="Node15->";
																							
																							Thread.sleep(2000);
																							b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							b77.setIcon(b7g);
																							no15="Node15->";

																							frm=no13; to=no15; st=t; log(no13,no15,st);
																							
																							if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
																							{
																								Thread.sleep(2000);
																								b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								b88.setIcon(b8g);
																								no16="Node16->";
																								
																								Thread.sleep(2000);
																								b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								b88.setIcon(b8g);
																								no16="Node16->";

																								frm=no15; to=no16; st=t; log(no15,no16,st);
																								
																								if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																								{
																									Thread.sleep(2000);
																									c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									c22.setIcon(c2g);
																									no17="Node17->";
																									
																									Thread.sleep(2000);
																									c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									c22.setIcon(c2g);
																									no17="Node17->";

																									frm=no16; to=no17; st=t; log(no16,no17,st);
																									
																									if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																									{
																										Thread.sleep(2000);
																										c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c33.setIcon(c3g);
																										no18="Node18->";
																										
																										Thread.sleep(2000);
																										c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c33.setIcon(c3g);
																										no18="Node18->";

																										frm=no17; to=no18; st=t; log(no17,no18,st);
																										
																										if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																										{
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																											c44.setIcon(c4g);
																											no19="Node19->";
																											
																											Thread.sleep(2000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											Thread.sleep(1000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											no20="Node20->";

																											frm=no18; to=no19; st=t; log(no18,no19,st);

																											frm=no19; to=no20; st=t; log(no19,no20,st);
																											
																											refresh();
																											send(cn,dest,destip,ct);
																										}
																										else
																										{
																											Thread.sleep(2000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											Thread.sleep(1000);
																											c55.setVisible(false);
																											Thread.sleep(1000);
																											c55.setVisible(true);
																											no20="Node20->";

																											frm=no18; to=no20; st=t; log(no18,no20,st);
																											
																											refresh();
																											send(cn,dest,destip,ct);
																										
																										}
																										
																									}
																									else
																									{
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										Thread.sleep(1000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										no20="Node20->";

																										frm=no17; to=no19; st=t; log(no17,no19,st);

																										frm=no19; to=no20; st=t; log(no19,no20,st);
																										
																										refresh();
																										send(cn,dest,destip,ct);
																									}
																								}
																								else
																								{
																									Thread.sleep(2000);
																									c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									c33.setIcon(c3g);
																									no18="Node18->";
																									
																									Thread.sleep(2000);
																									c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									c33.setIcon(c3g);
																									no18="Node18->";

																									frm=no16; to=no18; st=t; log(no16,no18,st);
																									
																									if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																									{
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										Thread.sleep(1000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										no20="Node20->";

																										frm=no18; to=no19; st=t; log(no18,no19,st);

																										frm=no19; to=no20; st=t; log(no19,no20,st);
																										
																										refresh();
																										send(cn,dest,destip,ct);
																									}
																									else
																									{
																										Thread.sleep(2000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										Thread.sleep(1000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										no20="Node20->";

																										frm=no18; to=no20; st=t; log(no18,no20,st);
																										
																										refresh();
																										send(cn,dest,destip,ct);
																									
																									}
																								}
																							}
																							else
																							{
																								Thread.sleep(2000);
																								c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								c22.setIcon(c2g);
																								no17="Node17->";
																								
																								Thread.sleep(2000);
																								c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								c22.setIcon(c2g);
																								no17="Node17->";

																								frm=no15; to=no17; st=t; log(no15,no17,st);
																								
																								if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																								{
																									Thread.sleep(2000);
																									c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									c33.setIcon(c3g);
																									no18="Node18->";
																									
																									Thread.sleep(2000);
																									c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									c33.setIcon(c3g);
																									no18="Node18->";

																									frm=no17; to=no18; st=t; log(no17,no18,st);
																									
																									if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																									{
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										Thread.sleep(1000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										no20="Node20->";

																										frm=no18; to=no19; st=t; log(no18,no19,st);

																										frm=no19; to=no20; st=t; log(no19,no20,st);
																										
																										refresh();
																										send(cn,dest,destip,ct);
																									}
																									else
																									{
																										Thread.sleep(2000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										Thread.sleep(1000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										no20="Node20->";

																										frm=no18; to=no20; st=t; log(no18,no20,st);
																										
																										refresh();
																										send(cn,dest,destip,ct);
																									
																									}
																									
																								}
																								else
																								{
																									Thread.sleep(2000);
																									c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									c44.setIcon(c4g);
																									no19="Node19->";
																									
																									Thread.sleep(2000);
																									c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									c44.setIcon(c4g);
																									no19="Node19->";
																									
																									Thread.sleep(2000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									Thread.sleep(1000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									no20="Node20->";

																									frm=no17; to=no19; st=t; log(no17,no19,st);

																									frm=no19; to=no20; st=t; log(no19,no20,st);
																									
																									refresh();
																									send(cn,dest,destip,ct);
																								}
																							}
																						}
																					}
																					else
																					{
																						mac13(no13,mac13);
																					}
																				}
																				else
																				{
																					ene13(no13,ene13);
																				}
																			}
																			else
																			{
																				dist13();
																			}
																		}
																		else
																		{
																			mac12(no12,mac12);
																		}
																	}
																	else
																	{
																		ene12(no12,ene12);
																	}
																}
																else
																{
																	dist12();
																}
																
															}
															else
															{
																mac11(no11,mac11);
															}
														}
														else
														{
															ene11(no11,ene11);
														}
													}
													else
													{
														dist11();
													}
												}
												else
												{
													mac10(no10,mac10);
												}
											}
											else
											{
												ene10(no10,ene10);
											}
										}
										else
										{
											dist10();
										}
									}
									else
									{
										mac9(no9,mac9);
									}
								}
								else
								{
									ene9(no9,ene9);
								}
									
							}
							else
							{
								dist9();
							}
							
						}
						else
						{
							dist8();
						}
						
					}
					else
					{
						dist7();
					}
			 }

			void dist6() throws InterruptedException, UnknownHostException, IOException, SQLException {

				Thread.sleep(2000);
				a7g=new ImageIcon(this.getClass().getResource("g.jpg"));
				a77.setIcon(a7g);
				no7="Node7->";
				
				Thread.sleep(2000);
				a7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
				a77.setIcon(a7g);
				no7="Node7->";

				frm=no5; to=no7; st=t; log(no5,no7,st);
				
				if(Integer.parseInt(dis8)<=Integer.parseInt(dis9))
				{
					Thread.sleep(2000);
					a8g=new ImageIcon(this.getClass().getResource("g.jpg"));
					a88.setIcon(a8g);
					no8="Node8->";
					
					Thread.sleep(2000);
					a8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
					a88.setIcon(a8g);
					no8="Node8->";

					frm=no7; to=no8; st=t; log(no7,no8,st);
					
					if(Integer.parseInt(dis9)<=Integer.parseInt(dis10))
					{
						if(Integer.parseInt(ene9)>=fsize)
						{
							if(mac.equalsIgnoreCase(mac9))
							{
								Thread.sleep(2000);
								a9g=new ImageIcon(this.getClass().getResource("g.jpg"));
								a99.setIcon(a9g);
								no9="Node9->";
							
								Thread.sleep(2000);
								a9g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								a99.setIcon(a9g);
								no9="Node9->";

								frm=no8; to=no9; st=t; log(no8,no9,st);
								
								
								if(Integer.parseInt(dis10)<=Integer.parseInt(dis11))
								{
									
									if(Integer.parseInt(ene10)>=fsize)
									{
										if(mac.equalsIgnoreCase(mac10))
										{
											Thread.sleep(2000);
											b2g=new ImageIcon(this.getClass().getResource("g.jpg"));
											b22.setIcon(b2g);
											no10="Node10->";
										
											Thread.sleep(2000);
											b2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											b22.setIcon(b2g);
											no10="Node10->";

											frm=no9; to=no10; st=t; log(no9,no10,st);
											
											if(Integer.parseInt(dis11)<=Integer.parseInt(dis12))
											{
												
												if(Integer.parseInt(ene11)>=fsize)
												{
													if(mac.equalsIgnoreCase(mac11))
													{
														Thread.sleep(2000);
														b3g=new ImageIcon(this.getClass().getResource("g.jpg"));
														b33.setIcon(b3g);
														no11="Node11->";
													
														Thread.sleep(2000);
														b3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														b33.setIcon(b3g);
														no11="Node11->";

														frm=no10; to=no11; st=t; log(no10,no11,st);
														
														if(Integer.parseInt(dis12)<=Integer.parseInt(dis13))
														{
															
															if(Integer.parseInt(ene12)>=fsize)
															{
																if(mac.equalsIgnoreCase(mac12))
																{
																	Thread.sleep(2000);
																	b4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	b44.setIcon(b4g);
																	no12="Node12->";
																
																	Thread.sleep(2000);
																	b4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	b44.setIcon(b4g);
																	no12="Node12->";

																	frm=no11; to=no12; st=t; log(no11,no12,st);
																	
																	if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
																	{
																		
																		if(Integer.parseInt(ene13)>=fsize)
																		{
																			if(mac.equalsIgnoreCase(mac13))
																			{
																				Thread.sleep(2000);
																				b5g=new ImageIcon(this.getClass().getResource("g.jpg"));
																				b55.setIcon(b5g);
																				no13="Node13->";
																			
																				Thread.sleep(2000);
																				b5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																				b55.setIcon(b5g);
																				no13="Node13->";

																				frm=no12; to=no13; st=t; log(no12,no13,st);
																				
																				if(Integer.parseInt(dis14)<=Integer.parseInt(dis15))
																				{
																					Thread.sleep(2000);
																					b6g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					b66.setIcon(b6g);
																					no14="Node14->";
																					
																					Thread.sleep(2000);
																					b6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					b66.setIcon(b6g);
																					no14="Node14->";

																					frm=no13; to=no14; st=t; log(no13,no14,st);
																					
																					if(Integer.parseInt(dis15)<=Integer.parseInt(dis16))
																					{
																						Thread.sleep(2000);
																						b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						b77.setIcon(b7g);
																						no15="Node15->";
																						
																						Thread.sleep(2000);
																						b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						b77.setIcon(b7g);
																						no15="Node15->";

																						frm=no14; to=no15; st=t; log(no14,no15,st);
																						
																						if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
																						{
																							Thread.sleep(2000);
																							b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							b88.setIcon(b8g);
																							no16="Node16->";
																							
																							Thread.sleep(2000);
																							b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							b88.setIcon(b8g);
																							no16="Node16->";

																							frm=no15; to=no16; st=t; log(no15,no16,st);
																							
																							if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																							{
																								Thread.sleep(2000);
																								c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								c22.setIcon(c2g);
																								no17="Node17->";
																								
																								Thread.sleep(2000);
																								c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								c22.setIcon(c2g);
																								no17="Node17->";

																								frm=no16; to=no17; st=t; log(no16,no17,st);
																								
																								if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																								{
																									Thread.sleep(2000);
																									c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									c33.setIcon(c3g);
																									no18="Node18->";
																									
																									Thread.sleep(2000);
																									c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									c33.setIcon(c3g);
																									no18="Node18->";

																									frm=no17; to=no18; st=t; log(no17,no18,st);
																									
																									if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																									{
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																										c44.setIcon(c4g);
																										no19="Node19->";
																										
																										Thread.sleep(2000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										Thread.sleep(1000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										no20="Node20->";

																										frm=no18; to=no19; st=t; log(no18,no19,st);

																										frm=no19; to=no20; st=t; log(no19,no20,st);
																										
																										refresh();
																										send(cn,dest,destip,ct);
																									}
																									else
																									{
																										Thread.sleep(2000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										Thread.sleep(1000);
																										c55.setVisible(false);
																										Thread.sleep(1000);
																										c55.setVisible(true);
																										no20="Node20->";

																										frm=no18; to=no20; st=t; log(no18,no20,st);
																										
																										refresh();
																										send(cn,dest,destip,ct);
																									
																									}
																									
																								}
																								else
																								{
																									Thread.sleep(2000);
																									c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									c44.setIcon(c4g);
																									no19="Node19->";
																									
																									Thread.sleep(2000);
																									c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									c44.setIcon(c4g);
																									no19="Node19->";
																									
																									Thread.sleep(2000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									Thread.sleep(1000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									no20="Node20->";

																									frm=no17; to=no19; st=t; log(no17,no19,st);

																									frm=no19; to=no20; st=t; log(no19,no20,st);
																									
																									refresh();
																									send(cn,dest,destip,ct);
																								}
																							}
																							else
																							{
																								Thread.sleep(2000);
																								c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								c33.setIcon(c3g);
																								no18="Node18->";
																								
																								Thread.sleep(2000);
																								c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								c33.setIcon(c3g);
																								no18="Node18->";

																								frm=no16; to=no18; st=t; log(no16,no18,st);
																								
																								if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																								{
																									Thread.sleep(2000);
																									c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									c44.setIcon(c4g);
																									no19="Node19->";
																									
																									Thread.sleep(2000);
																									c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									c44.setIcon(c4g);
																									no19="Node19->";
																									
																									Thread.sleep(2000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									Thread.sleep(1000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									no20="Node20->";

																									frm=no18; to=no19; st=t; log(no18,no19,st);

																									frm=no19; to=no20; st=t; log(no19,no20,st);
																									
																									refresh();
																									send(cn,dest,destip,ct);
																								}
																								else
																								{
																									Thread.sleep(2000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									Thread.sleep(1000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									no20="Node20->";

																									frm=no18; to=no20; st=t; log(no18,no20,st);
																									
																									refresh();
																									send(cn,dest,destip,ct);
																								
																								}
																							}
																						}
																						else
																						{
																							Thread.sleep(2000);
																							c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c22.setIcon(c2g);
																							no17="Node17->";
																							
																							Thread.sleep(2000);
																							c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c22.setIcon(c2g);
																							no17="Node17->";

																							frm=no15; to=no17; st=t; log(no15,no17,st);
																							
																							if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																							{
																								Thread.sleep(2000);
																								c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								c33.setIcon(c3g);
																								no18="Node18->";
																								
																								Thread.sleep(2000);
																								c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								c33.setIcon(c3g);
																								no18="Node18->";

																								frm=no17; to=no18; st=t; log(no17,no18,st);
																								
																								if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																								{
																									Thread.sleep(2000);
																									c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									c44.setIcon(c4g);
																									no19="Node19->";
																									
																									Thread.sleep(2000);
																									c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									c44.setIcon(c4g);
																									no19="Node19->";
																									
																									Thread.sleep(2000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									Thread.sleep(1000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									no20="Node20->";

																									frm=no18; to=no19; st=t; log(no18,no19,st);

																									frm=no19; to=no20; st=t; log(no19,no20,st);
																									
																									refresh();
																									send(cn,dest,destip,ct);
																								}
																								else
																								{
																									Thread.sleep(2000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									Thread.sleep(1000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									no20="Node20->";

																									frm=no18; to=no20; st=t; log(no18,no20,st);
																									
																									refresh();
																									send(cn,dest,destip,ct);
																								
																								}
																								
																							}
																							else
																							{
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								Thread.sleep(1000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								no20="Node20->";

																								frm=no17; to=no19; st=t; log(no17,no19,st);

																								frm=no19; to=no20; st=t; log(no19,no20,st);
																								
																								refresh();
																								send(cn,dest,destip,ct);
																							}
																						}
																					}
																					else
																					{
																						Thread.sleep(2000);																														Thread.sleep(2000);
																						b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						b88.setIcon(b8g);
																						no16="Node16->";
																						
																						Thread.sleep(2000);
																						b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						b88.setIcon(b8g);
																						no16="Node16->";

																						frm=no14; to=no16; st=t; log(no14,no16,st);
																						
																						if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																						{
																							Thread.sleep(2000);
																							c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c22.setIcon(c2g);
																							no17="Node17->";
																							
																							Thread.sleep(2000);
																							c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c22.setIcon(c2g);
																							no17="Node17->";

																							frm=no16; to=no17; st=t; log(no16,no17,st);
																							
																							if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																							{
																								Thread.sleep(2000);
																								c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								c33.setIcon(c3g);
																								no18="Node18->";
																								
																								Thread.sleep(2000);
																								c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								c33.setIcon(c3g);
																								no18="Node18->";

																								frm=no17; to=no18; st=t; log(no17,no18,st);
																								
																								if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																								{
																									Thread.sleep(2000);
																									c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									c44.setIcon(c4g);
																									no19="Node19->";
																									
																									Thread.sleep(2000);
																									c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									c44.setIcon(c4g);
																									no19="Node19->";
																									
																									Thread.sleep(2000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									Thread.sleep(1000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									no20="Node20->";

																									frm=no18; to=no19; st=t; log(no18,no19,st);

																									frm=no19; to=no20; st=t; log(no19,no20,st);
																									
																									refresh();
																									send(cn,dest,destip,ct);
																								}
																								else
																								{
																									Thread.sleep(2000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									Thread.sleep(1000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									no20="Node20->";

																									frm=no18; to=no20; st=t; log(no18,no20,st);
																									
																									refresh();
																									send(cn,dest,destip,ct);
																								
																								}
																								
																							}
																							else
																							{
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								Thread.sleep(1000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								no20="Node20->";

																								frm=no17; to=no19; st=t; log(no17,no19,st);

																								frm=no19; to=no20; st=t; log(no19,no20,st);
																								
																								refresh();
																								send(cn,dest,destip,ct);
																							}
																						}
																						else
																						{
																							Thread.sleep(2000);
																							c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c33.setIcon(c3g);
																							no18="Node18->";
																							
																							Thread.sleep(2000);
																							c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c33.setIcon(c3g);
																							no18="Node18->";

																							frm=no16; to=no18; st=t; log(no16,no18,st);
																							
																							if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																							{
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								Thread.sleep(1000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								no20="Node20->";

																								frm=no18; to=no19; st=t; log(no18,no19,st);

																								frm=no19; to=no20; st=t; log(no19,no20,st);
																								
																								refresh();
																								send(cn,dest,destip,ct);
																							}
																							else
																							{
																								Thread.sleep(2000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								Thread.sleep(1000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								no20="Node20->";

																								frm=no18; to=no20; st=t; log(no18,no20,st);
																								
																								refresh();
																								send(cn,dest,destip,ct);
																							
																							}
																						}
																					}
																				}
																				else
																				{
																					Thread.sleep(2000);
																					b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					b77.setIcon(b7g);
																					no15="Node15->";
																					
																					Thread.sleep(2000);
																					b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					b77.setIcon(b7g);
																					no15="Node15->";

																					frm=no13; to=no15; st=t; log(no13,no15,st);
																					
																					if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
																					{
																						Thread.sleep(2000);
																						b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						b88.setIcon(b8g);
																						no16="Node16->";
																						
																						Thread.sleep(2000);
																						b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						b88.setIcon(b8g);
																						no16="Node16->";

																						frm=no15; to=no16; st=t; log(no15,no16,st);
																						
																						if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																						{
																							Thread.sleep(2000);
																							c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c22.setIcon(c2g);
																							no17="Node17->";
																							
																							Thread.sleep(2000);
																							c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c22.setIcon(c2g);
																							no17="Node17->";

																							frm=no16; to=no17; st=t; log(no16,no17,st);
																							
																							if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																							{
																								Thread.sleep(2000);
																								c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								c33.setIcon(c3g);
																								no18="Node18->";
																								
																								Thread.sleep(2000);
																								c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								c33.setIcon(c3g);
																								no18="Node18->";

																								frm=no17; to=no18; st=t; log(no17,no18,st);
																								
																								if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																								{
																									Thread.sleep(2000);
																									c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									c44.setIcon(c4g);
																									no19="Node19->";
																									
																									Thread.sleep(2000);
																									c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									c44.setIcon(c4g);
																									no19="Node19->";
																									
																									Thread.sleep(2000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									Thread.sleep(1000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									no20="Node20->";

																									frm=no18; to=no19; st=t; log(no18,no19,st);

																									frm=no19; to=no20; st=t; log(no19,no20,st);
																									
																									refresh();
																									send(cn,dest,destip,ct);
																								}
																								else
																								{
																									Thread.sleep(2000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									Thread.sleep(1000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									no20="Node20->";

																									frm=no18; to=no20; st=t; log(no18,no20,st);
																									
																									refresh();
																									send(cn,dest,destip,ct);
																								
																								}
																								
																							}
																							else
																							{
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								Thread.sleep(1000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								no20="Node20->";

																								frm=no17; to=no19; st=t; log(no17,no19,st);

																								frm=no19; to=no20; st=t; log(no19,no20,st);
																								
																								refresh();
																								send(cn,dest,destip,ct);
																							}
																						}
																						else
																						{
																							Thread.sleep(2000);
																							c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c33.setIcon(c3g);
																							no18="Node18->";
																							
																							Thread.sleep(2000);
																							c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c33.setIcon(c3g);
																							no18="Node18->";

																							frm=no16; to=no18; st=t; log(no16,no18,st);
																							
																							if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																							{
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								Thread.sleep(1000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								no20="Node20->";

																								frm=no18; to=no19; st=t; log(no18,no19,st);

																								frm=no19; to=no20; st=t; log(no19,no20,st);
																								
																								refresh();
																								send(cn,dest,destip,ct);
																							}
																							else
																							{
																								Thread.sleep(2000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								Thread.sleep(1000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								no20="Node20->";

																								frm=no18; to=no20; st=t; log(no18,no20,st);
																								
																								refresh();
																								send(cn,dest,destip,ct);
																							
																							}
																						}
																					}
																					else
																					{
																						Thread.sleep(2000);
																						c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c22.setIcon(c2g);
																						no17="Node17->";
																						
																						Thread.sleep(2000);
																						c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c22.setIcon(c2g);
																						no17="Node17->";

																						frm=no15; to=no17; st=t; log(no15,no17,st);
																						
																						if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																						{
																							Thread.sleep(2000);
																							c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c33.setIcon(c3g);
																							no18="Node18->";
																							
																							Thread.sleep(2000);
																							c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c33.setIcon(c3g);
																							no18="Node18->";

																							frm=no17; to=no18; st=t; log(no17,no18,st);
																							
																							if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																							{
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								Thread.sleep(1000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								no20="Node20->";

																								frm=no18; to=no19; st=t; log(no18,no19,st);

																								frm=no19; to=no20; st=t; log(no19,no20,st);
																								
																								refresh();
																								send(cn,dest,destip,ct);
																							}
																							else
																							{
																								Thread.sleep(2000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								Thread.sleep(1000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								no20="Node20->";

																								frm=no18; to=no20; st=t; log(no18,no20,st);
																								
																								refresh();
																								send(cn,dest,destip,ct);
																							
																							}
																							
																						}
																						else
																						{
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							Thread.sleep(1000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							no20="Node20->";

																							frm=no17; to=no19; st=t; log(no17,no19,st);

																							frm=no19; to=no20; st=t; log(no19,no20,st);
																							
																							refresh();
																							send(cn,dest,destip,ct);
																						}
																					}
																				}
																			}
																			else
																			{
																				mac13(no13,mac13);
																			}
																		}
																		else
																		{
																			ene13(no13,ene13);
																		}
																	}
																	else
																	{
																		dist13();
																	}
																}
																else
																{
																	mac12(no12,mac12);
																}
															}
															else
															{
																ene12(no12,ene12);
															}
														}
														else
														{
															dist12();
														}
														
													}
													else
													{
														mac11(no11,mac11);
													}
												}
												else
												{
													ene11(no11,ene11);
												}
											}
											else
											{
												dist11();
											}
										}
										else
										{
											mac10(no10,mac10);
										}
									}
									else
									{
										ene10(no10,ene10);
									}
								}
								else
								{
									dist10();
								}
							}
							else
							{
								mac9(no9,mac9);
							}
						}
						else
						{
							ene9(no9,ene9);
						}
							
					}
					else
					{
						dist9();
					}
					
				}
				else
				{
					dist8();
				}
			}

			void dist7() throws InterruptedException, UnknownHostException, IOException, SQLException {
				
				Thread.sleep(2000);
				a8g=new ImageIcon(this.getClass().getResource("g.jpg"));
				a88.setIcon(a8g);
				no8="Node8->";
				
				Thread.sleep(2000);
				a8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
				a88.setIcon(a8g);
				no8="Node8->";

				frm=no6; to=no8; st=t; log(no6,no8,st);
				
				if(Integer.parseInt(dis9)<=Integer.parseInt(dis10))
				{
					if(Integer.parseInt(ene9)>=fsize)
					{
						if(mac.equalsIgnoreCase(mac9))
						{
							Thread.sleep(2000);
							a9g=new ImageIcon(this.getClass().getResource("g.jpg"));
							a99.setIcon(a9g);
							no9="Node9->";
						
							Thread.sleep(2000);
							a9g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							a99.setIcon(a9g);
							no9="Node9->";

							frm=no8; to=no9; st=t; log(no8,no9,st);
							
							
							if(Integer.parseInt(dis10)<=Integer.parseInt(dis11))
							{
								
								if(Integer.parseInt(ene10)>=fsize)
								{
									if(mac.equalsIgnoreCase(mac10))
									{
										Thread.sleep(2000);
										b2g=new ImageIcon(this.getClass().getResource("g.jpg"));
										b22.setIcon(b2g);
										no10="Node10->";
									
										Thread.sleep(2000);
										b2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
										b22.setIcon(b2g);
										no10="Node10->";

										frm=no9; to=no10; st=t; log(no9,no10,st);
										
										if(Integer.parseInt(dis11)<=Integer.parseInt(dis12))
										{
											
											if(Integer.parseInt(ene11)>=fsize)
											{
												if(mac.equalsIgnoreCase(mac11))
												{
													Thread.sleep(2000);
													b3g=new ImageIcon(this.getClass().getResource("g.jpg"));
													b33.setIcon(b3g);
													no11="Node11->";
												
													Thread.sleep(2000);
													b3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													b33.setIcon(b3g);
													no11="Node11->";

													frm=no10; to=no11; st=t; log(no10,no11,st);
													
													if(Integer.parseInt(dis12)<=Integer.parseInt(dis13))
													{
														
														if(Integer.parseInt(ene12)>=fsize)
														{
															if(mac.equalsIgnoreCase(mac12))
															{
																Thread.sleep(2000);
																b4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																b44.setIcon(b4g);
																no12="Node12->";
															
																Thread.sleep(2000);
																b4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																b44.setIcon(b4g);
																no12="Node12->";

																frm=no11; to=no12; st=t; log(no11,no12,st);
																
																if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
																{
																	
																	if(Integer.parseInt(ene13)>=fsize)
																	{
																		if(mac.equalsIgnoreCase(mac13))
																		{
																			Thread.sleep(2000);
																			b5g=new ImageIcon(this.getClass().getResource("g.jpg"));
																			b55.setIcon(b5g);
																			no13="Node13->";
																		
																			Thread.sleep(2000);
																			b5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																			b55.setIcon(b5g);
																			no13="Node13->";

																			frm=no12; to=no13; st=t; log(no12,no13,st);
																			
																			if(Integer.parseInt(dis14)<=Integer.parseInt(dis15))
																			{
																				Thread.sleep(2000);
																				b6g=new ImageIcon(this.getClass().getResource("g.jpg"));
																				b66.setIcon(b6g);
																				no14="Node14->";
																				
																				Thread.sleep(2000);
																				b6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																				b66.setIcon(b6g);
																				no14="Node14->";

																				frm=no13; to=no14; st=t; log(no13,no14,st);
																				
																				if(Integer.parseInt(dis15)<=Integer.parseInt(dis16))
																				{
																					Thread.sleep(2000);
																					b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					b77.setIcon(b7g);
																					no15="Node15->";
																					
																					Thread.sleep(2000);
																					b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					b77.setIcon(b7g);
																					no15="Node15->";

																					frm=no14; to=no15; st=t; log(no14,no15,st);
																					
																					if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
																					{
																						Thread.sleep(2000);
																						b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						b88.setIcon(b8g);
																						no16="Node16->";
																						
																						Thread.sleep(2000);
																						b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						b88.setIcon(b8g);
																						no16="Node16->";

																						frm=no15; to=no16; st=t; log(no15,no16,st);
																						
																						if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																						{
																							Thread.sleep(2000);
																							c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c22.setIcon(c2g);
																							no17="Node17->";
																							
																							Thread.sleep(2000);
																							c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c22.setIcon(c2g);
																							no17="Node17->";

																							frm=no16; to=no17; st=t; log(no16,no17,st);
																							
																							if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																							{
																								Thread.sleep(2000);
																								c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								c33.setIcon(c3g);
																								no18="Node18->";
																								
																								Thread.sleep(2000);
																								c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								c33.setIcon(c3g);
																								no18="Node18->";

																								frm=no17; to=no18; st=t; log(no17,no18,st);
																								
																								if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																								{
																									Thread.sleep(2000);
																									c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																									c44.setIcon(c4g);
																									no19="Node19->";
																									
																									Thread.sleep(2000);
																									c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																									c44.setIcon(c4g);
																									no19="Node19->";
																									
																									Thread.sleep(2000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									Thread.sleep(1000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									no20="Node20->";

																									frm=no18; to=no19; st=t; log(no18,no19,st);

																									frm=no19; to=no20; st=t; log(no19,no20,st);
																									
																									refresh();
																									send(cn,dest,destip,ct);
																								}
																								else
																								{
																									Thread.sleep(2000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									Thread.sleep(1000);
																									c55.setVisible(false);
																									Thread.sleep(1000);
																									c55.setVisible(true);
																									no20="Node20->";

																									frm=no18; to=no20; st=t; log(no18,no20,st);
																									
																									refresh();
																									send(cn,dest,destip,ct);
																								
																								}
																								
																							}
																							else
																							{
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								Thread.sleep(1000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								no20="Node20->";

																								frm=no17; to=no19; st=t; log(no17,no19,st);

																								frm=no19; to=no20; st=t; log(no19,no20,st);
																								
																								refresh();
																								send(cn,dest,destip,ct);
																							}
																						}
																						else
																						{
																							Thread.sleep(2000);
																							c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c33.setIcon(c3g);
																							no18="Node18->";
																							
																							Thread.sleep(2000);
																							c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c33.setIcon(c3g);
																							no18="Node18->";

																							frm=no16; to=no18; st=t; log(no16,no18,st);
																							
																							if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																							{
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								Thread.sleep(1000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								no20="Node20->";

																								frm=no18; to=no19; st=t; log(no18,no19,st);

																								frm=no19; to=no20; st=t; log(no19,no20,st);
																								
																								refresh();
																								send(cn,dest,destip,ct);
																							}
																							else
																							{
																								Thread.sleep(2000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								Thread.sleep(1000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								no20="Node20->";

																								frm=no18; to=no20; st=t; log(no18,no20,st);
																								
																								refresh();
																								send(cn,dest,destip,ct);
																							
																							}
																						}
																					}
																					else
																					{
																						Thread.sleep(2000);
																						c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c22.setIcon(c2g);
																						no17="Node17->";
																						
																						Thread.sleep(2000);
																						c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c22.setIcon(c2g);
																						no17="Node17->";

																						frm=no15; to=no17; st=t; log(no15,no17,st);
																						
																						if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																						{
																							Thread.sleep(2000);
																							c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c33.setIcon(c3g);
																							no18="Node18->";
																							
																							Thread.sleep(2000);
																							c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c33.setIcon(c3g);
																							no18="Node18->";

																							frm=no17; to=no18; st=t; log(no17,no18,st);
																							
																							if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																							{
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								Thread.sleep(1000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								no20="Node20->";

																								frm=no18; to=no19; st=t; log(no18,no19,st);

																								frm=no19; to=no20; st=t; log(no19,no20,st);
																								
																								refresh();
																								send(cn,dest,destip,ct);
																							}
																							else
																							{
																								Thread.sleep(2000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								Thread.sleep(1000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								no20="Node20->";

																								frm=no18; to=no20; st=t; log(no18,no20,st);
																								
																								refresh();
																								send(cn,dest,destip,ct);
																							
																							}
																							
																						}
																						else
																						{
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							Thread.sleep(1000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							no20="Node20->";

																							frm=no17; to=no19; st=t; log(no17,no19,st);

																							frm=no19; to=no20; st=t; log(no19,no20,st);
																							
																							refresh();
																							send(cn,dest,destip,ct);
																						}
																					}
																				}
																				else
																				{
																					Thread.sleep(2000);																														Thread.sleep(2000);
																					b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					b88.setIcon(b8g);
																					no16="Node16->";
																					
																					Thread.sleep(2000);
																					b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					b88.setIcon(b8g);
																					no16="Node16->";

																					frm=no14; to=no16; st=t; log(no14,no16,st);
																					
																					if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																					{
																						Thread.sleep(2000);
																						c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c22.setIcon(c2g);
																						no17="Node17->";
																						
																						Thread.sleep(2000);
																						c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c22.setIcon(c2g);
																						no17="Node17->";

																						frm=no16; to=no17; st=t; log(no16,no17,st);
																						
																						if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																						{
																							Thread.sleep(2000);
																							c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c33.setIcon(c3g);
																							no18="Node18->";
																							
																							Thread.sleep(2000);
																							c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c33.setIcon(c3g);
																							no18="Node18->";

																							frm=no17; to=no18; st=t; log(no17,no18,st);
																							
																							if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																							{
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								Thread.sleep(1000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								no20="Node20->";

																								frm=no18; to=no19; st=t; log(no18,no19,st);

																								frm=no19; to=no20; st=t; log(no19,no20,st);
																								
																								refresh();
																								send(cn,dest,destip,ct);
																							}
																							else
																							{
																								Thread.sleep(2000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								Thread.sleep(1000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								no20="Node20->";

																								frm=no18; to=no20; st=t; log(no18,no20,st);
																								
																								refresh();
																								send(cn,dest,destip,ct);
																							
																							}
																							
																						}
																						else
																						{
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							Thread.sleep(1000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							no20="Node20->";

																							frm=no17; to=no19; st=t; log(no17,no19,st);

																							frm=no19; to=no20; st=t; log(no19,no20,st);
																							
																							refresh();
																							send(cn,dest,destip,ct);
																						}
																					}
																					else
																					{
																						Thread.sleep(2000);
																						c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c33.setIcon(c3g);
																						no18="Node18->";
																						
																						Thread.sleep(2000);
																						c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c33.setIcon(c3g);
																						no18="Node18->";

																						frm=no16; to=no18; st=t; log(no16,no18,st);
																						
																						if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																						{
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							Thread.sleep(1000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							no20="Node20->";

																							frm=no18; to=no19; st=t; log(no18,no19,st);

																							frm=no19; to=no20; st=t; log(no19,no20,st);
																							
																							refresh();
																							send(cn,dest,destip,ct);
																						}
																						else
																						{
																							Thread.sleep(2000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							Thread.sleep(1000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							no20="Node20->";

																							frm=no18; to=no20; st=t; log(no18,no20,st);
																							
																							refresh();
																							send(cn,dest,destip,ct);
																						
																						}
																					}
																				}
																			}
																			else
																			{
																				Thread.sleep(2000);
																				b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
																				b77.setIcon(b7g);
																				no15="Node15->";
																				
																				Thread.sleep(2000);
																				b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																				b77.setIcon(b7g);
																				no15="Node15->";

																				frm=no13; to=no15; st=t; log(no13,no15,st);
																				
																				if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
																				{
																					Thread.sleep(2000);
																					b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					b88.setIcon(b8g);
																					no16="Node16->";
																					
																					Thread.sleep(2000);
																					b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					b88.setIcon(b8g);
																					no16="Node16->";

																					frm=no15; to=no16; st=t; log(no15,no16,st);
																					
																					if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																					{
																						Thread.sleep(2000);
																						c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c22.setIcon(c2g);
																						no17="Node17->";
																						
																						Thread.sleep(2000);
																						c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c22.setIcon(c2g);
																						no17="Node17->";

																						frm=no16; to=no17; st=t; log(no16,no17,st);
																						
																						if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																						{
																							Thread.sleep(2000);
																							c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c33.setIcon(c3g);
																							no18="Node18->";
																							
																							Thread.sleep(2000);
																							c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c33.setIcon(c3g);
																							no18="Node18->";

																							frm=no17; to=no18; st=t; log(no17,no18,st);
																							
																							if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																							{
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								Thread.sleep(1000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								no20="Node20->";

																								frm=no18; to=no19; st=t; log(no18,no19,st);

																								frm=no19; to=no20; st=t; log(no19,no20,st);
																								
																								refresh();
																								send(cn,dest,destip,ct);
																							}
																							else
																							{
																								Thread.sleep(2000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								Thread.sleep(1000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								no20="Node20->";

																								frm=no18; to=no20; st=t; log(no18,no20,st);
																								
																								refresh();
																								send(cn,dest,destip,ct);
																							
																							}
																							
																						}
																						else
																						{
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							Thread.sleep(1000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							no20="Node20->";

																							frm=no17; to=no19; st=t; log(no17,no19,st);

																							frm=no19; to=no20; st=t; log(no19,no20,st);
																							
																							refresh();
																							send(cn,dest,destip,ct);
																						}
																					}
																					else
																					{
																						Thread.sleep(2000);
																						c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c33.setIcon(c3g);
																						no18="Node18->";
																						
																						Thread.sleep(2000);
																						c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c33.setIcon(c3g);
																						no18="Node18->";

																						frm=no16; to=no18; st=t; log(no16,no18,st);
																						
																						if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																						{
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							Thread.sleep(1000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							no20="Node20->";

																							frm=no18; to=no19; st=t; log(no18,no19,st);

																							frm=no19; to=no20; st=t; log(no19,no20,st);
																							
																							refresh();
																							send(cn,dest,destip,ct);
																						}
																						else
																						{
																							Thread.sleep(2000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							Thread.sleep(1000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							no20="Node20->";

																							frm=no18; to=no20; st=t; log(no18,no20,st);
																							
																							refresh();
																							send(cn,dest,destip,ct);
																						
																						}
																					}
																				}
																				else
																				{
																					Thread.sleep(2000);
																					c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					c22.setIcon(c2g);
																					no17="Node17->";
																					
																					Thread.sleep(2000);
																					c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					c22.setIcon(c2g);
																					no17="Node17->";

																					frm=no15; to=no17; st=t; log(no15,no17,st);
																					
																					if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																					{
																						Thread.sleep(2000);
																						c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c33.setIcon(c3g);
																						no18="Node18->";
																						
																						Thread.sleep(2000);
																						c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c33.setIcon(c3g);
																						no18="Node18->";

																						frm=no17; to=no18; st=t; log(no17,no18,st);
																						
																						if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																						{
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							Thread.sleep(1000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							no20="Node20->";

																							frm=no18; to=no19; st=t; log(no18,no19,st);

																							frm=no19; to=no20; st=t; log(no19,no20,st);
																							
																							refresh();
																							send(cn,dest,destip,ct);
																						}
																						else
																						{
																							Thread.sleep(2000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							Thread.sleep(1000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							no20="Node20->";

																							frm=no18; to=no20; st=t; log(no18,no20,st);
																							
																							refresh();
																							send(cn,dest,destip,ct);
																						
																						}
																						
																					}
																					else
																					{
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						Thread.sleep(1000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						no20="Node20->";

																						frm=no17; to=no19; st=t; log(no17,no19,st);

																						frm=no19; to=no20; st=t; log(no19,no20,st);
																						
																						refresh();
																						send(cn,dest,destip,ct);
																					}
																				}
																			}
																		}
																		else
																		{
																			mac13(no13,mac13);
																		}
																	}
																	else
																	{
																		ene13(no13,ene13);
																	}
																}
																else
																{
																	dist13();
																}
															}
															else
															{
																mac12(no12,mac12);
															}
														}
														else
														{
															ene12(no12,ene12);
														}
													}
													else
													{
														dist12();
													}
													
												}
												else
												{
													mac11(no11,mac11);
												}
											}
											else
											{
												ene11(no11,ene11);
											}
										}
										else
										{
											dist11();
										}
									}
									else
									{
										mac10(no10,mac10);
									}
								}
								else
								{
									ene10(no10,ene10);
								}
							}
							else
							{
								dist10();
							}
						}
						else
						{
							mac9(no9,mac9);
						}
					}
					else
					{
						ene9(no9,ene9);
					}
						
				}
				else
				{
					dist9();
				}
				
			}

			void dist8() throws InterruptedException, UnknownHostException, IOException, SQLException {
				
				if(Integer.parseInt(ene9)>=fsize)
				{
					if(mac.equalsIgnoreCase(mac9))
					{
						Thread.sleep(2000);
						a9g=new ImageIcon(this.getClass().getResource("g.jpg"));
						a99.setIcon(a9g);
						no9="Node9->";
					
						Thread.sleep(2000);
						a9g=new ImageIcon(this.getClass().getResource("rec.jpg"));
						a99.setIcon(a9g);
						no9="Node9->";

						frm=no7; to=no9; st=t; log(no7,no9,st);
						
						
						if(Integer.parseInt(dis10)<=Integer.parseInt(dis11))
						{
							
							if(Integer.parseInt(ene10)>=fsize)
							{
								if(mac.equalsIgnoreCase(mac10))
								{
									Thread.sleep(2000);
									b2g=new ImageIcon(this.getClass().getResource("g.jpg"));
									b22.setIcon(b2g);
									no10="Node10->";
								
									Thread.sleep(2000);
									b2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
									b22.setIcon(b2g);
									no10="Node10->";

									frm=no9; to=no10; st=t; log(no9,no10,st);
									
									if(Integer.parseInt(dis11)<=Integer.parseInt(dis12))
									{
										
										if(Integer.parseInt(ene11)>=fsize)
										{
											if(mac.equalsIgnoreCase(mac11))
											{
												Thread.sleep(2000);
												b3g=new ImageIcon(this.getClass().getResource("g.jpg"));
												b33.setIcon(b3g);
												no11="Node11->";
											
												Thread.sleep(2000);
												b3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												b33.setIcon(b3g);
												no11="Node11->";

												frm=no10; to=no11; st=t; log(no10,no11,st);
												
												if(Integer.parseInt(dis12)<=Integer.parseInt(dis13))
												{
													
													if(Integer.parseInt(ene12)>=fsize)
													{
														if(mac.equalsIgnoreCase(mac12))
														{
															Thread.sleep(2000);
															b4g=new ImageIcon(this.getClass().getResource("g.jpg"));
															b44.setIcon(b4g);
															no12="Node12->";
														
															Thread.sleep(2000);
															b4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															b44.setIcon(b4g);
															no12="Node12->";

															frm=no11; to=no12; st=t; log(no11,no12,st);
															
															if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
															{
																
																if(Integer.parseInt(ene13)>=fsize)
																{
																	if(mac.equalsIgnoreCase(mac13))
																	{
																		Thread.sleep(2000);
																		b5g=new ImageIcon(this.getClass().getResource("g.jpg"));
																		b55.setIcon(b5g);
																		no13="Node13->";
																	
																		Thread.sleep(2000);
																		b5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																		b55.setIcon(b5g);
																		no13="Node13->";

																		frm=no12; to=no13; st=t; log(no12,no13,st);
																		
																		if(Integer.parseInt(dis14)<=Integer.parseInt(dis15))
																		{
																			Thread.sleep(2000);
																			b6g=new ImageIcon(this.getClass().getResource("g.jpg"));
																			b66.setIcon(b6g);
																			no14="Node14->";
																			
																			Thread.sleep(2000);
																			b6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																			b66.setIcon(b6g);
																			no14="Node14->";

																			frm=no13; to=no14; st=t; log(no13,no14,st);
																			
																			if(Integer.parseInt(dis15)<=Integer.parseInt(dis16))
																			{
																				Thread.sleep(2000);
																				b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
																				b77.setIcon(b7g);
																				no15="Node15->";
																				
																				Thread.sleep(2000);
																				b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																				b77.setIcon(b7g);
																				no15="Node15->";

																				frm=no14; to=no15; st=t; log(no14,no15,st);
																				
																				if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
																				{
																					Thread.sleep(2000);
																					b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					b88.setIcon(b8g);
																					no16="Node16->";
																					
																					Thread.sleep(2000);
																					b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					b88.setIcon(b8g);
																					no16="Node16->";

																					frm=no15; to=no16; st=t; log(no15,no16,st);
																					
																					if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																					{
																						Thread.sleep(2000);
																						c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c22.setIcon(c2g);
																						no17="Node17->";
																						
																						Thread.sleep(2000);
																						c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c22.setIcon(c2g);
																						no17="Node17->";

																						frm=no16; to=no17; st=t; log(no16,no17,st);
																						
																						if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																						{
																							Thread.sleep(2000);
																							c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c33.setIcon(c3g);
																							no18="Node18->";
																							
																							Thread.sleep(2000);
																							c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c33.setIcon(c3g);
																							no18="Node18->";

																							frm=no17; to=no18; st=t; log(no17,no18,st);
																							
																							if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																							{
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																								c44.setIcon(c4g);
																								no19="Node19->";
																								
																								Thread.sleep(2000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								Thread.sleep(1000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								no20="Node20->";
																								
																								frm=no18; to=no19; st=t; log(no18,no19,st);

																								frm=no19; to=no20; st=t; log(no19,no20,st);
																								
																								refresh();
																								send(cn,dest,destip,ct);
																							}
																							else
																							{
																								Thread.sleep(2000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								Thread.sleep(1000);
																								c55.setVisible(false);
																								Thread.sleep(1000);
																								c55.setVisible(true);
																								no20="Node20->";

																								frm=no18; to=no20; st=t; log(no18,no20,st);
																								
																								refresh();
																								send(cn,dest,destip,ct);
																							
																							}
																							
																						}
																						else
																						{
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							Thread.sleep(1000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							no20="Node20->";

																							frm=no17; to=no19; st=t; log(no17,no19,st);

																							frm=no19; to=no20; st=t; log(no19,no20,st);
																							
																							refresh();
																							send(cn,dest,destip,ct);
																						}
																					}
																					else
																					{
																						Thread.sleep(2000);
																						c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c33.setIcon(c3g);
																						no18="Node18->";
																						
																						Thread.sleep(2000);
																						c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c33.setIcon(c3g);
																						no18="Node18->";

																						frm=no16; to=no18; st=t; log(no16,no18,st);
																						
																						if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																						{
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							Thread.sleep(1000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							no20="Node20->";

																							frm=no18; to=no19; st=t; log(no18,no19,st);

																							frm=no19; to=no20; st=t; log(no19,no20,st);
																							
																							refresh();
																							send(cn,dest,destip,ct);
																						}
																						else
																						{
																							Thread.sleep(2000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							Thread.sleep(1000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							no20="Node20->";

																							frm=no18; to=no20; st=t; log(no18,no20,st);
																							
																							refresh();
																							send(cn,dest,destip,ct);
																						
																						}
																					}
																				}
																				else
																				{
																					Thread.sleep(2000);
																					c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					c22.setIcon(c2g);
																					no17="Node17->";
																					
																					Thread.sleep(2000);
																					c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					c22.setIcon(c2g);
																					no17="Node17->";

																					frm=no15; to=no17; st=t; log(no15,no17,st);
																					
																					if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																					{
																						Thread.sleep(2000);
																						c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c33.setIcon(c3g);
																						no18="Node18->";
																						
																						Thread.sleep(2000);
																						c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c33.setIcon(c3g);
																						no18="Node18->";

																						frm=no17; to=no18; st=t; log(no17,no18,st);
																						
																						if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																						{
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							Thread.sleep(1000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							no20="Node20->";

																							frm=no18; to=no19; st=t; log(no18,no19,st);

																							frm=no19; to=no20; st=t; log(no19,no20,st);
																							
																							refresh();
																							send(cn,dest,destip,ct);
																						}
																						else
																						{
																							Thread.sleep(2000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							Thread.sleep(1000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							no20="Node20->";

																							frm=no18; to=no20; st=t; log(no18,no20,st);
																							
																							refresh();
																							send(cn,dest,destip,ct);
																						
																						}
																						
																					}
																					else
																					{
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						Thread.sleep(1000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						no20="Node20->";

																						frm=no17; to=no19; st=t; log(no17,no19,st);

																						frm=no19; to=no20; st=t; log(no19,no20,st);
																						
																						refresh();
																						send(cn,dest,destip,ct);
																					}
																				}
																			}
																			else
																			{
																				Thread.sleep(2000);																														Thread.sleep(2000);
																				b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																				b88.setIcon(b8g);
																				no16="Node16->";
																				
																				Thread.sleep(2000);
																				b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																				b88.setIcon(b8g);
																				no16="Node16->";

																				frm=no14; to=no16; st=t; log(no14,no16,st);
																				
																				if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																				{
																					Thread.sleep(2000);
																					c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					c22.setIcon(c2g);
																					no17="Node17->";
																					
																					Thread.sleep(2000);
																					c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					c22.setIcon(c2g);
																					no17="Node17->";

																					frm=no16; to=no17; st=t; log(no16,no17,st);
																					
																					if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																					{
																						Thread.sleep(2000);
																						c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c33.setIcon(c3g);
																						no18="Node18->";
																						
																						Thread.sleep(2000);
																						c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c33.setIcon(c3g);
																						no18="Node18->";

																						frm=no17; to=no18; st=t; log(no17,no18,st);
																						
																						if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																						{
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							Thread.sleep(1000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							no20="Node20->";

																							frm=no18; to=no19; st=t; log(no18,no19,st);

																							frm=no19; to=no20; st=t; log(no19,no20,st);
																							
																							refresh();
																							send(cn,dest,destip,ct);
																						}
																						else
																						{
																							Thread.sleep(2000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							Thread.sleep(1000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							no20="Node20->";

																							frm=no18; to=no20; st=t; log(no18,no20,st);
																							
																							refresh();
																							send(cn,dest,destip,ct);
																						
																						}
																						
																					}
																					else
																					{
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						Thread.sleep(1000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						no20="Node20->";

																						frm=no17; to=no19; st=t; log(no17,no19,st);

																						frm=no19; to=no20; st=t; log(no19,no20,st);
																						
																						refresh();
																						send(cn,dest,destip,ct);
																					}
																				}
																				else
																				{
																					Thread.sleep(2000);
																					c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					c33.setIcon(c3g);
																					no18="Node18->";
																					
																					Thread.sleep(2000);
																					c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					c33.setIcon(c3g);
																					no18="Node18->";

																					frm=no16; to=no18; st=t; log(no16,no18,st);
																					
																					if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																					{
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						Thread.sleep(1000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						no20="Node20->";

																						frm=no18; to=no19; st=t; log(no18,no19,st);

																						frm=no19; to=no20; st=t; log(no19,no20,st);
																						
																						refresh();
																						send(cn,dest,destip,ct);
																					}
																					else
																					{
																						Thread.sleep(2000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						Thread.sleep(1000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						no20="Node20->";

																						frm=no18; to=no20; st=t; log(no18,no20,st);
																						
																						refresh();
																						send(cn,dest,destip,ct);
																					
																					}
																				}
																			}
																		}
																		else
																		{
																			Thread.sleep(2000);
																			b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
																			b77.setIcon(b7g);
																			no15="Node15->";
																			
																			Thread.sleep(2000);
																			b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																			b77.setIcon(b7g);
																			no15="Node15->";

																			frm=no13; to=no15; st=t; log(no13,no15,st);
																			
																			if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
																			{
																				Thread.sleep(2000);
																				b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																				b88.setIcon(b8g);
																				no16="Node16->";
																				
																				Thread.sleep(2000);
																				b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																				b88.setIcon(b8g);
																				no16="Node16->";

																				frm=no15; to=no16; st=t; log(no15,no16,st);
																				
																				if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																				{
																					Thread.sleep(2000);
																					c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					c22.setIcon(c2g);
																					no17="Node17->";
																					
																					Thread.sleep(2000);
																					c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					c22.setIcon(c2g);
																					no17="Node17->";

																					frm=no16; to=no17; st=t; log(no16,no17,st);
																					
																					if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																					{
																						Thread.sleep(2000);
																						c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c33.setIcon(c3g);
																						no18="Node18->";
																						
																						Thread.sleep(2000);
																						c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c33.setIcon(c3g);
																						no18="Node18->";

																						frm=no17; to=no18; st=t; log(no17,no18,st);
																						
																						if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																						{
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							Thread.sleep(1000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							no20="Node20->";

																							frm=no18; to=no19; st=t; log(no18,no19,st);

																							frm=no19; to=no20; st=t; log(no19,no20,st);
																							
																							refresh();
																							send(cn,dest,destip,ct);
																						}
																						else
																						{
																							Thread.sleep(2000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							Thread.sleep(1000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							no20="Node20->";

																							frm=no18; to=no20; st=t; log(no18,no20,st);
																							
																							refresh();
																							send(cn,dest,destip,ct);
																						
																						}
																						
																					}
																					else
																					{
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						Thread.sleep(1000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						no20="Node20->";

																						frm=no17; to=no19; st=t; log(no17,no19,st);

																						frm=no19; to=no20; st=t; log(no19,no20,st);
																						
																						refresh();
																						send(cn,dest,destip,ct);
																					}
																				}
																				else
																				{
																					Thread.sleep(2000);
																					c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					c33.setIcon(c3g);
																					no18="Node18->";
																					
																					Thread.sleep(2000);
																					c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					c33.setIcon(c3g);
																					no18="Node18->";

																					frm=no16; to=no18; st=t; log(no16,no18,st);
																					
																					if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																					{
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						Thread.sleep(1000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						no20="Node20->";

																						frm=no18; to=no19; st=t; log(no18,no19,st);

																						frm=no19; to=no20; st=t; log(no19,no20,st);
																						
																						refresh();
																						send(cn,dest,destip,ct);
																					}
																					else
																					{
																						Thread.sleep(2000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						Thread.sleep(1000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						no20="Node20->";

																						frm=no18; to=no20; st=t; log(no18,no20,st);
																						
																						refresh();
																						send(cn,dest,destip,ct);
																					
																					}
																				}
																			}
																			else
																			{
																				Thread.sleep(2000);
																				c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																				c22.setIcon(c2g);
																				no17="Node17->";
																				
																				Thread.sleep(2000);
																				c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																				c22.setIcon(c2g);
																				no17="Node17->";

																				frm=no15; to=no17; st=t; log(no15,no17,st);
																				
																				if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																				{
																					Thread.sleep(2000);
																					c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					c33.setIcon(c3g);
																					no18="Node18->";
																					
																					Thread.sleep(2000);
																					c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					c33.setIcon(c3g);
																					no18="Node18->";

																					frm=no17; to=no18; st=t; log(no17,no18,st);
																					
																					if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																					{
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						Thread.sleep(1000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						no20="Node20->";

																						frm=no18; to=no19; st=t; log(no18,no19,st);

																						frm=no19; to=no20; st=t; log(no19,no20,st);
																						
																						refresh();
																						send(cn,dest,destip,ct);
																					}
																					else
																					{
																						Thread.sleep(2000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						Thread.sleep(1000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						no20="Node20->";

																						frm=no18; to=no20; st=t; log(no18,no20,st);
																						
																						refresh();
																						send(cn,dest,destip,ct);
																					
																					}
																					
																				}
																				else
																				{
																					Thread.sleep(2000);
																					c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					c44.setIcon(c4g);
																					no19="Node19->";
																					
																					Thread.sleep(2000);
																					c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					c44.setIcon(c4g);
																					no19="Node19->";
																					
																					Thread.sleep(2000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					Thread.sleep(1000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					no20="Node20->";

																					frm=no17; to=no19; st=t; log(no17,no19,st);

																					frm=no19; to=no20; st=t; log(no19,no20,st);
																					
																					refresh();
																					send(cn,dest,destip,ct);
																				}
																			}
																		}
																	}
																	else
																	{
																		mac13(no13,mac13);
																	}
																}
																else
																{
																	ene13(no13,ene13);
																}
															}
															else
															{
																dist13();
															}
														}
														else
														{
															mac12(no12,mac12);
														}
													}
													else
													{
														ene12(no12,ene12);
													}
												}
												else
												{
													dist12();
												}
												
											}
											else
											{
												mac11(no11,mac11);
											}
										}
										else
										{
											ene11(no11,ene11);
										}
									}
									else
									{
										dist11();
									}
								}
								else
								{
									mac10(no10,mac10);
								}
							}
							else
							{
								ene10(no10,ene10);
							}
						}
						else
						{
							dist10();
						}
					}
					else
					{
						mac9(no9,mac9);
					}
				}
				else
				{
					ene9(no9,ene9);
				}
			}

			void dist9() throws InterruptedException, UnknownHostException, IOException, SQLException {
				
				if(Integer.parseInt(ene10)>=fsize)
				{
					if(mac.equalsIgnoreCase(mac10))
					{
						Thread.sleep(2000);
						b2g=new ImageIcon(this.getClass().getResource("g.jpg"));
						b22.setIcon(b2g);
						no10="Node10->";
					
						Thread.sleep(2000);
						b2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
						b22.setIcon(b2g);
						no10="Node10->";

						frm=no8; to=no10; st=t; log(no8,no10,st);
						
						if(Integer.parseInt(dis11)<=Integer.parseInt(dis12))
						{
							
							if(Integer.parseInt(ene11)>=fsize)
							{
								if(mac.equalsIgnoreCase(mac11))
								{
									Thread.sleep(2000);
									b3g=new ImageIcon(this.getClass().getResource("g.jpg"));
									b33.setIcon(b3g);
									no11="Node11->";
								
									Thread.sleep(2000);
									b3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
									b33.setIcon(b3g);
									no11="Node11->";

									frm=no10; to=no11; st=t; log(no10,no11,st);
									
									if(Integer.parseInt(dis12)<=Integer.parseInt(dis13))
									{
										
										if(Integer.parseInt(ene12)>=fsize)
										{
											if(mac.equalsIgnoreCase(mac12))
											{
												Thread.sleep(2000);
												b4g=new ImageIcon(this.getClass().getResource("g.jpg"));
												b44.setIcon(b4g);
												no12="Node12->";
											
												Thread.sleep(2000);
												b4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												b44.setIcon(b4g);
												no12="Node12->";

												frm=no11; to=no12; st=t; log(no11,no12,st);
												
												if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
												{
													
													if(Integer.parseInt(ene13)>=fsize)
													{
														if(mac.equalsIgnoreCase(mac13))
														{
															Thread.sleep(2000);
															b5g=new ImageIcon(this.getClass().getResource("g.jpg"));
															b55.setIcon(b5g);
															no13="Node13->";
														
															Thread.sleep(2000);
															b5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															b55.setIcon(b5g);
															no13="Node13->";

															frm=no12; to=no13; st=t; log(no12,no13,st);
															
															if(Integer.parseInt(dis14)<=Integer.parseInt(dis15))
															{
																Thread.sleep(2000);
																b6g=new ImageIcon(this.getClass().getResource("g.jpg"));
																b66.setIcon(b6g);
																no14="Node14->";
																
																Thread.sleep(2000);
																b6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																b66.setIcon(b6g);
																no14="Node14->";

																frm=no13; to=no14; st=t; log(no13,no14,st);
																
																if(Integer.parseInt(dis15)<=Integer.parseInt(dis16))
																{
																	Thread.sleep(2000);
																	b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	b77.setIcon(b7g);
																	no15="Node15->";
																	
																	Thread.sleep(2000);
																	b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	b77.setIcon(b7g);
																	no15="Node15->";

																	frm=no14; to=no15; st=t; log(no14,no15,st);
																	
																	if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
																	{
																		Thread.sleep(2000);
																		b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																		b88.setIcon(b8g);
																		no16="Node16->";
																		
																		Thread.sleep(2000);
																		b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																		b88.setIcon(b8g);
																		no16="Node16->";

																		frm=no15; to=no16; st=t; log(no15,no16,st);
																		
																		if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																		{
																			Thread.sleep(2000);
																			c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																			c22.setIcon(c2g);
																			no17="Node17->";
																			
																			Thread.sleep(2000);
																			c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																			c22.setIcon(c2g);
																			no17="Node17->";

																			frm=no16; to=no17; st=t; log(no16,no17,st);
																			
																			if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																			{
																				Thread.sleep(2000);
																				c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																				c33.setIcon(c3g);
																				no18="Node18->";
																				
																				Thread.sleep(2000);
																				c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																				c33.setIcon(c3g);
																				no18="Node18->";

																				frm=no17; to=no18; st=t; log(no17,no18,st);
																				
																				if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																				{
																					Thread.sleep(2000);
																					c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					c44.setIcon(c4g);
																					no19="Node19->";
																					
																					Thread.sleep(2000);
																					c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					c44.setIcon(c4g);
																					no19="Node19->";
																					
																					Thread.sleep(2000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					Thread.sleep(1000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					no20="Node20->";

																					frm=no18; to=no19; st=t; log(no18,no19,st);

																					frm=no19; to=no20; st=t; log(no19,no20,st);
																					
																					refresh();
																					send(cn,dest,destip,ct);
																				}
																				else
																				{
																					Thread.sleep(2000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					Thread.sleep(1000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					no20="Node20->";

																					frm=no18; to=no20; st=t; log(no18,no20,st);
																					
																					refresh();
																					send(cn,dest,destip,ct);
																				
																				}
																				
																			}
																			else
																			{
																				Thread.sleep(2000);
																				c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																				c44.setIcon(c4g);
																				no19="Node19->";
																				
																				Thread.sleep(2000);
																				c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																				c44.setIcon(c4g);
																				no19="Node19->";
																				
																				Thread.sleep(2000);
																				c55.setVisible(false);
																				Thread.sleep(1000);
																				c55.setVisible(true);
																				Thread.sleep(1000);
																				c55.setVisible(false);
																				Thread.sleep(1000);
																				c55.setVisible(true);
																				no20="Node20->";

																				frm=no17; to=no19; st=t; log(no17,no19,st);

																				frm=no19; to=no20; st=t; log(no19,no20,st);
																				
																				refresh();
																				send(cn,dest,destip,ct);
																			}
																		}
																		else
																		{
																			Thread.sleep(2000);
																			c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																			c33.setIcon(c3g);
																			no18="Node18->";
																			
																			Thread.sleep(2000);
																			c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																			c33.setIcon(c3g);
																			no18="Node18->";

																			frm=no16; to=no18; st=t; log(no16,no18,st);
																			
																			if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																			{
																				Thread.sleep(2000);
																				c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																				c44.setIcon(c4g);
																				no19="Node19->";
																				
																				Thread.sleep(2000);
																				c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																				c44.setIcon(c4g);
																				no19="Node19->";
																				
																				Thread.sleep(2000);
																				c55.setVisible(false);
																				Thread.sleep(1000);
																				c55.setVisible(true);
																				Thread.sleep(1000);
																				c55.setVisible(false);
																				Thread.sleep(1000);
																				c55.setVisible(true);
																				no20="Node20->";

																				frm=no18; to=no19; st=t; log(no18,no19,st);

																				frm=no19; to=no20; st=t; log(no19,no20,st);
																				
																				refresh();
																				send(cn,dest,destip,ct);
																			}
																			else
																			{
																				Thread.sleep(2000);
																				c55.setVisible(false);
																				Thread.sleep(1000);
																				c55.setVisible(true);
																				Thread.sleep(1000);
																				c55.setVisible(false);
																				Thread.sleep(1000);
																				c55.setVisible(true);
																				no20="Node20->";

																				frm=no18; to=no20; st=t; log(no18,no20,st);
																				
																				refresh();
																				send(cn,dest,destip,ct);
																			
																			}
																		}
																	}
																	else
																	{
																		Thread.sleep(2000);
																		c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																		c22.setIcon(c2g);
																		no17="Node17->";
																		
																		Thread.sleep(2000);
																		c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																		c22.setIcon(c2g);
																		no17="Node17->";

																		frm=no15; to=no17; st=t; log(no15,no17,st);
																		
																		if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																		{
																			Thread.sleep(2000);
																			c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																			c33.setIcon(c3g);
																			no18="Node18->";
																			
																			Thread.sleep(2000);
																			c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																			c33.setIcon(c3g);
																			no18="Node18->";

																			frm=no17; to=no18; st=t; log(no17,no18,st);
																			
																			if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																			{
																				Thread.sleep(2000);
																				c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																				c44.setIcon(c4g);
																				no19="Node19->";
																				
																				Thread.sleep(2000);
																				c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																				c44.setIcon(c4g);
																				no19="Node19->";
																				
																				Thread.sleep(2000);
																				c55.setVisible(false);
																				Thread.sleep(1000);
																				c55.setVisible(true);
																				Thread.sleep(1000);
																				c55.setVisible(false);
																				Thread.sleep(1000);
																				c55.setVisible(true);
																				no20="Node20->";

																				frm=no18; to=no19; st=t; log(no18,no19,st);

																				frm=no19; to=no20; st=t; log(no19,no20,st);
																				
																				refresh();
																				send(cn,dest,destip,ct);
																			}
																			else
																			{
																				Thread.sleep(2000);
																				c55.setVisible(false);
																				Thread.sleep(1000);
																				c55.setVisible(true);
																				Thread.sleep(1000);
																				c55.setVisible(false);
																				Thread.sleep(1000);
																				c55.setVisible(true);
																				no20="Node20->";

																				frm=no18; to=no20; st=t; log(no18,no20,st);
																				
																				refresh();
																				send(cn,dest,destip,ct);
																			
																			}
																			
																		}
																		else
																		{
																			Thread.sleep(2000);
																			c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																			c44.setIcon(c4g);
																			no19="Node19->";
																			
																			Thread.sleep(2000);
																			c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																			c44.setIcon(c4g);
																			no19="Node19->";
																			
																			Thread.sleep(2000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			Thread.sleep(1000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			no20="Node20->";

																			frm=no17; to=no19; st=t; log(no17,no19,st);

																			frm=no19; to=no20; st=t; log(no19,no20,st);
																			
																			refresh();
																			send(cn,dest,destip,ct);
																		}
																	}
																}
																else
																{
																	Thread.sleep(2000);																														Thread.sleep(2000);
																	b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	b88.setIcon(b8g);
																	no16="Node16->";
																	
																	Thread.sleep(2000);
																	b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	b88.setIcon(b8g);
																	no16="Node16->";

																	frm=no14; to=no16; st=t; log(no14,no16,st);
																	
																	if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																	{
																		Thread.sleep(2000);
																		c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																		c22.setIcon(c2g);
																		no17="Node17->";
																		
																		Thread.sleep(2000);
																		c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																		c22.setIcon(c2g);
																		no17="Node17->";

																		frm=no16; to=no17; st=t; log(no16,no17,st);
																		
																		if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																		{
																			Thread.sleep(2000);
																			c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																			c33.setIcon(c3g);
																			no18="Node18->";
																			
																			Thread.sleep(2000);
																			c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																			c33.setIcon(c3g);
																			no18="Node18->";

																			frm=no17; to=no18; st=t; log(no17,no18,st);
																			
																			if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																			{
																				Thread.sleep(2000);
																				c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																				c44.setIcon(c4g);
																				no19="Node19->";
																				
																				Thread.sleep(2000);
																				c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																				c44.setIcon(c4g);
																				no19="Node19->";
																				
																				Thread.sleep(2000);
																				c55.setVisible(false);
																				Thread.sleep(1000);
																				c55.setVisible(true);
																				Thread.sleep(1000);
																				c55.setVisible(false);
																				Thread.sleep(1000);
																				c55.setVisible(true);
																				no20="Node20->";

																				frm=no18; to=no19; st=t; log(no18,no19,st);

																				frm=no19; to=no20; st=t; log(no19,no20,st);
																				
																				refresh();
																				send(cn,dest,destip,ct);
																			}
																			else
																			{
																				Thread.sleep(2000);
																				c55.setVisible(false);
																				Thread.sleep(1000);
																				c55.setVisible(true);
																				Thread.sleep(1000);
																				c55.setVisible(false);
																				Thread.sleep(1000);
																				c55.setVisible(true);
																				no20="Node20->";

																				frm=no18; to=no20; st=t; log(no18,no20,st);
																				
																				refresh();
																				send(cn,dest,destip,ct);
																			
																			}
																			
																		}
																		else
																		{
																			Thread.sleep(2000);
																			c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																			c44.setIcon(c4g);
																			no19="Node19->";
																			
																			Thread.sleep(2000);
																			c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																			c44.setIcon(c4g);
																			no19="Node19->";
																			
																			Thread.sleep(2000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			Thread.sleep(1000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			no20="Node20->";

																			frm=no17; to=no19; st=t; log(no17,no19,st);

																			frm=no19; to=no20; st=t; log(no19,no20,st);
																			
																			refresh();
																			send(cn,dest,destip,ct);
																		}
																	}
																	else
																	{
																		Thread.sleep(2000);
																		c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																		c33.setIcon(c3g);
																		no18="Node18->";
																		
																		Thread.sleep(2000);
																		c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																		c33.setIcon(c3g);
																		no18="Node18->";

																		frm=no16; to=no18; st=t; log(no16,no18,st);
																		
																		if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																		{
																			Thread.sleep(2000);
																			c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																			c44.setIcon(c4g);
																			no19="Node19->";
																			
																			Thread.sleep(2000);
																			c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																			c44.setIcon(c4g);
																			no19="Node19->";
																			
																			Thread.sleep(2000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			Thread.sleep(1000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			no20="Node20->";

																			frm=no18; to=no19; st=t; log(no18,no19,st);

																			frm=no19; to=no20; st=t; log(no19,no20,st);
																			
																			refresh();
																			send(cn,dest,destip,ct);
																		}
																		else
																		{
																			Thread.sleep(2000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			Thread.sleep(1000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			no20="Node20->";

																			frm=no18; to=no20; st=t; log(no18,no20,st);
																			
																			refresh();
																			send(cn,dest,destip,ct);
																		
																		}
																	}
																}
															}
															else
															{
																Thread.sleep(2000);
																b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
																b77.setIcon(b7g);
																no15="Node15->";
																
																Thread.sleep(2000);
																b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																b77.setIcon(b7g);
																no15="Node15->";

																frm=no13; to=no15; st=t; log(no13,no15,st);
																
																if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
																{
																	Thread.sleep(2000);
																	b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	b88.setIcon(b8g);
																	no16="Node16->";
																	
																	Thread.sleep(2000);
																	b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	b88.setIcon(b8g);
																	no16="Node16->";

																	frm=no15; to=no16; st=t; log(no15,no16,st);
																	
																	if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																	{
																		Thread.sleep(2000);
																		c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																		c22.setIcon(c2g);
																		no17="Node17->";
																		
																		Thread.sleep(2000);
																		c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																		c22.setIcon(c2g);
																		no17="Node17->";

																		frm=no16; to=no17; st=t; log(no16,no17,st);
																		
																		if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																		{
																			Thread.sleep(2000);
																			c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																			c33.setIcon(c3g);
																			no18="Node18->";
																			
																			Thread.sleep(2000);
																			c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																			c33.setIcon(c3g);
																			no18="Node18->";

																			frm=no17; to=no18; st=t; log(no17,no18,st);
																			
																			if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																			{
																				Thread.sleep(2000);
																				c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																				c44.setIcon(c4g);
																				no19="Node19->";
																				
																				Thread.sleep(2000);
																				c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																				c44.setIcon(c4g);
																				no19="Node19->";
																				Thread.sleep(2000);
																				c55.setVisible(false);
																				Thread.sleep(1000);
																				c55.setVisible(true);
																				Thread.sleep(1000);
																				c55.setVisible(false);
																				Thread.sleep(1000);
																				c55.setVisible(true);
																				no20="Node20->";

																				frm=no18; to=no19; st=t; log(no18,no19,st);

																				frm=no19; to=no20; st=t; log(no19,no20,st);
																				
																				refresh();
																				send(cn,dest,destip,ct);
																			}
																			else
																			{
																				Thread.sleep(2000);
																				c55.setVisible(false);
																				Thread.sleep(1000);
																				c55.setVisible(true);
																				Thread.sleep(1000);
																				c55.setVisible(false);
																				Thread.sleep(1000);
																				c55.setVisible(true);
																				no20="Node20->";

																				frm=no18; to=no20; st=t; log(no18,no20,st);
																				
																				refresh();
																				send(cn,dest,destip,ct);
																			
																			}
																			
																		}
																		else
																		{
																			Thread.sleep(2000);
																			c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																			c44.setIcon(c4g);
																			no19="Node19->";
																			
																			Thread.sleep(2000);
																			c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																			c44.setIcon(c4g);
																			no19="Node19->";
																			
																			Thread.sleep(2000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			Thread.sleep(1000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			no20="Node20->";

																			frm=no17; to=no19; st=t; log(no17,no19,st);

																			frm=no19; to=no20; st=t; log(no19,no20,st);
																			
																			refresh();
																			send(cn,dest,destip,ct);
																		}
																	}
																	else
																	{
																		Thread.sleep(2000);
																		c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																		c33.setIcon(c3g);
																		no18="Node18->";
																		
																		Thread.sleep(2000);
																		c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																		c33.setIcon(c3g);
																		no18="Node18->";

																		frm=no16; to=no18; st=t; log(no16,no18,st);
																		
																		if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																		{
																			Thread.sleep(2000);
																			c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																			c44.setIcon(c4g);
																			no19="Node19->";
																			
																			Thread.sleep(2000);
																			c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																			c44.setIcon(c4g);
																			no19="Node19->";
																			
																			Thread.sleep(2000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			Thread.sleep(1000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			no20="Node20->";

																			frm=no18; to=no19; st=t; log(no18,no19,st);

																			frm=no19; to=no20; st=t; log(no19,no20,st);
																			
																			refresh();
																			send(cn,dest,destip,ct);
																		}
																		else
																		{
																			Thread.sleep(2000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			Thread.sleep(1000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			no20="Node20->";

																			frm=no18; to=no20; st=t; log(no18,no20,st);
																			
																			refresh();
																			send(cn,dest,destip,ct);
																		
																		}
																	}
																}
																else
																{
																	Thread.sleep(2000);
																	c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	c22.setIcon(c2g);
																	no17="Node17->";
																	
																	Thread.sleep(2000);
																	c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	c22.setIcon(c2g);
																	no17="Node17->";

																	frm=no15; to=no17; st=t; log(no15,no17,st);
																	
																	if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																	{
																		Thread.sleep(2000);
																		c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																		c33.setIcon(c3g);
																		no18="Node18->";
																		
																		Thread.sleep(2000);
																		c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																		c33.setIcon(c3g);
																		no18="Node18->";

																		frm=no17; to=no18; st=t; log(no17,no18,st);
																		
																		if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																		{
																			Thread.sleep(2000);
																			c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																			c44.setIcon(c4g);
																			no19="Node19->";
																			
																			Thread.sleep(2000);
																			c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																			c44.setIcon(c4g);
																			no19="Node19->";
																			
																			Thread.sleep(2000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			Thread.sleep(1000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			no20="Node20->";

																			frm=no18; to=no19; st=t; log(no18,no19,st);

																			frm=no19; to=no20; st=t; log(no19,no20,st);
																			
																			refresh();
																			send(cn,dest,destip,ct);
																		}
																		else
																		{
																			Thread.sleep(2000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			Thread.sleep(1000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			no20="Node20->";

																			frm=no18; to=no20; st=t; log(no18,no20,st);
																			
																			refresh();
																			send(cn,dest,destip,ct);
																		
																		}
																		
																	}
																	else
																	{
																		Thread.sleep(2000);
																		c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																		c44.setIcon(c4g);
																		no19="Node19->";
																		
																		Thread.sleep(2000);
																		c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																		c44.setIcon(c4g);
																		no19="Node19->";
																		
																		Thread.sleep(2000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		Thread.sleep(1000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		no20="Node20->";

																		frm=no17; to=no19; st=t; log(no17,no19,st);

																		frm=no19; to=no20; st=t; log(no19,no20,st);
																		
																		refresh();
																		send(cn,dest,destip,ct);
																	}
																}
															}
														}
														else
														{
															mac13(no13,mac13);
														}
													}
													else
													{
														ene13(no13,ene13);
													}
												}
												else
												{
													dist13();
												}
											}
											else
											{
												mac12(no12,mac12);
											}
										}
										else
										{
											ene12(no12,ene12);
										}
									}
									else
									{
										dist12();
									}
									
								}
								else
								{
									mac11(no11,mac11);
								}
							}
							else
							{
								ene11(no11,ene11);
							}
						}
						else
						{
							dist11();
						}
					}
					else
					{
						mac10(no10,mac10);
					}
				}
				else
				{
					ene10(no10,ene10);
				}
			}

			void ene9(String node, String ene) throws InterruptedException, IOException, SQLException {
			
				Thread.sleep(2000);
				a9r=new ImageIcon(this.getClass().getResource("r.jpg"));
				a99.setIcon(a9r);
				no9="Node9->";
				
			   	Socket sc = new Socket("localhost",310);
				DataOutputStream d = new DataOutputStream(sc.getOutputStream());
				d.writeUTF(no9);
				d.writeUTF(ene);
				
				
				DataInputStream din = new DataInputStream(sc.getInputStream());
				String mes = din.readUTF();
			
				enemac9();
				
		}

			void mac9(String node, String mac) throws IOException, InterruptedException, SQLException {
			
				Thread.sleep(2000);
				a9r=new ImageIcon(this.getClass().getResource("r.jpg"));
				a99.setIcon(a9r);
				no9="Node9->";
				
				Socket sc = new Socket("localhost",309);
				DataOutputStream d = new DataOutputStream(sc.getOutputStream());
				d.writeUTF(no9);
				d.writeUTF(mac);
					
				DataInputStream din = new DataInputStream(sc.getInputStream());
				String mes = din.readUTF();
				System.out.println(mes);
				
				enemac9();
		}

			 void enemac9() throws InterruptedException, UnknownHostException, IOException, SQLException {

				 
					if(Integer.parseInt(dis10)<=Integer.parseInt(dis11))
					{
						
						if(Integer.parseInt(ene10)>=fsize)
						{
							if(mac.equalsIgnoreCase(mac10))
							{
								Thread.sleep(2000);
								b2g=new ImageIcon(this.getClass().getResource("g.jpg"));
								b22.setIcon(b2g);
								no10="Node10->";
							
								Thread.sleep(2000);
								b2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								b22.setIcon(b2g);
								no10="Node10->";

								frm=no8; to=no9; st=nt; log(no8,no9,st);
								frm=no8; to=no10; st=t; log(no8,no10,st);
								
								if(Integer.parseInt(dis11)<=Integer.parseInt(dis12))
								{
									
									if(Integer.parseInt(ene11)>=fsize)
									{
										if(mac.equalsIgnoreCase(mac11))
										{
											Thread.sleep(2000);
											b3g=new ImageIcon(this.getClass().getResource("g.jpg"));
											b33.setIcon(b3g);
											no11="Node11->";
										
											Thread.sleep(2000);
											b3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											b33.setIcon(b3g);
											no11="Node11->";

											frm=no10; to=no11; st=t; log(no10,no11,st);
											
											if(Integer.parseInt(dis12)<=Integer.parseInt(dis13))
											{
												
												if(Integer.parseInt(ene12)>=fsize)
												{
													if(mac.equalsIgnoreCase(mac12))
													{
														Thread.sleep(2000);
														b4g=new ImageIcon(this.getClass().getResource("g.jpg"));
														b44.setIcon(b4g);
														no12="Node12->";
													
														Thread.sleep(2000);
														b4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														b44.setIcon(b4g);
														no12="Node12->";

														frm=no11; to=no12; st=t; log(no11,no12,st);
														
														if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
														{
															
															if(Integer.parseInt(ene13)>=fsize)
															{
																if(mac.equalsIgnoreCase(mac13))
																{
																	Thread.sleep(2000);
																	b5g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	b55.setIcon(b5g);
																	no13="Node13->";
																
																	Thread.sleep(2000);
																	b5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	b55.setIcon(b5g);
																	no13="Node13->";

																	frm=no12; to=no13; st=t; log(no12,no13,st);
																	
																	if(Integer.parseInt(dis14)<=Integer.parseInt(dis15))
																	{
																		Thread.sleep(2000);
																		b6g=new ImageIcon(this.getClass().getResource("g.jpg"));
																		b66.setIcon(b6g);
																		no14="Node14->";
																		
																		Thread.sleep(2000);
																		b6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																		b66.setIcon(b6g);
																		no14="Node14->";

																		frm=no13; to=no14; st=t; log(no13,no14,st);
																		
																		if(Integer.parseInt(dis15)<=Integer.parseInt(dis16))
																		{
																			Thread.sleep(2000);
																			b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
																			b77.setIcon(b7g);
																			no15="Node15->";
																			
																			Thread.sleep(2000);
																			b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																			b77.setIcon(b7g);
																			no15="Node15->";

																			frm=no14; to=no15; st=t; log(no14,no15,st);
																			
																			if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
																			{
																				Thread.sleep(2000);
																				b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																				b88.setIcon(b8g);
																				no16="Node16->";
																				
																				Thread.sleep(2000);
																				b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																				b88.setIcon(b8g);
																				no16="Node16->";

																				frm=no15; to=no16; st=t; log(no15,no16,st);
																				
																				if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																				{
																					Thread.sleep(2000);
																					c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					c22.setIcon(c2g);
																					no17="Node17->";
																					
																					Thread.sleep(2000);
																					c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					c22.setIcon(c2g);
																					no17="Node17->";

																					frm=no16; to=no17; st=t; log(no16,no17,st);
																					
																					if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																					{
																						Thread.sleep(2000);
																						c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c33.setIcon(c3g);
																						no18="Node18->";
																						
																						Thread.sleep(2000);
																						c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c33.setIcon(c3g);
																						no18="Node18->";

																						frm=no17; to=no18; st=t; log(no17,no18,st);
																						
																						if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																						{
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																							c44.setIcon(c4g);
																							no19="Node19->";
																							
																							Thread.sleep(2000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							Thread.sleep(1000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							no20="Node20->";

																							frm=no18; to=no19; st=t; log(no18,no19,st);

																							frm=no19; to=no20; st=t; log(no19,no20,st);
																							
																							refresh();
																							send(cn,dest,destip,ct);
																						}
																						else
																						{
																							Thread.sleep(2000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							Thread.sleep(1000);
																							c55.setVisible(false);
																							Thread.sleep(1000);
																							c55.setVisible(true);
																							no20="Node20->";

																							frm=no18; to=no20; st=t; log(no18,no20,st);
																							
																							refresh();
																							send(cn,dest,destip,ct);
																						
																						}
																						
																					}
																					else
																					{
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						Thread.sleep(1000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						no20="Node20->";

																						frm=no17; to=no19; st=t; log(no17,no19,st);

																						frm=no19; to=no20; st=t; log(no19,no20,st);
																						
																						refresh();
																						send(cn,dest,destip,ct);
																					}
																				}
																				else
																				{
																					Thread.sleep(2000);
																					c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					c33.setIcon(c3g);
																					no18="Node18->";
																					
																					Thread.sleep(2000);
																					c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					c33.setIcon(c3g);
																					no18="Node18->";

																					frm=no16; to=no18; st=t; log(no16,no18,st);
																					
																					if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																					{
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						Thread.sleep(1000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						no20="Node20->";
																						frm=no18; to=no19; st=t; log(no18,no19,st);

																						frm=no19; to=no20; st=t; log(no19,no20,st);
																						
																						refresh();
																						send(cn,dest,destip,ct);
																					}
																					else
																					{
																						Thread.sleep(2000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						Thread.sleep(1000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						no20="Node20->";

																						frm=no18; to=no20; st=t; log(no18,no20,st);
																						
																						refresh();
																						send(cn,dest,destip,ct);
																					
																					}
																				}
																			}
																			else
																			{
																				Thread.sleep(2000);
																				c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																				c22.setIcon(c2g);
																				no17="Node17->";
																				
																				Thread.sleep(2000);
																				c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																				c22.setIcon(c2g);
																				no17="Node17->";

																				frm=no15; to=no17; st=t; log(no15,no17,st);
																				
																				if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																				{
																					Thread.sleep(2000);
																					c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					c33.setIcon(c3g);
																					no18="Node18->";
																					
																					Thread.sleep(2000);
																					c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					c33.setIcon(c3g);
																					no18="Node18->";

																					frm=no17; to=no18; st=t; log(no17,no18,st);
																					
																					if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																					{
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						Thread.sleep(1000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						no20="Node20->";

																						frm=no18; to=no19; st=t; log(no18,no19,st);

																						frm=no19; to=no20; st=t; log(no19,no20,st);
																						
																						refresh();
																						send(cn,dest,destip,ct);
																					}
																					else
																					{
																						Thread.sleep(2000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						Thread.sleep(1000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						no20="Node20->";

																						frm=no18; to=no20; st=t; log(no18,no20,st);
																						
																						refresh();
																						send(cn,dest,destip,ct);
																					
																					}
																					
																				}
																				else
																				{
																					Thread.sleep(2000);
																					c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					c44.setIcon(c4g);
																					no19="Node19->";
																					
																					Thread.sleep(2000);
																					c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					c44.setIcon(c4g);
																					no19="Node19->";
																					
																					Thread.sleep(2000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					Thread.sleep(1000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					no20="Node20->";

																					frm=no17; to=no19; st=t; log(no17,no19,st);

																					frm=no19; to=no20; st=t; log(no19,no20,st);
																					
																					refresh();
																					send(cn,dest,destip,ct);
																				}
																			}
																		}
																		else
																		{
																			Thread.sleep(2000);																														Thread.sleep(2000);
																			b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																			b88.setIcon(b8g);
																			no16="Node16->";
																			
																			Thread.sleep(2000);
																			b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																			b88.setIcon(b8g);
																			no16="Node16->";

																			frm=no14; to=no16; st=t; log(no14,no16,st);
																			
																			if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																			{
																				Thread.sleep(2000);
																				c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																				c22.setIcon(c2g);
																				no17="Node17->";
																				
																				Thread.sleep(2000);
																				c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																				c22.setIcon(c2g);
																				no17="Node17->";

																				frm=no16; to=no17; st=t; log(no16,no17,st);
																				
																				if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																				{
																					Thread.sleep(2000);
																					c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					c33.setIcon(c3g);
																					no18="Node18->";
																					
																					Thread.sleep(2000);
																					c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					c33.setIcon(c3g);
																					no18="Node18->";

																					frm=no17; to=no18; st=t; log(no17,no18,st);
																					
																					if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																					{
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						Thread.sleep(1000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						no20="Node20->";

																						frm=no18; to=no19; st=t; log(no18,no19,st);

																						frm=no19; to=no20; st=t; log(no19,no20,st);
																						
																						refresh();
																						send(cn,dest,destip,ct);
																					}
																					else
																					{
																						Thread.sleep(2000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						Thread.sleep(1000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						no20="Node20->";

																						frm=no18; to=no20; st=t; log(no18,no20,st);
																						
																						refresh();
																						send(cn,dest,destip,ct);
																					
																					}
																					
																				}
																				else
																				{
																					Thread.sleep(2000);
																					c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					c44.setIcon(c4g);
																					no19="Node19->";
																					
																					Thread.sleep(2000);
																					c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					c44.setIcon(c4g);
																					no19="Node19->";
																					
																					Thread.sleep(2000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					Thread.sleep(1000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					no20="Node20->";

																					frm=no17; to=no19; st=t; log(no17,no19,st);

																					frm=no19; to=no20; st=t; log(no19,no20,st);
																					
																					refresh();
																					send(cn,dest,destip,ct);
																				}
																			}
																			else
																			{
																				Thread.sleep(2000);
																				c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																				c33.setIcon(c3g);
																				no18="Node18->";
																				
																				Thread.sleep(2000);
																				c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																				c33.setIcon(c3g);
																				no18="Node18->";

																				frm=no16; to=no18; st=t; log(no16,no18,st);
																				
																				if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																				{
																					Thread.sleep(2000);
																					c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					c44.setIcon(c4g);
																					no19="Node19->";
																					
																					Thread.sleep(2000);
																					c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					c44.setIcon(c4g);
																					no19="Node19->";
																					
																					Thread.sleep(2000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					Thread.sleep(1000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					no20="Node20->";

																					frm=no18; to=no19; st=t; log(no18,no19,st);

																					frm=no19; to=no20; st=t; log(no19,no20,st);
																					
																					refresh();
																					send(cn,dest,destip,ct);
																				}
																				else
																				{
																					Thread.sleep(2000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					Thread.sleep(1000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					no20="Node20->";

																					frm=no18; to=no20; st=t; log(no18,no20,st);
																					
																					refresh();
																					send(cn,dest,destip,ct);
																				
																				}
																			}
																		}
																	}
																	else
																	{
																		Thread.sleep(2000);
																		b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
																		b77.setIcon(b7g);
																		no15="Node15->";
																		
																		Thread.sleep(2000);
																		b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																		b77.setIcon(b7g);
																		no15="Node15->";

																		frm=no13; to=no15; st=t; log(no13,no15,st);
																		
																		if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
																		{
																			Thread.sleep(2000);
																			b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																			b88.setIcon(b8g);
																			no16="Node16->";
																			
																			Thread.sleep(2000);
																			b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																			b88.setIcon(b8g);
																			no16="Node16->";

																			frm=no15; to=no16; st=t; log(no15,no16,st);
																			
																			if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																			{
																				Thread.sleep(2000);
																				c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																				c22.setIcon(c2g);
																				no17="Node17->";
																				
																				Thread.sleep(2000);
																				c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																				c22.setIcon(c2g);
																				no17="Node17->";

																				frm=no16; to=no17; st=t; log(no16,no17,st);
																				
																				if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																				{
																					Thread.sleep(2000);
																					c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					c33.setIcon(c3g);
																					no18="Node18->";
																					
																					Thread.sleep(2000);
																					c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					c33.setIcon(c3g);
																					no18="Node18->";

																					frm=no17; to=no18; st=t; log(no17,no18,st);
																					
																					if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																					{
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																						c44.setIcon(c4g);
																						no19="Node19->";
																						
																						Thread.sleep(2000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						Thread.sleep(1000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						no20="Node20->";

																						frm=no18; to=no19; st=t; log(no18,no19,st);

																						frm=no19; to=no20; st=t; log(no19,no20,st);
																						
																						refresh();
																						send(cn,dest,destip,ct);
																					}
																					else
																					{
																						Thread.sleep(2000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						Thread.sleep(1000);
																						c55.setVisible(false);
																						Thread.sleep(1000);
																						c55.setVisible(true);
																						no20="Node20->";

																						frm=no18; to=no20; st=t; log(no18,no20,st);
																						
																						refresh();
																						send(cn,dest,destip,ct);
																					
																					}
																					
																				}
																				else
																				{
																					Thread.sleep(2000);
																					c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					c44.setIcon(c4g);
																					no19="Node19->";
																					
																					Thread.sleep(2000);
																					c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					c44.setIcon(c4g);
																					no19="Node19->";
																					
																					Thread.sleep(2000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					Thread.sleep(1000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					no20="Node20->";

																					frm=no17; to=no19; st=t; log(no17,no19,st);

																					frm=no19; to=no20; st=t; log(no19,no20,st);
																					
																					refresh();
																					send(cn,dest,destip,ct);
																				}
																			}
																			else
																			{
																				Thread.sleep(2000);
																				c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																				c33.setIcon(c3g);
																				no18="Node18->";
																				
																				Thread.sleep(2000);
																				c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																				c33.setIcon(c3g);
																				no18="Node18->";

																				frm=no16; to=no18; st=t; log(no16,no18,st);
																				
																				if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																				{
																					Thread.sleep(2000);
																					c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					c44.setIcon(c4g);
																					no19="Node19->";
																					
																					Thread.sleep(2000);
																					c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					c44.setIcon(c4g);
																					no19="Node19->";
																					
																					Thread.sleep(2000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					Thread.sleep(1000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					no20="Node20->";

																					frm=no18; to=no19; st=t; log(no18,no19,st);

																					frm=no19; to=no20; st=t; log(no19,no20,st);
																					
																					refresh();
																					send(cn,dest,destip,ct);
																				}
																				else
																				{
																					Thread.sleep(2000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					Thread.sleep(1000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					no20="Node20->";

																					frm=no18; to=no20; st=t; log(no18,no20,st);
																					
																					refresh();
																					send(cn,dest,destip,ct);
																				
																				}
																			}
																		}
																		else
																		{
																			Thread.sleep(2000);
																			c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																			c22.setIcon(c2g);
																			no17="Node17->";
																			
																			Thread.sleep(2000);
																			c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																			c22.setIcon(c2g);
																			no17="Node17->";

																			frm=no15; to=no17; st=t; log(no15,no17,st);
																			
																			if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																			{
																				Thread.sleep(2000);
																				c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																				c33.setIcon(c3g);
																				no18="Node18->";
																				
																				Thread.sleep(2000);
																				c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																				c33.setIcon(c3g);
																				no18="Node18->";

																				frm=no17; to=no18; st=t; log(no17,no18,st);
																				
																				if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																				{
																					Thread.sleep(2000);
																					c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																					c44.setIcon(c4g);
																					no19="Node19->";
																					
																					Thread.sleep(2000);
																					c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																					c44.setIcon(c4g);
																					no19="Node19->";
																					
																					Thread.sleep(2000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					Thread.sleep(1000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					no20="Node20->";

																					frm=no18; to=no19; st=t; log(no18,no19,st);

																					frm=no19; to=no20; st=t; log(no19,no20,st);
																					
																					refresh();
																					send(cn,dest,destip,ct);
																				}
																				else
																				{
																					Thread.sleep(2000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					Thread.sleep(1000);
																					c55.setVisible(false);
																					Thread.sleep(1000);
																					c55.setVisible(true);
																					no20="Node20->";

																					frm=no18; to=no20; st=t; log(no18,no20,st);
																					
																					refresh();
																					send(cn,dest,destip,ct);
																				
																				}
																				
																			}
																			else
																			{
																				Thread.sleep(2000);
																				c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																				c44.setIcon(c4g);
																				no19="Node19->";
																				
																				Thread.sleep(2000);
																				c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																				c44.setIcon(c4g);
																				no19="Node19->";
																				
																				Thread.sleep(2000);
																				c55.setVisible(false);
																				Thread.sleep(1000);
																				c55.setVisible(true);
																				Thread.sleep(1000);
																				c55.setVisible(false);
																				Thread.sleep(1000);
																				c55.setVisible(true);
																				no20="Node20->";

																				frm=no17; to=no19; st=t; log(no17,no19,st);

																				frm=no19; to=no20; st=t; log(no19,no20,st);
																				
																				refresh();
																				send(cn,dest,destip,ct);
																			}
																		}
																	}
																}
																else
																{
																	mac13(no13,mac13);
																}
															}
															else
															{
																ene13(no13,ene13);
															}
														}
														else
														{
															dist13();
														}
													}
													else
													{
														mac12(no12,mac12);
													}
												}
												else
												{
													ene12(no12,ene12);
												}
											}
											else
											{
												dist12();
											}
											
										}
										else
										{
											mac11(no11,mac11);
										}
									}
									else
									{
										ene11(no11,ene11);
									}
								}
								else
								{
									dist11();
								}
							}
							else
							{
								mac10(no10,mac10);
							}
						}
						else
						{
							ene10(no10,ene10);
						}
					}
					else
					{
						dist10();
					}
				 
			}

			void dist10() throws InterruptedException, UnknownHostException, IOException, SQLException {
				
				
				if(Integer.parseInt(ene11)>=fsize)
				{
					if(mac.equalsIgnoreCase(mac11))
					{
						Thread.sleep(2000);
						b3g=new ImageIcon(this.getClass().getResource("g.jpg"));
						b33.setIcon(b3g);
						no11="Node11->";
					
						Thread.sleep(2000);
						b3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
						b33.setIcon(b3g);
						no11="Node11->";

						frm=no9; to=no11; st=t; log(no9,no11,st);
						
						if(Integer.parseInt(dis12)<=Integer.parseInt(dis13))
						{
							
							if(Integer.parseInt(ene12)>=fsize)
							{
								if(mac.equalsIgnoreCase(mac12))
								{
									Thread.sleep(2000);
									b4g=new ImageIcon(this.getClass().getResource("g.jpg"));
									b44.setIcon(b4g);
									no12="Node12->";
								
									Thread.sleep(2000);
									b4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
									b44.setIcon(b4g);
									no12="Node12->";

									frm=no11; to=no12; st=t; log(no11,no12,st);
									
									if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
									{
										
										if(Integer.parseInt(ene13)>=fsize)
										{
											if(mac.equalsIgnoreCase(mac13))
											{
												Thread.sleep(2000);
												b5g=new ImageIcon(this.getClass().getResource("g.jpg"));
												b55.setIcon(b5g);
												no13="Node13->";
											
												Thread.sleep(2000);
												b5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												b55.setIcon(b5g);
												no13="Node13->";

												frm=no12; to=no13; st=t; log(no12,no13,st);
												
												if(Integer.parseInt(dis14)<=Integer.parseInt(dis15))
												{
													Thread.sleep(2000);
													b6g=new ImageIcon(this.getClass().getResource("g.jpg"));
													b66.setIcon(b6g);
													no14="Node14->";
													
													Thread.sleep(2000);
													b6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													b66.setIcon(b6g);
													no14="Node14->";

													frm=no13; to=no14; st=t; log(no13,no14,st);
													
													if(Integer.parseInt(dis15)<=Integer.parseInt(dis16))
													{
														Thread.sleep(2000);
														b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
														b77.setIcon(b7g);
														no15="Node15->";
														
														Thread.sleep(2000);
														b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														b77.setIcon(b7g);
														no15="Node15->";

														frm=no14; to=no15; st=t; log(no14,no15,st);
														
														if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
														{
															Thread.sleep(2000);
															b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
															b88.setIcon(b8g);
															no16="Node16->";
															
															Thread.sleep(2000);
															b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															b88.setIcon(b8g);
															no16="Node16->";

															frm=no15; to=no16; st=t; log(no15,no16,st);
															
															if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
															{
																Thread.sleep(2000);
																c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c22.setIcon(c2g);
																no17="Node17->";
																
																Thread.sleep(2000);
																c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c22.setIcon(c2g);
																no17="Node17->";

																frm=no16; to=no17; st=t; log(no16,no17,st);
																
																if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																{
																	Thread.sleep(2000);
																	c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	c33.setIcon(c3g);
																	no18="Node18->";
																	
																	Thread.sleep(2000);
																	c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	c33.setIcon(c3g);
																	no18="Node18->";

																	frm=no17; to=no18; st=t; log(no17,no18,st);
																	
																	if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																	{
																		Thread.sleep(2000);
																		c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																		c44.setIcon(c4g);
																		no19="Node19->";
																		
																		Thread.sleep(2000);
																		c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																		c44.setIcon(c4g);
																		no19="Node19->";
																		
																		Thread.sleep(2000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		Thread.sleep(1000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		no20="Node20->";

																		frm=no18; to=no19; st=t; log(no18,no19,st);

																		frm=no19; to=no20; st=t; log(no19,no20,st);
																		
																		refresh();
																		send(cn,dest,destip,ct);
																	}
																	else
																	{
																		Thread.sleep(2000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		Thread.sleep(1000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		no20="Node20->";

																		frm=no18; to=no20; st=t; log(no18,no20,st);
																		
																		refresh();
																		send(cn,dest,destip,ct);
																	
																	}
																	
																}
																else
																{
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	Thread.sleep(1000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	no20="Node20->";

																	frm=no17; to=no19; st=t; log(no17,no19,st);

																	frm=no19; to=no20; st=t; log(no19,no20,st);
																	
																	refresh();
																	send(cn,dest,destip,ct);
																}
															}
															else
															{
																Thread.sleep(2000);
																c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c33.setIcon(c3g);
																no18="Node18->";
																
																Thread.sleep(2000);
																c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c33.setIcon(c3g);
																no18="Node18->";

																frm=no16; to=no18; st=t; log(no16,no18,st);
																
																if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																{
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	Thread.sleep(1000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	no20="Node20->";

																	frm=no18; to=no19; st=t; log(no18,no19,st);

																	frm=no19; to=no20; st=t; log(no19,no20,st);
																	
																	refresh();
																	send(cn,dest,destip,ct);
																}
																else
																{
																	Thread.sleep(2000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	Thread.sleep(1000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	no20="Node20->";

																	frm=no18; to=no20; st=t; log(no18,no20,st);
																	
																	refresh();
																	send(cn,dest,destip,ct);
																
																}
															}
														}
														else
														{
															Thread.sleep(2000);
															c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
															c22.setIcon(c2g);
															no17="Node17->";
															
															Thread.sleep(2000);
															c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															c22.setIcon(c2g);
															no17="Node17->";

															frm=no15; to=no17; st=t; log(no15,no17,st);
															
															if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
															{
																Thread.sleep(2000);
																c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c33.setIcon(c3g);
																no18="Node18->";
																
																Thread.sleep(2000);
																c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c33.setIcon(c3g);
																no18="Node18->";

																frm=no17; to=no18; st=t; log(no17,no18,st);
																
																if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																{
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	Thread.sleep(1000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	no20="Node20->";

																	frm=no18; to=no19; st=t; log(no18,no19,st);

																	frm=no19; to=no20; st=t; log(no19,no20,st);
																	
																	refresh();
																	send(cn,dest,destip,ct);
																}
																else
																{
																	Thread.sleep(2000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	Thread.sleep(1000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	no20="Node20->";

																	frm=no18; to=no20; st=t; log(no18,no20,st);
																	
																	refresh();
																	send(cn,dest,destip,ct);
																
																}
																
															}
															else
															{
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																Thread.sleep(1000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																no20="Node20->";

																frm=no17; to=no19; st=t; log(no17,no19,st);

																frm=no19; to=no20; st=t; log(no19,no20,st);
																
																refresh();
																send(cn,dest,destip,ct);
															}
														}
													}
													else
													{
														Thread.sleep(2000);																														Thread.sleep(2000);
														b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
														b88.setIcon(b8g);
														no16="Node16->";
														
														Thread.sleep(2000);
														b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														b88.setIcon(b8g);
														no16="Node16->";

														frm=no14; to=no16; st=t; log(no14,no16,st);
														
														if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
														{
															Thread.sleep(2000);
															c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
															c22.setIcon(c2g);
															no17="Node17->";
															
															Thread.sleep(2000);
															c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															c22.setIcon(c2g);
															no17="Node17->";

															frm=no16; to=no17; st=t; log(no16,no17,st);
															
															if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
															{
																Thread.sleep(2000);
																c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c33.setIcon(c3g);
																no18="Node18->";
																
																Thread.sleep(2000);
																c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c33.setIcon(c3g);
																no18="Node18->";

																frm=no17; to=no18; st=t; log(no17,no18,st);
																
																if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																{
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	Thread.sleep(1000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	no20="Node20->";

																	frm=no18; to=no19; st=t; log(no18,no19,st);

																	frm=no19; to=no20; st=t; log(no19,no20,st);
																	
																	refresh();
																	send(cn,dest,destip,ct);
																}
																else
																{
																	Thread.sleep(2000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	Thread.sleep(1000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	no20="Node20->";

																	frm=no18; to=no20; st=t; log(no18,no20,st);
																	
																	refresh();
																	send(cn,dest,destip,ct);
																
																}
																
															}
															else
															{
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																Thread.sleep(1000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																no20="Node20->";

																frm=no17; to=no19; st=t; log(no17,no19,st);

																frm=no19; to=no20; st=t; log(no19,no20,st);
																
																refresh();
																send(cn,dest,destip,ct);
															}
														}
														else
														{
															Thread.sleep(2000);
															c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
															c33.setIcon(c3g);
															no18="Node18->";
															
															Thread.sleep(2000);
															c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															c33.setIcon(c3g);
															no18="Node18->";

															frm=no16; to=no18; st=t; log(no16,no18,st);
															
															if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
															{
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																Thread.sleep(1000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																no20="Node20->";

																frm=no18; to=no19; st=t; log(no18,no19,st);

																frm=no19; to=no20; st=t; log(no19,no20,st);
																
																refresh();
																send(cn,dest,destip,ct);
															}
															else
															{
																Thread.sleep(2000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																Thread.sleep(1000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																no20="Node20->";

																frm=no18; to=no20; st=t; log(no18,no20,st);
																
																refresh();
																send(cn,dest,destip,ct);
															
															}
														}
													}
												}
												else
												{
													Thread.sleep(2000);
													b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
													b77.setIcon(b7g);
													no15="Node15->";
													
													Thread.sleep(2000);
													b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													b77.setIcon(b7g);
													no15="Node15->";

													frm=no13; to=no15; st=t; log(no13,no15,st);
													
													if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
													{
														Thread.sleep(2000);
														b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
														b88.setIcon(b8g);
														no16="Node16->";
														
														Thread.sleep(2000);
														b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														b88.setIcon(b8g);
														no16="Node16->";

														frm=no15; to=no16; st=t; log(no15,no16,st);
														
														if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
														{
															Thread.sleep(2000);
															c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
															c22.setIcon(c2g);
															no17="Node17->";
															
															Thread.sleep(2000);
															c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															c22.setIcon(c2g);
															no17="Node17->";

															frm=no16; to=no17; st=t; log(no16,no17,st);
															
															if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
															{
																Thread.sleep(2000);
																c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c33.setIcon(c3g);
																no18="Node18->";
																
																Thread.sleep(2000);
																c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c33.setIcon(c3g);
																no18="Node18->";

																frm=no17; to=no18; st=t; log(no17,no18,st);
																
																if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																{
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	Thread.sleep(1000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	no20="Node20->";

																	frm=no18; to=no19; st=t; log(no18,no19,st);

																	frm=no19; to=no20; st=t; log(no19,no20,st);
																	
																	refresh();
																	send(cn,dest,destip,ct);
																}
																else
																{
																	Thread.sleep(2000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	Thread.sleep(1000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	no20="Node20->";

																	frm=no18; to=no20; st=t; log(no18,no20,st);
																	
																	refresh();
																	send(cn,dest,destip,ct);
																
																}
																
															}
															else
															{
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																Thread.sleep(1000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																no20="Node20->";

																frm=no17; to=no19; st=t; log(no17,no19,st);

																frm=no19; to=no20; st=t; log(no19,no20,st);
																
																refresh();
																send(cn,dest,destip,ct);
															}
														}
														else
														{
															Thread.sleep(2000);
															c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
															c33.setIcon(c3g);
															no18="Node18->";
															
															Thread.sleep(2000);
															c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															c33.setIcon(c3g);
															no18="Node18->";

															frm=no16; to=no18; st=t; log(no16,no18,st);
															
															if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
															{
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																Thread.sleep(1000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																no20="Node20->";

																frm=no18; to=no19; st=t; log(no18,no19,st);

																frm=no19; to=no20; st=t; log(no19,no20,st);
																
																refresh();
																send(cn,dest,destip,ct);
															}
															else
															{
																Thread.sleep(2000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																Thread.sleep(1000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																no20="Node20->";

																frm=no18; to=no20; st=t; log(no18,no20,st);
																
																refresh();
																send(cn,dest,destip,ct);
															
															}
														}
													}
													else
													{
														Thread.sleep(2000);
														c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
														c22.setIcon(c2g);
														no17="Node17->";
														
														Thread.sleep(2000);
														c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														c22.setIcon(c2g);
														no17="Node17->";

														frm=no15; to=no17; st=t; log(no15,no17,st);
														
														if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
														{
															Thread.sleep(2000);
															c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
															c33.setIcon(c3g);
															no18="Node18->";
															
															Thread.sleep(2000);
															c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															c33.setIcon(c3g);
															no18="Node18->";

															frm=no17; to=no18; st=t; log(no17,no18,st);
															
															if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
															{
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																Thread.sleep(1000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																no20="Node20->";

																frm=no18; to=no19; st=t; log(no18,no19,st);

																frm=no19; to=no20; st=t; log(no19,no20,st);
																
																refresh();
																send(cn,dest,destip,ct);
															}
															else
															{
																Thread.sleep(2000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																Thread.sleep(1000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																no20="Node20->";

																frm=no18; to=no20; st=t; log(no18,no20,st);
																
																refresh();
																send(cn,dest,destip,ct);
															
															}
															
														}
														else
														{
															Thread.sleep(2000);
															c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
															c44.setIcon(c4g);
															no19="Node19->";
															
															Thread.sleep(2000);
															c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															c44.setIcon(c4g);
															no19="Node19->";
															
															Thread.sleep(2000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															Thread.sleep(1000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															no20="Node20->";

															frm=no17; to=no19; st=t; log(no17,no19,st);

															frm=no19; to=no20; st=t; log(no19,no20,st);
															
															refresh();
															send(cn,dest,destip,ct);
														}
													}
												}
											}
											else
											{
												mac13(no13,mac13);
											}
										}
										else
										{
											ene13(no13,ene13);
										}
									}
									else
									{
										dist13();
									}
								}
								else
								{
									mac12(no12,mac12);
								}
							}
							else
							{
								ene12(no12,ene12);
							}
						}
						else
						{
							dist12();
						}
						
					}
					else
					{
						mac11(no11,mac11);
					}
				}
				else
				{
					ene11(no11,ene11);
				}
			}

			void ene10(String node, String ene) throws InterruptedException, IOException, SQLException {
			// TODO Auto-generated method stub
				Thread.sleep(2000);
				b2r=new ImageIcon(this.getClass().getResource("r.jpg"));
				b22.setIcon(b2r);
				no10="Node10->";
				
			   	Socket sc = new Socket("localhost",310);
				DataOutputStream d = new DataOutputStream(sc.getOutputStream());
				d.writeUTF(no10);
				d.writeUTF(ene);
				
				DataInputStream din = new DataInputStream(sc.getInputStream());
				String mes = din.readUTF();

				enemac10();
				
		}

			void mac10(String node, String mac) throws IOException, InterruptedException, SQLException {
			// TODO Auto-generated method stub
				
		
				Thread.sleep(2000);
				b2r=new ImageIcon(this.getClass().getResource("r.jpg"));
				b22.setIcon(b2r);
				no10="Node10->";
				
				Socket sc = new Socket("localhost",309);
				DataOutputStream d = new DataOutputStream(sc.getOutputStream());
				d.writeUTF(no10);
				d.writeUTF(mac);
					
				DataInputStream din = new DataInputStream(sc.getInputStream());
				String mes = din.readUTF();
				System.out.println(mes);
				
				enemac10();
				
		}

			private void enemac10() throws InterruptedException, UnknownHostException, IOException, SQLException {
				// TODO Auto-generated method stub
				
				if(Integer.parseInt(dis11)<=Integer.parseInt(dis12))
				{
					
					if(Integer.parseInt(ene11)>=fsize)
					{
						if(mac.equalsIgnoreCase(mac11))
						{
							Thread.sleep(2000);
							b3g=new ImageIcon(this.getClass().getResource("g.jpg"));
							b33.setIcon(b3g);
							no11="Node11->";
						
							Thread.sleep(2000);
							b3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							b33.setIcon(b3g);
							no11="Node11->";

							frm=no9; to=no10; st=nt; log(no9,no10,st);
							frm=no9; to=no11; st=t; log(no9,no11,st);
							
							if(Integer.parseInt(dis12)<=Integer.parseInt(dis13))
							{
								
								if(Integer.parseInt(ene12)>=fsize)
								{
									if(mac.equalsIgnoreCase(mac12))
									{
										Thread.sleep(2000);
										b4g=new ImageIcon(this.getClass().getResource("g.jpg"));
										b44.setIcon(b4g);
										no12="Node12->";
									
										Thread.sleep(2000);
										b4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
										b44.setIcon(b4g);
										no12="Node12->";

										frm=no11; to=no12; st=t; log(no11,no12,st);
										
										if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
										{
											
											if(Integer.parseInt(ene13)>=fsize)
											{
												if(mac.equalsIgnoreCase(mac13))
												{
													Thread.sleep(2000);
													b5g=new ImageIcon(this.getClass().getResource("g.jpg"));
													b55.setIcon(b5g);
													no13="Node13->";
												
													Thread.sleep(2000);
													b5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													b55.setIcon(b5g);
													no13="Node13->";

													frm=no12; to=no13; st=t; log(no12,no13,st);
													
													if(Integer.parseInt(dis14)<=Integer.parseInt(dis15))
													{
														Thread.sleep(2000);
														b6g=new ImageIcon(this.getClass().getResource("g.jpg"));
														b66.setIcon(b6g);
														no14="Node14->";
														
														Thread.sleep(2000);
														b6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														b66.setIcon(b6g);
														no14="Node14->";

														frm=no13; to=no14; st=t; log(no13,no14,st);
														
														if(Integer.parseInt(dis15)<=Integer.parseInt(dis16))
														{
															Thread.sleep(2000);
															b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
															b77.setIcon(b7g);
															no15="Node15->";
															
															Thread.sleep(2000);
															b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															b77.setIcon(b7g);
															no15="Node15->";

															frm=no14; to=no15; st=t; log(no14,no15,st);
															
															if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
															{
																Thread.sleep(2000);
																b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
																b88.setIcon(b8g);
																no16="Node16->";
																
																Thread.sleep(2000);
																b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																b88.setIcon(b8g);
																no16="Node16->";

																frm=no15; to=no16; st=t; log(no15,no16,st);
																
																if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
																{
																	Thread.sleep(2000);
																	c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	c22.setIcon(c2g);
																	no17="Node17->";
																	
																	Thread.sleep(2000);
																	c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	c22.setIcon(c2g);
																	no17="Node17->";

																	frm=no16; to=no17; st=t; log(no16,no17,st);
																	
																	if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																	{
																		Thread.sleep(2000);
																		c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																		c33.setIcon(c3g);
																		no18="Node18->";
																		
																		Thread.sleep(2000);
																		c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																		c33.setIcon(c3g);
																		no18="Node18->";

																		frm=no17; to=no18; st=t; log(no17,no18,st);
																		
																		if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																		{
																			Thread.sleep(2000);
																			c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																			c44.setIcon(c4g);
																			no19="Node19->";
																			
																			Thread.sleep(2000);
																			c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																			c44.setIcon(c4g);
																			no19="Node19->";
																			
																			Thread.sleep(2000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			Thread.sleep(1000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			no20="Node20->";

																			frm=no18; to=no19; st=t; log(no18,no19,st);

																			frm=no19; to=no20; st=t; log(no19,no20,st);
																			
																			refresh();
																			send(cn,dest,destip,ct);
																		}
																		else
																		{
																			Thread.sleep(2000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			Thread.sleep(1000);
																			c55.setVisible(false);
																			Thread.sleep(1000);
																			c55.setVisible(true);
																			no20="Node20->";
																			frm=no18; to=no20; st=t; log(no18,no20,st);
																			
																			refresh();
																			send(cn,dest,destip,ct);
																		
																		}
																		
																	}
																	else
																	{
																		Thread.sleep(2000);
																		c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																		c44.setIcon(c4g);
																		no19="Node19->";
																		
																		Thread.sleep(2000);
																		c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																		c44.setIcon(c4g);
																		no19="Node19->";
																		
																		Thread.sleep(2000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		Thread.sleep(1000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		no20="Node20->";

																		frm=no17; to=no19; st=t; log(no17,no19,st);

																		frm=no19; to=no20; st=t; log(no19,no20,st);
																		
																		refresh();
																		send(cn,dest,destip,ct);
																	}
																}
																else
																{
																	Thread.sleep(2000);
																	c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	c33.setIcon(c3g);
																	no18="Node18->";
																	
																	Thread.sleep(2000);
																	c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	c33.setIcon(c3g);
																	no18="Node18->";

																	frm=no16; to=no18; st=t; log(no16,no18,st);
																	
																	if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																	{
																		Thread.sleep(2000);
																		c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																		c44.setIcon(c4g);
																		no19="Node19->";
																		
																		Thread.sleep(2000);
																		c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																		c44.setIcon(c4g);
																		no19="Node19->";
																		
																		Thread.sleep(2000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		Thread.sleep(1000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		no20="Node20->";

																		frm=no18; to=no19; st=t; log(no18,no19,st);

																		frm=no19; to=no20; st=t; log(no19,no20,st);
																		
																		refresh();
																		send(cn,dest,destip,ct);
																	}
																	else
																	{
																		Thread.sleep(2000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		Thread.sleep(1000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		no20="Node20->";

																		frm=no18; to=no20; st=t; log(no18,no20,st);
																		
																		refresh();
																		send(cn,dest,destip,ct);
																	
																	}
																}
															}
															else
															{
																Thread.sleep(2000);
																c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c22.setIcon(c2g);
																no17="Node17->";
																
																Thread.sleep(2000);
																c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c22.setIcon(c2g);
																no17="Node17->";

																frm=no15; to=no17; st=t; log(no15,no17,st);
																
																if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																{
																	Thread.sleep(2000);
																	c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	c33.setIcon(c3g);
																	no18="Node18->";
																	
																	Thread.sleep(2000);
																	c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	c33.setIcon(c3g);
																	no18="Node18->";

																	frm=no17; to=no18; st=t; log(no17,no18,st);
																	
																	if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																	{
																		Thread.sleep(2000);
																		c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																		c44.setIcon(c4g);
																		no19="Node19->";
																		
																		Thread.sleep(2000);
																		c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																		c44.setIcon(c4g);
																		no19="Node19->";
																		
																		Thread.sleep(2000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		Thread.sleep(1000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		no20="Node20->";

																		frm=no18; to=no19; st=t; log(no18,no19,st);

																		frm=no19; to=no20; st=t; log(no19,no20,st);
																		
																		refresh();
																		send(cn,dest,destip,ct);
																	}
																	else
																	{
																		Thread.sleep(2000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		Thread.sleep(1000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		no20="Node20->";

																		frm=no18; to=no20; st=t; log(no18,no20,st);
																		
																		refresh();
																		send(cn,dest,destip,ct);
																	
																	}
																	
																}
																else
																{
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	Thread.sleep(1000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	no20="Node20->";

																	frm=no17; to=no19; st=t; log(no17,no19,st);

																	frm=no19; to=no20; st=t; log(no19,no20,st);
																	
																	refresh();
																	send(cn,dest,destip,ct);
																}
															}
														}
														else
														{
															Thread.sleep(2000);																														Thread.sleep(2000);
															b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
															b88.setIcon(b8g);
															no16="Node16->";
															
															Thread.sleep(2000);
															b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															b88.setIcon(b8g);
															no16="Node16->";

															frm=no14; to=no16; st=t; log(no14,no16,st);
															
															if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
															{
																Thread.sleep(2000);
																c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c22.setIcon(c2g);
																no17="Node17->";
																
																Thread.sleep(2000);
																c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c22.setIcon(c2g);
																no17="Node17->";

																frm=no16; to=no17; st=t; log(no16,no17,st);
																
																if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																{
																	Thread.sleep(2000);
																	c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	c33.setIcon(c3g);
																	no18="Node18->";
																	
																	Thread.sleep(2000);
																	c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	c33.setIcon(c3g);
																	no18="Node18->";

																	frm=no17; to=no18; st=t; log(no17,no18,st);
																	
																	if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																	{
																		Thread.sleep(2000);
																		c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																		c44.setIcon(c4g);
																		no19="Node19->";
																		
																		Thread.sleep(2000);
																		c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																		c44.setIcon(c4g);
																		no19="Node19->";
																		
																		Thread.sleep(2000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		Thread.sleep(1000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		no20="Node20->";

																		frm=no18; to=no19; st=t; log(no18,no19,st);

																		frm=no19; to=no20; st=t; log(no19,no20,st);
																		
																		refresh();
																		send(cn,dest,destip,ct);
																	}
																	else
																	{
																		Thread.sleep(2000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		Thread.sleep(1000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		no20="Node20->";

																		frm=no18; to=no20; st=t; log(no18,no20,st);
																		
																		refresh();
																		send(cn,dest,destip,ct);
																	
																	}
																	
																}
																else
																{
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	Thread.sleep(1000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	no20="Node20->";

																	frm=no17; to=no19; st=t; log(no17,no19,st);

																	frm=no19; to=no20; st=t; log(no19,no20,st);
																	
																	refresh();
																	send(cn,dest,destip,ct);
																}
															}
															else
															{
																Thread.sleep(2000);
																c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c33.setIcon(c3g);
																no18="Node18->";
																
																Thread.sleep(2000);
																c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c33.setIcon(c3g);
																no18="Node18->";

																frm=no16; to=no18; st=t; log(no16,no18,st);
																
																if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																{
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	Thread.sleep(1000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	no20="Node20->";

																	frm=no18; to=no19; st=t; log(no18,no19,st);

																	frm=no19; to=no20; st=t; log(no19,no20,st);
																	
																	refresh();
																	send(cn,dest,destip,ct);
																}
																else
																{
																	Thread.sleep(2000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	Thread.sleep(1000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	no20="Node20->";

																	frm=no18; to=no20; st=t; log(no18,no20,st);
																	
																	refresh();
																	send(cn,dest,destip,ct);
																
																}
															}
														}
													}
													else
													{
														Thread.sleep(2000);
														b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
														b77.setIcon(b7g);
														no15="Node15->";
														
														Thread.sleep(2000);
														b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														b77.setIcon(b7g);
														no15="Node15->";

														frm=no13; to=no15; st=t; log(no13,no15,st);
														
														if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
														{
															Thread.sleep(2000);
															b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
															b88.setIcon(b8g);
															no16="Node16->";
															
															Thread.sleep(2000);
															b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															b88.setIcon(b8g);
															no16="Node16->";

															frm=no15; to=no16; st=t; log(no15,no16,st);
															
															if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
															{
																Thread.sleep(2000);
																c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c22.setIcon(c2g);
																no17="Node17->";
																
																Thread.sleep(2000);
																c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c22.setIcon(c2g);
																no17="Node17->";

																frm=no16; to=no17; st=t; log(no16,no17,st);
																
																if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
																{
																	Thread.sleep(2000);
																	c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	c33.setIcon(c3g);
																	no18="Node18->";
																	
																	Thread.sleep(2000);
																	c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	c33.setIcon(c3g);
																	no18="Node18->";

																	frm=no17; to=no18; st=t; log(no17,no18,st);
																	
																	if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																	{
																		Thread.sleep(2000);
																		c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																		c44.setIcon(c4g);
																		no19="Node19->";
																		
																		Thread.sleep(2000);
																		c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																		c44.setIcon(c4g);
																		no19="Node19->";
																		
																		Thread.sleep(2000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		Thread.sleep(1000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		no20="Node20->";

																		frm=no18; to=no19; st=t; log(no18,no19,st);

																		frm=no19; to=no20; st=t; log(no19,no20,st);
																		
																		refresh();
																		send(cn,dest,destip,ct);
																	}
																	else
																	{
																		Thread.sleep(2000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		Thread.sleep(1000);
																		c55.setVisible(false);
																		Thread.sleep(1000);
																		c55.setVisible(true);
																		no20="Node20->";

																		frm=no18; to=no20; st=t; log(no18,no20,st);
																		
																		refresh();
																		send(cn,dest,destip,ct);
																	
																	}
																	
																}
																else
																{
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	Thread.sleep(1000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	no20="Node20->";

																	frm=no17; to=no19; st=t; log(no17,no19,st);

																	frm=no19; to=no20; st=t; log(no19,no20,st);
																	
																	refresh();
																	send(cn,dest,destip,ct);
																}
															}
															else
															{
																Thread.sleep(2000);
																c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c33.setIcon(c3g);
																no18="Node18->";
																
																Thread.sleep(2000);
																c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c33.setIcon(c3g);
																no18="Node18->";

																frm=no16; to=no18; st=t; log(no16,no18,st);
																
																if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																{
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	Thread.sleep(1000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	no20="Node20->";

																	frm=no18; to=no19; st=t; log(no18,no19,st);

																	frm=no19; to=no20; st=t; log(no19,no20,st);
																	
																	refresh();
																	send(cn,dest,destip,ct);
																}
																else
																{
																	Thread.sleep(2000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	Thread.sleep(1000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	no20="Node20->";

																	frm=no18; to=no20; st=t; log(no18,no20,st);
																	
																	refresh();
																	send(cn,dest,destip,ct);
																
																}
															}
														}
														else
														{
															Thread.sleep(2000);
															c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
															c22.setIcon(c2g);
															no17="Node17->";
															
															Thread.sleep(2000);
															c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															c22.setIcon(c2g);
															no17="Node17->";

															frm=no15; to=no17; st=t; log(no15,no17,st);
															
															if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
															{
																Thread.sleep(2000);
																c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c33.setIcon(c3g);
																no18="Node18->";
																
																Thread.sleep(2000);
																c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c33.setIcon(c3g);
																no18="Node18->";

																frm=no17; to=no18; st=t; log(no17,no18,st);
																
																if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																{
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	Thread.sleep(1000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	no20="Node20->";

																	frm=no18; to=no19; st=t; log(no18,no19,st);

																	frm=no19; to=no20; st=t; log(no19,no20,st);
																	
																	refresh();
																	send(cn,dest,destip,ct);
																}
																else
																{
																	Thread.sleep(2000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	Thread.sleep(1000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	no20="Node20->";

																	frm=no18; to=no20; st=t; log(no18,no20,st);
																	
																	refresh();
																	send(cn,dest,destip,ct);
																
																}
																
															}
															else
															{
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																Thread.sleep(1000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																no20="Node20->";

																frm=no17; to=no19; st=t; log(no17,no19,st);

																frm=no19; to=no20; st=t; log(no19,no20,st);
																
																refresh();
																send(cn,dest,destip,ct);
															}
														}
													}
												}
												else
												{
													mac13(no13,mac13);
												}
											}
											else
											{
												ene13(no13,ene13);
											}
										}
										else
										{
											dist13();
										}
									}
									else
									{
										mac12(no12,mac12);
									}
								}
								else
								{
									ene12(no12,ene12);
								}
							}
							else
							{
								dist12();
							}
							
						}
						else
						{
							mac11(no11,mac11);
						}
					}
					else
					{
						ene11(no11,ene11);
					}
				}
				else
				{
					dist11();
				}
			}

			void dist11() throws InterruptedException, UnknownHostException, IOException, SQLException {
				
				if(Integer.parseInt(ene12)>=fsize)
				{
					if(mac.equalsIgnoreCase(mac12))
					{
						Thread.sleep(2000);
						b4g=new ImageIcon(this.getClass().getResource("g.jpg"));
						b44.setIcon(b4g);
						no12="Node12->";
					
						Thread.sleep(2000);
						b4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
						b44.setIcon(b4g);
						no12="Node12->";

						frm=no10; to=no12; st=t; log(no10,no12,st);
						
						if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
						{
							
							if(Integer.parseInt(ene13)>=fsize)
							{
								if(mac.equalsIgnoreCase(mac13))
								{
									Thread.sleep(2000);
									b5g=new ImageIcon(this.getClass().getResource("g.jpg"));
									b55.setIcon(b5g);
									no13="Node13->";
								
									Thread.sleep(2000);
									b5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
									b55.setIcon(b5g);
									no13="Node13->";

									frm=no12; to=no13; st=t; log(no12,no13,st);
									
									if(Integer.parseInt(dis14)<=Integer.parseInt(dis15))
									{
										Thread.sleep(2000);
										b6g=new ImageIcon(this.getClass().getResource("g.jpg"));
										b66.setIcon(b6g);
										no14="Node14->";
										
										Thread.sleep(2000);
										b6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
										b66.setIcon(b6g);
										no14="Node14->";

										frm=no13; to=no14; st=t; log(no13,no14,st);
										
										if(Integer.parseInt(dis15)<=Integer.parseInt(dis16))
										{
											Thread.sleep(2000);
											b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
											b77.setIcon(b7g);
											no15="Node15->";
											
											Thread.sleep(2000);
											b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											b77.setIcon(b7g);
											no15="Node15->";

											frm=no14; to=no15; st=t; log(no14,no15,st);
											
											if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
											{
												Thread.sleep(2000);
												b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
												b88.setIcon(b8g);
												no16="Node16->";
												
												Thread.sleep(2000);
												b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												b88.setIcon(b8g);
												no16="Node16->";

												frm=no15; to=no16; st=t; log(no15,no16,st);
												
												if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
												{
													Thread.sleep(2000);
													c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
													c22.setIcon(c2g);
													no17="Node17->";
													
													Thread.sleep(2000);
													c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													c22.setIcon(c2g);
													no17="Node17->";

													frm=no16; to=no17; st=t; log(no16,no17,st);
													
													if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
													{
														Thread.sleep(2000);
														c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
														c33.setIcon(c3g);
														no18="Node18->";
														
														Thread.sleep(2000);
														c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														c33.setIcon(c3g);
														no18="Node18->";

														frm=no17; to=no18; st=t; log(no17,no18,st);
														
														if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
														{
															Thread.sleep(2000);
															c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
															c44.setIcon(c4g);
															no19="Node19->";
															
															Thread.sleep(2000);
															c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															c44.setIcon(c4g);
															no19="Node19->";
															
															Thread.sleep(2000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															Thread.sleep(1000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															no20="Node20->";

															frm=no18; to=no19; st=t; log(no18,no19,st);

															frm=no19; to=no20; st=t; log(no19,no20,st);
															
															refresh();
															send(cn,dest,destip,ct);
														}
														else
														{
															Thread.sleep(2000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															Thread.sleep(1000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															no20="Node20->";

															frm=no18; to=no20; st=t; log(no18,no20,st);
															
															refresh();
															send(cn,dest,destip,ct);
														
														}
														
													}
													else
													{
														Thread.sleep(2000);
														c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
														c44.setIcon(c4g);
														no19="Node19->";
														
														Thread.sleep(2000);
														c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														c44.setIcon(c4g);
														no19="Node19->";
														
														Thread.sleep(2000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														Thread.sleep(1000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														no20="Node20->";

														frm=no17; to=no19; st=t; log(no17,no19,st);

														frm=no19; to=no20; st=t; log(no19,no20,st);
														
														refresh();
														send(cn,dest,destip,ct);
													}
												}
												else
												{
													Thread.sleep(2000);
													c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
													c33.setIcon(c3g);
													no18="Node18->";
													
													Thread.sleep(2000);
													c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													c33.setIcon(c3g);
													no18="Node18->";

													frm=no16; to=no18; st=t; log(no16,no18,st);
													
													if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
													{
														Thread.sleep(2000);
														c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
														c44.setIcon(c4g);
														no19="Node19->";
														
														Thread.sleep(2000);
														c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														c44.setIcon(c4g);
														no19="Node19->";
														
														Thread.sleep(2000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														Thread.sleep(1000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														no20="Node20->";

														frm=no18; to=no19; st=t; log(no18,no19,st);

														frm=no19; to=no20; st=t; log(no19,no20,st);
														
														refresh();
														send(cn,dest,destip,ct);
													}
													else
													{
														Thread.sleep(2000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														Thread.sleep(1000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														no20="Node20->";

														frm=no18; to=no20; st=t; log(no18,no20,st);
														
														refresh();
														send(cn,dest,destip,ct);
													
													}
												}
											}
											else
											{
												Thread.sleep(2000);
												c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c22.setIcon(c2g);
												no17="Node17->";
												
												Thread.sleep(2000);
												c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c22.setIcon(c2g);
												no17="Node17->";

												frm=no15; to=no17; st=t; log(no15,no17,st);
												
												if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
												{
													Thread.sleep(2000);
													c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
													c33.setIcon(c3g);
													no18="Node18->";
													
													Thread.sleep(2000);
													c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													c33.setIcon(c3g);
													no18="Node18->";

													frm=no17; to=no18; st=t; log(no17,no18,st);
													
													if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
													{
														Thread.sleep(2000);
														c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
														c44.setIcon(c4g);
														no19="Node19->";
														
														Thread.sleep(2000);
														c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														c44.setIcon(c4g);
														no19="Node19->";
														
														Thread.sleep(2000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														Thread.sleep(1000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														no20="Node20->";

														frm=no18; to=no19; st=t; log(no18,no19,st);

														frm=no19; to=no20; st=t; log(no19,no20,st);
														
														refresh();
														send(cn,dest,destip,ct);
													}
													else
													{
														Thread.sleep(2000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														Thread.sleep(1000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														no20="Node20->";

														frm=no18; to=no20; st=t; log(no18,no20,st);
														
														refresh();
														send(cn,dest,destip,ct);
													
													}
													
												}
												else
												{
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													Thread.sleep(1000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													no20="Node20->";

													frm=no17; to=no19; st=t; log(no17,no19,st);

													frm=no19; to=no20; st=t; log(no19,no20,st);
													
													refresh();
													send(cn,dest,destip,ct);
												}
											}
										}
										else
										{
											Thread.sleep(2000);																														Thread.sleep(2000);
											b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
											b88.setIcon(b8g);
											no16="Node16->";
											
											Thread.sleep(2000);
											b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											b88.setIcon(b8g);
											no16="Node16->";

											frm=no14; to=no16; st=t; log(no14,no16,st);
											
											if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
											{
												Thread.sleep(2000);
												c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c22.setIcon(c2g);
												no17="Node17->";
												
												Thread.sleep(2000);
												c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c22.setIcon(c2g);
												no17="Node17->";

												frm=no16; to=no17; st=t; log(no16,no17,st);
												
												if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
												{
													Thread.sleep(2000);
													c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
													c33.setIcon(c3g);
													no18="Node18->";
													
													Thread.sleep(2000);
													c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													c33.setIcon(c3g);
													no18="Node18->";

													frm=no17; to=no18; st=t; log(no17,no18,st);
													
													if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
													{
														Thread.sleep(2000);
														c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
														c44.setIcon(c4g);
														no19="Node19->";
														
														Thread.sleep(2000);
														c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														c44.setIcon(c4g);
														no19="Node19->";
														
														Thread.sleep(2000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														Thread.sleep(1000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														no20="Node20->";

														frm=no18; to=no19; st=t; log(no18,no19,st);

														frm=no19; to=no20; st=t; log(no19,no20,st);
														
														refresh();
														send(cn,dest,destip,ct);
													}
													else
													{
														Thread.sleep(2000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														Thread.sleep(1000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														no20="Node20->";

														frm=no18; to=no20; st=t; log(no18,no20,st);
														
														refresh();
														send(cn,dest,destip,ct);
													
													}
													
												}
												else
												{
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													Thread.sleep(1000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													no20="Node20->";

													frm=no17; to=no19; st=t; log(no17,no19,st);

													frm=no19; to=no20; st=t; log(no19,no20,st);
													
													refresh();
													send(cn,dest,destip,ct);
												}
											}
											else
											{
												Thread.sleep(2000);
												c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c33.setIcon(c3g);
												no18="Node18->";
												
												Thread.sleep(2000);
												c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c33.setIcon(c3g);
												no18="Node18->";

												frm=no16; to=no18; st=t; log(no16,no18,st);
												
												if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
												{
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													Thread.sleep(1000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													no20="Node20->";

													frm=no18; to=no19; st=t; log(no18,no19,st);

													frm=no19; to=no20; st=t; log(no19,no20,st);
													
													refresh();
													send(cn,dest,destip,ct);
												}
												else
												{
													Thread.sleep(2000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													Thread.sleep(1000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													no20="Node20->";

													frm=no18; to=no20; st=t; log(no18,no20,st);
													
													refresh();
													send(cn,dest,destip,ct);
												
												}
											}
										}
									}
									else
									{
										Thread.sleep(2000);
										b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
										b77.setIcon(b7g);
										no15="Node15->";
										
										Thread.sleep(2000);
										b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
										b77.setIcon(b7g);
										no15="Node15->";

										frm=no13; to=no15; st=t; log(no13,no15,st);
										
										if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
										{
											Thread.sleep(2000);
											b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
											b88.setIcon(b8g);
											no16="Node16->";
											
											Thread.sleep(2000);
											b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											b88.setIcon(b8g);
											no16="Node16->";

											frm=no15; to=no16; st=t; log(no15,no16,st);
											
											if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
											{
												Thread.sleep(2000);
												c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c22.setIcon(c2g);
												no17="Node17->";
												
												Thread.sleep(2000);
												c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c22.setIcon(c2g);
												no17="Node17->";

												frm=no16; to=no17; st=t; log(no16,no17,st);
												
												if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
												{
													Thread.sleep(2000);
													c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
													c33.setIcon(c3g);
													no18="Node18->";
													
													Thread.sleep(2000);
													c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													c33.setIcon(c3g);
													no18="Node18->";

													frm=no17; to=no18; st=t; log(no17,no18,st);
													
													if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
													{
														Thread.sleep(2000);
														c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
														c44.setIcon(c4g);
														no19="Node19->";
														
														Thread.sleep(2000);
														c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														c44.setIcon(c4g);
														no19="Node19->";
														
														Thread.sleep(2000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														Thread.sleep(1000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														no20="Node20->";

														frm=no18; to=no19; st=t; log(no18,no19,st);

														frm=no19; to=no20; st=t; log(no19,no20,st);
														
														refresh();
														send(cn,dest,destip,ct);
													}
													else
													{
														Thread.sleep(2000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														Thread.sleep(1000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														no20="Node20->";

														frm=no18; to=no20; st=t; log(no18,no20,st);
														
														refresh();
														send(cn,dest,destip,ct);
													
													}
													
												}
												else
												{
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													Thread.sleep(1000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													no20="Node20->";

													frm=no17; to=no19; st=t; log(no17,no19,st);

													frm=no19; to=no20; st=t; log(no19,no20,st);
													
													refresh();
													send(cn,dest,destip,ct);
												}
											}
											else
											{
												Thread.sleep(2000);
												c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c33.setIcon(c3g);
												no18="Node18->";
												
												Thread.sleep(2000);
												c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c33.setIcon(c3g);
												no18="Node18->";

												frm=no16; to=no18; st=t; log(no16,no18,st);
												
												if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
												{
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													Thread.sleep(1000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													no20="Node20->";

													frm=no18; to=no19; st=t; log(no18,no19,st);

													frm=no19; to=no20; st=t; log(no19,no20,st);
													
													refresh();
													send(cn,dest,destip,ct);
												}
												else
												{
													Thread.sleep(2000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													Thread.sleep(1000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													no20="Node20->";

													frm=no18; to=no20; st=t; log(no18,no20,st);
													
													refresh();
													send(cn,dest,destip,ct);
												
												}
											}
										}
										else
										{
											Thread.sleep(2000);
											c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
											c22.setIcon(c2g);
											no17="Node17->";
											
											Thread.sleep(2000);
											c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											c22.setIcon(c2g);
											no17="Node17->";

											frm=no15; to=no17; st=t; log(no15,no17,st);
											
											if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
											{
												Thread.sleep(2000);
												c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c33.setIcon(c3g);
												no18="Node18->";
												
												Thread.sleep(2000);
												c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c33.setIcon(c3g);
												no18="Node18->";

												frm=no17; to=no18; st=t; log(no17,no18,st);
												
												if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
												{
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													Thread.sleep(1000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													no20="Node20->";

													frm=no18; to=no19; st=t; log(no18,no19,st);

													frm=no19; to=no20; st=t; log(no19,no20,st);
													
													refresh();
													send(cn,dest,destip,ct);
												}
												else
												{
													Thread.sleep(2000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													Thread.sleep(1000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													no20="Node20->";

													frm=no18; to=no20; st=t; log(no18,no20,st);
													
													refresh();
													send(cn,dest,destip,ct);
												
												}
												
											}
											else
											{
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												Thread.sleep(1000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												no20="Node20->";

												frm=no17; to=no19; st=t; log(no17,no19,st);

												frm=no19; to=no20; st=t; log(no19,no20,st);
												
												refresh();
												send(cn,dest,destip,ct);
											}
										}
									}
								}
								else
								{
									mac13(no13,mac13);
								}
							}
							else
							{
								ene13(no13,ene13);
							}
						}
						else
						{
							dist13();
						}
					}
					else
					{
						mac12(no12,mac12);
					}
				}
				else
				{
					ene12(no12,ene12);
				}
			}

			 void ene11(String node, String ene) throws UnknownHostException, InterruptedException, IOException, SQLException {
			// TODO Auto-generated method stub
				Thread.sleep(2000);
				b4r=new ImageIcon(this.getClass().getResource("r.jpg"));
				b44.setIcon(b4r);
				no11="Node11->";
				
			   	Socket sc = new Socket("localhost",310);
				DataOutputStream d = new DataOutputStream(sc.getOutputStream());
				d.writeUTF(no11);
				d.writeUTF(ene);
				
				DataInputStream din = new DataInputStream(sc.getInputStream());
				String mes = din.readUTF();
				System.out.println(mes);
				
				enemac11();
		}

			 void mac11(String node, String mac) throws UnknownHostException, IOException, InterruptedException, SQLException {
			// TODO Auto-generated method stub
				Thread.sleep(2000);
				b3r=new ImageIcon(this.getClass().getResource("r.jpg"));
				b33.setIcon(b3r);
				no11="Node11->";
				
				Socket sc = new Socket("localhost",309);
				DataOutputStream d = new DataOutputStream(sc.getOutputStream());
				d.writeUTF(no11);
				d.writeUTF(mac);
					
				DataInputStream din = new DataInputStream(sc.getInputStream());
				String mes = din.readUTF();
				System.out.println(mes);
				
				enemac11();
		}

			 void enemac11() throws InterruptedException, UnknownHostException, IOException, SQLException {

					if(Integer.parseInt(dis12)<=Integer.parseInt(dis13))
					{
						if(Integer.parseInt(ene12)>=fsize)
						{
							if(mac.equalsIgnoreCase(mac12))
							{
								Thread.sleep(2000);
								b4g=new ImageIcon(this.getClass().getResource("g.jpg"));
								b44.setIcon(b4g);
								no12="Node12->";
							
								Thread.sleep(2000);
								b4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								b44.setIcon(b4g);
								no12="Node12->";

								frm="Node10->"; to="Node11->"; st=nt; log(frm,to,st);
								frm="Node10->"; to="Node12->"; st=t; log(frm,to,st);
								
								if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
								{
									
									if(Integer.parseInt(ene13)>=fsize)
									{
										if(mac.equalsIgnoreCase(mac13))
										{
											Thread.sleep(2000);
											b5g=new ImageIcon(this.getClass().getResource("g.jpg"));
											b55.setIcon(b5g);
											no13="Node13->";
										
											Thread.sleep(2000);
											b5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											b55.setIcon(b5g);
											no13="Node13->";

											frm=no12; to=no13; st=t; log(no12,no13,st);
											
											if(Integer.parseInt(dis14)<=Integer.parseInt(dis15))
											{
												Thread.sleep(2000);
												b6g=new ImageIcon(this.getClass().getResource("g.jpg"));
												b66.setIcon(b6g);
												no14="Node14->";
												
												Thread.sleep(2000);
												b6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												b66.setIcon(b6g);
												no14="Node14->";

												frm=no13; to=no14; st=t; log(no13,no14,st);
												
												if(Integer.parseInt(dis15)<=Integer.parseInt(dis16))
												{
													Thread.sleep(2000);
													b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
													b77.setIcon(b7g);
													no15="Node15->";
													
													Thread.sleep(2000);
													b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													b77.setIcon(b7g);
													no15="Node15->";

													frm=no14; to=no15; st=t; log(no14,no15,st);
													
													if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
													{
														Thread.sleep(2000);
														b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
														b88.setIcon(b8g);
														no16="Node16->";
														
														Thread.sleep(2000);
														b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														b88.setIcon(b8g);
														no16="Node16->";

														frm=no15; to=no16; st=t; log(no15,no16,st);
														
														if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
														{
															Thread.sleep(2000);
															c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
															c22.setIcon(c2g);
															no17="Node17->";
															
															Thread.sleep(2000);
															c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															c22.setIcon(c2g);
															no17="Node17->";

															frm=no16; to=no17; st=t; log(no16,no17,st);
															
															if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
															{
																Thread.sleep(2000);
																c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c33.setIcon(c3g);
																no18="Node18->";
																
																Thread.sleep(2000);
																c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c33.setIcon(c3g);
																no18="Node18->";

																frm=no17; to=no18; st=t; log(no17,no18,st);
																
																if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
																{
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																	c44.setIcon(c4g);
																	no19="Node19->";
																	
																	Thread.sleep(2000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	Thread.sleep(1000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	no20="Node20->";

																	frm=no18; to=no19; st=t; log(no18,no19,st);

																	frm=no19; to=no20; st=t; log(no19,no20,st);
																	
																	refresh();
																	send(cn,dest,destip,ct);
																}
																else
																{
																	Thread.sleep(2000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	Thread.sleep(1000);
																	c55.setVisible(false);
																	Thread.sleep(1000);
																	c55.setVisible(true);
																	no20="Node20->";

																	frm=no18; to=no20; st=t; log(no18,no20,st);
																	
																	refresh();
																	send(cn,dest,destip,ct);
																
																}
																
															}
															else
															{
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																Thread.sleep(1000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																no20="Node20->";

																frm=no17; to=no19; st=t; log(no17,no19,st);

																frm=no19; to=no20; st=t; log(no19,no20,st);
																
																refresh();
																send(cn,dest,destip,ct);
															}
														}
														else
														{
															Thread.sleep(2000);
															c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
															c33.setIcon(c3g);
															no18="Node18->";
															
															Thread.sleep(2000);
															c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															c33.setIcon(c3g);
															no18="Node18->";

															frm=no16; to=no18; st=t; log(no16,no18,st);
															
															if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
															{
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																Thread.sleep(1000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																no20="Node20->";

																frm=no18; to=no19; st=t; log(no18,no19,st);

																frm=no19; to=no20; st=t; log(no19,no20,st);
																
																refresh();
																send(cn,dest,destip,ct);
															}
															else
															{
																Thread.sleep(2000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																Thread.sleep(1000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																no20="Node20->";

																frm=no18; to=no20; st=t; log(no18,no20,st);
																
																refresh();
																send(cn,dest,destip,ct);
															
															}
														}
													}
													else
													{
														Thread.sleep(2000);
														c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
														c22.setIcon(c2g);
														no17="Node17->";
														
														Thread.sleep(2000);
														c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														c22.setIcon(c2g);
														no17="Node17->";

														frm=no15; to=no17; st=t; log(no15,no17,st);
														
														if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
														{
															Thread.sleep(2000);
															c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
															c33.setIcon(c3g);
															no18="Node18->";
															
															Thread.sleep(2000);
															c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															c33.setIcon(c3g);
															no18="Node18->";

															frm=no17; to=no18; st=t; log(no17,no18,st);
															
															if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
															{
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																Thread.sleep(1000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																no20="Node20->";

																frm=no18; to=no19; st=t; log(no18,no19,st);

																frm=no19; to=no20; st=t; log(no19,no20,st);
																
																refresh();
																send(cn,dest,destip,ct);
															}
															else
															{
																Thread.sleep(2000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																Thread.sleep(1000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																no20="Node20->";

																frm=no18; to=no20; st=t; log(no18,no20,st);
																
																refresh();
																send(cn,dest,destip,ct);
															
															}
															
														}
														else
														{
															Thread.sleep(2000);
															c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
															c44.setIcon(c4g);
															no19="Node19->";
															
															Thread.sleep(2000);
															c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															c44.setIcon(c4g);
															no19="Node19->";
															
															Thread.sleep(2000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															Thread.sleep(1000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															no20="Node20->";

															frm=no17; to=no19; st=t; log(no17,no19,st);

															frm=no19; to=no20; st=t; log(no19,no20,st);
															
															refresh();
															send(cn,dest,destip,ct);
														}
													}
												}
												else
												{
													Thread.sleep(2000);																														Thread.sleep(2000);
													b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
													b88.setIcon(b8g);
													no16="Node16->";
													
													Thread.sleep(2000);
													b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													b88.setIcon(b8g);
													no16="Node16->";

													frm=no14; to=no16; st=t; log(no14,no16,st);
													
													if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
													{
														Thread.sleep(2000);
														c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
														c22.setIcon(c2g);
														no17="Node17->";
														
														Thread.sleep(2000);
														c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														c22.setIcon(c2g);
														no17="Node17->";

														frm=no16; to=no17; st=t; log(no16,no17,st);
														
														if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
														{
															Thread.sleep(2000);
															c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
															c33.setIcon(c3g);
															no18="Node18->";
															
															Thread.sleep(2000);
															c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															c33.setIcon(c3g);
															no18="Node18->";

															frm=no17; to=no18; st=t; log(no17,no18,st);
															
															if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
															{
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																Thread.sleep(1000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																no20="Node20->";

																frm=no18; to=no19; st=t; log(no18,no19,st);

																frm=no19; to=no20; st=t; log(no19,no20,st);
																
																refresh();
																send(cn,dest,destip,ct);
															}
															else
															{
																Thread.sleep(2000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																Thread.sleep(1000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																no20="Node20->";

																frm=no18; to=no20; st=t; log(no18,no20,st);
																
																refresh();
																send(cn,dest,destip,ct);
															
															}
															
														}
														else
														{
															Thread.sleep(2000);
															c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
															c44.setIcon(c4g);
															no19="Node19->";
															
															Thread.sleep(2000);
															c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															c44.setIcon(c4g);
															no19="Node19->";
															
															Thread.sleep(2000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															Thread.sleep(1000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															no20="Node20->";

															frm=no17; to=no19; st=t; log(no17,no19,st);

															frm=no19; to=no20; st=t; log(no19,no20,st);
															
															refresh();
															send(cn,dest,destip,ct);
														}
													}
													else
													{
														Thread.sleep(2000);
														c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
														c33.setIcon(c3g);
														no18="Node18->";
														
														Thread.sleep(2000);
														c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														c33.setIcon(c3g);
														no18="Node18->";

														frm=no16; to=no18; st=t; log(no16,no18,st);
														
														if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
														{
															Thread.sleep(2000);
															c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
															c44.setIcon(c4g);
															no19="Node19->";
															
															Thread.sleep(2000);
															c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															c44.setIcon(c4g);
															no19="Node19->";
															
															Thread.sleep(2000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															Thread.sleep(1000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															no20="Node20->";

															frm=no18; to=no19; st=t; log(no18,no19,st);

															frm=no19; to=no20; st=t; log(no19,no20,st);
															
															refresh();
															send(cn,dest,destip,ct);
														}
														else
														{
															Thread.sleep(2000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															Thread.sleep(1000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															no20="Node20->";

															frm=no18; to=no20; st=t; log(no18,no20,st);
															
															refresh();
															send(cn,dest,destip,ct);
														
														}
													}
												}
											}
											else
											{
												Thread.sleep(2000);
												b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
												b77.setIcon(b7g);
												no15="Node15->";
												
												Thread.sleep(2000);
												b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												b77.setIcon(b7g);
												no15="Node15->";

												frm=no13; to=no15; st=t; log(no13,no15,st);
												
												if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
												{
													Thread.sleep(2000);
													b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
													b88.setIcon(b8g);
													no16="Node16->";
													
													Thread.sleep(2000);
													b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													b88.setIcon(b8g);
													no16="Node16->";

													frm=no15; to=no16; st=t; log(no15,no16,st);
													
													if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
													{
														Thread.sleep(2000);
														c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
														c22.setIcon(c2g);
														no17="Node17->";
														
														Thread.sleep(2000);
														c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														c22.setIcon(c2g);
														no17="Node17->";

														frm=no16; to=no17; st=t; log(no16,no17,st);
														
														if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
														{
															Thread.sleep(2000);
															c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
															c33.setIcon(c3g);
															no18="Node18->";
															
															Thread.sleep(2000);
															c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															c33.setIcon(c3g);
															no18="Node18->";

															frm=no17; to=no18; st=t; log(no17,no18,st);
															
															if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
															{
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
																c44.setIcon(c4g);
																no19="Node19->";
																
																Thread.sleep(2000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																Thread.sleep(1000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																no20="Node20->";

																frm=no18; to=no19; st=t; log(no18,no19,st);

																frm=no19; to=no20; st=t; log(no19,no20,st);
																
																refresh();
																send(cn,dest,destip,ct);
															}
															else
															{
																Thread.sleep(2000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																Thread.sleep(1000);
																c55.setVisible(false);
																Thread.sleep(1000);
																c55.setVisible(true);
																no20="Node20->";

																frm=no18; to=no20; st=t; log(no18,no20,st);
																
																refresh();
																send(cn,dest,destip,ct);
															
															}
															
														}
														else
														{
															Thread.sleep(2000);
															c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
															c44.setIcon(c4g);
															no19="Node19->";
															
															Thread.sleep(2000);
															c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															c44.setIcon(c4g);
															no19="Node19->";
															
															Thread.sleep(2000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															Thread.sleep(1000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															no20="Node20->";

															frm=no17; to=no19; st=t; log(no17,no19,st);

															frm=no19; to=no20; st=t; log(no19,no20,st);
															
															refresh();
															send(cn,dest,destip,ct);
														}
													}
													else
													{
														Thread.sleep(2000);
														c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
														c33.setIcon(c3g);
														no18="Node18->";
														
														Thread.sleep(2000);
														c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														c33.setIcon(c3g);
														no18="Node18->";

														frm=no16; to=no18; st=t; log(no16,no18,st);
														
														if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
														{
															Thread.sleep(2000);
															c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
															c44.setIcon(c4g);
															no19="Node19->";
															
															Thread.sleep(2000);
															c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															c44.setIcon(c4g);
															no19="Node19->";
															
															Thread.sleep(2000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															Thread.sleep(1000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															no20="Node20->";

															frm=no18; to=no19; st=t; log(no18,no19,st);

															frm=no19; to=no20; st=t; log(no19,no20,st);
															
															refresh();
															send(cn,dest,destip,ct);
														}
														else
														{
															Thread.sleep(2000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															Thread.sleep(1000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															no20="Node20->";

															frm=no18; to=no20; st=t; log(no18,no20,st);
															
															refresh();
															send(cn,dest,destip,ct);
														
														}
													}
												}
												else
												{
													Thread.sleep(2000);
													c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
													c22.setIcon(c2g);
													no17="Node17->";
													
													Thread.sleep(2000);
													c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													c22.setIcon(c2g);
													no17="Node17->";

													frm=no15; to=no17; st=t; log(no15,no17,st);
													
													if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
													{
														Thread.sleep(2000);
														c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
														c33.setIcon(c3g);
														no18="Node18->";
														
														Thread.sleep(2000);
														c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														c33.setIcon(c3g);
														no18="Node18->";

														frm=no17; to=no18; st=t; log(no17,no18,st);
														
														if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
														{
															Thread.sleep(2000);
															c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
															c44.setIcon(c4g);
															no19="Node19->";
															
															Thread.sleep(2000);
															c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
															c44.setIcon(c4g);
															no19="Node19->";
															
															Thread.sleep(2000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															Thread.sleep(1000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															no20="Node20->";

															frm=no18; to=no19; st=t; log(no18,no19,st);

															frm=no19; to=no20; st=t; log(no19,no20,st);
															
															refresh();
															send(cn,dest,destip,ct);
														}
														else
														{
															Thread.sleep(2000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															Thread.sleep(1000);
															c55.setVisible(false);
															Thread.sleep(1000);
															c55.setVisible(true);
															no20="Node20->";

															frm=no18; to=no20; st=t; log(no18,no20,st);
															
															refresh();
															send(cn,dest,destip,ct);
														
														}
														
													}
													else
													{
														Thread.sleep(2000);
														c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
														c44.setIcon(c4g);
														no19="Node19->";
														
														Thread.sleep(2000);
														c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														c44.setIcon(c4g);
														no19="Node19->";
														
														Thread.sleep(2000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														Thread.sleep(1000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														no20="Node20->";

														frm=no17; to=no19; st=t; log(no17,no19,st);

														frm=no19; to=no20; st=t; log(no19,no20,st);
														
														refresh();
														send(cn,dest,destip,ct);
													}
												}
											}
										}
										else
										{
											mac13(no13,mac13);
										}
									}
									else
									{
										ene13(no13,ene13);
									}
								}
								else
								{
									dist13();
								}
							}
							else
							{
								mac12(no12,mac12);
							}
						}
						else
						{
							ene12(no12,ene12);
						}
					}
					else
					{
						dist12();
					}
					
			}

			void mac12(String node, String mac) throws InterruptedException, UnknownHostException, IOException, SQLException {
			
		    	 	Thread.sleep(2000);
					b4r=new ImageIcon(this.getClass().getResource("r.jpg"));
					b44.setIcon(b4r);
					no12="Node12->";
					
					Socket sc = new Socket("localhost",309);
					DataOutputStream d = new DataOutputStream(sc.getOutputStream());
					d.writeUTF(no12);
					d.writeUTF(mac);
						
					DataInputStream din = new DataInputStream(sc.getInputStream());
					String mes = din.readUTF();
					System.out.println(mes);
					
					enemac12();
		}

			 void enemac12() throws InterruptedException, UnknownHostException, IOException, SQLException {
				 
				 
					if(Integer.parseInt(dis13)<=Integer.parseInt(dis14))
					{
						
						if(Integer.parseInt(ene13)>=fsize)
						{
							if(mac.equalsIgnoreCase(mac13))
							{
								Thread.sleep(2000);
								b5g=new ImageIcon(this.getClass().getResource("g.jpg"));
								b55.setIcon(b5g);
								no13="Node13->";
							
								Thread.sleep(2000);
								b5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								b55.setIcon(b5g);
								no13="Node13->";

								frm=no11; to="Node12->"; st=nt; log(no11,to,st);
								
								frm=no11; to=no13; st=t; log(no11,no13,st);
								
								if(Integer.parseInt(dis14)<=Integer.parseInt(dis15))
								{
									Thread.sleep(2000);
									b6g=new ImageIcon(this.getClass().getResource("g.jpg"));
									b66.setIcon(b6g);
									no14="Node14->";
									
									Thread.sleep(2000);
									b6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
									b66.setIcon(b6g);
									no14="Node14->";

									frm=no13; to=no14; st=t; log(no13,no14,st);
									
									if(Integer.parseInt(dis15)<=Integer.parseInt(dis16))
									{
										Thread.sleep(2000);
										b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
										b77.setIcon(b7g);
										no15="Node15->";
										
										Thread.sleep(2000);
										b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
										b77.setIcon(b7g);
										no15="Node15->";

										frm=no14; to=no15; st=t; log(no14,no15,st);
										
										if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
										{
											Thread.sleep(2000);
											b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
											b88.setIcon(b8g);
											no16="Node16->";
											
											Thread.sleep(2000);
											b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											b88.setIcon(b8g);
											no16="Node16->";

											frm=no15; to=no16; st=t; log(no15,no16,st);
											
											if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
											{
												Thread.sleep(2000);
												c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c22.setIcon(c2g);
												no17="Node17->";
												
												Thread.sleep(2000);
												c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c22.setIcon(c2g);
												no17="Node17->";

												frm=no16; to=no17; st=t; log(no16,no17,st);
												
												if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
												{
													Thread.sleep(2000);
													c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
													c33.setIcon(c3g);
													no18="Node18->";
													
													Thread.sleep(2000);
													c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													c33.setIcon(c3g);
													no18="Node18->";

													frm=no17; to=no18; st=t; log(no17,no18,st);
													
													if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
													{
														Thread.sleep(2000);
														c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
														c44.setIcon(c4g);
														no19="Node19->";
														
														Thread.sleep(2000);
														c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
														c44.setIcon(c4g);
														no19="Node19->";
														
														Thread.sleep(2000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														Thread.sleep(1000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														no20="Node20->";

														frm=no18; to=no19; st=t; log(no18,no19,st);

														frm=no19; to=no20; st=t; log(no19,no20,st);
														
														refresh();
														send(cn,dest,destip,ct);
													}
													else
													{
														Thread.sleep(2000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														Thread.sleep(1000);
														c55.setVisible(false);
														Thread.sleep(1000);
														c55.setVisible(true);
														no20="Node20->";

														frm=no18; to=no20; st=t; log(no18,no20,st);
														
														refresh();
														send(cn,dest,destip,ct);
													
													}
													
												}
												else
												{
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													Thread.sleep(1000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													no20="Node20->";

													frm=no17; to=no19; st=t; log(no17,no19,st);

													frm=no19; to=no20; st=t; log(no19,no20,st);
													
													refresh();
													send(cn,dest,destip,ct);
												}
											}
											else
											{
												Thread.sleep(2000);
												c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c33.setIcon(c3g);
												no18="Node18->";
												
												Thread.sleep(2000);
												c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c33.setIcon(c3g);
												no18="Node18->";

												frm=no16; to=no18; st=t; log(no16,no18,st);
												
												if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
												{
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													Thread.sleep(1000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													no20="Node20->";

													frm=no18; to=no19; st=t; log(no18,no19,st);

													frm=no19; to=no20; st=t; log(no19,no20,st);
													
													refresh();
													send(cn,dest,destip,ct);
												}
												else
												{
													Thread.sleep(2000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													Thread.sleep(1000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													no20="Node20->";

													frm=no18; to=no20; st=t; log(no18,no20,st);
													
													refresh();
													send(cn,dest,destip,ct);
												
												}
											}
										}
										else
										{
											Thread.sleep(2000);
											c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
											c22.setIcon(c2g);
											no17="Node17->";
											
											Thread.sleep(2000);
											c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											c22.setIcon(c2g);
											no17="Node17->";

											frm=no15; to=no17; st=t; log(no15,no17,st);
											
											if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
											{
												Thread.sleep(2000);
												c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c33.setIcon(c3g);
												no18="Node18->";
												
												Thread.sleep(2000);
												c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c33.setIcon(c3g);
												no18="Node18->";

												frm=no17; to=no18; st=t; log(no17,no18,st);
												
												if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
												{
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													Thread.sleep(1000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													no20="Node20->";

													frm=no18; to=no19; st=t; log(no18,no19,st);

													frm=no19; to=no20; st=t; log(no19,no20,st);
													
													refresh();
													send(cn,dest,destip,ct);
												}
												else
												{
													Thread.sleep(2000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													Thread.sleep(1000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													no20="Node20->";

													frm=no18; to=no20; st=t; log(no18,no20,st);
													
													refresh();
													send(cn,dest,destip,ct);
												
												}
												
											}
											else
											{
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												Thread.sleep(1000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												no20="Node20->";

												frm=no17; to=no19; st=t; log(no17,no19,st);

												frm=no19; to=no20; st=t; log(no19,no20,st);
												
												refresh();
												send(cn,dest,destip,ct);
											}
										}
									}
									else
									{
										Thread.sleep(2000);																														Thread.sleep(2000);
										b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
										b88.setIcon(b8g);
										no16="Node16->";
										
										Thread.sleep(2000);
										b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
										b88.setIcon(b8g);
										no16="Node16->";

										frm=no14; to=no16; st=t; log(no14,no16,st);
										
										if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
										{
											Thread.sleep(2000);
											c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
											c22.setIcon(c2g);
											no17="Node17->";
											
											Thread.sleep(2000);
											c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											c22.setIcon(c2g);
											no17="Node17->";

											frm=no16; to=no17; st=t; log(no16,no17,st);
											
											if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
											{
												Thread.sleep(2000);
												c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c33.setIcon(c3g);
												no18="Node18->";
												
												Thread.sleep(2000);
												c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c33.setIcon(c3g);
												no18="Node18->";

												frm=no17; to=no18; st=t; log(no17,no18,st);
												
												if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
												{
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													Thread.sleep(1000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													no20="Node20->";

													frm=no18; to=no19; st=t; log(no18,no19,st);

													frm=no19; to=no20; st=t; log(no19,no20,st);
													
													refresh();
													send(cn,dest,destip,ct);
												}
												else
												{
													Thread.sleep(2000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													Thread.sleep(1000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													no20="Node20->";

													frm=no18; to=no20; st=t; log(no18,no20,st);
													
													refresh();
													send(cn,dest,destip,ct);
												
												}
												
											}
											else
											{
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												Thread.sleep(1000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												no20="Node20->";

												frm=no17; to=no19; st=t; log(no17,no19,st);

												frm=no19; to=no20; st=t; log(no19,no20,st);
												
												refresh();
												send(cn,dest,destip,ct);
											}
										}
										else
										{
											Thread.sleep(2000);
											c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
											c33.setIcon(c3g);
											no18="Node18->";
											
											Thread.sleep(2000);
											c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											c33.setIcon(c3g);
											no18="Node18->";

											frm=no16; to=no18; st=t; log(no16,no18,st);
											
											if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
											{
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												Thread.sleep(1000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												no20="Node20->";

												frm=no18; to=no19; st=t; log(no18,no19,st);

												frm=no19; to=no20; st=t; log(no19,no20,st);
												
												refresh();
												send(cn,dest,destip,ct);
											}
											else
											{
												Thread.sleep(2000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												Thread.sleep(1000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												no20="Node20->";

												frm=no18; to=no20; st=t; log(no18,no20,st);
												
												refresh();
												send(cn,dest,destip,ct);
											
											}
										}
									}
								}
								else
								{
									Thread.sleep(2000);
									b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
									b77.setIcon(b7g);
									no15="Node15->";
									
									Thread.sleep(2000);
									b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
									b77.setIcon(b7g);
									no15="Node15->";

									frm=no13; to=no15; st=t; log(no13,no15,st);
									
									if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
									{
										Thread.sleep(2000);
										b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
										b88.setIcon(b8g);
										no16="Node16->";
										
										Thread.sleep(2000);
										b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
										b88.setIcon(b8g);
										no16="Node16->";

										frm=no15; to=no16; st=t; log(no15,no16,st);
										
										if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
										{
											Thread.sleep(2000);
											c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
											c22.setIcon(c2g);
											no17="Node17->";
											
											Thread.sleep(2000);
											c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											c22.setIcon(c2g);
											no17="Node17->";

											frm=no16; to=no17; st=t; log(no16,no17,st);
											
											if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
											{
												Thread.sleep(2000);
												c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c33.setIcon(c3g);
												no18="Node18->";
												
												Thread.sleep(2000);
												c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c33.setIcon(c3g);
												no18="Node18->";

												frm=no17; to=no18; st=t; log(no17,no18,st);
												
												if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
												{
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													Thread.sleep(1000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													no20="Node20->";

													frm=no18; to=no19; st=t; log(no18,no19,st);

													frm=no19; to=no20; st=t; log(no19,no20,st);
													
													refresh();
													send(cn,dest,destip,ct);
												}
												else
												{
													Thread.sleep(2000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													Thread.sleep(1000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													no20="Node20->";

													frm=no18; to=no20; st=t; log(no18,no20,st);
													
													refresh();
													send(cn,dest,destip,ct);
												
												}
												
											}
											else
											{
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												Thread.sleep(1000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												no20="Node20->";

												frm=no17; to=no19; st=t; log(no17,no19,st);

												frm=no19; to=no20; st=t; log(no19,no20,st);
												
												refresh();
												send(cn,dest,destip,ct);
											}
										}
										else
										{
											Thread.sleep(2000);
											c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
											c33.setIcon(c3g);
											no18="Node18->";
											
											Thread.sleep(2000);
											c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											c33.setIcon(c3g);
											no18="Node18->";

											frm=no16; to=no18; st=t; log(no16,no18,st);
											
											if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
											{
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												Thread.sleep(1000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												no20="Node20->";

												frm=no18; to=no19; st=t; log(no18,no19,st);

												frm=no19; to=no20; st=t; log(no19,no20,st);
												
												refresh();
												send(cn,dest,destip,ct);
											}
											else
											{
												Thread.sleep(2000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												Thread.sleep(1000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												no20="Node20->";

												frm=no18; to=no20; st=t; log(no18,no20,st);
												
												refresh();
												send(cn,dest,destip,ct);
											
											}
										}
									}
									else
									{
										Thread.sleep(2000);
										c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
										c22.setIcon(c2g);
										no17="Node17->";
										
										Thread.sleep(2000);
										c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
										c22.setIcon(c2g);
										no17="Node17->";

										frm=no15; to=no17; st=t; log(no15,no17,st);
										
										if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
										{
											Thread.sleep(2000);
											c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
											c33.setIcon(c3g);
											no18="Node18->";
											
											Thread.sleep(2000);
											c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											c33.setIcon(c3g);
											no18="Node18->";

											frm=no17; to=no18; st=t; log(no17,no18,st);
											
											if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
											{
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												Thread.sleep(1000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												no20="Node20->";

												frm=no18; to=no19; st=t; log(no18,no19,st);

												frm=no19; to=no20; st=t; log(no19,no20,st);
												
												refresh();
												send(cn,dest,destip,ct);
											}
											else
											{
												Thread.sleep(2000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												Thread.sleep(1000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												no20="Node20->";

												frm=no18; to=no20; st=t; log(no18,no20,st);
												
												refresh();
												send(cn,dest,destip,ct);
											
											}
											
										}
										else
										{
											Thread.sleep(2000);
											c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
											c44.setIcon(c4g);
											no19="Node19->";
											
											Thread.sleep(2000);
											c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											c44.setIcon(c4g);
											no19="Node19->";
											
											Thread.sleep(2000);
											c55.setVisible(false);
											Thread.sleep(1000);
											c55.setVisible(true);
											Thread.sleep(1000);
											c55.setVisible(false);
											Thread.sleep(1000);
											c55.setVisible(true);
											no20="Node20->";

											frm=no17; to=no19; st=t; log(no17,no19,st);

											frm=no19; to=no20; st=t; log(no19,no20,st);
											
											refresh();
											send(cn,dest,destip,ct);
										}
									}
								}
							}
							else
							{
								mac13(no13,mac13);
							}
						}
						else
						{
							ene13(no13,ene13);
						}
					}
					else
					{
						dist13();
					}
			 }

			void ene12(String node, String ene) throws InterruptedException, UnknownHostException, IOException, SQLException {
			// TODO Auto-generated method stub

				
				Thread.sleep(2000);
				b4r=new ImageIcon(this.getClass().getResource("r.jpg"));
				b44.setIcon(b4r);
				no12="Node12->";
				
			   	Socket sc = new Socket("localhost",310);
				DataOutputStream d = new DataOutputStream(sc.getOutputStream());
				d.writeUTF(no12);
				d.writeUTF(ene);
				
				DataInputStream din = new DataInputStream(sc.getInputStream());
				String mes = din.readUTF();
				System.out.println(mes);

				enemac12();
		
		}

			 void dist12() throws InterruptedException, UnknownHostException, IOException, SQLException {
			
					if(Integer.parseInt(ene13)>=fsize)
					{
						if(mac.equalsIgnoreCase(mac13))
						{
							Thread.sleep(2000);
							b5g=new ImageIcon(this.getClass().getResource("g.jpg"));
							b55.setIcon(b5g);
							no13="Node13->";
						
							Thread.sleep(2000);
							b5g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							b55.setIcon(b5g);
							no13="Node13->";

							frm=no11; to=no13; st=t; log(no11,no13,st);
							
							if(Integer.parseInt(dis14)<=Integer.parseInt(dis15))
							{
								Thread.sleep(2000);
								b6g=new ImageIcon(this.getClass().getResource("g.jpg"));
								b66.setIcon(b6g);
								no14="Node14->";
								
								Thread.sleep(2000);
								b6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								b66.setIcon(b6g);
								no14="Node14->";

								frm=no13; to=no14; st=t; log(no13,no14,st);
								
								if(Integer.parseInt(dis15)<=Integer.parseInt(dis16))
								{
									Thread.sleep(2000);
									b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
									b77.setIcon(b7g);
									no15="Node15->";
									
									Thread.sleep(2000);
									b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
									b77.setIcon(b7g);
									no15="Node15->";

									frm=no14; to=no15; st=t; log(no14,no15,st);
									
									if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
									{
										Thread.sleep(2000);
										b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
										b88.setIcon(b8g);
										no16="Node16->";
										
										Thread.sleep(2000);
										b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
										b88.setIcon(b8g);
										no16="Node16->";

										frm=no15; to=no16; st=t; log(no15,no16,st);
										
										if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
										{
											Thread.sleep(2000);
											c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
											c22.setIcon(c2g);
											no17="Node17->";
											
											Thread.sleep(2000);
											c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											c22.setIcon(c2g);
											no17="Node17->";

											frm=no16; to=no17; st=t; log(no16,no17,st);
											
											if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
											{
												Thread.sleep(2000);
												c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c33.setIcon(c3g);
												no18="Node18->";
												
												Thread.sleep(2000);
												c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c33.setIcon(c3g);
												no18="Node18->";

												frm=no17; to=no18; st=t; log(no17,no18,st);
												
												if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
												{
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
													c44.setIcon(c4g);
													no19="Node19->";
													
													Thread.sleep(2000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													Thread.sleep(1000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													no20="Node20->";

													frm=no18; to=no19; st=t; log(no18,no19,st);

													frm=no19; to=no20; st=t; log(no19,no20,st);
													
													refresh();
													send(cn,dest,destip,ct);
												}
												else
												{
													Thread.sleep(2000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													Thread.sleep(1000);
													c55.setVisible(false);
													Thread.sleep(1000);
													c55.setVisible(true);
													no20="Node20->";

													frm=no18; to=no20; st=t; log(no18,no20,st);
													
													refresh();
													send(cn,dest,destip,ct);
												
												}
												
											}
											else
											{
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												Thread.sleep(1000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												no20="Node20->";

												frm=no17; to=no19; st=t; log(no17,no19,st);

												frm=no19; to=no20; st=t; log(no19,no20,st);
												
												refresh();
												send(cn,dest,destip,ct);
											}
										}
										else
										{
											Thread.sleep(2000);
											c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
											c33.setIcon(c3g);
											no18="Node18->";
											
											Thread.sleep(2000);
											c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											c33.setIcon(c3g);
											no18="Node18->";

											frm=no16; to=no18; st=t; log(no16,no18,st);
											
											if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
											{
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												Thread.sleep(1000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												no20="Node20->";

												frm=no18; to=no19; st=t; log(no18,no19,st);

												frm=no19; to=no20; st=t; log(no19,no20,st);
												
												refresh();
												send(cn,dest,destip,ct);
											}
											else
											{
												Thread.sleep(2000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												Thread.sleep(1000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												no20="Node20->";

												frm=no18; to=no20; st=t; log(no18,no20,st);
												
												refresh();
												send(cn,dest,destip,ct);
											
											}
										}
									}
									else
									{
										Thread.sleep(2000);
										c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
										c22.setIcon(c2g);
										no17="Node17->";
										
										Thread.sleep(2000);
										c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
										c22.setIcon(c2g);
										no17="Node17->";

										frm=no15; to=no17; st=t; log(no15,no17,st);
										
										if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
										{
											Thread.sleep(2000);
											c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
											c33.setIcon(c3g);
											no18="Node18->";
											
											Thread.sleep(2000);
											c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											c33.setIcon(c3g);
											no18="Node18->";

											frm=no17; to=no18; st=t; log(no17,no18,st);
											
											if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
											{
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												Thread.sleep(1000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												no20="Node20->";

												frm=no18; to=no19; st=t; log(no18,no19,st);

												frm=no19; to=no20; st=t; log(no19,no20,st);
												
												refresh();
												send(cn,dest,destip,ct);
											}
											else
											{
												Thread.sleep(2000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												Thread.sleep(1000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												no20="Node20->";

												frm=no18; to=no20; st=t; log(no18,no20,st);
												
												refresh();
												send(cn,dest,destip,ct);
											
											}
											
										}
										else
										{
											Thread.sleep(2000);
											c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
											c44.setIcon(c4g);
											no19="Node19->";
											
											Thread.sleep(2000);
											c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											c44.setIcon(c4g);
											no19="Node19->";
											
											Thread.sleep(2000);
											c55.setVisible(false);
											Thread.sleep(1000);
											c55.setVisible(true);
											Thread.sleep(1000);
											c55.setVisible(false);
											Thread.sleep(1000);
											c55.setVisible(true);
											no20="Node20->";

											frm=no17; to=no19; st=t; log(no17,no19,st);

											frm=no19; to=no20; st=t; log(no19,no20,st);
											
											refresh();
											send(cn,dest,destip,ct);
										}
									}
								}
								else
								{
									Thread.sleep(2000);																														Thread.sleep(2000);
									b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
									b88.setIcon(b8g);
									no16="Node16->";
									
									Thread.sleep(2000);
									b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
									b88.setIcon(b8g);
									no16="Node16->";

									frm=no14; to=no16; st=t; log(no14,no16,st);
									
									if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
									{
										Thread.sleep(2000);
										c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
										c22.setIcon(c2g);
										no17="Node17->";
										
										Thread.sleep(2000);
										c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
										c22.setIcon(c2g);
										no17="Node17->";

										frm=no16; to=no17; st=t; log(no16,no17,st);
										
										if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
										{
											Thread.sleep(2000);
											c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
											c33.setIcon(c3g);
											no18="Node18->";
											
											Thread.sleep(2000);
											c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											c33.setIcon(c3g);
											no18="Node18->";

											frm=no17; to=no18; st=t; log(no17,no18,st);
											
											if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
											{
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												Thread.sleep(1000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												no20="Node20->";

												frm=no18; to=no19; st=t; log(no18,no19,st);

												frm=no19; to=no20; st=t; log(no19,no20,st);
												
												refresh();
												send(cn,dest,destip,ct);
											}
											else
											{
												Thread.sleep(2000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												Thread.sleep(1000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												no20="Node20->";

												frm=no18; to=no20; st=t; log(no18,no20,st);
												
												refresh();
												send(cn,dest,destip,ct);
											
											}
											
										}
										else
										{
											Thread.sleep(2000);
											c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
											c44.setIcon(c4g);
											no19="Node19->";
											
											Thread.sleep(2000);
											c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											c44.setIcon(c4g);
											no19="Node19->";
											
											Thread.sleep(2000);
											c55.setVisible(false);
											Thread.sleep(1000);
											c55.setVisible(true);
											Thread.sleep(1000);
											c55.setVisible(false);
											Thread.sleep(1000);
											c55.setVisible(true);
											no20="Node20->";

											frm=no17; to=no19; st=t; log(no17,no19,st);

											frm=no19; to=no20; st=t; log(no19,no20,st);
											
											refresh();
											send(cn,dest,destip,ct);
										}
									}
									else
									{
										Thread.sleep(2000);
										c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
										c33.setIcon(c3g);
										no18="Node18->";
										
										Thread.sleep(2000);
										c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
										c33.setIcon(c3g);
										no18="Node18->";

										frm=no16; to=no18; st=t; log(no16,no18,st);
										
										if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
										{
											Thread.sleep(2000);
											c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
											c44.setIcon(c4g);
											no19="Node19->";
											
											Thread.sleep(2000);
											c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											c44.setIcon(c4g);
											no19="Node19->";
											
											Thread.sleep(2000);
											c55.setVisible(false);
											Thread.sleep(1000);
											c55.setVisible(true);
											Thread.sleep(1000);
											c55.setVisible(false);
											Thread.sleep(1000);
											c55.setVisible(true);
											no20="Node20->";

											frm=no18; to=no19; st=t; log(no18,no19,st);

											frm=no19; to=no20; st=t; log(no19,no20,st);
											
											refresh();
											send(cn,dest,destip,ct);
										}
										else
										{
											Thread.sleep(2000);
											c55.setVisible(false);
											Thread.sleep(1000);
											c55.setVisible(true);
											Thread.sleep(1000);
											c55.setVisible(false);
											Thread.sleep(1000);
											c55.setVisible(true);
											no20="Node20->";

											frm=no18; to=no20; st=t; log(no18,no20,st);
											
											refresh();
											send(cn,dest,destip,ct);
										
										}
									}
								}
							}
							else
							{
								Thread.sleep(2000);
								b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
								b77.setIcon(b7g);
								no15="Node15->";
								
								Thread.sleep(2000);
								b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								b77.setIcon(b7g);
								no15="Node15->";

								frm=no13; to=no15; st=t; log(no13,no15,st);
								
								if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
								{
									Thread.sleep(2000);
									b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
									b88.setIcon(b8g);
									no16="Node16->";
									
									Thread.sleep(2000);
									b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
									b88.setIcon(b8g);
									no16="Node16->";

									frm=no15; to=no16; st=t; log(no15,no16,st);
									
									if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
									{
										Thread.sleep(2000);
										c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
										c22.setIcon(c2g);
										no17="Node17->";
										
										Thread.sleep(2000);
										c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
										c22.setIcon(c2g);
										no17="Node17->";

										frm=no16; to=no17; st=t; log(no16,no17,st);
										
										if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
										{
											Thread.sleep(2000);
											c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
											c33.setIcon(c3g);
											no18="Node18->";
											
											Thread.sleep(2000);
											c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											c33.setIcon(c3g);
											no18="Node18->";

											frm=no17; to=no18; st=t; log(no17,no18,st);
											
											if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
											{
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
												c44.setIcon(c4g);
												no19="Node19->";
												
												Thread.sleep(2000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												Thread.sleep(1000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												no20="Node20->";

												frm=no18; to=no19; st=t; log(no18,no19,st);

												frm=no19; to=no20; st=t; log(no19,no20,st);
												
												refresh();
												send(cn,dest,destip,ct);
											}
											else
											{
												Thread.sleep(2000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												Thread.sleep(1000);
												c55.setVisible(false);
												Thread.sleep(1000);
												c55.setVisible(true);
												no20="Node20->";

												frm=no18; to=no20; st=t; log(no18,no20,st);
												
												refresh();
												send(cn,dest,destip,ct);
											
											}
											
										}
										else
										{
											Thread.sleep(2000);
											c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
											c44.setIcon(c4g);
											no19="Node19->";
											
											Thread.sleep(2000);
											c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											c44.setIcon(c4g);
											no19="Node19->";
											
											Thread.sleep(2000);
											c55.setVisible(false);
											Thread.sleep(1000);
											c55.setVisible(true);
											Thread.sleep(1000);
											c55.setVisible(false);
											Thread.sleep(1000);
											c55.setVisible(true);
											no20="Node20->";

											frm=no17; to=no19; st=t; log(no17,no19,st);

											frm=no19; to=no20; st=t; log(no19,no20,st);
											
											refresh();
											send(cn,dest,destip,ct);
										}
									}
									else
									{
										Thread.sleep(2000);
										c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
										c33.setIcon(c3g);
										no18="Node18->";
										
										Thread.sleep(2000);
										c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
										c33.setIcon(c3g);
										no18="Node18->";

										frm=no16; to=no18; st=t; log(no16,no18,st);
										
										if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
										{
											Thread.sleep(2000);
											c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
											c44.setIcon(c4g);
											no19="Node19->";
											
											Thread.sleep(2000);
											c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											c44.setIcon(c4g);
											no19="Node19->";
											
											Thread.sleep(2000);
											c55.setVisible(false);
											Thread.sleep(1000);
											c55.setVisible(true);
											Thread.sleep(1000);
											c55.setVisible(false);
											Thread.sleep(1000);
											c55.setVisible(true);
											no20="Node20->";

											frm=no18; to=no19; st=t; log(no18,no19,st);

											frm=no19; to=no20; st=t; log(no19,no20,st);
											
											refresh();
											send(cn,dest,destip,ct);
										}
										else
										{
											Thread.sleep(2000);
											c55.setVisible(false);
											Thread.sleep(1000);
											c55.setVisible(true);
											Thread.sleep(1000);
											c55.setVisible(false);
											Thread.sleep(1000);
											c55.setVisible(true);
											no20="Node20->";

											frm=no18; to=no20; st=t; log(no18,no20,st);
											
											refresh();
											send(cn,dest,destip,ct);
										
										}
									}
								}
								else
								{
									Thread.sleep(2000);
									c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
									c22.setIcon(c2g);
									no17="Node17->";
									
									Thread.sleep(2000);
									c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
									c22.setIcon(c2g);
									no17="Node17->";

									frm=no15; to=no17; st=t; log(no15,no17,st);
									
									if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
									{
										Thread.sleep(2000);
										c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
										c33.setIcon(c3g);
										no18="Node18->";
										
										Thread.sleep(2000);
										c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
										c33.setIcon(c3g);
										no18="Node18->";

										frm=no17; to=no18; st=t; log(no17,no18,st);
										
										if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
										{
											Thread.sleep(2000);
											c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
											c44.setIcon(c4g);
											no19="Node19->";
											
											Thread.sleep(2000);
											c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
											c44.setIcon(c4g);
											no19="Node19->";
											
											Thread.sleep(2000);
											c55.setVisible(false);
											Thread.sleep(1000);
											c55.setVisible(true);
											Thread.sleep(1000);
											c55.setVisible(false);
											Thread.sleep(1000);
											c55.setVisible(true);
											no20="Node20->";

											frm=no18; to=no19; st=t; log(no18,no19,st);

											frm=no19; to=no20; st=t; log(no19,no20,st);
											
											refresh();
											send(cn,dest,destip,ct);
										}
										else
										{
											Thread.sleep(2000);
											c55.setVisible(false);
											Thread.sleep(1000);
											c55.setVisible(true);
											Thread.sleep(1000);
											c55.setVisible(false);
											Thread.sleep(1000);
											c55.setVisible(true);
											no20="Node20->";

											frm=no18; to=no20; st=t; log(no18,no20,st);
											
											refresh();
											send(cn,dest,destip,ct);
										
										}
										
									}
									else
									{
										Thread.sleep(2000);
										c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
										c44.setIcon(c4g);
										no19="Node19->";
										
										Thread.sleep(2000);
										c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
										c44.setIcon(c4g);
										no19="Node19->";
										
										Thread.sleep(2000);
										c55.setVisible(false);
										Thread.sleep(1000);
										c55.setVisible(true);
										Thread.sleep(1000);
										c55.setVisible(false);
										Thread.sleep(1000);
										c55.setVisible(true);
										no20="Node20->";

										frm=no17; to=no19; st=t; log(no17,no19,st);

										frm=no19; to=no20; st=t; log(no19,no20,st);
										
										refresh();
										send(cn,dest,destip,ct);
									}
								}
							}
						}
						else
						{
							mac13(no13,mac13);
						}
					}
					else
					{
						ene13(no13,ene13);
					}
		}

			void dist13() throws InterruptedException, UnknownHostException, IOException, SQLException {

				
				Thread.sleep(2000);
				b6g=new ImageIcon(this.getClass().getResource("g.jpg"));
				b66.setIcon(b6g);
				no14="Node14->";
				
				Thread.sleep(2000);
				b6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
				b66.setIcon(b6g);
				no14="Node14->";

				frm=no12; to=no14; st=t; log(no12,no14,st);
				
				if(Integer.parseInt(dis15)<=Integer.parseInt(dis16))
				{
					Thread.sleep(2000);
					b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
					b77.setIcon(b7g);
					no15="Node15->";
					
					Thread.sleep(2000);
					b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
					b77.setIcon(b7g);
					no15="Node15->";

					frm=no14; to=no15; st=t; log(no14,no15,st);
					
					if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
					{
						Thread.sleep(2000);
						b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
						b88.setIcon(b8g);
						no16="Node16->";
						
						Thread.sleep(2000);
						b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
						b88.setIcon(b8g);
						no16="Node16->";

						frm=no15; to=no16; st=t; log(no15,no16,st);
						
						if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
						{
							Thread.sleep(2000);
							c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
							c22.setIcon(c2g);
							no17="Node17->";
							
							Thread.sleep(2000);
							c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							c22.setIcon(c2g);
							no17="Node17->";

							frm=no16; to=no17; st=t; log(no16,no17,st);
							
							if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
							{
								Thread.sleep(2000);
								c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
								c33.setIcon(c3g);
								no18="Node18->";
								
								Thread.sleep(2000);
								c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								c33.setIcon(c3g);
								no18="Node18->";

								frm=no17; to=no18; st=t; log(no17,no18,st);
								
								if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
								{
									Thread.sleep(2000);
									c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
									c44.setIcon(c4g);
									no19="Node19->";
									
									Thread.sleep(2000);
									c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
									c44.setIcon(c4g);
									no19="Node19->";
									
									Thread.sleep(2000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									Thread.sleep(1000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									no20="Node20->";

									frm=no18; to=no19; st=t; log(no18,no19,st);

									frm=no19; to=no20; st=t; log(no19,no20,st);
									
									refresh();
									send(cn,dest,destip,ct);
								}
								else
								{
									Thread.sleep(2000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									Thread.sleep(1000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									no20="Node20->";

									frm=no18; to=no20; st=t; log(no18,no20,st);
									
									refresh();
									send(cn,dest,destip,ct);
								
								}
								
							}
							else
							{
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
								c44.setIcon(c4g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								c44.setIcon(c4g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								Thread.sleep(1000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								no20="Node20->";

								frm=no17; to=no19; st=t; log(no17,no19,st);

								frm=no19; to=no20; st=t; log(no19,no20,st);
								
								refresh();
								send(cn,dest,destip,ct);
							}
						}
						else
						{
							Thread.sleep(2000);
							c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
							c33.setIcon(c3g);
							no18="Node18->";
							
							Thread.sleep(2000);
							c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							c33.setIcon(c3g);
							no18="Node18->";

							frm=no16; to=no18; st=t; log(no16,no18,st);
							
							if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
							{
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
								c44.setIcon(c4g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								c44.setIcon(c4g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								Thread.sleep(1000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								no20="Node20->";

								frm=no18; to=no19; st=t; log(no18,no19,st);

								frm=no19; to=no20; st=t; log(no19,no20,st);
								
								refresh();
								send(cn,dest,destip,ct);
							}
							else
							{
								Thread.sleep(2000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								Thread.sleep(1000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								no20="Node20->";

								frm=no18; to=no20; st=t; log(no18,no20,st);
								
								refresh();
								send(cn,dest,destip,ct);
							
							}
						}
					}
					else
					{
						Thread.sleep(2000);
						c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
						c22.setIcon(c2g);
						no17="Node17->";
						
						Thread.sleep(2000);
						c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
						c22.setIcon(c2g);
						no17="Node17->";

						frm=no15; to=no17; st=t; log(no15,no17,st);
						
						if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
						{
							Thread.sleep(2000);
							c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
							c33.setIcon(c3g);
							no18="Node18->";
							
							Thread.sleep(2000);
							c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							c33.setIcon(c3g);
							no18="Node18->";

							frm=no17; to=no18; st=t; log(no17,no18,st);
							
							if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
							{
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
								c44.setIcon(c4g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								c44.setIcon(c4g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								Thread.sleep(1000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								no20="Node20->";

								frm=no18; to=no19; st=t; log(no18,no19,st);

								frm=no19; to=no20; st=t; log(no19,no20,st);
								
								refresh();
								send(cn,dest,destip,ct);
							}
							else
							{
								Thread.sleep(2000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								Thread.sleep(1000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								no20="Node20->";

								frm=no18; to=no20; st=t; log(no18,no20,st);
								
								refresh();
								send(cn,dest,destip,ct);
							
							}
							
						}
						else
						{
							Thread.sleep(2000);
							c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
							c44.setIcon(c4g);
							no19="Node19->";
							
							Thread.sleep(2000);
							c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							c44.setIcon(c4g);
							no19="Node19->";
							
							Thread.sleep(2000);
							c55.setVisible(false);
							Thread.sleep(1000);
							c55.setVisible(true);
							Thread.sleep(1000);
							c55.setVisible(false);
							Thread.sleep(1000);
							c55.setVisible(true);
							no20="Node20->";

							frm=no17; to=no19; st=t; log(no17,no19,st);

							frm=no19; to=no20; st=t; log(no19,no20,st);
							
							refresh();
							send(cn,dest,destip,ct);
						}
					}
				}
				else
				{
					Thread.sleep(2000);																														Thread.sleep(2000);
					b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
					b88.setIcon(b8g);
					no16="Node16->";
					
					Thread.sleep(2000);
					b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
					b88.setIcon(b8g);
					no16="Node16->";

					frm=no14; to=no16; st=t; log(no14,no16,st);
					
					if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
					{
						Thread.sleep(2000);
						c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
						c22.setIcon(c2g);
						no17="Node17->";
						
						Thread.sleep(2000);
						c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
						c22.setIcon(c2g);
						no17="Node17->";

						frm=no16; to=no17; st=t; log(no16,no17,st);
						
						if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
						{
							Thread.sleep(2000);
							c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
							c33.setIcon(c3g);
							no18="Node18->";
							
							Thread.sleep(2000);
							c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							c33.setIcon(c3g);
							no18="Node18->";

							frm=no17; to=no18; st=t; log(no17,no18,st);
							
							if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
							{
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
								c44.setIcon(c4g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								c44.setIcon(c4g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								Thread.sleep(1000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								no20="Node20->";

								frm=no18; to=no19; st=t; log(no18,no19,st);

								frm=no19; to=no20; st=t; log(no19,no20,st);
								
								refresh();
								send(cn,dest,destip,ct);
							}
							else
							{
								Thread.sleep(2000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								Thread.sleep(1000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								no20="Node20->";

								frm=no18; to=no20; st=t; log(no18,no20,st);
								
								refresh();
								send(cn,dest,destip,ct);
							
							}
							
						}
						else
						{
							Thread.sleep(2000);
							c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
							c44.setIcon(c4g);
							no19="Node19->";
							
							Thread.sleep(2000);
							c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							c44.setIcon(c4g);
							no19="Node19->";
							
							Thread.sleep(2000);
							c55.setVisible(false);
							Thread.sleep(1000);
							c55.setVisible(true);
							Thread.sleep(1000);
							c55.setVisible(false);
							Thread.sleep(1000);
							c55.setVisible(true);
							no20="Node20->";

							frm=no17; to=no19; st=t; log(no17,no19,st);

							frm=no19; to=no20; st=t; log(no19,no20,st);
							
							refresh();
							send(cn,dest,destip,ct);
						}
					}
					else
					{
						Thread.sleep(2000);
						c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
						c33.setIcon(c3g);
						no18="Node18->";
						
						Thread.sleep(2000);
						c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
						c33.setIcon(c3g);
						no18="Node18->";

						frm=no16; to=no18; st=t; log(no16,no18,st);
						
						if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
						{
							Thread.sleep(2000);
							c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
							c44.setIcon(c4g);
							no19="Node19->";
							
							Thread.sleep(2000);
							c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							c44.setIcon(c4g);
							no19="Node19->";
							
							Thread.sleep(2000);
							c55.setVisible(false);
							Thread.sleep(1000);
							c55.setVisible(true);
							Thread.sleep(1000);
							c55.setVisible(false);
							Thread.sleep(1000);
							c55.setVisible(true);
							no20="Node20->";

							frm=no18; to=no19; st=t; log(no18,no19,st);

							frm=no19; to=no20; st=t; log(no19,no20,st);
							
							refresh();
							send(cn,dest,destip,ct);
						}
						else
						{
							Thread.sleep(2000);
							c55.setVisible(false);
							Thread.sleep(1000);
							c55.setVisible(true);
							Thread.sleep(1000);
							c55.setVisible(false);
							Thread.sleep(1000);
							c55.setVisible(true);
							no20="Node20->";

							frm=no18; to=no20; st=t; log(no18,no20,st);
							
							refresh();
							send(cn,dest,destip,ct);
						
						}
					}
				}
		}

		void attack(Socket con777,String ip,String node,String mac) throws SQLException, IOException {
			
			   SimpleDateFormat dateFormat = new SimpleDateFormat();
			   Date date = new Date();
			   String dt=dateFormat.format(date);
			    
			   String attack="Yes";
			   if(node.equalsIgnoreCase("Node9"))
				{
				   	connect.createStatement().executeUpdate("update NodesInfo set mac='"+mac+"',attack1='"+attack+"' where node='"+node+"'");
					connect.createStatement().executeUpdate("insert into Attacker values('"+node+"','"+ip+"','"+mac+"','"+dt+"')");
					
					DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
					ds.writeUTF("attack");		
				}
			   if(node.equalsIgnoreCase("Node10"))
				{
				   	connect.createStatement().executeUpdate("update NodesInfo set mac='"+mac+"',attack1='"+attack+"' where node='"+node+"'");
					connect.createStatement().executeUpdate("insert into Attacker values('"+ip+"','"+node+"','"+mac+"','"+dt+"')");
					
					DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
					ds.writeUTF("attack");		
				}
			   if(node.equalsIgnoreCase("Node11"))
				{
				   	connect.createStatement().executeUpdate("update NodesInfo set mac='"+mac+"',attack1='"+attack+"' where node='"+node+"'");
					connect.createStatement().executeUpdate("insert into Attacker values('"+node+"','"+ip+"','"+mac+"','"+dt+"')");
					
					DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
					ds.writeUTF("attack");		
				}
			   if(node.equalsIgnoreCase("Node12"))
				{
				   	connect.createStatement().executeUpdate("update NodesInfo set mac='"+mac+"',attack1='"+attack+"' where node='"+node+"'");
					connect.createStatement().executeUpdate("insert into Attacker values('"+node+"','"+ip+"','"+mac+"','"+dt+"')");
					
					DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
					ds.writeUTF("attack");		
				}
			   if(node.equalsIgnoreCase("Node13"))
				{
				   	connect.createStatement().executeUpdate("update NodesInfo set mac='"+mac+"',attack1='"+attack+"' where node='"+node+"'");
					connect.createStatement().executeUpdate("insert into Attacker values('"+node+"','"+ip+"','"+mac+"','"+dt+"')");
					
					DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
					ds.writeUTF("attack");		
				}
			
		}

		void mac13(String node, String mac) throws SQLException, UnknownHostException, IOException, InterruptedException {
			
			Thread.sleep(2000);
			b5r=new ImageIcon(this.getClass().getResource("r.jpg"));
			b55.setIcon(b5r);
			no13="Node13->";
			
			Socket sc = new Socket("localhost",309);
			DataOutputStream d = new DataOutputStream(sc.getOutputStream());
			d.writeUTF(no13);
			d.writeUTF(mac);
				
			DataInputStream din = new DataInputStream(sc.getInputStream());
			String mes = din.readUTF();
			System.out.println(mes);
			
			enemac13();
		}

		   void enemac13() throws InterruptedException, UnknownHostException, IOException, SQLException {
			
				if(Integer.parseInt(dis14)<=Integer.parseInt(dis15))
				{
					Thread.sleep(2000);
					b6g=new ImageIcon(this.getClass().getResource("g.jpg"));
					b66.setIcon(b6g);
					no14="Node14->";
					
					Thread.sleep(2000);
					b6g=new ImageIcon(this.getClass().getResource("rec.jpg"));
					b66.setIcon(b6g);
					no14="Node14->";

					frm=no12; to="Node13->"; st=nt; log(no12,to,st);
					
					frm=no12; to=no14; st=t; log(no12,no14,st);
					
					if(Integer.parseInt(dis15)<=Integer.parseInt(dis16))
					{
						Thread.sleep(2000);
						b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
						b77.setIcon(b7g);
						no15="Node15->";
						
						Thread.sleep(2000);
						b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
						b77.setIcon(b7g);
						no15="Node15->";

						frm=no14; to=no15; st=t; log(no14,no15,st);
						
						if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
						{
							Thread.sleep(2000);
							b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
							b88.setIcon(b8g);
							no16="Node16->";
							
							Thread.sleep(2000);
							b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							b88.setIcon(b8g);
							no16="Node16->";

							frm=no15; to=no16; st=t; log(no15,no16,st);
							
							if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
							{
								Thread.sleep(2000);
								c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
								c22.setIcon(c2g);
								no17="Node17->";
								
								Thread.sleep(2000);
								c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								c22.setIcon(c2g);
								no17="Node17->";

								frm=no16; to=no17; st=t; log(no16,no17,st);
								
								if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
								{
									Thread.sleep(2000);
									c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
									c33.setIcon(c3g);
									no18="Node18->";
									
									Thread.sleep(2000);
									c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
									c33.setIcon(c3g);
									no18="Node18->";

									frm=no17; to=no18; st=t; log(no17,no18,st);
									
									if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
									{
										Thread.sleep(2000);
										c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
										c44.setIcon(c4g);
										no19="Node19->";
										
										Thread.sleep(2000);
										c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
										c44.setIcon(c4g);
										no19="Node19->";
										
										Thread.sleep(2000);
										c55.setVisible(false);
										Thread.sleep(1000);
										c55.setVisible(true);
										Thread.sleep(1000);
										c55.setVisible(false);
										Thread.sleep(1000);
										c55.setVisible(true);
										no20="Node20->";

										frm=no18; to=no19; st=t; log(no18,no19,st);

										frm=no19; to=no20; st=t; log(no19,no20,st);
										
										refresh();
										send(cn,dest,destip,ct);
									}
									else
									{
										Thread.sleep(2000);
										c55.setVisible(false);
										Thread.sleep(1000);
										c55.setVisible(true);
										Thread.sleep(1000);
										c55.setVisible(false);
										Thread.sleep(1000);
										c55.setVisible(true);
										no20="Node20->";

										frm=no18; to=no20; st=t; log(no18,no20,st);
										
										refresh();
										send(cn,dest,destip,ct);
									
									}
									
								}
								else
								{
									Thread.sleep(2000);
									c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
									c44.setIcon(c4g);
									no19="Node19->";
									
									Thread.sleep(2000);
									c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
									c44.setIcon(c4g);
									no19="Node19->";
									
									Thread.sleep(2000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									Thread.sleep(1000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									no20="Node20->";

									frm=no17; to=no19; st=t; log(no17,no19,st);

									frm=no19; to=no20; st=t; log(no19,no20,st);
									
									refresh();
									send(cn,dest,destip,ct);
								}
							}
							else
							{
								Thread.sleep(2000);
								c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
								c33.setIcon(c3g);
								no18="Node18->";
								
								Thread.sleep(2000);
								c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								c33.setIcon(c3g);
								no18="Node18->";

								frm=no16; to=no18; st=t; log(no16,no18,st);
								
								if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
								{
									Thread.sleep(2000);
									c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
									c44.setIcon(c4g);
									no19="Node19->";
									
									Thread.sleep(2000);
									c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
									c44.setIcon(c4g);
									no19="Node19->";
									
									Thread.sleep(2000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									Thread.sleep(1000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									no20="Node20->";

									frm=no18; to=no19; st=t; log(no18,no19,st);

									frm=no19; to=no20; st=t; log(no19,no20,st);
									
									refresh();
									send(cn,dest,destip,ct);
								}
								else
								{
									Thread.sleep(2000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									Thread.sleep(1000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									no20="Node20->";

									frm=no18; to=no20; st=t; log(no18,no20,st);
									
									refresh();
									send(cn,dest,destip,ct);
								
								}
							}
						}
						else
						{
							Thread.sleep(2000);
							c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
							c22.setIcon(c2g);
							no17="Node17->";
							
							Thread.sleep(2000);
							c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							c22.setIcon(c2g);
							no17="Node17->";

							frm=no15; to=no17; st=t; log(no15,no17,st);
							
							if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
							{
								Thread.sleep(2000);
								c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
								c33.setIcon(c3g);
								no18="Node18->";
								
								Thread.sleep(2000);
								c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								c33.setIcon(c3g);
								no18="Node18->";

								frm=no17; to=no18; st=t; log(no17,no18,st);
								
								if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
								{
									Thread.sleep(2000);
									c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
									c44.setIcon(c4g);
									no19="Node19->";
									
									Thread.sleep(2000);
									c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
									c44.setIcon(c4g);
									no19="Node19->";
									
									Thread.sleep(2000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									Thread.sleep(1000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									no20="Node20->";

									frm=no18; to=no19; st=t; log(no18,no19,st);

									frm=no19; to=no20; st=t; log(no19,no20,st);
									
									refresh();
									send(cn,dest,destip,ct);
								}
								else
								{
									Thread.sleep(2000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									Thread.sleep(1000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									no20="Node20->";

									frm=no18; to=no20; st=t; log(no18,no20,st);
									
									refresh();
									send(cn,dest,destip,ct);
								
								}
								
							}
							else
							{
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
								c44.setIcon(c4g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								c44.setIcon(c4g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								Thread.sleep(1000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								no20="Node20->";

								frm=no17; to=no19; st=t; log(no17,no19,st);

								frm=no19; to=no20; st=t; log(no19,no20,st);
								
								refresh();
								send(cn,dest,destip,ct);
							}
						}
					}
					else
					{
						Thread.sleep(2000);																														Thread.sleep(2000);
						b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
						b88.setIcon(b8g);
						no16="Node16->";
						
						Thread.sleep(2000);
						b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
						b88.setIcon(b8g);
						no16="Node16->";

						frm=no14; to=no16; st=t; log(no14,no16,st);
						
						if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
						{
							Thread.sleep(2000);
							c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
							c22.setIcon(c2g);
							no17="Node17->";
							
							Thread.sleep(2000);
							c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							c22.setIcon(c2g);
							no17="Node17->";

							frm=no16; to=no17; st=t; log(no16,no17,st);
							
							if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
							{
								Thread.sleep(2000);
								c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
								c33.setIcon(c3g);
								no18="Node18->";
								
								Thread.sleep(2000);
								c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								c33.setIcon(c3g);
								no18="Node18->";

								frm=no17; to=no18; st=t; log(no17,no18,st);
								
								if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
								{
									Thread.sleep(2000);
									c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
									c44.setIcon(c4g);
									no19="Node19->";
									
									Thread.sleep(2000);
									c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
									c44.setIcon(c4g);
									no19="Node19->";
									
									Thread.sleep(2000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									Thread.sleep(1000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									no20="Node20->";

									frm=no18; to=no19; st=t; log(no18,no19,st);

									frm=no19; to=no20; st=t; log(no19,no20,st);
									
									refresh();
									send(cn,dest,destip,ct);
								}
								else
								{
									Thread.sleep(2000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									Thread.sleep(1000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									no20="Node20->";

									frm=no18; to=no20; st=t; log(no18,no20,st);
									
									refresh();
									send(cn,dest,destip,ct);
								
								}
								
							}
							else
							{
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
								c44.setIcon(c4g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								c44.setIcon(c4g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								Thread.sleep(1000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								no20="Node20->";

								frm=no17; to=no19; st=t; log(no17,no19,st);

								frm=no19; to=no20; st=t; log(no19,no20,st);
								
								refresh();
								send(cn,dest,destip,ct);
							}
						}
						else
						{
							Thread.sleep(2000);
							c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
							c33.setIcon(c3g);
							no18="Node18->";
							
							Thread.sleep(2000);
							c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							c33.setIcon(c3g);
							no18="Node18->";

							frm=no16; to=no18; st=t; log(no16,no18,st);
							
							if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
							{
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
								c44.setIcon(c4g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								c44.setIcon(c4g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								Thread.sleep(1000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								no20="Node20->";

								frm=no18; to=no19; st=t; log(no18,no19,st);

								frm=no19; to=no20; st=t; log(no19,no20,st);
								
								refresh();
								send(cn,dest,destip,ct);
							}
							else
							{
								Thread.sleep(2000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								Thread.sleep(1000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								no20="Node20->";

								frm=no18; to=no20; st=t; log(no18,no20,st);
								
								refresh();
								send(cn,dest,destip,ct);
							
							}
						}
					}
				}
				else
				{
					Thread.sleep(2000);
					b7g=new ImageIcon(this.getClass().getResource("g.jpg"));
					b77.setIcon(b7g);
					no15="Node15->";
					
					Thread.sleep(2000);
					b7g=new ImageIcon(this.getClass().getResource("rec.jpg"));
					b77.setIcon(b7g);
					no15="Node15->";

					frm=no13; to=no15; st=t; log(no13,no15,st);
					
					if(Integer.parseInt(dis16)<=Integer.parseInt(dis17))
					{
						Thread.sleep(2000);
						b8g=new ImageIcon(this.getClass().getResource("g.jpg"));
						b88.setIcon(b8g);
						no16="Node16->";
						
						Thread.sleep(2000);
						b8g=new ImageIcon(this.getClass().getResource("rec.jpg"));
						b88.setIcon(b8g);
						no16="Node16->";

						frm=no15; to=no16; st=t; log(no15,no16,st);
						
						if(Integer.parseInt(dis17)<=Integer.parseInt(dis18))
						{
							Thread.sleep(2000);
							c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
							c22.setIcon(c2g);
							no17="Node17->";
							
							Thread.sleep(2000);
							c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							c22.setIcon(c2g);
							no17="Node17->";

							frm=no16; to=no17; st=t; log(no16,no17,st);
							
							if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
							{
								Thread.sleep(2000);
								c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
								c33.setIcon(c3g);
								no18="Node18->";
								
								Thread.sleep(2000);
								c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								c33.setIcon(c3g);
								no18="Node18->";

								frm=no17; to=no18; st=t; log(no17,no18,st);
								
								if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
								{
									Thread.sleep(2000);
									c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
									c44.setIcon(c4g);
									no19="Node19->";
									
									Thread.sleep(2000);
									c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
									c44.setIcon(c4g);
									no19="Node19->";
									
									Thread.sleep(2000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									Thread.sleep(1000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									no20="Node20->";

									frm=no18; to=no19; st=t; log(no18,no19,st);

									frm=no19; to=no20; st=t; log(no19,no20,st);
									
									refresh();
									send(cn,dest,destip,ct);
								}
								else
								{
									Thread.sleep(2000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									Thread.sleep(1000);
									c55.setVisible(false);
									Thread.sleep(1000);
									c55.setVisible(true);
									no20="Node20->";

									frm=no18; to=no20; st=t; log(no18,no20,st);
									
									refresh();
									send(cn,dest,destip,ct);
								
								}
								
							}
							else
							{
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
								c44.setIcon(c4g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								c44.setIcon(c4g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								Thread.sleep(1000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								no20="Node20->";

								frm=no17; to=no19; st=t; log(no17,no19,st);

								frm=no19; to=no20; st=t; log(no19,no20,st);
								
								refresh();
								send(cn,dest,destip,ct);
							}
						}
						else
						{
							Thread.sleep(2000);
							c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
							c33.setIcon(c3g);
							no18="Node18->";
							
							Thread.sleep(2000);
							c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							c33.setIcon(c3g);
							no18="Node18->";

							frm=no16; to=no18; st=t; log(no16,no18,st);
							
							if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
							{
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
								c44.setIcon(c4g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								c44.setIcon(c4g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								Thread.sleep(1000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								no20="Node20->";

								frm=no18; to=no19; st=t; log(no18,no19,st);

								frm=no19; to=no20; st=t; log(no19,no20,st);
								
								refresh();
								send(cn,dest,destip,ct);
							}
							else
							{
								Thread.sleep(2000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								Thread.sleep(1000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								no20="Node20->";

								frm=no18; to=no20; st=t; log(no18,no20,st);
								
								refresh();
								send(cn,dest,destip,ct);
							
							}
						}
					}
					else
					{
						Thread.sleep(2000);
						c2g=new ImageIcon(this.getClass().getResource("g.jpg"));
						c22.setIcon(c2g);
						no17="Node17->";
						
						Thread.sleep(2000);
						c2g=new ImageIcon(this.getClass().getResource("rec.jpg"));
						c22.setIcon(c2g);
						no17="Node17->";

						frm=no15; to=no17; st=t; log(no15,no17,st);
						
						if(Integer.parseInt(dis18)<=Integer.parseInt(dis19))
						{
							Thread.sleep(2000);
							c3g=new ImageIcon(this.getClass().getResource("g.jpg"));
							c33.setIcon(c3g);
							no18="Node18->";
							
							Thread.sleep(2000);
							c3g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							c33.setIcon(c3g);
							no18="Node18->";

							frm=no17; to=no18; st=t; log(no17,no18,st);
							
							if(Integer.parseInt(dis19)<=Integer.parseInt(dis20))
							{
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
								c44.setIcon(c4g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
								c44.setIcon(c4g);
								no19="Node19->";
								
								Thread.sleep(2000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								Thread.sleep(1000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								no20="Node20->";

								frm=no18; to=no19; st=t; log(no18,no19,st);

								frm=no19; to=no20; st=t; log(no19,no20,st);
								
								refresh();
								send(cn,dest,destip,ct);
							}
							else
							{
								Thread.sleep(2000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								Thread.sleep(1000);
								c55.setVisible(false);
								Thread.sleep(1000);
								c55.setVisible(true);
								no20="Node20->";

								frm=no18; to=no20; st=t; log(no18,no20,st);
								
								refresh();
								send(cn,dest,destip,ct);
							
							}
							
						}
						else
						{
							Thread.sleep(2000);
							c4g=new ImageIcon(this.getClass().getResource("g.jpg"));
							c44.setIcon(c4g);
							no19="Node19->";
							
							Thread.sleep(2000);
							c4g=new ImageIcon(this.getClass().getResource("rec.jpg"));
							c44.setIcon(c4g);
							no19="Node19->";
							
							Thread.sleep(2000);
							c55.setVisible(false);
							Thread.sleep(1000);
							c55.setVisible(true);
							Thread.sleep(1000);
							c55.setVisible(false);
							Thread.sleep(1000);
							c55.setVisible(true);
							no20="Node20->";

							frm=no17; to=no19; st=t; log(no17,no19,st);

							frm=no19; to=no20; st=t; log(no19,no20,st);
							
							refresh();
							send(cn,dest,destip,ct);
						}
					}
				}
		}

		void ene13(String node, String ene) throws SQLException, UnknownHostException, IOException, InterruptedException {
				
				Thread.sleep(2000);
				b5r=new ImageIcon(this.getClass().getResource("r.jpg"));
				b55.setIcon(b5r);
				no13="Node13->";
				
			   	Socket sc = new Socket("localhost",310);
				DataOutputStream d = new DataOutputStream(sc.getOutputStream());
				d.writeUTF(no13);
				d.writeUTF(ene);
				
				DataInputStream din = new DataInputStream(sc.getInputStream());
				String mes = din.readUTF();
				System.out.println(mes);
				
				enemac13();
		}
		   
		private void trust(String node1, String node2) throws SQLException {
			 
				SimpleDateFormat dateFormat = new SimpleDateFormat();
			    Date date = new Date();
			    String dt=dateFormat.format(date);
			    
			    connect.createStatement().executeUpdate("insert into trust values('"+node1+"','"+node2+"','"+dt+"')");   
			
		}

		void getdist() throws SQLException {
				  
			  	ResultSet r2=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node2+"'");
				if(r2.next()==true){ dis2=r2.getString(3);}
				ResultSet r3=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node3+"'");
				if(r3.next()==true){ dis3=r3.getString(3);}
				ResultSet r4=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node4+"'");
				if(r4.next()==true){ dis4=r4.getString(3);}
				ResultSet  r5=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node5+"'");
				if(r5.next()==true){ dis5=r5.getString(3);}
				ResultSet  r6=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node6+"'");
				if(r6.next()==true){ dis6=r6.getString(3);}
				ResultSet r7=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node7+"'");
				if(r7.next()==true){ dis7=r7.getString(3);}
				ResultSet r8=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node8+"'");
				if(r8.next()==true){ dis8=r8.getString(3);}
				ResultSet  r9=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node9+"'");
				if(r9.next()==true){ dis9=r9.getString(3);}
				ResultSet r10=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node10+"'");
				if(r10.next()==true){ dis10=r10.getString(3);}
				ResultSet  r11=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node11+"'");
				if(r11.next()==true){ dis11=r11.getString(3);}
				ResultSet  r12=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node12+"'");
				if(r12.next()==true){ dis12=r12.getString(3);}
				ResultSet  r13=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node13+"'");
				if(r13.next()==true){ dis13=r13.getString(3);}
				ResultSet  r14=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node14+"'");
				if(r14.next()==true){ dis14=r14.getString(3);}
				ResultSet  r15=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node15+"'");
				if(r15.next()==true){ dis15=r15.getString(3);}
				ResultSet  r16=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node16+"'");
				if(r16.next()==true){ dis16=r16.getString(3);}
				ResultSet  r17=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node17+"'");
				if(r17.next()==true){ dis17=r17.getString(3);}
				ResultSet  r18=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node18+"'");
				if(r18.next()==true){ dis18=r18.getString(3);}
				ResultSet  r19=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node19+"'");
				if(r19.next()==true){ dis19=r19.getString(3);}
				ResultSet r20=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node20+"'");
				if(r20.next()==true){ dis20=r20.getString(3);}
				ResultSet r21=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node21+"'");
				if(r21.next()==true){ dis21=r21.getString(3);}
				ResultSet r22=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node22+"'");
				if(r22.next()==true){ dis22=r22.getString(3);}
			  
		}

		void ref() throws InterruptedException {

			   Thread.sleep(2000);
				c5g=new ImageIcon(this.getClass().getResource("b.jpg"));
				c55.setIcon(c5g);
				
				c6g=new ImageIcon(this.getClass().getResource("b.jpg"));
				c66.setIcon(c6g);
				
				c7g=new ImageIcon(this.getClass().getResource("b.jpg"));
				c77.setIcon(c7g);
				
				c8g=new ImageIcon(this.getClass().getResource("b.jpg"));
				c88.setIcon(c8g);
				
				a9g=new ImageIcon(this.getClass().getResource("b.jpg"));
				a99.setIcon(a9g);
			
		}

		void getmac() throws SQLException {
			  
			  	ResultSet r2=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node2+"'");
				if(r2.next()==true){ mac2=r2.getString(5);}
				ResultSet r3=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node3+"'");
				if(r3.next()==true){ mac3=r3.getString(5);}
				ResultSet r4=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node4+"'");
				if(r4.next()==true){ mac4=r4.getString(5);}
				ResultSet  r5=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node5+"'");
				if(r5.next()==true){ mac5=r5.getString(5);}
				ResultSet  r6=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node6+"'");
				if(r6.next()==true){ mac6=r6.getString(5);}
				ResultSet r7=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node7+"'");
				if(r7.next()==true){ mac7=r7.getString(5);}
				ResultSet r8=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node8+"'");
				if(r8.next()==true){ mac8=r8.getString(5);}
				ResultSet  r9=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node9+"'");
				if(r9.next()==true){ mac9=r9.getString(5);}
				ResultSet r10=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node10+"'");
				if(r10.next()==true){ mac10=r10.getString(5);}
				ResultSet  r11=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node11+"'");
				if(r11.next()==true){ mac11=r11.getString(5);}
				ResultSet  r12=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node12+"'");
				if(r12.next()==true){ mac12=r12.getString(5);}
				ResultSet  r13=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node13+"'");
				if(r13.next()==true){ mac13=r13.getString(5);}
				ResultSet  r14=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node14+"'");
				if(r14.next()==true){ mac14=r14.getString(5);}
				ResultSet  r15=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node15+"'");
				if(r15.next()==true){ mac15=r15.getString(5);}
				ResultSet  r16=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node16+"'");
				if(r16.next()==true){ mac16=r16.getString(5);}
				ResultSet  r17=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node17+"'");
				if(r17.next()==true){ mac17=r17.getString(5);}
				ResultSet  r18=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node18+"'");
				if(r18.next()==true){ mac18=r18.getString(5);}
				ResultSet  r19=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node19+"'");
				if(r19.next()==true){ mac19=r19.getString(5);}
				ResultSet r20=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node20+"'");
				if(r20.next()==true){ mac20=r20.getString(5);}
				ResultSet r21=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node21+"'");
				if(r21.next()==true){ mac21=r21.getString(5);}
				ResultSet r22=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node22+"'");
				if(r22.next()==true){ mac22=r22.getString(5);}
			  
		}



		void send(Socket cn,String dest,String destip,String ct) throws UnknownHostException, IOException, SQLException {
			
			trustworthy();
			
			SimpleDateFormat dateFormat = new SimpleDateFormat();
		    Date date = new Date();
		    String dt=dateFormat.format(date);
			long  end = System.currentTimeMillis();
			System.out.println("The Ending Time "+end);


			String timeDelay = Long.toString(end-start);

			System.out.println("Total Time Delay "+timeDelay);
			
			
			String path=no1+no2+no3+no4+no5+no6+no7+no8+no9+no10+no11+no12+no13+no14+no15+no16+no17+no18+no19+no20+no21+no22+no23+no24+no25+no26+no27+no28+no29+no30+no31+no32;
			String f = fname.substring(0, fname.indexOf("."));
			String cname = "Router\\";
			MergeFile mf = new MergeFile();
			mf.mergeFiles(f, cname);
			
			FileInputStream fs = new FileInputStream(cname + f + "x.txt");
			byte bs1[] = new byte[fs.available()];
			fs.read(bs1);
			String content = new String(bs1);
			
			
            
			
			 if(dest.equalsIgnoreCase("A"))
				{
					Socket dest1=new Socket(destip,9991);
					DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
					dos91.writeUTF(fname);
					dos91.writeUTF(content);
					dos91.writeUTF(timeDelay);
					dos91.writeUTF(path);
					dos91.writeUTF(dt);
					
					DataInputStream ins=new DataInputStream(dest1.getInputStream());
					String msg=ins.readUTF();
					
					DataOutputStream d1=new DataOutputStream(cn.getOutputStream());
					d1.writeUTF("success");
					
				}
				if(dest.equalsIgnoreCase("B"))
				{
					Socket dest1=new Socket(destip,9992);
					DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
					dos91.writeUTF(fname);
					dos91.writeUTF(content);
					dos91.writeUTF(timeDelay);
					dos91.writeUTF(path);
					dos91.writeUTF(dt);
					
					DataInputStream ins=new DataInputStream(dest1.getInputStream());
					String msg=ins.readUTF();
					
					DataOutputStream d2=new DataOutputStream(cn.getOutputStream());
					d2.writeUTF("success");
					
				}
				if(dest.equalsIgnoreCase("C"))
				{
					Socket dest1=new Socket(destip,9993);
					DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
					dos91.writeUTF(fname);
					dos91.writeUTF(content);
					dos91.writeUTF(timeDelay);
					dos91.writeUTF(path);
					dos91.writeUTF(dt);
					
					DataInputStream ins=new DataInputStream(dest1.getInputStream());
					String msg=ins.readUTF();
					
					DataOutputStream d3=new DataOutputStream(cn.getOutputStream());
					d3.writeUTF("success");
					
				}
				if(dest.equalsIgnoreCase("D"))
				{
					Socket dest1=new Socket(destip,9994);
					DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
					dos91.writeUTF(fname);
					dos91.writeUTF(content);
					dos91.writeUTF(timeDelay);
					dos91.writeUTF(path);
					dos91.writeUTF(dt);
					
					DataInputStream ins=new DataInputStream(dest1.getInputStream());
					String msg=ins.readUTF();
					
					DataOutputStream d4=new DataOutputStream(cn.getOutputStream());
					d4.writeUTF("success");
				}
				if(dest.equalsIgnoreCase("E"))
				{
					Socket dest1=new Socket(destip,9995);
					DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
					dos91.writeUTF(fname);
					dos91.writeUTF(content);
					dos91.writeUTF(timeDelay);
					dos91.writeUTF(path);
					dos91.writeUTF(dt);
					
					DataInputStream ins=new DataInputStream(dest1.getInputStream());
					String msg=ins.readUTF();
					
					DataOutputStream d5=new DataOutputStream(cn.getOutputStream());
					d5.writeUTF("success");
				}
			
		}

		 void trustworthy() throws SQLException {
			
			 SimpleDateFormat dateFormat = new SimpleDateFormat();
			 Date date = new Date();
			 String dt=dateFormat.format(date);
			 
			 String stat="TRUST";
			 String stat1="UNTRUST";
			 String yes="YES";
			 String no="NO";
			 String e9="Node9";
			 String e10="Node10";
			 String e11="Node11";
			 String e12="Node12";
			 String e13="Node13";
			 String bandw=""; String macc="";
			 
			 if(no1.equalsIgnoreCase(""))
			 {
				System.out.println(""); 
			 }
			 else
			 {
				connect.createStatement().executeUpdate("insert into Logg values ('"+no1+"','"+stat+"','"+yes+"','"+dt+"')");
			 }
			 if(no2.equalsIgnoreCase(""))
			 {
				System.out.println(""); 
			 }
			 else
			 {
				connect.createStatement().executeUpdate("insert into Logg values ('"+no2+"','"+stat+"','"+yes+"','"+dt+"')");
			 }
			 if(no3.equalsIgnoreCase(""))
			 {
				System.out.println(""); 
			 }
			 else
			 {
				connect.createStatement().executeUpdate("insert into Logg values ('"+no3+"','"+stat+"','"+yes+"','"+dt+"')");
			 }
			 if(no4.equalsIgnoreCase(""))
			 {
				System.out.println(""); 
			 }
			 else
			 {
				connect.createStatement().executeUpdate("insert into Logg values ('"+no4+"','"+stat+"','"+yes+"','"+dt+"')");
			 }
			 if(no5.equalsIgnoreCase(""))
			 {
				System.out.println(""); 
			 }
			 else
			 {
				connect.createStatement().executeUpdate("insert into Logg values ('"+no5+"','"+stat+"','"+yes+"','"+dt+"')");
			 }
			 if(no6.equalsIgnoreCase(""))
			 {
				System.out.println(""); 
			 }
			 else
			 {
				connect.createStatement().executeUpdate("insert into Logg values ('"+no6+"','"+stat+"','"+yes+"','"+dt+"')");
			 }
			 if(no7.equalsIgnoreCase(""))
			 {
				System.out.println(""); 
			 }
			 else
			 {
				connect.createStatement().executeUpdate("insert into Logg values ('"+no7+"','"+stat+"','"+yes+"','"+dt+"')");
			 }
			 if(no8.equalsIgnoreCase(""))
			 {
				System.out.println(""); 
			 }
			 else
			 {
				connect.createStatement().executeUpdate("insert into Logg values ('"+no8+"','"+stat+"','"+yes+"','"+dt+"')");
			 }
			 			
			ResultSet r=connect.createStatement().executeQuery("select * from nodesinfo where node='"+e9+"'");
			if(r.next()==true)
			{
				macc=r.getString(6);
				bandw=r.getString(7);
				
			}
			
			 
			 ResultSet r1=connect.createStatement().executeQuery("select * from nodesinfo where node='"+e9+"'");
				if(r1.next()==true)
				{
					macc=r1.getString(6);
					bandw=r1.getString(7);
					
				}
				 
				 if(no9.equalsIgnoreCase(""))
				 {
					System.out.println(""); 
				 }
				 else if(macc.equalsIgnoreCase("Yes") || bandw.equalsIgnoreCase("Yes"))
				 {
					connect.createStatement().executeUpdate("insert into Logg values ('"+no9+"','"+stat1+"','"+no+"','"+dt+"')");
				 }
				 else if(no9.equalsIgnoreCase("Node9->"))
				 {
					 connect.createStatement().executeUpdate("insert into Logg values ('"+no9+"','"+stat+"','"+yes+"','"+dt+"')");
				 }
				 else
				 {
					 System.out.println("");
				 }
				 
				 ResultSet r2=connect.createStatement().executeQuery("select * from nodesinfo where node='"+e10+"'");
					if(r2.next()==true)
					{
						macc=r2.getString(6);
						bandw=r2.getString(7);
						
					}
					 
					 if(no10.equalsIgnoreCase(""))
					 {
						System.out.println(""); 
					 }
					 else if(macc.equalsIgnoreCase("Yes") || bandw.equalsIgnoreCase("Yes"))
					 {
						connect.createStatement().executeUpdate("insert into Logg values ('"+no10+"','"+stat1+"','"+no+"','"+dt+"')");
					 }
					 else if(no10.equalsIgnoreCase("Node10->"))
					 {
						 connect.createStatement().executeUpdate("insert into Logg values ('"+no10+"','"+stat+"','"+yes+"','"+dt+"')");
					 }
					 else
					 {
						 System.out.println("");
					 }
					 
					 ResultSet r3=connect.createStatement().executeQuery("select * from nodesinfo where node='"+e11+"'");
						if(r3.next()==true)
						{
							macc=r3.getString(6);
							bandw=r3.getString(7);
							
						}
						 
						 if(no11.equalsIgnoreCase(""))
						 {
							System.out.println(""); 
						 }
						 else if(macc.equalsIgnoreCase("Yes") || bandw.equalsIgnoreCase("Yes"))
						 {
							connect.createStatement().executeUpdate("insert into Logg values ('"+no11+"','"+stat1+"','"+no+"','"+dt+"')");
						 }
						 else if(no11.equalsIgnoreCase("Node11->"))
						 {
							 connect.createStatement().executeUpdate("insert into Logg values ('"+no11+"','"+stat+"','"+yes+"','"+dt+"')");
						 }
						 else
						 {
							 System.out.println("");
						 }
						 
						 ResultSet r4=connect.createStatement().executeQuery("select * from nodesinfo where node='"+e12+"'");
							if(r4.next()==true)
							{
								macc=r4.getString(6);
								bandw=r4.getString(7);
								
							}
							 
							 if(no12.equalsIgnoreCase(""))
							 {
								System.out.println(""); 
							 }
							 else if(macc.equalsIgnoreCase("Yes") || bandw.equalsIgnoreCase("Yes"))
							 {
								connect.createStatement().executeUpdate("insert into Logg values ('"+no12+"','"+stat1+"','"+no+"','"+dt+"')");
							 }
							 else if(no12.equalsIgnoreCase("Node12->"))
							 {
								 connect.createStatement().executeUpdate("insert into Logg values ('"+no12+"','"+stat+"','"+yes+"','"+dt+"')");
							 }
							 else
							 {
								 System.out.println("");
							 }
							 
							 ResultSet r5=connect.createStatement().executeQuery("select * from nodesinfo where node='"+e13+"'");
								if(r5.next()==true)
								{
									macc=r5.getString(6);
									bandw=r5.getString(7);
									
								}
								 
								 if(no13.equalsIgnoreCase(""))
								 {
									System.out.println(""); 
								 }
								 else if(macc.equalsIgnoreCase("Yes") || bandw.equalsIgnoreCase("Yes"))
								 {
									connect.createStatement().executeUpdate("insert into Logg values ('"+no13+"','"+stat1+"','"+no+"','"+dt+"')");
								 }
								 else if(no13.equalsIgnoreCase("Node13->"))
								 {
									 connect.createStatement().executeUpdate("insert into Logg values ('"+no13+"','"+stat+"','"+yes+"','"+dt+"')");
								 }
								 else
								 {
									 System.out.println("");
								 }
								 
								 if(no14.equalsIgnoreCase(""))
								 {
									System.out.println(""); 
								 }
								 else
								 {
									connect.createStatement().executeUpdate("insert into Logg values ('"+no14+"','"+stat+"','"+yes+"','"+dt+"')");
								 }		 
								 if(no15.equalsIgnoreCase(""))
								 {
									System.out.println(""); 
								 }
								 else
								 {
									connect.createStatement().executeUpdate("insert into Logg values ('"+no15+"','"+stat+"','"+yes+"','"+dt+"')");
								 }
								 if(no16.equalsIgnoreCase(""))
								 {
									System.out.println(""); 
								 }
								 else
								 {
									connect.createStatement().executeUpdate("insert into Logg values ('"+no16+"','"+stat+"','"+yes+"','"+dt+"')");
								 }
								 if(no17.equalsIgnoreCase(""))
								 {
									System.out.println(""); 
								 }
								 else
								 {
									connect.createStatement().executeUpdate("insert into Logg values ('"+no17+"','"+stat+"','"+yes+"','"+dt+"')");
								 }
								 if(no18.equalsIgnoreCase(""))
								 {
									System.out.println(""); 
								 }
								 else
								 {
									connect.createStatement().executeUpdate("insert into Logg values ('"+no18+"','"+stat+"','"+yes+"','"+dt+"')");
								 }
								 if(no19.equalsIgnoreCase(""))
								 {
									System.out.println(""); 
								 }
								 else
								 {
									connect.createStatement().executeUpdate("insert into Logg values ('"+no19+"','"+stat+"','"+yes+"','"+dt+"')");
								 }
								 if(no20.equalsIgnoreCase(""))
								 {
									System.out.println(""); 
								 }
								 else
								 {
									connect.createStatement().executeUpdate("insert into Logg values ('"+no20+"','"+stat+"','"+yes+"','"+dt+"')");
								 }
		}
		}
			
				
	
//Run Method

		     private void getband() throws SQLException {
			

					
					ResultSet r2=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node2+"'");
					if(r2.next()==true){ ene2=r2.getString(4);}
					ResultSet r3=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node3+"'");
					if(r3.next()==true){ ene3=r3.getString(4);}
					ResultSet r4=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node4+"'");
					if(r4.next()==true){ ene4=r4.getString(4);}
					ResultSet  r5=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node5+"'");
					if(r5.next()==true){ ene5=r5.getString(4);}
					ResultSet  r6=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node6+"'");
					if(r6.next()==true){ ene6=r6.getString(4);}
					ResultSet r7=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node7+"'");
					if(r7.next()==true){ ene7=r7.getString(4);}
					ResultSet r8=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node8+"'");
					if(r8.next()==true){ ene8=r8.getString(4);}
					ResultSet  r9=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node9+"'");
					if(r9.next()==true){ ene9=r9.getString(4);}
					ResultSet r10=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node10+"'");
					if(r10.next()==true){ ene10=r10.getString(4);}
					ResultSet  r11=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node11+"'");
					if(r11.next()==true){ ene11=r11.getString(4);}
					ResultSet  r12=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node12+"'");
					if(r12.next()==true){ ene12=r12.getString(4);}
					ResultSet  r13=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node13+"'");
					if(r13.next()==true){ ene13=r13.getString(4);}
					ResultSet  r14=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node14+"'");
					if(r14.next()==true){ ene14=r14.getString(4);}
					ResultSet  r15=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node15+"'");
					if(r15.next()==true){ ene15=r15.getString(4);}
					ResultSet  r16=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node16+"'");
					if(r16.next()==true){ ene16=r16.getString(4);}
					ResultSet  r17=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node17+"'");
					if(r17.next()==true){ ene17=r17.getString(4);}
					ResultSet  r18=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node18+"'");
					if(r18.next()==true){ ene18=r18.getString(4);}
					ResultSet  r19=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node19+"'");
					if(r19.next()==true){ ene19=r19.getString(4);}
					ResultSet r20=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node20+"'");
					if(r20.next()==true){ ene20=r20.getString(4);}
					ResultSet r21=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node21+"'");
					if(r21.next()==true){ ene21=r21.getString(4);}
					ResultSet r22=connect.createStatement().executeQuery("select * from NodesInfo where node='"+node22+"'");
					if(r22.next()==true){ ene22=r22.getString(4);}
					
		}

			

			void refresh() throws InterruptedException {

		    	Thread.sleep(4000);
		    	a1=new ImageIcon(this.getClass().getResource("sd.jpg"));
				a11.setIcon(a1);
				
				a2=new ImageIcon(this.getClass().getResource("b.jpg"));
				a22.setIcon(a2);
				
				a3=new ImageIcon(this.getClass().getResource("b.jpg"));
				a33.setIcon(a3);
				
				a4=new ImageIcon(this.getClass().getResource("b.jpg"));
				a44.setIcon(a4);
			
				a5=new ImageIcon(this.getClass().getResource("b.jpg"));
				a55.setIcon(a5);
				
				a6=new ImageIcon(this.getClass().getResource("b.jpg"));
				a66.setIcon(a6);

				a7=new ImageIcon(this.getClass().getResource("b.jpg"));
				a77.setIcon(a7);
				
				a8=new ImageIcon(this.getClass().getResource("b.jpg"));
				a88.setIcon(a8);

				a9=new ImageIcon(this.getClass().getResource("b.jpg"));
				a99.setIcon(a9);
				
				b2=new ImageIcon(this.getClass().getResource("b.jpg"));
				b22.setIcon(b2);

				b3=new ImageIcon(this.getClass().getResource("b.jpg"));
				b33.setIcon(b3);

				b4=new ImageIcon(this.getClass().getResource("b.jpg"));
				b44.setIcon(b4);

				b5=new ImageIcon(this.getClass().getResource("b.jpg"));
				b55.setIcon(b5);

				b6=new ImageIcon(this.getClass().getResource("b.jpg"));
				b66.setIcon(b6);
				
				b7=new ImageIcon(this.getClass().getResource("b.jpg"));
				b77.setIcon(b7);
				
				b8=new ImageIcon(this.getClass().getResource("b.jpg"));
				b88.setIcon(b8);

				c2=new ImageIcon(this.getClass().getResource("b.jpg"));
				c22.setIcon(c2);

				c3=new ImageIcon(this.getClass().getResource("b.jpg"));
				c33.setIcon(c3);

				c4=new ImageIcon(this.getClass().getResource("b.jpg"));
				c44.setIcon(c4);

				c5=new ImageIcon(this.getClass().getResource("sd.jpg"));
				c55.setIcon(c5);
		    	
			
		}

}
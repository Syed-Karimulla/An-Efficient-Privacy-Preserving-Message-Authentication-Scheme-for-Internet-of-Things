
 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import java.sql.*;
 
public class Trust_Chain_Results {
    public static void main(String[] args) {
        
    

  int count=0;
  int count1=0;
  int count2=0;
  int count3=0;
  int count4=0;
  int count5=0;
  
 
  double c1=0.0;
  double c2=0.0;
  double c3=0.0;
  double c4=0.0;
  double c5=0.0;
  double c6=0.0;
  double c7=0.0;
  double c8=0.0;
  
  String nd=null;
  
    	try
    	{
    		Class.forName("com.mysql.jdbc.Driver");
    		
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proj18","root","root");	
    		Statement st=con.createStatement();
    		ResultSet rs=st.executeQuery("select * from logg");
    		
    		while(rs.next()==true)
    		{


    			nd=rs.getString("status");
    			
    			if(nd.equals("TRUST"))
    			{
    				count++;
    			}
    			if(nd.equals("UNTRUST"))
    			{
    				count1++;
    			}
    			
    			
    		}
    		    DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
    	        dataSet.setValue(count, "R1", "Recommend");
    	        dataSet.setValue(count1, "NR1", "NotRecommend");
    	        
    	        dataSet.setValue(count2, " ", "");
    	        dataSet.setValue(count3, " ", ""); 
    	        dataSet.setValue(count4, " ", " ");
    	        dataSet.setValue(count5, " ", " ");
    	        
    	       
    	        JFreeChart chart = ChartFactory.createBarChart3D(
    	                "An Efficient Privacy Preserving Message Authentication Scheme for Internet of Things", "No.... of Recommended and Non Recommended Nodes", "Total Nodes",
    	                dataSet, PlotOrientation.VERTICAL, true, true, true);
    	        ChartFrame chartFrame=new ChartFrame("Different Recommended and Non Recommended Nodes Details",chart);
    	        chartFrame.setVisible(true);
    	        chartFrame.setSize(800,500);
    	}
    	catch(Exception ex)
    	{
    	System.out.println(ex);	
    		
    	}
    
}
}
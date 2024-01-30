
 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import java.sql.*;
 
public class End_To_End_TimeDelay_Results {
    public static void main(String[] args) {
        
    

  int count=0;
  int count1=0;
 
  double c1=0.0;
  double c2=0.0;
  double c3=0.0;
  double c4=0.0;
  double c5=0.0;
  double c6=0.0;
  double c7=0.0;
  double c8=0.0;
  
  
  
    	try
    	{
    		Class.forName("com.mysql.jdbc.Driver");
    		
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proj18","root","root");	
    		Statement st=con.createStatement();
    		ResultSet rs=st.executeQuery("select * from timedelay");
    		
    		while(rs.next()==true)
    		{
    			count++;
    			if(count==1)
    			{
    				c1=Double.valueOf(rs.getString("delay"));
    			}
    			
    			if(count==2)
    			{
    			c2=Double.valueOf(rs.getString("delay"));
    			}
    			if(count==3)
    			{
    				c3=Double.valueOf(rs.getString("delay"));
    			}
    			if(count==4)
    			{
    				c4=Double.valueOf(rs.getString("delay"));
    			}
    			if(count==5)
    			{
    				c5=Double.valueOf(rs.getString("delay"));
    			}
    			if(count==6)
    			{
    				c6=Double.valueOf(rs.getString("delay"));
    			}
    			if(count==7)
    			{
    				c7=Double.valueOf(rs.getString("delay"));
    			}
    			if(count==8)
    			{
    				c8=Double.valueOf(rs.getString("delay"));
    			}	
    		}
    		    DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
    	        dataSet.setValue(c1, "D1", "DDelay1");
    	        dataSet.setValue(c2, "D2", "DDelay2");
    	        dataSet.setValue(c3, "D3", "DDelay3");
    	        dataSet.setValue(c4, "D4", "DDelay4");
    	        dataSet.setValue(c5, "D5", "DDelay5");
    	        dataSet.setValue(c6, "D6", "DDelay6");
    	        dataSet.setValue(c7, "D7", "DDelay7");
    	        dataSet.setValue(c8, "D8", "DDelay8");
    	 
    	        JFreeChart chart = ChartFactory.createBarChart3D(
    	                "An Efficient Privacy Preserving Message Authentication Scheme for Internet of Things", "Delay Time(MS) ", "Total Delay (MS)",
    	                dataSet, PlotOrientation.VERTICAL, true, true, true);
    	        ChartFrame chartFrame=new ChartFrame("Different Transaction Upload Delay Details",chart);
    	        chartFrame.setVisible(true);
    	     
    	        chartFrame.setSize(800,500);
    	        
        
    	}
    	catch(Exception ex)
    	{
    	System.out.println(ex);	
    		
    	}
    
}
}
package chat;
import java.awt.*;
import java.sql.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
public class image 
{
      String user_name;
      String path="C:\\Users\\sumit\\Desktop\\sumit\\image\\";
      String image_id;
      Image ii;
      ImageIcon image;
      public image(String user_name)
      {
          this.user_name=user_name;
             try
	       { 
                   Class.forName("com.mysql.jdbc.Driver");
                   System.out.println("Connecting to database...");
                   String url = "jdbc:mysql://127.0.0.1:3306/bkbiet";
                   Connection con=DriverManager.getConnection(url,"root","");	
    	           PreparedStatement ps = con.prepareStatement("select image_id  from students where student_id=(?)");
	       	   ps.setString(1, user_name);
	           ResultSet  rs = ps.executeQuery();
        	   image_id =null;
          while(rs.next())
		{
		   image_id=rs.getString(1);
                }}
          catch(Exception ex1)
                {
                  System.out.println("failed to connect to database");
                }
           try
              {
                  path = path+image_id;
                  image = new ImageIcon(path);
              }
           catch(Exception e)
             {
             }
    } 
    public  ImageIcon reply()
    {
        return image;
    }
}

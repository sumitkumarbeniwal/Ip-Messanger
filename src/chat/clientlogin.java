package chat;
import static chat.client.user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class clientlogin 
{
    String s = null;
    String user_name,password;
public clientlogin(String user,String pass )
{
       this.user_name=user;
       this.password=pass;
       try
	   { 
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            String url = "jdbc:mysql://127.0.0.1:3306/bkbiet";
            Connection con=DriverManager.getConnection(url,"root","");
	        PreparedStatement ps = con.prepareStatement("select password from students where student_id=(?)");
                ps.setString(1, user_name);
		ResultSet  rs = ps.executeQuery();
            while(rs.next())
		    {
			     s=rs.getString(1);
		    }		 
          }
          catch(Exception ex1)
          {
                  System.out.println("failed to connect to database");
          }
} 
public String reply()
{
  return s;
}
}

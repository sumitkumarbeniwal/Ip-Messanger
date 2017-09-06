package chat;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class serverlogin1 
{
String user_name;
String password;
String s = null;
public serverlogin1(String user,String pass)
{
     this.user_name=user;
     this.password=pass;
        try
	     { 
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Connecting to database...");
                String url = "jdbc:mysql://127.0.0.1:3306/bkbiet";
                Connection con=DriverManager.getConnection(url,"root","");	
	        System.out.println("database connected");
                PreparedStatement ps = con.prepareStatement("select password1  from mainlogin where username=(?)");
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


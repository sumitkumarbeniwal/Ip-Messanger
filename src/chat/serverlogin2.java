
package chat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author sumit
 */
public class serverlogin2 
{
String password;
String user_name;
String s = null;
public serverlogin2(String user,String pass)
{     this.user_name=user;
      this.password=pass;
        try
	     { 
               Class.forName("com.mysql.jdbc.Driver");
               System.out.println("Connecting to database...");
               String url = "jdbc:mysql://127.0.0.1:3306/bkbiet";
               Connection con=DriverManager.getConnection(url,"root","");
	       System.out.println("database connected");
               PreparedStatement ps = con.prepareStatement("select password2  from mainlogin where username=(?)");
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
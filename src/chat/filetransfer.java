/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 *
 * @author sumit
 */
public class filetransfer
{
    File source;
    File dest;
public filetransfer(String in,String out) throws IOException
    {    
         source = new File(in);
         dest = new File(out);
         InputStream is = null;
         OutputStream os = null;
            try {
                   is = new FileInputStream(source);
                   os = new FileOutputStream(dest);
                   byte[] buffer = new byte[1024];
                   int length;
                   while ((length = is.read(buffer)) > 0)
                   {
                      os.write(buffer, 0, length);
                   }
                } finally 
            {
                  is.close();
                  os.close();
            }
    }
}

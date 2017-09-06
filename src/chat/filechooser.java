/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author sumit
 */
public class filechooser 
{
    String file_name;
    String s;
    public filechooser()
    {      
    }
     public String takefile()
        {
           JFrame j = new JFrame();
            final JFileChooser  fileDialog = new JFileChooser();
            int returnVal = fileDialog.showOpenDialog(j);
            if (returnVal == JFileChooser.APPROVE_OPTION)
            {
               java.io.File file = fileDialog.getSelectedFile();
               s = fileDialog.getSelectedFile().getAbsolutePath();
               //file_name= file.getName();
               //System.out.println(s);
            }
            else{
                file_name=null;    
            }
            return s;
        }
   /*  public static void main(String args[])
     {
        filechooser f = new filechooser();
        f.takefile();
     }*/
}

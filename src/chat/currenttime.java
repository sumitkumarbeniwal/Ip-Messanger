/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author sumit
 */
public class currenttime 
{
    String time;
    public currenttime()
    {
    }
    String updatetime()
    {
         SimpleDateFormat sdfDate = new SimpleDateFormat("HH:mm:ss");//dd/MM/yyyy
         Date now = new Date();
         time = sdfDate.format(now);
         return time;
    }
}

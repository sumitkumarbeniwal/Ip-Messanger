/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author sumit
 */
public class date 
{
    String dt;
    String day,month,year;
    public date()
    {    //Date format
         SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");//dd/MM/yyyy
         Date now = new Date();
         dt = sdfDate.format(now);   
    }
    String todaydate()
    {
        return dt;
    }
}
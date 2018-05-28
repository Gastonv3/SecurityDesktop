/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Skylake
 */
public class fecha {

    public static String fdate(String d) throws ParseException {
   
             String fechastring2 = d;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       
                Date a = sdf.parse(fechastring2);
                SimpleDateFormat fmtOut = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String b = fmtOut.format(a);
    

      //  String date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(d);
        return b;
    }
      public static String fdate2(String d) throws ParseException {
   
             String fechastring2 = d;
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
       
                Date a = sdf.parse(fechastring2);
                SimpleDateFormat fmtOut = new SimpleDateFormat("yyyy-MM-dd");
                String b = fmtOut.format(a);
    

      //  String date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(d);
        return b;
    }
}

